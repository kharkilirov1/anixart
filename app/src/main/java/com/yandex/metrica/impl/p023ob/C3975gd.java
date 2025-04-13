package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.gd */
/* loaded from: classes2.dex */
class C3975gd {

    /* renamed from: a */
    @Nullable
    private C3668Uc f45201a;

    /* renamed from: b */
    @NonNull
    private AbstractC3884d0 f45202b;

    /* renamed from: c */
    @Nullable
    private Location f45203c = null;

    /* renamed from: d */
    private long f45204d;

    /* renamed from: e */
    @NonNull
    private C3583R2 f45205e;

    /* renamed from: f */
    @NonNull
    private C3170Ad f45206f;

    /* renamed from: g */
    @NonNull
    private C4442yc f45207g;

    public C3975gd(@Nullable C3668Uc c3668Uc, @NonNull AbstractC3884d0 abstractC3884d0, @Nullable Location location, long j2, @NonNull C3583R2 c3583r2, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this.f45201a = c3668Uc;
        this.f45202b = abstractC3884d0;
        this.f45204d = j2;
        this.f45205e = c3583r2;
        this.f45206f = c3170Ad;
        this.f45207g = c4442yc;
    }

    /* renamed from: b */
    private boolean m19961b(@Nullable Location location) {
        C3668Uc c3668Uc;
        if (location != null && (c3668Uc = this.f45201a) != null) {
            if (this.f45203c == null) {
                return true;
            }
            boolean m18937a = this.f45205e.m18937a(this.f45204d, c3668Uc.f44132a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.f45203c) > this.f45201a.f44133b;
            boolean z2 = this.f45203c == null || location.getTime() - this.f45203c.getTime() >= 0;
            if ((m18937a || z) && z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m19962a(@Nullable Location location) {
        if (m19961b(location)) {
            this.f45203c = location;
            this.f45204d = System.currentTimeMillis();
            this.f45202b.m19690a(location);
            this.f45206f.mo17827a();
            this.f45207g.m21199a();
        }
    }

    /* renamed from: a */
    public void m19963a(@Nullable C3668Uc c3668Uc) {
        this.f45201a = c3668Uc;
    }
}
