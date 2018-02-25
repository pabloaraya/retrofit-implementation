package org.pabloaraya.retrofitimplementation.data.net;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;
import org.pabloaraya.retrofitimplementation.data.net.retrofit.RetrofitApiClient;

import java.util.List;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public class FeatureApiClient extends RetrofitApiClient<FeatureApiService> implements FeatureApi {

    @Override
    public List<TrackEntity> getTrackEntityListByTerm(String term) {
         return createService().getTrackEntityListByTerm(term);
    }

    @Override
    protected String getBaseURL() {
        return "http://pabloaraya.org/api/v1/feature";
    }

    @Override
    protected Class<FeatureApiService> getApiService() {
        return FeatureApiService.class;
    }

    @Override
    protected int getConnectTimeout() {
        return 30;
    }
}
