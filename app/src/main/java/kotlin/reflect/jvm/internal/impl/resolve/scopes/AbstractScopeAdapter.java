package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes3.dex */
public abstract class AbstractScopeAdapter implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return mo33545g().mo32614a(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        return mo33545g().mo32615b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return mo33545g().mo32732c(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return mo33545g().mo32616d(kindFilter, nameFilter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return mo33545g().mo32617e(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        return mo33545g().mo32618f();
    }

    @NotNull
    /* renamed from: g */
    public abstract MemberScope mo33545g();
}
