package org.sda.algorithms.exercises;

public class CesarCrypt {

    private static final char CAPITAL_A = 'A';

    private static final char CAPITAL_Z = 'Z';

    private static final char SMALL_A = 'a';

    private static final char SMALL_Z = 'z';

    /**
     * Podpowiedź:
     * <p>
     * byte cByte = (byte) c;
     */
    public String encodeCesar(String text, int step) {
        StringBuilder returnText = new StringBuilder();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            if (isLetter(c)) {
                byte cByte = (byte) c;
                if (exceedRange((byte) (cByte + step))) {
                    if(isCapital(cByte)){
                        cByte = (byte)(CAPITAL_A + (cByte+step)-CAPITAL_Z-1);
                        returnText.append((char) cByte);
                    }else{
                        cByte = (byte)(SMALL_A + (cByte+step)-SMALL_Z-1);
                        returnText.append((char) cByte);
                    }
                } else {
                    cByte += step;
                    returnText.append((char) cByte);
                }
            } else {
                returnText.append(c);
            }
        }
        return returnText.toString();
    }

    public String decodeCesar(String text, int step) {
        StringBuilder returnText = new StringBuilder();
        char[] charArray = text.toCharArray();
        for (char c : charArray){
            byte cByte = (byte)c;
            if(isLetter(c)){
                if (exceedRange((byte)(c-step))){
                    if (isCapital(cByte)){
                        cByte = (byte)(CAPITAL_Z - (cByte-step)+CAPITAL_A-1);
                        returnText.append((char) cByte);
                    }else{
                        cByte = (byte)(SMALL_Z - (cByte-step)+SMALL_A-1);
                        returnText.append((char) cByte);
                    }
                }else{
                    c=(char)((byte)c-step);
                    returnText.append(c);
                }
            }else{
                returnText.append(c);
            }
        }

        return returnText.toString();
    }

    private boolean isLetter(char c) {
        return ((c >= SMALL_A && c <= SMALL_Z) || (c >= CAPITAL_A && c <= CAPITAL_Z));
    }

    private boolean exceedRange(byte cByte) {
        if (isCapital(cByte)){
            return !(cByte >= (byte) CAPITAL_A && cByte <= CAPITAL_Z);
        }
        return !(cByte >= (byte) SMALL_A && cByte <= (byte) SMALL_Z);
    }

    private boolean isCapital(byte cByte){
        return (cByte >= (byte) CAPITAL_A && cByte <= CAPITAL_Z);
    }
}
