package com.company.projecthackathon.data;

import com.company.projecthackathon.domain.User;

import java.util.List;

import retrofit2.Call;

public class UserRepository {

    public static Call<List<User>> getUsers() {
        return UserApiService.getInstance().getUsers();
    }

    public static Call<User> getUser(long id) {
        return UserApiService.getInstance().getUser(id);
    }

    public static Call<Void> deleteUser(long id) {
        return UserApiService.getInstance().deleteUser(id);
    }
}
