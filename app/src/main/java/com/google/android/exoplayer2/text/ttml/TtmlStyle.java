package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class TtmlStyle {

    /* renamed from: a */
    @Nullable
    public String f13765a;

    /* renamed from: b */
    public int f13766b;

    /* renamed from: c */
    public boolean f13767c;

    /* renamed from: d */
    public int f13768d;

    /* renamed from: e */
    public boolean f13769e;

    /* renamed from: k */
    public float f13775k;

    /* renamed from: l */
    @Nullable
    public String f13776l;

    /* renamed from: o */
    @Nullable
    public Layout.Alignment f13779o;

    /* renamed from: p */
    @Nullable
    public Layout.Alignment f13780p;

    /* renamed from: r */
    @Nullable
    public TextEmphasis f13782r;

    /* renamed from: f */
    public int f13770f = -1;

    /* renamed from: g */
    public int f13771g = -1;

    /* renamed from: h */
    public int f13772h = -1;

    /* renamed from: i */
    public int f13773i = -1;

    /* renamed from: j */
    public int f13774j = -1;

    /* renamed from: m */
    public int f13777m = -1;

    /* renamed from: n */
    public int f13778n = -1;

    /* renamed from: q */
    public int f13781q = -1;

    /* renamed from: s */
    public float f13783s = Float.MAX_VALUE;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    /* renamed from: a */
    public TtmlStyle m7265a(@Nullable TtmlStyle ttmlStyle) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f13767c && ttmlStyle.f13767c) {
                this.f13766b = ttmlStyle.f13766b;
                this.f13767c = true;
            }
            if (this.f13772h == -1) {
                this.f13772h = ttmlStyle.f13772h;
            }
            if (this.f13773i == -1) {
                this.f13773i = ttmlStyle.f13773i;
            }
            if (this.f13765a == null && (str = ttmlStyle.f13765a) != null) {
                this.f13765a = str;
            }
            if (this.f13770f == -1) {
                this.f13770f = ttmlStyle.f13770f;
            }
            if (this.f13771g == -1) {
                this.f13771g = ttmlStyle.f13771g;
            }
            if (this.f13778n == -1) {
                this.f13778n = ttmlStyle.f13778n;
            }
            if (this.f13779o == null && (alignment2 = ttmlStyle.f13779o) != null) {
                this.f13779o = alignment2;
            }
            if (this.f13780p == null && (alignment = ttmlStyle.f13780p) != null) {
                this.f13780p = alignment;
            }
            if (this.f13781q == -1) {
                this.f13781q = ttmlStyle.f13781q;
            }
            if (this.f13774j == -1) {
                this.f13774j = ttmlStyle.f13774j;
                this.f13775k = ttmlStyle.f13775k;
            }
            if (this.f13782r == null) {
                this.f13782r = ttmlStyle.f13782r;
            }
            if (this.f13783s == Float.MAX_VALUE) {
                this.f13783s = ttmlStyle.f13783s;
            }
            if (!this.f13769e && ttmlStyle.f13769e) {
                this.f13768d = ttmlStyle.f13768d;
                this.f13769e = true;
            }
            if (this.f13777m == -1 && (i2 = ttmlStyle.f13777m) != -1) {
                this.f13777m = i2;
            }
        }
        return this;
    }

    /* renamed from: b */
    public int m7266b() {
        int i2 = this.f13772h;
        if (i2 == -1 && this.f13773i == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f13773i == 1 ? 2 : 0);
    }
}
