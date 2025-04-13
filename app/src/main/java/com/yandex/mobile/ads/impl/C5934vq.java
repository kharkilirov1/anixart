package com.yandex.mobile.ads.impl;

import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.vq */
/* loaded from: classes3.dex */
public final class C5934vq extends i11 {

    /* renamed from: m */
    private final C5984wq f55862m;

    public C5934vq(List<byte[]> list) {
        ap0 ap0Var = new ap0(list.get(0));
        this.f55862m = new C5984wq(ap0Var.m22613z(), ap0Var.m22613z());
    }

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) {
        if (z) {
            this.f55862m.m29530d();
        }
        return new C6036xq(this.f55862m.m29529a(i2, bArr));
    }
}
