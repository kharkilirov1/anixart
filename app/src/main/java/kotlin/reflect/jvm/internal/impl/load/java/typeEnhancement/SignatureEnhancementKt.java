package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
public final class SignatureEnhancementKt {
    @NotNull
    /* renamed from: a */
    public static final JavaTypeQualifiers m32859a(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        return (z2 && nullabilityQualifier == NullabilityQualifier.NOT_NULL) ? new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z) : new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z);
    }

    /* renamed from: b */
    public static final <T> T m32860b(@NotNull Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (!z) {
            if (t3 != null) {
                set = CollectionsKt.m32035n0(SetsKt.m32078e(set, t3));
            }
            return (T) CollectionsKt.m32012Y(set);
        }
        T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
        if (Intrinsics.m32174c(t4, t) && Intrinsics.m32174c(t3, t2)) {
            return null;
        }
        return t3 != null ? t3 : t4;
    }
}
