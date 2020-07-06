package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    private Button tijiao;
    private CheckBox checkbox_1;
    private CheckBox checkbox_2;
    private CheckBox checkbox_3;
    private CompoundButton.OnCheckedChangeListener checkbox_listen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        final TextView tv = findViewById(R.id.title);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("It is not quite easy!");
            }
        });
        Log.i("MainActivity", "onClick:It is not quite easy!");

//        tijiao.setOnClickListener(new View.OnClickListener() {
//
//            @SuppressLint("WrongConstant")
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                String str="";
//                if(checkbox_1.isChecked())
//                    str+=checkbox_1.getText().toString()+" ";
//                if(checkbox_2.isChecked())
//                    str+=checkbox_2.getText().toString()+" ";
//                if(checkbox_3.isChecked())
//                    str+=checkbox_3.getText().toString()+" ";
//                Toast.makeText(getApplicationContext(), "您选择的喜欢的爱好为:"+str, 1).show();
//
//            }
//        });
//    }
//
//    @Override
//    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//    }
    }

}



