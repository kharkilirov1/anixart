package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: utils.kt */
/* loaded from: classes3.dex */
final class SubtypePathNode {

    /* renamed from: a */
    @NotNull
    public final KotlinType f66382a;

    /* renamed from: b */
    @Nullable
    public final SubtypePathNode f66383b;

    public SubtypePathNode(@NotNull KotlinType kotlinType, @Nullable SubtypePathNode subtypePathNode) {
        this.f66382a = kotlinType;
        this.f66383b = subtypePathNode;
    }
}
