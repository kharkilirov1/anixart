package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public final class SpecialTypesKt {
    @NotNull
    /* renamed from: a */
    public static final SimpleType m33670a(@NotNull SimpleType receiver$0, @NotNull SimpleType abbreviatedType) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.m33667a(receiver$0) ? receiver$0 : new AbbreviatedType(receiver$0, abbreviatedType);
    }
}
