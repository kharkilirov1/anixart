package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes3.dex */
public final class JavaToKotlinClassMap {

    /* renamed from: a */
    public static final String f63870a;

    /* renamed from: b */
    public static final String f63871b;

    /* renamed from: c */
    public static final String f63872c;

    /* renamed from: d */
    public static final String f63873d;

    /* renamed from: e */
    public static final ClassId f63874e;

    /* renamed from: f */
    @NotNull
    public static final FqName f63875f;

    /* renamed from: g */
    public static final ClassId f63876g;

    /* renamed from: h */
    public static final HashMap<FqNameUnsafe, ClassId> f63877h;

    /* renamed from: i */
    public static final HashMap<FqNameUnsafe, ClassId> f63878i;

    /* renamed from: j */
    public static final HashMap<FqNameUnsafe, FqName> f63879j;

    /* renamed from: k */
    public static final HashMap<FqNameUnsafe, FqName> f63880k;

    /* renamed from: l */
    @NotNull
    public static final List<PlatformMutabilityMapping> f63881l;

    /* renamed from: m */
    public static final JavaToKotlinClassMap f63882m;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class PlatformMutabilityMapping {

        /* renamed from: a */
        @NotNull
        public final ClassId f63883a;

        /* renamed from: b */
        @NotNull
        public final ClassId f63884b;

        /* renamed from: c */
        @NotNull
        public final ClassId f63885c;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            this.f63883a = classId;
            this.f63884b = classId2;
            this.f63885c = classId3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.m32174c(this.f63883a, platformMutabilityMapping.f63883a) && Intrinsics.m32174c(this.f63884b, platformMutabilityMapping.f63884b) && Intrinsics.m32174c(this.f63885c, platformMutabilityMapping.f63885c);
        }

