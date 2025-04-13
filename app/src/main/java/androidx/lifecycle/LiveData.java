package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f4612k = new Object();

    /* renamed from: a */
    public final Object f4613a = new Object();

    /* renamed from: b */
    public SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> f4614b = new SafeIterableMap<>();

    /* renamed from: c */
    public int f4615c = 0;

    /* renamed from: d */
    public boolean f4616d;

    /* renamed from: e */
    public volatile Object f4617e;

    /* renamed from: f */
    public volatile Object f4618f;

    /* renamed from: g */
    public int f4619g;

    /* renamed from: h */
    public boolean f4620h;

    /* renamed from: i */
    public boolean f4621i;

    /* renamed from: j */
    public final Runnable f4622j;

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        public AlwaysActiveObserver(LiveData liveData, Observer<? super T> observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* renamed from: k */
        public boolean mo3217k() {
            return true;
        }
    }

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {

        /* renamed from: f */
        @NonNull
        public final LifecycleOwner f4624f;

        public LifecycleBoundObserver(@NonNull LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f4624f = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            Lifecycle.State mo3188b = this.f4624f.getLifecycle().mo3188b();
            if (mo3188b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo3215k(this.f4626b);
                return;
            }
            Lifecycle.State state = null;
            while (state != mo3188b) {
                m3220h(mo3217k());
                state = mo3188b;
                mo3188b = this.f4624f.getLifecycle().mo3188b();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* renamed from: i */
        public void mo3218i() {
            this.f4624f.getLifecycle().mo3189c(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* renamed from: j */
        public boolean mo3219j(LifecycleOwner lifecycleOwner) {
            return this.f4624f == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        /* renamed from: k */
        public boolean mo3217k() {
            return this.f4624f.getLifecycle().mo3188b().compareTo(Lifecycle.State.STARTED) >= 0;
        }
    }

    public abstract class ObserverWrapper {

        /* renamed from: b */
        public final Observer<? super T> f4626b;

        /* renamed from: c */
        public boolean f4627c;

        /* renamed from: d */
        public int f4628d = -1;

        public ObserverWrapper(Observer<? super T> observer) {
            this.f4626b = observer;
        }

        /* renamed from: h */
        public void m3220h(boolean z) {
            if (z == this.f4627c) {
                return;
            }
            this.f4627c = z;
            LiveData liveData = LiveData.this;
            int i2 = z ? 1 : -1;
            int i3 = liveData.f4615c;
            liveData.f4615c = i2 + i3;
            if (!liveData.f4616d) {
                liveData.f4616d = true;
                while (true) {
                    try {
                        int i4 = liveData.f4615c;
                        if (i3 == i4) {
                            break;
                        }
                        boolean z2 = i3 == 0 && i4 > 0;
                        boolean z3 = i3 > 0 && i4 == 0;
                        if (z2) {
                            liveData.mo3179h();
                        } else if (z3) {
                            liveData.mo3213i();
                        }
                        i3 = i4;
                    } finally {
                        liveData.f4616d = false;
                    }
                }
            }
            if (this.f4627c) {
                LiveData.this.m3209d(this);
            }
        }

        /* renamed from: i */
        public void mo3218i() {
        }

        /* renamed from: j */
        public boolean mo3219j(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: k */
        public abstract boolean mo3217k();
    }

    public LiveData() {
        Object obj = f4612k;
        this.f4618f = obj;
        this.f4622j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.f4613a) {
                    obj2 = LiveData.this.f4618f;
                    LiveData.this.f4618f = LiveData.f4612k;
                }
                LiveData.this.mo3216l(obj2);
            }
        };
        this.f4617e = obj;
        this.f4619g = -1;
    }

    /* renamed from: b */
    public static void m3207b(String str) {
        if (!ArchTaskExecutor.m1009d().mo1011b()) {
            throw new IllegalStateException(C0000a.m16m("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: c */
    public final void m3208c(LiveData<T>.ObserverWrapper observerWrapper) {
        if (observerWrapper.f4627c) {
            if (!observerWrapper.mo3217k()) {
                observerWrapper.m3220h(false);
                return;
            }
            int i2 = observerWrapper.f4628d;
            int i3 = this.f4619g;
            if (i2 >= i3) {
                return;
            }
            observerWrapper.f4628d = i3;
            observerWrapper.f4626b.mo2959a((Object) this.f4617e);
        }
    }

    /* renamed from: d */
    public void m3209d(@Nullable LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.f4620h) {
            this.f4621i = true;
            return;
        }
        this.f4620h = true;
        do {
            this.f4621i = false;
            if (observerWrapper != null) {
                m3208c(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper>.IteratorWithAdditions m1018b = this.f4614b.m1018b();
                while (m1018b.hasNext()) {
                    m3208c((ObserverWrapper) m1018b.next().getValue());
                    if (this.f4621i) {
                        break;
                    }
                }
            }
        } while (this.f4621i);
        this.f4620h = false;
    }

    /* renamed from: e */
    public boolean m3210e() {
        return this.f4615c > 0;
    }

    @MainThread
    /* renamed from: f */
    public void m3211f(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        m3207b("observe");
        if (lifecycleOwner.getLifecycle().mo3188b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.ObserverWrapper mo1015e = this.f4614b.mo1015e(observer, lifecycleBoundObserver);
        if (mo1015e != null && !mo1015e.mo3219j(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo1015e != null) {
            return;
        }
        lifecycleOwner.getLifecycle().mo3187a(lifecycleBoundObserver);
    }

    @MainThread
    /* renamed from: g */
    public void m3212g(@NonNull Observer<? super T> observer) {
        m3207b("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(this, observer);
        LiveData<T>.ObserverWrapper mo1015e = this.f4614b.mo1015e(observer, alwaysActiveObserver);
        if (mo1015e instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo1015e != null) {
            return;
        }
        alwaysActiveObserver.m3220h(true);
    }

    /* renamed from: h */
    public void mo3179h() {
    }

    /* renamed from: i */
    public void mo3213i() {
    }

    /* renamed from: j */
    public void mo3214j(T t) {
        boolean z;
        synchronized (this.f4613a) {
            z = this.f4618f == f4612k;
            this.f4618f = t;
        }
        if (z) {
            ArchTaskExecutor.m1009d().f1688a.mo1012c(this.f4622j);
        }
    }

    @MainThread
    /* renamed from: k */
    public void mo3215k(@NonNull Observer<? super T> observer) {
        m3207b("removeObserver");
        LiveData<T>.ObserverWrapper mo1016f = this.f4614b.mo1016f(observer);
        if (mo1016f == null) {
            return;
        }
        mo1016f.mo3218i();
        mo1016f.m3220h(false);
    }

    @MainThread
    /* renamed from: l */
    public void mo3216l(T t) {
        m3207b("setValue");
        this.f4619g++;
        this.f4617e = t;
        m3209d(null);
    }
}
