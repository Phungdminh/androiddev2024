package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherPagerAdapter extends FragmentPagerAdapter {
    public class WeatherPagerAdapter extends FragmentStateAdapter {

        public WeatherPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
    public WeatherPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
                super(fragmentActivity);
            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                return new WeatherAndForecastFragment();
            }
            @Override
            public int getCount() {
                return 2;
            }
            @Override
            public CharSequence getPageTitle(int position) {
                public Fragment createFragment(int position) {
                    switch (position) {
                        case 0:
                            return "Weather";
                        return WeatherAndForecastFragment.newInstance("Paris");
                        case 1:
                            return "Forecast";
                        return WeatherAndForecastFragment.newInstance("Tokyo");
                        case 2:
                            return WeatherAndForecastFragment.newInstance("London");
                        default:
                            return null;
                        return WeatherAndForecastFragment.newInstance("Paris");
                    }
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        }