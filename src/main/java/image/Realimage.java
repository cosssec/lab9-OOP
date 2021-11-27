package image;

public class Realimage implements Image{
    String fileName;
    public Realimage(String filename){
        this.fileName = filename;
        loadFromDisk(this.fileName);
    }
    void loadFromDisk(String fileName){
        System.out.println("File" + fileName + " was loaded");

    }
    public void display(String fileName){
        System.out.println("Image " + fileName + " was displayed");
    }
}