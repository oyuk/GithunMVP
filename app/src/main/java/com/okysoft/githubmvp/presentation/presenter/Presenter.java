package com.okysoft.githubmvp.presentation.presenter;

/**
 * Created by oyuk on 2016/01/21.
 */
public interface Presenter<V> {
    void attachView(V view);
    void detachView();
}
