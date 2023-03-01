package com.example.geneltekrarprojeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean statement = true;
    ImageView imageView;
    TextView textView;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.nameTextView);

        textView.setText("Dennis Ritchie");

   }
   public void degistir(View view){

    if(statement){

        imageView.setImageResource(R.drawable.james);
        textView.setText("James Gosling");
        statement = false;

    }else{
        imageView.setImageResource(R.drawable.dennis);
        textView.setText("Dennis Ritchie");
        statement = true;
    }

   }
}