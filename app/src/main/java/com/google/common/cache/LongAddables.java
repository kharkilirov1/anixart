package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible
/* loaded from: classes.dex */
final class LongAddables {

    /* renamed from: a */
    public static final Supplier<LongAddable> f20756a;

    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        public PureJavaLongAddable() {
        }

        @Override // com.google.common.cache.LongAddable
        /* renamed from: a */
        public void mo11315a(long j2) {
            getAndAdd(j2);
        }

        @Override // com.google.common.cache.LongAddable
        /* renamed from: b */
        public void mo11316b() {
            getAndIncrement();
        }

        public PureJavaLongAddable(C16051 c16051) {
        }
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.cache.LongAddables.1
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.cache.LongAddables.2
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new PureJavaLongAddable(null);
                }
            };
        }
        f20756a = supplier;
    }

    /* renamed from: a */
    public static LongAddable m11317a() {
        return f20756a.get();
    }
}
