package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return mo11667a().equals(((RangeSet) obj).mo11667a());
        }
        return false;
    }

    public final int hashCode() {
        return mo11667a().hashCode();
    }

    public final String toString() {
        return mo11667a().toString();
    }
}
