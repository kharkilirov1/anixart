package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubstitutingScope.kt */
/* loaded from: classes3.dex */
public final class SubstitutingScope implements MemberScope {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f66001f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(SubstitutingScope.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};

    /* renamed from: b */
    public final TypeSubstitutor f66002b;

    /* renamed from: c */
    public Map<DeclarationDescriptor, DeclarationDescriptor> f66003c;

    /* renamed from: d */
    public final Lazy f66004d;

    /* renamed from: e */
    public final MemberScope f66005e;

    public SubstitutingScope(@NotNull MemberScope workerScope, @NotNull TypeSubstitutor givenSubstitutor) {
        Intrinsics.m32180i(workerScope, "workerScope");
        Intrinsics.m32180i(givenSubstitutor, "givenSubstitutor");
        this.f66005e = workerScope;
        TypeSubstitution typeSubstitution = givenSubstitutor.f66349a;
        Intrinsics.m32175d(typeSubstitution, "givenSubstitutor.substitution");
        this.f66002b = new TypeSubstitutor(CapturedTypeConstructorKt.m33519b(typeSubstitution, false, 1));
        this.f66004d = LazyKt.m31881b(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Collection<? extends DeclarationDescriptor> invoke() {
                SubstitutingScope substitutingScope = SubstitutingScope.this;
                return substitutingScope.m33550g(ResolutionScope.DefaultImpls.m33549a(substitutingScope.f66005e, null, null, 3, null));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return m33550g(this.f66005e.mo32614a(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        return this.f66005e.mo32615b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        ClassifierDescriptor mo32732c = this.f66005e.mo32732c(name, location);
        if (mo32732c != null) {
            return (ClassifierDescriptor) m33551h(mo32732c);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* renamed from: d */
    public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        Lazy lazy = this.f66004d;
        KProperty kProperty = f66001f[0];
        return (Collection) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return m33550g(this.f66005e.mo32617e(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        return this.f66005e.mo32618f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final <D extends DeclarationDescriptor> Collection<D> m33550g(Collection<? extends D> collection) {
        if (this.f66002b.m33687e() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(CollectionsKt.m33771a(collection.size()));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m33551h((DeclarationDescriptor) it.next()));
        }
        return linkedHashSet;
    }

    /* renamed from: h */
    public final <D extends DeclarationDescriptor> D m33551h(D d) {
        if (this.f66002b.m33687e()) {
            return d;
        }
        if (this.f66003c == null) {
            this.f66003c = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.f66003c;
        if (map == null) {
            Intrinsics.m32188q();
            throw null;
        }
        DeclarationDescriptor declarationDescriptor = map.get(d);
        if (declarationDescriptor == null) {
            if (!(d instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            declarationDescriptor = ((Substitutable) d).mo32503c(this.f66002b);
            if (declarationDescriptor == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, declarationDescriptor);
        }
        return (D) declarationDescriptor;
    }
}
