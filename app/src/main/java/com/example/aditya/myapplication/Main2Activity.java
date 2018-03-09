package com.example.aditya.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    //    private Toolbar toolbar;
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
////        setupViewPager(viewPager);
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);


        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            value = extras.getString("key");
        }

        TextView textElement = (TextView) findViewById(R.id.textView);
        textElement.setText(value);
        TextView textElement2 = (TextView) findViewById(R.id.textView2);
        textElement2.setText("1234567890/Audi");
        TextView textElement3 = (TextView) findViewById(R.id.textView3);
        textElement3.setText("Contract Done");
        TextView textElement4 = (TextView) findViewById(R.id.textView4);
        textElement4.setText("Mar 7,10:30 PM");
        TextView textElement5 = (TextView) findViewById(R.id.textView5);
        textElement5.setText("EMI: Rp 0");
        TextView textElement6 = (TextView) findViewById(R.id.textView6);
        textElement6.setText("Tenure: 0 months");
        TextView textElement7 = (TextView) findViewById(R.id.textView7);
        textElement7.setText("DP: Rp 0");
    }
//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new OneFragment(), "info");
//        adapter.addFragment(new TwoFragment(), "List");
//        adapter.addFragment(new ThreeFragment(), "Notes");
//        viewPager.setAdapter(adapter);
//    }
//
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }


}
