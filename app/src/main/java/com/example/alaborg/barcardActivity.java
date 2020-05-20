package com.example.alaborg;

import androidx.appcompat.app.AppCompatActivity;

public class barcardActivity extends AppCompatActivity {
   /*
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drinks> barcardArrayList;

    public BarcardActivity(RecyclerView.Adapter mAdapter) {
        this.mAdapter = mAdapter;
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcard);
        this.barcardArrayList = new ArrayList<BarcardList>();
        createModel();
        this.recyclerView = (RecyclerView) findViewById(R.id.barcard_RecycleView);

        // use this setting to improve performance
        // if you know that changes in content do not change the layout size of the RecyclerView
        this.recyclerView.setHasFixedSize(true);

        // adding things to the recycleview
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        this.recyclerView.addItemDecoration(itemDecoration);

        // use a linear layout manager
        this.layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        this.mAdapter = new BarAdapter(barcardArrayList);
        this.recyclerView.setAdapter(mAdapter);
    }
 /*
public class barcard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcard);
    }
*/
}
