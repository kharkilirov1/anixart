package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class g11 implements wd0 {
    @Override // com.yandex.mobile.ads.impl.wd0
    @Nullable
    /* renamed from: a */
    public final Metadata mo24764a(yd0 yd0Var) {
        ByteBuffer byteBuffer = yd0Var.f54757c;
        Objects.requireNonNull(byteBuffer);
        C5220ia.m25473a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (yd0Var.m26637e()) {
            return null;
        }
        return mo22267a(yd0Var, byteBuffer);
    }

    @Nullable
    /* renamed from: a */
    public abstract Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer);
}
