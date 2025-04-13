package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes3.dex */
public final class ChainedMemberScope implements MemberScope {

    /* renamed from: b */
    @NotNull
    public final String f65958b;

    /* renamed from: c */
    public final List<MemberScope> f65959c;

    /* compiled from: ChainedMemberScope.kt */
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChainedMemberScope(@NotNull String debugName, @NotNull List<? extends MemberScope> list) {
        Intrinsics.m32180i(debugName, "debugName");
        this.f65958b = debugName;
        this.f65959c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        List<MemberScope> list = this.f65959c;
        if (list.isEmpty()) {
            return EmptySet.f63146b;
        }
        Collection<SimpleFunctionDescriptor> collection = null;
        Iterator<MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collection = ScopeUtilsKt.m33770a(collection, it.next().mo32614a(name, location));
        }
        return collection != null ? collection : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        List<MemberScope> list = this.f65959c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((MemberScope) it.next()).mo32615b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        Iterator<MemberScope> it = this.f65959c.iterator();
        ClassifierDescriptor classifierDescriptor = null;
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
        List<MemberScope> list = this.f65959c;
        if (list.isEmpty()) {
            return EmptySet.f63146b;
        }
        Collection<DeclarationDescriptor> collection = null;
        Iterator<MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collection = ScopeUtilsKt.m33770a(collection, it.next().mo32616d(kindFilter, nameFilter));
        }
        return collection != null ? collection : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        List<MemberScope> list = this.f65959c;
        if (list.isEmpty()) {
            return EmptySet.f63146b;
        }
        Collection<PropertyDescriptor> collection = null;
        Iterator<MemberScope> it = list.iterator();
        while (it.hasNext()) {
            collection = ScopeUtilsKt.m33770a(collection, it.next().mo32617e(name, location));
        }
        return collection != null ? collection : EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        List<MemberScope> list = this.f65959c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(linkedHashSet, ((MemberScope) it.next()).mo32618f());
        }
        return linkedHashSet;
    }

    @NotNull
    public String toString() {
        return this.f65958b;
    }
}
