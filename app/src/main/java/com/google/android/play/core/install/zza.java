package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza extends InstallState {

    /* renamed from: a */
    public final int f20087a;

    /* renamed from: b */
    public final long f20088b;

    /* renamed from: c */
    public final long f20089c;

    /* renamed from: d */
    public final int f20090d;

    /* renamed from: e */
    public final String f20091e;

    public zza(int i2, long j2, long j3, int i3, String str) {
        this.f20087a = i2;
        this.f20088b = j2;
        this.f20089c = j3;
        this.f20090d = i3;
        Objects.requireNonNull(str, "Null packageName");
        this.f20091e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: a */
    public final long mo10825a() {
        return this.f20088b;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    /* renamed from: b */
    public final int mo10826b() {
        return this.f20090d;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    /* renamed from: c */
    public final int mo10827c() {
        return this.f20087a;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: d */
    public final String mo10828d() {
        return this.f20091e;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: e */
    public final long mo10829e() {
        return this.f20089c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f20087a == installState.mo10827c() && this.f20088b == installState.mo10825a() && this.f20089c == installState.mo10829e() && this.f20090d == installState.mo10826b() && this.f20091e.equals(installState.mo10828d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f20087a;
        long j2 = this.f20088b;
        long j3 = this.f20089c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f20090d) * 1000003) ^ this.f20091e.hashCode();
    }

    public final String toString() {
        int i2 = this.f20087a;
        long j2 = this.f20088b;
        long j3 = this.f20089c;
        int i3 = this.f20090d;
        String str = this.f20091e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
