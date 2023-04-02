package com.example.edittext_toast_message;

/* **********************************************
 * 프로젝트명 :  EditText_Toast_Message
 * 작성자 : 2019038062 염중화
 * 작성일 : 2022.04.02
 *프로그램 설명 : 에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록 프로젝트
 ************************************************/


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.EditText);

        userInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(getApplicationContext(), userInput.getText(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}