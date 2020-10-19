package com.example.cuankusqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.cuankusqlite.fragment.CatatanFragment;
import com.example.cuankusqlite.fragment.ProfilFragment;
import com.example.cuankusqlite.fragment.TargetFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set default fragment
        loadFragment(new TargetFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.botnav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    //pemilihan navbar
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.target_menu:
                fragment = new TargetFragment();
                break;
            case R.id.catatan_menu:
                fragment = new CatatanFragment();
                break;
            case R.id.profile_menu:
                fragment = new ProfilFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
