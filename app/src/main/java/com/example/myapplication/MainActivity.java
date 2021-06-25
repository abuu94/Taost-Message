package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myName;
    Button myBtnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myName = findViewById(R.id.edtName);
        myBtnClickMe=findViewById(R.id.btn_ClickMe);

        myBtnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = myName.getText().toString();
                if (username.isEmpty()){
                    myName.setError("Please Enter You Name");
                }else{
                    Toast.makeText(MainActivity.this, "Mimi ni :"+username, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}