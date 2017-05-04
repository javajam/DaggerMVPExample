package com.wewow.daggermvpexample.injection.mainactivity;

import com.wewow.daggermvpexample.injection.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eleroy on 5/3/2017.
 */

@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter provideMainActivityPresenter() {
        return new MainActivityPresenter();
    }
}
