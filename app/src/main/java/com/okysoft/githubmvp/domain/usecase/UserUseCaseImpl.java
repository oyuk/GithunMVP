package com.okysoft.githubmvp.domain.usecase;

import com.okysoft.githubmvp.domain.repository.UserRepository;

/**
 * Created by oyuk on 2016/01/21.
 */
public class UserUseCaseImpl implements UserUseCase {
    private UserRepository userRepository;

    public UserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
