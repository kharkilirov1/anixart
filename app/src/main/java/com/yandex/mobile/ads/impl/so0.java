package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class so0 {
    /* renamed from: a */
    public static int m28343a(@NonNull Rect rect, @NonNull List list) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(rect.left));
        treeSet.add(Integer.valueOf(rect.right));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect rect2 = (Rect) it.next();
            treeSet.add(Integer.valueOf(rect2.left));
            treeSet.add(Integer.valueOf(rect2.right));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(rect.top));
        treeSet2.add(Integer.valueOf(rect.bottom));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Rect rect3 = (Rect) it2.next();
            treeSet2.add(Integer.valueOf(rect3.top));
            treeSet2.add(Integer.valueOf(rect3.bottom));
        }
        ArrayList arrayList2 = new ArrayList(treeSet2);
        rect.left = Collections.binarySearch(arrayList, Integer.valueOf(rect.left));
        rect.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect.top));
        rect.right = Collections.binarySearch(arrayList, Integer.valueOf(rect.right));
        rect.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect.bottom));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Rect rect4 = (Rect) it3.next();
            rect4.left = Collections.binarySearch(arrayList, Integer.valueOf(rect4.left));
            rect4.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect4.top));
            rect4.right = Collections.binarySearch(arrayList, Integer.valueOf(rect4.right));
            rect4.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect4.bottom));
        }
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, arrayList.size() - 1, arrayList2.size() - 1);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Rect rect5 = (Rect) it4.next();
            for (int i2 = rect5.left; i2 < rect5.right; i2++) {
                for (int i3 = rect5.top; i3 < rect5.bottom; i3++) {
                    bArr[i2][i3] = 1;
                }
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size() - 1; i5++) {
            for (int i6 = 0; i6 < arrayList2.size() - 1; i6++) {
                if (bArr[i5][i6] == 1) {
                    Integer valueOf = Integer.valueOf(((Integer) arrayList.get(i5 + 1)).intValue() - ((Integer) arrayList.get(i5)).intValue());
                    i4 = (Integer.valueOf(((Integer) arrayList2.get(i6 + 1)).intValue() - ((Integer) arrayList2.get(i6)).intValue()).intValue() * valueOf.intValue()) + i4;
                }
            }
        }
        return i4;
    }
}
