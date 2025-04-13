package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.hi */
/* loaded from: classes2.dex */
class C4006hi {

    /* renamed from: a */
    @NonNull
    private final C3479Mm f45297a;

    /* renamed from: b */
    private final long f45298b;

    /* renamed from: c */
    private long f45299c;

    /* renamed from: d */
    private long f45300d;

    /* renamed from: e */
    private long f45301e;

    @VisibleForTesting
    public C4006hi(@NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3479Mm c3479Mm) {
        this.f45298b = ((C3504Nm) interfaceC3529Om).mo18643a();
        this.f45297a = c3479Mm;
    }

    /* renamed from: a */
    public void m20018a() {
        this.f45299c = this.f45297a.m18600b(this.f45298b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public void m20019b() {
        this.f45300d = this.f45297a.m18600b(this.f45298b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public void m20020c() {
        this.f45301e = this.f45297a.m18600b(this.f45298b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public long m20021d() {
        return this.f45299c;
    }

    /* renamed from: e */
    public long m20022e() {
        return this.f45300d;
    }

    /* renamed from: f */
    public long m20023f() {
        return this.f45301e;
    }
}
