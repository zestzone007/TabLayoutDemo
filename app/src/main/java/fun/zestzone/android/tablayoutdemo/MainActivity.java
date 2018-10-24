package fun.zestzone.android.tablayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = makeMenuTab();
        mTabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.i(TAG, "onTabSelected: tabPos = "+tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.i(TAG, "onTabUnselected: tabPos = "+tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.i(TAG, "onTabReselected: tabPos = "+tab.getPosition());
            }
        });
    }

    private TabLayout makeMenuTab() {
        TabLayout tabLayout = findViewById(R.id.tab_menu);

        TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setCustomView(new CustomTabItem(this,
                R.drawable.selector_ic_home, R.string.home_page));
        tabLayout.addTab(tab1, true);

        TabLayout.Tab tab2 = tabLayout.newTab();
        tab2.setCustomView(new CustomTabItem(this,
                R.drawable.selector_ic_parameter, R.string.parameter));
        tabLayout.addTab(tab2, false);

        TabLayout.Tab tab3 = tabLayout.newTab();
        tab3.setCustomView(new CustomTabItem(this,
                R.drawable.selector_ic_log, R.string.log));
        tabLayout.addTab(tab3, false);

        TabLayout.Tab tab4 = tabLayout.newTab();
        tab4.setCustomView(new CustomTabItem(this,
                R.drawable.selector_ic_permission, R.string.permission));
        tabLayout.addTab(tab4, false);


        TabLayout.Tab tab5 = tabLayout.newTab();
        tab5.setCustomView(new CustomTabItem(this,
                R.drawable.selector_ic_form, R.string.form));
        tabLayout.addTab(tab5, false);
        return tabLayout;
    }
}
