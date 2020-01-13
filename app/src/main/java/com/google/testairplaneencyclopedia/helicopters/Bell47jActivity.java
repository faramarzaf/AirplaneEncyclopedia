package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell47jActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell47j_1;
    ImageView bell47j_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell47j);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell47j_1 = (ImageView) findViewById(R.id.bell47j_1);
        bell47j_2 = (ImageView) findViewById(R.id.bell47j_2);

        bell47j_1.setOnClickListener(this);
        bell47j_2.setOnClickListener(this);
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
        if (view.getId() == bell47j_1.getId()) {
            fade();
        } else if (view.getId() == bell47j_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell47j_1.animate().alpha(1f - bell47j_1.getAlpha()).setDuration(5);
        bell47j_2.animate().alpha(1f - bell47j_2.getAlpha()).setDuration(5);

    }
}
