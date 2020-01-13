package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Su34Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView su34_1;
    ImageView su34_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su34);


        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        su34_1 = (ImageView) findViewById(R.id.su34_1);
        su34_2 = (ImageView) findViewById(R.id.su34_2);


        su34_1.setOnClickListener(this);
        su34_2.setOnClickListener(this);

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
        if (view.getId() == su34_1.getId()) {
            fade();
        } else if (view.getId() == su34_2.getId()) {
            fade();
        }
    }

    private void fade() {
        su34_1.animate().alpha(1f - su34_1.getAlpha()).setDuration(5);
        su34_2.animate().alpha(1f - su34_2.getAlpha()).setDuration(5);
    }
}
