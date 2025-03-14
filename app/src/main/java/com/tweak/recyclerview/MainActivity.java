package com.tweak.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tweak.recyclerview.Classes.RecyclerItemClickListener;
import com.tweak.recyclerview.Models.RecipeModel;

import java.util.ArrayList;

import com.tweak.recyclerview.Adapters.RecipeAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView=findViewById(R.id.recycler_view);
        ArrayList<RecipeModel> list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food1, "Strawberry Smoothie"));
        list.add(new RecipeModel(R.drawable.food2, "Soup Dumplings"));
        list.add(new RecipeModel(R.drawable.food3, "French Fries"));
        list.add(new RecipeModel(R.drawable.food4, "Muffins"));
        list.add(new RecipeModel(R.drawable.food5, "Burger"));
        list.add(new RecipeModel(R.drawable.food6, "Boiled Eggs"));
        list.add(new RecipeModel(R.drawable.food7, "Steak"));
        list.add(new RecipeModel(R.drawable.food8, "Naan and Chicken"));
        list.add(new RecipeModel(R.drawable.food9, "Cereals"));

        RecipeAdapter adapter=new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);



        //LinearLayoutManager
        LinearLayoutManager llm=new LinearLayoutManager(this);   //2 parameters will be passed when we enable horizontal scrollview. Here we only have to display list, so we'll use 1 parameter (by Default->vertical)
        recyclerView.setLayoutManager(llm);

//        LinearLayoutManager llm=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);   //false-> scroll in right side, true-> scroll in left side
//        recyclerView.setLayoutManager(llm);




        //GridLayoutManager
//        GridLayoutManager glm=new GridLayoutManager(this, 2);  //spanCount=2 -> 2 Grids
//        recyclerView.setLayoutManager(glm);




        //StaggeredLayoutManager
//        StaggeredGridLayoutManager slm=new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);  //3->grid, Horizontal->arrangement
//        recyclerView.setLayoutManager(slm);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(MainActivity.this, ScrollingActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Second Item is clicked!!", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "Third Item is clicked!!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "Includes Recipe for the menu", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }
        }
        ));
    }
}