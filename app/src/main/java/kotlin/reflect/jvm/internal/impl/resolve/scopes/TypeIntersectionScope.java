package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes3.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {

    /* renamed from: b */
    @NotNull
    public final ChainedMemberScope f66007b;

    /* compiled from: TypeIntersectionScope.kt */
    public static final class Companion {
    }

    public TypeIntersectionScope(@NotNull ChainedMemberScope chainedMemberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66007b = chainedMemberScope;
    }

    @JvmStatic
    @NotNull
    /* renamed from: h */
    public static final MemberScope m33552h(@NotNull String message, @NotNull Collection<? extends KotlinType> types) {
        Intrinsics.m32180i(message, "message");
        Intrinsics.m32180i(types, "types");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).mo32791p());
        }
        ChainedMemberScope chainedMemberScope = new ChainedMemberScope(message, arrayList);
        return types.size() <= 1 ? chainedMemberScope : new TypeIntersectionScope(chainedMemberScope, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return OverridingUtilsKt.m33512b(super.mo32614a(name, location), new Function1<SimpleFunctionDescriptor, SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedFunctions$1
            @Override // kotlin.jvm.functions.Function1
            public SimpleFunctionDescriptor invoke(SimpleFunctionDescriptor simpleFunctionDescriptor) {
                SimpleFunctionDescriptor receiver$0 = simpleFunctionDescriptor;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return receiver$0;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> mo32616d = super.mo32616d(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mo32616d) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.m32002O(OverridingUtilsKt.m33512b(arrayList, new Function1<CallableDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedDescriptors$2
            @Override // kotlin.jvm.functions.Function1
            public CallableDescriptor invoke(CallableDescriptor callableDescriptor) {
                CallableDescriptor receiver$0 = callableDescriptor;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return receiver$0;
            }
        }), arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return OverridingUtilsKt.m33512b(super.mo32617e(name, location), new Function1<PropertyDescriptor, PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedVariables$1
            @Override // kotlin.jvm.functions.Function1
            public PropertyDescriptor invoke(PropertyDescriptor propertyDescriptor) {
                PropertyDescriptor receiver$0 = propertyDescriptor;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return receiver$0;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    /* renamed from: g */
    public MemberScope mo33545g() {
        return this.f66007b;
    }
}
