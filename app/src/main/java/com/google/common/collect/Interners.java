package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import java.util.Objects;

@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public final class Interners {

    public static class InternerBuilder {
    }

    public static class InternerFunction<E> implements Function<E, E> {
        @Override // com.google.common.base.Function
        public E apply(E e2) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof InternerFunction)) {
                return false;
            }
            Objects.requireNonNull((InternerFunction) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    @VisibleForTesting
    public static final class InternerImpl<E> implements Interner<E> {
    }
}
