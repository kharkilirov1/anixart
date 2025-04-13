package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes3.dex */
public final class SuspendFunctionTypesKt {

    /* renamed from: a */
    @NotNull
    public static final MutableClassDescriptor f63828a;

    /* renamed from: b */
    @NotNull
    public static final MutableClassDescriptor f63829b;

    static {
        ModuleDescriptor moduleDescriptor = ErrorUtils.f66306a;
        FqName fqName = DescriptorUtils.f65878d;
        Intrinsics.m32175d(fqName, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(moduleDescriptor, fqName);
        ClassKind classKind = ClassKind.INTERFACE;
        Name m33199d = DescriptorUtils.f65879e.m33199d();
        SourceElement sourceElement = SourceElement.f63979a;
        StorageManager storageManager = LockBasedStorageManager.f66255e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, m33199d, sourceElement, storageManager);
        Modality modality = Modality.ABSTRACT;
        mutableClassDescriptor.f64199j = modality;
        Visibility visibility = Visibilities.f63988e;
        mutableClassDescriptor.f64200k = visibility;
        Annotations annotations = Annotations.Companion.f64024a;
        Variance variance = Variance.IN_VARIANCE;
        mutableClassDescriptor.m32636G(CollectionsKt.m31993F(TypeParameterDescriptorImpl.m32655C0(mutableClassDescriptor, annotations, false, variance, Name.m33211d("T"), 0)));
        mutableClassDescriptor.m32635D();
        f63828a = mutableClassDescriptor;
        FqName fqName2 = DescriptorUtils.f65877c;
        Intrinsics.m32175d(fqName2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        MutableClassDescriptor mutableClassDescriptor2 = new MutableClassDescriptor(new EmptyPackageFragmentDescriptor(moduleDescriptor, fqName2), classKind, false, false, DescriptorUtils.f65880f.m33199d(), sourceElement, storageManager);
        mutableClassDescriptor2.f64199j = modality;
        mutableClassDescriptor2.f64200k = visibility;
        mutableClassDescriptor2.m32636G(CollectionsKt.m31993F(TypeParameterDescriptorImpl.m32655C0(mutableClassDescriptor2, annotations, false, variance, Name.m33211d("T"), 0)));
        mutableClassDescriptor2.m32635D();
        f63829b = mutableClassDescriptor2;
    }

    /* renamed from: a */
    public static final boolean m32423a(@Nullable FqName fqName, boolean z) {
        return z ? Intrinsics.m32174c(fqName, DescriptorUtils.f65880f) : Intrinsics.m32174c(fqName, DescriptorUtils.f65879e);
    }
}
