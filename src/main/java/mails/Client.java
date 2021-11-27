package mails;

import lombok.Data;
@Data
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;

    public Client(){
        id = generateId();
    }

    public int generateId(){
        this.id = this.id + 1;
        return this.id;
    }

}