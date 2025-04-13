package com.google.firebase.heartbeatinfo;

import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* renamed from: a */
    public final String f23034a;

    /* renamed from: b */
    public final List<String> f23035b;

    public AutoValue_HeartBeatResult(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f23034a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f23035b = list;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    /* renamed from: a */
    public List<String> mo12503a() {
        return this.f23035b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    /* renamed from: b */
    public String mo12504b() {
        return this.f23034a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f23034a.equals(heartBeatResult.mo12504b()) && this.f23035b.equals(heartBeatResult.mo12503a());
    }

    public int hashCode() {
        return ((this.f23034a.hashCode() ^ 1000003) * 1000003) ^ this.f23035b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("HeartBeatResult{userAgent=");
        m24u.append(this.f23034a);
        m24u.append(", usedDates=");
        m24u.append(this.f23035b);
        m24u.append("}");
        return m24u.toString();
    }
}
