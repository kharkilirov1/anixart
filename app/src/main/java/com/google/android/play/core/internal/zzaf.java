package com.google.android.play.core.internal;

import androidx.annotation.GuardedBy;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzaf<StateT> {

    /* renamed from: a */
    @GuardedBy
    public final Set<StateUpdatedListener<StateT>> f20093a = new HashSet();

    /* renamed from: a */
    public final synchronized void m10832a(StateT statet) {
        Iterator<StateUpdatedListener<StateT>> it = this.f20093a.iterator();
        while (it.hasNext()) {
            it.next().mo10687a(statet);
        }
    }
}
