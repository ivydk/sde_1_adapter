package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here;

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        String ans1 = reader.readLine();

        System.out.println(ans1);

        // the reader should accept the following values as true:
        String[] trueValues = {
                "true",
                "yes",
                "oh yeah",
                "great",
                "sure",
                "love to",
                "of course",
                "always",
                "never done otherwise"
        };

        Boolean check = Arrays.asList(trueValues).contains(ans1.toLowerCase());

        if (check) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
