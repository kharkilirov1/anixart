package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class Count implements Serializable {
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Count)) {
            return false;
        }
        Objects.requireNonNull((Count) obj);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return Integer.toString(0);
    }
}
