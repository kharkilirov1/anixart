package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* renamed from: a */
    public final String f9131a;

    /* renamed from: b */
    public final byte[] f9132b;

    /* renamed from: c */
    public final Priority f9133c;

    public static final class Builder extends TransportContext.Builder {

        /* renamed from: a */
        public String f9134a;

        /* renamed from: b */
        public byte[] f9135b;

        /* renamed from: c */
        public Priority f9136c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        /* renamed from: a */
        public TransportContext mo5507a() {
            String str = this.f9134a == null ? " backendName" : "";
            if (this.f9136c == null) {
                str = C0000a.m14k(str, " priority");
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.f9134a, this.f9135b, this.f9136c, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        /* renamed from: b */
        public TransportContext.Builder mo5508b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f9134a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        /* renamed from: c */
        public TransportContext.Builder mo5509c(@Nullable byte[] bArr) {
            this.f9135b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        /* renamed from: d */
        public TransportContext.Builder mo5510d(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f9136c = priority;
            return this;
        }
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority, C09071 c09071) {
        this.f9131a = str;
        this.f9132b = bArr;
        this.f9133c = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    /* renamed from: b */
    public String mo5504b() {
        return this.f9131a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    /* renamed from: c */
    public byte[] mo5505c() {
        return this.f9132b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo
    /* renamed from: d */
    public Priority mo5506d() {
        return this.f9133c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f9131a.equals(transportContext.mo5504b())) {
            if (Arrays.equals(this.f9132b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f9132b : transportContext.mo5505c()) && this.f9133c.equals(transportContext.mo5506d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9131a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9132b)) * 1000003) ^ this.f9133c.hashCode();
    }
}
