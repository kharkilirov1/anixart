package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmPackageScope.kt */
/* loaded from: classes3.dex */
public final class JvmPackageScope implements MemberScope {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f64499f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};

    /* renamed from: b */
    @NotNull
    public final LazyJavaPackageScope f64500b;

    /* renamed from: c */
    public final NotNullLazyValue f64501c;

    /* renamed from: d */
    public final LazyJavaResolverContext f64502d;

    /* renamed from: e */
    public final LazyJavaPackageFragment f64503e;

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f64502d = lazyJavaResolverContext;
        this.f64503e = lazyJavaPackageFragment;
        this.f64500b = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.f64501c = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<List<? extends MemberScope>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends MemberScope> invoke() {
                Collection<KotlinJvmBinaryClass> values = JvmPackageScope.this.f64503e.m32766G().values();
                ArrayList arrayList = new ArrayList();
                for (KotlinJvmBinaryClass kotlinJvmBinaryClass : values) {
                    JvmPackageScope jvmPackageScope = JvmPackageScope.this;
                    MemberScope m32906a = jvmPackageScope.f64502d.f64479c.f64449d.m32906a(jvmPackageScope.f64503e, kotlinJvmBinaryClass);
                    if (m32906a != null) {
                        arrayList.add(m32906a);
                    }
                }
                return CollectionsKt.m32027j0(arrayList);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        m32734h(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f64500b;
        List<MemberScope> m32733g = m32733g();
        Collection<SimpleFunctionDescriptor> mo32614a = lazyJavaPackageScope.mo32614a(name, location);
        Iterator<MemberScope> it = m32733g.iterator();
        while (it.hasNext()) {
            mo32614a = ScopeUtilsKt.m33770a(mo32614a, it.next().mo32614a(name, location));
        }
        return mo32614a != null ? mo32614a : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        List<MemberScope> m32733g = m32733g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = m32733g.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((MemberScope) it.next()).mo32615b());
        }
        linkedHashSet.addAll(this.f64500b.mo32615b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        UtilsKt.m32660b(this.f64502d.f64479c.f64459n, location, this.f64503e, name);
        LazyJavaPackageScope lazyJavaPackageScope = this.f64500b;
        Objects.requireNonNull(lazyJavaPackageScope);
        ClassifierDescriptor classifierDescriptor = null;
        ClassDescriptor m32767u = lazyJavaPackageScope.m32767u(name, null);
        if (m32767u != null) {
            return m32767u;
        }
        Iterator<MemberScope> it = m32733g().iterator();
        while (it.hasNext()) {
            ClassifierDescriptor mo32732c = it.next().mo32732c(name, location);
            if (mo32732c != null) {
                if (!(mo32732c instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) mo32732c).mo32432I()) {
                    return mo32732c;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = mo32732c;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.f64500b;
        List<MemberScope> m32733g = m32733g();
        Collection<DeclarationDescriptor> mo32616d = lazyJavaPackageScope.mo32616d(kindFilter, nameFilter);
        Iterator<MemberScope> it = m32733g.iterator();
        while (it.hasNext()) {
            mo32616d = ScopeUtilsKt.m33770a(mo32616d, it.next().mo32616d(kindFilter, nameFilter));
        }
        return mo32616d != null ? mo32616d : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        m32734h(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f64500b;
        List<MemberScope> m32733g = m32733g();
        Collection<PropertyDescriptor> mo32617e = lazyJavaPackageScope.mo32617e(name, location);
        Iterator<MemberScope> it = m32733g.iterator();
        while (it.hasNext()) {
            mo32617e = ScopeUtilsKt.m33770a(mo32617e, it.next().mo32617e(name, location));
        }
        return mo32617e != null ? mo32617e : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        List<MemberScope> m32733g = m32733g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = m32733g.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((MemberScope) it.next()).mo32618f());
        }
        linkedHashSet.addAll(this.f64500b.mo32618f());
        return linkedHashSet;
    }

    /* renamed from: g */
    public final List<MemberScope> m32733g() {
        return (List) StorageKt.m33635a(this.f64501c, f64499f[0]);
    }

    /* renamed from: h */
    public void m32734h(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        UtilsKt.m32660b(this.f64502d.f64479c.f64459n, lookupLocation, this.f64503e, name);
    }
}
