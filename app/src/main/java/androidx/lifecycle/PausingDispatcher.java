package androidx.lifecycle;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import org.jetbrains.annotations.NotNull;

/* compiled from: PausingDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "lifecycle-runtime-ktx_release"}, m31885k = 1, m31886mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class PausingDispatcher extends CoroutineDispatcher {

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DispatchQueue f4634c = new DispatchQueue();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull final CoroutineContext context, @NotNull final Runnable block) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(block, "block");
        final DispatchQueue dispatchQueue = this.f4634c;
        Objects.requireNonNull(dispatchQueue);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        MainCoroutineDispatcher mo34115v = MainDispatcherLoader.f68292a.mo34115v();
        if (mo34115v.mo3222q(context) || dispatchQueue.m3180a()) {
            mo34115v.mo3221m(context, new Runnable() { // from class: androidx.lifecycle.DispatchQueue$dispatchAndEnqueue$$inlined$with$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.this.m3182c(block);
                }
            });
        } else {
            dispatchQueue.m3182c(block);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: q */
    public boolean mo3222q(@NotNull CoroutineContext context) {
        Intrinsics.m32179h(context, "context");
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        if (MainDispatcherLoader.f68292a.mo34115v().mo3222q(context)) {
            return true;
        }
        return !this.f4634c.m3180a();
    }
}
