package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.R2 */
/* loaded from: classes2.dex */
public class C3583R2 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3529Om f43796a;

    public C3583R2() {
        this(new C3504Nm());
    }

    /* renamed from: a */
    private boolean m18936a(long j2, long j3, long j4) {
        return j2 < j3 || j2 - j3 >= j4;
    }

    /* renamed from: a */
    public boolean m18937a(long j2, long j3, @NonNull String str) {
        return m18936a(this.f43796a.mo18643a(), j2, j3);
    }

    /* renamed from: b */
    public boolean m18938b(long j2, long j3, @NonNull String str) {
        return m18936a(this.f43796a.mo18644b(), j2, j3);
    }

    @VisibleForTesting
    public C3583R2(@NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f43796a = interfaceC3529Om;
    }
}
