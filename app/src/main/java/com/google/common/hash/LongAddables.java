package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class LongAddables {

    /* renamed from: a */
    public static final Supplier<LongAddable> f21792a;

    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        public PureJavaLongAddable() {
        }

        public PureJavaLongAddable(C18791 c18791) {
        }
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.hash.LongAddables.1
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.hash.LongAddables.2
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new PureJavaLongAddable(null);
                }
            };
        }
        f21792a = supplier;
    }
}
