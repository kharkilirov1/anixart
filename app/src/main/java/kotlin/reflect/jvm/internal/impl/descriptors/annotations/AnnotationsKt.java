package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class AnnotationsKt {
    @NotNull
    /* renamed from: a */
    public static final Annotations m32597a(@NotNull Annotations first, @NotNull Annotations second) {
        Intrinsics.m32180i(first, "first");
        Intrinsics.m32180i(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
