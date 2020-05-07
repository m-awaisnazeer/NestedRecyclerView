package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecyclerview.Adapters.VerticalRVAdapter;
import com.example.nestedrecyclerview.Models.HorizontalModel;
import com.example.nestedrecyclerview.Models.VerticalModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<VerticalModel> modelArrayList;
    ArrayList<HorizontalModel> horizontalModelSportsArrayList, horizontalModelEntertainmentArrayList,horizontalModelSocialNetworksArrayList;
    RecyclerView recyclerView;
    VerticalRVAdapter verticalRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.vertivalRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));

        modelArrayList = new ArrayList<>();
        horizontalModelSportsArrayList = new ArrayList<>();
        horizontalModelEntertainmentArrayList = new ArrayList<>();
        horizontalModelSocialNetworksArrayList = new ArrayList<>();



        horizontalModelSportsArrayList.add(new HorizontalModel("Cricket","England"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Football","Germany"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Hockey","Austrailia"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Cricket","England"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Football","Germany"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Hockey","Austrailia"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Cricket","England"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Football","Germany"));
        horizontalModelSportsArrayList.add(new HorizontalModel("Hockey","Austrailia"));


        horizontalModelEntertainmentArrayList.add(new HorizontalModel("HollyWood","America"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("BollyWood","India"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("LollyWood","Pakistan"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("HollyWood","America"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("BollyWood","India"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("LollyWood","Pakistan"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("HollyWood","America"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("BollyWood","India"));
        horizontalModelEntertainmentArrayList.add(new HorizontalModel("LollyWood","Pakistan"));

        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("FaceBook","FaceBook is very Famous Social Media"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Instagram","Instagram is very Famous Social Media Developed by Facebook"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Twitter","Twitter is very Famous Social Media"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("FaceBook","FaceBook is very Famous Social Media"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Instagram","Instagram is very Famous Social Media Developed by Facebook"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Twitter","Twitter is very Famous Social Media"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("FaceBook","FaceBook is very Famous Social Media"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Instagram","Instagram is very Famous Social Media Developed by Facebook"));
        horizontalModelSocialNetworksArrayList.add(new HorizontalModel("Twitter","Twitter is very Famous Social Media"));


        modelArrayList.add(new VerticalModel(horizontalModelSportsArrayList,"Sports"));
        modelArrayList.add(new VerticalModel(horizontalModelEntertainmentArrayList,"Entertainment"));
        modelArrayList.add(new VerticalModel(horizontalModelSocialNetworksArrayList,"Social Networks"));
        modelArrayList.add(new VerticalModel(horizontalModelSportsArrayList,"Sports"));
        modelArrayList.add(new VerticalModel(horizontalModelEntertainmentArrayList,"Entertainment"));
        modelArrayList.add(new VerticalModel(horizontalModelSocialNetworksArrayList,"Social Networks"));
        modelArrayList.add(new VerticalModel(horizontalModelSportsArrayList,"Sports"));
        modelArrayList.add(new VerticalModel(horizontalModelEntertainmentArrayList,"Entertainment"));
        modelArrayList.add(new VerticalModel(horizontalModelSocialNetworksArrayList,"Social Networks"));
        modelArrayList.add(new VerticalModel(horizontalModelSportsArrayList,"Sports"));
        modelArrayList.add(new VerticalModel(horizontalModelEntertainmentArrayList,"Entertainment"));
        modelArrayList.add(new VerticalModel(horizontalModelSocialNetworksArrayList,"Social Networks"));

        verticalRVAdapter = new VerticalRVAdapter(modelArrayList,this);
        recyclerView.setAdapter(verticalRVAdapter);
//        recyclerView.notify();




    }
}