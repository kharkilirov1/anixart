package kotlin.reflect.jvm.internal.structure;

import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: reflectClassUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "classId", "descriptors.runtime"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectClassUtilKt {

    /* renamed from: a */
    public static final List<KClass<? extends Object>> f66541a;

    /* renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f66542b;

    /* renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f66543c;

    /* renamed from: d */
    public static final Map<Class<? extends Function<?>>, Integer> f66544d;

    static {
        int i2 = 0;
        List<KClass<? extends Object>> m31994G = CollectionsKt.m31994G(Reflection.m32193a(Boolean.TYPE), Reflection.m32193a(Byte.TYPE), Reflection.m32193a(Character.TYPE), Reflection.m32193a(Double.TYPE), Reflection.m32193a(Float.TYPE), Reflection.m32193a(Integer.TYPE), Reflection.m32193a(Long.TYPE), Reflection.m32193a(Short.TYPE));
        f66541a = m31994G;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m31994G, 10));
        Iterator<T> it = m31994G.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(new Pair(JvmClassMappingKt.m32148c(kClass), JvmClassMappingKt.m32149d(kClass)));
        }
        f66542b = MapsKt.m32067l(arrayList);
        List<KClass<? extends Object>> list = f66541a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(new Pair(JvmClassMappingKt.m32149d(kClass2), JvmClassMappingKt.m32148c(kClass2)));
        }
        f66543c = MapsKt.m32067l(arrayList2);
        List m31994G2 = CollectionsKt.m31994G(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(m31994G2, 10));
        for (Object obj : m31994G2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f66544d = MapsKt.m32067l(arrayList3);
    }

    @NotNull
    /* renamed from: a */
    public static final Class<?> m33797a(@NotNull Class<?> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return Array.newInstance(receiver$0, 0).getClass();
    }

    @NotNull
    /* renamed from: b */
    public static final ClassId m33798b(@NotNull Class<?> receiver$0) {
        ClassId m33798b;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (receiver$0.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + receiver$0);
        }
        if (receiver$0.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + receiver$0);
        }
        if (receiver$0.getEnclosingMethod() == null && receiver$0.getEnclosingConstructor() == null) {
            if (!(receiver$0.getSimpleName().length() == 0)) {
                Class<?> declaringClass = receiver$0.getDeclaringClass();
                if (declaringClass != null && (m33798b = m33798b(declaringClass)) != null) {
                    return m33798b.m33191c(Name.m33211d(receiver$0.getSimpleName()));
                }
                FqName fqName = new FqName(receiver$0.getName());
                return new ClassId(fqName.m33198c(), fqName.m33199d());
            }
        }
        FqName fqName2 = new FqName(receiver$0.getName());
        return new ClassId(fqName2.m33198c(), FqName.m33195f(fqName2.m33199d()), true);
    }

    @NotNull
    /* renamed from: c */
    public static final String m33799c(@NotNull Class<?> cls) {
        if (Intrinsics.m32174c(cls, Void.TYPE)) {
            return "V";
        }
        String substring = m33797a(cls).getName().substring(1);
        Intrinsics.m32175d(substring, "(this as java.lang.String).substring(startIndex)");
        return StringsKt.m33890P(substring, '.', JsonPointer.SEPARATOR, false, 4, null);
    }

    @NotNull
    /* renamed from: d */
    public static final List<Type> m33800d(@NotNull Type receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (!(receiver$0 instanceof ParameterizedType)) {
            return EmptyList.f63144b;
        }
        ParameterizedType parameterizedType = (ParameterizedType) receiver$0;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt.m33831A(SequencesKt.m33845m(SequencesKt.m33847o(receiver$0, new Function1<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // kotlin.jvm.functions.Function1
                public ParameterizedType invoke(ParameterizedType parameterizedType2) {
                    ParameterizedType it = parameterizedType2;
                    Intrinsics.m32180i(it, "it");
                    Type ownerType = it.getOwnerType();
                    if (!(ownerType instanceof ParameterizedType)) {
                        ownerType = null;
                    }
                    return (ParameterizedType) ownerType;
                }
            }), new Function1<ParameterizedType, Sequence<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // kotlin.jvm.functions.Function1
                public Sequence<? extends Type> invoke(ParameterizedType parameterizedType2) {
                    ParameterizedType it = parameterizedType2;
                    Intrinsics.m32180i(it, "it");
                    Type[] actualTypeArguments = it.getActualTypeArguments();
                    Intrinsics.m32175d(actualTypeArguments, "it.actualTypeArguments");
                    return ArraysKt.m31958h(actualTypeArguments);
                }
            }));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.m32175d(actualTypeArguments, "actualTypeArguments");
        return ArraysKt.m31952b0(actualTypeArguments);
    }

    @NotNull
    /* renamed from: e */
    public static final ClassLoader m33801e(@NotNull Class<?> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ClassLoader classLoader = receiver$0.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.m32175d(systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }
}
