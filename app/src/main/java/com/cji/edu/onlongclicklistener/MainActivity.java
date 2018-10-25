package com.cji.edu.onlongclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{

    TextView textview1;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1 = (TextView)findViewById(R.id.textview1);

        // 변수 권한 주고, 리스너에 등록
        button1 = (Button)findViewById(R.id.longbtn1);
        button1.setOnLongClickListener(this);

        button2 = (Button)findViewById(R.id.longbtn2);
        button2.setOnLongClickListener(this);
    }


    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        String text = ((Button)v).getText().toString();

        switch (id){
            case R.id.longbtn1:
                textview1.setText(text);
                textview1.setBackgroundColor(0xff00ff00);
                break;

            case R.id.longbtn2:
                textview1.setText(text);
                textview1.setBackgroundColor(0xff00ffff);
                break;

                default:
                    textview1.setText("Try again!");
        }

        return false;
    }
}
