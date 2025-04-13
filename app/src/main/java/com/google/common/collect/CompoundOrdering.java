package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        throw null;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompoundOrdering)) {
            return false;
        }
        Objects.requireNonNull((CompoundOrdering) obj);
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public int hashCode() {
        return Arrays.hashCode((Object[]) null);
    }

    public String toString() {
        String arrays = Arrays.toString((Object[]) null);
        return C0576a.m4115n(C0576a.m4106e(arrays, 19), "Ordering.compound(", arrays, ")");
    }
}
