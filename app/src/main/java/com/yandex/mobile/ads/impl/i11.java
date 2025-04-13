package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class i11 extends d11<a51, b51, y41> implements x41 {
    public i11() {
        super(new a51[2], new b51[2]);
        m23789f();
    }

    /* renamed from: a */
    public abstract w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41;

    @Override // com.yandex.mobile.ads.impl.x41
    /* renamed from: a */
    public final void mo22817a(long j2) {
    }

    @Override // com.yandex.mobile.ads.impl.d11
    /* renamed from: c */
    public final a51 mo23787c() {
        return new a51();
    }

    @Override // com.yandex.mobile.ads.impl.d11
    /* renamed from: d */
    public final b51 mo23788d() {
        return new h11(this);
    }

    @Override // com.yandex.mobile.ads.impl.d11
    @Nullable
    /* renamed from: a */
    public final y41 mo23785a(C5752sm c5752sm, AbstractC5809tm abstractC5809tm, boolean z) {
        a51 a51Var = (a51) c5752sm;
        b51 b51Var = (b51) abstractC5809tm;
        try {
            ByteBuffer byteBuffer = a51Var.f54757c;
            Objects.requireNonNull(byteBuffer);
            b51Var.m22725a(a51Var.f54759e, mo23247a(byteBuffer.array(), byteBuffer.limit(), z), a51Var.f48313i);
            b51Var.m26633c();
            return null;
        } catch (y41 e2) {
            return e2;
        }
    }
}
