package com.joker.onepiece;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.joker.onepiece.fragment.HomeFragment;
import com.joker.onepiece.fragment.MineFragment;
import com.joker.onepiece.fragment.VideoFragment;
import com.joker.onepiece.fragment.WorkFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private HomeFragment mHomeFragment;

    private WorkFragment mWorkFragment;

    private VideoFragment mVideoFragment;

    private MineFragment mMineFragment;

    List<Fragment> arrayList;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    initFragment(0);
                    return true;
                case R.id.navigation_video:
                    initFragment(1);
                    return true;
                case R.id.navigation_work:
                    initFragment(2);
                    return true;
                case 1:
                    initFragment(3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        if (true) {
            navView.getMenu().add(0, 1, 1, "Mine").setIcon(R.drawable.ic_account_black_24dp);
        }
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        initFragment(0);


        Toast.makeText(getApplicationContext(),"哈哈哈哈 ",Toast.LENGTH_LONG).show();

//        arrayList.add(mWorkFragment);
    }


    private void initFragment(int i) {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (i) {
            case 0:
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.body, mHomeFragment, "home");
                } else {
                    fragmentTransaction.show(mHomeFragment);
                }
                break;

            case 1:
                if (mWorkFragment == null) {
                    mWorkFragment = new WorkFragment();
                    fragmentTransaction.add(R.id.body, mWorkFragment, "work");
                } else {
                    fragmentTransaction.show(mWorkFragment);
                }
                break;
            case 2:
                if (mVideoFragment == null) {
                    mVideoFragment = new VideoFragment();
                    fragmentTransaction.add(R.id.body, mVideoFragment, "video");
                } else {
                    fragmentTransaction.show(mVideoFragment);
                }
                break;
            case 3:
                if (mMineFragment == null) {
                    mMineFragment = new MineFragment();
                    fragmentTransaction.add(R.id.body, mMineFragment, "mine");
                } else {
                    fragmentTransaction.show(mMineFragment);
                }
                break;
            default:
                break;
        }
        fragmentTransaction.commit();

    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if (mHomeFragment != null) {
            fragmentTransaction.hide(mHomeFragment);
        }

        if (mWorkFragment != null) {
            fragmentTransaction.hide(mWorkFragment);
        }
        if (mVideoFragment != null) {
            fragmentTransaction.hide(mVideoFragment);
        }

        if (mMineFragment != null) {
            fragmentTransaction.hide(mMineFragment);
        }
    }
}
