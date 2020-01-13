package com.google.testairplaneencyclopedia.helicopters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Bell430Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView bell430_1;
    ImageView bell430_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell430);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bell430_1 = (ImageView) findViewById(R.id.bell430_1);
        bell430_2 = (ImageView) findViewById(R.id.bell430_2);

        bell430_1.setOnClickListener(this);
        bell430_2.setOnClickListener(this);
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
        if (view.getId() == bell430_1.getId()) {
            fade();
        } else if (view.getId() == bell430_2.getId()) {
            fade();
        }

    }

    private void fade() {
        bell430_1.animate().alpha(1f - bell430_1.getAlpha()).setDuration(5);
        bell430_2.animate().alpha(1f - bell430_2.getAlpha()).setDuration(5);

    }
}
