package com.example.gallery;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {
    ImageView fullImage;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView (R.layout.full_image_activity);
        fullImage = (ImageView)findViewById(R.id.full_image);
        String data = getIntent ().getExtras().getString("img");
        fullImage.setImageURI(Uri.parse(data));

    }

}
