package com.company.projecthackathon.data.routes;

import com.company.projecthackathon.data.RetrofitService;

public class RouteApiService {
    private static RouteApi routeApi;

    private static RouteApi create() {
        return RetrofitService.getInstance().create(RouteApi.class);
    }

    public static RouteApi getInstance() {
        if (routeApi == null) routeApi = create();
        return routeApi;
    }
}
