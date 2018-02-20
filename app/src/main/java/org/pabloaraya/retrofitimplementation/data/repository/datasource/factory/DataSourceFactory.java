package org.pabloaraya.retrofitimplementation.data.repository.datasource.factory;

/**
 * Created by pablo on 2/13/18.
 */

public interface DataSourceFactory<T> {

    T createDataSource();
}
