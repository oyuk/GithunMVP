package com.okysoft.githubmvp.domain.usecase;

import com.okysoft.githubmvp.domain.entity.Repository;

import java.util.List;

/**
 * Created by oyuk on 2016/01/21.
 */
public interface RepositoryUseCase {
    List<Repository> request();
}
