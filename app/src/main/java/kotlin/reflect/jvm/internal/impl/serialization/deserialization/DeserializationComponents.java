package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class DeserializationComponents {

    /* renamed from: a */
    @NotNull
    public final ClassDeserializer f66049a;

    /* renamed from: b */
    @NotNull
    public final StorageManager f66050b;

    /* renamed from: c */
    @NotNull
    public final ModuleDescriptor f66051c;

    /* renamed from: d */
    @NotNull
    public final DeserializationConfiguration f66052d;

    /* renamed from: e */
    @NotNull
    public final ClassDataFinder f66053e;

    /* renamed from: f */
    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f66054f;

    /* renamed from: g */
    @NotNull
    public final PackageFragmentProvider f66055g;

    /* renamed from: h */
    @NotNull
    public final LocalClassifierTypeSettings f66056h;

    /* renamed from: i */
    @NotNull
    public final ErrorReporter f66057i;

    /* renamed from: j */
    @NotNull
    public final LookupTracker f66058j;

    /* renamed from: k */
    @NotNull
    public final FlexibleTypeDeserializer f66059k;

    /* renamed from: l */
    @NotNull
    public final Iterable<ClassDescriptorFactory> f66060l;

    /* renamed from: m */
    @NotNull
    public final NotFoundClasses f66061m;

    /* renamed from: n */
    @NotNull
    public final ContractDeserializer f66062n;

    /* renamed from: o */
    @NotNull
    public final AdditionalClassPartsProvider f66063o;

    /* renamed from: p */
    @NotNull
    public final PlatformDependentDeclarationFilter f66064p;

    /* renamed from: q */
    @NotNull
    public final ExtensionRegistryLite f66065q;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull ClassDataFinder classDataFinder, @NotNull AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, @NotNull PackageFragmentProvider packageFragmentProvider, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull NotFoundClasses notFoundClasses, @NotNull ContractDeserializer contractDeserializer, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull ExtensionRegistryLite extensionRegistryLite) {
        Intrinsics.m32180i(extensionRegistryLite, "extensionRegistryLite");
        this.f66050b = storageManager;
        this.f66051c = moduleDescriptor;
        this.f66052d = deserializationConfiguration;
        this.f66053e = classDataFinder;
        this.f66054f = annotationAndConstantLoader;
        this.f66055g = packageFragmentProvider;
        this.f66056h = localClassifierTypeSettings;
        this.f66057i = errorReporter;
        this.f66058j = lookupTracker;
        this.f66059k = flexibleTypeDeserializer;
        this.f66060l = iterable;
        this.f66061m = notFoundClasses;
        this.f66062n = contractDeserializer;
        this.f66063o = additionalClassPartsProvider;
        this.f66064p = platformDependentDeclarationFilter;
        this.f66065q = extensionRegistryLite;
        this.f66049a = new ClassDeserializer(this);
    }

    @NotNull
    /* renamed from: a */
    public final DeserializationContext m33561a(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, EmptyList.f63144b);
    }

    @Nullable
    /* renamed from: b */
    public final ClassDescriptor m33562b(@NotNull ClassId classId) {
        Intrinsics.m32180i(classId, "classId");
        return ClassDeserializer.m33558b(this.f66049a, classId, null, 2);
    }
}
