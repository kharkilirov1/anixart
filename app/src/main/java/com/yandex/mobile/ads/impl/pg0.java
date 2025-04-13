package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pg0 {
    /* renamed from: a */
    public static double m27325a(@NotNull List imageValues) {
        Object next;
        Intrinsics.m32179h(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(imageValues, 10));
        Iterator it = imageValues.iterator();
        while (true) {
            double d = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            if (((z10) it.next()).m30034a() != 0) {
                d = r2.m30043e() / r2.m30034a();
            }
            arrayList.add(Double.valueOf(d));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(MathKt.m32222b(((Number) it2.next()).doubleValue() * 1000)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int i2 = 1;
            if (!it3.hasNext()) {
                break;
            }
            int intValue = ((Number) it3.next()).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(intValue));
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            linkedHashMap.put(valueOf, Integer.valueOf(i2));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int intValue3 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue2 < intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (num2 != null && ((Number) entry2.getValue()).intValue() == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Map.Entry) it5.next()).getKey()).intValue() / 1000));
        }
        List m32016c0 = CollectionsKt.m32016c0(arrayList3);
        int size = m32016c0.size();
        int i3 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i4 = size % 2;
        if (i4 + ((((i4 ^ 2) & ((-i4) | i4)) >> 31) & 2) == 1) {
            return ((Number) m32016c0.get(i3)).doubleValue();
        }
        return (((Number) m32016c0.get(i3 - 1)).doubleValue() + ((Number) m32016c0.get(i3)).doubleValue()) / 2;
    }
}
