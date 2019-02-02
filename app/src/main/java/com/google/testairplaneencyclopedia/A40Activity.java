package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A40Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a40_1;
    ImageView a40_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a40);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        a40_1 = (ImageView) findViewById(R.id.a40_1);
        a40_2 = (ImageView) findViewById(R.id.a40_2);

        a40_1.setOnClickListener(this);
        a40_2.setOnClickListener(this);
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
        if (view.getId()==a40_1.getId()){
            fade();
        }
        else if(view.getId()==a40_2.getId()) {
            fade();
        }
    }

    private void fade() {
        a40_1.animate().alpha(1f-a40_1.getAlpha()).setDuration(5);
        a40_2.animate().alpha(1f-a40_2.getAlpha()).setDuration(5);
    }
}
