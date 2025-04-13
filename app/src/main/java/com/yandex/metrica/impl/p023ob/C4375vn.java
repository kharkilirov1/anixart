package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.vn */
/* loaded from: classes2.dex */
public class C4375vn extends Thread implements InterfaceC4323tn {

    /* renamed from: a */
    private volatile boolean f46830a;

    public C4375vn() {
        this.f46830a = true;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4323tn
    /* renamed from: c */
    public synchronized boolean mo20676c() {
        return this.f46830a;
    }

    /* renamed from: d */
    public synchronized void m21067d() {
        this.f46830a = false;
        interrupt();
    }

    public C4375vn(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f46830a = true;
    }

    public C4375vn(@NonNull String str) {
        super(str);
        this.f46830a = true;
    }
}
