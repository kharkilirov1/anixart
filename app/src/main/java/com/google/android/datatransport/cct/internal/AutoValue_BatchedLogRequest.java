package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* renamed from: a */
    public final List<LogRequest> f9036a;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f9036a = list;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @NonNull
    @Encodable.Field
    /* renamed from: b */
    public List<LogRequest> mo5438b() {
        return this.f9036a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f9036a.equals(((BatchedLogRequest) obj).mo5438b());
        }
        return false;
    }

    public int hashCode() {
        return this.f9036a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("BatchedLogRequest{logRequests=");
        m24u.append(this.f9036a);
        m24u.append("}");
        return m24u.toString();
    }
}
