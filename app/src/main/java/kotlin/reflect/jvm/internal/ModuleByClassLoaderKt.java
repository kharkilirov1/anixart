package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.components.ReflectJavaClassFinder;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.components.RuntimePackagePartProvider;
import kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: moduleByClassLoader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ModuleByClassLoaderKt {

    /* renamed from: a */
    public static final ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> f63628a = new ConcurrentHashMap();

    @NotNull
    /* renamed from: a */
    public static final RuntimeModuleData m32303a(@NotNull Class<?> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ClassLoader m33801e = ReflectClassUtilKt.m33801e(receiver$0);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(m33801e);
        ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> concurrentMap = f63628a;
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) concurrentMap).get(weakClassLoaderBox);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            ((ConcurrentHashMap) concurrentMap).remove(weakClassLoaderBox, weakReference);
        }
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager();
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, false, 2);
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(Name.m33213f("<runtime module for " + m33801e + '>'), lockBasedStorageManager, jvmBuiltIns, null, null, null, 56);
        ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(m33801e);
        DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
        RuntimePackagePartProvider runtimePackagePartProvider = new RuntimePackagePartProvider(m33801e);
        JavaResolverCache javaResolverCache = JavaResolverCache.f64407a;
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
        Jsr305State jsr305State = Jsr305State.f66492g;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(lockBasedStorageManager, jsr305State);
        WeakClassLoaderBox weakClassLoaderBox2 = weakClassLoaderBox;
        ReflectJavaClassFinder reflectJavaClassFinder = new ReflectJavaClassFinder(m33801e);
        SignaturePropagator signaturePropagator = SignaturePropagator.f64415a;
        RuntimeErrorReporter runtimeErrorReporter = RuntimeErrorReporter.f63701b;
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.f64406a;
        SamConversionResolver.Empty empty = SamConversionResolver.Empty.f64414a;
        RuntimeSourceElementFactory runtimeSourceElementFactory = RuntimeSourceElementFactory.f63709a;
        SupertypeLoopChecker.EMPTY empty2 = SupertypeLoopChecker.EMPTY.f63981a;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.f64271a;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new JavaResolverComponents(lockBasedStorageManager, reflectJavaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, runtimeErrorReporter, javaResolverCache, doNothing, empty, runtimeSourceElementFactory, singleModuleClassResolver, runtimePackagePartProvider, empty2, do_nothing, moduleDescriptorImpl, new ReflectionTypes(moduleDescriptorImpl, notFoundClasses), annotationTypeQualifierResolver, new SignatureEnhancement(annotationTypeQualifierResolver, jsr305State), JavaClassesTracker.Default.f64342a, JavaResolverSettings.Default.f64466a));
        jvmBuiltIns.f63898n = moduleDescriptorImpl;
        jvmBuiltIns.f63899o = true;
        JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider, javaResolverCache);
        JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptorImpl, notFoundClasses, lockBasedStorageManager, reflectKotlinClassFinder);
        DeserializationConfiguration.Default r12 = DeserializationConfiguration.Default.f66066a;
        int i2 = ContractDeserializer.f66046a;
        DeserializationComponentsForJava deserializationComponentsForJava = new DeserializationComponentsForJava(lockBasedStorageManager, moduleDescriptorImpl, r12, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, notFoundClasses, runtimeErrorReporter, do_nothing, ContractDeserializer.Companion.f66047a);
        singleModuleClassResolver.f64490a = javaDescriptorResolver;
        deserializedDescriptorResolver.f64787a = deserializationComponentsForJava.f64780a;
        ModuleDescriptorImpl moduleDescriptorImpl2 = jvmBuiltIns.f63732a;
        Intrinsics.m32175d(moduleDescriptorImpl2, "builtIns.builtInsModule");
        moduleDescriptorImpl.f64188d = new ModuleDependenciesImpl(ArraysKt.m31952b0(new ModuleDescriptorImpl[]{moduleDescriptorImpl, moduleDescriptorImpl2}), EmptySet.f63146b, EmptyList.f63144b);
        LazyJavaPackageFragmentProvider providerForModuleContent = javaDescriptorResolver.f65938a;
        Intrinsics.m32180i(providerForModuleContent, "providerForModuleContent");
        moduleDescriptorImpl.f64189e = providerForModuleContent;
        RuntimeModuleData runtimeModuleData2 = new RuntimeModuleData(deserializationComponentsForJava.f64780a, runtimePackagePartProvider, null);
        while (true) {
            ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> concurrentMap2 = f63628a;
            WeakClassLoaderBox weakClassLoaderBox3 = weakClassLoaderBox2;
            WeakReference weakReference2 = (WeakReference) ((ConcurrentHashMap) concurrentMap2).putIfAbsent(weakClassLoaderBox3, new WeakReference(runtimeModuleData2));
            if (weakReference2 == null) {
                return runtimeModuleData2;
            }
            RuntimeModuleData runtimeModuleData3 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData3 != null) {
                return runtimeModuleData3;
            }
            ((ConcurrentHashMap) concurrentMap2).remove(weakClassLoaderBox3, weakReference2);
            weakClassLoaderBox2 = weakClassLoaderBox3;
        }
    }
}
