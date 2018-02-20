package org.pabloaraya.retrofitimplementation.data.repository.datasource;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;

import java.util.List;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public interface DataSource {

    List<TrackEntity> getTrackEntityListByTerm(String term);
}
