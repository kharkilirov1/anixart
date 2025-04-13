package com.google.android.gms.internal.common;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzt extends zzw {

    /* renamed from: g */
    public final /* synthetic */ zzu f16253g;

    @Override // com.google.android.gms.internal.common.zzw
    /* renamed from: b */
    public final int mo8566b(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    /* renamed from: c */
    public final int mo8567c(int i2) {
        Objects.requireNonNull(this.f16253g);
        CharSequence charSequence = this.f16254d;
        int length = charSequence.length();
        zzs.m8563b(i2, length, "index");
        if (i2 >= length) {
            return -1;
        }
        charSequence.charAt(i2);
        throw null;
    }
}
