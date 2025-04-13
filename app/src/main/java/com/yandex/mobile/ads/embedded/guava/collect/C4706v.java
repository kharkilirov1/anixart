package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.gn0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.v */
/* loaded from: classes2.dex */
public final class C4706v {
    /* renamed from: a */
    public static boolean m22079a(List<?> list, @CheckForNull Object obj) {
        Objects.requireNonNull(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!gn0.m24948a(list.get(i2), list2.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<?> it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !gn0.m24948a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
