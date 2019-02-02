package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An124Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an124_1;
    ImageView an124_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an124);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an124_1 = (ImageView) findViewById(R.id.an124_1);
        an124_2 = (ImageView) findViewById(R.id.an124_2);

        an124_1.setOnClickListener(this);
        an124_2.setOnClickListener(this);
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
        if (view.getId() == an124_1.getId()) {
            fade();}
        else if (view.getId()==an124_2.getId()){
            fade();}
    }

    private void fade() {
        an124_1.animate().alpha(1f-an124_1.getAlpha()).setDuration(5);
        an124_2.animate().alpha(1f-an124_2.getAlpha()).setDuration(5); }
}
