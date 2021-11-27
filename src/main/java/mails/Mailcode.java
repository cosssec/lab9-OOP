package mails;

import java.io.File;
import java.util.Scanner;


public enum Mailcode {
    HAPPY_BIRTHDAY("mails/birthday.txt"), SALE("mails/sale.txt");

    private final String namefile;


    Mailcode(String namefile) {
        this.namefile = namefile;
    }

    public String generateText() {
        Scanner s = new Scanner(namefile);
        File newfile = new File(s.nextLine());
        String line = "";
        try {
        s = new Scanner(newfile);
        }
        catch (Exception FileNotFoundException) {
            return "";
        }

        while (s.hasNextLine()) {
            line += s.nextLine();
            System.out.println(line);
            System.out.println("\n");
        }
        s.close();
        return line;
    }
}