package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lifecycle.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-runtime-ktx_release"}, m31885k = 1, m31886mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.m32179h(source, "source");
        Intrinsics.m32179h(event, "event");
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF68244b() {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    @NotNull
    /* renamed from: h */
    public Lifecycle mo3195h() {
        return null;
    }
}
