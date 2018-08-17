package Ttt;

import java.io.*;

public class PracTwo {
    public static void main(String args[]) throws IOException {
        DataOutputStream dataOut = null;
        DataInputStream dataIn = null;
        try{
            dataOut = new DataOutputStream(new FileOutputStream("src/file.txt"));
        dataOut.writeUTF("hello world !!");

            dataIn = new DataInputStream(new FileInputStream("src/file.txt"));
        while (dataIn.available() > 0) {
            String k = dataIn.readUTF();
        }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            dataOut.close();
            dataIn.close();
        }
    }
}