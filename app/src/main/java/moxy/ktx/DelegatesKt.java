package moxy.ktx;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpDelegate;
import moxy.MvpDelegateHolder;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: Delegates.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m31884d2 = {"moxyPresenter", "Lmoxy/ktx/MoxyKtxDelegate;", "T", "Lmoxy/MvpPresenter;", "Lmoxy/MvpDelegateHolder;", "name", "", "factory", "Lkotlin/Function0;", "moxy-ktx"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DelegatesKt {
    @NotNull
    public static final /* synthetic */ <T extends MvpPresenter<?>> MoxyKtxDelegate<T> moxyPresenter(@NotNull MvpDelegateHolder moxyPresenter, @NotNull String name, @NotNull Function0<? extends T> factory) {
        Intrinsics.m32179h(moxyPresenter, "$this$moxyPresenter");
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(factory, "factory");
        MvpDelegate mvpDelegate = moxyPresenter.getMvpDelegate();
        Intrinsics.m32178g(mvpDelegate, "mvpDelegate");
        Intrinsics.m32185n();
        throw null;
    }

    public static /* synthetic */ MoxyKtxDelegate moxyPresenter$default(MvpDelegateHolder moxyPresenter, String name, Function0 factory, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            name = "presenter";
        }
        Intrinsics.m32179h(moxyPresenter, "$this$moxyPresenter");
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(factory, "factory");
        MvpDelegate mvpDelegate = moxyPresenter.getMvpDelegate();
        Intrinsics.m32178g(mvpDelegate, "mvpDelegate");
        Intrinsics.m32185n();
        throw null;
    }
}
