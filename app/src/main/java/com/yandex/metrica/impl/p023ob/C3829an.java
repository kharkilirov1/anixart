package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.an */
/* loaded from: classes2.dex */
public class C3829an {

    /* renamed from: a */
    @NonNull
    private final ReentrantLock f44765a;

    /* renamed from: b */
    @NonNull
    private final C3855bn f44766b;

    public C3829an(@NonNull Context context, @NonNull String str) {
        this(new ReentrantLock(), new C3855bn(context, str));
    }

    /* renamed from: a */
    public void m19590a() throws Throwable {
        this.f44765a.lock();
        this.f44766b.m19663a();
    }

    /* renamed from: b */
    public void m19591b() {
        this.f44766b.m19664b();
        this.f44765a.unlock();
    }

    /* renamed from: c */
    public void m19592c() {
        this.f44766b.m19665c();
        this.f44765a.unlock();
    }

    @VisibleForTesting
    public C3829an(@NonNull ReentrantLock reentrantLock, @NonNull C3855bn c3855bn) {
        this.f44765a = reentrantLock;
        this.f44766b = c3855bn;
    }
}
