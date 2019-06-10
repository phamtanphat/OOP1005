package khoapham.ptp.phamtanphat.oop1005;

public class Child extends Person {
    String sothich;

    public Child(String ten, String tuoi, String ngonngu , String sothich) {
        super(ten,tuoi,ngonngu);
        this.sothich = sothich;
    }
}
