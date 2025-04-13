package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible
/* loaded from: classes2.dex */
public final class AtomicLongMap<K> implements Serializable {

    /* renamed from: com.google.common.util.concurrent.AtomicLongMap$1 */
    class C19701 implements Function<AtomicLong, Long> {
        @Override // com.google.common.base.Function
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    public String toString() {
        throw null;
    }
}
