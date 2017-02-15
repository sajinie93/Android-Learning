package com.sajiniekavindya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

//        throw new AndroidRuntimeException();
        startActivity(intent);
    }

    public void clickMe(View view) {
        EditText usd = (EditText) findViewById(R.id.usd_id);
        int value_1 = 0;
        String value_2 = "";
        try {
        value_1 = Integer.parseInt(usd.getText().toString());
        } catch(NumberFormatException e) {
           System.out.println("parse value is not valid : " + e);
        }

        System.out.println(value_1);

        value_2 = Integer.toString(value_1*150);
        System.out.println(value_2);
        EditText rupee = (EditText) findViewById(R.id.rupee_id);
        rupee.setText(value_2);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button button = (Button) findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
////                intent.putExtra("value", myTextField.getText().toString());
////                startActivity(intent);


//            }
//        });
    }
}
