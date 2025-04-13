package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedClassDataFinder.kt */
/* loaded from: classes3.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* renamed from: a */
    public final PackageFragmentProvider f66076a;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider) {
        this.f66076a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* renamed from: a */
    public ClassData mo32911a(@NotNull ClassId classId) {
        ClassData mo32911a;
        Intrinsics.m32180i(classId, "classId");
        PackageFragmentProvider packageFragmentProvider = this.f66076a;
        FqName fqName = classId.f65593a;
        Intrinsics.m32175d(fqName, "classId.packageFqName");
        for (PackageFragmentDescriptor packageFragmentDescriptor : packageFragmentProvider.mo32551a(fqName)) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (mo32911a = ((DeserializedPackageFragment) packageFragmentDescriptor).mo33569G().mo32911a(classId)) != null) {
                return mo32911a;
            }
        }
        return null;
    }
}
