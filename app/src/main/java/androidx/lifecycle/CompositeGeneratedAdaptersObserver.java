package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* renamed from: b */
    public final GeneratedAdapter[] f4553b;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f4553b = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter generatedAdapter : this.f4553b) {
            generatedAdapter.m3183a(lifecycleOwner, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : this.f4553b) {
            generatedAdapter2.m3183a(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
