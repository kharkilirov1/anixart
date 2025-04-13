package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ii */
/* loaded from: classes2.dex */
public class C4032ii {

    /* renamed from: a */
    private long f45349a;

    /* renamed from: b */
    private long f45350b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3529Om f45351c;

    /* renamed from: d */
    @NonNull
    private final C3479Mm f45352d;

    public C4032ii() {
        this(new C3504Nm(), new C3479Mm());
    }

    /* renamed from: a */
    public synchronized double m20061a() {
        return this.f45352d.m18600b(this.f45350b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public synchronized double m20062b() {
        return this.f45352d.m18600b(this.f45349a, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public synchronized void m20063c() {
        this.f45350b = this.f45351c.mo18643a();
    }

    /* renamed from: d */
    public synchronized void m20064d() {
        this.f45349a = this.f45351c.mo18643a();
    }

    /* renamed from: e */
    public synchronized void m20065e() {
        this.f45350b = 0L;
    }

    @VisibleForTesting
    public C4032ii(@NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3479Mm c3479Mm) {
        this.f45351c = interfaceC3529Om;
        this.f45352d = c3479Mm;
    }
}
