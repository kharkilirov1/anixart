package com.swiftsoft.anixartd.utils;

import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: Police.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Police;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Police {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0462  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m16344a(@org.jetbrains.annotations.NotNull android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.utils.Police.m16344a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public final String m16345b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Integer.toHexString(bArr[i2] & 255).length() == 1) {
                sb.append("0");
                sb.append(Integer.toHexString(bArr[i2] & 255));
            } else {
                sb.append(Integer.toHexString(bArr[i2] & 255));
            }
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "md5StrBuff.toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: c */
    public final String m16346c(int i2) {
        return String.valueOf(i2 - 2);
    }

    /* renamed from: d */
    public final String m16347d(int i2, List<Integer> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
        }
        IntRange intRange = new IntRange(1, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(intRange, 10));
        IntIterator it2 = intRange.iterator();
        while (((IntProgressionIterator) it2).f63385d) {
            it2.mo1135a();
            arrayList.add(Character.valueOf((char) ((Number) CollectionsKt.m32004Q(list, Random.f63365b)).intValue()));
        }
        return CollectionsKt.m31989B(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    /* renamed from: e */
    public final String m16348e(@NotNull String str, int i2) {
        int parseInt;
        String m16349f = m16349f(12);
        int parseInt2 = Integer.parseInt(m16346c(4));
        String m16349f2 = m16349f(7);
        int parseInt3 = Integer.parseInt(m16346c(5));
        int parseInt4 = Integer.parseInt(m16349f(9));
        int parseInt5 = Integer.parseInt(m16346c(3));
        String m16346c = m16346c(10);
        int parseInt6 = i2 % (((Integer.parseInt(m16349f2) * parseInt2) - parseInt2) + ((Integer.parseInt(m16349f) * parseInt2) + parseInt2));
        if (parseInt6 == 0) {
            return str;
        }
        char[] cArr = new char[str.length()];
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if ('A' <= charAt && charAt < '[') {
                charAt = (char) (charAt + parseInt6);
                if (Intrinsics.m32181j(charAt, 90) > 0) {
                    parseInt = charAt - ((Integer.parseInt(m16349f) * parseInt3) - parseInt5);
                    charAt = (char) parseInt;
                    cArr[i3] = charAt;
                } else {
                    cArr[i3] = charAt;
                }
            } else {
                if ('a' <= charAt && charAt < '{') {
                    charAt = (char) (charAt + parseInt6);
                    if (Intrinsics.m32181j(charAt, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor) > 0) {
                        parseInt = charAt - ((Integer.parseInt(m16346c) * Integer.parseInt(m16349f2)) - parseInt4);
                        charAt = (char) parseInt;
                    }
                }
                cArr[i3] = charAt;
            }
        }
        return ArraysKt.m31938N(cArr, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    /* renamed from: f */
    public final String m16349f(int i2) {
        return String.valueOf(i2 - 3);
    }

    /* renamed from: g */
    public final String m16350g(String str, int i2) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int length = stringBuffer.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (Character.isDigit(stringBuffer.charAt(i3))) {
                int charAt = ((byte) stringBuffer.charAt(i3)) - i2;
                if (charAt < 48) {
                    charAt += 10;
                }
                stringBuffer.setCharAt(i3, (char) charAt);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.m32178g(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: h */
    public final int m16351h(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int length = stringBuffer.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (Character.isDigit(stringBuffer.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: i */
    public final String m16352i(String str) {
        char[] charArray = str.toCharArray();
        Intrinsics.m32178g(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i2 = length / 2;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (length - i3) - 1;
            char c2 = charArray[i4];
            charArray[i4] = charArray[i3];
            charArray[i3] = c2;
        }
        return ArraysKt.m31938N(charArray, "", null, null, 0, null, null, 62, null);
    }
}
