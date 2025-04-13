package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class e21 {

    /* renamed from: h */
    private static final Comparator<C5001a> f49781h = C4891by.f49008d;

    /* renamed from: i */
    private static final Comparator<C5001a> f49782i = C4891by.f49009e;

    /* renamed from: a */
    private final int f49783a;

    /* renamed from: e */
    private int f49787e;

    /* renamed from: f */
    private int f49788f;

    /* renamed from: g */
    private int f49789g;

    /* renamed from: c */
    private final C5001a[] f49785c = new C5001a[5];

    /* renamed from: b */
    private final ArrayList<C5001a> f49784b = new ArrayList<>();

    /* renamed from: d */
    private int f49786d = -1;

    /* renamed from: com.yandex.mobile.ads.impl.e21$a */
    public static class C5001a {

        /* renamed from: a */
        public int f49790a;

        /* renamed from: b */
        public int f49791b;

        /* renamed from: c */
        public float f49792c;

        private C5001a() {
        }

        public /* synthetic */ C5001a(int i2) {
            this();
        }
    }

    public e21(int i2) {
        this.f49783a = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m23991a(C5001a c5001a, C5001a c5001a2) {
        return c5001a.f49790a - c5001a2.f49790a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m23992b(C5001a c5001a, C5001a c5001a2) {
        return Float.compare(c5001a.f49792c, c5001a2.f49792c);
    }

    /* renamed from: a */
    public final void m23996a(int i2, float f2) {
        C5001a c5001a;
        if (this.f49786d != 1) {
            Collections.sort(this.f49784b, f49781h);
            this.f49786d = 1;
        }
        int i3 = this.f49789g;
        int i4 = 0;
        if (i3 > 0) {
            C5001a[] c5001aArr = this.f49785c;
            int i5 = i3 - 1;
            this.f49789g = i5;
            c5001a = c5001aArr[i5];
        } else {
            c5001a = new C5001a(i4);
        }
        int i6 = this.f49787e;
        this.f49787e = i6 + 1;
        c5001a.f49790a = i6;
        c5001a.f49791b = i2;
        c5001a.f49792c = f2;
        this.f49784b.add(c5001a);
        this.f49788f += i2;
        while (true) {
            int i7 = this.f49788f;
            int i8 = this.f49783a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            C5001a c5001a2 = this.f49784b.get(0);
            int i10 = c5001a2.f49791b;
            if (i10 <= i9) {
                this.f49788f -= i10;
                this.f49784b.remove(0);
                int i11 = this.f49789g;
                if (i11 < 5) {
                    C5001a[] c5001aArr2 = this.f49785c;
                    this.f49789g = i11 + 1;
                    c5001aArr2[i11] = c5001a2;
                }
            } else {
                c5001a2.f49791b = i10 - i9;
                this.f49788f -= i9;
            }
        }
    }

    /* renamed from: b */
    public final void m23997b() {
        this.f49784b.clear();
        this.f49786d = -1;
        this.f49787e = 0;
        this.f49788f = 0;
    }

    /* renamed from: a */
    public final float m23995a() {
        if (this.f49786d != 0) {
            Collections.sort(this.f49784b, f49782i);
            this.f49786d = 0;
        }
        float f2 = 0.5f * this.f49788f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f49784b.size(); i3++) {
            C5001a c5001a = this.f49784b.get(i3);
            i2 += c5001a.f49791b;
            if (i2 >= f2) {
                return c5001a.f49792c;
            }
        }
        if (this.f49784b.isEmpty()) {
            return Float.NaN;
        }
        return this.f49784b.get(r0.size() - 1).f49792c;
    }
}
