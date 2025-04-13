package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f9037a;

    /* renamed from: b */
    public final AndroidClientInfo f9038b;

    public static final class Builder extends ClientInfo.Builder {

        /* renamed from: a */
        public ClientInfo.ClientType f9039a;

        /* renamed from: b */
        public AndroidClientInfo f9040b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        /* renamed from: a */
        public ClientInfo mo5441a() {
            return new AutoValue_ClientInfo(this.f9039a, this.f9040b, null);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        /* renamed from: b */
        public ClientInfo.Builder mo5442b(@Nullable AndroidClientInfo androidClientInfo) {
            this.f9040b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        /* renamed from: c */
        public ClientInfo.Builder mo5443c(@Nullable ClientInfo.ClientType clientType) {
            this.f9039a = clientType;
            return this;
        }
    }

    public AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo, C09011 c09011) {
        this.f9037a = clientType;
        this.f9038b = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    /* renamed from: b */
    public AndroidClientInfo mo5439b() {
        return this.f9038b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    /* renamed from: c */
    public ClientInfo.ClientType mo5440c() {
        return this.f9037a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f9037a;
        if (clientType != null ? clientType.equals(clientInfo.mo5440c()) : clientInfo.mo5440c() == null) {
            AndroidClientInfo androidClientInfo = this.f9038b;
            if (androidClientInfo == null) {
                if (clientInfo.mo5439b() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.mo5439b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f9037a;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f9038b;
        return hashCode ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClientInfo{clientType=");
        m24u.append(this.f9037a);
        m24u.append(", androidClientInfo=");
        m24u.append(this.f9038b);
        m24u.append("}");
        return m24u.toString();
    }
}
