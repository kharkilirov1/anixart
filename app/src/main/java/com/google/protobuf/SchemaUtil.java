package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class SchemaUtil {

    /* renamed from: a */
    public static final Class<?> f24337a;

    /* renamed from: b */
    public static final UnknownFieldSchema<?, ?> f24338b;

    /* renamed from: c */
    public static final UnknownFieldSchema<?, ?> f24339c;

    /* renamed from: d */
    public static final UnknownFieldSchema<?, ?> f24340d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f24337a = cls;
        f24338b = m13575A(false);
        f24339c = m13575A(true);
        f24340d = new UnknownFieldSetLiteSchema();
    }

    /* renamed from: A */
    public static UnknownFieldSchema<?, ?> m13575A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (UnknownFieldSchema) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void m13576B(ExtensionSchema<FT> extensionSchema, T t, T t2) {
        FieldSet<FT> mo13371c = extensionSchema.mo13371c(t2);
        if (mo13371c.m13393i()) {
            return;
        }
        FieldSet<FT> mo13372d = extensionSchema.mo13372d(t);
        Objects.requireNonNull(mo13372d);
        for (int i2 = 0; i2 < mo13371c.f24155a.m13626d(); i2++) {
            mo13372d.m13397n(mo13371c.f24155a.m13625c(i2));
        }
        Iterator<Map.Entry<FT, Object>> it = mo13371c.f24155a.m13627f().iterator();
        while (it.hasNext()) {
            mo13372d.m13397n(it.next());
        }
    }

    /* renamed from: C */
    public static boolean m13577C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static <UT, UB> UB m13578D(int i2, int i3, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.mo13659m();
        }
        unknownFieldSchema.mo13651e(ub, i2, i3);
        return ub;
    }

    /* renamed from: E */
    public static void m13579E(int i2, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13084C(i2, list, z);
    }

    /* renamed from: F */
    public static void m13580F(int i2, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13094P(i2, list);
    }

    /* renamed from: G */
    public static void m13581G(int i2, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13093N(i2, list, z);
    }

    /* renamed from: H */
    public static void m13582H(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13092M(i2, list, z);
    }

    /* renamed from: I */
    public static void m13583I(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13083B(i2, list, z);
    }

    /* renamed from: J */
    public static void m13584J(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13118y(i2, list, z);
    }

    /* renamed from: K */
    public static void m13585K(int i2, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13105c(i2, list, z);
    }

    /* renamed from: L */
    public static void m13586L(int i2, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13103b(i2, list, schema);
    }

    /* renamed from: M */
    public static void m13587M(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13115q(i2, list, z);
    }

    /* renamed from: N */
    public static void m13588N(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13091L(i2, list, z);
    }

    /* renamed from: O */
    public static void m13589O(int i2, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13101a(i2, list, schema);
    }

    /* renamed from: P */
    public static void m13590P(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13119z(i2, list, z);
    }

    /* renamed from: Q */
    public static void m13591Q(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13111h(i2, list, z);
    }

    /* renamed from: R */
    public static void m13592R(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13089J(i2, list, z);
    }

    /* renamed from: S */
    public static void m13593S(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13087F(i2, list, z);
    }

    /* renamed from: T */
    public static void m13594T(int i2, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13114m(i2, list);
    }

    /* renamed from: U */
    public static void m13595U(int i2, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13086E(i2, list, z);
    }

    /* renamed from: V */
    public static void m13596V(int i2, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.mo13112i(i2, list, z);
    }

    /* renamed from: a */
    public static int m13597a(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.m13252T(i2, true) * size;
        }
        return CodedOutputStream.m13265g0(size) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: b */
    public static int m13598b(int i2, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13274p0 = CodedOutputStream.m13274p0(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            m13274p0 += CodedOutputStream.m13254V(list.get(i3));
        }
        return m13274p0;
    }

    /* renamed from: c */
    public static int m13599c(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13600d = m13600d(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13600d;
        }
        return CodedOutputStream.m13265g0(m13600d) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: d */
    public static int m13600d(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13262d0(intArrayList.m13451f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13262d0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static int m13601e(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.m13257Y(i2, 0) * size;
        }
        return CodedOutputStream.m13265g0(size * 4) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: f */
    public static int m13602f(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: g */
    public static int m13603g(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.m13258Z(i2, 0L) * size;
        }
        return CodedOutputStream.m13265g0(size * 8) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: h */
    public static int m13604h(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: i */
    public static int m13605i(int i2, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += CodedOutputStream.m13260b0(i2, list.get(i4), schema);
        }
        return i3;
    }

    /* renamed from: j */
    public static int m13606j(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13607k = m13607k(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13607k;
        }
        return CodedOutputStream.m13265g0(m13607k) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: k */
    public static int m13607k(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13262d0(intArrayList.m13451f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13262d0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static int m13608l(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m13609m = m13609m(list);
        if (z) {
            return CodedOutputStream.m13265g0(m13609m) + CodedOutputStream.m13274p0(i2);
        }
        return (CodedOutputStream.m13274p0(i2) * list.size()) + m13609m;
    }

    /* renamed from: m */
    public static int m13609m(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13278t0(longArrayList.m13485f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13278t0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: n */
    public static int m13610n(int i2, Object obj, Schema schema) {
        int m13274p0;
        int m13265g0;
        if (obj instanceof LazyFieldLite) {
            m13274p0 = CodedOutputStream.m13274p0(i2);
            m13265g0 = CodedOutputStream.m13264f0((LazyFieldLite) obj);
        } else {
            m13274p0 = CodedOutputStream.m13274p0(i2);
            m13265g0 = CodedOutputStream.m13265g0(((AbstractMessageLite) ((MessageLite) obj)).m12979k(schema));
        }
        return m13265g0 + m13274p0;
    }

    /* renamed from: o */
    public static int m13611o(int i2, List<?> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13274p0 = CodedOutputStream.m13274p0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            m13274p0 = obj instanceof LazyFieldLite ? CodedOutputStream.m13264f0((LazyFieldLite) obj) + m13274p0 : m13274p0 + CodedOutputStream.m13265g0(((AbstractMessageLite) ((MessageLite) obj)).m12979k(schema));
        }
        return m13274p0;
    }

    /* renamed from: p */
    public static int m13612p(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13613q = m13613q(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13613q;
        }
        return CodedOutputStream.m13265g0(m13613q) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: q */
    public static int m13613q(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13269k0(intArrayList.m13451f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13269k0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: r */
    public static int m13614r(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13615s = m13615s(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13615s;
        }
        return CodedOutputStream.m13265g0(m13615s) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: s */
    public static int m13615s(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13271m0(longArrayList.m13485f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13271m0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public static int m13616t(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int m13274p0 = CodedOutputStream.m13274p0(i2) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < size) {
                Object mo13473Z0 = lazyStringList.mo13473Z0(i3);
                m13274p0 = (mo13473Z0 instanceof ByteString ? CodedOutputStream.m13254V((ByteString) mo13473Z0) : CodedOutputStream.m13273o0((String) mo13473Z0)) + m13274p0;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                m13274p0 = (obj instanceof ByteString ? CodedOutputStream.m13254V((ByteString) obj) : CodedOutputStream.m13273o0((String) obj)) + m13274p0;
                i3++;
            }
        }
        return m13274p0;
    }

    /* renamed from: u */
    public static int m13617u(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13618v = m13618v(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13618v;
        }
        return CodedOutputStream.m13265g0(m13618v) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: v */
    public static int m13618v(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13276r0(intArrayList.m13451f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13276r0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: w */
    public static int m13619w(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m13620x = m13620x(list);
        if (!z) {
            return (CodedOutputStream.m13274p0(i2) * size) + m13620x;
        }
        return CodedOutputStream.m13265g0(m13620x) + CodedOutputStream.m13274p0(i2);
    }

    /* renamed from: x */
    public static int m13620x(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13278t0(longArrayList.m13485f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m13278t0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: y */
    public static <UT, UB> UB m13621y(int i2, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (enumLiteMap.mo11029a(intValue) != null) {
                if (i4 != i3) {
                    list.set(i3, Integer.valueOf(intValue));
                }
                i3++;
            } else {
                if (ub == null) {
                    ub = unknownFieldSchema.mo13659m();
                }
                unknownFieldSchema.mo13651e(ub, i2, intValue);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return ub;
    }

    /* renamed from: z */
    public static <UT, UB> UB m13622z(int i2, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (enumVerifier.mo11030a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    if (ub == null) {
                        ub = unknownFieldSchema.mo13659m();
                    }
                    unknownFieldSchema.mo13651e(ub, i2, intValue);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!enumVerifier.mo11030a(intValue2)) {
                    if (ub == null) {
                        ub = unknownFieldSchema.mo13659m();
                    }
                    unknownFieldSchema.mo13651e(ub, i2, intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
