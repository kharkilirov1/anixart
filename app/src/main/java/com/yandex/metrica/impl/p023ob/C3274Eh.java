package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Eh */
/* loaded from: classes2.dex */
public class C3274Eh {

    /* renamed from: a */
    @NonNull
    public final List<C3349Hh> f42810a;

    /* renamed from: b */
    @NonNull
    public final String f42811b;

    /* renamed from: c */
    public final long f42812c;

    /* renamed from: d */
    public final boolean f42813d;

    /* renamed from: e */
    public final boolean f42814e;

    public C3274Eh(@NonNull List<C3349Hh> list, @NonNull String str, long j2, boolean z, boolean z2) {
        this.f42810a = Collections.unmodifiableList(list);
        this.f42811b = str;
        this.f42812c = j2;
        this.f42813d = z;
        this.f42814e = z2;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SdkFingerprintingState{sdkItemList=");
        m24u.append(this.f42810a);
        m24u.append(", etag='");
        C0576a.m4100A(m24u, this.f42811b, '\'', ", lastAttemptTime=");
        m24u.append(this.f42812c);
        m24u.append(", hasFirstCollectionOccurred=");
        m24u.append(this.f42813d);
        m24u.append(", shouldRetry=");
        m24u.append(this.f42814e);
        m24u.append('}');
        return m24u.toString();
    }
}
