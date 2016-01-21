package com.okysoft.githubmvp.presentation.presenter;

import com.okysoft.githubmvp.presentation.activity.MainActivity;

/**
 * Created by oyuk on 2016/01/21.
 */
public class MainActivityPresenter implements Presenter<MainActivity>{

    private MainActivity activity;

    @Override
    public void attachView(MainActivity view) {
        this.activity = view;
     }

    @Override
    public void detachView() {

    }
}
