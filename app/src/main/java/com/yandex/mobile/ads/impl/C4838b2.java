package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.b2 */
/* loaded from: classes3.dex */
final class C4838b2 {

    /* renamed from: com.yandex.mobile.ads.impl.b2$a */
    public static class a implements Comparator<m50> {
        private a() {
        }

        @Override // java.util.Comparator
        public final int compare(@NonNull m50 m50Var, @NonNull m50 m50Var2) {
            long value = m50Var.getAdBreakPosition().getValue() - m50Var2.getAdBreakPosition().getValue();
            if (value < 0) {
                return -1;
            }
            return value > 0 ? 1 : 0;
        }

        public /* synthetic */ a(int i2) {
            this();
        }
    }

    @NonNull
    /* renamed from: a */
    public static ArrayList m22710a(@NonNull List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new a(0));
        return new ArrayList(arrayList);
    }
}
