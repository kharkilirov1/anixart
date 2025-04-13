package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class WebvttCssStyle {

    /* renamed from: f */
    @ColorInt
    public int f13809f;

    /* renamed from: h */
    public int f13811h;

    /* renamed from: o */
    public float f13818o;

    /* renamed from: a */
    public String f13804a = "";

    /* renamed from: b */
    public String f13805b = "";

    /* renamed from: c */
    public Set<String> f13806c = Collections.emptySet();

    /* renamed from: d */
    public String f13807d = "";

    /* renamed from: e */
    @Nullable
    public String f13808e = null;

    /* renamed from: g */
    public boolean f13810g = false;

    /* renamed from: i */
    public boolean f13812i = false;

    /* renamed from: j */
    public int f13813j = -1;

    /* renamed from: k */
    public int f13814k = -1;

    /* renamed from: l */
    public int f13815l = -1;

    /* renamed from: m */
    public int f13816m = -1;

    /* renamed from: n */
    public int f13817n = -1;

    /* renamed from: p */
    public int f13819p = -1;

    /* renamed from: q */
    public boolean f13820q = false;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    /* renamed from: b */
    public static int m7272b(int i2, String str, @Nullable String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    /* renamed from: a */
    public int m7273a() {
        int i2 = this.f13815l;
        if (i2 == -1 && this.f13816m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f13816m == 1 ? 2 : 0);
    }
}
