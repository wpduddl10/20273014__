package com.example.maching_20273014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

    }

    public void onClickcall(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-7777-7777"));
        startActivity(myIntent);
    }



    public void onClickpp(View v){
        changeImage();
}

        private void changeImage(){
        if(imageIndex == 0 ){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        }
        else if(imageIndex == 1 ) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 0 ;
        }
    }
}