package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbq extends zzet {

    /* renamed from: a */
    public final String f19769a;

    /* renamed from: b */
    public final long f19770b;

    /* renamed from: c */
    public final int f19771c;

    /* renamed from: d */
    public final boolean f19772d;

    /* renamed from: e */
    public final boolean f19773e;

    /* renamed from: f */
    public final byte[] f19774f;

    public zzbq(@Nullable String str, long j2, int i2, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.f19769a = str;
        this.f19770b = j2;
        this.f19771c = i2;
        this.f19772d = z;
        this.f19773e = z2;
        this.f19774f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    /* renamed from: a */
    public final int mo10757a() {
        return this.f19771c;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    /* renamed from: b */
    public final long mo10758b() {
        return this.f19770b;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    @Nullable
    /* renamed from: c */
    public final String mo10759c() {
        return this.f19769a;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    /* renamed from: d */
    public final boolean mo10760d() {
        return this.f19773e;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    /* renamed from: e */
    public final boolean mo10761e() {
        return this.f19772d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzet) {
            zzet zzetVar = (zzet) obj;
            String str = this.f19769a;
            if (str != null ? str.equals(zzetVar.mo10759c()) : zzetVar.mo10759c() == null) {
                if (this.f19770b == zzetVar.mo10758b() && this.f19771c == zzetVar.mo10757a() && this.f19772d == zzetVar.mo10761e() && this.f19773e == zzetVar.mo10760d()) {
                    if (Arrays.equals(this.f19774f, zzetVar instanceof zzbq ? ((zzbq) zzetVar).f19774f : zzetVar.mo10762f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.zzet
    @Nullable
    /* renamed from: f */
    public final byte[] mo10762f() {
        return this.f19774f;
    }

    public final int hashCode() {
        String str = this.f19769a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f19770b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f19771c) * 1000003) ^ (true != this.f19772d ? 1237 : 1231)) * 1000003) ^ (true == this.f19773e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f19774f);
    }

    public final String toString() {
        String str = this.f19769a;
        long j2 = this.f19770b;
        int i2 = this.f19771c;
        boolean z = this.f19772d;
        boolean z2 = this.f19773e;
        String arrays = Arrays.toString(this.f19774f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        C0000a.m1B(sb, "ZipEntry{name=", str, ", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return C0000a.m21r(sb, ", headerBytes=", arrays, "}");
    }
}
