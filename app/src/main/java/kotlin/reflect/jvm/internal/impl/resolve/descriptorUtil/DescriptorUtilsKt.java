package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DescriptorUtils.kt */
/* loaded from: classes3.dex */
public final class DescriptorUtilsKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$computeSealedSubclasses$1] */
    @NotNull
    /* renamed from: a */
    public static final Collection<ClassDescriptor> m33528a(@NotNull final ClassDescriptor classDescriptor) {
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
        if (deserializedClassDescriptor.f66158f != Modality.SEALED) {
            return EmptyList.f63144b;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        ?? r2 = new Function2<MemberScope, Boolean, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$computeSealedSubclasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* renamed from: a */
            public final void m33540a(@NotNull MemberScope scope, boolean z) {
                boolean z2;
                Intrinsics.m32180i(scope, "scope");
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m33549a(scope, DescriptorKindFilter.f65974n, null, 2, null)) {
                    if (declarationDescriptor instanceof ClassDescriptor) {
                        ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                        ClassDescriptor classDescriptor3 = ClassDescriptor.this;
                        Name name = DescriptorUtils.f65875a;
                        Iterator<KotlinType> it = classDescriptor2.mo32440j().mo32602a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (DescriptorUtils.m33481q(it.next(), classDescriptor3.mo32487a())) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            linkedHashSet.add(declarationDescriptor);
                        }
                        if (z) {
                            MemberScope mo32506u0 = classDescriptor2.mo32506u0();
                            Intrinsics.m32175d(mo32506u0, "descriptor.unsubstitutedInnerClassesScope");
                            m33540a(mo32506u0, z);
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(MemberScope memberScope, Boolean bool) {
                m33540a(memberScope, bool.booleanValue());
                return Unit.f63088a;
            }
        };
        DeclarationDescriptor declarationDescriptor = deserializedClassDescriptor.f66166n;
        Intrinsics.m32175d(declarationDescriptor, "sealedClass.containingDeclaration");
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            r2.m33540a(((PackageFragmentDescriptor) declarationDescriptor).mo32415p(), false);
        }
        MemberScope mo32506u0 = ((AbstractClassDescriptor) classDescriptor).mo32506u0();
        Intrinsics.m32175d(mo32506u0, "sealedClass.unsubstitutedInnerClassesScope");
        r2.m33540a(mo32506u0, true);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final boolean m33529b(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        Boolean m33776c = DFS.m33776c(CollectionsKt.m31993F(valueParameterDescriptor), new DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            /* renamed from: a */
            public Iterable mo32250a(Object obj) {
                ValueParameterDescriptor current = (ValueParameterDescriptor) obj;
                Intrinsics.m32175d(current, "current");
                Collection<ValueParameterDescriptor> mo32488e = current.mo32488e();
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32488e, 10));
                Iterator<T> it = mo32488e.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ValueParameterDescriptor) it.next()).mo32487a());
                }
                return arrayList;
            }
        }, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.f65933d);
        Intrinsics.m32175d(m33776c, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return m33776c.booleanValue();
    }

    @Nullable
    /* renamed from: c */
    public static final ConstantValue<?> m33530c(@NotNull AnnotationDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return (ConstantValue) CollectionsKt.m32045v(receiver$0.mo32586a().values());
    }

    @Nullable
    /* renamed from: d */
    public static CallableMemberDescriptor m33531d(CallableMemberDescriptor callableMemberDescriptor, final boolean z, final Function1 predicate, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        Intrinsics.m32180i(predicate, "predicate");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = null;
        return (CallableMemberDescriptor) DFS.m33774a(CollectionsKt.m31993F(callableMemberDescriptor), new DFS.Neighbors<N>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            /* renamed from: a */
            public Iterable mo32250a(Object obj) {
                Collection<? extends CallableMemberDescriptor> mo32488e;
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                if (z) {
                    callableMemberDescriptor2 = callableMemberDescriptor2 != null ? callableMemberDescriptor2.mo32487a() : null;
                }
                return (callableMemberDescriptor2 == null || (mo32488e = callableMemberDescriptor2.mo32488e()) == null) ? EmptyList.f63144b : mo32488e;
            }
        }, new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: a */
            public Object mo32484a() {
                return (CallableMemberDescriptor) Ref.ObjectRef.this.f63351b;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: b */
            public void mo33541b(Object obj) {
                ?? current = (CallableMemberDescriptor) obj;
                Intrinsics.m32180i(current, "current");
                if (((CallableMemberDescriptor) Ref.ObjectRef.this.f63351b) == null && ((Boolean) predicate.invoke(current)).booleanValue()) {
                    Ref.ObjectRef.this.f63351b = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: c */
            public boolean mo32251c(Object obj) {
                CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
                Intrinsics.m32180i(current, "current");
                return ((CallableMemberDescriptor) Ref.ObjectRef.this.f63351b) == null;
            }
        });
    }

    @Nullable
    /* renamed from: e */
    public static final FqName m33532e(@NotNull DeclarationDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(receiver$0);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        if (!m33468d.m33204d()) {
            m33468d = null;
        }
        if (m33468d != null) {
            return m33468d.m33207g();
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static final ClassDescriptor m33533f(@NotNull AnnotationDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ClassifierDescriptor mo32449b = receiver$0.getType().mo33515H0().mo32449b();
        if (!(mo32449b instanceof ClassDescriptor)) {
            mo32449b = null;
        }
        return (ClassDescriptor) mo32449b;
    }

    @NotNull
    /* renamed from: g */
    public static final KotlinBuiltIns m33534g(@NotNull DeclarationDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ModuleDescriptor m33466b = DescriptorUtils.m33466b(receiver$0);
        Intrinsics.m32175d(m33466b, "DescriptorUtils.getContainingModule(this)");
        return m33466b.mo32547n();
    }

    @Nullable
    /* renamed from: h */
    public static final ClassId m33535h(@Nullable ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor mo32437b;
        ClassId m33535h;
        if (classifierDescriptor == null || (mo32437b = classifierDescriptor.mo32437b()) == null) {
            return null;
        }
        if (mo32437b instanceof PackageFragmentDescriptor) {
            return new ClassId(((PackageFragmentDescriptor) mo32437b).mo32550d(), classifierDescriptor.getName());
        }
        if (!(mo32437b instanceof ClassifierDescriptorWithTypeParameters) || (m33535h = m33535h((ClassifierDescriptor) mo32437b)) == null) {
            return null;
        }
        return m33535h.m33191c(classifierDescriptor.getName());
    }

    @NotNull
    /* renamed from: i */
    public static final FqName m33536i(@NotNull DeclarationDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        FqName m33469e = DescriptorUtils.m33469e(receiver$0);
        if (m33469e == null) {
            m33469e = DescriptorUtils.m33468d(receiver$0.mo32437b()).m33201a(receiver$0.getName()).m33207g();
        }
        Intrinsics.m32175d(m33469e, "DescriptorUtils.getFqNameSafe(this)");
        return m33469e;
    }

    @NotNull
    /* renamed from: j */
    public static final Sequence<DeclarationDescriptor> m33537j(@NotNull DeclarationDescriptor declarationDescriptor) {
        return SequencesKt.m33838f(SequencesKt.m33847o(declarationDescriptor, new Function1<DeclarationDescriptor, DeclarationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$parentsWithSelf$1
            @Override // kotlin.jvm.functions.Function1
            public DeclarationDescriptor invoke(DeclarationDescriptor declarationDescriptor2) {
                DeclarationDescriptor it = declarationDescriptor2;
                Intrinsics.m32180i(it, "it");
                return it.mo32437b();
            }
        }), 1);
    }

    @NotNull
    /* renamed from: k */
    public static final CallableMemberDescriptor m33538k(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).mo32558v0();
        Intrinsics.m32175d(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    @Nullable
    /* renamed from: l */
    public static final ClassDescriptor m33539l(@NotNull ModuleDescriptor receiver$0, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        fqName.m33197b();
        FqName m33198c = fqName.m33198c();
        Intrinsics.m32175d(m33198c, "topLevelClassFqName.parent()");
        MemberScope mo32555p = receiver$0.mo32545K(m33198c).mo32555p();
        Name m33199d = fqName.m33199d();
        Intrinsics.m32175d(m33199d, "topLevelClassFqName.shortName()");
        ClassifierDescriptor mo32732c = mo32555p.mo32732c(m33199d, lookupLocation);
        if (!(mo32732c instanceof ClassDescriptor)) {
            mo32732c = null;
        }
        return (ClassDescriptor) mo32732c;
    }
}
