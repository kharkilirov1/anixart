package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* renamed from: a */
    public final long f9055a;

    /* renamed from: b */
    public final long f9056b;

    /* renamed from: c */
    public final ClientInfo f9057c;

    /* renamed from: d */
    public final Integer f9058d;

    /* renamed from: e */
    public final String f9059e;

    /* renamed from: f */
    public final List<LogEvent> f9060f;

    /* renamed from: g */
    public final QosTier f9061g;

    public static final class Builder extends LogRequest.Builder {

        /* renamed from: a */
        public Long f9062a;

        /* renamed from: b */
        public Long f9063b;

        /* renamed from: c */
        public ClientInfo f9064c;

        /* renamed from: d */
        public Integer f9065d;

        /* renamed from: e */
        public String f9066e;

        /* renamed from: f */
        public List<LogEvent> f9067f;

        /* renamed from: g */
        public QosTier f9068g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: a */
        public LogRequest mo5464a() {
            String str = this.f9062a == null ? " requestTimeMs" : "";
            if (this.f9063b == null) {
                str = C0000a.m14k(str, " requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.f9062a.longValue(), this.f9063b.longValue(), this.f9064c, this.f9065d, this.f9066e, this.f9067f, this.f9068g, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: b */
        public LogRequest.Builder mo5465b(@Nullable ClientInfo clientInfo) {
            this.f9064c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: c */
        public LogRequest.Builder mo5466c(@Nullable List<LogEvent> list) {
            this.f9067f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: d */
        public LogRequest.Builder mo5467d(@Nullable Integer num) {
            this.f9065d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: e */
        public LogRequest.Builder mo5468e(@Nullable String str) {
            this.f9066e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: f */
        public LogRequest.Builder mo5469f(@Nullable QosTier qosTier) {
            this.f9068g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: g */
        public LogRequest.Builder mo5470g(long j2) {
            this.f9062a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: h */
        public LogRequest.Builder mo5471h(long j2) {
            this.f9063b = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_LogRequest(long j2, long j3, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, C09031 c09031) {
        this.f9055a = j2;
        this.f9056b = j3;
        this.f9057c = clientInfo;
        this.f9058d = num;
        this.f9059e = str;
        this.f9060f = list;
        this.f9061g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    /* renamed from: b */
    public ClientInfo mo5457b() {
        return this.f9057c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    @Encodable.Field
    /* renamed from: c */
    public List<LogEvent> mo5458c() {
        return this.f9060f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    /* renamed from: d */
    public Integer mo5459d() {
        return this.f9058d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    /* renamed from: e */
    public String mo5460e() {
        return this.f9059e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f9055a == logRequest.mo5462g() && this.f9056b == logRequest.mo5463h() && ((clientInfo = this.f9057c) != null ? clientInfo.equals(logRequest.mo5457b()) : logRequest.mo5457b() == null) && ((num = this.f9058d) != null ? num.equals(logRequest.mo5459d()) : logRequest.mo5459d() == null) && ((str = this.f9059e) != null ? str.equals(logRequest.mo5460e()) : logRequest.mo5460e() == null) && ((list = this.f9060f) != null ? list.equals(logRequest.mo5458c()) : logRequest.mo5458c() == null)) {
            QosTier qosTier = this.f9061g;
            if (qosTier == null) {
                if (logRequest.mo5461f() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.mo5461f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    /* renamed from: f */
    public QosTier mo5461f() {
        return this.f9061g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    /* renamed from: g */
    public long mo5462g() {
        return this.f9055a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    /* renamed from: h */
    public long mo5463h() {
        return this.f9056b;
    }

    public int hashCode() {
        long j2 = this.f9055a;
        long j3 = this.f9056b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ClientInfo clientInfo = this.f9057c;
        int hashCode = (i2 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f9058d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f9059e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<LogEvent> list = this.f9060f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f9061g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LogRequest{requestTimeMs=");
        m24u.append(this.f9055a);
        m24u.append(", requestUptimeMs=");
        m24u.append(this.f9056b);
        m24u.append(", clientInfo=");
        m24u.append(this.f9057c);
        m24u.append(", logSource=");
        m24u.append(this.f9058d);
        m24u.append(", logSourceName=");
        m24u.append(this.f9059e);
        m24u.append(", logEvents=");
        m24u.append(this.f9060f);
        m24u.append(", qosTier=");
        m24u.append(this.f9061g);
        m24u.append("}");
        return m24u.toString();
    }
}
