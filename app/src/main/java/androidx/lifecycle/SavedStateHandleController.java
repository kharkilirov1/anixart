package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
final class SavedStateHandleController implements LifecycleEventObserver {

    /* renamed from: b */
    public final String f4663b;

    /* renamed from: c */
    public boolean f4664c = false;

    /* renamed from: d */
    public final SavedStateHandle f4665d;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.f4663b = str;
        this.f4665d = savedStateHandle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f4664c = false;
            lifecycleOwner.getLifecycle().mo3189c(this);
        }
    }

    /* renamed from: h */
    public void m3234h(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        if (this.f4664c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4664c = true;
        lifecycle.mo3187a(this);
        savedStateRegistry.m4132c(this.f4663b, this.f4665d.f4661e);
    }
}
