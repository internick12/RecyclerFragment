package com.galosoft.recyclerfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.galosoft.recyclerfragment.Adapter.ViewPagerAdapter;
import com.galosoft.recyclerfragment.Fragments.FragmentCall;
import com.galosoft.recyclerfragment.Fragments.FragmentContact;
import com.galosoft.recyclerfragment.Fragments.FragmentFav;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment
        adapter.addFragment(new FragmentCall(), "Call");
        adapter.addFragment(new FragmentContact(), "Contact");
        adapter.addFragment(new FragmentFav(), "Favorites");

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
