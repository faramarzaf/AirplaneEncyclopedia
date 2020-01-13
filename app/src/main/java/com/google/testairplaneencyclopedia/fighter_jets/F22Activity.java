package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class F22Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView f22_1;
    ImageView f22_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f22);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        f22_1 = (ImageView) findViewById(R.id.f22_1);
        f22_2 = (ImageView) findViewById(R.id.f22_2);


        f22_1.setOnClickListener(this);
        f22_2.setOnClickListener(this);

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
        if (view.getId() == f22_1.getId()) {
            fade();
        } else if (view.getId() == f22_2.getId()) {
            fade();
        }
    }

    private void fade() {
        f22_1.animate().alpha(1f - f22_1.getAlpha()).setDuration(5);
        f22_2.animate().alpha(1f - f22_2.getAlpha()).setDuration(5);
    }
}
