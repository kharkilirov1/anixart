package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes3.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* renamed from: b */
    public final NotNullLazyValue<MemberScope> f65991b;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(@NotNull NotNullLazyValue<? extends MemberScope> scope) {
        Intrinsics.m32180i(scope, "scope");
        this.f65991b = scope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    /* renamed from: g */
    public MemberScope mo33545g() {
        return this.f65991b.invoke();
    }
}
