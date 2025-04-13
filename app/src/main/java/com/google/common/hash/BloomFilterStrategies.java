package com.google.common.hash;

import com.google.common.hash.BloomFilter;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
    };

    public static final class LockFreeBitArray {
        /* renamed from: a */
        public static long[] m12016a(AtomicLongArray atomicLongArray) {
            throw null;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof LockFreeBitArray)) {
                return false;
            }
            m12016a(null);
            throw null;
        }

        public int hashCode() {
            m12016a(null);
            throw null;
        }
    }

    BloomFilterStrategies(C18681 c18681) {
    }
}
