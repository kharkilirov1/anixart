package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzz extends zzad {
    public zzz(zzaa zzaaVar, zzaf zzafVar, CharSequence charSequence) {
        super(zzafVar, charSequence);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzad
    /* renamed from: b */
    public final int mo8615b(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzad
    /* renamed from: c */
    public final int mo8616c(int i2) {
        CharSequence charSequence = this.f16377d;
        int length = charSequence.length();
        zzy.m9480b(i2, length, "index");
        while (i2 < length) {
            if (charSequence.charAt(i2) == '.') {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
