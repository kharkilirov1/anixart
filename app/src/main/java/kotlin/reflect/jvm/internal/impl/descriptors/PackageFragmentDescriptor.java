package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: PackageFragmentDescriptor.kt */
/* loaded from: classes3.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    ModuleDescriptor mo32437b();

    @NotNull
    /* renamed from: d */
    FqName mo32550d();

    @NotNull
    /* renamed from: p */
    MemberScope mo32415p();
}
