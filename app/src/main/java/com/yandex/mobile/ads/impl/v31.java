package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class v31 implements w41 {

    /* renamed from: a */
    private final List<List<C5751sl>> f55746a;

    /* renamed from: b */
    private final List<Long> f55747b;

    public v31(ArrayList arrayList, ArrayList arrayList2) {
        this.f55746a = arrayList;
        this.f55747b = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        int i2;
        List<Long> list = this.f55747b;
        Long valueOf = Long.valueOf(j2);
        int i3 = s91.f54530a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i2 = binarySearch;
        }
        if (i2 < this.f55747b.size()) {
            return i2;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        int i2;
        List<Long> list = this.f55747b;
        Long valueOf = Long.valueOf(j2);
        int i3 = s91.f54530a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i2 = binarySearch + 1;
        }
        return i2 == -1 ? Collections.emptyList() : this.f55746a.get(i2);
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        return this.f55747b.size();
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        C5220ia.m25473a(i2 >= 0);
        C5220ia.m25473a(i2 < this.f55747b.size());
        return this.f55747b.get(i2).longValue();
    }
}
