package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.xd */
/* loaded from: classes3.dex */
public abstract class AbstractC6022xd implements InterfaceC4978dm {

    /* renamed from: a */
    private final boolean f56455a;

    /* renamed from: b */
    private final ArrayList<v71> f56456b = new ArrayList<>(1);

    /* renamed from: c */
    private int f56457c;

    /* renamed from: d */
    @Nullable
    private C5192hm f56458d;

    public AbstractC6022xd(boolean z) {
        this.f56455a = z;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        if (this.f56456b.contains(v71Var)) {
            return;
        }
        this.f56456b.add(v71Var);
        this.f56457c++;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public /* synthetic */ Map mo22489b() {
        return bo1.m22904a(this);
    }

    /* renamed from: b */
    public final void m29738b(C5192hm c5192hm) {
        for (int i2 = 0; i2 < this.f56457c; i2++) {
            this.f56456b.get(i2).mo25260b();
        }
    }

    /* renamed from: c */
    public final void m29740c(C5192hm c5192hm) {
        this.f56458d = c5192hm;
        for (int i2 = 0; i2 < this.f56457c; i2++) {
            this.f56456b.get(i2).mo25261b(c5192hm, this.f56455a);
        }
    }

    /* renamed from: f */
    public final void m29741f() {
        C5192hm c5192hm = this.f56458d;
        int i2 = s91.f54530a;
        for (int i3 = 0; i3 < this.f56457c; i3++) {
            this.f56456b.get(i3).mo25257a(c5192hm, this.f56455a);
        }
        this.f56458d = null;
    }

    /* renamed from: c */
    public final void m29739c(int i2) {
        C5192hm c5192hm = this.f56458d;
        int i3 = s91.f54530a;
        for (int i4 = 0; i4 < this.f56457c; i4++) {
            this.f56456b.get(i4).mo25258a(c5192hm, this.f56455a, i2);
        }
    }
}
