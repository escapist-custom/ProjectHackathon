package com.company.projecthackathon.data.users;

import com.company.projecthackathon.domain.model.User;

import java.util.List;

import retrofit2.Call;

public class UserRepository {
    public static Call<User> getUser(long id) {
        return UserApiService.getInstance().getUser(id);
    }
}
