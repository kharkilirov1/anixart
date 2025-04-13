package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* renamed from: a */
    public final NetworkConnectionInfo.NetworkType f9070a;

    /* renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f9071b;

    public static final class Builder extends NetworkConnectionInfo.Builder {

        /* renamed from: a */
        public NetworkConnectionInfo.NetworkType f9072a;

        /* renamed from: b */
        public NetworkConnectionInfo.MobileSubtype f9073b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        /* renamed from: a */
        public NetworkConnectionInfo mo5475a() {
            return new AutoValue_NetworkConnectionInfo(this.f9072a, this.f9073b, null);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        /* renamed from: b */
        public NetworkConnectionInfo.Builder mo5476b(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f9073b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        /* renamed from: c */
        public NetworkConnectionInfo.Builder mo5477c(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f9072a = networkType;
            return this;
        }
    }

    public AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, C09041 c09041) {
        this.f9070a = networkType;
        this.f9071b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo5473b() {
        return this.f9071b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo5474c() {
        return this.f9070a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f9070a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo5474c()) : networkConnectionInfo.mo5474c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f9071b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo5473b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo5473b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f9070a;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f9071b;
        return hashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("NetworkConnectionInfo{networkType=");
        m24u.append(this.f9070a);
        m24u.append(", mobileSubtype=");
        m24u.append(this.f9071b);
        m24u.append("}");
        return m24u.toString();
    }
}
