package com.google.firebase.firestore;

import p000a.C0000a;

/* loaded from: classes2.dex */
public final class TransactionOptions {

    /* renamed from: a */
    public final int f22670a;

    public static final class Builder {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && TransactionOptions.class == obj.getClass() && this.f22670a == ((TransactionOptions) obj).f22670a;
    }

    public int hashCode() {
        return this.f22670a;
    }

    public String toString() {
        return C0000a.m17n(C0000a.m24u("TransactionOptions{maxAttempts="), this.f22670a, '}');
    }
}
