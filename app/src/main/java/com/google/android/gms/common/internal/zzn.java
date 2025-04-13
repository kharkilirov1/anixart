package com.google.android.gms.common.internal;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzn {

    /* renamed from: e */
    public static final Uri f15809e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    @Nullable
    public final String f15810a;

    /* renamed from: b */
    @Nullable
    public final String f15811b;

    /* renamed from: c */
    public final int f15812c;

    /* renamed from: d */
    public final boolean f15813d;

    public zzn(String str, String str2, int i2, boolean z) {
        Preconditions.m8129d(str);
        this.f15810a = str;
        Preconditions.m8129d(str2);
        this.f15811b = str2;
        this.f15812c = i2;
        this.f15813d = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.m8123a(this.f15810a, zznVar.f15810a) && Objects.m8123a(this.f15811b, zznVar.f15811b) && Objects.m8123a(null, null) && this.f15812c == zznVar.f15812c && this.f15813d == zznVar.f15813d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15810a, this.f15811b, null, Integer.valueOf(this.f15812c), Boolean.valueOf(this.f15813d)});
    }

    public final String toString() {
        String str = this.f15810a;
        if (str != null) {
            return str;
        }
        java.util.Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }
}
