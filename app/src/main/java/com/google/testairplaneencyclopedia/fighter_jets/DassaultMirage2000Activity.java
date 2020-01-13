package com.google.testairplaneencyclopedia.fighter_jets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class DassaultMirage2000Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView mirage_2000_1;
    ImageView mirage_2000_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dassault_mirage2000);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mirage_2000_1 = (ImageView) findViewById(R.id.mirage_2000_1);
        mirage_2000_2 = (ImageView) findViewById(R.id.mirage_2000_2);
        mirage_2000_1.setOnClickListener(this);
        mirage_2000_2.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == mirage_2000_1.getId()) {
            fade();
        } else if (v.getId() == mirage_2000_2.getId()) {
            fade();
        }
    }


    private void fade() {
        mirage_2000_1.animate().alpha(1f - mirage_2000_1.getAlpha()).setDuration(5);
        mirage_2000_2.animate().alpha(1f - mirage_2000_2.getAlpha()).setDuration(5);

    }
}
