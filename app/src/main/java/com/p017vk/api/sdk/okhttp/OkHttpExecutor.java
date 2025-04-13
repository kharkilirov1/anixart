package com.p017vk.api.sdk.okhttp;

import android.content.Context;
import android.os.Looper;
import androidx.collection.LongSparseArray;
import com.p017vk.api.sdk.VKOkHttpProvider;
import com.p017vk.api.sdk.exceptions.VKLargeEntityException;
import com.p017vk.api.sdk.exceptions.VKNetworkIOException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OkHttpExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/OkHttpExecutor;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class OkHttpExecutor {

    /* renamed from: j */
    public static final /* synthetic */ KProperty[] f30719j = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(OkHttpExecutor.class), "okHttpProvider", "getOkHttpProvider()Lcom/vk/api/sdk/VKOkHttpProvider;"))};

    /* renamed from: b */
    @NotNull
    public final Context f30721b;

    /* renamed from: e */
    @NotNull
    public final String f30724e;

    /* renamed from: f */
    @NotNull
    public volatile String f30725f;

    /* renamed from: g */
    @Nullable
    public volatile String f30726g;

    /* renamed from: i */
    @NotNull
    public final OkHttpExecutorConfig f30728i;

    /* renamed from: a */
    public final int f30720a = 500;

    /* renamed from: c */
    public final Object f30722c = new Object();

    /* renamed from: d */
    public final Lazy f30723d = LazyKt.m31881b(new Function0<VKOkHttpProvider>() { // from class: com.vk.api.sdk.okhttp.OkHttpExecutor$okHttpProvider$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public VKOkHttpProvider invoke() {
            if (Intrinsics.m32174c(Looper.getMainLooper(), Looper.myLooper())) {
                throw new IllegalStateException("UI thread");
            }
            OkHttpExecutor okHttpExecutor = OkHttpExecutor.this;
            okHttpExecutor.f30728i.f30731a.f30618f.mo16497b(new OkHttpExecutor$updateClient$1(okHttpExecutor));
            return OkHttpExecutor.this.f30728i.f30731a.f30618f;
        }
    });

    /* renamed from: h */
    public final LongSparseArray<OkHttpClient> f30727h = new LongSparseArray<>(10);

    /* compiled from: OkHttpExecutor.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/OkHttpExecutor$Companion;", "", "", "MIME_APPLICATION", "Ljava/lang/String;", "UTF_8", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public OkHttpExecutor(@NotNull OkHttpExecutorConfig okHttpExecutorConfig) {
        this.f30728i = okHttpExecutorConfig;
        this.f30721b = okHttpExecutorConfig.f30731a.f30613a;
        this.f30724e = okHttpExecutorConfig.m16521b();
        this.f30725f = okHttpExecutorConfig.m16520a();
        this.f30726g = okHttpExecutorConfig.f30731a.f30623k.getValue();
    }

    /* renamed from: a */
    public final OkHttpClient m16515a(long j2) {
        Lazy lazy = this.f30723d;
        KProperty kProperty = f30719j[0];
        OkHttpClient.Builder newBuilder = ((VKOkHttpProvider) lazy.getValue()).mo16496a().newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient client = newBuilder.readTimeout(j2, timeUnit).connectTimeout(j2, timeUnit).build();
        LongSparseArray<OkHttpClient> set = this.f30727h;
        Intrinsics.m32175d(client, "client");
        Intrinsics.m32180i(set, "$this$set");
        set.m1098m(j2, client);
        return client;
    }

    @NotNull
    /* renamed from: b */
    public final Response m16516b(@NotNull Request request, long j2) throws InterruptedException, IOException {
        OkHttpClient m1095i;
        synchronized (this.f30722c) {
            Lazy lazy = this.f30723d;
            KProperty kProperty = f30719j[0];
            OkHttpClient mo16496a = ((VKOkHttpProvider) lazy.getValue()).mo16496a();
            long j3 = this.f30728i.f30731a.f30619g;
            OkHttpClient m1095i2 = this.f30727h.m1095i(j3, null);
            if (m1095i2 == null) {
                m1095i2 = m16515a(j3);
            }
            if (!m16517c(mo16496a, m1095i2)) {
                this.f30727h.m1090c();
            }
            long j4 = j2 + this.f30720a;
            m1095i = this.f30727h.m1095i(j4, null);
            if (m1095i == null) {
                m1095i = m16515a(j4);
            }
        }
        Response execute = m1095i.newCall(request).execute();
        Intrinsics.m32175d(execute, "clientWithTimeOut(timeou…ewCall(request).execute()");
        return execute;
    }

    /* renamed from: c */
    public final boolean m16517c(OkHttpClient okHttpClient, OkHttpClient okHttpClient2) {
        return okHttpClient.connectTimeoutMillis() == okHttpClient2.connectTimeoutMillis() && okHttpClient.readTimeoutMillis() == okHttpClient2.readTimeoutMillis() && okHttpClient.writeTimeoutMillis() == okHttpClient2.writeTimeoutMillis() && okHttpClient.pingIntervalMillis() == okHttpClient2.pingIntervalMillis() && Intrinsics.m32174c(okHttpClient.proxy(), okHttpClient2.proxy()) && Intrinsics.m32174c(okHttpClient.proxySelector(), okHttpClient2.proxySelector()) && Intrinsics.m32174c(okHttpClient.cookieJar(), okHttpClient2.cookieJar()) && Intrinsics.m32174c(okHttpClient.cache(), okHttpClient2.cache()) && Intrinsics.m32174c(okHttpClient.dns(), okHttpClient2.dns()) && Intrinsics.m32174c(okHttpClient.socketFactory(), okHttpClient2.socketFactory()) && Intrinsics.m32174c(okHttpClient.sslSocketFactory(), okHttpClient2.sslSocketFactory()) && Intrinsics.m32174c(okHttpClient.sslSocketFactory(), okHttpClient2.sslSocketFactory()) && Intrinsics.m32174c(okHttpClient.hostnameVerifier(), okHttpClient2.hostnameVerifier()) && Intrinsics.m32174c(okHttpClient.certificatePinner(), okHttpClient2.certificatePinner()) && Intrinsics.m32174c(okHttpClient.authenticator(), okHttpClient2.authenticator()) && Intrinsics.m32174c(okHttpClient.proxyAuthenticator(), okHttpClient2.proxyAuthenticator()) && Intrinsics.m32174c(okHttpClient.connectionPool(), okHttpClient2.connectionPool()) && okHttpClient.followSslRedirects() == okHttpClient2.followSslRedirects() && okHttpClient.followRedirects() == okHttpClient2.followRedirects() && okHttpClient.retryOnConnectionFailure() == okHttpClient2.retryOnConnectionFailure() && Intrinsics.m32174c(okHttpClient.dispatcher(), okHttpClient2.dispatcher()) && Intrinsics.m32174c(okHttpClient.protocols(), okHttpClient2.protocols()) && Intrinsics.m32174c(okHttpClient.connectionSpecs(), okHttpClient2.connectionSpecs()) && Intrinsics.m32174c(okHttpClient.interceptors(), okHttpClient2.interceptors()) && Intrinsics.m32174c(okHttpClient.networkInterceptors(), okHttpClient2.networkInterceptors());
    }

    @Nullable
    /* renamed from: d */
    public final String m16518d(@NotNull Response response) {
        String string;
        if (response.code() == 413) {
            String message = response.message();
            Intrinsics.m32175d(message, "response.message()");
            throw new VKLargeEntityException(message);
        }
        ResponseBody body = response.body();
        try {
            if (body != null) {
                try {
                    string = body.string();
                } catch (IOException e2) {
                    throw new VKNetworkIOException(e2);
                }
            } else {
                string = null;
            }
            if (body != null) {
            }
            return string;
        } finally {
            body.close();
        }
    }
}
