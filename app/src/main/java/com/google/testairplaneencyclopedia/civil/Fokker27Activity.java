package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Fokker27Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView fokker27_1;
    ImageView fokker27_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokker27);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        fokker27_1 = (ImageView) findViewById(R.id.fokker27_1);
        fokker27_2 = (ImageView) findViewById(R.id.fokker27_2);

        fokker27_1.setOnClickListener(this);
        fokker27_2.setOnClickListener(this);
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
        if (view.getId() == fokker27_1.getId()) {
            fade();
        } else if (view.getId() == fokker27_2.getId()) {
            fade();
        }
    }

    private void fade() {
        fokker27_1.animate().alpha(1f - fokker27_1.getAlpha()).setDuration(5);
        fokker27_2.animate().alpha(1f - fokker27_2.getAlpha()).setDuration(5);

    }
}
