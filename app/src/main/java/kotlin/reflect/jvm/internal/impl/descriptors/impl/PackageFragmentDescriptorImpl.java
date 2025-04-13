package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes3.dex */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {

    /* renamed from: e */
    @NotNull
    public final FqName f64205e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PackageFragmentDescriptorImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r5) {
        /*
            r3 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.Intrinsics.m32180i(r4, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.Intrinsics.m32180i(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.f64024a
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r1 = r5.f65597a
            boolean r2 = r1.m33203c()
            if (r2 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.name.Name r1 = kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.f65599e
            goto L1b
        L17:
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r1.m33206f()
        L1b:
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r2 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.f63979a
            r3.<init>(r4, r0, r1, r2)
            r3.f64205e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.m32180i(visitor, "visitor");
        return visitor.mo32512f(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* renamed from: d */
    public final FqName mo32550d() {
        return this.f64205e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return SourceElement.f63979a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("package ");
        m24u.append(this.f64205e);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    public ModuleDescriptor mo32437b() {
        DeclarationDescriptor declarationDescriptor = this.f64103c;
        if (declarationDescriptor != null) {
            return (ModuleDescriptor) declarationDescriptor;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }
}
