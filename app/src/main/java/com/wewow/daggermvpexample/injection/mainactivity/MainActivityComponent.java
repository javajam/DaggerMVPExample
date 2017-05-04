package com.wewow.daggermvpexample.injection.mainactivity;

import com.wewow.daggermvpexample.injection.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by eleroy on 5/3/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
