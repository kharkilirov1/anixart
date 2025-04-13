package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabm implements zzaaz {

    /* renamed from: a */
    public final zzabc f16319a;

    /* renamed from: b */
    public final String f16320b;

    /* renamed from: c */
    public final Object[] f16321c;

    /* renamed from: d */
    public final int f16322d;

    public zzabm(zzabc zzabcVar, String str, Object[] objArr) {
        this.f16319a = zzabcVar;
        this.f16320b = str;
        this.f16321c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16322d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f16322d = i2 | (charAt2 << i3);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaz
    /* renamed from: u */
    public final zzabc mo8612u() {
        return this.f16319a;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaz
    /* renamed from: v */
    public final int mo8613v() {
        return (this.f16322d & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaz
    /* renamed from: w */
    public final boolean mo8614w() {
        return (this.f16322d & 2) == 2;
    }
}
