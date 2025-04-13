package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {

    /* renamed from: a */
    public boolean f221a;

    /* renamed from: b */
    public CopyOnWriteArrayList<Cancellable> f222b = new CopyOnWriteArrayList<>();

    public OnBackPressedCallback(boolean z) {
        this.f221a = z;
    }

    @MainThread
    /* renamed from: d */
    public abstract void mo308d();

    @MainThread
    /* renamed from: e */
    public final void m309e() {
        Iterator<Cancellable> it = this.f222b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
