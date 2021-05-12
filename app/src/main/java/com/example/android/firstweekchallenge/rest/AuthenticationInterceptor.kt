package com.example.android.firstweekchallenge.rest

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthenticationInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val url: HttpUrl = chain.request().url()
            .newBuilder()
            .addQueryParameter("api_key", "6acc65d1aca72eed8ef4b848fc655f95")
            .build()

        val request: Request = chain.request().newBuilder().url(url).build()
        return chain.proceed(request)
    }
}
