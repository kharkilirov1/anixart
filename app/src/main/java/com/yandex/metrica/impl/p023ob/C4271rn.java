package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.rn */
/* loaded from: classes2.dex */
public class C4271rn implements InterfaceExecutorC4297sn {

    /* renamed from: a */
    @NonNull
    private final Looper f46317a;

    /* renamed from: b */
    @NonNull
    private final Handler f46318b;

    /* renamed from: c */
    @NonNull
    private final HandlerThreadC4349un f46319c;

    public C4271rn(@NonNull String str) {
        this(m20669a(str));
    }

    @NonNull
    /* renamed from: a */
    public Handler m20670a() {
        return this.f46318b;
    }

    @NonNull
    /* renamed from: b */
    public Looper m20675b() {
        return this.f46317a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4323tn
    /* renamed from: c */
    public boolean mo20676c() {
        return this.f46319c.mo20676c();
    }

    /* renamed from: d */
    public void m20677d() {
        this.f46318b.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f46318b.post(runnable);
    }

    @VisibleForTesting
    public C4271rn(@NonNull HandlerThreadC4349un handlerThreadC4349un) {
        this(handlerThreadC4349un, handlerThreadC4349un.getLooper(), new Handler(handlerThreadC4349un.getLooper()));
    }

    /* renamed from: a */
    public <T> Future<T> m20671a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f46318b.post(futureTask);
        return futureTask;
    }

    @VisibleForTesting
    public C4271rn(@NonNull HandlerThreadC4349un handlerThreadC4349un, @NonNull Looper looper, @NonNull Handler handler) {
        this.f46319c = handlerThreadC4349un;
        this.f46317a = looper;
        this.f46318b = handler;
    }

    /* renamed from: a */
    public void m20673a(@NonNull Runnable runnable, long j2) {
        this.f46318b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j2));
    }

    /* renamed from: a */
    public void m20674a(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
        this.f46318b.postDelayed(runnable, timeUnit.toMillis(j2));
    }

    /* renamed from: a */
    public void m20672a(@NonNull Runnable runnable) {
        this.f46318b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    private static HandlerThreadC4349un m20669a(@NonNull String str) {
        HandlerThreadC4349un m21121b = new ThreadFactoryC4401wn(str).m21121b();
        m21121b.start();
        return m21121b;
    }
}
