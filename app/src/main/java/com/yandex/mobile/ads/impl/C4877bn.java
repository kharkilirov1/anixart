package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.yandex.mobile.ads.impl.InterfaceC5476n8;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.bn */
/* loaded from: classes3.dex */
public final class C4877bn implements InterfaceC5476n8 {

    /* renamed from: a */
    private final boolean f48927a;

    /* renamed from: b */
    private final int f48928b;

    /* renamed from: c */
    @Nullable
    private final byte[] f48929c;

    /* renamed from: d */
    private int f48930d;

    /* renamed from: e */
    private int f48931e;

    /* renamed from: f */
    private int f48932f;

    /* renamed from: g */
    private C5429m8[] f48933g;

    public C4877bn() {
        this(0);
    }

    /* renamed from: a */
    public final synchronized void m22869a(int i2) {
        boolean z = i2 < this.f48930d;
        this.f48930d = i2;
        if (z) {
            m22875e();
        }
    }

    /* renamed from: b */
    public final int m22872b() {
        return this.f48928b;
    }

    /* renamed from: c */
    public final synchronized int m22873c() {
        return this.f48931e * this.f48928b;
    }

    /* renamed from: d */
    public final synchronized void m22874d() {
        if (this.f48927a) {
            m22869a(0);
        }
    }

    /* renamed from: e */
    public final synchronized void m22875e() {
        int i2 = 0;
        int max = Math.max(0, s91.m28087a(this.f48930d, this.f48928b) - this.f48931e);
        int i3 = this.f48932f;
        if (max >= i3) {
            return;
        }
        if (this.f48929c != null) {
            int i4 = i3 - 1;
            while (i2 <= i4) {
                C5429m8 c5429m8 = this.f48933g[i2];
                Objects.requireNonNull(c5429m8);
                if (c5429m8.f52592a == this.f48929c) {
                    i2++;
                } else {
                    C5429m8 c5429m82 = this.f48933g[i4];
                    Objects.requireNonNull(c5429m82);
                    if (c5429m82.f52592a != this.f48929c) {
                        i4--;
                    } else {
                        C5429m8[] c5429m8Arr = this.f48933g;
                        c5429m8Arr[i2] = c5429m82;
                        c5429m8Arr[i4] = c5429m8;
                        i4--;
                        i2++;
                    }
                }
            }
            max = Math.max(max, i2);
            if (max >= this.f48932f) {
                return;
            }
        }
        Arrays.fill(this.f48933g, max, this.f48932f, (Object) null);
        this.f48932f = max;
    }

    public C4877bn(int i2) {
        this.f48927a = true;
        this.f48928b = TextBuffer.MAX_SEGMENT_LEN;
        this.f48932f = 0;
        this.f48933g = new C5429m8[100];
        this.f48929c = null;
    }

    /* renamed from: a */
    public final synchronized C5429m8 m22868a() {
        C5429m8 c5429m8;
        int i2 = this.f48931e + 1;
        this.f48931e = i2;
        int i3 = this.f48932f;
        if (i3 > 0) {
            C5429m8[] c5429m8Arr = this.f48933g;
            int i4 = i3 - 1;
            this.f48932f = i4;
            c5429m8 = c5429m8Arr[i4];
            Objects.requireNonNull(c5429m8);
            this.f48933g[this.f48932f] = null;
        } else {
            C5429m8 c5429m82 = new C5429m8(0, new byte[this.f48928b]);
            C5429m8[] c5429m8Arr2 = this.f48933g;
            if (i2 > c5429m8Arr2.length) {
                this.f48933g = (C5429m8[]) Arrays.copyOf(c5429m8Arr2, c5429m8Arr2.length * 2);
            }
            c5429m8 = c5429m82;
        }
        return c5429m8;
    }

    /* renamed from: a */
    public final synchronized void m22870a(C5429m8 c5429m8) {
        C5429m8[] c5429m8Arr = this.f48933g;
        int i2 = this.f48932f;
        this.f48932f = i2 + 1;
        c5429m8Arr[i2] = c5429m8;
        this.f48931e--;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void m22871a(@Nullable InterfaceC5476n8.a aVar) {
        while (aVar != null) {
            C5429m8[] c5429m8Arr = this.f48933g;
            int i2 = this.f48932f;
            this.f48932f = i2 + 1;
            c5429m8Arr[i2] = aVar.mo26815a();
            this.f48931e--;
            aVar = aVar.next();
        }
        notifyAll();
    }
}
