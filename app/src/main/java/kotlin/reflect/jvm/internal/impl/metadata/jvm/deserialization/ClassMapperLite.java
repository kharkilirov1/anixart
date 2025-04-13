package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ClassMapperLite.kt */
/* loaded from: classes3.dex */
public final class ClassMapperLite {

    /* renamed from: a */
    public static final Map<String, String> f65568a;

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite$map$1$1] */
    static {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        List m31994G = CollectionsKt.m31994G("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        IntProgression m32242i = RangesKt.m32242i(new IntRange(0, m31994G.size() - 1), 2);
        int i2 = m32242i.f63380b;
        int i3 = m32242i.f63381c;
        int i4 = m32242i.f63382d;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                StringBuilder m24u = C0000a.m24u("kotlin/");
                m24u.append((String) m31994G.get(i2));
                int i5 = i2 + 1;
                linkedHashMap.put(m24u.toString(), m31994G.get(i5));
                StringBuilder sb = new StringBuilder();
                sb.append("kotlin/");
                String m20q = C0000a.m20q(sb, (String) m31994G.get(i2), "Array");
                StringBuilder m2872a = C0321a.m2872a('[');
                m2872a.append((String) m31994G.get(i5));
                linkedHashMap.put(m20q, m2872a.toString());
                if (i2 == i3) {
                    break;
                } else {
                    i2 += i4;
                }
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        ?? r1 = new Function2<String, String, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite$map$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* renamed from: a */
            public final void m33172a(@NotNull String kotlinSimpleName, @NotNull String javaInternalName) {
                Intrinsics.m32180i(kotlinSimpleName, "kotlinSimpleName");
                Intrinsics.m32180i(javaInternalName, "javaInternalName");
                linkedHashMap.put(C0000a.m14k("kotlin/", kotlinSimpleName), 'L' + javaInternalName + ';');
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                m33172a(str, str2);
                return Unit.f63088a;
            }
        };
        r1.m33172a("Any", "java/lang/Object");
        r1.m33172a("Nothing", "java/lang/Void");
        r1.m33172a("Annotation", "java/lang/annotation/Annotation");
        for (String str : CollectionsKt.m31994G("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            r1.m33172a(str, C0000a.m14k("java/lang/", str));
        }
        for (String str2 : CollectionsKt.m31994G("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            r1.m33172a(C0000a.m14k("collections/", str2), C0000a.m14k("java/util/", str2));
            r1.m33172a(C0000a.m14k("collections/Mutable", str2), C0000a.m14k("java/util/", str2));
        }
        r1.m33172a("collections/Iterable", "java/lang/Iterable");
        r1.m33172a("collections/MutableIterable", "java/lang/Iterable");
        r1.m33172a("collections/Map.Entry", "java/util/Map$Entry");
        r1.m33172a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i6 = 0; i6 <= 22; i6++) {
            r1.m33172a(C0000a.m7d("Function", i6), C0000a.m7d("kotlin/jvm/functions/Function", i6));
            r1.m33172a(C0000a.m7d("reflect/KFunction", i6), "kotlin/reflect/KFunction");
        }
        for (String str3 : CollectionsKt.m31994G("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            r1.m33172a(C0000a.m14k(str3, ".Companion"), C0000a.m16m("kotlin/jvm/internal/", str3, "CompanionObject"));
        }
        f65568a = linkedHashMap;
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final String m33171a(@NotNull String classId) {
        Intrinsics.m32180i(classId, "classId");
        String str = (String) ((LinkedHashMap) f65568a).get(classId);
        return str != null ? str : C0576a.m4118q(C0321a.m2872a('L'), StringsKt.m33890P(classId, '.', '$', false, 4, null), ';');
    }
}
