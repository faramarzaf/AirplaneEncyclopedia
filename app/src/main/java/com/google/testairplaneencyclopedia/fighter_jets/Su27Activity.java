package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Su27Activity extends AppCompatActivity implements View.OnClickListener {

      ImageView su27_1;
    ImageView su27_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su27);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        su27_1 = (ImageView) findViewById(R.id.su27_1);
        su27_2 = (ImageView) findViewById(R.id.su27_2);

        su27_1.setOnClickListener(this);
        su27_2.setOnClickListener(this);


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
        if (view.getId() == su27_1.getId()) {
            fade();
        } else if (view.getId() == su27_2.getId()) {
            fade();
        }
    }

    private void fade() {
        su27_1.animate().alpha(1f - su27_1.getAlpha()).setDuration(5);
        su27_2.animate().alpha(1f - su27_2.getAlpha()).setDuration(5);
    }
}
