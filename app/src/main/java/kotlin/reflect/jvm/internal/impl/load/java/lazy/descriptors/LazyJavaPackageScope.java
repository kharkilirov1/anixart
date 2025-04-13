package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* renamed from: k */
    public final NullableLazyValue<Set<String>> f64561k;

    /* renamed from: l */
    public final MemoizedFunctionToNullable<FindClassRequest, ClassDescriptor> f64562l;

    /* renamed from: m */
    public final JavaPackage f64563m;

    /* renamed from: n */
    @NotNull
    public final LazyJavaPackageFragment f64564n;

    /* compiled from: LazyJavaPackageScope.kt */
    public static final class FindClassRequest {

        /* renamed from: a */
        @NotNull
        public final Name f64565a;

        /* renamed from: b */
        @Nullable
        public final JavaClass f64566b;

        public FindClassRequest(@NotNull Name name, @Nullable JavaClass javaClass) {
            this.f64565a = name;
            this.f64566b = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof FindClassRequest) && Intrinsics.m32174c(this.f64565a, ((FindClassRequest) obj).f64565a);
        }

        public int hashCode() {
            return this.f64565a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    public static abstract class KotlinClassLookupResult {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class Found extends KotlinClassLookupResult {

            /* renamed from: a */
            @NotNull
            public final ClassDescriptor f64567a;

            public Found(@NotNull ClassDescriptor classDescriptor) {
                super(null);
                this.f64567a = classDescriptor;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class NotFound extends KotlinClassLookupResult {

            /* renamed from: a */
            public static final NotFound f64568a = new NotFound();

            public NotFound() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class SyntheticClass extends KotlinClassLookupResult {

            /* renamed from: a */
            public static final SyntheticClass f64569a = new SyntheticClass();

            public SyntheticClass() {
                super(null);
            }
        }

        public KotlinClassLookupResult() {
        }

        public KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LazyJavaPackageScope(@NotNull final LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        this.f64563m = javaPackage;
        this.f64564n = lazyJavaPackageFragment;
        this.f64561k = lazyJavaResolverContext.f64479c.f64446a.mo33624d(new Function0<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends String> invoke() {
                return lazyJavaResolverContext.f64479c.f64447b.mo32346c(LazyJavaPackageScope.this.f64564n.f64205e);
            }
        });
        this.f64562l = lazyJavaResolverContext.f64479c.f64446a.mo33627g(new Function1<FindClassRequest, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(LazyJavaPackageScope.FindClassRequest findClassRequest) {
                Object obj;
                ClassDescriptor classDescriptor;
                LazyJavaPackageScope.FindClassRequest request = findClassRequest;
                Intrinsics.m32180i(request, "request");
                ClassId classId = new ClassId(LazyJavaPackageScope.this.f64564n.f64205e, request.f64565a);
                JavaClass javaClass = request.f64566b;
                KotlinJvmBinaryClass mo32354a = javaClass != null ? lazyJavaResolverContext.f64479c.f64448c.mo32354a(javaClass) : lazyJavaResolverContext.f64479c.f64448c.mo32355b(classId);
                ClassId mo32352g = mo32354a != null ? mo32354a.mo32352g() : null;
                if (mo32352g != null && (mo32352g.m33194h() || mo32352g.f65595c)) {
                    return null;
                }
                LazyJavaPackageScope lazyJavaPackageScope = LazyJavaPackageScope.this;
                Objects.requireNonNull(lazyJavaPackageScope);
                if (mo32354a == null) {
                    obj = LazyJavaPackageScope.KotlinClassLookupResult.NotFound.f64568a;
                } else if (mo32354a.getF63698b().f64819a == KotlinClassHeader.Kind.CLASS) {
                    DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaPackageScope.f64582i.f64479c.f64449d;
                    Objects.requireNonNull(deserializedDescriptorResolver);
                    ClassData m32909d = deserializedDescriptorResolver.m32909d(mo32354a);
                    if (m32909d != null) {
                        DeserializationComponents deserializationComponents = deserializedDescriptorResolver.f64787a;
                        if (deserializationComponents == null) {
                            Intrinsics.m32189r("components");
                            throw null;
                        }
                        classDescriptor = deserializationComponents.f66049a.m33559a(mo32354a.mo32352g(), m32909d);
                    } else {
                        classDescriptor = null;
                    }
                    obj = classDescriptor != null ? new LazyJavaPackageScope.KotlinClassLookupResult.Found(classDescriptor) : LazyJavaPackageScope.KotlinClassLookupResult.NotFound.f64568a;
                } else {
                    obj = LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.f64569a;
                }
                if (obj instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                    return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) obj).f64567a;
                }
                if (obj instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
                    return null;
                }
                if (!(obj instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
                    throw new NoWhenBranchMatchedException();
                }
                JavaClass javaClass2 = request.f64566b;
                if (javaClass2 == null) {
                    javaClass2 = lazyJavaResolverContext.f64479c.f64447b.mo32344a(classId);
                }
                if ((javaClass2 != null ? javaClass2.mo32804B() : null) != LightClassOriginKind.BINARY) {
                    FqName mo32808d = javaClass2 != null ? javaClass2.mo32808d() : null;
                    if (mo32808d == null || mo32808d.m33197b() || (!Intrinsics.m32174c(mo32808d.m33198c(), LazyJavaPackageScope.this.f64564n.f64205e))) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, LazyJavaPackageScope.this.f64564n, javaClass2, null);
                    lazyJavaResolverContext.f64479c.f64464s.mo32678a(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass2 + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + lazyJavaResolverContext.f64479c.f64448c.mo32354a(javaClass2) + "\nfindKotlinClass(ClassId) = " + lazyJavaResolverContext.f64479c.f64448c.mo32355b(classId) + '\n');
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(Name name, LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return m32767u(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return m32768h(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: g */
    public Set<Name> mo32752g(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
        if (!kindFilter.m33547a(DescriptorKindFilter.f65964d)) {
            return EmptySet.f63146b;
        }
        Set<String> invoke = this.f64561k.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.m33211d((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.f64563m;
        if (function1 == null) {
            function1 = FunctionsKt.f66482a;
        }
        Collection<JavaClass> mo32830o = javaPackage.mo32830o(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : mo32830o) {
            Name name = javaClass.mo32804B() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: i */
    public Set<Name> mo32753i(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: j */
    public DeclaredMemberIndex mo32754j() {
        return DeclaredMemberIndex.Empty.f64498a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: l */
    public void mo32755l(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: n */
    public Set<Name> mo32757n(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: p */
    public DeclarationDescriptor mo32759p() {
        return this.f64564n;
    }

    /* renamed from: u */
    public final ClassDescriptor m32767u(Name name, JavaClass javaClass) {
        Name name2 = SpecialNames.f65609a;
        if (!((name.f65606b.isEmpty() || name.f65607c) ? false : true)) {
            return null;
        }
        Set<String> invoke = this.f64561k.invoke();
        if (javaClass != null || invoke == null || invoke.contains(name.f65606b)) {
            return this.f64562l.invoke(new FindClassRequest(name, javaClass));
        }
        return null;
    }
}
