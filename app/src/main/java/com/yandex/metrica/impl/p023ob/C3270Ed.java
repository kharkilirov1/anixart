package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ed */
/* loaded from: classes2.dex */
public class C3270Ed {

    /* renamed from: a */
    public final long f42806a;

    /* renamed from: b */
    public final boolean f42807b;

    /* renamed from: c */
    @Nullable
    public final List<C3494Nc> f42808c;

    public C3270Ed(long j2, boolean z, @Nullable List<C3494Nc> list) {
        this.f42806a = j2;
        this.f42807b = z;
        this.f42808c = list;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("WakeupConfig{collectionDuration=");
        m24u.append(this.f42806a);
        m24u.append(", aggressiveRelaunch=");
        m24u.append(this.f42807b);
        m24u.append(", collectionIntervalRanges=");
        return C0576a.m4119r(m24u, this.f42808c, '}');
    }
}
