package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class JavaResolverComponents {

    /* renamed from: a */
    @NotNull
    public final StorageManager f64446a;

    /* renamed from: b */
    @NotNull
    public final JavaClassFinder f64447b;

    /* renamed from: c */
    @NotNull
    public final KotlinClassFinder f64448c;

    /* renamed from: d */
    @NotNull
    public final DeserializedDescriptorResolver f64449d;

    /* renamed from: e */
    @NotNull
    public final SignaturePropagator f64450e;

    /* renamed from: f */
    @NotNull
    public final ErrorReporter f64451f;

    /* renamed from: g */
    @NotNull
    public final JavaResolverCache f64452g;

    /* renamed from: h */
    @NotNull
    public final JavaPropertyInitializerEvaluator f64453h;

    /* renamed from: i */
    @NotNull
    public final SamConversionResolver f64454i;

    /* renamed from: j */
    @NotNull
    public final JavaSourceElementFactory f64455j;

    /* renamed from: k */
    @NotNull
    public final ModuleClassResolver f64456k;

    /* renamed from: l */
    @NotNull
    public final PackagePartProvider f64457l;

    /* renamed from: m */
    @NotNull
    public final SupertypeLoopChecker f64458m;

    /* renamed from: n */
    @NotNull
    public final LookupTracker f64459n;

    /* renamed from: o */
    @NotNull
    public final ModuleDescriptor f64460o;

    /* renamed from: p */
    @NotNull
    public final ReflectionTypes f64461p;

    /* renamed from: q */
    @NotNull
    public final AnnotationTypeQualifierResolver f64462q;

    /* renamed from: r */
    @NotNull
    public final SignatureEnhancement f64463r;

    /* renamed from: s */
    @NotNull
    public final JavaClassesTracker f64464s;

    /* renamed from: t */
    @NotNull
    public final JavaResolverSettings f64465t;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder finder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory sourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor module, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker, @NotNull JavaResolverSettings settings) {
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(finder, "finder");
        Intrinsics.m32180i(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.m32180i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.m32180i(signaturePropagator, "signaturePropagator");
        Intrinsics.m32180i(errorReporter, "errorReporter");
        Intrinsics.m32180i(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.m32180i(samConversionResolver, "samConversionResolver");
        Intrinsics.m32180i(sourceElementFactory, "sourceElementFactory");
        Intrinsics.m32180i(moduleClassResolver, "moduleClassResolver");
        Intrinsics.m32180i(packagePartProvider, "packagePartProvider");
        Intrinsics.m32180i(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.m32180i(lookupTracker, "lookupTracker");
        Intrinsics.m32180i(module, "module");
        Intrinsics.m32180i(reflectionTypes, "reflectionTypes");
        Intrinsics.m32180i(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.m32180i(signatureEnhancement, "signatureEnhancement");
        Intrinsics.m32180i(javaClassesTracker, "javaClassesTracker");
        Intrinsics.m32180i(settings, "settings");
        this.f64446a = storageManager;
        this.f64447b = finder;
        this.f64448c = kotlinClassFinder;
        this.f64449d = deserializedDescriptorResolver;
        this.f64450e = signaturePropagator;
        this.f64451f = errorReporter;
        this.f64452g = javaResolverCache;
        this.f64453h = javaPropertyInitializerEvaluator;
        this.f64454i = samConversionResolver;
        this.f64455j = sourceElementFactory;
        this.f64456k = moduleClassResolver;
        this.f64457l = packagePartProvider;
        this.f64458m = supertypeLoopChecker;
        this.f64459n = lookupTracker;
        this.f64460o = module;
        this.f64461p = reflectionTypes;
        this.f64462q = annotationTypeQualifierResolver;
        this.f64463r = signatureEnhancement;
        this.f64464s = javaClassesTracker;
        this.f64465t = settings;
    }
}
