package org.pabloaraya.retrofitimplementation.data.net;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;

import java.util.List;

/**
 * Created by pablo on 2/13/18.
 */

public interface FeatureApi {

    List<TrackEntity> getTrackEntityListByTerm(String term);
}
