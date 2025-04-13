package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Modality.kt */
/* loaded from: classes3.dex */
public final class ModalityKt {
    /* renamed from: a */
    public static final boolean m32544a(@NotNull ClassDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.mo32441k() == Modality.FINAL && receiver$0.mo32438g() != ClassKind.ENUM_CLASS;
    }
}
