package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* renamed from: a */
    public final long f9041a;

    /* renamed from: b */
    public final Integer f9042b;

    /* renamed from: c */
    public final long f9043c;

    /* renamed from: d */
    public final byte[] f9044d;

    /* renamed from: e */
    public final String f9045e;

    /* renamed from: f */
    public final long f9046f;

    /* renamed from: g */
    public final NetworkConnectionInfo f9047g;

    public static final class Builder extends LogEvent.Builder {

        /* renamed from: a */
        public Long f9048a;

        /* renamed from: b */
        public Integer f9049b;

        /* renamed from: c */
        public Long f9050c;

        /* renamed from: d */
        public byte[] f9051d;

        /* renamed from: e */
        public String f9052e;

        /* renamed from: f */
        public Long f9053f;

        /* renamed from: g */
        public NetworkConnectionInfo f9054g;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: a */
        public LogEvent mo5451a() {
            String str = this.f9048a == null ? " eventTimeMs" : "";
            if (this.f9050c == null) {
                str = C0000a.m14k(str, " eventUptimeMs");
            }
            if (this.f9053f == null) {
                str = C0000a.m14k(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.f9048a.longValue(), this.f9049b, this.f9050c.longValue(), this.f9051d, this.f9052e, this.f9053f.longValue(), this.f9054g, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: b */
        public LogEvent.Builder mo5452b(@Nullable Integer num) {
            this.f9049b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: c */
        public LogEvent.Builder mo5453c(long j2) {
            this.f9048a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: d */
        public LogEvent.Builder mo5454d(long j2) {
            this.f9050c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: e */
        public LogEvent.Builder mo5455e(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f9054g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: f */
        public LogEvent.Builder mo5456f(long j2) {
            this.f9053f = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_LogEvent(long j2, Integer num, long j3, byte[] bArr, String str, long j4, NetworkConnectionInfo networkConnectionInfo, C09021 c09021) {
        this.f9041a = j2;
        this.f9042b = num;
        this.f9043c = j3;
        this.f9044d = bArr;
        this.f9045e = str;
        this.f9046f = j4;
        this.f9047g = networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    /* renamed from: a */
    public Integer mo5444a() {
        return this.f9042b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    /* renamed from: b */
    public long mo5445b() {
        return this.f9041a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    /* renamed from: c */
    public long mo5446c() {
        return this.f9043c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    /* renamed from: d */
    public NetworkConnectionInfo mo5447d() {
        return this.f9047g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    /* renamed from: e */
    public byte[] mo5448e() {
        return this.f9044d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f9041a == logEvent.mo5445b() && ((num = this.f9042b) != null ? num.equals(logEvent.mo5444a()) : logEvent.mo5444a() == null) && this.f9043c == logEvent.mo5446c()) {
            if (Arrays.equals(this.f9044d, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f9044d : logEvent.mo5448e()) && ((str = this.f9045e) != null ? str.equals(logEvent.mo5449f()) : logEvent.mo5449f() == null) && this.f9046f == logEvent.mo5450g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f9047g;
                if (networkConnectionInfo == null) {
                    if (logEvent.mo5447d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(logEvent.mo5447d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    /* renamed from: f */
    public String mo5449f() {
        return this.f9045e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    /* renamed from: g */
    public long mo5450g() {
        return this.f9046f;
    }

    public int hashCode() {
        long j2 = this.f9041a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9042b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f9043c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9044d)) * 1000003;
        String str = this.f9045e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f9046f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f9047g;
        return i3 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LogEvent{eventTimeMs=");
        m24u.append(this.f9041a);
        m24u.append(", eventCode=");
        m24u.append(this.f9042b);
        m24u.append(", eventUptimeMs=");
        m24u.append(this.f9043c);
        m24u.append(", sourceExtension=");
        m24u.append(Arrays.toString(this.f9044d));
        m24u.append(", sourceExtensionJsonProto3=");
        m24u.append(this.f9045e);
        m24u.append(", timezoneOffsetSeconds=");
        m24u.append(this.f9046f);
        m24u.append(", networkConnectionInfo=");
        m24u.append(this.f9047g);
        m24u.append("}");
        return m24u.toString();
    }
}
