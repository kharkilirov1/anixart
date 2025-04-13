package kotlin.reflect.jvm.internal;

import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.mobile.ads.C4632R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Companion", "Data", "MemberBelonginess", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* renamed from: c */
    public static final Companion f63516c = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Regex f63515b = new Regex("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public abstract class Data {

        /* renamed from: c */
        public static final /* synthetic */ KProperty[] f63517c = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};

        /* renamed from: a */
        @NotNull
        public final ReflectProperties.LazySoftVal f63518a = ReflectProperties.m32304a(new Function0<RuntimeModuleData>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RuntimeModuleData invoke() {
                return ModuleByClassLoaderKt.m32303a(KDeclarationContainerImpl.this.mo32163h());
            }
        });

        public Data() {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "DECLARED", "INHERITED", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum MemberBelonginess {
        DECLARED,
        INHERITED
    }

    /* renamed from: i */
    public final void m32272i(List<Class<?>> list, String str, boolean z) {
        list.addAll(m32276s(str));
        int size = ((((ArrayList) r5).size() + 32) - 1) / 32;
        for (int i2 = 0; i2 < size; i2++) {
            Class<?> cls = Integer.TYPE;
            Intrinsics.m32175d(cls, "Integer.TYPE");
            list.add(cls);
        }
        list.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    @Nullable
    /* renamed from: k */
    public final Method m32273k(@NotNull String name, @NotNull String desc, boolean z) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(desc, "desc");
        if (Intrinsics.m32174c(name, "<init>")) {
            return null;
        }
        return m32278u(mo32275q(), name, m32276s(desc), m32277t(desc), z);
    }

    @NotNull
    /* renamed from: l */
    public abstract Collection<ConstructorDescriptor> mo32254l();

    @NotNull
    /* renamed from: n */
    public abstract Collection<FunctionDescriptor> mo32255n(@NotNull Name name);

    @Nullable
    /* renamed from: o */
    public abstract PropertyDescriptor mo32256o(int i2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0019 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> m32274p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.m32180i(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1 r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            r0.<init>()
            r1 = 0
            r2 = 3
            java.util.Collection r9 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.m33549a(r9, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L19:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r9.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L5e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r6 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63991h
            boolean r5 = kotlin.jvm.internal.Intrinsics.m32174c(r5, r6)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = r4.mo32493g()
            java.lang.String r5 = "member.kind"
            kotlin.jvm.internal.Intrinsics.m32175d(r4, r5)
            boolean r4 = r4.m32496a()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r5 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED
            r7 = 0
            if (r10 != r5) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r4 != r5) goto L52
            goto L53
        L52:
            r6 = 0
        L53:
            if (r6 == 0) goto L5e
            kotlin.Unit r4 = kotlin.Unit.f63088a
            java.lang.Object r3 = r3.mo32498H(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L5f
        L5e:
            r3 = r1
        L5f:
            if (r3 == 0) goto L19
            r2.add(r3)
            goto L19
        L65:
            java.util.List r9 = kotlin.collections.CollectionsKt.m32027j0(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.m32274p(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    @NotNull
    /* renamed from: q */
    public Class<?> mo32275q() {
        Class<?> receiver$0 = mo32163h();
        List<KClass<? extends Object>> list = ReflectClassUtilKt.f66541a;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Class<? extends Object> cls = ReflectClassUtilKt.f66543c.get(receiver$0);
        return cls != null ? cls : mo32163h();
    }

    @NotNull
    /* renamed from: r */
    public abstract Collection<PropertyDescriptor> mo32257r(@NotNull Name name);

    /* renamed from: s */
    public final List<Class<?>> m32276s(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (!StringsKt.m33921s("VZCBSIFJD", charAt, false, 2, null)) {
                if (charAt != 'L') {
                    throw new KotlinReflectionInternalError(C0000a.m14k("Unknown type prefix in the method signature: ", str));
                }
                i3 = StringsKt.m33877C(str, ';', i2, false, 4, null);
            }
            int i4 = i3 + 1;
            arrayList.add(m32279v(str, i2, i4));
            i2 = i4;
        }
        return arrayList;
    }

    /* renamed from: t */
    public final Class<?> m32277t(String str) {
        return m32279v(str, StringsKt.m33877C(str, ')', 0, false, 6, null) + 1, str.length());
    }

    /* renamed from: u */
    public final Method m32278u(@NotNull Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2, boolean z) {
        Method m32278u;
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array = list.toArray(new Class[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Class<?>[] clsArr = (Class[]) array;
        if (z) {
            Method m32281x = m32281x(cls, str, clsArr, cls2, false);
            if (m32281x != null) {
                return m32281x;
            }
            if (cls.isInterface() && (m32278u = m32278u(Object.class, str, list, cls2, z)) != null) {
                return m32278u;
            }
        }
        while (cls != null) {
            Method m32281x2 = m32281x(cls, str, clsArr, cls2, true);
            if (m32281x2 != null) {
                return m32281x2;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: v */
    public final Class<?> m32279v(String str, int i2, int i3) {
        char charAt = str.charAt(i2);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader m33801e = ReflectClassUtilKt.m33801e(mo32163h());
            String substring = str.substring(i2 + 1, i3 - 1);
            Intrinsics.m32175d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Class<?> loadClass = m33801e.loadClass(StringsKt.m33890P(substring, JsonPointer.SEPARATOR, '.', false, 4, null));
            Intrinsics.m32175d(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            Intrinsics.m32175d(cls, "Void.TYPE");
            return cls;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == '[') {
            return ReflectClassUtilKt.m33797a(m32279v(str, i2 + 1, i3));
        }
        switch (charAt) {
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return Byte.TYPE;
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return Character.TYPE;
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError(C0000a.m14k("Unknown type prefix in the method signature: ", str));
        }
    }

    /* renamed from: w */
    public final Constructor<?> m32280w(@NotNull Class<?> cls, List<? extends Class<?>> list, boolean z) {
        try {
            if (z) {
                Object[] array = list.toArray(new Class[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            Object[] array2 = list.toArray(new Class[0]);
            if (array2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Class[] clsArr2 = (Class[]) array2;
            return cls.getConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[LOOP:0: B:13:0x003e->B:24:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method m32281x(@org.jetbrains.annotations.NotNull java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>[] r8, java.lang.Class<?> r9, boolean r10) {
        /*
            r5 = this;
            r0 = 0
            if (r10 == 0) goto Lf
            int r1 = r8.length     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L75
            goto L1a
        Lf:
            int r1 = r8.length     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L75
        L1a:
            java.lang.String r2 = "result"
            kotlin.jvm.internal.Intrinsics.m32175d(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L75
            boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r9)     // Catch: java.lang.NoSuchMethodException -> L75
            if (r2 == 0) goto L2b
            r0 = r1
            goto L75
        L2b:
            if (r10 == 0) goto L32
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch: java.lang.NoSuchMethodException -> L75
            goto L36
        L32:
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.NoSuchMethodException -> L75
        L36:
            java.lang.String r10 = "allMethods"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r10)     // Catch: java.lang.NoSuchMethodException -> L75
            int r10 = r6.length     // Catch: java.lang.NoSuchMethodException -> L75
            r1 = 0
            r2 = 0
        L3e:
            if (r2 >= r10) goto L75
            r3 = r6[r2]     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.String r4 = "method"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L75
            java.lang.String r4 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L75
            boolean r4 = kotlin.jvm.internal.Intrinsics.m32174c(r4, r7)     // Catch: java.lang.NoSuchMethodException -> L75
            if (r4 == 0) goto L6d
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L75
            boolean r4 = kotlin.jvm.internal.Intrinsics.m32174c(r4, r9)     // Catch: java.lang.NoSuchMethodException -> L75
            if (r4 == 0) goto L6d
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L75
            if (r4 == 0) goto L69
            boolean r4 = java.util.Arrays.equals(r4, r8)     // Catch: java.lang.NoSuchMethodException -> L75
            if (r4 == 0) goto L6d
            r4 = 1
            goto L6e
        L69:
            kotlin.jvm.internal.Intrinsics.m32188q()     // Catch: java.lang.NoSuchMethodException -> L75
            throw r0     // Catch: java.lang.NoSuchMethodException -> L75
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L72
            r0 = r3
            goto L75
        L72:
            int r2 = r2 + 1
            goto L3e
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.m32281x(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class, boolean):java.lang.reflect.Method");
    }
}
