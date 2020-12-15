package br.com.douggoncalves.trabalhomobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.douggoncalves.trabalhomobile.adapter.RecentsAdapter;
import br.com.douggoncalves.trabalhomobile.adapter.TopPlacesAdapter;
import br.com.douggoncalves.trabalhomobile.model.RecentsData;
import br.com.douggoncalves.trabalhomobile.model.TopPlacesData;

public class MainActivity extends AppCompatActivity {

        RecyclerView recentRecycler, topPlacesRecycler;
        RecentsAdapter recentsAdapter;
        TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Mock de dados para simular massa em recentes
        List<RecentsData> recentsDataList = new ArrayList<>();

        recentsDataList.add(new RecentsData("Banff","Canada","$$",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        //Mock de dados para simular massa em outras sugestões
        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);

    }



    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}




