package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.ud */
/* loaded from: classes2.dex */
class C4339ud {

    /* renamed from: a */
    @NonNull
    private final C4053jd f46600a;

    /* renamed from: b */
    @NonNull
    private final C3544Pc f46601b;

    /* renamed from: c */
    @NonNull
    private final C3170Ad f46602c;

    /* renamed from: d */
    @NonNull
    private final C4442yc f46603d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4339ud(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4365vd r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.wd r0 = new com.yandex.metrica.impl.ob.wd
            com.yandex.metrica.impl.ob.zc r1 = r10.f46700a
            android.content.Context r1 = r1.f47108a
            r0.<init>(r1)
            com.yandex.metrica.impl.ob.Ad r1 = new com.yandex.metrica.impl.ob.Ad
            com.yandex.metrica.impl.ob.zc r2 = r10.f46700a
            android.content.Context r3 = r2.f47108a
            com.yandex.metrica.impl.ob.Qi r4 = r10.f46701b
            com.yandex.metrica.impl.ob.Uc r5 = r10.f46702c
            com.yandex.metrica.impl.ob.B8 r6 = r10.f46703d
            com.yandex.metrica.impl.ob.A8 r7 = r10.f46704e
            com.yandex.metrica.impl.ob.rn r8 = r2.f47109b
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.yandex.metrica.impl.ob.yc r2 = new com.yandex.metrica.impl.ob.yc
            com.yandex.metrica.impl.ob.Uc r3 = r10.f46702c
            com.yandex.metrica.impl.ob.B8 r4 = r10.f46703d
            com.yandex.metrica.impl.ob.A8 r5 = r10.f46704e
            r2.<init>(r3, r4, r5)
            r9.<init>(r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4339ud.<init>(com.yandex.metrica.impl.ob.vd):void");
    }

    /* renamed from: a */
    public void m20878a() {
        this.f46602c.mo17827a();
    }

    @Nullable
    /* renamed from: b */
    public Location m20881b() {
        return this.f46600a.m20089b();
    }

    /* renamed from: c */
    public void m20882c() {
        this.f46600a.mo18161a();
        this.f46601b.m18740b();
    }

    /* renamed from: d */
    public void m20883d() {
        this.f46600a.m20090c();
        this.f46601b.m18741d();
    }

    /* renamed from: e */
    public void m20884e() {
        this.f46600a.m20091d();
        this.f46601b.m18742e();
    }

    private C4339ud(@NonNull C4365vd c4365vd, @NonNull C4391wd c4391wd, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this(c4365vd, c4391wd, C4079kd.m20235a(c4365vd, c3170Ad, c4442yc, c4391wd.m21095a()), c3170Ad, c4442yc);
    }

    /* renamed from: a */
    public void m20879a(@NonNull C3575Qi c3575Qi) {
        this.f46602c.m17828a(c3575Qi);
        this.f46600a.m20087a(c3575Qi);
    }

    /* renamed from: a */
    public void m20880a(@Nullable C3668Uc c3668Uc) {
        this.f46602c.m17829a(c3668Uc);
        this.f46603d.m21200a(c3668Uc);
        this.f46600a.m20088a(c3668Uc);
        this.f46601b.m18739a(c3668Uc);
    }

    private C4339ud(@NonNull C4365vd c4365vd, @NonNull C4391wd c4391wd, @NonNull C4079kd c4079kd, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this(c4365vd, c4391wd, c4079kd, new C4417xd(c4365vd.f46700a.f47108a, c4365vd.f46702c, c3170Ad, c4442yc, c4365vd.f46701b.m18846d()), c3170Ad, c4442yc);
    }

    private C4339ud(@NonNull C4365vd c4365vd, @NonNull C4391wd c4391wd, @NonNull C4079kd c4079kd, @NonNull C4417xd c4417xd, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this(c4365vd, new C4053jd(c4079kd, c4417xd), new C3544Pc(C3569Qc.m18814a(c4365vd, c3170Ad, c4442yc, c4391wd.m21097c(), c4391wd.m21096b())), c3170Ad, c4442yc);
    }

    @VisibleForTesting
    public C4339ud(@NonNull C4365vd c4365vd, @NonNull C4053jd c4053jd, @NonNull C3544Pc c3544Pc, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this.f46600a = c4053jd;
        this.f46601b = c3544Pc;
        this.f46602c = c3170Ad;
        this.f46603d = c4442yc;
    }
}
