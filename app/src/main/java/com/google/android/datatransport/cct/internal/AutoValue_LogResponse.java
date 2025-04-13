package com.google.android.datatransport.cct.internal;

import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* renamed from: a */
    public final long f9069a;

    public AutoValue_LogResponse(long j2) {
        this.f9069a = j2;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    /* renamed from: b */
    public long mo5472b() {
        return this.f9069a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f9069a == ((LogResponse) obj).mo5472b();
    }

    public int hashCode() {
        long j2 = this.f9069a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return C0000a.m19p(C0000a.m24u("LogResponse{nextRequestWaitMillis="), this.f9069a, "}");
    }
}
