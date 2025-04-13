package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes3.dex */
public interface FlexibleTypeDeserializer {

    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class ThrowException implements FlexibleTypeDeserializer {

        /* renamed from: a */
        public static final ThrowException f66087a = new ThrowException();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        @NotNull
        /* renamed from: a */
        public KotlinType mo32912a(@NotNull ProtoBuf.Type type, @NotNull String flexibleId, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
            Intrinsics.m32180i(flexibleId, "flexibleId");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    /* renamed from: a */
    KotlinType mo32912a(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);
}
