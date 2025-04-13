package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
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
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ClassReference.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* renamed from: c */
    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> f63339c;

    /* renamed from: d */
    @NotNull
    public static final HashMap<String, String> f63340d;

    /* renamed from: e */
    @NotNull
    public static final Map<String, String> f63341e;

    /* renamed from: b */
    @NotNull
    public final Class<?> f63342b;

    /* compiled from: ClassReference.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R,\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR0\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m31884d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    static {
        String m33902b0;
        String m33902b02;
        int i2 = 0;
        List m31994G = CollectionsKt.m31994G(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m31994G, 10));
        for (Object obj : m31994G) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f63339c = MapsKt.m32067l(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.m32178g(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.m32178g(kotlinName, "kotlinName");
            m33902b02 = StringsKt.m33902b0(kotlinName, '.', (r3 & 2) != 0 ? kotlinName : null);
            sb.append(m33902b02);
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), kotlinName + ".Companion");
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : f63339c.entrySet()) {
            Class<? extends Function<?>> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            hashMap3.put(key.getName(), "kotlin.Function" + intValue);
        }
        f63340d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m32062g(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            m33902b0 = StringsKt.m33902b0(r2, '.', (r3 & 2) != 0 ? (String) entry2.getValue() : null);
            linkedHashMap.put(key2, m33902b0);
        }
        f63341e = linkedHashMap;
    }

    public ClassReference(@NotNull Class<?> jClass) {
        Intrinsics.m32179h(jClass, "jClass");
        this.f63342b = jClass;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    /* renamed from: a */
    public List<KType> mo32164a() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: b */
    public String mo32165b() {
        String str;
        Class<?> jClass = this.f63342b;
        Intrinsics.m32179h(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String str3 = f63340d.get(jClass.getName());
            return str3 == null ? jClass.getCanonicalName() : str3;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = f63340d.get(componentType.getName())) != null) {
            str2 = C0000a.m14k(str, "Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: d */
    public String mo32166d() {
        String m33899Y;
        String m33899Y2;
        Class<?> jClass = this.f63342b;
        Intrinsics.m32179h(jClass, "jClass");
        String str = null;
        if (!jClass.isAnonymousClass()) {
            if (jClass.isLocalClass()) {
                String simpleName = jClass.getSimpleName();
                Method enclosingMethod = jClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    m33899Y2 = StringsKt.m33899Y(simpleName, enclosingMethod.getName() + '$', (r3 & 2) != 0 ? simpleName : null);
                    return m33899Y2;
                }
                Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return StringsKt.m33900Z(simpleName, '$', null, 2, null);
                }
                m33899Y = StringsKt.m33899Y(simpleName, enclosingConstructor.getName() + '$', (r3 & 2) != 0 ? simpleName : null);
                return m33899Y;
            }
            if (!jClass.isArray()) {
                String str2 = (String) ((LinkedHashMap) f63341e).get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive()) {
                String str3 = (String) ((LinkedHashMap) f63341e).get(componentType.getName());
                if (str3 != null) {
                    str = C0000a.m14k(str3, "Array");
                }
            }
            if (str == null) {
                return "Array";
            }
        }
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ClassReference) && Intrinsics.m32174c(JvmClassMappingKt.m32148c(this), JvmClassMappingKt.m32148c((KClass) obj));
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: f */
    public Object mo32167f() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: h */
    public Class<?> mo32163h() {
        return this.f63342b;
    }

    public int hashCode() {
        return JvmClassMappingKt.m32148c(this).hashCode();
    }

    @NotNull
    public String toString() {
        return this.f63342b.toString() + " (Kotlin reflection is not available)";
    }
}
