package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.ge */
/* loaded from: classes3.dex */
public abstract class AbstractC5119ge implements InterfaceC5939vs {

    /* renamed from: a */
    public final w61 f50552a;

    /* renamed from: b */
    public final int f50553b;

    /* renamed from: c */
    public final int[] f50554c;

    /* renamed from: d */
    private final C5606pv[] f50555d;

    /* renamed from: e */
    private int f50556e;

    public AbstractC5119ge(w61 w61Var, int[] iArr) {
        int i2 = 0;
        C5220ia.m25476b(iArr.length > 0);
        this.f50552a = (w61) C5220ia.m25469a(w61Var);
        int length = iArr.length;
        this.f50553b = length;
        this.f50555d = new C5606pv[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f50555d[i3] = w61Var.m29393a(iArr[i3]);
        }
        Arrays.sort(this.f50555d, C4891by.f49021q);
        this.f50554c = new int[this.f50553b];
        while (true) {
            int i4 = this.f50553b;
            if (i2 >= i4) {
                long[] jArr = new long[i4];
                return;
            } else {
                this.f50554c[i2] = w61Var.m29392a(this.f50555d[i2]);
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m24844a(C5606pv c5606pv, C5606pv c5606pv2) {
        return c5606pv2.f53816h - c5606pv.f53816h;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: a */
    public void mo24846a(float f2) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: a */
    public /* synthetic */ void mo24847a(boolean z) {
        jq1.m25930a(this, z);
    }

    @Override // com.yandex.mobile.ads.impl.a71
    /* renamed from: b */
    public final int mo22395b(int i2) {
        return this.f50554c[i2];
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: b */
    public void mo24848b() {
    }

    @Override // com.yandex.mobile.ads.impl.a71
    /* renamed from: c */
    public final int mo22396c(int i2) {
        for (int i3 = 0; i3 < this.f50553b; i3++) {
            if (this.f50554c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: c */
    public void mo24849c() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: d */
    public final C5606pv mo24850d() {
        C5606pv[] c5606pvArr = this.f50555d;
        mo29261e();
        return c5606pvArr[0];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5119ge abstractC5119ge = (AbstractC5119ge) obj;
        return this.f50552a == abstractC5119ge.f50552a && Arrays.equals(this.f50554c, abstractC5119ge.f50554c);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: f */
    public /* synthetic */ void mo24851f() {
        jq1.m25931b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: g */
    public /* synthetic */ void mo24852g() {
        jq1.m25932c(this);
    }

    public final int hashCode() {
        if (this.f50556e == 0) {
            this.f50556e = Arrays.hashCode(this.f50554c) + (System.identityHashCode(this.f50552a) * 31);
        }
        return this.f50556e;
    }

    @Override // com.yandex.mobile.ads.impl.a71
    public final int length() {
        return this.f50554c.length;
    }

    @Override // com.yandex.mobile.ads.impl.a71
    /* renamed from: a */
    public final w61 mo22394a() {
        return this.f50552a;
    }

    @Override // com.yandex.mobile.ads.impl.a71
    /* renamed from: a */
    public final C5606pv mo22393a(int i2) {
        return this.f50555d[i2];
    }
}
