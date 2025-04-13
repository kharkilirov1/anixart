package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbp extends zzem {

    /* renamed from: a */
    public final int f19764a;

    /* renamed from: b */
    public final String f19765b;

    /* renamed from: c */
    public final long f19766c;

    /* renamed from: d */
    public final long f19767d;

    /* renamed from: e */
    public final int f19768e;

    public zzbp(int i2, @Nullable String str, long j2, long j3, int i3) {
        this.f19764a = i2;
        this.f19765b = str;
        this.f19766c = j2;
        this.f19767d = j3;
        this.f19768e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    /* renamed from: a */
    public final int mo10752a() {
        return this.f19764a;
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    /* renamed from: b */
    public final int mo10753b() {
        return this.f19768e;
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    /* renamed from: c */
    public final long mo10754c() {
        return this.f19766c;
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    /* renamed from: d */
    public final long mo10755d() {
        return this.f19767d;
    }

    @Override // com.google.android.play.core.assetpacks.zzem
    @Nullable
    /* renamed from: e */
    public final String mo10756e() {
        return this.f19765b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzem) {
            zzem zzemVar = (zzem) obj;
            if (this.f19764a == zzemVar.mo10752a() && ((str = this.f19765b) != null ? str.equals(zzemVar.mo10756e()) : zzemVar.mo10756e() == null) && this.f19766c == zzemVar.mo10754c() && this.f19767d == zzemVar.mo10755d() && this.f19768e == zzemVar.mo10753b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f19764a ^ 1000003) * 1000003;
        String str = this.f19765b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f19766c;
        long j3 = this.f19767d;
        return ((((((i2 ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f19768e;
    }

    public final String toString() {
        int i2 = this.f19764a;
        String str = this.f19765b;
        long j2 = this.f19766c;
        long j3 = this.f19767d;
        int i3 = this.f19768e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
