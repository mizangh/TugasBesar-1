/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dee
 */
public class FileIO {

    /**
     * save object to a file
     * @param o object to be save
     * @param filename filename of the file
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void saveObject(Object o, String filename) throws FileNotFoundException, IOException {
        try (FileOutputStream fout = new FileOutputStream(filename)) {
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.flush();
        }
    }

    /**
     * read object from file
     * @param filename filename of the file
     * @return object read from the file
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object getObject(String fileName) throws IOException, ClassNotFoundException {
        Object o;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            o = ois.readObject();
        }
        return o;
    }
}
