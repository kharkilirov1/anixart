package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: F */
    @NotNull
    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode f66151F;

    /* renamed from: G */
    @NotNull
    public final ProtoBuf.Constructor f66152G;

    /* renamed from: H */
    @NotNull
    public final NameResolver f66153H;

    /* renamed from: I */
    @NotNull
    public final TypeTable f66154I;

    /* renamed from: J */
    @NotNull
    public final VersionRequirementTable f66155J;

    /* renamed from: K */
    @Nullable
    public final DeserializedContainerSource f66156K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassConstructorDescriptor(@NotNull ClassDescriptor containingDeclaration, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Constructor proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        super(containingDeclaration, constructorDescriptor, annotations, z, kind, sourceElement != null ? sourceElement : SourceElement.f63979a);
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        Intrinsics.m32180i(versionRequirementTable, "versionRequirementTable");
        this.f66152G = proto;
        this.f66153H = nameResolver;
        this.f66154I = typeTable;
        this.f66155J = versionRequirementTable;
        this.f66156K = deserializedContainerSource;
        this.f66151F = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: E0 */
    public List<VersionRequirement> mo33598E0() {
        return DeserializedMemberDescriptor.DefaultImpls.m33612a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    /* renamed from: K0 */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl mo32459O(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m33599N0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: M */
    public boolean mo32458M() {
        return false;
    }

    @NotNull
    /* renamed from: N0 */
    public DeserializedClassConstructorDescriptor m33599N0(@NotNull DeclarationDescriptor newOwner, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Annotations annotations, @NotNull SourceElement source) {
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(source, "source");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) newOwner, (ConstructorDescriptor) functionDescriptor, annotations, this.f64091D, kind, this.f66152G, this.f66153H, this.f66154I, this.f66155J, this.f66156K, source);
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode = this.f66151F;
        Intrinsics.m32180i(coroutinesCompatibilityMode, "<set-?>");
        deserializedClassConstructorDescriptor.f66151F = coroutinesCompatibilityMode;
        return deserializedClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: O */
    public /* bridge */ /* synthetic */ FunctionDescriptorImpl mo32459O(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m33599N0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: R */
    public TypeTable mo33600R() {
        return this.f66154I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: X */
    public VersionRequirementTable mo33601X() {
        return this.f66155J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: Y */
    public NameResolver mo33602Y() {
        return this.f66153H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* renamed from: c0 */
    public DeserializedContainerSource mo33603c0() {
        return this.f66156K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: z */
    public MessageLite mo33604z() {
        return this.f66152G;
    }
}
