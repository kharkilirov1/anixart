package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
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
public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: D */
    @NotNull
    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode f66232D;

    /* renamed from: E */
    @NotNull
    public final ProtoBuf.Function f66233E;

    /* renamed from: F */
    @NotNull
    public final NameResolver f66234F;

    /* renamed from: G */
    @NotNull
    public final TypeTable f66235G;

    /* renamed from: H */
    @NotNull
    public final VersionRequirementTable f66236H;

    /* renamed from: I */
    @Nullable
    public final DeserializedContainerSource f66237I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedSimpleFunctionDescriptor(@NotNull DeclarationDescriptor containingDeclaration, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Function proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        super(containingDeclaration, simpleFunctionDescriptor, annotations, name, kind, sourceElement != null ? sourceElement : SourceElement.f63979a);
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        Intrinsics.m32180i(versionRequirementTable, "versionRequirementTable");
        this.f66233E = proto;
        this.f66234F = nameResolver;
        this.f66235G = typeTable;
        this.f66236H = versionRequirementTable;
        this.f66237I = deserializedContainerSource;
        this.f66232D = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: E0 */
    public List<VersionRequirement> mo33598E0() {
        return DeserializedMemberDescriptor.DefaultImpls.m33612a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(@NotNull DeclarationDescriptor newOwner, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement source) {
        Name name2;
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(source, "source");
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name != null) {
            name2 = name;
        } else {
            Name name3 = this.f64102b;
            Intrinsics.m32175d(name3, "name");
            name2 = name3;
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(newOwner, simpleFunctionDescriptor, annotations, name2, kind, this.f66233E, this.f66234F, this.f66235G, this.f66236H, this.f66237I, source);
        deserializedSimpleFunctionDescriptor.f66232D = this.f66232D;
        return deserializedSimpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: R */
    public TypeTable mo33600R() {
        return this.f66235G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: X */
    public VersionRequirementTable mo33601X() {
        return this.f66236H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: Y */
    public NameResolver mo33602Y() {
        return this.f66234F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* renamed from: c0 */
    public DeserializedContainerSource mo33603c0() {
        return this.f66237I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: z */
    public MessageLite mo33604z() {
        return this.f66233E;
    }
}
