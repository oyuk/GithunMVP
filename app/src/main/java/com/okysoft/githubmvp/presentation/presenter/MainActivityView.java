package com.okysoft.githubmvp.presentation.presenter;

import com.okysoft.githubmvp.domain.usecase.RepositoryUseCase;
import com.okysoft.githubmvp.presentation.activity.MainActivity;

/**
 * Created by oyuk on 2016/01/21.
 */
public class MainActivityView implements Presenter<MainActivity>{

    private RepositoryUseCase repositoryUseCase;
    private MainActivity activity;

    @Override
    public void attachView(MainActivity view) {
        this.activity = view;
     }

    @Override
    public void detachView() {

    }

    public void request(){
        repositoryUseCase.getMyName();
    }
}
