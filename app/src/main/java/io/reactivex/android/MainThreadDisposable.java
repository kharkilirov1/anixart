package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* renamed from: b */
    public final AtomicBoolean f59587b = new AtomicBoolean();

    /* renamed from: a */
    public abstract void m31389a();

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        if (this.f59587b.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m31389a();
            } else {
                AndroidSchedulers.m31390a().mo31376c(new Runnable() { // from class: io.reactivex.android.MainThreadDisposable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainThreadDisposable.this.m31389a();
                    }
                });
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f59587b.get();
    }
}
