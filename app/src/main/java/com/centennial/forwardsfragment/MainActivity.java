package com.centennial.forwardsfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MbappeFragment mbappeFragment;
    DinennoFragment dinennoFragment;
    DybalaFragment dybalaFragment;
    ChicharitoFragment chicharitoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbappeFragment = new MbappeFragment();
        dybalaFragment = new DybalaFragment();
        dinennoFragment = new DinennoFragment();
        chicharitoFragment = new ChicharitoFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,mbappeFragment).commit();
    }

    public void loadMbappeFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,mbappeFragment).commit();
    }
    public void loadDybalaFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,dybalaFragment).commit();
    }
    public void loadChicharitoFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,chicharitoFragment).commit();
    }
    public void loadDinennoFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,dinennoFragment).commit();
    }
}