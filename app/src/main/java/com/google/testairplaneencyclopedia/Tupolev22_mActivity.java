package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Tupolev22_mActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView tu22m_1;
    ImageView tu22m_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupolev22_m);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        tu22m_1 = (ImageView) findViewById(R.id.tu22m_1);
        tu22m_2 = (ImageView) findViewById(R.id.tu22m_2);


        tu22m_1.setOnClickListener(this);
        tu22m_2.setOnClickListener(this);

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
        if (view.getId() == tu22m_1.getId()) {
            fade();
        } else if (view.getId() == tu22m_2.getId()) {
            fade();
        }
    }

    private void fade() {
        tu22m_1.animate().alpha(1f - tu22m_1.getAlpha()).setDuration(5);
        tu22m_2.animate().alpha(1f - tu22m_2.getAlpha()).setDuration(5);
    }
}
