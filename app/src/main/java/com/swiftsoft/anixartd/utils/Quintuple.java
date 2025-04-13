package com.swiftsoft.anixartd.utils;

import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u00012\u00020\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Quintuple;", "A", "B", "C", "D", "E", "Ljava/io/Serializable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class Quintuple<A, B, C, D, E> implements Serializable {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quintuple)) {
            return false;
        }
        Objects.requireNonNull((Quintuple) obj);
        return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "(null, null, null, null, null)";
    }
}
