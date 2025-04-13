package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mn0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nn0 {

    /* renamed from: a */
    @NotNull
    private static final ConcurrentHashMap<on0, mn0> f53050a = new ConcurrentHashMap<>();

    /* renamed from: b */
    @NotNull
    private static final a81 f53051b = new a81();

    /* renamed from: c */
    public static final /* synthetic */ int f53052c = 0;

    @NotNull
    /* renamed from: a */
    public static mn0 m26932a(int i2, int i3, @Nullable SSLSocketFactory sSLSocketFactory) {
        X509TrustManager m22405a = f53051b.m22405a();
        on0 on0Var = new on0(i2, i3, (sSLSocketFactory == null || m22405a == null) ? null : sSLSocketFactory);
        ConcurrentHashMap<on0, mn0> concurrentHashMap = f53050a;
        if (!concurrentHashMap.containsKey(on0Var)) {
            mn0.C5451a c5451a = new mn0.C5451a();
            long j2 = i2;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mn0.C5451a m26723a = c5451a.m26724a(j2, timeUnit).m26727b(i3, timeUnit).m26723a();
            if (sSLSocketFactory != null && m22405a != null) {
                m26723a = m26723a.m26725a(sSLSocketFactory, m22405a);
            }
            concurrentHashMap.put(on0Var, new mn0(m26723a));
        }
        mn0 mn0Var = concurrentHashMap.get(on0Var);
        if (mn0Var != null) {
            return mn0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
