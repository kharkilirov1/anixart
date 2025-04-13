package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SavedStateRegistryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Companion", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: a */
    @NotNull
    public final SavedStateRegistryOwner f5957a;

    /* renamed from: b */
    @NotNull
    public final SavedStateRegistry f5958b = new SavedStateRegistry();

    /* renamed from: c */
    public boolean f5959c;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this.f5957a = savedStateRegistryOwner;
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final SavedStateRegistryController m4134a(@NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        return new SavedStateRegistryController(savedStateRegistryOwner, null);
    }

    @MainThread
    /* renamed from: b */
    public final void m4135b() {
        Lifecycle lifecycle = this.f5957a.getLifecycle();
        Intrinsics.m32178g(lifecycle, "owner.lifecycle");
        if (!(lifecycle.mo3188b() == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo3187a(new Recreator(this.f5957a));
        final SavedStateRegistry savedStateRegistry = this.f5958b;
        Objects.requireNonNull(savedStateRegistry);
        if (!(!savedStateRegistry.f5952b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.mo3187a(new LifecycleEventObserver() { // from class: androidx.savedstate.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public final void mo304c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry this$0 = SavedStateRegistry.this;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.m32179h(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    this$0.f5956f = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    this$0.f5956f = false;
                }
            }
        });
        savedStateRegistry.f5952b = true;
        this.f5959c = true;
    }

    @MainThread
    /* renamed from: c */
    public final void m4136c(@Nullable Bundle bundle) {
        if (!this.f5959c) {
            m4135b();
        }
        Lifecycle lifecycle = this.f5957a.getLifecycle();
        Intrinsics.m32178g(lifecycle, "owner.lifecycle");
        if (!(!(lifecycle.mo3188b().compareTo(Lifecycle.State.STARTED) >= 0))) {
            StringBuilder m24u = C0000a.m24u("performRestore cannot be called when owner is ");
            m24u.append(lifecycle.mo3188b());
            throw new IllegalStateException(m24u.toString().toString());
        }
        SavedStateRegistry savedStateRegistry = this.f5958b;
        if (!savedStateRegistry.f5952b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!savedStateRegistry.f5954d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        savedStateRegistry.f5953c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        savedStateRegistry.f5954d = true;
    }

    @MainThread
    /* renamed from: d */
    public final void m4137d(@NotNull Bundle outBundle) {
        Intrinsics.m32179h(outBundle, "outBundle");
        SavedStateRegistry savedStateRegistry = this.f5958b;
        Objects.requireNonNull(savedStateRegistry);
        Bundle bundle = new Bundle();
        Bundle bundle2 = savedStateRegistry.f5953c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, SavedStateRegistry.SavedStateProvider>.IteratorWithAdditions m1018b = savedStateRegistry.f5951a.m1018b();
        while (m1018b.hasNext()) {
            Map.Entry next = m1018b.next();
            bundle.putBundle((String) next.getKey(), ((SavedStateRegistry.SavedStateProvider) next.getValue()).mo313a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
