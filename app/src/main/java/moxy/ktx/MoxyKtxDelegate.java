package moxy.ktx;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.presenter.PresenterField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MoxyKtxDelegate.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B'\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ$\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0086\u0002¢\u0006\u0002\u0010\u0011R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0012"}, m31884d2 = {"Lmoxy/ktx/MoxyKtxDelegate;", "T", "Lmoxy/MvpPresenter;", "", "delegate", "Lmoxy/MvpDelegate;", "name", "", "factory", "Lkotlin/Function0;", "(Lmoxy/MvpDelegate;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "presenter", "Lmoxy/MvpPresenter;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lmoxy/MvpPresenter;", "moxy-ktx"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MoxyKtxDelegate<T extends MvpPresenter<?>> {
    private final Function0<T> factory;
    private T presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public MoxyKtxDelegate(@NotNull MvpDelegate<?> delegate, @NotNull final String name, @NotNull Function0<? extends T> factory) {
        Intrinsics.m32179h(delegate, "delegate");
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(factory, "factory");
        this.factory = factory;
        final String str = null;
        final Class cls = null;
        delegate.registerExternalPresenterField(new PresenterField<Object>(name, str, cls) { // from class: moxy.ktx.MoxyKtxDelegate$field$1
            @Override // moxy.presenter.PresenterField
            public void bind(@Nullable Object container, @NotNull MvpPresenter<?> presenter) {
                Intrinsics.m32179h(presenter, "presenter");
                MoxyKtxDelegate.this.presenter = presenter;
            }

            @Override // moxy.presenter.PresenterField
            @NotNull
            public MvpPresenter<?> providePresenter(@Nullable Object delegated) {
                Function0 function0;
                function0 = MoxyKtxDelegate.this.factory;
                return (MvpPresenter) function0.invoke();
            }
        });
    }

    @NotNull
    public final T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.m32179h(property, "property");
        T t = this.presenter;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Presenter can be accessed only after MvpDelegate.onCreate() call");
    }
}