        public int hashCode() {
            ClassId classId = this.f63883a;
            int hashCode = (classId != null ? classId.hashCode() : 0) * 31;
            ClassId classId2 = this.f63884b;
            int hashCode2 = (hashCode + (classId2 != null ? classId2.hashCode() : 0)) * 31;
            ClassId classId3 = this.f63885c;
            return hashCode2 + (classId3 != null ? classId3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("PlatformMutabilityMapping(javaClass=");
            m24u.append(this.f63883a);
            m24u.append(", kotlinReadOnly=");
            m24u.append(this.f63884b);
            m24u.append(", kotlinMutable=");
            m24u.append(this.f63885c);
            m24u.append(")");
            return m24u.toString();
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        f63882m = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionClassDescriptor.Kind kind = FunctionClassDescriptor.Kind.f63856d;
        sb.append(kind.f63862b.toString());
        sb.append(".");
        sb.append(kind.f63863c);
        f63870a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassDescriptor.Kind kind2 = FunctionClassDescriptor.Kind.f63858f;
        sb2.append(kind2.f63862b.toString());
        sb2.append(".");
        sb2.append(kind2.f63863c);
        f63871b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassDescriptor.Kind kind3 = FunctionClassDescriptor.Kind.f63857e;
        sb3.append(kind3.f63862b.toString());
        sb3.append(".");
        sb3.append(kind3.f63863c);
        f63872c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassDescriptor.Kind kind4 = FunctionClassDescriptor.Kind.f63859g;
        sb4.append(kind4.f63862b.toString());
        sb4.append(".");
        sb4.append(kind4.f63863c);
        f63873d = sb4.toString();
        FqName fqName = new FqName("kotlin.jvm.functions.FunctionN");
        ClassId classId = new ClassId(fqName.m33198c(), fqName.m33199d());
        f63874e = classId;
        FqName m33189a = classId.m33189a();
        Intrinsics.m32175d(m33189a, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f63875f = m33189a;
        FqName fqName2 = new FqName("kotlin.reflect.KFunction");
        f63876g = new ClassId(fqName2.m33198c(), fqName2.m33199d());
        f63877h = new HashMap<>();
        f63878i = new HashMap<>();
        f63879j = new HashMap<>();
        f63880k = new HashMap<>();
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        ClassId m33188i = ClassId.m33188i(fqNames.f63749H);
        FqName fqName3 = fqNames.f63757P;
        Intrinsics.m32175d(fqName3, "FQ_NAMES.mutableIterable");
        FqName fqName4 = m33188i.f65593a;
        Intrinsics.m32175d(fqName4, "kotlinReadOnly.packageFqName");
        ClassId classId2 = new ClassId(fqName4, FqNamesUtilKt.m33209b(fqName3, fqName4), false);
        ClassId m33188i2 = ClassId.m33188i(fqNames.f63748G);
        FqName fqName5 = fqNames.f63756O;
        Intrinsics.m32175d(fqName5, "FQ_NAMES.mutableIterator");
        FqName fqName6 = m33188i2.f65593a;
        Intrinsics.m32175d(fqName6, "kotlinReadOnly.packageFqName");
        ClassId classId3 = new ClassId(fqName6, FqNamesUtilKt.m33209b(fqName5, fqName6), false);
        ClassId m33188i3 = ClassId.m33188i(fqNames.f63750I);
        FqName fqName7 = fqNames.f63758Q;
        Intrinsics.m32175d(fqName7, "FQ_NAMES.mutableCollection");
        FqName fqName8 = m33188i3.f65593a;
        Intrinsics.m32175d(fqName8, "kotlinReadOnly.packageFqName");
        ClassId classId4 = new ClassId(fqName8, FqNamesUtilKt.m33209b(fqName7, fqName8), false);
        ClassId m33188i4 = ClassId.m33188i(fqNames.f63751J);
        FqName fqName9 = fqNames.f63759R;
        Intrinsics.m32175d(fqName9, "FQ_NAMES.mutableList");
        FqName fqName10 = m33188i4.f65593a;
        Intrinsics.m32175d(fqName10, "kotlinReadOnly.packageFqName");
        ClassId classId5 = new ClassId(fqName10, FqNamesUtilKt.m33209b(fqName9, fqName10), false);
        ClassId m33188i5 = ClassId.m33188i(fqNames.f63753L);
        FqName fqName11 = fqNames.f63761T;
        Intrinsics.m32175d(fqName11, "FQ_NAMES.mutableSet");
        FqName fqName12 = m33188i5.f65593a;
        Intrinsics.m32175d(fqName12, "kotlinReadOnly.packageFqName");
        ClassId classId6 = new ClassId(fqName12, FqNamesUtilKt.m33209b(fqName11, fqName12), false);
        ClassId m33188i6 = ClassId.m33188i(fqNames.f63752K);
        FqName fqName13 = fqNames.f63760S;
        Intrinsics.m32175d(fqName13, "FQ_NAMES.mutableListIterator");
        FqName fqName14 = m33188i6.f65593a;
        Intrinsics.m32175d(fqName14, "kotlinReadOnly.packageFqName");
        ClassId classId7 = new ClassId(fqName14, FqNamesUtilKt.m33209b(fqName13, fqName14), false);
        ClassId m33188i7 = ClassId.m33188i(fqNames.f63754M);
        FqName fqName15 = fqNames.f63762U;
        Intrinsics.m32175d(fqName15, "FQ_NAMES.mutableMap");
        FqName fqName16 = m33188i7.f65593a;
        Intrinsics.m32175d(fqName16, "kotlinReadOnly.packageFqName");
        ClassId classId8 = new ClassId(fqName16, FqNamesUtilKt.m33209b(fqName15, fqName16), false);
        ClassId m33191c = ClassId.m33188i(fqNames.f63754M).m33191c(fqNames.f63755N.m33199d());
        FqName fqName17 = fqNames.f63763V;
        Intrinsics.m32175d(fqName17, "FQ_NAMES.mutableMapEntry");
        FqName fqName18 = m33191c.f65593a;
        Intrinsics.m32175d(fqName18, "kotlinReadOnly.packageFqName");
        List<PlatformMutabilityMapping> m31994G = CollectionsKt.m31994G(new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Iterable.class), m33188i, classId2), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Iterator.class), m33188i2, classId3), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Collection.class), m33188i3, classId4), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(List.class), m33188i4, classId5), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Set.class), m33188i5, classId6), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(ListIterator.class), m33188i6, classId7), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Map.class), m33188i7, classId8), new PlatformMutabilityMapping(javaToKotlinClassMap.m32466d(Map.Entry.class), m33191c, new ClassId(fqName18, FqNamesUtilKt.m33209b(fqName17, fqName18), false)));
        f63881l = m31994G;
        FqNameUnsafe fqNameUnsafe = fqNames.f63768a;
        Intrinsics.m32175d(fqNameUnsafe, "FQ_NAMES.any");
        javaToKotlinClassMap.m32465c(Object.class, fqNameUnsafe);
        FqNameUnsafe fqNameUnsafe2 = fqNames.f63778f;
        Intrinsics.m32175d(fqNameUnsafe2, "FQ_NAMES.string");
        javaToKotlinClassMap.m32465c(String.class, fqNameUnsafe2);
        FqNameUnsafe fqNameUnsafe3 = fqNames.f63776e;
        Intrinsics.m32175d(fqNameUnsafe3, "FQ_NAMES.charSequence");
        javaToKotlinClassMap.m32465c(CharSequence.class, fqNameUnsafe3);
        FqName fqName19 = fqNames.f63791r;
        Intrinsics.m32175d(fqName19, "FQ_NAMES.throwable");
        javaToKotlinClassMap.m32463a(javaToKotlinClassMap.m32466d(Throwable.class), new ClassId(fqName19.m33198c(), fqName19.m33199d()));
        FqNameUnsafe fqNameUnsafe4 = fqNames.f63772c;
        Intrinsics.m32175d(fqNameUnsafe4, "FQ_NAMES.cloneable");
        javaToKotlinClassMap.m32465c(Cloneable.class, fqNameUnsafe4);
        FqNameUnsafe fqNameUnsafe5 = fqNames.f63789p;
        Intrinsics.m32175d(fqNameUnsafe5, "FQ_NAMES.number");
        javaToKotlinClassMap.m32465c(Number.class, fqNameUnsafe5);
        FqName fqName20 = fqNames.f63792s;
        Intrinsics.m32175d(fqName20, "FQ_NAMES.comparable");
        javaToKotlinClassMap.m32463a(javaToKotlinClassMap.m32466d(Comparable.class), new ClassId(fqName20.m33198c(), fqName20.m33199d()));
        FqNameUnsafe fqNameUnsafe6 = fqNames.f63790q;
        Intrinsics.m32175d(fqNameUnsafe6, "FQ_NAMES._enum");
        javaToKotlinClassMap.m32465c(Enum.class, fqNameUnsafe6);
        FqName fqName21 = fqNames.f63798y;
        Intrinsics.m32175d(fqName21, "FQ_NAMES.annotation");
        javaToKotlinClassMap.m32463a(javaToKotlinClassMap.m32466d(Annotation.class), new ClassId(fqName21.m33198c(), fqName21.m33199d()));
        for (PlatformMutabilityMapping platformMutabilityMapping : m31994G) {
            ClassId classId9 = platformMutabilityMapping.f63883a;
            ClassId classId10 = platformMutabilityMapping.f63884b;
            ClassId classId11 = platformMutabilityMapping.f63885c;
            javaToKotlinClassMap.m32463a(classId9, classId10);
            FqName m33189a2 = classId11.m33189a();
            Intrinsics.m32175d(m33189a2, "mutableClassId.asSingleFqName()");
            f63878i.put(m33189a2.f65597a, classId9);
            FqName m33189a3 = classId10.m33189a();
            Intrinsics.m32175d(m33189a3, "readOnlyClassId.asSingleFqName()");
            FqName m33189a4 = classId11.m33189a();
            Intrinsics.m32175d(m33189a4, "mutableClassId.asSingleFqName()");
            f63879j.put(classId11.m33189a().f65597a, m33189a3);
            f63880k.put(m33189a3.f65597a, m33189a4);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            ClassId m33188i8 = ClassId.m33188i(jvmPrimitiveType.f65957e);
            FqName m33196a = KotlinBuiltIns.f63725g.m33196a(jvmPrimitiveType.f65954b.f63816b);
            javaToKotlinClassMap.m32463a(m33188i8, new ClassId(m33196a.m33198c(), m33196a.m33199d()));
        }
        CompanionObjectMapping companionObjectMapping = CompanionObjectMapping.f63721b;
        Set<ClassId> unmodifiableSet = Collections.unmodifiableSet(CompanionObjectMapping.f63720a);
        Intrinsics.m32175d(unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        for (ClassId classId12 : unmodifiableSet) {
            FqName fqName22 = new FqName(C0000a.m20q(C0000a.m24u("kotlin.jvm.internal."), classId12.m33193g().f65606b, "CompanionObject"));
            javaToKotlinClassMap.m32463a(new ClassId(fqName22.m33198c(), fqName22.m33199d()), classId12.m33191c(SpecialNames.f65610b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            FqName fqName23 = new FqName(C0000a.m7d("kotlin.jvm.functions.Function", i2));
            javaToKotlinClassMap.m32463a(new ClassId(fqName23.m33198c(), fqName23.m33199d()), KotlinBuiltIns.m32391o(i2));
            javaToKotlinClassMap.m32464b(new FqName(f63871b + i2), f63876g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            FunctionClassDescriptor.Kind kind5 = FunctionClassDescriptor.Kind.f63859g;
            javaToKotlinClassMap.m32464b(new FqName(C0000a.m7d(kind5.f63862b.toString() + "." + kind5.f63863c, i3)), f63876g);
        }
        FqName m33207g = KotlinBuiltIns.f63730l.f63770b.m33207g();
        Intrinsics.m32175d(m33207g, "FQ_NAMES.nothing.toSafe()");
        f63878i.put(m33207g.f65597a, javaToKotlinClassMap.m32466d(Void.class));
    }

    @Nullable
    /* renamed from: k */
    public static ClassDescriptor m32462k(JavaToKotlinClassMap javaToKotlinClassMap, FqName fqName, KotlinBuiltIns builtIns, Integer num, int i2) {
        Objects.requireNonNull(javaToKotlinClassMap);
        Intrinsics.m32180i(fqName, "fqName");
        Intrinsics.m32180i(builtIns, "builtIns");
        ClassId m32472j = javaToKotlinClassMap.m32472j(fqName);
        if (m32472j != null) {
            return builtIns.m32401i(m32472j.m33189a());
        }
        return null;
    }

    /* renamed from: a */
    public final void m32463a(ClassId classId, ClassId classId2) {
        f63877h.put(classId.m33189a().f65597a, classId2);
        FqName m33189a = classId2.m33189a();
        Intrinsics.m32175d(m33189a, "kotlinClassId.asSingleFqName()");
        f63878i.put(m33189a.f65597a, classId);
    }

    /* renamed from: b */
    public final void m32464b(FqName fqName, ClassId classId) {
        f63878i.put(fqName.f65597a, classId);
    }

    /* renamed from: c */
    public final void m32465c(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName m33207g = fqNameUnsafe.m33207g();
        Intrinsics.m32175d(m33207g, "kotlinFqName.toSafe()");
        m32463a(m32466d(cls), new ClassId(m33207g.m33198c(), m33207g.m33199d()));
    }

    /* renamed from: d */
    public final ClassId m32466d(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m32466d(declaringClass).m33191c(Name.m33211d(cls.getSimpleName()));
        }
        FqName fqName = new FqName(cls.getCanonicalName());
        return new ClassId(fqName.m33198c(), fqName.m33199d());
    }

    @NotNull
    /* renamed from: e */
    public final ClassDescriptor m32467e(@NotNull ClassDescriptor readOnly) {
        Intrinsics.m32180i(readOnly, "readOnly");
        return m32468f(readOnly, f63880k, "read-only");
    }

    /* renamed from: f */
    public final ClassDescriptor m32468f(ClassDescriptor classDescriptor, Map<FqNameUnsafe, FqName> map, String str) {
        FqName fqName = map.get(DescriptorUtils.m33468d(classDescriptor));
        if (fqName != null) {
            ClassDescriptor m32518a = DescriptorUtilKt.m32518a(DescriptorUtilsKt.m33534g(classDescriptor).f63732a, fqName, NoLookupLocation.FROM_BUILTINS);
            Intrinsics.m32175d(m32518a, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return m32518a;
        }
        throw new IllegalArgumentException("Given class " + classDescriptor + " is not a " + str + " collection");
    }

    /* renamed from: g */
    public final boolean m32469g(FqNameUnsafe fqNameUnsafe, String str) {
        Integer m33910j0;
        String str2 = fqNameUnsafe.f65602a;
        Intrinsics.m32175d(str2, "kotlinFqName.asString()");
        String m33899Y = StringsKt.m33899Y(str2, str, "");
        return (m33899Y.length() > 0) && !StringsKt.m33896V(m33899Y, '0', false, 2, null) && (m33910j0 = StringsKt.m33910j0(m33899Y)) != null && m33910j0.intValue() >= 23;
    }

    /* renamed from: h */
    public final boolean m32470h(@NotNull ClassDescriptor mutable) {
        Intrinsics.m32180i(mutable, "mutable");
        return f63879j.containsKey(DescriptorUtils.m33468d(mutable));
    }

    /* renamed from: i */
    public final boolean m32471i(@NotNull ClassDescriptor readOnly) {
        Intrinsics.m32180i(readOnly, "readOnly");
        return f63880k.containsKey(DescriptorUtils.m33468d(readOnly));
    }

    @Nullable
    /* renamed from: j */
    public final ClassId m32472j(@NotNull FqName fqName) {
        return f63877h.get(fqName.f65597a);
    }

    @Nullable
    /* renamed from: l */
    public final ClassId m32473l(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (!m32469g(fqNameUnsafe, f63870a) && !m32469g(fqNameUnsafe, f63872c)) {
            if (!m32469g(fqNameUnsafe, f63871b) && !m32469g(fqNameUnsafe, f63873d)) {
                return f63878i.get(fqNameUnsafe);
            }
            return f63876g;
        }
        return f63874e;
    }
}
