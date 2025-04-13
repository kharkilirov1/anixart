package com.p017vk.api.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: VKScheduler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKScheduler;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKScheduler {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f30653a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(VKScheduler.class), "handler", "getHandler()Landroid/os/Handler;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(VKScheduler.class), "networkExecutor", "getNetworkExecutor()Ljava/util/concurrent/ExecutorService;"))};

    /* renamed from: e */
    public static final VKScheduler f30657e = new VKScheduler();

    /* renamed from: b */
    public static final AtomicInteger f30654b = new AtomicInteger();

    /* renamed from: c */
    public static final Lazy f30655c = LazyKt.m31881b(new Function0<Handler>() { // from class: com.vk.api.sdk.VKScheduler$handler$2
        @Override // kotlin.jvm.functions.Function0
        public Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: d */
    @NotNull
    public static final Lazy f30656d = LazyKt.m31881b(new Function0<ExecutorService>() { // from class: com.vk.api.sdk.VKScheduler$networkExecutor$2
        @Override // kotlin.jvm.functions.Function0
        public ExecutorService invoke() {
            return Executors.newFixedThreadPool(32, new ThreadFactory() { // from class: com.vk.api.sdk.VKScheduler$networkExecutor$2.1
                @Override // java.util.concurrent.ThreadFactory
                @NotNull
                public final Thread newThread(Runnable runnable) {
                    StringBuilder m24u = C0000a.m24u("vk-api-network-thread-");
                    VKScheduler vKScheduler = VKScheduler.f30657e;
                    m24u.append(VKScheduler.f30654b.getAndIncrement());
                    return new Thread(runnable, m24u.toString());
                }
            });
        }
    });

    /* renamed from: a */
    public static void m16498a(Runnable runnable, long j2, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if (Intrinsics.m32174c(Looper.myLooper(), Looper.getMainLooper()) && j2 == 0) {
            runnable.run();
            return;
        }
        Objects.requireNonNull(f30657e);
        Lazy lazy = f30655c;
        KProperty kProperty = f30653a[0];
        ((Handler) lazy.getValue()).postDelayed(runnable, j2);
    }
}
