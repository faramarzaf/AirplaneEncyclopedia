package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell214stActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell214st_1;
    ImageView bell214st_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell214st);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell214st_1 = (ImageView) findViewById(R.id.bell214st_1);
        bell214st_2 = (ImageView) findViewById(R.id.bell214st_2);

        bell214st_1.setOnClickListener(this);
        bell214st_2.setOnClickListener(this);
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
        if (view.getId() == bell214st_1.getId()) {
            fade();
        } else if (view.getId() == bell214st_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell214st_1.animate().alpha(1f - bell214st_1.getAlpha()).setDuration(5);
        bell214st_2.animate().alpha(1f - bell214st_2.getAlpha()).setDuration(5);

    }
}
