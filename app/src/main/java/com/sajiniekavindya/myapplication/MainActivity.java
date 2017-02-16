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

        ImageView girl = (ImageView) findViewById(R.id.girl1);
        ImageView girl2 = (ImageView) findViewById(R.id.girl2);
        girl.animate().alpha(0f).setDuration(2000);
        girl2.animate().alpha(1f).setDuration(2000);

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
