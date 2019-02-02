package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class C130jActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView c130j_1;
    ImageView c130j_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c130j);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        c130j_1 = (ImageView) findViewById(R.id.c130j_1);
        c130j_2 = (ImageView) findViewById(R.id.c130j_2);

        c130j_1.setOnClickListener(this);
        c130j_2.setOnClickListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == c130j_1.getId()) {
            fade();
        } else if (view.getId() == c130j_2.getId()) {
            fade();
        }
    }
    private void fade() {
        c130j_1.animate().alpha(1f - c130j_1.getAlpha()).setDuration(5);
        c130j_2.animate().alpha(1f - c130j_2.getAlpha()).setDuration(5);

    }
}
