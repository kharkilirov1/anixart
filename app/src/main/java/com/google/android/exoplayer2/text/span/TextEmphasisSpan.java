package com.google.android.exoplayer2.text.span;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class TextEmphasisSpan implements LanguageFeatureSpan {

    /* renamed from: a */
    public int f13675a;

    /* renamed from: b */
    public int f13676b;

    /* renamed from: c */
    public final int f13677c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkFill {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkShape {
    }

    public TextEmphasisSpan(int i2, int i3, int i4) {
        this.f13675a = i2;
        this.f13676b = i3;
        this.f13677c = i4;
    }
}
