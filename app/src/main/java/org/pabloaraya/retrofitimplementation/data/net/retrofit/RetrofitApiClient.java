package org.pabloaraya.retrofitimplementation.data.net.retrofit;

import org.pabloaraya.retrofitimplementation.data.net.interceptor.HeaderInterceptor;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.net.SocketFactory;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pablo Araya on 2/12/18.
 * pablo.araya.romero@gmail.com
 * pabloaraya.org
 */

public abstract class RetrofitApiClient<S> extends BaseApiClient<S, OkHttpClient, HeaderInterceptor> {

    @Override
    protected S createService() {
        return new Retrofit.Builder().baseUrl(getBaseURL())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build()
                .create(getApiService());
    }

    @Override
    protected OkHttpClient getClient() {
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.socketFactory(getSocketFactory());
        okHttpBuilder.addInterceptor(getHeaderInterceptor());
        okHttpBuilder.readTimeout(getReadTimeout(), TimeUnit.SECONDS);
        okHttpBuilder.connectTimeout(getConnectTimeout(), TimeUnit.SECONDS);

        HttpLoggingInterceptor httpLogInterceptor = new HttpLoggingInterceptor();
        httpLogInterceptor.setLevel(getLoggingLevel());
        okHttpBuilder.addInterceptor(httpLogInterceptor);
        return okHttpBuilder.build();
    }

    @Override
    protected HeaderInterceptor getHeaderInterceptor() {
        return new HeaderInterceptor(new HashMap<String, String>());
    }

    @Override
    protected int getReadTimeout() {
        return 60;
    }

    @Override
    protected int getConnectTimeout() {
        return 60;
    }

    protected SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    protected HttpLoggingInterceptor.Level getLoggingLevel() {
        return HttpLoggingInterceptor.Level.BODY;
    }
}
