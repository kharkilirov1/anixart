package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.pd */
/* loaded from: classes2.dex */
public class C4209pd {

    /* renamed from: a */
    @NonNull
    public final C3718Wc.a f46135a;

    /* renamed from: b */
    @Nullable
    private Long f46136b;

    /* renamed from: c */
    private long f46137c;

    /* renamed from: d */
    private long f46138d;

    /* renamed from: e */
    @NonNull
    private Location f46139e;

    /* renamed from: f */
    @NonNull
    private C3456M.b.a f46140f;

    public C4209pd(@NonNull C3718Wc.a aVar, long j2, long j3, @NonNull Location location, @NonNull C3456M.b.a aVar2, @Nullable Long l2) {
        this.f46135a = aVar;
        this.f46136b = l2;
        this.f46137c = j2;
        this.f46138d = j3;
        this.f46139e = location;
        this.f46140f = aVar2;
    }

    @NonNull
    /* renamed from: a */
    public C3456M.b.a m20544a() {
        return this.f46140f;
    }

    @Nullable
    /* renamed from: b */
    public Long m20545b() {
        return this.f46136b;
    }

    @NonNull
    /* renamed from: c */
    public Location m20546c() {
        return this.f46139e;
    }

    /* renamed from: d */
    public long m20547d() {
        return this.f46138d;
    }

    /* renamed from: e */
    public long m20548e() {
        return this.f46137c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LocationWrapper{collectionMode=");
        m24u.append(this.f46135a);
        m24u.append(", mIncrementalId=");
        m24u.append(this.f46136b);
        m24u.append(", mReceiveTimestamp=");
        m24u.append(this.f46137c);
        m24u.append(", mReceiveElapsedRealtime=");
        m24u.append(this.f46138d);
        m24u.append(", mLocation=");
        m24u.append(this.f46139e);
        m24u.append(", mChargeType=");
        m24u.append(this.f46140f);
        m24u.append('}');
        return m24u.toString();
    }
}
