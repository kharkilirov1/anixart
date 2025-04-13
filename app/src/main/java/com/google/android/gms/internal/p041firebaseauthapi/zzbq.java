package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzbq implements Comparable {

    /* renamed from: b */
    public final byte[] f16413b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzbq zzbqVar = (zzbq) obj;
        int length = this.f16413b.length;
        int length2 = zzbqVar.f16413b.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f16413b;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b = bArr[i2];
            byte b2 = zzbqVar.f16413b[i2];
            if (b != b2) {
                return b - b2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbq) {
            return Arrays.equals(this.f16413b, ((zzbq) obj).f16413b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16413b);
    }

    public final String toString() {
        return zznd.m9335a(this.f16413b);
    }
}
