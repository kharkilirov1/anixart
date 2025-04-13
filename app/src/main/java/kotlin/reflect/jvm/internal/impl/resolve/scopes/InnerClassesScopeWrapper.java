package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes3.dex */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    /* renamed from: b */
    @NotNull
    public final MemberScope f65990b;

    public InnerClassesScopeWrapper(@NotNull MemberScope workerScope) {
        Intrinsics.m32180i(workerScope, "workerScope");
        this.f65990b = workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        return this.f65990b.mo32615b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        ClassifierDescriptor mo32732c = this.f65990b.mo32732c(name, location);
        if (mo32732c == null) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) (!(mo32732c instanceof ClassDescriptor) ? null : mo32732c);
        if (classDescriptor != null) {
            return classDescriptor;
        }
        if (!(mo32732c instanceof TypeAliasDescriptor)) {
            mo32732c = null;
        }
        return (TypeAliasDescriptor) mo32732c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: d */
    public Collection mo32616d(DescriptorKindFilter kindFilter, Function1 nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
        int i2 = DescriptorKindFilter.f65971k & kindFilter.f65980a;
        DescriptorKindFilter descriptorKindFilter = i2 == 0 ? null : new DescriptorKindFilter(i2, kindFilter.f65981b);
        if (descriptorKindFilter == null) {
            return EmptyList.f63144b;
        }
        Collection<DeclarationDescriptor> mo32616d = this.f65990b.mo32616d(descriptorKindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo32616d) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        return this.f65990b.mo32618f();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Classes from ");
        m24u.append(this.f65990b);
        return m24u.toString();
    }
}
