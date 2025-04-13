package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f64170g = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: c */
    @NotNull
    public final NotNullLazyValue f64171c;

    /* renamed from: d */
    @NotNull
    public final MemberScope f64172d;

    /* renamed from: e */
    @NotNull
    public final ModuleDescriptorImpl f64173e;

    /* renamed from: f */
    @NotNull
    public final FqName f64174f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LazyPackageViewDescriptorImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.StorageManager r6) {
        /*
            r3 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.Intrinsics.m32180i(r4, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.Intrinsics.m32180i(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.f64024a
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r1 = r5.f65597a
            boolean r2 = r1.m33203c()
            if (r2 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.name.Name r1 = kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.f65599e
            goto L1b
        L17:
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r1.m33206f()
        L1b:
            r3.<init>(r0, r1)
            r3.f64173e = r4
            r3.f64174f = r5
            kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2 r4 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            r4.<init>()
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r4 = r6.mo33623c(r4)
            r3.f64171c = r4
            kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter r4 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter
            kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1 r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            r5.<init>()
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r5 = r6.mo33623c(r5)
            r4.<init>(r5)
            r3.f64172d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl, kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* renamed from: E */
    public List<PackageFragmentDescriptor> mo32553E() {
        return (List) StorageKt.m33635a(this.f64171c, f64170g[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: H */
    public <R, D> R mo32498H(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.m32180i(visitor, "visitor");
        return visitor.mo32510c(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: b */
    public DeclarationDescriptor mo32437b() {
        if (this.f64174f.m33197b()) {
            return null;
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f64173e;
        FqName m33198c = this.f64174f.m33198c();
        Intrinsics.m32175d(m33198c, "fqName.parent()");
        return moduleDescriptorImpl.mo32545K(m33198c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* renamed from: d */
    public FqName mo32554d() {
        return this.f64174f;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PackageViewDescriptor)) {
            obj = null;
        }
        PackageViewDescriptor packageViewDescriptor = (PackageViewDescriptor) obj;
        return packageViewDescriptor != null && Intrinsics.m32174c(this.f64174f, packageViewDescriptor.mo32554d()) && Intrinsics.m32174c(this.f64173e, packageViewDescriptor.mo32556r0());
    }

    public int hashCode() {
        return this.f64174f.hashCode() + (this.f64173e.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return mo32553E().isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* renamed from: p */
    public MemberScope mo32555p() {
        return this.f64172d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    /* renamed from: r0 */
    public ModuleDescriptor mo32556r0() {
        return this.f64173e;
    }
}
