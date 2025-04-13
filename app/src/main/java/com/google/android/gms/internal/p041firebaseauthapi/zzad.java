package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzad extends zzh {

    /* renamed from: d */
    public final CharSequence f16377d;

    /* renamed from: e */
    public int f16378e = 0;

    /* renamed from: f */
    public int f16379f;

    public zzad(zzaf zzafVar, CharSequence charSequence) {
        Objects.requireNonNull(zzafVar);
        this.f16379f = Integer.MAX_VALUE;
        this.f16377d = charSequence;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzh
    @CheckForNull
    /* renamed from: a */
    public final Object mo8811a() {
        int mo8615b;
        int i2 = this.f16378e;
        while (true) {
            int i3 = this.f16378e;
            if (i3 == -1) {
                this.f16523c = 3;
                return null;
            }
            int mo8616c = mo8616c(i3);
            if (mo8616c == -1) {
                mo8616c = this.f16377d.length();
                this.f16378e = -1;
                mo8615b = -1;
            } else {
                mo8615b = mo8615b(mo8616c);
                this.f16378e = mo8615b;
            }
            if (mo8615b != i2) {
                if (i2 < mo8616c) {
                    this.f16377d.charAt(i2);
                }
                if (i2 < mo8616c) {
                    this.f16377d.charAt(mo8616c - 1);
                }
                int i4 = this.f16379f;
                if (i4 == 1) {
                    mo8616c = this.f16377d.length();
                    this.f16378e = -1;
                    if (mo8616c > i2) {
                        this.f16377d.charAt(mo8616c - 1);
                    }
                } else {
                    this.f16379f = i4 - 1;
                }
                return this.f16377d.subSequence(i2, mo8616c).toString();
            }
            int i5 = mo8615b + 1;
            this.f16378e = i5;
            if (i5 > this.f16377d.length()) {
                this.f16378e = -1;
            }
        }
    }

    /* renamed from: b */
    public abstract int mo8615b(int i2);

    /* renamed from: c */
    public abstract int mo8616c(int i2);
}
