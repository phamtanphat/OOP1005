package khoapham.ptp.phamtanphat.oop1005;

import android.util.Log;

public class Person {
    //Thuoc tinh
    private String ten;
    private String tuoi;
    private String ngonngu;

    //alt + insert
    //Phuong thuc khoi tao
    public Person(String ten, String tuoi, String ngonngu) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngonngu = ngonngu;
    }
    //Phuong thuc gan lai gia tri cho thuoc tinh
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }
}
