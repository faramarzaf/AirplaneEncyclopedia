package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ilyushin86Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView il86_1;
    ImageView il86_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyushin86);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        il86_1 = (ImageView) findViewById(R.id.il86_1);
        il86_2 = (ImageView) findViewById(R.id.il86_2);

        il86_1.setOnClickListener(this);
        il86_2.setOnClickListener(this);
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
        if (view.getId() == il86_1.getId()) {
            fade();
        } else if (view.getId() == il86_2.getId()) {
            fade();
        }
    }

    private void fade() {
        il86_1.animate().alpha(1f - il86_1.getAlpha()).setDuration(5);
        il86_2.animate().alpha(1f - il86_2.getAlpha()).setDuration(5);

    }
}
