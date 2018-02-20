package org.pabloaraya.retrofitimplementation.data.repository;

import org.pabloaraya.retrofitimplementation.data.entity.TrackEntity;
import org.pabloaraya.retrofitimplementation.data.repository.datasource.DataSource;
import org.pabloaraya.retrofitimplementation.data.repository.datasource.factory.DataSourceFactory;

import java.util.List;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public class FeatureRepository implements Repository {

    private DataSource dataSource;

    public FeatureRepository(DataSourceFactory<DataSource> dataSourceFactory) {
        dataSource = dataSourceFactory.createDataSource();
    }

    @Override
    public List<TrackEntity> getTrackEntityListByTerm(String term) {
        return dataSource.getTrackEntityListByTerm(term);
    }
}
