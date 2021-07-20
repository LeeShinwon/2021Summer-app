package com.example.mycafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2, e3;
    private TextView t1, t2, t3;
    private CheckBox cb1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=findViewById(R.id.checkBox_ch1);
        e1=findViewById(R.id.editText_text1);
        e2=findViewById(R.id.editText_text2);
        e3=findViewById(R.id.editText_text3);
        t1=findViewById(R.id.textView_text1);
        t2=findViewById(R.id.textView_text2);
        t3=findViewById(R.id.textView_text3);
    }


    public void countAll(View view) {
        int val1=Integer.parseInt(e1.getText().toString());
        int val2=Integer.parseInt(e2.getText().toString());
        int val3=Integer.parseInt(e3.getText().toString());
        int num= val1+val2+val3;
        int saleVal=0;
        int payVal=(val1*1000)+(val2*1500)+(val3*1700);
        t1.setText("주문개수 : "+num+" 개");
        if(cb1.isChecked()){
            saleVal=(int)(payVal*0.1);
            payVal-=saleVal;
        }
        t2.setText("할인금액 : "+saleVal+" 원");
        t3.setText("결제금액 : "+payVal+" 원");
    }



}