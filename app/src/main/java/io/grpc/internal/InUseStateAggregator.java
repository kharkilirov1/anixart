package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
public abstract class InUseStateAggregator<T> {

    /* renamed from: a */
    public final Set<T> f58727a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public abstract void mo30974a();

    /* renamed from: b */
    public abstract void mo30975b();

    /* renamed from: c */
    public final void m31114c(T t, boolean z) {
        int size = this.f58727a.size();
        if (z) {
            this.f58727a.add(t);
            if (size == 0) {
                mo30974a();
                return;
            }
            return;
        }
        if (this.f58727a.remove(t) && size == 1) {
            mo30975b();
        }
    }
}
