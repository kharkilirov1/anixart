package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes3.dex */
public final class DeserializationComponentsForJava {

    /* renamed from: a */
    @NotNull
    public final DeserializationComponents f64780a;

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull JavaClassDataFinder javaClassDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer) {
        PlatformDependentDeclarationFilter m32474P;
        AdditionalClassPartsProvider m32474P2;
        KotlinBuiltIns kotlinBuiltIns = ((ModuleDescriptorImpl) moduleDescriptor).f64194j;
        JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) (kotlinBuiltIns instanceof JvmBuiltIns ? kotlinBuiltIns : null);
        LocalClassifierTypeSettings.Default r7 = LocalClassifierTypeSettings.Default.f66092a;
        JavaFlexibleTypeDeserializer javaFlexibleTypeDeserializer = JavaFlexibleTypeDeserializer.f64791a;
        EmptyList emptyList = EmptyList.f63144b;
        AdditionalClassPartsProvider additionalClassPartsProvider = (jvmBuiltIns == null || (m32474P2 = jvmBuiltIns.m32474P()) == null) ? AdditionalClassPartsProvider.None.f64059a : m32474P2;
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter = (jvmBuiltIns == null || (m32474P = jvmBuiltIns.m32474P()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.f64061a : m32474P;
        JvmProtoBufUtil jvmProtoBufUtil = JvmProtoBufUtil.f65584b;
        this.f64780a = new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, r7, errorReporter, lookupTracker, javaFlexibleTypeDeserializer, emptyList, notFoundClasses, contractDeserializer, additionalClassPartsProvider, platformDependentDeclarationFilter, JvmProtoBufUtil.f65583a);
    }
}
