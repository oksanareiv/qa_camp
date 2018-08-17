package Ttt;

import java.io.*;

public class PracOne implements java.io.Serializable {
    public String name;
    public int age;

    public PracOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            PracOne praco = new PracOne("Denis", 25);
            FileOutputStream fileOut = new FileOutputStream("praco.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(praco);

            praco = null;
            FileInputStream fileToRead = new FileInputStream("praco.ser");
            ObjectInputStream in = new ObjectInputStream(fileToRead);
            praco = (PracOne) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}