package khoapham.ptp.phamtanphat.oop1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import khoapham.ptp.phamtanphat.oop1005.Person;
import khoapham.ptp.phamtanphat.oop1005.R;

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
        // khi kế thừa chỉ được thêm không được xóa
        //50 %
//                + Khi kế thừa bạn được gì( Thuộc tính và hành vi ngta cho)
//                + Bị ràng buộc về gì (Phải tuân theo constructor của ngta và không xóa gì chỉ được thêm)
        //80 % :
//                + Sử dụng final ngăn chặn việc thay đổi
//                + Sử dụng static cho thuộc tính đã có sẵn
//        Uncle uncle= new Uncle("Bác tèo" , "60","Tiếng việt" ,"ACB");

    }
}
