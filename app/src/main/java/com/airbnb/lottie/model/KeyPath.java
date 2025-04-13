package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class KeyPath {

    /* renamed from: a */
    public final List<String> f7491a;

    /* renamed from: b */
    @Nullable
    public KeyPathElement f7492b;

    public KeyPath(String... strArr) {
        this.f7491a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo
    /* renamed from: a */
    public KeyPath m4730a(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f7491a.add(str);
        return keyPath;
    }

    /* renamed from: b */
    public final boolean m4731b() {
        return this.f7491a.get(r0.size() - 1).equals("**");
    }

    @RestrictTo
    /* renamed from: c */
    public boolean m4732c(String str, int i2) {
        if (i2 >= this.f7491a.size()) {
            return false;
        }
        boolean z = i2 == this.f7491a.size() - 1;
        String str2 = this.f7491a.get(i2);
        if (!str2.equals("**")) {
            return (z || (i2 == this.f7491a.size() + (-2) && m4731b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f7491a.get(i2 + 1).equals(str)) {
            return i2 == this.f7491a.size() + (-2) || (i2 == this.f7491a.size() + (-3) && m4731b());
        }
        if (z) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.f7491a.size() - 1) {
            return false;
        }
        return this.f7491a.get(i3).equals(str);
    }

    @RestrictTo
    /* renamed from: d */
    public int m4733d(String str, int i2) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.f7491a.get(i2).equals("**")) {
            return (i2 != this.f7491a.size() - 1 && this.f7491a.get(i2 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @RestrictTo
    /* renamed from: e */
    public boolean m4734e(String str, int i2) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i2 >= this.f7491a.size()) {
            return false;
        }
        return this.f7491a.get(i2).equals(str) || this.f7491a.get(i2).equals("**") || this.f7491a.get(i2).equals("*");
    }

    @RestrictTo
    /* renamed from: f */
    public boolean m4735f(String str, int i2) {
        return "__container".equals(str) || i2 < this.f7491a.size() - 1 || this.f7491a.get(i2).equals("**");
    }

    @RestrictTo
    /* renamed from: g */
    public KeyPath m4736g(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f7492b = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("KeyPath{keys=");
        m24u.append(this.f7491a);
        m24u.append(",resolved=");
        m24u.append(this.f7492b != null);
        m24u.append('}');
        return m24u.toString();
    }

    public KeyPath(KeyPath keyPath) {
        this.f7491a = new ArrayList(keyPath.f7491a);
        this.f7492b = keyPath.f7492b;
    }
}
