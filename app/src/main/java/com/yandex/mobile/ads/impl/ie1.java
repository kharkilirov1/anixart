package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.exo.offline.C4778c;
import com.yandex.mobile.ads.impl.C5405ln;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ie1 {

    /* renamed from: a */
    @Nullable
    private static volatile C4778c f51284a;

    /* renamed from: b */
    @NotNull
    private static final Object f51285b = new Object();

    /* renamed from: c */
    public static final /* synthetic */ int f51286c = 0;

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.ie1$a */
    public static final class C5226a {
        @NotNull
        /* renamed from: a */
        public static C4778c m25530a(@NotNull Context context, @NotNull w31 databaseProvider, @NotNull InterfaceC5970wf cache, @NotNull C5405ln.a upstreamFactory, @NotNull ExecutorService executor) {
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(databaseProvider, "databaseProvider");
            Intrinsics.m32179h(cache, "cache");
            Intrinsics.m32179h(upstreamFactory, "upstreamFactory");
            Intrinsics.m32179h(executor, "executor");
            return new C4778c(context, databaseProvider, cache, upstreamFactory, executor);
        }
    }

    /* renamed from: a */
    private static C4778c m25528a(Context context) {
        Context appContext = context.getApplicationContext();
        w31 w31Var = new w31(appContext);
        C5709rs m27980a = C5709rs.m27980a();
        Intrinsics.m32178g(m27980a, "getInstance()");
        InterfaceC5970wf m27981a = m27980a.m27981a(appContext);
        Intrinsics.m32178g(m27981a, "cacheProvider.getCache(appContext)");
        ok1 ok1Var = new ok1();
        Intrinsics.m32178g(appContext, "appContext");
        C5405ln.a aVar = new C5405ln.a(appContext, ok1Var.m27090a(appContext));
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Intrinsics.m32178g(executor, "executor");
        return C5226a.m25530a(appContext, w31Var, m27981a, aVar, executor);
    }

    @NotNull
    /* renamed from: b */
    public static C4778c m25529b(@NotNull Context context) {
        C4778c c4778c;
        Intrinsics.m32179h(context, "context");
        C4778c c4778c2 = f51284a;
        if (c4778c2 != null) {
            return c4778c2;
        }
        synchronized (f51285b) {
            C4778c c4778c3 = f51284a;
            if (c4778c3 == null) {
                c4778c = m25528a(context);
                f51284a = c4778c;
            } else {
                c4778c = c4778c3;
            }
        }
        return c4778c;
    }
}
