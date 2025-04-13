package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ActivityFragmentLifecycle implements Lifecycle {

    /* renamed from: a */
    public final Set<LifecycleListener> f8652a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f8653b;

    /* renamed from: c */
    public boolean f8654c;

    @Override // com.bumptech.glide.manager.Lifecycle
    /* renamed from: a */
    public void mo5217a(@NonNull LifecycleListener lifecycleListener) {
        this.f8652a.add(lifecycleListener);
        if (this.f8654c) {
            lifecycleListener.onDestroy();
        } else if (this.f8653b) {
            lifecycleListener.mo4894b();
        } else {
            lifecycleListener.mo4896g();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    /* renamed from: b */
    public void mo5218b(@NonNull LifecycleListener lifecycleListener) {
        this.f8652a.remove(lifecycleListener);
    }

    /* renamed from: c */
    public void m5219c() {
        this.f8654c = true;
        Iterator it = ((ArrayList) Util.m5348e(this.f8652a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
    }

    /* renamed from: d */
    public void m5220d() {
        this.f8653b = true;
        Iterator it = ((ArrayList) Util.m5348e(this.f8652a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).mo4894b();
        }
    }

    /* renamed from: e */
    public void m5221e() {
        this.f8653b = false;
        Iterator it = ((ArrayList) Util.m5348e(this.f8652a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).mo4896g();
        }
    }
}
