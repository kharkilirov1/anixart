package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* renamed from: a */
    public final String f23198a;

    /* renamed from: b */
    public final long f23199b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f23200c;

    public static final class Builder extends TokenResult.Builder {

        /* renamed from: a */
        public String f23201a;

        /* renamed from: b */
        public Long f23202b;

        /* renamed from: c */
        public TokenResult.ResponseCode f23203c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        /* renamed from: a */
        public TokenResult mo12615a() {
            String str = this.f23202b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.f23201a, this.f23202b.longValue(), this.f23203c, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        /* renamed from: b */
        public TokenResult.Builder mo12616b(long j2) {
            this.f23202b = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_TokenResult(String str, long j2, TokenResult.ResponseCode responseCode, C21511 c21511) {
        this.f23198a = str;
        this.f23199b = j2;
        this.f23200c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    /* renamed from: b */
    public TokenResult.ResponseCode mo12612b() {
        return this.f23200c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    /* renamed from: c */
    public String mo12613c() {
        return this.f23198a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    /* renamed from: d */
    public long mo12614d() {
        return this.f23199b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f23198a;
        if (str != null ? str.equals(tokenResult.mo12613c()) : tokenResult.mo12613c() == null) {
            if (this.f23199b == tokenResult.mo12614d()) {
                TokenResult.ResponseCode responseCode = this.f23200c;
                if (responseCode == null) {
                    if (tokenResult.mo12612b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo12612b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23198a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f23199b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f23200c;
        return i2 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("TokenResult{token=");
        m24u.append(this.f23198a);
        m24u.append(", tokenExpirationTimestamp=");
        m24u.append(this.f23199b);
        m24u.append(", responseCode=");
        m24u.append(this.f23200c);
        m24u.append("}");
        return m24u.toString();
    }
}
