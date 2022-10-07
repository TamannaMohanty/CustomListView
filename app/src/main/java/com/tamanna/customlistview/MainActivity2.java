package com.tamanna.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1;
    TextView cname1;
    TextView capitalname2;


    String namestr,capitalstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1 = findViewById(R.id.image_img);
        cname1=findViewById(R.id.countries_txt);
        capitalname2 = findViewById(R.id.capital_txt);


        namestr = getIntent().getStringExtra("countrykey");
        capitalstr =getIntent().getStringExtra("capitalkey");


        int imageid = getIntent().getIntExtra("imgkey",0);
        img1.setImageResource(imageid);

        cname1.setText(namestr);
        capitalname2.setText(capitalstr);

    }
}
