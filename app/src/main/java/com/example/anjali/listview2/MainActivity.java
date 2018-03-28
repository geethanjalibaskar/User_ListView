package com.example.anjali.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String[] fruitname={"Driver Details","Google Map","Buses"};
    String[] desc={"Driver Details are displayed here","Parent can get the location of their Childrens","Number of bus details are available here"};
    Integer[] imgid={R.drawable.driver,R.drawable.map,R.drawable.bus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst= (ListView) findViewById(R.id.listview);
        CustomListview customListView=new CustomListview(this,fruitname,desc,imgid);
        lst.setAdapter(customListView);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l) {
                if(i==0) {
                    Intent myintent = new Intent(view.getContext(),Recyclerview1.class);
                    startActivityForResult(myintent,0);
                }
                if(i==1) {
                    Intent myintent = new Intent(view.getContext(),MapsActivity1.class);
                    startActivityForResult(myintent,1);
                }
                if(i==2) {
                    Intent myintent = new Intent(view.getContext(),bus.class);
                    startActivityForResult(myintent,2);
                }

            }
        });





    }
}

