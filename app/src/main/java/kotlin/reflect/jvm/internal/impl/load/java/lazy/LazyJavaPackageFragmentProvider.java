package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes3.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProvider {

    /* renamed from: a */
    public final LazyJavaResolverContext f64472a;

    /* renamed from: b */
    public final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f64473b;

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents) {
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.f64491a, new InitializedLazyImpl(null));
        this.f64472a = lazyJavaResolverContext;
        this.f64473b = lazyJavaResolverContext.f64479c.f64446a.mo33621a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* renamed from: a */
    public List<LazyJavaPackageFragment> mo32551a(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return CollectionsKt.m31995H(m32723b(fqName));
    }

    /* renamed from: b */
    public final LazyJavaPackageFragment m32723b(FqName fqName) {
        final JavaPackage mo32345b = this.f64472a.f64479c.f64447b.mo32345b(fqName);
        if (mo32345b != null) {
            return this.f64473b.mo33618a(fqName, new Function0<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public LazyJavaPackageFragment invoke() {
                    return new LazyJavaPackageFragment(LazyJavaPackageFragmentProvider.this.f64472a, mo32345b);
                }
            });
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    /* renamed from: o */
    public Collection mo32552o(FqName fqName, Function1 function1) {
        LazyJavaPackageFragment m32723b = m32723b(fqName);
        List<FqName> invoke = m32723b != null ? m32723b.f64554i.invoke() : null;
        return invoke != null ? invoke : EmptyList.f63144b;
    }
}
