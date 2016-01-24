package com.okysoft.githubmvp.domain.repository;

import com.okysoft.githubmvp.infra.repository.api.Response;

import java.util.List;

/**
 * Created by oyuk on 2016/01/21.
 */
public interface RepositoryRepository {
    List<Response> getRepository();
}
