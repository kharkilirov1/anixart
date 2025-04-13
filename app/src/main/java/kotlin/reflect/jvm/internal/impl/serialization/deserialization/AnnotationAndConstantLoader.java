package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationAndConstantLoader.kt */
/* loaded from: classes3.dex */
public interface AnnotationAndConstantLoader<A, C> {
    @NotNull
    /* renamed from: a */
    List<A> mo32870a(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver);

    @NotNull
    /* renamed from: b */
    List<A> mo32871b(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i2, @NotNull ProtoBuf.ValueParameter valueParameter);

    @NotNull
    /* renamed from: c */
    List<A> mo32872c(@NotNull ProtoContainer.Class r1);

    @NotNull
    /* renamed from: d */
    List<A> mo32873d(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver);

    @Nullable
    /* renamed from: e */
    C mo32874e(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType);

    @NotNull
    /* renamed from: f */
    List<A> mo32875f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry);

    @NotNull
    /* renamed from: g */
    List<A> mo32876g(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);

    @NotNull
    /* renamed from: h */
    List<A> mo32877h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);

    @NotNull
    /* renamed from: i */
    List<A> mo32878i(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);

    @NotNull
    /* renamed from: j */
    List<A> mo32879j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);
}
