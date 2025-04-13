package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public interface LifecycleEventObserver extends LifecycleObserver {
    /* renamed from: c */
    void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event);
}
