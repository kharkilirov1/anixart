package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* renamed from: a */
    public final Iterable<EventInternal> f9175a;

    /* renamed from: b */
    public final byte[] f9176b;

    public static final class Builder extends BackendRequest.Builder {

        /* renamed from: a */
        public Iterable<EventInternal> f9177a;

        /* renamed from: b */
        public byte[] f9178b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        /* renamed from: a */
        public BackendRequest mo5526a() {
            String str = this.f9177a == null ? " events" : "";
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f9177a, this.f9178b, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        /* renamed from: b */
        public BackendRequest.Builder mo5527b(Iterable<EventInternal> iterable) {
            this.f9177a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        /* renamed from: c */
        public BackendRequest.Builder mo5528c(@Nullable byte[] bArr) {
            this.f9178b = bArr;
            return this;
        }
    }

    public AutoValue_BackendRequest(Iterable iterable, byte[] bArr, C09101 c09101) {
        this.f9175a = iterable;
        this.f9176b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    /* renamed from: b */
    public Iterable<EventInternal> mo5524b() {
        return this.f9175a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    @Nullable
    /* renamed from: c */
    public byte[] mo5525c() {
        return this.f9176b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f9175a.equals(backendRequest.mo5524b())) {
            if (Arrays.equals(this.f9176b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f9176b : backendRequest.mo5525c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9175a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9176b);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("BackendRequest{events=");
        m24u.append(this.f9175a);
        m24u.append(", extras=");
        m24u.append(Arrays.toString(this.f9176b));
        m24u.append("}");
        return m24u.toString();
    }
}
