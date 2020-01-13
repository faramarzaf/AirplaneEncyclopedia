package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class EurofighterTyphoonActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView typhoon_1;
    ImageView typhoon_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurofighter_typhoon);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        typhoon_1 = (ImageView) findViewById(R.id.typhoon_1);
        typhoon_2 = (ImageView) findViewById(R.id.typhoon_2);

        typhoon_1.setOnClickListener(this);
        typhoon_2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == typhoon_1.getId()) {
            fade();
        } else if (v.getId() == typhoon_2.getId()) {
            fade();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private void fade() {
        typhoon_1.animate().alpha(1f - typhoon_1.getAlpha()).setDuration(5);
        typhoon_2.animate().alpha(1f - typhoon_2.getAlpha()).setDuration(5);

    }
}
