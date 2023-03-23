package global.cloud.storage.utils.newfiles;

import android.content.Context;


import java.util.concurrent.TimeUnit;

import global.cloud.storage.BuildConfig;
import global.cloud.storage.ui.data.Constants;
import okhttp3.OkHttpClient;
import global.cloud.storage.network.interceptors.AuthInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = BuildConfig.API_BASE_PATH;
    private static Retrofit retrofit = null;

    public static Retrofit getClient(Context context) {
        AuthInterceptor auth = new AuthInterceptor();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(Constants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Constants.READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(Constants.WRITE_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(auth)
                .build();

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}