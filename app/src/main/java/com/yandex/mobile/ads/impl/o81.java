package com.yandex.mobile.ads.impl;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class o81 {

    /* renamed from: a */
    @Nullable
    private String f53207a;

    /* renamed from: b */
    private int f53208b;

    /* renamed from: c */
    private boolean f53209c;

    /* renamed from: d */
    private int f53210d;

    /* renamed from: e */
    private boolean f53211e;

    /* renamed from: k */
    private float f53217k;

    /* renamed from: l */
    @Nullable
    private String f53218l;

    /* renamed from: o */
    @Nullable
    private Layout.Alignment f53221o;

    /* renamed from: p */
    @Nullable
    private Layout.Alignment f53222p;

    /* renamed from: r */
    @Nullable
    private w51 f53224r;

    /* renamed from: f */
    private int f53212f = -1;

    /* renamed from: g */
    private int f53213g = -1;

    /* renamed from: h */
    private int f53214h = -1;

    /* renamed from: i */
    private int f53215i = -1;

    /* renamed from: j */
    private int f53216j = -1;

    /* renamed from: m */
    private int f53219m = -1;

    /* renamed from: n */
    private int f53220n = -1;

    /* renamed from: q */
    private int f53223q = -1;

    /* renamed from: s */
    private float f53225s = Float.MAX_VALUE;

    /* renamed from: a */
    public final o81 m27025a(boolean z) {
        this.f53214h = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public final o81 m27032b(boolean z) {
        this.f53215i = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public final o81 m27034c(boolean z) {
        this.f53212f = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public final o81 m27038d(int i2) {
        this.f53220n = i2;
        return this;
    }

    /* renamed from: e */
    public final o81 m27042e(boolean z) {
        this.f53213g = z ? 1 : 0;
        return this;
    }

    @Nullable
    /* renamed from: f */
    public final String m27043f() {
        return this.f53218l;
    }

    @Nullable
    /* renamed from: g */
    public final Layout.Alignment m27044g() {
        return this.f53222p;
    }

    /* renamed from: h */
    public final int m27045h() {
        return this.f53220n;
    }

    /* renamed from: i */
    public final int m27046i() {
        return this.f53219m;
    }

    /* renamed from: j */
    public final float m27047j() {
        return this.f53225s;
    }

    /* renamed from: k */
    public final int m27048k() {
        int i2 = this.f53214h;
        if (i2 == -1 && this.f53215i == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f53215i == 1 ? 2 : 0);
    }

    @Nullable
    /* renamed from: l */
    public final Layout.Alignment m27049l() {
        return this.f53221o;
    }

    /* renamed from: m */
    public final boolean m27050m() {
        return this.f53223q == 1;
    }

    @Nullable
    /* renamed from: n */
    public final w51 m27051n() {
        return this.f53224r;
    }

    /* renamed from: o */
    public final boolean m27052o() {
        return this.f53211e;
    }

    /* renamed from: p */
    public final boolean m27053p() {
        return this.f53209c;
    }

    /* renamed from: q */
    public final boolean m27054q() {
        return this.f53212f == 1;
    }

    /* renamed from: r */
    public final boolean m27055r() {
        return this.f53213g == 1;
    }

    /* renamed from: a */
    public final o81 m27024a(@Nullable String str) {
        this.f53207a = str;
        return this;
    }

    /* renamed from: b */
    public final int m27028b() {
        if (this.f53209c) {
            return this.f53208b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    /* renamed from: c */
    public final String m27035c() {
        return this.f53207a;
    }

    /* renamed from: d */
    public final o81 m27039d(boolean z) {
        this.f53223q = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public final o81 m27041e(int i2) {
        this.f53219m = i2;
        return this;
    }

    /* renamed from: a */
    public final int m27020a() {
        if (this.f53211e) {
            return this.f53210d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public final void m27036c(int i2) {
        this.f53216j = i2;
    }

    /* renamed from: d */
    public final float m27037d() {
        return this.f53217k;
    }

    /* renamed from: e */
    public final int m27040e() {
        return this.f53216j;
    }

    /* renamed from: b */
    public final void m27033b(int i2) {
        this.f53208b = i2;
        this.f53209c = true;
    }

    /* renamed from: a */
    public final void m27027a(int i2) {
        this.f53210d = i2;
        this.f53211e = true;
    }

    /* renamed from: b */
    public final o81 m27029b(float f2) {
        this.f53225s = f2;
        return this;
    }

    /* renamed from: a */
    public final o81 m27022a(@Nullable o81 o81Var) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (o81Var != null) {
            if (!this.f53209c && o81Var.f53209c) {
                m27033b(o81Var.f53208b);
            }
            if (this.f53214h == -1) {
                this.f53214h = o81Var.f53214h;
            }
            if (this.f53215i == -1) {
                this.f53215i = o81Var.f53215i;
            }
            if (this.f53207a == null && (str = o81Var.f53207a) != null) {
                this.f53207a = str;
            }
            if (this.f53212f == -1) {
                this.f53212f = o81Var.f53212f;
            }
            if (this.f53213g == -1) {
                this.f53213g = o81Var.f53213g;
            }
            if (this.f53220n == -1) {
                this.f53220n = o81Var.f53220n;
            }
            if (this.f53221o == null && (alignment2 = o81Var.f53221o) != null) {
                this.f53221o = alignment2;
            }
            if (this.f53222p == null && (alignment = o81Var.f53222p) != null) {
                this.f53222p = alignment;
            }
            if (this.f53223q == -1) {
                this.f53223q = o81Var.f53223q;
            }
            if (this.f53216j == -1) {
                this.f53216j = o81Var.f53216j;
                this.f53217k = o81Var.f53217k;
            }
            if (this.f53224r == null) {
                this.f53224r = o81Var.f53224r;
            }
            if (this.f53225s == Float.MAX_VALUE) {
                this.f53225s = o81Var.f53225s;
            }
            if (!this.f53211e && o81Var.f53211e) {
                m27027a(o81Var.f53210d);
            }
            if (this.f53219m == -1 && (i2 = o81Var.f53219m) != -1) {
                this.f53219m = i2;
            }
        }
        return this;
    }

    /* renamed from: b */
    public final o81 m27031b(@Nullable String str) {
        this.f53218l = str;
        return this;
    }

    /* renamed from: b */
    public final o81 m27030b(@Nullable Layout.Alignment alignment) {
        this.f53221o = alignment;
        return this;
    }

    /* renamed from: a */
    public final o81 m27021a(@Nullable Layout.Alignment alignment) {
        this.f53222p = alignment;
        return this;
    }

    /* renamed from: a */
    public final o81 m27023a(@Nullable w51 w51Var) {
        this.f53224r = w51Var;
        return this;
    }

    /* renamed from: a */
    public final void m27026a(float f2) {
        this.f53217k = f2;
    }
}
