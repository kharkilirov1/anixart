package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, m31884d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/LifecycleObserver;", "", "onContextDestroyed", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class PoolReference implements LifecycleObserver {

    /* renamed from: b */
    public final WeakReference<Context> f7037b;

    /* renamed from: c */
    @NotNull
    public final RecyclerView.RecycledViewPool f7038c;

    /* renamed from: d */
    public final ActivityRecyclerPool f7039d;

    public PoolReference(@NotNull Context context, @NotNull RecyclerView.RecycledViewPool viewPool, @NotNull ActivityRecyclerPool activityRecyclerPool) {
        Intrinsics.m32179h(viewPool, "viewPool");
        this.f7038c = viewPool;
        this.f7039d = activityRecyclerPool;
        this.f7037b = new WeakReference<>(context);
    }

    @Nullable
    /* renamed from: h */
    public final Context m4622h() {
        return this.f7037b.get();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        ActivityRecyclerPool activityRecyclerPool = this.f7039d;
        Objects.requireNonNull(activityRecyclerPool);
        if (ActivityRecyclerPoolKt.m4474a(m4622h())) {
            this.f7038c.mo3915a();
            activityRecyclerPool.f6842a.remove(this);
        }
    }
}
