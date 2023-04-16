package com.company.projecthackathon.data.routes;

import retrofit2.Call;

import com.company.projecthackathon.domain.model.Route;

public class RouteRepository {

    public static Call<Route> getRoute(long id) {
        return RouteApiService.getInstance().getRoute(id);
    }

}
