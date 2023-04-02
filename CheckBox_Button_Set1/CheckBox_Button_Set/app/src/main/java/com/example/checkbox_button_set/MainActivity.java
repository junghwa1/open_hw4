package com.example.checkbox_button_set;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/* **********************************************
 * 프로젝트명 :  CheckBox_Button_Set
 * 작성자 : 2019038062 염중화
 * 작성일 : 2022.03.29
 *프로그램 설명 : 체크박스를 선택할 때마다, 버튼의 속성이 설정되는 프로그램
 ************************************************/


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1) ;
        checkBox1.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        }) ;
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2) ;
        checkBox2.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    button.setClickable(true);
                } else {
                    button.setClickable(false);
                }
            }
        }) ;
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3) ;
        checkBox3.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    button.setRotation(45);
                } else {
                    button.setRotation(0);
                }
            }
        }) ;
    }
}