package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hy */
/* loaded from: classes3.dex */
public final class C5204hy implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: a */
    @NotNull
    private final String[] f51148a;

    /* renamed from: com.yandex.mobile.ads.impl.hy$a */
    public static final class a {

        /* renamed from: a */
        @NotNull
        private final ArrayList f51149a = new ArrayList(20);

        @NotNull
        /* renamed from: a */
        public final void m25387a(@NotNull String line) {
            Intrinsics.m32179h(line, "line");
            int m33877C = StringsKt.m33877C(line, ':', 1, false, 4, null);
            if (m33877C != -1) {
                String substring = line.substring(0, m33877C);
                Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(m33877C + 1);
                Intrinsics.m32178g(substring2, "this as java.lang.String).substring(startIndex)");
                m25391b(substring, substring2);
                return;
            }
            if (line.charAt(0) != ':') {
                m25391b("", line);
                return;
            }
            String substring3 = line.substring(1);
            Intrinsics.m32178g(substring3, "this as java.lang.String).substring(startIndex)");
            m25391b("", substring3);
        }

        @NotNull
        /* renamed from: b */
        public final ArrayList m25390b() {
            return this.f51149a;
        }

        @NotNull
        /* renamed from: c */
        public final void m25392c(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            b.m25398b(name);
            b.m25399b(value, name);
            m25389b(name);
            m25391b(name, value);
        }

        @NotNull
        /* renamed from: b */
        public final void m25391b(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            this.f51149a.add(name);
            this.f51149a.add(StringsKt.m33914n0(value).toString());
        }

        @NotNull
        /* renamed from: b */
        public final a m25389b(@NotNull String name) {
            Intrinsics.m32179h(name, "name");
            int i2 = 0;
            while (i2 < this.f51149a.size()) {
                if (StringsKt.m33927y(name, (String) this.f51149a.get(i2), true)) {
                    this.f51149a.remove(i2);
                    this.f51149a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m25388a(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            b.m25398b(name);
            b.m25399b(value, name);
            m25391b(name, value);
        }

        @NotNull
        /* renamed from: a */
        public final C5204hy m25386a() {
            Object[] array = this.f51149a.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C5204hy((String[]) array, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hy$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(int i2) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m25398b(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (!('!' <= charAt && charAt < 127)) {
                    throw new IllegalArgumentException(t91.m28503a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                }
            }
        }

        /* renamed from: a */
        public static final String m25395a(String[] strArr, String str) {
            int length = strArr.length - 2;
            int m32132a = ProgressionUtilKt.m32132a(length, 0, -2);
            if (m32132a <= length) {
                while (!StringsKt.m33927y(str, strArr[length], true)) {
                    if (length != m32132a) {
                        length -= 2;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public static C5204hy m25394a(@NotNull String... namesAndValues) {
            Intrinsics.m32179h(namesAndValues, "namesAndValues");
            int i2 = 0;
            if (namesAndValues.length % 2 == 0) {
                Object clone = namesAndValues.clone();
                Intrinsics.m32177f(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr = (String[]) clone;
                int length = strArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    String str = strArr[i3];
                    if (str != null) {
                        strArr[i3] = StringsKt.m33914n0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int m32132a = ProgressionUtilKt.m32132a(0, strArr.length - 1, 2);
                if (m32132a >= 0) {
                    int i4 = 0;
                    while (true) {
                        String str2 = strArr[i4];
                        String str3 = strArr[i4 + 1];
                        m25398b(str2);
                        m25399b(str3, str2);
                        if (i4 == m32132a) {
                            break;
                        }
                        i4 += 2;
                    }
                }
                return new C5204hy(strArr, i2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[LOOP:0: B:2:0x0006->B:13:0x0064, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m25399b(java.lang.String r6, java.lang.String r7) {
            /*
                int r0 = r6.length()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L67
                char r3 = r6.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L21
                r4 = 32
                if (r4 > r3) goto L1b
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L1b
                r4 = 1
                goto L1c
            L1b:
                r4 = 0
            L1c:
                if (r4 == 0) goto L1f
                goto L21
            L1f:
                r4 = 0
                goto L22
            L21:
                r4 = 1
            L22:
                if (r4 != 0) goto L64
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r4[r5] = r1
                r1 = 2
                r4[r1] = r7
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = com.yandex.mobile.ads.impl.t91.m28503a(r1, r4)
                r0.append(r1)
                boolean r7 = com.yandex.mobile.ads.impl.t91.m28531d(r7)
                if (r7 == 0) goto L4d
                java.lang.String r6 = ""
                goto L53
            L4d:
                java.lang.String r7 = ": "
                java.lang.String r6 = com.yandex.mobile.ads.impl.um1.m29049a(r7, r6)
            L53:
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            L64:
                int r2 = r2 + 1
                goto L6
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5204hy.b.m25399b(java.lang.String, java.lang.String):void");
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public static C5204hy m25393a(@NotNull Map map) {
            Intrinsics.m32179h(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String obj = StringsKt.m33914n0(str).toString();
                String obj2 = StringsKt.m33914n0(str2).toString();
                m25398b(obj);
                m25399b(obj2, obj);
                strArr[i3] = obj;
                strArr[i3 + 1] = obj2;
                i3 += 2;
            }
            return new C5204hy(strArr, i2);
        }
    }

    static {
        new b(0);
    }

    private C5204hy(String[] strArr) {
        this.f51148a = strArr;
    }

    public /* synthetic */ C5204hy(String[] strArr, int i2) {
        this(strArr);
    }

    @Nullable
    /* renamed from: a */
    public final String m25381a(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        return b.m25395a(this.f51148a, name);
    }

    @NotNull
    /* renamed from: b */
    public final String m25383b(int i2) {
        return this.f51148a[(i2 * 2) + 1];
    }

    @NotNull
    /* renamed from: c */
    public final TreeMap m25384c() {
        StringsKt.m33875A(StringCompanionObject.f63355a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String m25380a = m25380a(i2);
            Locale US = Locale.US;
            Intrinsics.m32178g(US, "US");
            String lowerCase = m25380a.toLowerCase(US);
            Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(m25383b(i2));
        }
        return treeMap;
    }

    @NotNull
    /* renamed from: d */
    public final List m25385d() {
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.m33927y("Set-Cookie", m25380a(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m25383b(i2));
            }
        }
        if (arrayList == null) {
            return EmptyList.f63144b;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.m32178g(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C5204hy) && Arrays.equals(this.f51148a, ((C5204hy) obj).f51148a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f51148a);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = new Pair(m25380a(i2), m25383b(i2));
        }
        return ArrayIteratorKt.m32154a(pairArr);
    }

    @JvmName
    public final int size() {
        return this.f51148a.length / 2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String m25380a = m25380a(i2);
            String m25383b = m25383b(i2);
            sb.append(m25380a);
            sb.append(": ");
            if (t91.m28531d(m25380a)) {
                m25383b = "██";
            }
            sb.append(m25383b);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: a */
    public final String m25380a(int i2) {
        return this.f51148a[i2 * 2];
    }

    @NotNull
    /* renamed from: b */
    public final a m25382b() {
        a aVar = new a();
        CollectionsKt.m32022h(aVar.m25390b(), this.f51148a);
        return aVar;
    }
}
