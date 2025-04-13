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
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes3.dex */
public final class BuiltinMethodsWithSpecialGenericSignature {

    /* renamed from: a */
    public static final List<NameAndSignature> f64311a;

    /* renamed from: b */
    public static final List<String> f64312b;

    /* renamed from: c */
    public static final Map<NameAndSignature, TypeSafeBarrierDescription> f64313c;

    /* renamed from: d */
    public static final Map<String, TypeSafeBarrierDescription> f64314d;

    /* renamed from: e */
    public static final Set<Name> f64315e;

    /* renamed from: f */
    @NotNull
    public static final Set<String> f64316f;

    /* renamed from: g */
    public static final BuiltinMethodsWithSpecialGenericSignature f64317g = new BuiltinMethodsWithSpecialGenericSignature();

    /* compiled from: specialBuiltinMembers.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        SpecialSignatureInfo(String str, boolean z) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: specialBuiltinMembers.kt */
    public static final class TypeSafeBarrierDescription {

        /* renamed from: c */
        public static final TypeSafeBarrierDescription f64322c;

        /* renamed from: d */
        public static final TypeSafeBarrierDescription f64323d;

        /* renamed from: e */
        public static final TypeSafeBarrierDescription f64324e;

        /* renamed from: f */
        public static final TypeSafeBarrierDescription f64325f;

        /* renamed from: g */
        public static final /* synthetic */ TypeSafeBarrierDescription[] f64326g;

        /* renamed from: b */
        @Nullable
        public final Object f64327b;

        /* compiled from: specialBuiltinMembers.kt */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            public MAP_GET_OR_DEFAULT(String str, int i2) {
                super(str, i2, null);
            }
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            f64322c = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            f64323d = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            f64324e = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);
            f64325f = map_get_or_default;
            f64326g = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        public TypeSafeBarrierDescription(String str, int i2, @Nullable Object obj) {
            this.f64327b = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f64326g.clone();
        }
    }

    static {
        Set<String> m32080g = SetsKt.m32080g("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32080g, 10));
        for (String str : m32080g) {
            String str2 = JvmPrimitiveType.BOOLEAN.f65956d;
            Intrinsics.m32175d(str2, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(SpecialBuiltinMembers.m32690c("java/util/Collection", str, "Ljava/util/Collection;", str2));
        }
        f64311a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NameAndSignature) it.next()).f64373b);
        }
        f64312b = arrayList2;
        List<NameAndSignature> list = f64311a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((NameAndSignature) it2.next()).f64372a.f65606b);
        }
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
        String m32939h = signatureBuildingComponents.m32939h("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String str3 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str3, "JvmPrimitiveType.BOOLEAN.desc");
        NameAndSignature m32690c = SpecialBuiltinMembers.m32690c(m32939h, "contains", "Ljava/lang/Object;", str3);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.f64324e;
        String m32939h2 = signatureBuildingComponents.m32939h("Collection");
        String str4 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str4, "JvmPrimitiveType.BOOLEAN.desc");
        String m32939h3 = signatureBuildingComponents.m32939h("Map");
        String str5 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str5, "JvmPrimitiveType.BOOLEAN.desc");
        String m32939h4 = signatureBuildingComponents.m32939h("Map");
        String str6 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str6, "JvmPrimitiveType.BOOLEAN.desc");
        String m32939h5 = signatureBuildingComponents.m32939h("Map");
        String str7 = jvmPrimitiveType.f65956d;
        Intrinsics.m32175d(str7, "JvmPrimitiveType.BOOLEAN.desc");
        NameAndSignature m32690c2 = SpecialBuiltinMembers.m32690c(signatureBuildingComponents.m32939h("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f64322c;
        String m32939h6 = signatureBuildingComponents.m32939h("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String str8 = jvmPrimitiveType2.f65956d;
        Intrinsics.m32175d(str8, "JvmPrimitiveType.INT.desc");
        NameAndSignature m32690c3 = SpecialBuiltinMembers.m32690c(m32939h6, "indexOf", "Ljava/lang/Object;", str8);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f64323d;
        String m32939h7 = signatureBuildingComponents.m32939h("List");
        String str9 = jvmPrimitiveType2.f65956d;
        Intrinsics.m32175d(str9, "JvmPrimitiveType.INT.desc");
        Map<NameAndSignature, TypeSafeBarrierDescription> m32064i = MapsKt.m32064i(new Pair(m32690c, typeSafeBarrierDescription), new Pair(SpecialBuiltinMembers.m32690c(m32939h2, "remove", "Ljava/lang/Object;", str4), typeSafeBarrierDescription), new Pair(SpecialBuiltinMembers.m32690c(m32939h3, "containsKey", "Ljava/lang/Object;", str5), typeSafeBarrierDescription), new Pair(SpecialBuiltinMembers.m32690c(m32939h4, "containsValue", "Ljava/lang/Object;", str6), typeSafeBarrierDescription), new Pair(SpecialBuiltinMembers.m32690c(m32939h5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", str7), typeSafeBarrierDescription), new Pair(SpecialBuiltinMembers.m32690c(signatureBuildingComponents.m32939h("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f64325f), new Pair(m32690c2, typeSafeBarrierDescription2), new Pair(SpecialBuiltinMembers.m32690c(signatureBuildingComponents.m32939h("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), new Pair(m32690c3, typeSafeBarrierDescription3), new Pair(SpecialBuiltinMembers.m32690c(m32939h7, "lastIndexOf", "Ljava/lang/Object;", str9), typeSafeBarrierDescription3));
        f64313c = m32064i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m32062g(m32064i.size()));
        Iterator<T> it3 = m32064i.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((NameAndSignature) entry.getKey()).f64373b, entry.getValue());
        }
        f64314d = linkedHashMap;
        Set m32077d = SetsKt.m32077d(f64313c.keySet(), f64311a);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.m32032m(m32077d, 10));
        Iterator it4 = m32077d.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((NameAndSignature) it4.next()).f64372a);
        }
        f64315e = CollectionsKt.m32035n0(arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.m32032m(m32077d, 10));
        Iterator it5 = m32077d.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((NameAndSignature) it5.next()).f64373b);
        }
        f64316f = CollectionsKt.m32035n0(arrayList5);
    }

    @JvmStatic
    @Nullable
    /* renamed from: a */
    public static final FunctionDescriptor m32670a(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.m32180i(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = f64317g;
        Name name = functionDescriptor.getName();
        Intrinsics.m32175d(name, "functionDescriptor.name");
        if (builtinMethodsWithSpecialGenericSignature.m32671b(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.m33531d(functionDescriptor, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor it = callableMemberDescriptor;
                    Intrinsics.m32180i(it, "it");
                    BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature2 = BuiltinMethodsWithSpecialGenericSignature.f64317g;
                    return Boolean.valueOf(CollectionsKt.m32034n(BuiltinMethodsWithSpecialGenericSignature.f64316f, MethodSignatureMappingKt.m32929b(it)));
                }
            }, 1);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m32671b(@NotNull Name name) {
        return f64315e.contains(name);
    }
}
