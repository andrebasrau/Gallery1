package com.example.gallery;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button basic = (Button) findViewById(R.id.basic);
        Button advance = (Button) findViewById((R.id.advance));
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basic = new Intent (getApplicationContext(),Basic.class);
                startActivity(basic);
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            }
        });

        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basic = new Intent (getApplicationContext(),Advance.class);
                startActivity(basic);
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            }
        });

    }


}
