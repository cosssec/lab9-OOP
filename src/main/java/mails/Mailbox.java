package mails;

import java.util.ArrayList;

public class Mailbox {
    ArrayList<Mailinfo> infos;
    public void addMailInfo (Mailinfo info){
        infos.add(info);
    }
    public void sendAll(){
        for(Mailinfo info : infos){
            Mailsender.sendMail(info);
        }
    }
}