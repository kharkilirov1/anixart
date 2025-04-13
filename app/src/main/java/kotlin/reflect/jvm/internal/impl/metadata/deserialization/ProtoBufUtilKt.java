package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes3.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: a */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T m33120a(@NotNull GeneratedMessageLite.ExtendableMessage<M> receiver$0, @NotNull GeneratedMessageLite.GeneratedExtension<M, T> extension) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(extension, "extension");
        if (receiver$0.m33319n(extension)) {
            return (T) receiver$0.m33316k(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T m33121b(@NotNull GeneratedMessageLite.ExtendableMessage<M> receiver$0, @NotNull GeneratedMessageLite.GeneratedExtension<M, List<T>> generatedExtension, int i2) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (i2 < receiver$0.m33318m(generatedExtension)) {
            return (T) receiver$0.m33317l(generatedExtension, i2);
        }
        return null;
    }
}
