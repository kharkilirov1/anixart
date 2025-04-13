package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {

    /* renamed from: h */
    public final TypeConstructor f64105h;

    /* renamed from: i */
    public final MemberScope f64106i;

    /* renamed from: j */
    public final NotNullLazyValue<Set<Name>> f64107j;

    /* renamed from: k */
    public final Annotations f64108k;

    public class EnumEntryScope extends MemberScopeImpl {

        /* renamed from: b */
        public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f64109b;

        /* renamed from: c */
        public final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f64110c;

        /* renamed from: d */
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f64111d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$EnumEntryScope$4 */
        class C65824 extends NonReportingOverrideStrategy {

            /* renamed from: a */
            public final /* synthetic */ Set f64116a;

            public C65824(EnumEntryScope enumEntryScope, Set set) {
                this.f64116a = set;
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            /* renamed from: a */
            public void mo32620a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                OverridingUtil.m33503q(callableMemberDescriptor, null);
                this.f64116a.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            /* renamed from: e */
            public void mo32621e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
            }
        }

        public EnumEntryScope(StorageManager storageManager) {
            this.f64109b = storageManager.mo33626f(new Function1<Name, Collection<SimpleFunctionDescriptor>>(EnumEntrySyntheticClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                @Override // kotlin.jvm.functions.Function1
                public Collection<SimpleFunctionDescriptor> invoke(Name name) {
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    Collection<SimpleFunctionDescriptor> mo32614a = enumEntryScope.m32619g().mo32614a(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    OverridingUtil.m33496g(mo32614a, Collections.emptySet(), EnumEntrySyntheticClassDescriptor.this, new C65824(enumEntryScope, linkedHashSet));
                    return linkedHashSet;
                }
            });
            this.f64110c = storageManager.mo33626f(new Function1<Name, Collection<PropertyDescriptor>>(EnumEntrySyntheticClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.2
                @Override // kotlin.jvm.functions.Function1
                public Collection<PropertyDescriptor> invoke(Name name) {
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    Collection<PropertyDescriptor> mo32617e = enumEntryScope.m32619g().mo32617e(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    OverridingUtil.m33496g(mo32617e, Collections.emptySet(), EnumEntrySyntheticClassDescriptor.this, new C65824(enumEntryScope, linkedHashSet));
                    return linkedHashSet;
                }
            });
            this.f64111d = storageManager.mo33623c(new Function0<Collection<DeclarationDescriptor>>(EnumEntrySyntheticClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.3
                @Override // kotlin.jvm.functions.Function0
                public Collection<DeclarationDescriptor> invoke() {
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    Objects.requireNonNull(enumEntryScope);
                    HashSet hashSet = new HashSet();
                    for (Name name : EnumEntrySyntheticClassDescriptor.this.f64107j.invoke()) {
                        NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                        hashSet.addAll(enumEntryScope.mo32614a(name, noLookupLocation));
                        hashSet.addAll(enumEntryScope.mo32617e(name, noLookupLocation));
                    }
                    return hashSet;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: a */
        public Collection mo32614a(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return this.f64109b.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: b */
        public Set<Name> mo32615b() {
            return EnumEntrySyntheticClassDescriptor.this.f64107j.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* renamed from: d */
        public Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            return this.f64111d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: e */
        public Collection mo32617e(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return this.f64110c.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: f */
        public Set<Name> mo32618f() {
            return EnumEntrySyntheticClassDescriptor.this.f64107j.invoke();
        }

        @NotNull
        /* renamed from: g */
        public final MemberScope m32619g() {
            return EnumEntrySyntheticClassDescriptor.this.f64105h.mo32602a().iterator().next().mo32791p();
        }
    }

    public EnumEntrySyntheticClassDescriptor(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        this.f64108k = annotations;
        this.f64105h = new ClassTypeConstructorImpl(this, Collections.emptyList(), Collections.singleton(kotlinType), storageManager);
        this.f64106i = new EnumEntryScope(storageManager);
        this.f64107j = notNullLazyValue;
    }

    @NotNull
    /* renamed from: D */
    public static EnumEntrySyntheticClassDescriptor m32613D(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.mo32502r(), name, notNullLazyValue, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: D0 */
    public boolean mo32430D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: F */
    public Collection<ClassDescriptor> mo32431F() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: I */
    public boolean mo32432I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* renamed from: J */
    public boolean mo32433J() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: P */
    public ClassConstructorDescriptor mo32434P() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: Q */
    public MemberScope mo32435Q() {
        return MemberScope.Empty.f65996b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* renamed from: S */
    public ClassDescriptor mo32436S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: g */
    public ClassKind mo32438g() {
        return ClassKind.ENUM_ENTRY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64108k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Visibility getVisibility() {
        return Visibilities.f63988e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: j */
    public TypeConstructor mo32440j() {
        return this.f64105h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* renamed from: k */
    public Modality mo32441k() {
        return Modality.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: l */
    public Collection<ClassConstructorDescriptor> mo32442l() {
        return Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* renamed from: t */
    public List<TypeParameterDescriptor> mo32443t() {
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("enum entry ");
        m24u.append(this.f64063a);
        return m24u.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* renamed from: x0 */
    public MemberScope mo32445x0() {
        return this.f64106i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: y */
    public boolean mo32446y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: y0 */
    public boolean mo32447y0() {
        return false;
    }
}
