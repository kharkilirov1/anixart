package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes3.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* renamed from: b */
    public final ModuleDescriptor f64249b;

    /* renamed from: c */
    public final FqName f64250c;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        Intrinsics.m32180i(moduleDescriptor, "moduleDescriptor");
        Intrinsics.m32180i(fqName, "fqName");
        this.f64249b = moduleDescriptor;
        this.f64250c = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
        if (!kindFilter.m33547a(DescriptorKindFilter.f65967g)) {
            return EmptyList.f63144b;
        }
        if (this.f64250c.m33197b() && kindFilter.f65981b.contains(DescriptorKindExclude.TopLevelPackages.f65962a)) {
            return EmptyList.f63144b;
        }
        Collection<FqName> mo32548o = this.f64249b.mo32548o(this.f64250c, nameFilter);
        ArrayList arrayList = new ArrayList(mo32548o.size());
        Iterator<FqName> it = mo32548o.iterator();
        while (it.hasNext()) {
            Name m33199d = it.next().m33199d();
            Intrinsics.m32175d(m33199d, "subFqName.shortName()");
            if (nameFilter.invoke(m33199d).booleanValue()) {
                PackageViewDescriptor packageViewDescriptor = null;
                if (!m33199d.f65607c) {
                    ModuleDescriptor moduleDescriptor = this.f64249b;
                    FqName fqName = this.f64250c;
                    PackageViewDescriptor mo32545K = moduleDescriptor.mo32545K(new FqName(fqName.f65597a.m33201a(m33199d), fqName));
                    if (!mo32545K.isEmpty()) {
                        packageViewDescriptor = mo32545K;
                    }
                }
                if (packageViewDescriptor != null) {
                    arrayList.add(packageViewDescriptor);
                }
            }
        }
        return arrayList;
    }
}
