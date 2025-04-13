package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;

/* compiled from: SerializerExtensionProtocol.kt */
/* loaded from: classes3.dex */
public class SerializerExtensionProtocol {

    /* renamed from: a */
    @NotNull
    public final ExtensionRegistryLite f66016a;

    /* renamed from: b */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f66017b;

    /* renamed from: c */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f66018c;

    /* renamed from: d */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f66019d;

    /* renamed from: e */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f66020e;

    /* renamed from: f */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f66021f;

    /* renamed from: g */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f66022g;

    /* renamed from: h */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f66023h;

    /* renamed from: i */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f66024i;

    /* renamed from: j */
    @NotNull
    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f66025j;

    public SerializerExtensionProtocol(@NotNull ExtensionRegistryLite extensionRegistryLite, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> generatedExtension2, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> generatedExtension3, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension4, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension5, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> generatedExtension6, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> generatedExtension7, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> generatedExtension8, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> generatedExtension9, @NotNull GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> generatedExtension10) {
        this.f66016a = extensionRegistryLite;
        this.f66017b = generatedExtension2;
        this.f66018c = generatedExtension3;
        this.f66019d = generatedExtension4;
        this.f66020e = generatedExtension5;
        this.f66021f = generatedExtension6;
        this.f66022g = generatedExtension7;
        this.f66023h = generatedExtension8;
        this.f66024i = generatedExtension9;
        this.f66025j = generatedExtension10;
    }
}
