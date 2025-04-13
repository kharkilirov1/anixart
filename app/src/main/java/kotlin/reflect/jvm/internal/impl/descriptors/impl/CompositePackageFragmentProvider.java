package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositePackageFragmentProvider.kt */
/* loaded from: classes3.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProvider {

    /* renamed from: a */
    public final List<PackageFragmentProvider> f64101a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(@NotNull List<? extends PackageFragmentProvider> list) {
        this.f64101a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* renamed from: a */
    public List<PackageFragmentDescriptor> mo32551a(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<PackageFragmentProvider> it = this.f64101a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().mo32551a(fqName));
        }
        return CollectionsKt.m32027j0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* renamed from: o */
    public Collection<FqName> mo32552o(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        HashSet hashSet = new HashSet();
        Iterator<PackageFragmentProvider> it = this.f64101a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mo32552o(fqName, function1));
        }
        return hashSet;
    }
}
