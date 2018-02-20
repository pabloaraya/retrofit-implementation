package org.pabloaraya.retrofitimplementation.data.net;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public interface FeatureApiService {

    @GET("mediaType=music&limit=20")
    List<TrackEntity> getTrackEntityListByTerm(@Query("term") String artist);
}
