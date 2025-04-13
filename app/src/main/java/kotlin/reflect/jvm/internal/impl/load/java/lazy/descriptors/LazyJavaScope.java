package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LazyJavaScope.kt */
/* loaded from: classes3.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* renamed from: j */
    public static final /* synthetic */ KProperty[] f64574j = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> f64575b;

    /* renamed from: c */
    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> f64576c;

    /* renamed from: d */
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f64577d;

    /* renamed from: e */
    public final NotNullLazyValue f64578e;

    /* renamed from: f */
    public final NotNullLazyValue f64579f;

    /* renamed from: g */
    public final NotNullLazyValue f64580g;

    /* renamed from: h */
    public final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f64581h;

    /* renamed from: i */
    @NotNull
    public final LazyJavaResolverContext f64582i;

    /* compiled from: LazyJavaScope.kt */
    public static final class MethodSignatureData {

        /* renamed from: a */
        @NotNull
        public final KotlinType f64583a;

        /* renamed from: b */
        @Nullable
        public final KotlinType f64584b;

        /* renamed from: c */
        @NotNull
        public final List<ValueParameterDescriptor> f64585c;

        /* renamed from: d */
        @NotNull
        public final List<TypeParameterDescriptor> f64586d;

        /* renamed from: e */
        public final boolean f64587e;

        /* renamed from: f */
        @NotNull
        public final List<String> f64588f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<? extends ValueParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, boolean z, @NotNull List<String> list3) {
            this.f64583a = kotlinType;
            this.f64584b = kotlinType2;
            this.f64585c = list;
            this.f64586d = list2;
            this.f64587e = z;
            this.f64588f = list3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof MethodSignatureData) {
                    MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
                    if (Intrinsics.m32174c(this.f64583a, methodSignatureData.f64583a) && Intrinsics.m32174c(this.f64584b, methodSignatureData.f64584b) && Intrinsics.m32174c(this.f64585c, methodSignatureData.f64585c) && Intrinsics.m32174c(this.f64586d, methodSignatureData.f64586d)) {
                        if (!(this.f64587e == methodSignatureData.f64587e) || !Intrinsics.m32174c(this.f64588f, methodSignatureData.f64588f)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            KotlinType kotlinType = this.f64583a;
            int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
            KotlinType kotlinType2 = this.f64584b;
            int hashCode2 = (hashCode + (kotlinType2 != null ? kotlinType2.hashCode() : 0)) * 31;
            List<ValueParameterDescriptor> list = this.f64585c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<TypeParameterDescriptor> list2 = this.f64586d;
            int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.f64587e;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (hashCode4 + i2) * 31;
            List<String> list3 = this.f64588f;
            return i3 + (list3 != null ? list3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("MethodSignatureData(returnType=");
            m24u.append(this.f64583a);
            m24u.append(", receiverType=");
            m24u.append(this.f64584b);
            m24u.append(", valueParameters=");
            m24u.append(this.f64585c);
            m24u.append(", typeParameters=");
            m24u.append(this.f64586d);
            m24u.append(", hasStableParameterNames=");
            m24u.append(this.f64587e);
            m24u.append(", errors=");
            m24u.append(this.f64588f);
            m24u.append(")");
            return m24u.toString();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class ResolvedValueParameters {

        /* renamed from: a */
        @NotNull
        public final List<ValueParameterDescriptor> f64589a;

        /* renamed from: b */
        public final boolean f64590b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> list, boolean z) {
            this.f64589a = list;
            this.f64590b = z;
        }
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        this.f64582i = lazyJavaResolverContext;
        this.f64575b = lazyJavaResolverContext.f64479c.f64446a.mo33622b(new Function0<List<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends DeclarationDescriptor> invoke() {
                LazyJavaScope lazyJavaScope = LazyJavaScope.this;
                DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.f65972l;
                Objects.requireNonNull(MemberScope.f65992a);
                return lazyJavaScope.m32768h(descriptorKindFilter, MemberScope.Companion.f65993a, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            }
        }, EmptyList.f63144b);
        this.f64576c = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<DeclaredMemberIndex>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public DeclaredMemberIndex invoke() {
                return LazyJavaScope.this.mo32754j();
            }
        });
        this.f64577d = lazyJavaResolverContext.f64479c.f64446a.mo33626f(new Function1<Name, List<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public List<? extends SimpleFunctionDescriptor> invoke(Name name) {
                Name name2 = name;
                Intrinsics.m32180i(name2, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (JavaMethod javaMethod : LazyJavaScope.this.f64576c.invoke().mo32730d(name2)) {
                    JavaMethodDescriptor m32770s = LazyJavaScope.this.m32770s(javaMethod);
                    if (LazyJavaScope.this.mo32760q(m32770s)) {
                        LazyJavaScope.this.f64582i.f64479c.f64452g.mo32707e(javaMethod, m32770s);
                        linkedHashSet.add(m32770s);
                    }
                }
                OverridingUtilsKt.m33511a(linkedHashSet);
                LazyJavaScope.this.mo32755l(linkedHashSet, name2);
                LazyJavaResolverContext lazyJavaResolverContext2 = LazyJavaScope.this.f64582i;
                return CollectionsKt.m32027j0(lazyJavaResolverContext2.f64479c.f64463r.m32846a(lazyJavaResolverContext2, linkedHashSet));
            }
        });
        this.f64578e = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return LazyJavaScope.this.mo32753i(DescriptorKindFilter.f65975o, null);
            }
        });
        this.f64579f = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return LazyJavaScope.this.mo32757n(DescriptorKindFilter.f65976p, null);
            }
        });
        this.f64580g = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return LazyJavaScope.this.mo32752g(DescriptorKindFilter.f65974n, null);
            }
        });
        this.f64581h = lazyJavaResolverContext.f64479c.f64446a.mo33626f(new Function1<Name, List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0117, code lost:
            
                if (kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.f63838e.m32424a(r5) == false) goto L48;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name r15) {
                /*
                    Method dump skipped, instructions count: 353
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return !mo32615b().contains(name) ? EmptyList.f63144b : this.f64577d.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        return (Set) StorageKt.m33635a(this.f64578e, f64574j[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return this.f64575b.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return !mo32618f().contains(name) ? EmptyList.f63144b : this.f64581h.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        return (Set) StorageKt.m33635a(this.f64579f, f64574j[1]);
    }

    @NotNull
    /* renamed from: g */
    public abstract Set<Name> mo32752g(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    /* renamed from: h */
    public final List<DeclarationDescriptor> m32768h(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation lookupLocation) {
        ClassifierDescriptor mo32732c;
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65971k)) {
            for (Name name : mo32752g(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue() && (mo32732c = mo32732c(name, lookupLocation)) != null) {
                    linkedHashSet.add(mo32732c);
                }
            }
        }
        DescriptorKindFilter.Companion companion2 = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65968h) && !kindFilter.f65981b.contains(DescriptorKindExclude.NonExtensions.f65961b)) {
            for (Name name2 : mo32753i(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(mo32614a(name2, lookupLocation));
                }
            }
        }
        DescriptorKindFilter.Companion companion3 = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65969i) && !kindFilter.f65981b.contains(DescriptorKindExclude.NonExtensions.f65961b)) {
            for (Name name3 : mo32757n(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(mo32617e(name3, lookupLocation));
                }
            }
        }
        return CollectionsKt.m32027j0(linkedHashSet);
    }

    @NotNull
    /* renamed from: i */
    public abstract Set<Name> mo32753i(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    /* renamed from: j */
    public abstract DeclaredMemberIndex mo32754j();

    @NotNull
    /* renamed from: k */
    public final KotlinType m32769k(@NotNull JavaMethod javaMethod, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        return lazyJavaResolverContext.f64478b.m32777d(javaMethod.getReturnType(), JavaTypeResolverKt.m32782c(TypeUsage.COMMON, javaMethod.mo32825H().mo32811p(), null, 2));
    }

    /* renamed from: l */
    public abstract void mo32755l(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    /* renamed from: m */
    public abstract void mo32756m(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    /* renamed from: n */
    public abstract Set<Name> mo32757n(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @Nullable
    /* renamed from: o */
    public abstract ReceiverParameterDescriptor mo32758o();

    @NotNull
    /* renamed from: p */
    public abstract DeclarationDescriptor mo32759p();

    /* renamed from: q */
    public boolean mo32760q(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    @NotNull
    /* renamed from: r */
    public abstract MethodSignatureData mo32761r(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    /* renamed from: s */
    public final JavaMethodDescriptor m32770s(@NotNull JavaMethod method) {
        Intrinsics.m32180i(method, "method");
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(mo32759p(), null, LazyJavaAnnotationsKt.m32722a(this.f64582i, method), method.getName(), CallableMemberDescriptor.Kind.DECLARATION, this.f64582i.f64479c.f64455j.mo32360a(method));
        LazyJavaResolverContext m32717b = ContextKt.m32717b(this.f64582i, javaMethodDescriptor, method, 0);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor mo32725a = m32717b.f64480d.mo32725a((JavaTypeParameter) it.next());
            if (mo32725a == null) {
                Intrinsics.m32188q();
                throw null;
            }
            arrayList.add(mo32725a);
        }
        ResolvedValueParameters m32771t = m32771t(m32717b, javaMethodDescriptor, method.mo32827f());
        MethodSignatureData mo32761r = mo32761r(method, arrayList, m32769k(method, m32717b), m32771t.f64589a);
        KotlinType kotlinType = mo32761r.f64584b;
        javaMethodDescriptor.mo32650O0(kotlinType != null ? DescriptorFactory.m33460e(javaMethodDescriptor, kotlinType, Annotations.Companion.f64024a) : null, mo32758o(), mo32761r.f64586d, mo32761r.f64585c, mo32761r.f64583a, method.isAbstract() ? Modality.ABSTRACT : method.isFinal() ^ true ? Modality.OPEN : Modality.FINAL, method.getVisibility(), mo32761r.f64584b != null ? MapsKt.m32063h(new Pair(JavaMethodDescriptor.f64427E, CollectionsKt.m32044u(m32771t.f64589a))) : EmptyMap.f63145b);
        javaMethodDescriptor.m32712P0(mo32761r.f64587e, m32771t.f64590b);
        if (!mo32761r.f64588f.isEmpty()) {
            m32717b.f64479c.f64450e.mo32709b(javaMethodDescriptor, mo32761r.f64588f);
        }
        return javaMethodDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters m32771t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r22, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> r23) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.m32771t(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$ResolvedValueParameters");
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Lazy scope for ");
        m24u.append(mo32759p());
        return m24u.toString();
    }
}
