package org.pabloaraya.retrofitimplementation.data.net.retrofit;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public abstract class BaseApiClient<S, C, I> {
    protected abstract S createService();
    protected abstract String getBaseURL();
    protected abstract Class<S> getApiService();
    protected abstract C getClient();
    protected abstract I getHeaderInterceptor();
    protected abstract int getReadTimeout();
    protected abstract int getConnectTimeout();
}
