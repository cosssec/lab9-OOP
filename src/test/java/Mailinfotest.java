import mails.Client;
import mails.Gender;
import mails.Mailcode;
import mails.Mailinfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Mailinfotest {

    Client client;
    Mailinfo info;

    @BeforeEach
    void setUp() {
        client = new Client();
        client.setAge(17);
        client.setName("Max");
        client.setSex(Gender.MALE);
        info = new Mailinfo(client, Mailcode.SALE);
    }

    @Test
    void getMailText() {
        assertEquals("Huge discounts for you, Max!", info.getText());
    }
}