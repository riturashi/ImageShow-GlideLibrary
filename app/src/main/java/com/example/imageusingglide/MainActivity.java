package com.example.imageusingglide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList imageUrlList = dataArray();
        DataAdapter dataAdapter = new DataAdapter(getApplicationContext(), imageUrlList);
        recyclerView.setAdapter(dataAdapter);

    }
    private ArrayList dataArray() {


        String imageUrls[] = {
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg",
                "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg"};

        ArrayList imageUrlList = new ArrayList<>();
        for (int i = 0; i < imageUrls.length; i++) {
            ImageUrl imageUrl = new ImageUrl();
            imageUrl.setImageUrl(imageUrls[i]);
            imageUrlList.add(imageUrl);
        }
        Log.d("MainActivity", "List count: " + imageUrlList.size());
        return imageUrlList;
    }
}