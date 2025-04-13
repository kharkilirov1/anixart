package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmBuiltInsSettings.kt */
/* loaded from: classes3.dex */
public class JvmBuiltInsSettings implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* renamed from: i */
    public static final /* synthetic */ KProperty[] f63905i = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltInsSettings.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltInsSettings.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltInsSettings.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltInsSettings.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: j */
    @NotNull
    public static final Set<String> f63906j;

    /* renamed from: k */
    @NotNull
    public static final Set<String> f63907k;

    /* renamed from: l */
    @NotNull
    public static final Set<String> f63908l;

    /* renamed from: m */
    @NotNull
    public static final Set<String> f63909m;

    /* renamed from: n */
    @NotNull
    public static final Set<String> f63910n;

    /* renamed from: o */
    @NotNull
    public static final Set<String> f63911o;

    /* renamed from: p */
    public static final Companion f63912p;

    /* renamed from: a */
    public final JavaToKotlinClassMap f63913a;

    /* renamed from: b */
    public final Lazy f63914b;

    /* renamed from: c */
    public final Lazy f63915c;

    /* renamed from: d */
    public final KotlinType f63916d;

    /* renamed from: e */
    public final NotNullLazyValue f63917e;

    /* renamed from: f */
    public final CacheWithNotNullValues<FqName, ClassDescriptor> f63918f;

    /* renamed from: g */
    public final NotNullLazyValue f63919g;

    /* renamed from: h */
    public final ModuleDescriptor f63920h;

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final boolean m32482a(FqNameUnsafe fqNameUnsafe) {
            KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
            if (!Intrinsics.m32174c(fqNameUnsafe, fqNames.f63780g)) {
                if (!(fqNames.f63779f0.get(fqNameUnsafe) != null)) {
                    return false;
                }
            }
            return true;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    public enum JDKMemberStatus {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[1] = 4;
        }
    }

    static {
        Companion companion = new Companion(null);
        f63912p = companion;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
        f63906j = SetsKt.m32078e(signatureBuildingComponents.m32936e("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        Objects.requireNonNull(companion);
        List<JvmPrimitiveType> m31994G = CollectionsKt.m31994G(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : m31994G) {
            String str = jvmPrimitiveType.f65957e.m33199d().f65606b;
            Intrinsics.m32175d(str, "it.wrapperFqName.shortName().asString()");
            CollectionsKt.m32020g(linkedHashSet, signatureBuildingComponents.m32935d(str, jvmPrimitiveType.f65955c + "Value()" + jvmPrimitiveType.f65956d));
        }
        f63907k = SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(linkedHashSet, signatureBuildingComponents.m32936e("List", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.m32935d("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.m32935d("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.m32935d("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.m32935d("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.f64806a;
        f63908l = SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(SetsKt.m32077d(signatureBuildingComponents2.m32935d("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents2.m32936e("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents2.m32935d("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents2.m32935d("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents2.m32936e("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents2.m32936e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), signatureBuildingComponents2.m32936e("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f63909m = SetsKt.m32077d(SetsKt.m32077d(signatureBuildingComponents2.m32936e("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents2.m32936e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents2.m32936e("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Objects.requireNonNull(f63912p);
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List m31994G2 = CollectionsKt.m31994G(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = m31994G2.iterator();
        while (it.hasNext()) {
            String str2 = ((JvmPrimitiveType) it.next()).f65957e.m33199d().f65606b;
            Intrinsics.m32175d(str2, "it.wrapperFqName.shortName().asString()");
            String[] m32932a = signatureBuildingComponents2.m32932a("Ljava/lang/String;");
            CollectionsKt.m32020g(linkedHashSet2, signatureBuildingComponents2.m32935d(str2, (String[]) Arrays.copyOf(m32932a, m32932a.length)));
        }
        String[] m32932a2 = signatureBuildingComponents2.m32932a("D");
        Set m32077d = SetsKt.m32077d(linkedHashSet2, signatureBuildingComponents2.m32935d("Float", (String[]) Arrays.copyOf(m32932a2, m32932a2.length)));
        String[] m32932a3 = signatureBuildingComponents2.m32932a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f63910n = SetsKt.m32077d(m32077d, signatureBuildingComponents2.m32935d("String", (String[]) Arrays.copyOf(m32932a3, m32932a3.length)));
        SignatureBuildingComponents signatureBuildingComponents3 = SignatureBuildingComponents.f64806a;
        String[] m32932a4 = signatureBuildingComponents3.m32932a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f63911o = signatureBuildingComponents3.m32935d("Throwable", (String[]) Arrays.copyOf(m32932a4, m32932a4.length));
    }

    public JvmBuiltInsSettings(@NotNull final ModuleDescriptor moduleDescriptor, @NotNull final StorageManager storageManager, @NotNull Function0<? extends ModuleDescriptor> function0, @NotNull Function0<Boolean> function02) {
        Intrinsics.m32180i(storageManager, "storageManager");
        this.f63920h = moduleDescriptor;
        this.f63913a = JavaToKotlinClassMap.f63882m;
        this.f63914b = LazyKt.m31881b(function0);
        this.f63915c = LazyKt.m31881b(function02);
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(this, moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            /* renamed from: p */
            public /* bridge */ /* synthetic */ MemberScope mo32415p() {
                return MemberScope.Empty.f65996b;
            }
        }, Name.m33211d("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.m31993F(new LazyWrappedType(storageManager, new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                SimpleType m32397e = JvmBuiltInsSettings.this.f63920h.mo32547n().m32397e();
                Intrinsics.m32175d(m32397e, "moduleDescriptor.builtIns.anyType");
                return m32397e;
            }
        })), SourceElement.f63979a, false, storageManager);
        MemberScope.Empty empty = MemberScope.Empty.f65996b;
        EmptySet emptySet = EmptySet.f63146b;
        classDescriptorImpl.f64098k = empty;
        classDescriptorImpl.f64099l = emptySet;
        classDescriptorImpl.f64100m = null;
        SimpleType mo32502r = classDescriptorImpl.mo32502r();
        Intrinsics.m32175d(mo32502r, "mockSerializableClass.defaultType");
        this.f63916d = mo32502r;
        this.f63917e = storageManager.mo33623c(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                Lazy lazy = JvmBuiltInsSettings.this.f63914b;
                KProperty[] kPropertyArr = JvmBuiltInsSettings.f63905i;
                KProperty kProperty = kPropertyArr[0];
                ModuleDescriptor moduleDescriptor2 = (ModuleDescriptor) lazy.getValue();
                Objects.requireNonNull(JvmBuiltInClassDescriptorFactory.f63890h);
                ClassId classId = JvmBuiltInClassDescriptorFactory.f63889g;
                StorageManager storageManager2 = storageManager;
                Lazy lazy2 = JvmBuiltInsSettings.this.f63914b;
                KProperty kProperty2 = kPropertyArr[0];
                return FindClassInModuleKt.m32520b(moduleDescriptor2, classId, new NotFoundClasses(storageManager2, (ModuleDescriptor) lazy2.getValue())).mo32502r();
            }
        });
        this.f63918f = storageManager.mo33621a();
        this.f63919g = storageManager.mo33623c(new Function0<Annotations>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Annotations invoke() {
                AnnotationDescriptor m32590a = AnnotationUtilKt.m32590a(JvmBuiltInsSettings.this.f63920h.mo32547n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6);
                int i2 = Annotations.f64023H1;
                return Annotations.Companion.f64025b.m32594a(CollectionsKt.m31993F(m32590a));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getConstructors$1] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* renamed from: a */
    public Collection<ClassConstructorDescriptor> mo32475a(@NotNull ClassDescriptor classDescriptor) {
        boolean z;
        boolean z2;
        FqNameUnsafe fqNameUnsafe;
        if (((DeserializedClassDescriptor) classDescriptor).f66160h != ClassKind.CLASS || !m32481g()) {
            return EmptyList.f63144b;
        }
        LazyJavaClassDescriptor m32480f = m32480f(classDescriptor);
        if (m32480f == null) {
            return EmptyList.f63144b;
        }
        JavaToKotlinClassMap javaToKotlinClassMap = this.f63913a;
        FqName m33536i = DescriptorUtilsKt.m33536i(m32480f);
        FallbackBuiltIns.Companion companion = FallbackBuiltIns.f63868o;
        ClassDescriptor m32462k = JavaToKotlinClassMap.m32462k(javaToKotlinClassMap, m33536i, FallbackBuiltIns.f63867n.m32362a(), null, 4);
        if (m32462k == null) {
            return EmptyList.f63144b;
        }
        final TypeSubstitutor typeSubstitutor = new TypeSubstitutor(MappingUtilKt.m32485a(m32462k, m32480f));
        ?? r4 = new Function2<ConstructorDescriptor, ConstructorDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getConstructors$1
            {
                super(2);
            }

            /* renamed from: a */
            public final boolean m32483a(@NotNull ConstructorDescriptor receiver$0, @NotNull ConstructorDescriptor javaConstructor) {
                Intrinsics.m32180i(receiver$0, "receiver$0");
                Intrinsics.m32180i(javaConstructor, "javaConstructor");
                return OverridingUtil.m33498i(receiver$0, javaConstructor.mo32503c(TypeSubstitutor.this)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(ConstructorDescriptor constructorDescriptor, ConstructorDescriptor constructorDescriptor2) {
                return Boolean.valueOf(m32483a(constructorDescriptor, constructorDescriptor2));
            }
        };
        List<ClassConstructorDescriptor> invoke = m32480f.f64521n.f64532k.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = invoke.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassConstructorDescriptor javaConstructor = (ClassConstructorDescriptor) next;
            Intrinsics.m32175d(javaConstructor, "javaConstructor");
            if (javaConstructor.getVisibility().f64000b) {
                Collection<ClassConstructorDescriptor> mo32442l = m32462k.mo32442l();
                Intrinsics.m32175d(mo32442l, "defaultKotlinVersion.constructors");
                if (!mo32442l.isEmpty()) {
                    for (ClassConstructorDescriptor it2 : mo32442l) {
                        Intrinsics.m32175d(it2, "it");
                        if (r4.m32483a(it2, javaConstructor)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (javaConstructor.mo32489f().size() == 1) {
                        List<ValueParameterDescriptor> valueParameters = javaConstructor.mo32489f();
                        Intrinsics.m32175d(valueParameters, "valueParameters");
                        Object m32011X = CollectionsKt.m32011X(valueParameters);
                        Intrinsics.m32175d(m32011X, "valueParameters.single()");
                        ClassifierDescriptor mo32449b = ((ValueParameterDescriptor) m32011X).getType().mo33515H0().mo32449b();
                        if (mo32449b != null) {
                            fqNameUnsafe = DescriptorUtils.m33468d(mo32449b);
                            Intrinsics.m32175d(fqNameUnsafe, "DescriptorUtils.getFqName(this)");
                        } else {
                            fqNameUnsafe = null;
                        }
                        FqNameUnsafe m33468d = DescriptorUtils.m33468d(classDescriptor);
                        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
                        if (Intrinsics.m32174c(fqNameUnsafe, m33468d)) {
                            z2 = true;
                            if (!z2 && !KotlinBuiltIns.m32379G(javaConstructor) && !f63910n.contains(SignatureBuildingComponents.f64806a.m32942k(m32480f, MethodSignatureMappingKt.m32928a(javaConstructor, false, false, 3)))) {
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) it3.next();
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> mo32524s = classConstructorDescriptor.mo32524s();
            mo32524s.mo32538k(classDescriptor);
            mo32524s.mo32533f(((AbstractClassDescriptor) classDescriptor).mo32502r());
            mo32524s.mo32532e();
            mo32524s.mo32536i(typeSubstitutor.f66349a);
            if (!f63911o.contains(SignatureBuildingComponents.f64806a.m32942k(m32480f, MethodSignatureMappingKt.m32928a(classConstructorDescriptor, false, false, 3)))) {
                mo32524s.mo32541n((Annotations) StorageKt.m33635a(this.f63919g, f63905i[3]));
            }
            FunctionDescriptor mo32527A = mo32524s.mo32527A();
            if (mo32527A == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            }
            arrayList2.add((ClassConstructorDescriptor) mo32527A);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e2, code lost:
    
        if (r4 != 3) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> mo32476b(@org.jetbrains.annotations.NotNull final kotlin.reflect.jvm.internal.impl.name.Name r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r18) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.mo32476b(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    /* renamed from: c */
    public boolean mo32477c(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.m32180i(classDescriptor, "classDescriptor");
        LazyJavaClassDescriptor m32480f = m32480f(classDescriptor);
        if (m32480f == null || !simpleFunctionDescriptor.getAnnotations().mo32592R0(PlatformDependentDeclarationFilterKt.f64062a)) {
            return true;
        }
        if (!m32481g()) {
            return false;
        }
        String m32928a = MethodSignatureMappingKt.m32928a(simpleFunctionDescriptor, false, false, 3);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = m32480f.f64521n;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.m32175d(name, "functionDescriptor.name");
        Collection<SimpleFunctionDescriptor> mo32614a = lazyJavaClassMemberScope.mo32614a(name, NoLookupLocation.FROM_BUILTINS);
        if ((mo32614a instanceof Collection) && mo32614a.isEmpty()) {
            return false;
        }
        Iterator<T> it = mo32614a.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m32174c(MethodSignatureMappingKt.m32928a((SimpleFunctionDescriptor) it.next(), false, false, 3), m32928a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* renamed from: d */
    public Collection<KotlinType> mo32478d(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.m32180i(classDescriptor, "classDescriptor");
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(classDescriptor);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        Companion companion = f63912p;
        boolean z = false;
        if (companion.m32482a(m33468d)) {
            SimpleType cloneableType = (SimpleType) StorageKt.m33635a(this.f63917e, f63905i[2]);
            Intrinsics.m32175d(cloneableType, "cloneableType");
            return CollectionsKt.m31994G(cloneableType, this.f63916d);
        }
        if (companion.m32482a(m33468d)) {
            z = true;
        } else {
            ClassId m32473l = JavaToKotlinClassMap.f63882m.m32473l(m33468d);
            if (m32473l != null) {
                try {
                    z = Serializable.class.isAssignableFrom(Class.forName(m32473l.m33189a().f65597a.f65602a));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return z ? CollectionsKt.m31993F(this.f63916d) : EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    /* renamed from: e */
    public Collection mo32479e(ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        Set<Name> mo32615b;
        Intrinsics.m32180i(classDescriptor, "classDescriptor");
        if (!m32481g()) {
            return EmptySet.f63146b;
        }
        LazyJavaClassDescriptor m32480f = m32480f(classDescriptor);
        return (m32480f == null || (lazyJavaClassMemberScope = m32480f.f64521n) == null || (mo32615b = lazyJavaClassMemberScope.mo32615b()) == null) ? EmptySet.f63146b : mo32615b;
    }

    /* renamed from: f */
    public final LazyJavaClassDescriptor m32480f(@NotNull ClassDescriptor classDescriptor) {
        ClassId m32473l;
        FqName m33189a;
        if (KotlinBuiltIns.m32389b(classDescriptor, KotlinBuiltIns.f63730l.f63768a) || !KotlinBuiltIns.m32386N(classDescriptor)) {
            return null;
        }
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(classDescriptor);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        if (!m33468d.m33204d() || (m32473l = this.f63913a.m32473l(m33468d)) == null || (m33189a = m32473l.m33189a()) == null) {
            return null;
        }
        Lazy lazy = this.f63914b;
        KProperty kProperty = f63905i[0];
        ClassDescriptor m32518a = DescriptorUtilKt.m32518a((ModuleDescriptor) lazy.getValue(), m33189a, NoLookupLocation.FROM_BUILTINS);
        return (LazyJavaClassDescriptor) (m32518a instanceof LazyJavaClassDescriptor ? m32518a : null);
    }

    /* renamed from: g */
    public final boolean m32481g() {
        Lazy lazy = this.f63915c;
        KProperty kProperty = f63905i[1];
        return ((Boolean) lazy.getValue()).booleanValue();
    }
}
