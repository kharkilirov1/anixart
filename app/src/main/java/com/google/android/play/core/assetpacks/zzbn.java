package com.google.android.play.core.assetpacks;

import androidx.room.util.C0576a;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbn extends AssetPackState {

    /* renamed from: a */
    public final String f19753a;

    /* renamed from: b */
    public final int f19754b;

    /* renamed from: c */
    public final int f19755c;

    /* renamed from: d */
    public final long f19756d;

    /* renamed from: e */
    public final long f19757e;

    /* renamed from: f */
    public final int f19758f;

    /* renamed from: g */
    public final int f19759g;

    /* renamed from: h */
    public final String f19760h;

    /* renamed from: i */
    public final String f19761i;

    public zzbn(String str, int i2, int i3, long j2, long j3, int i4, int i5, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f19753a = str;
        this.f19754b = i2;
        this.f19755c = i3;
        this.f19756d = j2;
        this.f19757e = j3;
        this.f19758f = i4;
        this.f19759g = i5;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f19760h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f19761i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: a */
    public final long mo10675a() {
        return this.f19756d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @AssetPackErrorCode
    /* renamed from: b */
    public final int mo10676b() {
        return this.f19755c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: c */
    public final String mo10677c() {
        return this.f19753a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    @AssetPackStatus
    /* renamed from: d */
    public final int mo10678d() {
        return this.f19754b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: e */
    public final long mo10679e() {
        return this.f19757e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f19753a.equals(assetPackState.mo10677c()) && this.f19754b == assetPackState.mo10678d() && this.f19755c == assetPackState.mo10676b() && this.f19756d == assetPackState.mo10675a() && this.f19757e == assetPackState.mo10679e() && this.f19758f == assetPackState.mo10680f() && this.f19759g == assetPackState.mo10681g() && this.f19760h.equals(assetPackState.mo10682j()) && this.f19761i.equals(assetPackState.mo10683k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: f */
    public final int mo10680f() {
        return this.f19758f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: g */
    public final int mo10681g() {
        return this.f19759g;
    }

    public final int hashCode() {
        int hashCode = this.f19753a.hashCode();
        int i2 = this.f19754b;
        int i3 = this.f19755c;
        long j2 = this.f19756d;
        long j3 = this.f19757e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f19758f) * 1000003) ^ this.f19759g) * 1000003) ^ this.f19760h.hashCode()) * 1000003) ^ this.f19761i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: j */
    public final String mo10682j() {
        return this.f19760h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: k */
    public final String mo10683k() {
        return this.f19761i;
    }

    public final String toString() {
        String str = this.f19753a;
        int i2 = this.f19754b;
        int i3 = this.f19755c;
        long j2 = this.f19756d;
        long j3 = this.f19757e;
        int i4 = this.f19758f;
        int i5 = this.f19759g;
        String str2 = this.f19760h;
        String str3 = this.f19761i;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 261 + str2.length() + str3.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        C0576a.m4127z(sb, i4, ", updateAvailability=", i5, ", availableVersionTag=");
        return C0000a.m22s(sb, str2, ", installedVersionTag=", str3, "}");
    }
}
