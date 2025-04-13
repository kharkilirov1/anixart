package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PackageFragmentProviderImpl.kt */
/* loaded from: classes3.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProvider {

    /* renamed from: a */
    public final Collection<PackageFragmentDescriptor> f63973a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> collection) {
        this.f63973a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* renamed from: a */
    public List<PackageFragmentDescriptor> mo32551a(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f63973a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.m32174c(((PackageFragmentDescriptor) obj).mo32550d(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    /* renamed from: o */
    public Collection<FqName> mo32552o(@NotNull final FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        return SequencesKt.m33831A(SequencesKt.m33841i(SequencesKt.m33852t(CollectionsKt.m32028k(this.f63973a), new Function1<PackageFragmentDescriptor, FqName>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$1
            @Override // kotlin.jvm.functions.Function1
            public FqName invoke(PackageFragmentDescriptor packageFragmentDescriptor) {
                PackageFragmentDescriptor it = packageFragmentDescriptor;
                Intrinsics.m32180i(it, "it");
                return it.mo32550d();
            }
        }), new Function1<FqName, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(FqName fqName2) {
                FqName it = fqName2;
                Intrinsics.m32180i(it, "it");
                return Boolean.valueOf(!it.m33197b() && Intrinsics.m32174c(it.m33198c(), FqName.this));
            }
        }));
    }
}
