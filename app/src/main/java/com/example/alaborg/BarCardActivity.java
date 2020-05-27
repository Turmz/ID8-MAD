package com.example.alaborg;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BarCardActivity extends AppCompatActivity implements DrinkRecyclerViewAdapter.ItemClickListener {

    private static List<Drink> drinks = new ArrayList<Drink>() {{
        add(Drink.of("33cl - Føroya Bjór - Veðrur", R.drawable.vedrur));
        add(Drink.of("33cl - Føroya Bjór - Classic", R.drawable.classic));
        add(Drink.of("33cl - Føroya Bjór - Gull", R.drawable.gull));
        add(Drink.of("33cl - Føroya Bjór - Slupp", R.drawable.slupp));
        add(Drink.of("33cl - Føroya Bjór - Black Sheep", R.drawable.blacksheep));
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcard);

        RecyclerView recyclerView = findViewById(R.id.rvDrinks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DrinkRecyclerViewAdapter adapter = new DrinkRecyclerViewAdapter(this, drinks);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        // Toast.makeText(this, "Du klikkede på " + adapter.getItem(position) + ", på række " + (position += 1), Toast.LENGTH_SHORT).show();
    }

}
