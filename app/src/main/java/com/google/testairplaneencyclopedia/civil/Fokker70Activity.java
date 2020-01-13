package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Fokker70Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker70_1;
    ImageView fokker70_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker70);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker70_1 = (ImageView) findViewById(R.id.fokker70_1);
        fokker70_2 = (ImageView) findViewById(R.id.fokker70_2);

        fokker70_1.setOnClickListener(this);
        fokker70_2.setOnClickListener(this);
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
        if (view.getId() == fokker70_1.getId()) {
            fade();
        } else if (view.getId() == fokker70_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker70_1.animate().alpha(1f - fokker70_1.getAlpha()).setDuration(5);
        fokker70_2.animate().alpha(1f - fokker70_2.getAlpha()).setDuration(5);

    }
}
