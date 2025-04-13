package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class TargetTracker implements LifecycleListener {

    /* renamed from: b */
    public final Set<Target<?>> f8687b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
        Iterator it = ((ArrayList) Util.m5348e(this.f8687b)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).mo4894b();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
        Iterator it = ((ArrayList) Util.m5348e(this.f8687b)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).mo4896g();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        Iterator it = ((ArrayList) Util.m5348e(this.f8687b)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onDestroy();
        }
    }
}
