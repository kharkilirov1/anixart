package com.google.android.play.core.splitcompat;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb extends zzs {

    /* renamed from: a */
    public final File f20191a;

    /* renamed from: b */
    public final String f20192b;

    public zzb(File file, String str) {
        this.f20191a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f20192b = str;
    }

    @Override // com.google.android.play.core.splitcompat.zzs
    @NonNull
    /* renamed from: a */
    public final File mo10939a() {
        return this.f20191a;
    }

    @Override // com.google.android.play.core.splitcompat.zzs
    @NonNull
    /* renamed from: b */
    public final String mo10940b() {
        return this.f20192b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzsVar = (zzs) obj;
            if (this.f20191a.equals(zzsVar.mo10939a()) && this.f20192b.equals(zzsVar.mo10940b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20191a.hashCode() ^ 1000003) * 1000003) ^ this.f20192b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20191a);
        String str = this.f20192b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + str.length());
        C0000a.m2C(sb, "SplitFileInfo{splitFile=", valueOf, ", splitId=", str);
        sb.append("}");
        return sb.toString();
    }
}
