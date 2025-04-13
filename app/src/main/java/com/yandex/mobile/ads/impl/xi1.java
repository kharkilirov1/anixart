package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class xi1 implements w41 {

    /* renamed from: a */
    private final List<ti1> f56485a;

    /* renamed from: b */
    private final long[] f56486b;

    /* renamed from: c */
    private final long[] f56487c;

    public xi1(ArrayList arrayList) {
        this.f56485a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f56486b = new long[arrayList.size() * 2];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ti1 ti1Var = (ti1) arrayList.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f56486b;
            jArr[i3] = ti1Var.f55129b;
            jArr[i3 + 1] = ti1Var.f55130c;
        }
        long[] jArr2 = this.f56486b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f56487c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        int m28095a = s91.m28095a(this.f56487c, j2, false);
        if (m28095a < this.f56487c.length) {
            return m28095a;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f56485a.size(); i2++) {
            long[] jArr = this.f56486b;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                ti1 ti1Var = this.f56485a.get(i2);
                C5751sl c5751sl = ti1Var.f55128a;
                if (c5751sl.f54721e == -3.4028235E38f) {
                    arrayList2.add(ti1Var);
                } else {
                    arrayList.add(c5751sl);
                }
            }
        }
        Collections.sort(arrayList2, C4891by.f49020p);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((ti1) arrayList2.get(i4)).f55128a.m28299a().m28302a(1, (-1) - i4).m28305a());
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        return this.f56487c.length;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        C5220ia.m25473a(i2 >= 0);
        C5220ia.m25473a(i2 < this.f56487c.length);
        return this.f56487c[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m29757a(ti1 ti1Var, ti1 ti1Var2) {
        return Long.compare(ti1Var.f55129b, ti1Var2.f55129b);
    }
}
