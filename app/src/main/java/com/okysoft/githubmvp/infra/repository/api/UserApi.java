package com.okysoft.githubmvp.infra.repository.api;

import com.okysoft.githubmvp.domain.entity.Repository;

import java.util.List;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by oyuk on 2016/01/22.
 */

public class UserApi extends BaseClient{

    private GithubService githubService;

    private interface GithubService {
        @GET("users/{username}/repos")
        Observable<List<Repository>> publicRepositories(@Query("q") String username);

        class Factory {
            public static GithubService create() {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(END_POINT)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
                return retrofit.create(GithubService.class);
            }
        }
    }

    public Observable<List<Repository>> test(String username){
        if (githubService == null) {
            githubService = GithubService.Factory.create();
        }
        return githubService.publicRepositories(username)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }
}
