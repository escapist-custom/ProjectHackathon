package com.company.projecthackathon.data.users;

import com.company.projecthackathon.data.RetrofitService;

public class UserApiService {

    private static UserApi userApi;

    private static UserApi create() {
        return RetrofitService.getInstance().create(UserApi.class);
    }

    public static UserApi getInstance() {
        if (userApi == null) userApi = create();
        return userApi;
    }
}
