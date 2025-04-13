package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes3.dex */
public final class BuiltinMethodsWithDifferentJvmName {

    /* renamed from: a */
    public static final NameAndSignature f64304a;

    /* renamed from: b */
    public static final Map<NameAndSignature, Name> f64305b;

    /* renamed from: c */
    public static final Map<String, Name> f64306c;

    /* renamed from: d */
    @NotNull
    public static final List<Name> f64307d;

    /* renamed from: e */
    public static final Map<Name, List<Name>> f64308e;

    /* renamed from: f */
    public static final BuiltinMethodsWithDifferentJvmName f64309f = new BuiltinMethodsWithDifferentJvmName();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.INT;
        String str = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str, "JvmPrimitiveType.INT.desc");
        NameAndSignature m32690c = SpecialBuiltinMembers.m32690c("java/util/List", "removeAt", str, "Ljava/lang/Object;");
        f64304a = m32690c;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
        String m32938g = signatureBuildingComponents.m32938g("Number");
        String str2 = JvmPrimitiveType.BYTE.f65956d;
        Intrinsics.m32175d(str2, "JvmPrimitiveType.BYTE.desc");
        String m32938g2 = signatureBuildingComponents.m32938g("Number");
        String str3 = JvmPrimitiveType.SHORT.f65956d;
        Intrinsics.m32175d(str3, "JvmPrimitiveType.SHORT.desc");
        String m32938g3 = signatureBuildingComponents.m32938g("Number");
        String str4 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str4, "JvmPrimitiveType.INT.desc");
        String m32938g4 = signatureBuildingComponents.m32938g("Number");
        String str5 = JvmPrimitiveType.LONG.f65956d;
        Intrinsics.m32175d(str5, "JvmPrimitiveType.LONG.desc");
        String m32938g5 = signatureBuildingComponents.m32938g("Number");
        String str6 = JvmPrimitiveType.FLOAT.f65956d;
        Intrinsics.m32175d(str6, "JvmPrimitiveType.FLOAT.desc");
        String m32938g6 = signatureBuildingComponents.m32938g("Number");
        String str7 = JvmPrimitiveType.DOUBLE.f65956d;
        Intrinsics.m32175d(str7, "JvmPrimitiveType.DOUBLE.desc");
        String m32938g7 = signatureBuildingComponents.m32938g("CharSequence");
        String str8 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str8, "JvmPrimitiveType.INT.desc");
        String str9 = JvmPrimitiveType.CHAR.f65956d;
        Intrinsics.m32175d(str9, "JvmPrimitiveType.CHAR.desc");
        Map<NameAndSignature, Name> m32064i = MapsKt.m32064i(new Pair(SpecialBuiltinMembers.m32690c(m32938g, "toByte", "", str2), Name.m33211d("byteValue")), new Pair(SpecialBuiltinMembers.m32690c(m32938g2, "toShort", "", str3), Name.m33211d("shortValue")), new Pair(SpecialBuiltinMembers.m32690c(m32938g3, "toInt", "", str4), Name.m33211d("intValue")), new Pair(SpecialBuiltinMembers.m32690c(m32938g4, "toLong", "", str5), Name.m33211d("longValue")), new Pair(SpecialBuiltinMembers.m32690c(m32938g5, "toFloat", "", str6), Name.m33211d("floatValue")), new Pair(SpecialBuiltinMembers.m32690c(m32938g6, "toDouble", "", str7), Name.m33211d("doubleValue")), new Pair(m32690c, Name.m33211d("remove")), new Pair(SpecialBuiltinMembers.m32690c(m32938g7, "get", str8, str9), Name.m33211d("charAt")));
        f64305b = m32064i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m32062g(m32064i.size()));
        Iterator<T> it = m32064i.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((NameAndSignature) entry.getKey()).f64373b, entry.getValue());
        }
        f64306c = linkedHashMap;
        Set<NameAndSignature> keySet = f64305b.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(keySet, 10));
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((NameAndSignature) it2.next()).f64372a);
        }
        f64307d = arrayList;
        Set<Map.Entry<NameAndSignature, Name>> entrySet = f64305b.entrySet();
        ArrayList<Pair> arrayList2 = new ArrayList(CollectionsKt.m32032m(entrySet, 10));
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            arrayList2.add(new Pair(((NameAndSignature) entry2.getKey()).f64372a, entry2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Pair pair : arrayList2) {
            Name name = (Name) pair.f63056c;
            Object obj = linkedHashMap2.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(name, obj);
            }
            ((List) obj).add((Name) pair.f63055b);
        }
        f64308e = linkedHashMap2;
    }

    /* renamed from: a */
    public final boolean m32669a(@NotNull SimpleFunctionDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return Intrinsics.m32174c(receiver$0.getName().f65606b, "removeAt") && Intrinsics.m32174c(MethodSignatureMappingKt.m32929b(receiver$0), f64304a.f64373b);
    }
}
