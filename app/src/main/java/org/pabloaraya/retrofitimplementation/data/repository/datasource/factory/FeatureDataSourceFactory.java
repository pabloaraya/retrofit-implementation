package org.pabloaraya.retrofitimplementation.data.repository.datasource.factory;

import org.pabloaraya.retrofitimplementation.data.net.FeatureApiClient;
import org.pabloaraya.retrofitimplementation.data.repository.datasource.DataSource;
import org.pabloaraya.retrofitimplementation.data.repository.datasource.FeatureDataSource;

/**
 * Created by pablo on 2/13/18.
 */

public class FeatureDataSourceFactory implements DataSourceFactory<DataSource> {

    @Override
    public DataSource createDataSource() {
        return new FeatureDataSource(new FeatureApiClient());
    }
}
