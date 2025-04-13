package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kv */
/* loaded from: classes3.dex */
public final class C5361kv {

    /* renamed from: a */
    @Nullable
    private final Typeface f52169a;

    /* renamed from: b */
    @Nullable
    private final Typeface f52170b;

    /* renamed from: c */
    @Nullable
    private final Typeface f52171c;

    /* renamed from: d */
    @Nullable
    private final Typeface f52172d;

    public C5361kv(@Nullable Typeface typeface, @Nullable Typeface typeface2, @Nullable Typeface typeface3, @Nullable Typeface typeface4) {
        this.f52169a = typeface;
        this.f52170b = typeface2;
        this.f52171c = typeface3;
        this.f52172d = typeface4;
    }

    @Nullable
    /* renamed from: a */
    public final Typeface m26283a() {
        return this.f52172d;
    }

    @Nullable
    /* renamed from: b */
    public final Typeface m26284b() {
        return this.f52169a;
    }

    @Nullable
    /* renamed from: c */
    public final Typeface m26285c() {
        return this.f52171c;
    }

    @Nullable
    /* renamed from: d */
    public final Typeface m26286d() {
        return this.f52170b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5361kv)) {
            return false;
        }
        C5361kv c5361kv = (C5361kv) obj;
        return Intrinsics.m32174c(this.f52169a, c5361kv.f52169a) && Intrinsics.m32174c(this.f52170b, c5361kv.f52170b) && Intrinsics.m32174c(this.f52171c, c5361kv.f52171c) && Intrinsics.m32174c(this.f52172d, c5361kv.f52172d);
    }

    public final int hashCode() {
        Typeface typeface = this.f52169a;
        int hashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f52170b;
        int hashCode2 = (hashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.f52171c;
        int hashCode3 = (hashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.f52172d;
        return hashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("FontTypefaceData(light=");
        m26356a.append(this.f52169a);
        m26356a.append(", regular=");
        m26356a.append(this.f52170b);
        m26356a.append(", medium=");
        m26356a.append(this.f52171c);
        m26356a.append(", bold=");
        m26356a.append(this.f52172d);
        m26356a.append(')');
        return m26356a.toString();
    }
}
