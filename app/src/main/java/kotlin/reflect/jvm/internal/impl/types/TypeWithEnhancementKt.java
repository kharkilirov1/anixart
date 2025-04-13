package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes3.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: a */
    public static final KotlinType m33698a(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (receiver$0 instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) receiver$0).mo33655D();
        }
        return null;
    }

    @NotNull
    /* renamed from: b */
    public static final UnwrappedType m33699b(@NotNull UnwrappedType receiver$0, @NotNull KotlinType origin) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(origin, "origin");
        return m33700c(receiver$0, m33698a(origin));
    }

    @NotNull
    /* renamed from: c */
    public static final UnwrappedType m33700c(@NotNull UnwrappedType receiver$0, @Nullable KotlinType kotlinType) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (kotlinType == null) {
            return receiver$0;
        }
        if (receiver$0 instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) receiver$0, kotlinType);
        }
        if (receiver$0 instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) receiver$0, kotlinType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
