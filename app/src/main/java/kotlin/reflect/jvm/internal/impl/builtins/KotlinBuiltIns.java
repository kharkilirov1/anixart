package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class KotlinBuiltIns {

    /* renamed from: f */
    public static final Name f63724f;

    /* renamed from: g */
    public static final FqName f63725g;

    /* renamed from: h */
    public static final FqName f63726h;

    /* renamed from: i */
    public static final FqName f63727i;

    /* renamed from: j */
    public static final FqName f63728j;

    /* renamed from: k */
    public static final Set<FqName> f63729k;

    /* renamed from: l */
    public static final FqNames f63730l;

    /* renamed from: m */
    public static final Name f63731m;

    /* renamed from: a */
    public ModuleDescriptorImpl f63732a;

    /* renamed from: b */
    public final NotNullLazyValue<Primitives> f63733b;

    /* renamed from: c */
    public final NotNullLazyValue<PackageFragments> f63734c;

    /* renamed from: d */
    public final MemoizedFunctionToNotNull<Name, ClassDescriptor> f63735d;

    /* renamed from: e */
    public final StorageManager f63736e;

    public static class FqNames {

        /* renamed from: A */
        public final FqName f63742A;

        /* renamed from: B */
        public final FqName f63743B;

        /* renamed from: C */
        public final FqName f63744C;

        /* renamed from: D */
        public final FqName f63745D;

        /* renamed from: E */
        public final FqName f63746E;

        /* renamed from: F */
        public final FqName f63747F;

        /* renamed from: G */
        public final FqName f63748G;

        /* renamed from: H */
        public final FqName f63749H;

        /* renamed from: I */
        public final FqName f63750I;

        /* renamed from: J */
        public final FqName f63751J;

        /* renamed from: K */
        public final FqName f63752K;

        /* renamed from: L */
        public final FqName f63753L;

        /* renamed from: M */
        public final FqName f63754M;

        /* renamed from: N */
        public final FqName f63755N;

        /* renamed from: O */
        public final FqName f63756O;

        /* renamed from: P */
        public final FqName f63757P;

        /* renamed from: Q */
        public final FqName f63758Q;

        /* renamed from: R */
        public final FqName f63759R;

        /* renamed from: S */
        public final FqName f63760S;

        /* renamed from: T */
        public final FqName f63761T;

        /* renamed from: U */
        public final FqName f63762U;

        /* renamed from: V */
        public final FqName f63763V;

        /* renamed from: W */
        public final FqNameUnsafe f63764W;

        /* renamed from: X */
        public final ClassId f63765X;

        /* renamed from: Y */
        public final ClassId f63766Y;

        /* renamed from: Z */
        public final ClassId f63767Z;

        /* renamed from: a0 */
        public final ClassId f63769a0;

        /* renamed from: b0 */
        public final ClassId f63771b0;

        /* renamed from: c0 */
        public final Set<Name> f63773c0;

        /* renamed from: d */
        public final FqNameUnsafe f63774d;

        /* renamed from: d0 */
        public final Set<Name> f63775d0;

        /* renamed from: e */
        public final FqNameUnsafe f63776e;

        /* renamed from: e0 */
        public final Map<FqNameUnsafe, PrimitiveType> f63777e0;

        /* renamed from: f */
        public final FqNameUnsafe f63778f;

        /* renamed from: f0 */
        public final Map<FqNameUnsafe, PrimitiveType> f63779f0;

        /* renamed from: g */
        public final FqNameUnsafe f63780g;

        /* renamed from: h */
        public final FqNameUnsafe f63781h;

        /* renamed from: i */
        public final FqNameUnsafe f63782i;

        /* renamed from: j */
        public final FqNameUnsafe f63783j;

        /* renamed from: k */
        public final FqNameUnsafe f63784k;

        /* renamed from: l */
        public final FqNameUnsafe f63785l;

        /* renamed from: m */
        public final FqNameUnsafe f63786m;

        /* renamed from: n */
        public final FqNameUnsafe f63787n;

        /* renamed from: o */
        public final FqNameUnsafe f63788o;

        /* renamed from: p */
        public final FqNameUnsafe f63789p;

        /* renamed from: q */
        public final FqNameUnsafe f63790q;

        /* renamed from: r */
        public final FqName f63791r;

        /* renamed from: s */
        public final FqName f63792s;

        /* renamed from: t */
        public final FqName f63793t;

        /* renamed from: u */
        public final FqName f63794u;

        /* renamed from: v */
        public final FqName f63795v;

        /* renamed from: w */
        public final FqName f63796w;

        /* renamed from: x */
        public final FqName f63797x;

        /* renamed from: y */
        public final FqName f63798y;

        /* renamed from: z */
        public final FqName f63799z;

        /* renamed from: a */
        public final FqNameUnsafe f63768a = m32419d("Any");

        /* renamed from: b */
        public final FqNameUnsafe f63770b = m32419d("Nothing");

        /* renamed from: c */
        public final FqNameUnsafe f63772c = m32419d("Cloneable");

        public FqNames() {
            m32418c("Suppress");
            this.f63774d = m32419d("Unit");
            this.f63776e = m32419d("CharSequence");
            this.f63778f = m32419d("String");
            this.f63780g = m32419d("Array");
            this.f63781h = m32419d("Boolean");
            this.f63782i = m32419d("Char");
            this.f63783j = m32419d("Byte");
            this.f63784k = m32419d("Short");
            this.f63785l = m32419d("Int");
            this.f63786m = m32419d("Long");
            this.f63787n = m32419d("Float");
            this.f63788o = m32419d("Double");
            this.f63789p = m32419d("Number");
            this.f63790q = m32419d("Enum");
            m32419d("Function");
            this.f63791r = m32418c("Throwable");
            this.f63792s = m32418c("Comparable");
            m32420e("CharRange");
            m32420e("IntRange");
            m32420e("LongRange");
            this.f63793t = m32418c("Deprecated");
            this.f63794u = m32418c("DeprecationLevel");
            this.f63795v = m32418c("ReplaceWith");
            this.f63796w = m32418c("ExtensionFunctionType");
            this.f63797x = m32418c("ParameterName");
            this.f63798y = m32418c("Annotation");
            this.f63799z = m32416a("Target");
            this.f63742A = m32416a("AnnotationTarget");
            this.f63743B = m32416a("AnnotationRetention");
            this.f63744C = m32416a("Retention");
            this.f63745D = m32416a("Repeatable");
            this.f63746E = m32416a("MustBeDocumented");
            this.f63747F = m32418c("UnsafeVariance");
            m32418c("PublishedApi");
            this.f63748G = m32417b("Iterator");
            this.f63749H = m32417b("Iterable");
            this.f63750I = m32417b("Collection");
            this.f63751J = m32417b("List");
            this.f63752K = m32417b("ListIterator");
            this.f63753L = m32417b("Set");
            FqName m32417b = m32417b("Map");
            this.f63754M = m32417b;
            this.f63755N = new FqName(m32417b.f65597a.m33201a(Name.m33211d("Entry")), m32417b);
            this.f63756O = m32417b("MutableIterator");
            this.f63757P = m32417b("MutableIterable");
            this.f63758Q = m32417b("MutableCollection");
            this.f63759R = m32417b("MutableList");
            this.f63760S = m32417b("MutableListIterator");
            this.f63761T = m32417b("MutableSet");
            FqName m32417b2 = m32417b("MutableMap");
            this.f63762U = m32417b2;
            this.f63763V = new FqName(m32417b2.f65597a.m33201a(Name.m33211d("MutableEntry")), m32417b2);
            this.f63764W = m32421f("KClass");
            m32421f("KCallable");
            m32421f("KProperty0");
            m32421f("KProperty1");
            m32421f("KProperty2");
            m32421f("KMutableProperty0");
            m32421f("KMutableProperty1");
            m32421f("KMutableProperty2");
            this.f63765X = ClassId.m33188i(m32421f("KProperty").m33207g());
            FqName m32418c = m32418c("UByte");
            FqName m32418c2 = m32418c("UShort");
            FqName m32418c3 = m32418c("UInt");
            FqName m32418c4 = m32418c("ULong");
            this.f63766Y = new ClassId(m32418c.m33198c(), m32418c.m33199d());
            this.f63767Z = new ClassId(m32418c2.m33198c(), m32418c2.m33199d());
            this.f63769a0 = new ClassId(m32418c3.m33198c(), m32418c3.m33199d());
            this.f63771b0 = new ClassId(m32418c4.m33198c(), m32418c4.m33199d());
            this.f63773c0 = new HashSet(CollectionsKt.m33771a(PrimitiveType.values().length));
            this.f63775d0 = new HashSet(CollectionsKt.m33771a(PrimitiveType.values().length));
            this.f63777e0 = CollectionsKt.m33773c(PrimitiveType.values().length);
            this.f63779f0 = CollectionsKt.m33773c(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                this.f63773c0.add(primitiveType.f63816b);
                this.f63775d0.add(primitiveType.f63817c);
                this.f63777e0.put(m32419d(primitiveType.f63816b.f65606b), primitiveType);
                this.f63779f0.put(m32419d(primitiveType.f63817c.f65606b), primitiveType);
            }
        }

        @NotNull
        /* renamed from: a */
        public static FqName m32416a(@NotNull String str) {
            FqName fqName = KotlinBuiltIns.f63726h;
            return new FqName(fqName.f65597a.m33201a(Name.m33211d(str)), fqName);
        }

        @NotNull
        /* renamed from: b */
        public static FqName m32417b(@NotNull String str) {
            FqName fqName = KotlinBuiltIns.f63727i;
            return new FqName(fqName.f65597a.m33201a(Name.m33211d(str)), fqName);
        }

        @NotNull
        /* renamed from: c */
        public static FqName m32418c(@NotNull String str) {
            FqName fqName = KotlinBuiltIns.f63725g;
            return new FqName(fqName.f65597a.m33201a(Name.m33211d(str)), fqName);
        }

        @NotNull
        /* renamed from: d */
        public static FqNameUnsafe m32419d(@NotNull String str) {
            return m32418c(str).f65597a;
        }

        @NotNull
        /* renamed from: e */
        public static FqNameUnsafe m32420e(@NotNull String str) {
            FqName fqName = KotlinBuiltIns.f63728j;
            return fqName.f65597a.m33201a(Name.m33211d(str));
        }

        @NotNull
        /* renamed from: f */
        public static FqNameUnsafe m32421f(@NotNull String str) {
            FqName fqName = ReflectionTypesKt.f63827a;
            return fqName.f65597a.m33201a(Name.m33211d(str));
        }
    }

    public static class PackageFragments {

        /* renamed from: a */
        public final PackageFragmentDescriptor f63800a;

        /* renamed from: b */
        public final PackageFragmentDescriptor f63801b;

        /* renamed from: c */
        public final PackageFragmentDescriptor f63802c;

        public PackageFragments(PackageFragmentDescriptor packageFragmentDescriptor, PackageFragmentDescriptor packageFragmentDescriptor2, PackageFragmentDescriptor packageFragmentDescriptor3, Set set, C65431 c65431) {
            this.f63800a = packageFragmentDescriptor;
            this.f63801b = packageFragmentDescriptor2;
            this.f63802c = packageFragmentDescriptor3;
        }
    }

    public static class Primitives {

        /* renamed from: a */
        public final Map<PrimitiveType, SimpleType> f63803a;

        /* renamed from: b */
        public final Map<KotlinType, SimpleType> f63804b;

        /* renamed from: c */
        public final Map<SimpleType, SimpleType> f63805c;

        public Primitives(Map map, Map map2, Map map3, C65431 c65431) {
            this.f63803a = map;
            this.f63804b = map2;
            this.f63805c = map3;
        }
    }

    static {
        Name m33211d = Name.m33211d("kotlin");
        f63724f = m33211d;
        FqName m33195f = FqName.m33195f(m33211d);
        f63725g = m33195f;
        FqName fqName = new FqName(m33195f.f65597a.m33201a(Name.m33211d("annotation")), m33195f);
        f63726h = fqName;
        FqName fqName2 = new FqName(m33195f.f65597a.m33201a(Name.m33211d("collections")), m33195f);
        f63727i = fqName2;
        FqName fqName3 = new FqName(m33195f.f65597a.m33201a(Name.m33211d("ranges")), m33195f);
        f63728j = fqName3;
        m33195f.f65597a.m33201a(Name.m33211d("text"));
        f63729k = SetsKt.m32080g(m33195f, fqName2, fqName3, fqName, ReflectionTypesKt.f63827a, new FqName(m33195f.f65597a.m33201a(Name.m33211d("internal")), m33195f), DescriptorUtils.f65877c);
        f63730l = new FqNames();
        f63731m = Name.m33213f("<built-ins module>");
    }

    public KotlinBuiltIns(@NotNull StorageManager storageManager) {
        this.f63736e = storageManager;
        this.f63734c = storageManager.mo33623c(new Function0<PackageFragments>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public PackageFragments invoke() {
                PackageFragmentProvider m32634O = KotlinBuiltIns.this.f63732a.m32634O();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                PackageFragmentDescriptor m32388a = KotlinBuiltIns.m32388a(KotlinBuiltIns.this, m32634O, linkedHashMap, KotlinBuiltIns.f63725g);
                KotlinBuiltIns.m32388a(KotlinBuiltIns.this, m32634O, null, DescriptorUtils.f65877c);
                PackageFragmentDescriptor m32388a2 = KotlinBuiltIns.m32388a(KotlinBuiltIns.this, m32634O, linkedHashMap, KotlinBuiltIns.f63727i);
                KotlinBuiltIns.m32388a(KotlinBuiltIns.this, m32634O, linkedHashMap, KotlinBuiltIns.f63728j);
                return new PackageFragments(m32388a, m32388a2, KotlinBuiltIns.m32388a(KotlinBuiltIns.this, m32634O, linkedHashMap, KotlinBuiltIns.f63726h), new LinkedHashSet(linkedHashMap.values()), null);
            }
        });
        this.f63733b = storageManager.mo33623c(new Function0<Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public Primitives invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    SimpleType mo32502r = KotlinBuiltIns.this.f63735d.invoke(Name.m33211d(primitiveType.f63816b.f65606b)).mo32502r();
                    SimpleType mo32502r2 = KotlinBuiltIns.this.f63735d.invoke(Name.m33211d(primitiveType.f63817c.f65606b)).mo32502r();
                    enumMap.put((EnumMap) primitiveType, (PrimitiveType) mo32502r2);
                    hashMap.put(mo32502r, mo32502r2);
                    hashMap2.put(mo32502r2, mo32502r);
                }
                return new Primitives(enumMap, hashMap, hashMap2, null);
            }
        });
        this.f63735d = storageManager.mo33626f(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(Name name) {
                return KotlinBuiltIns.m32390k(name, KotlinBuiltIns.this.f63734c.invoke().f63800a);
            }
        });
    }

    /* renamed from: B */
    public static boolean m32374B(@NotNull KotlinType kotlinType) {
        return m32377E(kotlinType, f63730l.f63768a);
    }

    /* renamed from: C */
    public static boolean m32375C(@NotNull KotlinType kotlinType) {
        return m32377E(kotlinType, f63730l.f63780g);
    }

    /* renamed from: D */
    public static boolean m32376D(@NotNull DeclarationDescriptor declarationDescriptor) {
        return DescriptorUtils.m33471g(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    /* renamed from: E */
    public static boolean m32377E(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        return (mo32449b instanceof ClassDescriptor) && m32389b(mo32449b, fqNameUnsafe);
    }

    /* renamed from: F */
    public static boolean m32378F(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        return m32377E(kotlinType, fqNameUnsafe) && !kotlinType.mo32838I0();
    }

    /* renamed from: G */
    public static boolean m32379G(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor.mo32487a().getAnnotations().mo32592R0(f63730l.f63793t)) {
            return true;
        }
        if (!(declarationDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
        boolean mo32575i0 = propertyDescriptor.mo32575i0();
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter != null && m32379G(getter)) {
            if (!mo32575i0) {
                return true;
            }
            if (setter != null && m32379G(setter)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m32380H(@NotNull KotlinType kotlinType) {
        return m32381I(kotlinType) && !TypeUtils.m33694d(kotlinType);
    }

    /* renamed from: I */
    public static boolean m32381I(@NotNull KotlinType kotlinType) {
        return m32377E(kotlinType, f63730l.f63770b);
    }

    /* renamed from: J */
    public static boolean m32382J(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        return (mo32449b == null || m32392v(mo32449b) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m32383K(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r3) {
        /*
            boolean r0 = r3.mo32838I0()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L27
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.mo33515H0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.mo32449b()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r0 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r3 = m32393x(r3)
            if (r3 == 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 == 0) goto L27
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.m32383K(kotlin.reflect.jvm.internal.impl.types.KotlinType):boolean");
    }

    /* renamed from: L */
    public static boolean m32384L(@NotNull ClassDescriptor classDescriptor) {
        FqNames fqNames = f63730l;
        return m32389b(classDescriptor, fqNames.f63768a) || m32389b(classDescriptor, fqNames.f63770b);
    }

    /* renamed from: M */
    public static boolean m32385M(@Nullable KotlinType kotlinType) {
        return !kotlinType.mo32838I0() && m32377E(kotlinType, f63730l.f63778f);
    }

    /* renamed from: N */
    public static boolean m32386N(@NotNull DeclarationDescriptor declarationDescriptor) {
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).mo32550d().m33200e(f63724f);
            }
            declarationDescriptor = declarationDescriptor.mo32437b();
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m32387O(@NotNull KotlinType kotlinType) {
        return !kotlinType.mo32838I0() && m32377E(kotlinType, f63730l.f63774d);
    }

    /* renamed from: a */
    public static PackageFragmentDescriptor m32388a(KotlinBuiltIns kotlinBuiltIns, PackageFragmentProvider packageFragmentProvider, Map map, final FqName fqName) {
        Objects.requireNonNull(kotlinBuiltIns);
        final List<PackageFragmentDescriptor> mo32551a = ((CompositePackageFragmentProvider) packageFragmentProvider).mo32551a(fqName);
        PackageFragmentDescriptor emptyPackageFragmentDescriptor = mo32551a.isEmpty() ? new EmptyPackageFragmentDescriptor(kotlinBuiltIns.f63732a, fqName) : mo32551a.size() == 1 ? mo32551a.iterator().next() : new PackageFragmentDescriptorImpl(kotlinBuiltIns, kotlinBuiltIns.f63732a, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.5
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            @NotNull
            /* renamed from: p */
            public MemberScope mo32415p() {
                StringBuilder m24u = C0000a.m24u("built-in package ");
                m24u.append(fqName);
                return new ChainedMemberScope(m24u.toString(), kotlin.collections.CollectionsKt.m31997J(mo32551a, new Function1<PackageFragmentDescriptor, MemberScope>(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.5.1
                    @Override // kotlin.jvm.functions.Function1
                    public MemberScope invoke(PackageFragmentDescriptor packageFragmentDescriptor) {
                        return packageFragmentDescriptor.mo32415p();
                    }
                }));
            }
        };
        if (map != null) {
            map.put(fqName, emptyPackageFragmentDescriptor);
        }
        return emptyPackageFragmentDescriptor;
    }

    /* renamed from: b */
    public static boolean m32389b(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        return classifierDescriptor.getName().equals(fqNameUnsafe.m33206f()) && fqNameUnsafe.equals(DescriptorUtils.m33468d(classifierDescriptor));
    }

    @NotNull
    /* renamed from: k */
    public static ClassDescriptor m32390k(@NotNull Name name, @NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
        ClassDescriptor classDescriptor = (ClassDescriptor) packageFragmentDescriptor.mo32415p().mo32732c(name, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptor != null) {
            return classDescriptor;
        }
        throw new AssertionError(C0000a.m20q(C0000a.m24u("Built-in class "), packageFragmentDescriptor.mo32550d().f65597a.m33201a(name).f65602a, " is not found"));
    }

    @NotNull
    /* renamed from: o */
    public static ClassId m32391o(int i2) {
        return new ClassId(f63725g, Name.m33211d("Function" + i2));
    }

    @Nullable
    /* renamed from: v */
    public static PrimitiveType m32392v(@NotNull DeclarationDescriptor declarationDescriptor) {
        FqNames fqNames = f63730l;
        if (fqNames.f63775d0.contains(declarationDescriptor.getName())) {
            return fqNames.f63779f0.get(DescriptorUtils.m33468d(declarationDescriptor));
        }
        return null;
    }

    @Nullable
    /* renamed from: x */
    public static PrimitiveType m32393x(@NotNull DeclarationDescriptor declarationDescriptor) {
        FqNames fqNames = f63730l;
        if (fqNames.f63773c0.contains(declarationDescriptor.getName())) {
            return fqNames.f63777e0.get(DescriptorUtils.m33468d(declarationDescriptor));
        }
        return null;
    }

    @NotNull
    /* renamed from: A */
    public SimpleType m32394A() {
        return this.f63735d.invoke(Name.m33211d("Unit")).mo32502r();
    }

    /* renamed from: c */
    public void m32395c() {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f63731m, this.f63736e, this, null, null, null, 48);
        this.f63732a = moduleDescriptorImpl;
        Objects.requireNonNull(BuiltInsLoader.f63715a);
        Lazy lazy = BuiltInsLoader.Companion.f63717b;
        KProperty kProperty = BuiltInsLoader.Companion.f63716a[0];
        PackageFragmentProvider providerForModuleContent = ((BuiltInsLoader) lazy.getValue()).mo32363a(this.f63736e, this.f63732a, mo32403l(), mo32409s(), mo32396d());
        Intrinsics.m32180i(providerForModuleContent, "providerForModuleContent");
        moduleDescriptorImpl.f64189e = providerForModuleContent;
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f63732a;
        Objects.requireNonNull(moduleDescriptorImpl2);
        moduleDescriptorImpl2.f64188d = new ModuleDependenciesImpl(ArraysKt.m31952b0(new ModuleDescriptorImpl[]{moduleDescriptorImpl2}), EmptySet.f63146b, EmptyList.f63144b);
    }

    @NotNull
    /* renamed from: d */
    public AdditionalClassPartsProvider mo32396d() {
        return AdditionalClassPartsProvider.None.f64059a;
    }

    @NotNull
    /* renamed from: e */
    public SimpleType m32397e() {
        return this.f63735d.invoke(Name.m33211d("Any")).mo32502r();
    }

    @NotNull
    /* renamed from: f */
    public KotlinType m32398f(@NotNull KotlinType kotlinType) {
        ClassId m33535h;
        ClassId classId;
        ClassDescriptor m32519a;
        if (m32375C(kotlinType)) {
            if (kotlinType.mo33514G0().size() == 1) {
                return kotlinType.mo33514G0().get(0).getType();
            }
            throw new IllegalStateException();
        }
        SimpleType simpleType = TypeUtils.f66355a;
        UnwrappedType mo32787K0 = kotlinType.mo33662J0().mo32787K0(false);
        SimpleType simpleType2 = this.f63733b.invoke().f63805c.get(mo32787K0);
        if (simpleType2 != null) {
            return simpleType2;
        }
        ClassifierDescriptor mo32449b = mo32787K0.mo33515H0().mo32449b();
        SimpleType simpleType3 = null;
        ModuleDescriptor m33466b = mo32449b == null ? null : DescriptorUtils.m33466b(mo32449b);
        if (m33466b != null) {
            ClassifierDescriptor mo32449b2 = mo32787K0.mo33515H0().mo32449b();
            if (mo32449b2 != null) {
                UnsignedTypes unsignedTypes = UnsignedTypes.f63838e;
                Name name = mo32449b2.getName();
                Intrinsics.m32180i(name, "name");
                if (UnsignedTypes.f63837d.contains(name) && (m33535h = DescriptorUtilsKt.m33535h(mo32449b2)) != null && (classId = UnsignedTypes.f63835b.get(m33535h)) != null && (m32519a = FindClassInModuleKt.m32519a(m33466b, classId)) != null) {
                    simpleType3 = m32519a.mo32502r();
                }
            }
            if (simpleType3 != null) {
                return simpleType3;
            }
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    @NotNull
    /* renamed from: g */
    public SimpleType m32399g(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        List singletonList = Collections.singletonList(new TypeProjectionImpl(variance, kotlinType));
        return KotlinTypeFactory.m33664b(Annotations.Companion.f64024a, this.f63735d.invoke(Name.m33211d("Array")), singletonList);
    }

    @NotNull
    /* renamed from: h */
    public SimpleType m32400h() {
        return m32412w(PrimitiveType.BOOLEAN);
    }

    @NotNull
    /* renamed from: i */
    public ClassDescriptor m32401i(@NotNull FqName fqName) {
        return DescriptorUtilKt.m32518a(this.f63732a, fqName, NoLookupLocation.FROM_BUILTINS);
    }

    @NotNull
    /* renamed from: j */
    public final ClassDescriptor m32402j(@NotNull String str) {
        return this.f63735d.invoke(Name.m33211d(str));
    }

    @NotNull
    /* renamed from: l */
    public Iterable<ClassDescriptorFactory> mo32403l() {
        return Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f63736e, this.f63732a));
    }

    @NotNull
    /* renamed from: m */
    public ClassDescriptor m32404m() {
        return m32390k(Name.m33211d("Collection"), this.f63734c.invoke().f63801b);
    }

    @NotNull
    /* renamed from: n */
    public SimpleType m32405n() {
        return m32408r();
    }

    @NotNull
    /* renamed from: p */
    public SimpleType m32406p() {
        return m32412w(PrimitiveType.INT);
    }

    @NotNull
    /* renamed from: q */
    public SimpleType m32407q() {
        return this.f63735d.invoke(Name.m33211d("Nothing")).mo32502r();
    }

    @NotNull
    /* renamed from: r */
    public SimpleType m32408r() {
        return m32397e().mo32787K0(true);
    }

    @NotNull
    /* renamed from: s */
    public PlatformDependentDeclarationFilter mo32409s() {
        return PlatformDependentDeclarationFilter.NoPlatformDependent.f64061a;
    }

    @NotNull
    /* renamed from: t */
    public SimpleType m32410t(@NotNull PrimitiveType primitiveType) {
        return this.f63733b.invoke().f63803a.get(primitiveType);
    }

    @Nullable
    /* renamed from: u */
    public SimpleType m32411u(@NotNull KotlinType kotlinType) {
        SimpleType simpleType = this.f63733b.invoke().f63804b.get(kotlinType);
        if (simpleType != null) {
            return simpleType;
        }
        if (!UnsignedTypes.f63838e.m32424a(kotlinType) || TypeUtils.m33694d(kotlinType)) {
            return null;
        }
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        ModuleDescriptor m33466b = mo32449b == null ? null : DescriptorUtils.m33466b(mo32449b);
        if (m33466b == null) {
            return null;
        }
        ClassId arrayClassId = DescriptorUtilsKt.m33535h(kotlinType.mo33515H0().mo32449b());
        Intrinsics.m32180i(arrayClassId, "arrayClassId");
        ClassDescriptor m32519a = FindClassInModuleKt.m32519a(m33466b, UnsignedTypes.f63836c.get(arrayClassId));
        if (m32519a == null) {
            return null;
        }
        return m32519a.mo32502r();
    }

    @NotNull
    /* renamed from: w */
    public SimpleType m32412w(@NotNull PrimitiveType primitiveType) {
        return m32402j(primitiveType.f63816b.f65606b).mo32502r();
    }

    @NotNull
    /* renamed from: y */
    public SimpleType m32413y() {
        return this.f63735d.invoke(Name.m33211d("String")).mo32502r();
    }

    @NotNull
    /* renamed from: z */
    public ClassDescriptor m32414z(int i2) {
        Name m33211d = Name.m33211d(FunctionClassDescriptor.Kind.f63857e.f63863c + i2);
        FqName fqName = DescriptorUtils.f65877c;
        return DescriptorUtilKt.m32518a(this.f63732a, new FqName(fqName.f65597a.m33201a(m33211d), fqName), NoLookupLocation.FROM_BUILTINS);
    }
}
