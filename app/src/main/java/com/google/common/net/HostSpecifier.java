package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class HostSpecifier {
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostSpecifier)) {
            return false;
        }
        Objects.requireNonNull((HostSpecifier) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return null;
    }
}
