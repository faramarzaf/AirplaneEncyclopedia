package com.google.testairplaneencyclopedia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing737MaxActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView b737max_1;
    ImageView b737max_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing737_max);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b737max_1 = (ImageView) findViewById(R.id.b737max_1);
        b737max_2 = (ImageView) findViewById(R.id.b737max_2);

        b737max_1.setOnClickListener(this);
        b737max_2.setOnClickListener(this);

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
        if (view.getId() == b737max_1.getId()) {
            fade();}
        else if (view.getId()==b737max_2.getId()){
            fade();}
    }

    private void fade() {
        b737max_1.animate().alpha(1f-b737max_1.getAlpha()).setDuration(5);
        b737max_2.animate().alpha(1f-b737max_2.getAlpha()).setDuration(5);
    }
}
