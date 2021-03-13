package com.example.calci;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText Num1,Num2;
    Button Add,Sub;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Num1=findViewById(R.id.Num1);
Num2=findViewById(R.id.Num2);
Add=findViewById(R.id.But);
Sub=findViewById(R.id.But2);
Result=findViewById(R.id.textView);

Add.setOnClickListener(this);
Sub.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(Num1.getText().toString());
        int b = Integer.parseInt(Num2.getText().toString());
        if(v.getId() == R.id.But)
        {

            Toast.makeText(this,"Sum is "+(a+b),Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.But2)
        {
            Toast.makeText(this,"Difference is "+(a-b),Toast.LENGTH_LONG).show();
        }

    }
}
