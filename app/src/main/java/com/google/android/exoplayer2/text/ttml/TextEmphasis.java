package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class TextEmphasis {

    /* renamed from: d */
    public static final Pattern f13718d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final ImmutableSet<String> f13719e;

    /* renamed from: f */
    public static final ImmutableSet<String> f13720f;

    /* renamed from: g */
    public static final ImmutableSet<String> f13721g;

    /* renamed from: h */
    public static final ImmutableSet<String> f13722h;

    /* renamed from: a */
    public final int f13723a;

    /* renamed from: b */
    public final int f13724b;

    /* renamed from: c */
    public final int f13725c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    static {
        int i2 = ImmutableSet.f21087d;
        f13719e = ImmutableSet.m11675u(2, "auto", "none");
        f13720f = ImmutableSet.m11673E("dot", "sesame", "circle");
        f13721g = ImmutableSet.m11675u(2, "filled", "open");
        f13722h = ImmutableSet.m11673E("after", "before", "outside");
    }

    public TextEmphasis(int i2, int i3, int i4) {
        this.f13723a = i2;
        this.f13724b = i3;
        this.f13725c = i4;
    }
}
