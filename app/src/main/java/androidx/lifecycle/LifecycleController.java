package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle-runtime-ktx_release"}, m31885k = 1, m31886mv = {1, 4, 1})
@MainThread
/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a */
    public final LifecycleEventObserver f4582a;

    /* renamed from: b */
    public final Lifecycle f4583b;

    /* renamed from: c */
    public final Lifecycle.State f4584c;

    /* renamed from: d */
    public final DispatchQueue f4585d;

    public LifecycleController(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minState, @NotNull DispatchQueue dispatchQueue, @NotNull final Job job) {
        Intrinsics.m32179h(lifecycle, "lifecycle");
        Intrinsics.m32179h(minState, "minState");
        Intrinsics.m32179h(dispatchQueue, "dispatchQueue");
        this.f4583b = lifecycle;
        this.f4584c = minState;
        this.f4585d = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public final void mo304c(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.m32179h(source, "source");
                Intrinsics.m32179h(event, "<anonymous parameter 1>");
                Lifecycle lifecycle2 = source.getLifecycle();
                Intrinsics.m32178g(lifecycle2, "source.lifecycle");
                if (lifecycle2.mo3188b() == Lifecycle.State.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    job.mo34061b(null);
                    lifecycleController.m3194a();
                    return;
                }
                Lifecycle lifecycle3 = source.getLifecycle();
                Intrinsics.m32178g(lifecycle3, "source.lifecycle");
                if (lifecycle3.mo3188b().compareTo(LifecycleController.this.f4584c) < 0) {
                    LifecycleController.this.f4585d.f4562a = true;
                    return;
                }
                DispatchQueue dispatchQueue2 = LifecycleController.this.f4585d;
                if (dispatchQueue2.f4562a) {
                    if (!(true ^ dispatchQueue2.f4563b)) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                    }
                    dispatchQueue2.f4562a = false;
                    dispatchQueue2.m3181b();
                }
            }
        };
        this.f4582a = lifecycleEventObserver;
        if (lifecycle.mo3188b() != Lifecycle.State.DESTROYED) {
            lifecycle.mo3187a(lifecycleEventObserver);
        } else {
            job.mo34061b(null);
            m3194a();
        }
    }

    @MainThread
    /* renamed from: a */
    public final void m3194a() {
        this.f4583b.mo3189c(this.f4582a);
        DispatchQueue dispatchQueue = this.f4585d;
        dispatchQueue.f4563b = true;
        dispatchQueue.m3181b();
    }
}
