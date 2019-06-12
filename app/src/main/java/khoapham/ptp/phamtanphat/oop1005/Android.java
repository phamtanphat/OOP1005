package khoapham.ptp.phamtanphat.oop1005;

import android.util.Log;

public class Android extends Person {
    private String quequan;
    public Android(String ten, String tuoi , String quequan) {
        super(ten, tuoi);
        this.quequan = quequan;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

}
