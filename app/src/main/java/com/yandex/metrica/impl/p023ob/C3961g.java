package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.g */
/* loaded from: classes2.dex */
public final class C3961g {

    /* renamed from: a */
    public static final int[] f45149a = new int[0];

    /* renamed from: b */
    public static final String[] f45150b = new String[0];

    /* renamed from: c */
    public static final byte[][] f45151c = new byte[0][];

    /* renamed from: d */
    public static final byte[] f45152d = new byte[0];

    /* renamed from: a */
    public static int m19919a(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    /* renamed from: a */
    public static final int m19920a(C3805a c3805a, int i2) throws IOException {
        int m19546b = c3805a.m19546b();
        c3805a.m19555f(i2);
        int i3 = 1;
        while (c3805a.m19562l() == i2) {
            c3805a.m19555f(i2);
            i3++;
        }
        c3805a.m19553e(m19546b);
        return i3;
    }
}
