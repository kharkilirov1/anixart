package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ch0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.kc */
/* loaded from: classes3.dex */
public final class C5332kc {

    /* renamed from: a */
    public final List<byte[]> f51936a;

    /* renamed from: b */
    public final int f51937b;

    /* renamed from: c */
    public final int f51938c;

    /* renamed from: d */
    public final int f51939d;

    /* renamed from: e */
    public final float f51940e;

    /* renamed from: f */
    @Nullable
    public final String f51941f;

    private C5332kc(ArrayList arrayList, int i2, int i3, int i4, float f2, @Nullable String str) {
        this.f51936a = arrayList;
        this.f51937b = i2;
        this.f51938c = i3;
        this.f51939d = i4;
        this.f51940e = f2;
        this.f51941f = str;
    }

    /* renamed from: a */
    public static C5332kc m26104a(ap0 ap0Var) throws ep0 {
        String str;
        int i2;
        float f2;
        try {
            ap0Var.m22593f(4);
            int m22607t = (ap0Var.m22607t() & 3) + 1;
            if (m22607t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m22607t2 = ap0Var.m22607t() & 31;
            for (int i3 = 0; i3 < m22607t2; i3++) {
                int m22613z = ap0Var.m22613z();
                int m22588d = ap0Var.m22588d();
                ap0Var.m22593f(m22613z);
                arrayList.add(C5081fj.m24609a(ap0Var.m22587c(), m22588d, m22613z));
            }
            int m22607t3 = ap0Var.m22607t();
            for (int i4 = 0; i4 < m22607t3; i4++) {
                int m22613z2 = ap0Var.m22613z();
                int m22588d2 = ap0Var.m22588d();
                ap0Var.m22593f(m22613z2);
                arrayList.add(C5081fj.m24609a(ap0Var.m22587c(), m22588d2, m22613z2));
            }
            int i5 = -1;
            if (m22607t2 > 0) {
                ch0.C4925c m23264b = ch0.m23264b((byte[]) arrayList.get(0), m22607t, ((byte[]) arrayList.get(0)).length);
                int i6 = m23264b.f49261e;
                int i7 = m23264b.f49262f;
                float f3 = m23264b.f49263g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(m23264b.f49257a), Integer.valueOf(m23264b.f49258b), Integer.valueOf(m23264b.f49259c));
                f2 = f3;
                i5 = i7;
                i2 = i6;
            } else {
                str = null;
                i2 = -1;
                f2 = 1.0f;
            }
            return new C5332kc(arrayList, m22607t, i2, i5, f2, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ep0.m24225a("Error parsing AVC config", e2);
        }
    }
}
