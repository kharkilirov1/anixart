package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeserializedPackageFragment.kt */
/* loaded from: classes3.dex */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {

    /* renamed from: f */
    @NotNull
    public final StorageManager f66077f;

    public DeserializedPackageFragment(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        this.f66077f = storageManager;
    }

    @NotNull
    /* renamed from: G */
    public abstract ClassDataFinder mo33569G();
}
