package org.sda.algorithms.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatServer {

    // Toy ChatServer to illustrate multi-threading

    private final int port = 7777;
    private ServerSocket serverSocket;
    private ArrayList<Socket> clientList;

    public ChatServer() throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setReuseAddress(true);

        clientList = new ArrayList<Socket>();
    }

    public void startServer() throws IOException {
        printNetworkAddress();
        System.out.println("Accepting clients...");
        while (true) {
            // wait for a client
            Socket client = serverSocket.accept();
            clientList.add(client);
            System.out.println("New client accepted..." + client.getRemoteSocketAddress());
            System.out.println("Total users: " + clientList.size());
            ChatClientHandler handler = new ChatClientHandler(client, this);
            Thread t = new Thread(handler);
            t.start();
        }
    }

    public void printNetworkAddress() throws UnknownHostException {

        System.out.println("Network configuration: ");
        System.out.println("Host address: " + InetAddress.getLocalHost().getHostAddress());
        System.out.println("Host name: " + InetAddress.getLocalHost().getHostName());
    }

    public synchronized void sendChatMessageToAll(String msg) throws IOException {
        for (Iterator<Socket> it = clientList.iterator(); it.hasNext(); ) {
            Socket client = it.next();
            if (!client.isClosed()) {
                PrintWriter pw = new PrintWriter(client.getOutputStream());
                pw.println(msg);
                pw.flush();
                //System.out.println("Sent to: " + client.getRemoteSocketAddress());
            }
        }
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        new ChatServer().startServer();
    }

}