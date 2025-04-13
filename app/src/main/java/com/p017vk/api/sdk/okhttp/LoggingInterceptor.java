package com.p017vk.api.sdk.okhttp;

import androidx.collection.ArrayMap;
import com.p017vk.api.sdk.utils.ThreadLocalDelegate;
import com.p017vk.api.sdk.utils.ThreadLocalDelegateImpl;
import com.p017vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.p038ws.RealWebSocket;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoggingInterceptor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/LoggingInterceptor;", "Lokhttp3/Interceptor;", "LogLevelMap", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class LoggingInterceptor implements Interceptor {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f30711d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LoggingInterceptor.class), "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;"))};

    /* renamed from: a */
    public final ThreadLocalDelegate f30712a;

    /* renamed from: b */
    public final boolean f30713b;

    /* renamed from: c */
    public final Logger f30714c;

    /* compiled from: LoggingInterceptor.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/LoggingInterceptor$LogLevelMap;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class LogLevelMap {

        /* renamed from: a */
        @NotNull
        public static final ArrayMap<Logger.LogLevel, HttpLoggingInterceptor.Level> f30715a;

        /* renamed from: b */
        public static final LogLevelMap f30716b = new LogLevelMap();

        static {
            ArrayMap<Logger.LogLevel, HttpLoggingInterceptor.Level> arrayMap = new ArrayMap<>();
            f30715a = arrayMap;
            Logger.LogLevel logLevel = Logger.LogLevel.NONE;
            HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
            arrayMap.put(logLevel, level);
            arrayMap.put(Logger.LogLevel.ERROR, level);
            arrayMap.put(Logger.LogLevel.WARNING, HttpLoggingInterceptor.Level.BASIC);
            arrayMap.put(Logger.LogLevel.DEBUG, HttpLoggingInterceptor.Level.HEADERS);
            arrayMap.put(Logger.LogLevel.VERBOSE, HttpLoggingInterceptor.Level.BODY);
        }
    }

    public LoggingInterceptor(boolean z, @NotNull Logger logger) {
        Intrinsics.m32180i(logger, "logger");
        this.f30713b = z;
        this.f30714c = logger;
        this.f30712a = new ThreadLocalDelegateImpl(new Function0<HttpLoggingInterceptor>() { // from class: com.vk.api.sdk.okhttp.LoggingInterceptor$delegate$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public HttpLoggingInterceptor invoke() {
                return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.vk.api.sdk.okhttp.LoggingInterceptor$delegate$2.1
                    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                    public void log(@NotNull String message) {
                        Intrinsics.m32180i(message, "message");
                        if (LoggingInterceptor.this.f30713b) {
                            message = new Regex("key=[a-z0-9]+").m33873e(new Regex("access_token=[a-z0-9]+").m33873e(message, "access_token=<HIDE>"), "key=<HIDE>");
                        }
                        Logger logger2 = LoggingInterceptor.this.f30714c;
                        logger2.mo16540b(logger2.mo16539a().getValue(), message, null);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final HttpLoggingInterceptor m16514a() {
        ThreadLocalDelegate getValue = this.f30712a;
        KProperty property = f30711d[0];
        Intrinsics.m32180i(getValue, "$this$getValue");
        Intrinsics.m32180i(property, "property");
        return (HttpLoggingInterceptor) getValue.get();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        HttpLoggingInterceptor.Level level;
        Intrinsics.m32180i(chain, "chain");
        RequestBody body = chain.request().body();
        long contentLength = body != null ? body.contentLength() : 0L;
        HttpLoggingInterceptor m16514a = m16514a();
        if (contentLength > RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            level = HttpLoggingInterceptor.Level.BASIC;
        } else {
            LogLevelMap logLevelMap = LogLevelMap.f30716b;
            level = LogLevelMap.f30715a.get(this.f30714c.mo16539a().getValue());
        }
        m16514a.setLevel(level);
        Response intercept = m16514a().intercept(chain);
        Intrinsics.m32175d(intercept, "delegate.intercept(chain)");
        return intercept;
    }
}
