package com.google.android.gms.common.api.internal;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zaa extends LifecycleCallback {

    /* renamed from: c */
    public List<Runnable> f15440c;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    /* renamed from: j */
    public final void mo8002j() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f15440c;
            this.f15440c = new ArrayList();
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}
