package com.wewow.daggermvpexample.injection.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wewow.daggermvpexample.R;
import com.wewow.daggermvpexample.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Inject
    MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);

        mPresenter.addView(this);
        mPresenter.doCalculation("hello world");
    }

    @Override
    public void updateView(String log) {
        Log.i("MAC_Tag", "updateView: " + log);
    }
}
