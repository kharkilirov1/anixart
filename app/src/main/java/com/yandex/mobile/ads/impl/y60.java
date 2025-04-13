package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.embedded.guava.collect.C4705u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class y60 {
    /* renamed from: a */
    public static boolean m29864a(Collection collection, ur0 ur0Var) {
        Iterator it = collection.iterator();
        Objects.requireNonNull(ur0Var, "predicate");
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (ur0Var.apply(it.next())) {
                break;
            }
            i2++;
        }
        return i2 != -1;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m29865b(Collection collection, ur0 ur0Var) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            C4705u.m22078a(collection.iterator(), ur0Var);
            return;
        }
        List list = (List) collection;
        Objects.requireNonNull(ur0Var);
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            if (!ur0Var.apply(obj)) {
                if (i3 > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i3; size--) {
                            if (ur0Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i4 = i3 - 1; i4 >= i2; i4--) {
                            list.remove(i4);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i3; size2--) {
                            if (ur0Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i5 = i3 - 1; i5 >= i2; i5--) {
                            list.remove(i5);
                        }
                        return;
                    }
                }
                i2++;
            }
        }
        list.subList(i2, list.size()).clear();
    }
}
