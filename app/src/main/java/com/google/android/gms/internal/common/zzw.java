package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zzw extends zzj<String> {

    /* renamed from: d */
    public final CharSequence f16254d;

    /* renamed from: e */
    public int f16255e;

    /* renamed from: f */
    public int f16256f;

    @Override // com.google.android.gms.internal.common.zzj
    @CheckForNull
    /* renamed from: a */
    public final String mo8560a() {
        int mo8566b;
        int i2 = this.f16255e;
        while (true) {
            int i3 = this.f16255e;
            if (i3 == -1) {
                this.f16252c = 3;
                return null;
            }
            int mo8567c = mo8567c(i3);
            if (mo8567c == -1) {
                mo8567c = this.f16254d.length();
                this.f16255e = -1;
                mo8566b = -1;
            } else {
                mo8566b = mo8566b(mo8567c);
                this.f16255e = mo8566b;
            }
            if (mo8566b != i2) {
                if (i2 < mo8567c) {
                    this.f16254d.charAt(i2);
                }
                if (i2 < mo8567c) {
                    this.f16254d.charAt(mo8567c - 1);
                }
                int i4 = this.f16256f;
                if (i4 == 1) {
                    mo8567c = this.f16254d.length();
                    this.f16255e = -1;
                    if (mo8567c > i2) {
                        this.f16254d.charAt(mo8567c - 1);
                    }
                } else {
                    this.f16256f = i4 - 1;
                }
                return this.f16254d.subSequence(i2, mo8567c).toString();
            }
            int i5 = mo8566b + 1;
            this.f16255e = i5;
            if (i5 > this.f16254d.length()) {
                this.f16255e = -1;
            }
        }
    }

    /* renamed from: b */
    public abstract int mo8566b(int i2);

    /* renamed from: c */
    public abstract int mo8567c(int i2);
}
