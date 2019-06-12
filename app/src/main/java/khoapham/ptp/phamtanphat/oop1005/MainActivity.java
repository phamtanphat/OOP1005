package khoapham.ptp.phamtanphat.oop1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
//
//        tinhhinh(10,5);
//    bt Tinh ke thua
//        + Giám đốc :
//            - private tên: Khoa " Khoa pham";
//            - private tuổi : 30;
//            - Constructor
//                + Android: + "phat"
//                    -Tên : phat;
//                    -tuoi : 25;
//                    -Que quan : "Củ chi"
//                + Php: + "huong"
//                    -Tên : hương;
//                    -tuoi : 25;
//                    -Trang thai : "Độc thân"
//                + ios: + "Quan"
//                    -Tên : Quân;
//                    -tuoi : 27;
//                    -Số nhà : 92 nguyên lâm
//            - Khi truy cập vào người nào thì gắn tên người đó sau mỗi dữ liệu
    //Phuong thuc nap chong dien tich , chu vi:
            // + Tinh hình thang
            // + tinh hình tron
            //+ Tam giac
            //+ Hinh tam giac vuong

            // //+ Tinh độ dài 2 điểm(Tạo 1 object điểm truyên 2 object vào để xử lý điểm)

    }
    //Phuong thuc nap chong : overload
//    private void tinhhinh(int dai , int rong){
//        Log.d("BBB",dai * rong + "");
//    }
//    private void tinhhinh(int bankinh ){
//        Log.d("BBB",Math.PI * Math.pow(bankinh,2) + "");
//    }
}
