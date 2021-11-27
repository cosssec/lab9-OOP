package mails;

import lombok.*;
@Data
public class Mailsender {
    public static void sendMail(Mailinfo mailInfo) {
        System.out.println(mailInfo.getText());
    }
}