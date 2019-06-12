package khoapham.ptp.phamtanphat.oop1005;

public class Php extends Person {
    private String trangthai;
    public Php(String ten, String tuoi , String trangthai) {
        super(ten, tuoi);
        this.trangthai = trangthai;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
}
