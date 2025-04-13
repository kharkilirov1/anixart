package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* renamed from: k */
    public final JavaClass f64601k;

    /* renamed from: l */
    @NotNull
    public final LazyJavaClassDescriptor f64602l;

    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaClass javaClass, @NotNull LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaResolverContext);
        this.f64601k = javaClass;
        this.f64602l = lazyJavaClassDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: g */
    public Set<Name> mo32752g(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: i */
    public Set<Name> mo32753i(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Set<Name> m32033m0 = CollectionsKt.m32033m0(this.f64576c.invoke().mo32727a());
        LazyJavaStaticClassScope m32715b = UtilKt.m32715b(this.f64602l);
        Set<Name> mo32615b = m32715b != null ? m32715b.mo32615b() : null;
        if (mo32615b == null) {
            mo32615b = EmptySet.f63146b;
        }
        m32033m0.addAll(mo32615b);
        if (this.f64601k.mo32812v()) {
            m32033m0.addAll(CollectionsKt.m31994G(DescriptorUtils.f65876b, DescriptorUtils.f65875a));
        }
        return m32033m0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: j */
    public DeclaredMemberIndex mo32754j() {
        return new ClassDeclaredMemberIndex(this.f64601k, new Function1<JavaMember, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeMemberIndex$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(JavaMember javaMember) {
                JavaMember it = javaMember;
                Intrinsics.m32180i(it, "it");
                return Boolean.valueOf(it.mo32828i());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: l */
    public void mo32755l(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        LazyJavaStaticClassScope m32715b = UtilKt.m32715b(this.f64602l);
        collection.addAll(DescriptorResolverUtils.m32697c(name, m32715b != null ? CollectionsKt.m32035n0(m32715b.mo32614a(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS)) : EmptySet.f63146b, collection, this.f64602l, this.f64582i.f64479c.f64451f));
        if (this.f64601k.mo32812v()) {
            if (Intrinsics.m32174c(name, DescriptorUtils.f65876b)) {
                SimpleFunctionDescriptor m33458c = DescriptorFactory.m33458c(this.f64602l);
                Intrinsics.m32175d(m33458c, "createEnumValueOfMethod(ownerDescriptor)");
                collection.add(m33458c);
            } else if (Intrinsics.m32174c(name, DescriptorUtils.f65875a)) {
                SimpleFunctionDescriptor m33459d = DescriptorFactory.m33459d(this.f64602l);
                Intrinsics.m32175d(m33459d, "createEnumValuesMethod(ownerDescriptor)");
                collection.add(m33459d);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: m */
    public void mo32756m(@NotNull final Name name, @NotNull Collection<PropertyDescriptor> collection) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f64602l;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DFS.m33774a(CollectionsKt.m31993F(lazyJavaClassDescriptor), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.f64606a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, linkedHashSet, new Function1<MemberScope, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends PropertyDescriptor> invoke(MemberScope memberScope) {
                MemberScope it = memberScope;
                Intrinsics.m32180i(it, "it");
                return it.mo32617e(Name.this, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            }
        }));
        if (!collection.isEmpty()) {
            collection.addAll(DescriptorResolverUtils.m32697c(name, linkedHashSet, collection, this.f64602l, this.f64582i.f64479c.f64451f));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            PropertyDescriptor m32772u = m32772u((PropertyDescriptor) obj);
            Object obj2 = linkedHashMap.get(m32772u);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m32772u, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(arrayList, DescriptorResolverUtils.m32697c(name, (Collection) ((Map.Entry) it.next()).getValue(), collection, this.f64602l, this.f64582i.f64479c.f64451f));
        }
        collection.addAll(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: n */
    public Set<Name> mo32757n(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Set<Name> m32033m0 = CollectionsKt.m32033m0(this.f64576c.invoke().mo32729c());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f64602l;
        DFS.m33774a(CollectionsKt.m31993F(lazyJavaClassDescriptor), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.f64606a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, m32033m0, new Function1<MemberScope, Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computePropertyNames$1$1
            @Override // kotlin.jvm.functions.Function1
            public Set<? extends Name> invoke(MemberScope memberScope) {
                MemberScope it = memberScope;
                Intrinsics.m32180i(it, "it");
                return it.mo32618f();
            }
        }));
        return m32033m0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: p */
    public DeclarationDescriptor mo32759p() {
        return this.f64602l;
    }

    /* renamed from: u */
    public final PropertyDescriptor m32772u(@NotNull PropertyDescriptor propertyDescriptor) {
        CallableMemberDescriptor.Kind mo32493g = propertyDescriptor.mo32493g();
        Intrinsics.m32175d(mo32493g, "this.kind");
        if (mo32493g.m32496a()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> mo32488e = propertyDescriptor.mo32488e();
        Intrinsics.m32175d(mo32488e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32488e, 10));
        for (PropertyDescriptor it : mo32488e) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(m32772u(it));
        }
        return (PropertyDescriptor) CollectionsKt.m32011X(CollectionsKt.m32036o(arrayList));
    }
}
