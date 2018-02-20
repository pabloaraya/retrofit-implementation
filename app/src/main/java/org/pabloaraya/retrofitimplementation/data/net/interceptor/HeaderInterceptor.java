package org.pabloaraya.retrofitimplementation.data.net.interceptor;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.util.Map;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by pablo on 2/13/18.
 */

public class HeaderInterceptor implements Interceptor {

    private Map<String, String> mapHeaders;

    public HeaderInterceptor(Map<String, String> mapHeaders) {
        this.mapHeaders = mapHeaders;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        Request request = chain.request();
        Headers.Builder builder = request.headers().newBuilder();

        for (Map.Entry<String, String> header : mapHeaders.entrySet()) {
            builder.add(header.getKey(), header.getValue());
        }

        request.newBuilder().headers(builder.build());
        return chain.proceed(request);
    }
}
