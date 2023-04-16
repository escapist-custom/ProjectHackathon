package com.company.projecthackathon.data.users;

import com.company.projecthackathon.domain.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserApi {

    @GET("user/{id}")
    Call<User> getUser(@Path("id") long id);

}
