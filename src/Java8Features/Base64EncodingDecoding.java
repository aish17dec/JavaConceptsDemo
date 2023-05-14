package Java8Features;

import java.util.Base64;

public class Base64EncodingDecoding {

    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();

        String pasword = "Abcd@123";
        String encoded_password = encoder.encodeToString(pasword.getBytes());

        System.out.println("Encoded String: "+encoded_password);
        String decoded_password = new String(decoder.decode(encoded_password));

        System.out.println("Decoded password: "+decoded_password);

    }

}
