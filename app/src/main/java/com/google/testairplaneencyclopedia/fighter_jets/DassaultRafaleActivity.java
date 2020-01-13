package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class DassaultRafaleActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView rafale_1;
    ImageView rafale_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dassault_rafale);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rafale_1 = (ImageView) findViewById(R.id.rafale_1);
        rafale_2 = (ImageView) findViewById(R.id.rafale_2);

        rafale_1.setOnClickListener(this);
        rafale_2.setOnClickListener(this);

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
        if (view.getId() == rafale_1.getId()) {
            fade();
        } else if (view.getId() == rafale_2.getId()) {
            fade();
        }

    }

    private void fade() {
        rafale_1.animate().alpha(1f - rafale_1.getAlpha()).setDuration(5);
        rafale_2.animate().alpha(1f - rafale_2.getAlpha()).setDuration(5);

    }
}
