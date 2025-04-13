package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class Stats implements Serializable {
    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        return Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d);
    }

    public int hashCode() {
        Double valueOf = Double.valueOf(0.0d);
        return Arrays.hashCode(new Object[]{0L, valueOf, valueOf, valueOf, valueOf});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11169c("count", 0L);
        return m11166b.toString();
    }
}
