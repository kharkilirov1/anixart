package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    /* renamed from: b */
    @NotNull
    public final SavedStateHandlesProvider f4662b;

    public SavedStateHandleAttacher(@NotNull SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f4662b = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.m32179h(source, "source");
        Intrinsics.m32179h(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().mo3189c(this);
            this.f4662b.m3238b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
