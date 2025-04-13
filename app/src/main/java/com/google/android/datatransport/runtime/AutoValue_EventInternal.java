package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* renamed from: a */
    public final String f9109a;

    /* renamed from: b */
    public final Integer f9110b;

    /* renamed from: c */
    public final EncodedPayload f9111c;

    /* renamed from: d */
    public final long f9112d;

    /* renamed from: e */
    public final long f9113e;

    /* renamed from: f */
    public final Map<String, String> f9114f;

    public static final class Builder extends EventInternal.Builder {

        /* renamed from: a */
        public String f9115a;

        /* renamed from: b */
        public Integer f9116b;

        /* renamed from: c */
        public EncodedPayload f9117c;

        /* renamed from: d */
        public Long f9118d;

        /* renamed from: e */
        public Long f9119e;

        /* renamed from: f */
        public Map<String, String> f9120f;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: b */
        public EventInternal mo5492b() {
            String str = this.f9115a == null ? " transportName" : "";
            if (this.f9117c == null) {
                str = C0000a.m14k(str, " encodedPayload");
            }
            if (this.f9118d == null) {
                str = C0000a.m14k(str, " eventMillis");
            }
            if (this.f9119e == null) {
                str = C0000a.m14k(str, " uptimeMillis");
            }
            if (this.f9120f == null) {
                str = C0000a.m14k(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.f9115a, this.f9116b, this.f9117c, this.f9118d.longValue(), this.f9119e.longValue(), this.f9120f, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: c */
        public Map<String, String> mo5493c() {
            Map<String, String> map = this.f9120f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: d */
        public EventInternal.Builder mo5494d(Integer num) {
            this.f9116b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: e */
        public EventInternal.Builder mo5495e(EncodedPayload encodedPayload) {
            Objects.requireNonNull(encodedPayload, "Null encodedPayload");
            this.f9117c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: f */
        public EventInternal.Builder mo5496f(long j2) {
            this.f9118d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: g */
        public EventInternal.Builder mo5497g(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f9115a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: h */
        public EventInternal.Builder mo5498h(long j2) {
            this.f9119e = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j2, long j3, Map map, C09051 c09051) {
        this.f9109a = str;
        this.f9110b = num;
        this.f9111c = encodedPayload;
        this.f9112d = j2;
        this.f9113e = j3;
        this.f9114f = map;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: c */
    public Map<String, String> mo5486c() {
        return this.f9114f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    /* renamed from: d */
    public Integer mo5487d() {
        return this.f9110b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: e */
    public EncodedPayload mo5488e() {
        return this.f9111c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        return this.f9109a.equals(eventInternal.mo5490h()) && ((num = this.f9110b) != null ? num.equals(eventInternal.mo5487d()) : eventInternal.mo5487d() == null) && this.f9111c.equals(eventInternal.mo5488e()) && this.f9112d == eventInternal.mo5489f() && this.f9113e == eventInternal.mo5491i() && this.f9114f.equals(eventInternal.mo5486c());
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: f */
    public long mo5489f() {
        return this.f9112d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: h */
    public String mo5490h() {
        return this.f9109a;
    }

    public int hashCode() {
        int hashCode = (this.f9109a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f9110b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f9111c.hashCode()) * 1000003;
        long j2 = this.f9112d;
        int i2 = (hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f9113e;
        return ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f9114f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: i */
    public long mo5491i() {
        return this.f9113e;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("EventInternal{transportName=");
        m24u.append(this.f9109a);
        m24u.append(", code=");
        m24u.append(this.f9110b);
        m24u.append(", encodedPayload=");
        m24u.append(this.f9111c);
        m24u.append(", eventMillis=");
        m24u.append(this.f9112d);
        m24u.append(", uptimeMillis=");
        m24u.append(this.f9113e);
        m24u.append(", autoMetadata=");
        m24u.append(this.f9114f);
        m24u.append("}");
        return m24u.toString();
    }
}
