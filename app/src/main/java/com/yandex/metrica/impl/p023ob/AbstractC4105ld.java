package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ld */
/* loaded from: classes2.dex */
public abstract class AbstractC4105ld<T> {

    /* renamed from: e */
    public static final long f45878e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    @NonNull
    public final Context f45879a;

    /* renamed from: b */
    @NonNull
    public final InterfaceC3976ge f45880b;

    /* renamed from: c */
    @NonNull
    public final LocationListener f45881c;

    /* renamed from: d */
    @NonNull
    public final Looper f45882d;

    public AbstractC4105ld(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull InterfaceC3976ge interfaceC3976ge, @NonNull Looper looper) {
        this.f45879a = context;
        this.f45881c = locationListener;
        this.f45880b = interfaceC3976ge;
        this.f45882d = looper;
    }

    /* renamed from: a */
    public abstract void mo17898a();

    /* renamed from: a */
    public abstract boolean mo17899a(@NonNull T t);

    /* renamed from: b */
    public abstract void mo17900b();
}
