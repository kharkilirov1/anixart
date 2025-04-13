package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* renamed from: b */
    public final GeneratedAdapter f4683b;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.f4683b = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        this.f4683b.m3183a(lifecycleOwner, event, false, null);
        this.f4683b.m3183a(lifecycleOwner, event, true, null);
    }
}
