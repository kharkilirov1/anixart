package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorType.kt */
/* loaded from: classes3.dex */
public final class UnresolvedType extends ErrorType {

    /* renamed from: e */
    @NotNull
    public final String f66360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnresolvedType(@NotNull String presentableName, @NotNull TypeConstructor constructor, @NotNull MemberScope memberScope, @NotNull List<? extends TypeProjection> arguments, boolean z) {
        super(constructor, memberScope, arguments, z);
        Intrinsics.m32180i(presentableName, "presentableName");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(memberScope, "memberScope");
        Intrinsics.m32180i(arguments, "arguments");
        this.f66360e = presentableName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return new UnresolvedType(this.f66360e, this.f66302a, this.f66303b, this.f66304c, z);
    }
}
