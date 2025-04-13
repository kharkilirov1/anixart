package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes3.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {

    /* renamed from: a */
    public static final JavaFlexibleTypeDeserializer f64791a = new JavaFlexibleTypeDeserializer();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    @NotNull
    /* renamed from: a */
    public KotlinType mo32912a(@NotNull ProtoBuf.Type type, @NotNull String flexibleId, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        Intrinsics.m32180i(flexibleId, "flexibleId");
        if (!(!Intrinsics.m32174c(flexibleId, "kotlin.jvm.PlatformType"))) {
            return type.m33319n(JvmProtoBuf.f65486g) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.m33663a(simpleType, simpleType2);
        }
        return ErrorUtils.m33652c("Error java flexible type with id: " + flexibleId + ". (" + simpleType + ".." + simpleType2 + ')');
    }
}
