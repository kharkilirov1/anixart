package com.google.android.gms.tasks;

import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzv extends LifecycleCallback {

    /* renamed from: c */
    public final List<WeakReference<zzq<?>>> f17291c;

    public zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f17291c = new ArrayList();
        lifecycleFragment.mo8003g0("TaskOnStopCallback", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    /* renamed from: j */
    public final void mo8002j() {
        synchronized (this.f17291c) {
            Iterator<WeakReference<zzq<?>>> it = this.f17291c.iterator();
            while (it.hasNext()) {
                zzq<?> zzqVar = it.next().get();
                if (zzqVar != null) {
                    zzqVar.mo9728v();
                }
            }
            this.f17291c.clear();
        }
    }
}
