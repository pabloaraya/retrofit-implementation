package org.pabloaraya.retrofitimplementation.data.repository;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;

import java.util.List;

/**
 * Created by pablo on 2/13/18.
 */

public interface Repository {

    List<TrackEntity> getTrackEntityListByTerm(String term);
}
