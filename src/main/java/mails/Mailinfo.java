package mails;

import java.util.HashMap;
import lombok.*;

@Data
public class Mailinfo {
    private Client client;
    private Mailcode mailcode;

    public Mailinfo(Client client, Mailcode happyBirthday) {
    }

    public String getText(){
        HashMap<String, String> templates = new HashMap<>();
        String text = mailcode.generateText();
        templates.put("%NAME%", client.getName());

        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }

        return text;
    }

}