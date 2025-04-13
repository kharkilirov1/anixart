package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* renamed from: b */
    public List<Disposable> f59618b;

    /* renamed from: c */
    public volatile boolean f59619c;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: a */
    public boolean mo31392a(Disposable disposable) {
        if (!mo31394c(disposable)) {
            return false;
        }
        ((ScheduledRunnable) disposable).mo31379f();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: b */
    public boolean mo31393b(Disposable disposable) {
        if (!this.f59619c) {
            synchronized (this) {
                if (!this.f59619c) {
                    List list = this.f59618b;
                    if (list == null) {
                        list = new LinkedList();
                        this.f59618b = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.mo31379f();
        return false;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: c */
    public boolean mo31394c(Disposable disposable) {
        Objects.requireNonNull(disposable, "Disposable item is null");
        if (this.f59619c) {
            return false;
        }
        synchronized (this) {
            if (this.f59619c) {
                return false;
            }
            List<Disposable> list = this.f59618b;
            if (list != null && list.remove(disposable)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        if (this.f59619c) {
            return;
        }
        synchronized (this) {
            if (this.f59619c) {
                return;
            }
            this.f59619c = true;
            List<Disposable> list = this.f59618b;
            ArrayList arrayList = null;
            this.f59618b = null;
            if (list == null) {
                return;
            }
            Iterator<Disposable> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo31379f();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new CompositeException(arrayList);
                }
                throw ExceptionHelper.m31821e((Throwable) arrayList.get(0));
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f59619c;
    }
}
