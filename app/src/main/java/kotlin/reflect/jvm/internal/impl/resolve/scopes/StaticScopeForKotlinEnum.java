package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes3.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f65997d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    public final NotNullLazyValue f65998b;

    /* renamed from: c */
    public final ClassDescriptor f65999c;

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        Intrinsics.m32180i(storageManager, "storageManager");
        this.f65999c = classDescriptor;
        this.f65998b = storageManager.mo33623c(new Function0<List<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends SimpleFunctionDescriptor> invoke() {
                return CollectionsKt.m31994G(DescriptorFactory.m33458c(StaticScopeForKotlinEnum.this.f65999c), DescriptorFactory.m33459d(StaticScopeForKotlinEnum.this.f65999c));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: a */
    public Collection mo32614a(Name name, LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        List list = (List) StorageKt.m33635a(this.f65998b, f65997d[0]);
        ArrayList arrayList = new ArrayList(1);
        for (Object obj : list) {
            if (Intrinsics.m32174c(((SimpleFunctionDescriptor) obj).getName(), name)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(Name name, LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: d */
    public Collection mo32616d(DescriptorKindFilter kindFilter, Function1 nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return (List) StorageKt.m33635a(this.f65998b, f65997d[0]);
    }
}
