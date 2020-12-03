package com.example.gulftech_androidtask.di

import com.example.gulftech_androidtask.util.Constance.BASE_URL
import com.example.nytimes.data.DataEndPoint
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {

    factory { getInterceptor() }

    single { getEndPoint(get()) }

    single { getOkHttpClient(get()) }

}

fun getInterceptor(): Interceptor {
    return HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)
}

fun getOkHttpClient(interceptor: Interceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .build()
}

fun getEndPoint(okHttpClient: OkHttpClient): DataEndPoint {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(okHttpClient)
        .build()
        .create(DataEndPoint::class.java)
}