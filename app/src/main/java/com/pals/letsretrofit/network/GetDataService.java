package com.pals.letsretrofit.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import com.pals.letsretrofit.model.RetroPhoto;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

}
