package com.example.image_button;

/* **********************************************
 * 프로젝트명 : image_Button
 * 작성자 : 2019038062 염중화
 * 작성일 : 2022.04.02
 *프로그램 설명 : 버튼을 클릭하면 이미지가 10도씩 회전되도록 프로젝트
 ************************************************/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    float x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        ImageView imageView= findViewById(R.id.image);

        button.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                x =imageView.getRotation();
                x=(x+10)%360;
                imageView.setRotation(x);
            }
        }) ;
    }
}