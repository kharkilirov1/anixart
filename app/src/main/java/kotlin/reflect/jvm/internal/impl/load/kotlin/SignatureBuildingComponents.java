package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import org.jetbrains.annotations.NotNull;

/* compiled from: methodSignatureBuilding.kt */
/* loaded from: classes3.dex */
public final class SignatureBuildingComponents {

    /* renamed from: a */
    public static final SignatureBuildingComponents f64806a = new SignatureBuildingComponents();

    @NotNull
    /* renamed from: a */
    public final String[] m32932a(@NotNull String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public final String m32933b(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    @NotNull
    /* renamed from: c */
    public final LinkedHashSet<String> m32934c(@NotNull String internalName, @NotNull String... signatures) {
        Intrinsics.m32180i(internalName, "internalName");
        Intrinsics.m32180i(signatures, "signatures");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str : signatures) {
            linkedHashSet.add(internalName + "." + str);
        }
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: d */
    public final LinkedHashSet<String> m32935d(@NotNull String str, @NotNull String... signatures) {
        Intrinsics.m32180i(signatures, "signatures");
        return m32934c(m32938g(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    /* renamed from: e */
    public final LinkedHashSet<String> m32936e(@NotNull String str, @NotNull String... strArr) {
        return m32934c(m32939h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* renamed from: f */
    public final String m32937f(@NotNull String str) {
        return "java/util/function/" + str;
    }

    @NotNull
    /* renamed from: g */
    public final String m32938g(@NotNull String str) {
        return "java/lang/" + str;
    }

    @NotNull
    /* renamed from: h */
    public final String m32939h(@NotNull String str) {
        return "java/util/" + str;
    }

    @NotNull
    /* renamed from: i */
    public final String m32940i(@NotNull String name, @NotNull List<String> list, @NotNull String ret) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(ret, "ret");
        return name + '(' + CollectionsKt.m31989B(list, "", null, null, 0, null, new Function1<String, String>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(String str) {
                String it = str;
                Intrinsics.m32180i(it, "it");
                return SignatureBuildingComponents.f64806a.m32933b(it);
            }
        }, 30, null) + ')' + m32933b(ret);
    }

    @NotNull
    /* renamed from: j */
    public final String m32941j(@NotNull String internalName, @NotNull String jvmDescriptor) {
        Intrinsics.m32180i(internalName, "internalName");
        Intrinsics.m32180i(jvmDescriptor, "jvmDescriptor");
        return internalName + "." + jvmDescriptor;
    }

    @NotNull
    /* renamed from: k */
    public final String m32942k(@NotNull ClassDescriptor classDescriptor, @NotNull String jvmDescriptor) {
        String m32949b;
        Intrinsics.m32180i(jvmDescriptor, "jvmDescriptor");
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f63882m;
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.m33536i(classDescriptor).f65597a;
        Intrinsics.m32175d(fqNameUnsafe, "fqNameSafe.toUnsafe()");
        ClassId m32473l = javaToKotlinClassMap.m32473l(fqNameUnsafe);
        if (m32473l != null) {
            m32949b = JvmClassName.m33543a(m32473l).f65940a;
            Intrinsics.m32175d(m32949b, "JvmClassName.byClassId(it).internalName");
        } else {
            m32949b = TypeSignatureMappingKt.m32949b(classDescriptor, TypeMappingConfigurationImpl.f64808a, false);
        }
        return m32941j(m32949b, jvmDescriptor);
    }
}
