package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.yandex.div2.C3033a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
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
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: A */
    @NotNull
    public final ProtoBuf.Property f66227A;

    /* renamed from: B */
    @NotNull
    public final NameResolver f66228B;

    /* renamed from: C */
    @NotNull
    public final TypeTable f66229C;

    /* renamed from: D */
    @NotNull
    public final VersionRequirementTable f66230D;

    /* renamed from: E */
    @Nullable
    public final DeserializedContainerSource f66231E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(@NotNull DeclarationDescriptor containingDeclaration, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull Visibility visibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull ProtoBuf.Property proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(containingDeclaration, propertyDescriptor, annotations, modality, visibility, z, name, kind, SourceElement.f63979a, z2, z3, z6, false, z4, z5);
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        Intrinsics.m32180i(versionRequirementTable, "versionRequirementTable");
        this.f66227A = proto;
        this.f66228B = nameResolver;
        this.f66229C = typeTable;
        this.f66230D = versionRequirementTable;
        this.f66231E = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: E0 */
    public List<VersionRequirement> mo33598E0() {
        return DeserializedMemberDescriptor.DefaultImpls.m33612a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    /* renamed from: O */
    public PropertyDescriptorImpl mo32640O(@NotNull DeclarationDescriptor newOwner, @NotNull Modality newModality, @NotNull Visibility newVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name newName) {
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(newModality, "newModality");
        Intrinsics.m32180i(newVisibility, "newVisibility");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(newName, "newName");
        return new DeserializedPropertyDescriptor(newOwner, propertyDescriptor, this.f64001a, newModality, newVisibility, this.f64269f, newName, kind, this.f64219m, this.f64220n, mo32444x(), this.f64224r, this.f64221o, this.f66227A, this.f66228B, this.f66229C, this.f66230D, this.f66231E);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: R */
    public TypeTable mo33600R() {
        return this.f66229C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: X */
    public VersionRequirementTable mo33601X() {
        return this.f66230D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    /* renamed from: Y */
    public NameResolver mo33602Y() {
        return this.f66228B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    /* renamed from: c0 */
    public DeserializedContainerSource mo33603c0() {
        return this.f66231E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return C3033a.m17751m(Flags.f65421z, this.f66227A.f65130e, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: z */
    public MessageLite mo33604z() {
        return this.f66227A;
    }
}
