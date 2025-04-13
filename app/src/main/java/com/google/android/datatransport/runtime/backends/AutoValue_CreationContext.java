package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* renamed from: a */
    public final Context f9181a;

    /* renamed from: b */
    public final Clock f9182b;

    /* renamed from: c */
    public final Clock f9183c;

    /* renamed from: d */
    public final String f9184d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f9181a = context;
        Objects.requireNonNull(clock, "Null wallClock");
        this.f9182b = clock;
        Objects.requireNonNull(clock2, "Null monotonicClock");
        this.f9183c = clock2;
        Objects.requireNonNull(str, "Null backendName");
        this.f9184d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    /* renamed from: a */
    public Context mo5531a() {
        return this.f9181a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    /* renamed from: b */
    public String mo5532b() {
        return this.f9184d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    /* renamed from: c */
    public Clock mo5533c() {
        return this.f9183c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    /* renamed from: d */
    public Clock mo5534d() {
        return this.f9182b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f9181a.equals(creationContext.mo5531a()) && this.f9182b.equals(creationContext.mo5534d()) && this.f9183c.equals(creationContext.mo5533c()) && this.f9184d.equals(creationContext.mo5532b());
    }

    public int hashCode() {
        return ((((((this.f9181a.hashCode() ^ 1000003) * 1000003) ^ this.f9182b.hashCode()) * 1000003) ^ this.f9183c.hashCode()) * 1000003) ^ this.f9184d.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("CreationContext{applicationContext=");
        m24u.append(this.f9181a);
        m24u.append(", wallClock=");
        m24u.append(this.f9182b);
        m24u.append(", monotonicClock=");
        m24u.append(this.f9183c);
        m24u.append(", backendName=");
        return C0000a.m20q(m24u, this.f9184d, "}");
    }
}
