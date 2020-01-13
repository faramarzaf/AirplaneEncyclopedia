package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class F35Activity extends AppCompatActivity implements View.OnClickListener {

     ImageView f35_1;
     ImageView f35_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f35);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        f35_1 = (ImageView) findViewById(R.id.f35_1);
        f35_2 = (ImageView) findViewById(R.id.f35_2);


        f35_1.setOnClickListener(this);
        f35_2.setOnClickListener(this);

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
        if (view.getId() == f35_1.getId()) {
            fade();
        } else if (view.getId() == f35_2.getId()) {
            fade();
        }

    }

    private void fade() {
        f35_1.animate().alpha(1f - f35_1.getAlpha()).setDuration(5);
        f35_2.animate().alpha(1f - f35_2.getAlpha()).setDuration(5);
    }
}
