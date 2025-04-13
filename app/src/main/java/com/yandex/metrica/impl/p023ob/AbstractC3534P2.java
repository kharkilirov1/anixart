package com.yandex.metrica.impl.p023ob;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.P2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3534P2<T> extends AbstractC3557Q0<T> {
    public AbstractC3534P2(long j2, long j3) {
        super(j2, j3);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    @Nullable
    /* renamed from: a */
    public synchronized T mo18725a() {
        return (T) super.mo18725a();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    /* renamed from: b */
    public synchronized void mo18726b(@NonNull T t) {
        super.mo18726b((AbstractC3534P2<T>) t);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    @AnyThread
    /* renamed from: b */
    public synchronized boolean mo18727b() {
        boolean z;
        if (!this.f43657a.m18650b()) {
            z = this.f43657a.m18652d();
        }
        return z;
    }
}
