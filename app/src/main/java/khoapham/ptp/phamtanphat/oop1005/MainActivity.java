package khoapham.ptp.phamtanphat.oop1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

//    final String[] ten = {"Hoa","Teo","Ti"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //access modifier : public , private , protected
        //non-access modifier : final , interface , static , ...
        //final khong duoc gan lai nhung co quyen thay doi thuoc tinh
//      finnal phạm vi truy cập giống private
//        ten[0] = "Phat";
//        Log.d("BBB",ten[0]);
        //static : tuong trung cho viec khong can khoi tao van goi duoc nó
        //static phạm vi sử dụng giống public
//        Log.d("BBB",Person.noisong);

        //viết code người hiểu viết gì
        // mvvm , architecture , mvp , mvc
        //1 : Tính thừa kế
        // thừa kế : Người cha sẽ cho con thuộc tính và hành vi
    }
}
