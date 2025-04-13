package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* renamed from: b */
    public final Object f4651b;

    /* renamed from: c */
    public final ClassesInfoCache.CallbackInfo f4652c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4651b = obj;
        this.f4652c = ClassesInfoCache.f4546c.m3175b(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        ClassesInfoCache.CallbackInfo callbackInfo = this.f4652c;
        Object obj = this.f4651b;
        ClassesInfoCache.CallbackInfo.m3177a(callbackInfo.f4549a.get(event), lifecycleOwner, event, obj);
        ClassesInfoCache.CallbackInfo.m3177a(callbackInfo.f4549a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }
}
