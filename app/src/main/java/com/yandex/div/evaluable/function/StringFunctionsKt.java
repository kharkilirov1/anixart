package com.yandex.div.evaluable.function;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

/* compiled from: StringFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-evaluable"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StringFunctionsKt {
    /* renamed from: a */
    public static final String m17243a(int i2, String str) {
        if ((str.length() == 0) || i2 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2);
        Iterator<Integer> it = RangesKt.m32243j(0, i2).iterator();
        while (((IntProgressionIterator) it).getF63385d()) {
            sb.append(str.charAt(((IntIterator) it).mo1135a() % str.length()));
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
