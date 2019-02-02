package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Bell427Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell427_1;
    ImageView bell427_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell427);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell427_1 = (ImageView) findViewById(R.id.bell427_1);
        bell427_2 = (ImageView) findViewById(R.id.bell427_2);

        bell427_1.setOnClickListener(this);
        bell427_2.setOnClickListener(this);
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
        if (view.getId() == bell427_1.getId()) {
            fade();
        } else if (view.getId() == bell427_2.getId()) {
            fade();
        }
    }
    private void fade() {
        bell427_1.animate().alpha(1f - bell427_1.getAlpha()).setDuration(5);
        bell427_2.animate().alpha(1f - bell427_2.getAlpha()).setDuration(5);

    }
}
