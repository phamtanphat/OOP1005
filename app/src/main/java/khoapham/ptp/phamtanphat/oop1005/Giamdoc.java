package khoapham.ptp.phamtanphat.oop1005;

import android.util.Log;

public class Giamdoc extends Person {

    public Giamdoc(String ten, String tuoi) {
        super(ten, tuoi);
    }

    //overide
    public  void showInfo(String value){
       Log.d("BBB",value + super.getTen());
    }
}
