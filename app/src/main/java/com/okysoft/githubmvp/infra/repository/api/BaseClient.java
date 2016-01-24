package com.okysoft.githubmvp.infra.repository.api;

import com.okysoft.githubmvp.domain.entity.Repository;

import java.io.IOError;
import java.io.IOException;
import java.util.List;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by oyuk on 2016/01/22.
 */
public class BaseClient {

    protected static final String END_POINT = "https://api.github.com/";

}
