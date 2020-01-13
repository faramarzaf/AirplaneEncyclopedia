package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class F16Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView f16_1;
    ImageView f16_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f16);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        f16_1 = (ImageView) findViewById(R.id.f16_1);
        f16_2 = (ImageView) findViewById(R.id.f16_2);


        f16_1.setOnClickListener(this);
        f16_2.setOnClickListener(this);



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
        if (view.getId() == f16_1.getId()) {
            fade();
        } else if (view.getId() == f16_2.getId()) {
            fade();
        }
    }

    private void fade() {
        f16_1.animate().alpha(1f - f16_1.getAlpha()).setDuration(5);
        f16_2.animate().alpha(1f - f16_2.getAlpha()).setDuration(5);

    }
}

