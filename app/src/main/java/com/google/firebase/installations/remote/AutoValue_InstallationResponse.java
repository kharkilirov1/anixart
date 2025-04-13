package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* renamed from: a */
    public final String f23188a;

    /* renamed from: b */
    public final String f23189b;

    /* renamed from: c */
    public final String f23190c;

    /* renamed from: d */
    public final TokenResult f23191d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f23192e;

    public static final class Builder extends InstallationResponse.Builder {

        /* renamed from: a */
        public String f23193a;

        /* renamed from: b */
        public String f23194b;

        /* renamed from: c */
        public String f23195c;

        /* renamed from: d */
        public TokenResult f23196d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f23197e;

        /* renamed from: a */
        public InstallationResponse m12611a() {
            return new AutoValue_InstallationResponse(this.f23193a, this.f23194b, this.f23195c, this.f23196d, this.f23197e, null);
        }
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, C21501 c21501) {
        this.f23188a = str;
        this.f23189b = str2;
        this.f23190c = str3;
        this.f23191d = tokenResult;
        this.f23192e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    /* renamed from: a */
    public TokenResult mo12606a() {
        return this.f23191d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    /* renamed from: b */
    public String mo12607b() {
        return this.f23189b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    /* renamed from: c */
    public String mo12608c() {
        return this.f23190c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    /* renamed from: d */
    public InstallationResponse.ResponseCode mo12609d() {
        return this.f23192e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    /* renamed from: e */
    public String mo12610e() {
        return this.f23188a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f23188a;
        if (str != null ? str.equals(installationResponse.mo12610e()) : installationResponse.mo12610e() == null) {
            String str2 = this.f23189b;
            if (str2 != null ? str2.equals(installationResponse.mo12607b()) : installationResponse.mo12607b() == null) {
                String str3 = this.f23190c;
                if (str3 != null ? str3.equals(installationResponse.mo12608c()) : installationResponse.mo12608c() == null) {
                    TokenResult tokenResult = this.f23191d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo12606a()) : installationResponse.mo12606a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f23192e;
                        if (responseCode == null) {
                            if (installationResponse.mo12609d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo12609d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23188a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f23189b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23190c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f23191d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f23192e;
        return hashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("InstallationResponse{uri=");
        m24u.append(this.f23188a);
        m24u.append(", fid=");
        m24u.append(this.f23189b);
        m24u.append(", refreshToken=");
        m24u.append(this.f23190c);
        m24u.append(", authToken=");
        m24u.append(this.f23191d);
        m24u.append(", responseCode=");
        m24u.append(this.f23192e);
        m24u.append("}");
        return m24u.toString();
    }
}
