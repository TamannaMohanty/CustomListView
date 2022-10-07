package com.tamanna.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ///variable

    ListView customlist;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlist = findViewById(R.id.custlist);
        userAdapter = new UserAdapter(this,userPojoList);
        customlist.setAdapter(userAdapter);
        loadUserData();

        customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class) ;
                intent.putExtra("imgkey",userPojoList.get(i).getImg());
                intent.putExtra("countrykey",userPojoList.get(i).getCountryname());
                intent.putExtra("capitalkey",userPojoList.get(i).getCapital());
                intent.putExtra("populationkey",userPojoList.get(i).getPopulation());
                intent.putExtra("descriptionkey",userPojoList.get(i).getDescription());

                startActivity(intent);

            }
        });
    }

    private void loadUserData() {

        userPojo = new UserPojo(R.drawable.india,"INDIA","Delhi","1.8 billion","India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world.");
        userPojoList.add(userPojo);

        userPojo = new UserPojo(R.drawable.uk,"UK","London","68.60 billion","The United Kingdom, made up of England, Scotland, Wales and Northern Ireland, is an island nation in northwestern Europe. England – birthplace of Shakespeare and The Beatles – is home to the capital, London, a globally influential centre of finance and culture.");
        userPojoList.add(userPojo);

        userPojo = new UserPojo(R.drawable.china,"China","Bejing","1.60 billion","China, officially the People's Republic of China, is a country in East Asia. It is the world's most populous country, with a population of more than 1.4 billion");
        userPojoList.add(userPojo);

        userPojo = new UserPojo(R.drawable.pakistan,"Pakistan","Islamabad","88.60 billion","Pakistan, officially the Islamic Republic of Pakistan, is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 242 million, and has the world's second-largest Muslim population");
        userPojoList.add(userPojo);

        userAdapter.notifyDataSetChanged();
    }
}
