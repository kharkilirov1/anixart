package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {

    /* renamed from: h */
    @NotNull
    public Collection<? extends TypeAliasConstructorDescriptor> f66238h;

    /* renamed from: i */
    @NotNull
    public SimpleType f66239i;

    /* renamed from: j */
    @NotNull
    public SimpleType f66240j;

    /* renamed from: k */
    public List<? extends TypeParameterDescriptor> f66241k;

    /* renamed from: l */
    public SimpleType f66242l;

    /* renamed from: m */
    @NotNull
    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode f66243m;

    /* renamed from: n */
    @NotNull
    public final StorageManager f66244n;

    /* renamed from: o */
    @NotNull
    public final ProtoBuf.TypeAlias f66245o;

    /* renamed from: p */
    @NotNull
    public final NameResolver f66246p;

    /* renamed from: q */
    @NotNull
    public final TypeTable f66247q;

    /* renamed from: r */
    @NotNull
    public final VersionRequirementTable f66248r;

    /* renamed from: s */
    @Nullable
    public final DeserializedContainerSource f66249s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor containingDeclaration, @NotNull Annotations annotations, @NotNull Name name, @NotNull Visibility visibility, @NotNull ProtoBuf.TypeAlias proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(containingDeclaration, annotations, name, SourceElement.f63979a, visibility);
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(visibility, "visibility");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        Intrinsics.m32180i(versionRequirementTable, "versionRequirementTable");
        this.f66244n = storageManager;
        this.f66245o = proto;
        this.f66246p = nameResolver;
        this.f66247q = typeTable;
        this.f66248r = versionRequirementTable;
        this.f66249s = deserializedContainerSource;
        this.f66243m = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: E0 */
    public List<VersionRequirement> mo33598E0() {
        return DeserializedMemberDescriptor.DefaultImpls.m33612a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    @NotNull
    /* renamed from: G */
    public List<TypeParameterDescriptor> mo32601G() {
        List list = this.f66241k;
        if (list != null) {
            return list;
        }
        Intrinsics.m32189r("typeConstructorParameters");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor>] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl] */
    /* renamed from: O */
    public final void m33617O(@NotNull List<? extends TypeParameterDescriptor> declaredTypeParameters, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2, @NotNull DeserializedMemberDescriptor.CoroutinesCompatibilityMode isExperimentalCoroutineInReleaseEnvironment) {
        MemberScope memberScope;
        ?? r10;
        ClassConstructorDescriptor mo32503c;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Intrinsics.m32180i(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.m32180i(isExperimentalCoroutineInReleaseEnvironment, "isExperimentalCoroutineInReleaseEnvironment");
        this.f64071e = declaredTypeParameters;
        this.f66239i = simpleType;
        this.f66240j = simpleType2;
        this.f66241k = TypeParameterUtilsKt.m32567b(this);
        ClassDescriptor mo32565q = mo32565q();
        if (mo32565q == null || (memberScope = mo32565q.mo32445x0()) == null) {
            memberScope = MemberScope.Empty.f65996b;
        }
        this.f66242l = TypeUtils.m33697g(this, memberScope);
        ClassDescriptor mo32565q2 = mo32565q();
        if (mo32565q2 != null) {
            Collection<ClassConstructorDescriptor> mo32442l = mo32565q2.mo32442l();
            Intrinsics.m32175d(mo32442l, "classDescriptor.constructors");
            r10 = new ArrayList();
            for (ClassConstructorDescriptor it : mo32442l) {
                TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.f64252I;
                StorageManager storageManager = this.f66244n;
                Intrinsics.m32175d(it, "it");
                Objects.requireNonNull(companion);
                Intrinsics.m32180i(storageManager, "storageManager");
                ReceiverParameterDescriptor receiverParameterDescriptor2 = null;
                TypeSubstitutor m33684c = mo32565q() == null ? null : TypeSubstitutor.m33684c(mo32563U());
                if (m33684c != null && (mo32503c = it.mo32503c(m33684c)) != null) {
                    Annotations annotations = it.getAnnotations();
                    CallableMemberDescriptor.Kind mo32493g = it.mo32493g();
                    Intrinsics.m32175d(mo32493g, "constructor.kind");
                    SourceElement sourceElement = this.f64104d;
                    Intrinsics.m32175d(sourceElement, "typeAliasDescriptor.source");
                    ?? typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, this, mo32503c, null, annotations, mo32493g, sourceElement);
                    List<ValueParameterDescriptor> m32622z0 = FunctionDescriptorImpl.m32622z0(typeAliasConstructorDescriptorImpl, it.mo32489f(), m33684c, false, false, null);
                    if (m32622z0 != null) {
                        SimpleType m33659c = FlexibleTypesKt.m33659c(mo32503c.getReturnType().mo33662J0());
                        SimpleType mo32502r = mo32502r();
                        Intrinsics.m32175d(mo32502r, "typeAliasDescriptor.defaultType");
                        SimpleType m33670a = SpecialTypesKt.m33670a(m33659c, mo32502r);
                        ReceiverParameterDescriptor mo32490f0 = it.mo32490f0();
                        if (mo32490f0 != null) {
                            receiverParameterDescriptor = typeAliasConstructorDescriptorImpl;
                            receiverParameterDescriptor2 = DescriptorFactory.m33460e(receiverParameterDescriptor, m33684c.m33688f(mo32490f0.getType(), Variance.INVARIANT), Annotations.Companion.f64024a);
                        } else {
                            receiverParameterDescriptor = typeAliasConstructorDescriptorImpl;
                        }
                        receiverParameterDescriptor.mo32623C0(receiverParameterDescriptor2, null, mo32443t(), m32622z0, m33670a, Modality.FINAL, this.f64073g);
                        receiverParameterDescriptor2 = receiverParameterDescriptor;
                    }
                }
                if (receiverParameterDescriptor2 != null) {
                    r10.add(receiverParameterDescriptor2);
                }
            }
        } else {
            r10 = EmptyList.f63144b;
        }
        this.f66238h = r10;
        this.f66243m = isExperimentalCoroutineInReleaseEnvironment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: R */
    public TypeTable mo33600R() {
        return this.f66247q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* renamed from: U */
    public SimpleType mo32563U() {
        SimpleType simpleType = this.f66240j;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m32189r("expandedType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: X */
    public VersionRequirementTable mo33601X() {
        return this.f66248r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: Y */
    public NameResolver mo33602Y() {
        return this.f66246p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    public DeclarationDescriptorNonRoot mo32503c(TypeSubstitutor substitutor) {
        Intrinsics.m32180i(substitutor, "substitutor");
        if (substitutor.m33687e()) {
            return this;
        }
        StorageManager storageManager = this.f66244n;
        DeclarationDescriptor containingDeclaration = this.f64103c;
        Intrinsics.m32175d(containingDeclaration, "containingDeclaration");
        Annotations annotations = this.f64001a;
        Intrinsics.m32175d(annotations, "annotations");
        Name name = this.f64102b;
        Intrinsics.m32175d(name, "name");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager, containingDeclaration, annotations, name, this.f64073g, this.f66245o, this.f66246p, this.f66247q, this.f66248r, this.f66249s);
        List<TypeParameterDescriptor> mo32443t = mo32443t();
        SimpleType mo32564g0 = mo32564g0();
        Variance variance = Variance.INVARIANT;
        KotlinType m33688f = substitutor.m33688f(mo32564g0, variance);
        Intrinsics.m32175d(m33688f, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        SimpleType m33678a = TypeSubstitutionKt.m33678a(m33688f);
        KotlinType m33688f2 = substitutor.m33688f(mo32563U(), variance);
        Intrinsics.m32175d(m33688f2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        deserializedTypeAliasDescriptor.m33617O(mo32443t, m33678a, TypeSubstitutionKt.m33678a(m33688f2), this.f66243m);
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* renamed from: c0 */
    public DeserializedContainerSource mo33603c0() {
        return this.f66249s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @NotNull
    /* renamed from: g0 */
    public SimpleType mo32564g0() {
        SimpleType simpleType = this.f66239i;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m32189r("underlyingType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    @Nullable
    /* renamed from: q */
    public ClassDescriptor mo32565q() {
        if (KotlinTypeKt.m33667a(mo32563U())) {
            return null;
        }
        ClassifierDescriptor mo32449b = mo32563U().mo33515H0().mo32449b();
        return (ClassDescriptor) (mo32449b instanceof ClassDescriptor ? mo32449b : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    public SimpleType mo32502r() {
        SimpleType simpleType = this.f66242l;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m32189r("defaultTypeImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: z */
    public MessageLite mo33604z() {
        return this.f66245o;
    }
}
