package ua.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName, true);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        String str = "JavaRush © All rights reserved.";
        byte[] array = str.getBytes();
        write(array);
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }
}