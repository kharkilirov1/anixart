package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.InstallationTokenResult;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* renamed from: a */
    public final String f23120a;

    /* renamed from: b */
    public final long f23121b;

    /* renamed from: c */
    public final long f23122c;

    public static final class Builder extends InstallationTokenResult.Builder {

        /* renamed from: a */
        public String f23123a;

        /* renamed from: b */
        public Long f23124b;

        /* renamed from: c */
        public Long f23125c;
    }

    public AutoValue_InstallationTokenResult(String str, long j2, long j3, C21421 c21421) {
        this.f23120a = str;
        this.f23121b = j2;
        this.f23122c = j3;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    /* renamed from: a */
    public String mo12554a() {
        return this.f23120a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    /* renamed from: b */
    public long mo12555b() {
        return this.f23122c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    /* renamed from: c */
    public long mo12556c() {
        return this.f23121b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f23120a.equals(installationTokenResult.mo12554a()) && this.f23121b == installationTokenResult.mo12556c() && this.f23122c == installationTokenResult.mo12555b();
    }

    public int hashCode() {
        int hashCode = (this.f23120a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f23121b;
        long j3 = this.f23122c;
        return ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("InstallationTokenResult{token=");
        m24u.append(this.f23120a);
        m24u.append(", tokenExpirationTimestamp=");
        m24u.append(this.f23121b);
        m24u.append(", tokenCreationTimestamp=");
        return C0000a.m19p(m24u, this.f23122c, "}");
    }
}
