package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class HostAndPort implements Serializable {
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        Objects.requireNonNull((HostAndPort) obj);
        return com.google.common.base.Objects.m11173a(null, null);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{null, 0});
    }

    public String toString() {
        throw null;
    }
}
