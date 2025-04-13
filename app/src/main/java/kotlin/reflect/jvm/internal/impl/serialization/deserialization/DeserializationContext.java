package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class DeserializationContext {

    /* renamed from: a */
    @NotNull
    public final TypeDeserializer f66067a;

    /* renamed from: b */
    @NotNull
    public final MemberDeserializer f66068b;

    /* renamed from: c */
    @NotNull
    public final DeserializationComponents f66069c;

    /* renamed from: d */
    @NotNull
    public final NameResolver f66070d;

    /* renamed from: e */
    @NotNull
    public final DeclarationDescriptor f66071e;

    /* renamed from: f */
    @NotNull
    public final TypeTable f66072f;

    /* renamed from: g */
    @NotNull
    public final VersionRequirementTable f66073g;

    /* renamed from: h */
    @NotNull
    public final BinaryVersion f66074h;

    /* renamed from: i */
    @Nullable
    public final DeserializedContainerSource f66075i;

    public DeserializationContext(@NotNull DeserializationComponents components, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor containingDeclaration, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list) {
        Intrinsics.m32180i(components, "components");
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(versionRequirementTable, "versionRequirementTable");
        this.f66069c = components;
        this.f66070d = nameResolver;
        this.f66071e = containingDeclaration;
        this.f66072f = typeTable;
        this.f66073g = versionRequirementTable;
        this.f66074h = binaryVersion;
        this.f66075i = deserializedContainerSource;
        StringBuilder m24u = C0000a.m24u("Deserializer for ");
        m24u.append(containingDeclaration.getName());
        this.f66067a = new TypeDeserializer(this, typeDeserializer, list, m24u.toString(), false, 16);
        this.f66068b = new MemberDeserializer(this);
    }

    @NotNull
    /* renamed from: a */
    public final DeserializationContext m33568a(@NotNull DeclarationDescriptor descriptor, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion metadataVersion) {
        Intrinsics.m32180i(descriptor, "descriptor");
        Intrinsics.m32180i(typeParameterProtos, "typeParameterProtos");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        Intrinsics.m32180i(versionRequirementTable2, "versionRequirementTable");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        DeserializationComponents deserializationComponents = this.f66069c;
        if (!VersionSpecificBehaviorKt.m33131a(metadataVersion)) {
            versionRequirementTable2 = this.f66073g;
        }
        return new DeserializationContext(deserializationComponents, nameResolver, descriptor, typeTable, versionRequirementTable2, metadataVersion, this.f66075i, this.f66067a, typeParameterProtos);
    }
}
