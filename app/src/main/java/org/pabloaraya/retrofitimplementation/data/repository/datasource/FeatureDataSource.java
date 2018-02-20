package org.pabloaraya.retrofitimplementation.data.repository.datasource;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;
import org.pabloaraya.retrofitimplementation.data.net.FeatureApi;

import java.util.List;

/**
 * Created by pablo on 2/13/18.
 */

public class FeatureDataSource implements DataSource {

    private FeatureApi featureApi;

    public FeatureDataSource(FeatureApi featureApi){
        this.featureApi = featureApi;
    }

    @Override
    public List<TrackEntity> getTrackEntityListByTerm(String term) {
        return featureApi.getTrackEntityListByTerm(term);
    }
}
