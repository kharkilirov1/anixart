package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes3.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f65984d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    public final NotNullLazyValue f65985b;

    /* renamed from: c */
    @NotNull
    public final ClassDescriptor f65986c;

    public GivenFunctionsMemberScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        this.f65986c = classDescriptor;
        this.f65985b = storageManager.mo33623c(new Function0<List<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public List<? extends DeclarationDescriptor> invoke() {
                ?? r7;
                List<FunctionDescriptor> mo32457g = GivenFunctionsMemberScope.this.mo32457g();
                final GivenFunctionsMemberScope givenFunctionsMemberScope = GivenFunctionsMemberScope.this;
                Objects.requireNonNull(givenFunctionsMemberScope);
                final ArrayList arrayList = new ArrayList(3);
                TypeConstructor mo32440j = givenFunctionsMemberScope.f65986c.mo32440j();
                Intrinsics.m32175d(mo32440j, "containingClass.typeConstructor");
                Collection<KotlinType> mo32602a = mo32440j.mo32602a();
                Intrinsics.m32175d(mo32602a, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = mo32602a.iterator();
                while (it.hasNext()) {
                    CollectionsKt.m32020g(arrayList2, ResolutionScope.DefaultImpls.m33549a(((KotlinType) it.next()).mo32791p(), null, null, 3, null));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof CallableMemberDescriptor) {
                        arrayList3.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    Name name = ((CallableMemberDescriptor) next2).getName();
                    Object obj = linkedHashMap.get(name);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(name, obj);
                    }
                    ((List) obj).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Name name2 = (Name) entry.getKey();
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj2 : list) {
                        Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj2) instanceof FunctionDescriptor);
                        Object obj3 = linkedHashMap2.get(valueOf);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        if (booleanValue) {
                            r7 = new ArrayList();
                            for (Object obj4 : mo32457g) {
                                if (Intrinsics.m32174c(((FunctionDescriptor) obj4).getName(), name2)) {
                                    r7.add(obj4);
                                }
                            }
                        } else {
                            r7 = EmptyList.f63144b;
                        }
                        OverridingUtil.m33496g(list2, r7, givenFunctionsMemberScope.f65986c, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            /* renamed from: a */
                            public void mo32620a(@NotNull CallableMemberDescriptor fakeOverride) {
                                Intrinsics.m32180i(fakeOverride, "fakeOverride");
                                OverridingUtil.m33503q(fakeOverride, null);
                                arrayList.add(fakeOverride);
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            /* renamed from: e */
                            public void mo32621e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                                throw new IllegalStateException(("Conflict in scope of " + GivenFunctionsMemberScope.this.f65986c + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
                            }
                        });
                    }
                }
                return CollectionsKt.m32002O(mo32457g, kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m33772b(arrayList));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        List<DeclarationDescriptor> m33548h = m33548h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33548h) {
            if (obj instanceof SimpleFunctionDescriptor) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.m32174c(((SimpleFunctionDescriptor) obj2).getName(), name)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return !kindFilter.m33547a(DescriptorKindFilter.f65973m.f65980a) ? EmptyList.f63144b : m33548h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        List<DeclarationDescriptor> m33548h = m33548h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33548h) {
            if (obj instanceof PropertyDescriptor) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.m32174c(((PropertyDescriptor) obj2).getName(), name)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @NotNull
    /* renamed from: g */
    public abstract List<FunctionDescriptor> mo32457g();

    /* renamed from: h */
    public final List<DeclarationDescriptor> m33548h() {
        return (List) StorageKt.m33635a(this.f65985b, f65984d[0]);
    }
}
