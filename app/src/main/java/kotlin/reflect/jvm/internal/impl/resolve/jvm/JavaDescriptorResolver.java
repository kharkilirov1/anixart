package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaDescriptorResolver.kt */
/* loaded from: classes3.dex */
public final class JavaDescriptorResolver {

    /* renamed from: a */
    @NotNull
    public final LazyJavaPackageFragmentProvider f65938a;

    /* renamed from: b */
    public final JavaResolverCache f65939b;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        this.f65938a = lazyJavaPackageFragmentProvider;
        this.f65939b = javaResolverCache;
    }

    @Nullable
    /* renamed from: a */
    public final ClassDescriptor m33542a(@NotNull JavaClass javaClass) {
        FqName mo32808d = javaClass.mo32808d();
        if (mo32808d != null && javaClass.mo32804B() == LightClassOriginKind.SOURCE) {
            return this.f65939b.mo32703a(mo32808d);
        }
        JavaClass mo32809j = javaClass.mo32809j();
        if (mo32809j != null) {
            ClassDescriptor m33542a = m33542a(mo32809j);
            MemberScope mo32506u0 = m33542a != null ? m33542a.mo32506u0() : null;
            ClassifierDescriptor mo32732c = mo32506u0 != null ? mo32506u0.mo32732c(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            return (ClassDescriptor) (mo32732c instanceof ClassDescriptor ? mo32732c : null);
        }
        if (mo32808d == null) {
            return null;
        }
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.f65938a;
        FqName m33198c = mo32808d.m33198c();
        Intrinsics.m32175d(m33198c, "fqName.parent()");
        LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.m32046w(lazyJavaPackageFragmentProvider.mo32551a(m33198c));
        if (lazyJavaPackageFragment == null) {
            return null;
        }
        LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.f64553h.f64500b;
        Objects.requireNonNull(lazyJavaPackageScope);
        return lazyJavaPackageScope.m32767u(javaClass.getName(), javaClass);
    }
}
