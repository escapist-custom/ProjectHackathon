package com.company.projecthackathon.data.routes;


import com.company.projecthackathon.domain.model.Route;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RouteApi {

    @GET("route/{id}")
    Call<Route> getRoute(@Path("id") long id);
}
