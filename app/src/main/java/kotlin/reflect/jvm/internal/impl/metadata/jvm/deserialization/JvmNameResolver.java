package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes3.dex */
public final class JvmNameResolver implements NameResolver {

    /* renamed from: d */
    @NotNull
    public static final List<String> f65579d;

    /* renamed from: a */
    public final Set<Integer> f65580a;

    /* renamed from: b */
    @NotNull
    public final List<JvmProtoBuf.StringTableTypes.Record> f65581b;

    /* renamed from: c */
    @NotNull
    public final String[] f65582c;

    /* compiled from: JvmNameResolver.kt */
    public static final class Companion {
    }

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<String> m31994G = CollectionsKt.m31994G("kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator");
        f65579d = m31994G;
        Iterable m32037o0 = CollectionsKt.m32037o0(m31994G);
        int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(m32037o0, 10));
        if (m32062g < 16) {
            m32062g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
        Iterator it = ((IndexingIterable) m32037o0).iterator();
        while (it.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) it.next();
            linkedHashMap.put((String) indexedValue.f63148b, Integer.valueOf(indexedValue.f63147a));
        }
    }

    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull String[] strings) {
        Intrinsics.m32180i(strings, "strings");
        this.f65582c = strings;
        List<Integer> list = stringTableTypes.f65534d;
        this.f65580a = list.isEmpty() ? EmptySet.f63146b : CollectionsKt.m32035n0(list);
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.f65533c;
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            Intrinsics.m32175d(record, "record");
            int i2 = record.f65545d;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        this.f65581b = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    /* renamed from: a */
    public String mo33117a(int i2) {
        return getString(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* renamed from: b */
    public boolean mo33118b(int i2) {
        return this.f65580a.contains(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i2) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = this.f65581b.get(i2);
        int i3 = record.f65544c;
        if ((i3 & 4) == 4) {
            Object obj = record.f65547f;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                ByteString byteString = (ByteString) obj;
                String m33229D = byteString.m33229D();
                if (byteString.mo33235t()) {
                    record.f65547f = m33229D;
                }
                str = m33229D;
            }
        } else {
            if ((i3 & 2) == 2) {
                List<String> list = f65579d;
                int size = list.size();
                int i4 = record.f65546e;
                if (i4 >= 0 && size > i4) {
                    str = list.get(i4);
                }
            }
            str = this.f65582c[i2];
        }
        if (record.f65549h.size() >= 2) {
            List<Integer> list2 = record.f65549h;
            Integer begin = list2.get(0);
            Integer end = list2.get(1);
            Intrinsics.m32175d(begin, "begin");
            if (Intrinsics.m32181j(0, begin.intValue()) <= 0) {
                int intValue = begin.intValue();
                Intrinsics.m32175d(end, "end");
                if (Intrinsics.m32181j(intValue, end.intValue()) <= 0 && Intrinsics.m32181j(end.intValue(), str.length()) <= 0) {
                    str = str.substring(begin.intValue(), end.intValue());
                    Intrinsics.m32175d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        String string = str;
        if (record.f65551j.size() >= 2) {
            List<Integer> list3 = record.f65551j;
            Integer num = list3.get(0);
            Integer num2 = list3.get(1);
            Intrinsics.m32175d(string, "string");
            string = StringsKt.m33890P(string, (char) num.intValue(), (char) num2.intValue(), false, 4, null);
        }
        String string2 = string;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.f65548g;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int ordinal = operation.ordinal();
        if (ordinal == 1) {
            Intrinsics.m32175d(string2, "string");
            string2 = StringsKt.m33890P(string2, '$', '.', false, 4, null);
        } else if (ordinal == 2) {
            if (string2.length() >= 2) {
                string2 = string2.substring(1, string2.length() - 1);
                Intrinsics.m32175d(string2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            string2 = StringsKt.m33890P(string2, '$', '.', false, 4, null);
        }
        Intrinsics.m32175d(string2, "string");
        return string2;
    }
}
