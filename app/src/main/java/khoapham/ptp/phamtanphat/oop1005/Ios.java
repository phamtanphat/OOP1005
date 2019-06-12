package khoapham.ptp.phamtanphat.oop1005;

public class Ios extends  Person{
    private String sonha;
    public Ios(String ten, String tuoi , String sonha) {
        super(ten, tuoi);
        this.sonha = sonha;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }
}
