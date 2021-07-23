package aaaa;

import aaaa.Text;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {
        final Text text = new Text();
        final long l = System.currentTimeMillis();
        text.a+=l;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10240);
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(text);
        final byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println(Base64.getEncoder().encodeToString(bytes));
        System.out.println(l);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
    }
}
