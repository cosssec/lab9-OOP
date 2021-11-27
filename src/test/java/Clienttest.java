import mails.Client;
import mails.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Clienttest {
    Client client;
    @BeforeEach
    void setUp() {
        client = new Client();
        client.setAge(19);
        client.setName("Susie");
        client.setSex(Gender.FEMALE);
    }

    @Test
    void getName() {
        assertEquals(client.getName(),"Susie");
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(),19);
    }


    @Test
    void getSex() {
        assertEquals(client.getSex(),Gender.FEMALE);
    }

}