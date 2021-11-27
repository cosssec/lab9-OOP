package image;

public class Proxyimage implements Image{
    String fileName;
    Realimage realImage = null;


    public Proxyimage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new Realimage(fileName);
        }
        realImage.display();
    }
}