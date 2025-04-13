package com.google.android.exoplayer2.p009ui;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class CaptionStyleCompat {

    /* renamed from: g */
    public static final CaptionStyleCompat f14079g = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f14080a;

    /* renamed from: b */
    public final int f14081b;

    /* renamed from: c */
    public final int f14082c;

    /* renamed from: d */
    public final int f14083d;

    /* renamed from: e */
    public final int f14084e;

    /* renamed from: f */
    @Nullable
    public final Typeface f14085f;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i2, int i3, int i4, int i5, int i6, @Nullable Typeface typeface) {
        this.f14080a = i2;
        this.f14081b = i3;
        this.f14082c = i4;
        this.f14083d = i5;
        this.f14084e = i6;
        this.f14085f = typeface;
    }
}
