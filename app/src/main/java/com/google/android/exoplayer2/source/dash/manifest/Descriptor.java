package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class Descriptor {

    /* renamed from: a */
    public final String f12954a;

    /* renamed from: b */
    @Nullable
    public final String f12955b;

    /* renamed from: c */
    @Nullable
    public final String f12956c;

    public Descriptor(String str, @Nullable String str2, @Nullable String str3) {
        this.f12954a = str;
        this.f12955b = str2;
        this.f12956c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Descriptor.class != obj.getClass()) {
            return false;
        }
        Descriptor descriptor = (Descriptor) obj;
        return Util.m7728a(this.f12954a, descriptor.f12954a) && Util.m7728a(this.f12955b, descriptor.f12955b) && Util.m7728a(this.f12956c, descriptor.f12956c);
    }

    public int hashCode() {
        int hashCode = this.f12954a.hashCode() * 31;
        String str = this.f12955b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12956c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
