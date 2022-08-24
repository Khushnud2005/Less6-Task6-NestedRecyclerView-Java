package uz.exemple.less6_task6_nestedrecyclerview_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uz.exemple.less6_task6_nestedrecyclerview_java.adapter.ParentAdapter;
import uz.exemple.less6_task6_nestedrecyclerview_java.model.ChildModel;
import uz.exemple.less6_task6_nestedrecyclerview_java.model.ParentModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ParentModel> parentModelArrayList;
    ArrayList<ChildModel> childModelArrayList;
    ArrayList<ChildModel> favoriteList;
    ArrayList<ChildModel> justWatchedList;
    ArrayList<ChildModel> latestList;
    ArrayList<ChildModel> fantasticList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        recyclerView = findViewById(R.id.rv_parent);
        childModelArrayList = new ArrayList();
        favoriteList = new ArrayList();
        justWatchedList = new ArrayList();
        latestList = new ArrayList();
        parentModelArrayList = new ArrayList();
        fantasticList = new ArrayList();

        latestList.add(new ChildModel(R.drawable.poster1));
        latestList.add(new ChildModel(R.drawable.poster2));
        latestList.add(new ChildModel(R.drawable.poster3));
        latestList.add(new ChildModel(R.drawable.poster4));

        parentModelArrayList.add(new ParentModel("Latest Movies",latestList));

        favoriteList.add(new ChildModel(R.drawable.poster5));
        favoriteList.add(new ChildModel(R.drawable.poster6));
        favoriteList.add(new ChildModel(R.drawable.poster7));
        favoriteList.add(new ChildModel(R.drawable.poster8));
        favoriteList.add(new ChildModel(R.drawable.poster5));

        parentModelArrayList.add(new ParentModel("Favorite Movies",favoriteList));

        justWatchedList.add(new ChildModel(R.drawable.poster8));
        justWatchedList.add(new ChildModel(R.drawable.poster2));
        justWatchedList.add(new ChildModel(R.drawable.poster3));
        justWatchedList.add(new ChildModel(R.drawable.poster4));
        justWatchedList.add(new ChildModel(R.drawable.poster5));

        parentModelArrayList.add(new ParentModel("Just Watched Movies",justWatchedList));

        fantasticList.add(new ChildModel(R.drawable.poster5));
        fantasticList.add(new ChildModel(R.drawable.poster6));
        fantasticList.add(new ChildModel(R.drawable.poster7));
        fantasticList.add(new ChildModel(R.drawable.poster8));
        fantasticList.add(new ChildModel(R.drawable.poster5));

        parentModelArrayList.add(new ParentModel("Fantastic Movies",fantasticList));
        ParentAdapter parentAdapter = new ParentAdapter(parentModelArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();

    }
}