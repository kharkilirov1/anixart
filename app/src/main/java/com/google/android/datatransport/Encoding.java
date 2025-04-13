package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Encoding {

    /* renamed from: a */
    public final String f8950a;

    public Encoding(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.f8950a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.f8950a.equals(((Encoding) obj).f8950a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8950a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return C0000a.m20q(C0000a.m24u("Encoding{name=\""), this.f8950a, "\"}");
    }
}
