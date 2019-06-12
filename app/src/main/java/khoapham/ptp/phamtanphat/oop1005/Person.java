package khoapham.ptp.phamtanphat.oop1005;

import android.util.EventLog;
import android.util.Log;
import android.view.View;

public class Person {
    //Thuoc tinh
     private String ten;
     private String tuoi;


    //alt + insert
    //Phuong thuc khoi tao
    public Person(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
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
    public void showInfo(String value){
        Log.d("BBB",value );
    }

}
