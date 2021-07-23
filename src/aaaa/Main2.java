package aaaa;

import aaaa.Text;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String s="rO0ABXNyAAlhYWFhLlRleHQqPllC7TSc6AIAAUwAAWF0ABJMamF2YS9sYW5nL1N0cmluZzt4cHQAFzEyMzQ1NkFCQ0QxNjIwMjczNzk2NTAy";

        final ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(s)));
        final Text o = (Text)objectInputStream.readObject();
        System.out.println(o.a);
    }
}
