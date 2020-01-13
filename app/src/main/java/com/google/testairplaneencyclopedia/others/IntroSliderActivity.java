package com.google.testairplaneencyclopedia.others;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.testairplaneencyclopedia.R;

public class IntroSliderActivity extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout layoutDots;
    Button btnNext, btnSkip;

    SliderPagerAdapter pagerAdapter;

    private SlidePrefManager prefMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_slider);
        changeStatusBarColor();
        prefMan = new SlidePrefManager(this);
        if(!prefMan.startSlider()){
            // age bare aval nabashe dg neshon nade1***2 ham dare payin
            launchMainScreen();
            return;
        }
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        layoutDots = (LinearLayout) findViewById(R.id.layoutDots);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        pagerAdapter = new SliderPagerAdapter();
        viewPager.setAdapter(pagerAdapter);
        showDots(viewPager.getCurrentItem());// mifahme safe chande


        //har zaman page avaz shod chi beshe
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // dots
                showDots(position);
                // last page
                //yani safe akhar dg dokme skip nabashe
                if(position == viewPager.getAdapter().getCount() - 1) {
                    btnSkip.setVisibility(View.GONE);
                    btnNext.setText(R.string.gotit);
                } else {
                    btnSkip.setVisibility(View.VISIBLE);
                    btnNext.setText(R.string.next);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPage = viewPager.getCurrentItem();
                int lastPages = viewPager.getAdapter().getCount()-1;
                if(currentPage == lastPages){
                    // age safe akhar hastim
                    prefMan.setStartSlider(false);//age bare aval nabashe dg neshon nade2****
                    launchMainScreen();
                } else{
                    viewPager.setCurrentItem(currentPage+1); // mirim safe bad
                }
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainScreen();
            }
        });
    }

    private void launchMainScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void showDots(int pageNumber){
        TextView [] dots = new TextView[viewPager.getAdapter().getCount()];

        layoutDots.removeAllViews();// in ham SHADIDAN MOHEM***
        // age nabashe page1 4 dot , page2 8 dots , .... mishe
        // age ino nazari hey dot haye qablio ezafe mikone

        for(int i = 0; i < dots.length ; i++){

            // in khate kheili moheme******
            // bayad init bshe tv ke bad bekhay vizhegihaye ziro bzani rosh******
            dots[i] = new TextView(this);


            dots[i].setText(Html.fromHtml("&#8226;"));//in khode noqte ba format html
            dots[i].setTextSize(TypedValue.COMPLEX_UNIT_SP, 35);
            dots[i].setTextColor(ContextCompat.getColor(this,
                    (i == pageNumber ?  R.color.dot_active : R.color.dot_inactive)
            ));
            // yani aval bbin kodom page hasti.
            // har page ke boodi rang active mishe
            // da qeyre in sorat mishe deactive


            layoutDots.addView(dots[i]);
        }
    }

    private void changeStatusBarColor(){
        // yani az android 5 be bala age bashe device karbar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }


    public class SliderPagerAdapter extends PagerAdapter{
        String [] slideTitles;
        String [] slideDescriptions;

        int [] bgColorIds = {R.color.slide_1_bg_color, R.color.slide_2_bg_color,
                R.color.slide_3_bg_color, R.color.slide_4_bg_color};

        int [] slideImageIds = {R.drawable.easy, R.drawable.brief,
                R.drawable.useful, R.drawable.expert};

        public SliderPagerAdapter(){
            slideTitles = getResources().getStringArray(R.array.slide_titles);
            slideDescriptions = getResources().getStringArray(R.array.slide_descriptions);
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = LayoutInflater.from(IntroSliderActivity.this)
                    .inflate(R.layout.slide, container, false);
            view.findViewById(R.id.bgLayout).setBackgroundColor(
                    ContextCompat.getColor(IntroSliderActivity.this, bgColorIds[position]));
            ((ImageView) view.findViewById(R.id.slide_image)).setImageResource(slideImageIds[position]);
            ((TextView) view.findViewById(R.id.slide_title)).setText(slideTitles[position]);
            ((TextView) view.findViewById(R.id.slide_desc)).setText(slideDescriptions[position]);
            container.addView(view);
            return view;
        }
        //in method mige slide haye shoma chantan
        @Override
        public int getCount() {
            return bgColorIds.length;
            // az ruye colors mifahmim chanta safe hast
            //to mitooni az ru baqie chiza ham befahmi
            // msle slideTitles  , slideDescriptions , slideImageIds
        }

        //in method mige in view male in obj hast ya na
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        //container ye liste ke view haro show mikone
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }


}
