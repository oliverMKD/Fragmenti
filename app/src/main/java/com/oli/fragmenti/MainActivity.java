package com.oli.fragmenti;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tabLayout)
    TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager(pager);
        tablayout.setupWithViewPager(pager);
    }

    public void setUpViewPager(ViewPager upViewPager) {
        myPageAdapter adapter = new myPageAdapter(this.getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"tab 1");
        adapter.addFragment(new Fragment2(),"tab 2");
        adapter.addFragment(new Fragment3(),"tab 3");
        adapter.addFragment(new Fragment4(),"tab 4");
        pager.setAdapter(adapter);
    }
}
