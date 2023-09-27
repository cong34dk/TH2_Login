package com.example.th2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Viết sự kiện cho button Login
    public void onclickLogin(View view) {
        //Khai báo các điều khiển
        EditText edtk, edmk, edtb;
        //Ánh xạ
        edtk = (EditText) findViewById(R.id.edttaikhoan);
        edmk = (EditText) findViewById(R.id.edtmatkhau);
        edtb = (EditText) findViewById(R.id.edtthongbao);

        //Lấy giá trị người dùng nhập vào, đưa ra thông báo
        if(edtk.getText().toString().equals("FIT")&&edmk.getText().toString().equals("123"))
            edtb.setText("Đăng nhập thành công😎");
        else
            edtb.setText("Đăng nhập thất bại😆");
    }
}