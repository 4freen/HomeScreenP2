package com.example.apple.homescreenp2.adapter;

/**
 * Created by apple on 17/07/14.
 */
import com.example.apple.homescreenp2.GamesFragment;
import com.example.apple.homescreenp2.TopRatedFragment;
import com.example.apple.homescreenp2.MoviesFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new TopRatedFragment();
            case 1:
                // Games fragment activity
                return new GamesFragment();
            case 2:
                // Movies fragment activity
                return new MoviesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}