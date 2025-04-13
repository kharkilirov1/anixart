package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.gj */
/* loaded from: classes3.dex */
public final class C5130gj implements InterfaceC5589pf {

    /* renamed from: f */
    public static final InterfaceC5589pf.a<C5130gj> f50624f = dn1.f49715z;

    /* renamed from: a */
    public final int f50625a;

    /* renamed from: b */
    public final int f50626b;

    /* renamed from: c */
    public final int f50627c;

    /* renamed from: d */
    @Nullable
    public final byte[] f50628d;

    /* renamed from: e */
    private int f50629e;

    public C5130gj(int i2, int i3, int i4, @Nullable byte[] bArr) {
        this.f50625a = i2;
        this.f50626b = i3;
        this.f50627c = i4;
        this.f50628d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C5130gj m24904a(Bundle bundle) {
        return new C5130gj(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5130gj.class != obj.getClass()) {
            return false;
        }
        C5130gj c5130gj = (C5130gj) obj;
        return this.f50625a == c5130gj.f50625a && this.f50626b == c5130gj.f50626b && this.f50627c == c5130gj.f50627c && Arrays.equals(this.f50628d, c5130gj.f50628d);
    }

    public final int hashCode() {
        if (this.f50629e == 0) {
            this.f50629e = Arrays.hashCode(this.f50628d) + ((((((this.f50625a + 527) * 31) + this.f50626b) * 31) + this.f50627c) * 31);
        }
        return this.f50629e;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ColorInfo(");
        m26356a.append(this.f50625a);
        m26356a.append(", ");
        m26356a.append(this.f50626b);
        m26356a.append(", ");
        m26356a.append(this.f50627c);
        m26356a.append(", ");
        m26356a.append(this.f50628d != null);
        m26356a.append(")");
        return m26356a.toString();
    }
}
