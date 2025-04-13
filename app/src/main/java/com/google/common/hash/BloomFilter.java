package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {

    public static class SerialForm<T> implements Serializable {
    }

    public interface Strategy extends Serializable {
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(T t) {
        throw null;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        Objects.requireNonNull((BloomFilter) obj);
        throw null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{0, null, null, null});
    }
}
