package org.sda.algorithms.chat;

import org.sda.algorithms.exercises.CesarCrypt;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient implements Runnable {

    // why is the ChatClient Multi-threaded?

    private Scanner scanner;
    private int port = 7777;
    private String nick;
    private CesarCrypt cesarCrypt;
    private int encryptionStep;

    public ChatClient() throws IOException {
        initialize();
    }

    private void initialize() throws IOException {

        this.cesarCrypt = new CesarCrypt();

        // get server address
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the chat server's ip address?");
        String str = keyboard.next();

        // get user nick
        System.out.println("What is your nick?");
        nick = keyboard.next();

        // set encryption step
        System.out.println("What is encryption step?");
        encryptionStep = keyboard.nextInt();

        // connect to server
        InetAddress host = null;
        try {
            host = InetAddress.getByName(str);
        } catch (UnknownHostException e1) {
            System.out.println("Host not found");
        }
        System.out
                .println("You are now connected to: " + host.getHostAddress());

        Socket socket = null;
        try {
            socket = new Socket(host, port);
            socket.setReuseAddress(true);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("not found");
        }
        scanner = new Scanner(socket.getInputStream());
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

        // start new thread to listen from server
        // one runnable, two threads... in which cases is this legal?
        Thread t = new Thread(this);
        t.start();

        // continuously listen your user input
        while (keyboard.hasNextLine()) {
            String msg = keyboard.nextLine();
            printWriter.println(cesarCrypt.encodeCesar(nick + " says: " + msg, encryptionStep));
            printWriter.flush();
        }
    }

    public static void main(String[] args) throws Exception {
        new ChatClient();
    }

    @Override
    public void run() {
        while (true) {
            if (scanner.hasNextLine())
                System.out.println(cesarCrypt.decodeCesar(scanner.nextLine(), encryptionStep));
        }
    }
}