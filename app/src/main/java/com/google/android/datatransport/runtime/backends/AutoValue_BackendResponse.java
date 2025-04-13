package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f9179a;

    /* renamed from: b */
    public final long f9180b;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j2) {
        this.f9179a = status;
        this.f9180b = j2;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* renamed from: b */
    public long mo5529b() {
        return this.f9180b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* renamed from: c */
    public BackendResponse.Status mo5530c() {
        return this.f9179a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f9179a.equals(backendResponse.mo5530c()) && this.f9180b == backendResponse.mo5529b();
    }

    public int hashCode() {
        int hashCode = (this.f9179a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f9180b;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("BackendResponse{status=");
        m24u.append(this.f9179a);
        m24u.append(", nextRequestWaitMillis=");
        return C0000a.m19p(m24u, this.f9180b, "}");
    }
}
