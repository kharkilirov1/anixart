package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
/* loaded from: classes.dex */
abstract class AbstractByteHasher extends AbstractHasher {

    /* renamed from: a */
    public final ByteBuffer f21750a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
}
