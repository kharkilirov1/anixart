package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.mo */
/* loaded from: classes2.dex */
public class C4142mo implements Comparator<C3783Z2> {
    @Override // java.util.Comparator
    public int compare(C3783Z2 c3783z2, C3783Z2 c3783z22) {
        C3783Z2 c3783z23 = c3783z2;
        C3783Z2 c3783z24 = c3783z22;
        return (TextUtils.equals(c3783z23.f44602a, c3783z24.f44602a) && TextUtils.equals(c3783z23.f44603b, c3783z24.f44603b)) ? 0 : 10;
    }
}
