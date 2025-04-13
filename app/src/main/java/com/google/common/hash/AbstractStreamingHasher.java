package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
/* loaded from: classes.dex */
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* renamed from: a */
    public final ByteBuffer f21751a;

    /* renamed from: b */
    public final int f21752b;

    /* renamed from: c */
    public final int f21753c;

    public AbstractStreamingHasher(int i2) {
        Preconditions.m11178b(i2 % i2 == 0);
        this.f21751a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f21752b = i2;
        this.f21753c = i2;
    }
}
