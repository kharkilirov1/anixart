package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Qc */
/* loaded from: classes2.dex */
class C3569Qc {

    /* renamed from: a */
    @NonNull
    public final C4468zc f43699a;

    /* renamed from: b */
    @NonNull
    public final C4450yk f43700b;

    /* renamed from: c */
    @NonNull
    public final C3170Ad f43701c;

    /* renamed from: d */
    @NonNull
    public final C4442yc f43702d;

    /* renamed from: e */
    @Nullable
    public final C3668Uc f43703e;

    @VisibleForTesting
    public C3569Qc(@NonNull C4468zc c4468zc, @Nullable C3668Uc c3668Uc, @NonNull C3835b3 c3835b3, @NonNull C4450yk c4450yk, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this.f43699a = c4468zc;
        this.f43700b = c4450yk;
        this.f43701c = c3170Ad;
        this.f43702d = c4442yc;
        this.f43703e = c3668Uc;
    }

    /* renamed from: a */
    public static C3569Qc m18814a(@NonNull C4365vd c4365vd, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc, @NonNull C3835b3 c3835b3, @NonNull C4450yk c4450yk) {
        return new C3569Qc(c4365vd.f46700a, c4365vd.f46702c, c3835b3, c4450yk, c3170Ad, c4442yc);
    }
}
