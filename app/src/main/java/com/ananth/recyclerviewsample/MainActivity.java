package com.ananth.recyclerviewsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLinerLayoutManager;
    private Button mGridLayoutManager;
    private Button mStaggerdLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinerLayoutManager = (Button) findViewById(R.id.linear_layout);
        mGridLayoutManager = (Button) findViewById(R.id.grid_layout);
        mStaggerdLayoutManager = (Button) findViewById(R.id.staggered_layout);
        mLinerLayoutManager.setOnClickListener(this);
        mGridLayoutManager.setOnClickListener(this);
        mStaggerdLayoutManager.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.linear_layout:
                startActivity(new Intent(MainActivity.this, UsingLinearLayoutManager.class));
                break;
            case R.id.grid_layout:
                startActivity(new Intent(MainActivity.this, UsingGridLayoutManager.class));
//                Toast.makeText(MainActivity.this,"Coming soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.staggered_layout:
//                startActivity(new Intent(MainActivity.this, UsingStaggerdLayoutManager.class));
                Toast.makeText(MainActivity.this,"Coming soon",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
