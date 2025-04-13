package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class si1 {

    /* renamed from: f */
    @ColorInt
    private int f54677f;

    /* renamed from: h */
    private int f54679h;

    /* renamed from: o */
    private float f54686o;

    /* renamed from: a */
    private String f54672a = "";

    /* renamed from: b */
    private String f54673b = "";

    /* renamed from: c */
    private Set<String> f54674c = Collections.emptySet();

    /* renamed from: d */
    private String f54675d = "";

    /* renamed from: e */
    @Nullable
    private String f54676e = null;

    /* renamed from: g */
    private boolean f54678g = false;

    /* renamed from: i */
    private boolean f54680i = false;

    /* renamed from: j */
    private int f54681j = -1;

    /* renamed from: k */
    private int f54682k = -1;

    /* renamed from: l */
    private int f54683l = -1;

    /* renamed from: m */
    private int f54684m = -1;

    /* renamed from: n */
    private int f54685n = -1;

    /* renamed from: p */
    private int f54687p = -1;

    /* renamed from: q */
    private boolean f54688q = false;

    /* renamed from: a */
    public final void m28260a(String[] strArr) {
        this.f54674c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: b */
    public final void m28262b(String str) {
        this.f54672a = str;
    }

    /* renamed from: c */
    public final void m28266c(String str) {
        this.f54673b = str;
    }

    /* renamed from: d */
    public final void m28269d(String str) {
        this.f54675d = str;
    }

    /* renamed from: e */
    public final float m28270e() {
        return this.f54686o;
    }

    /* renamed from: f */
    public final int m28271f() {
        return this.f54685n;
    }

    /* renamed from: g */
    public final int m28272g() {
        return this.f54687p;
    }

    /* renamed from: h */
    public final int m28273h() {
        int i2 = this.f54683l;
        if (i2 == -1 && this.f54684m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f54684m == 1 ? 2 : 0);
    }

    /* renamed from: i */
    public final boolean m28274i() {
        return this.f54680i;
    }

    /* renamed from: j */
    public final boolean m28275j() {
        return this.f54678g;
    }

    /* renamed from: k */
    public final boolean m28276k() {
        return this.f54681j == 1;
    }

    /* renamed from: l */
    public final boolean m28277l() {
        return this.f54682k == 1;
    }

    /* renamed from: m */
    public final void m28278m() {
        this.f54683l = 1;
    }

    /* renamed from: n */
    public final void m28279n() {
        this.f54684m = 1;
    }

    /* renamed from: o */
    public final void m28280o() {
        this.f54682k = 1;
    }

    /* renamed from: a */
    public final int m28255a(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f54672a.isEmpty() && this.f54673b.isEmpty() && this.f54674c.isEmpty() && this.f54675d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f54672a;
        int i2 = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.f54673b;
        if (!str5.isEmpty() && i2 != -1) {
            i2 = str5.equals(str2) ? i2 + 2 : -1;
        }
        String str6 = this.f54675d;
        if (!str6.isEmpty() && i2 != -1) {
            i2 = str6.equals(str3) ? i2 + 4 : -1;
        }
        if (i2 == -1 || !set.containsAll(this.f54674c)) {
            return 0;
        }
        return (this.f54674c.size() * 4) + i2;
    }

    /* renamed from: b */
    public final void m28261b(int i2) {
        this.f54677f = i2;
        this.f54678g = true;
    }

    /* renamed from: c */
    public final int m28264c() {
        if (this.f54678g) {
            return this.f54677f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    /* renamed from: d */
    public final String m28267d() {
        return this.f54676e;
    }

    /* renamed from: d */
    public final void m28268d(int i2) {
        this.f54687p = i2;
    }

    /* renamed from: b */
    public final boolean m28263b() {
        return this.f54688q;
    }

    /* renamed from: c */
    public final void m28265c(int i2) {
        this.f54685n = i2;
    }

    /* renamed from: a */
    public final void m28258a(@Nullable String str) {
        this.f54676e = C5114ga.m24832b(str);
    }

    /* renamed from: a */
    public final int m28254a() {
        if (this.f54680i) {
            return this.f54679h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: a */
    public final void m28257a(int i2) {
        this.f54679h = i2;
        this.f54680i = true;
    }

    /* renamed from: a */
    public final void m28256a(float f2) {
        this.f54686o = f2;
    }

    /* renamed from: a */
    public final void m28259a(boolean z) {
        this.f54688q = z;
    }
}
