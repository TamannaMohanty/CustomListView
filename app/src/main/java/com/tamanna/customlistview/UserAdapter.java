package com.tamanna.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userPojoList = new ArrayList<>();
    LayoutInflater layoutInflater;

    public UserAdapter(Context context, List<UserPojo> userPojoList) {
        this.context = context;
        this.userPojoList = userPojoList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root =layoutInflater.inflate(R.layout.custom_user,null);

        ImageView imgvw = root.findViewById(R.id.image_img);
        TextView cname = root.findViewById(R.id.countries_txt);
        TextView capitalname = root.findViewById(R.id.capital_txt);
        TextView population = root.findViewById(R.id.population_txt);

        imgvw.setImageResource(userPojoList.get(i).getImg());
        cname.setText(userPojoList.get(i).getCountryname());
        capitalname.setText(userPojoList.get(i).getCapital());
        population.setText(userPojoList.get(i).getPopulation());

        return root;
    }
}


