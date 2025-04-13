package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: c */
    public final WeakReference<LifecycleOwner> f4602c;

    /* renamed from: a */
    public FastSafeIterableMap<LifecycleObserver, ObserverWithState> f4600a = new FastSafeIterableMap<>();

    /* renamed from: d */
    public int f4603d = 0;

    /* renamed from: e */
    public boolean f4604e = false;

    /* renamed from: f */
    public boolean f4605f = false;

    /* renamed from: g */
    public ArrayList<Lifecycle.State> f4606g = new ArrayList<>();

    /* renamed from: b */
    public Lifecycle.State f4601b = Lifecycle.State.INITIALIZED;

    /* renamed from: h */
    public final boolean f4607h = true;

    public static class ObserverWithState {

        /* renamed from: a */
        public Lifecycle.State f4608a;

        /* renamed from: b */
        public LifecycleEventObserver f4609b;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            LifecycleEventObserver reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = Lifecycling.f4610a;
            boolean z = lifecycleObserver instanceof LifecycleEventObserver;
            boolean z2 = lifecycleObserver instanceof FullLifecycleObserver;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((FullLifecycleObserver) lifecycleObserver, (LifecycleEventObserver) lifecycleObserver);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((FullLifecycleObserver) lifecycleObserver, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (LifecycleEventObserver) lifecycleObserver;
            } else {
                Class<?> cls = lifecycleObserver.getClass();
                if (Lifecycling.m3206c(cls) == 2) {
                    List list = (List) ((HashMap) Lifecycling.f4611b).get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.m3204a((Constructor) list.get(0), lifecycleObserver));
                    } else {
                        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            generatedAdapterArr[i2] = Lifecycling.m3204a((Constructor) list.get(i2), lifecycleObserver);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lifecycleObserver);
                }
            }
            this.f4609b = reflectiveGenericLifecycleObserver;
            this.f4608a = state;
        }

        /* renamed from: a */
        public void m3203a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State m3193b = event.m3193b();
            this.f4608a = LifecycleRegistry.m3196g(this.f4608a, m3193b);
            this.f4609b.mo304c(lifecycleOwner, event);
            this.f4608a = m3193b;
        }
    }

    public LifecycleRegistry(@NonNull LifecycleOwner lifecycleOwner) {
        this.f4602c = new WeakReference<>(lifecycleOwner);
    }

    /* renamed from: g */
    public static Lifecycle.State m3196g(@NonNull Lifecycle.State state, @Nullable Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: a */
    public void mo3187a(@NonNull LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        m3198e("addObserver");
        Lifecycle.State state = this.f4601b;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(lifecycleObserver, state2);
        if (this.f4600a.mo1015e(lifecycleObserver, observerWithState) == null && (lifecycleOwner = this.f4602c.get()) != null) {
            boolean z = this.f4603d != 0 || this.f4604e;
            Lifecycle.State m3197d = m3197d(lifecycleObserver);
            this.f4603d++;
            while (observerWithState.f4608a.compareTo(m3197d) < 0 && this.f4600a.f1693f.containsKey(lifecycleObserver)) {
                this.f4606g.add(observerWithState.f4608a);
                Lifecycle.Event m3191c = Lifecycle.Event.m3191c(observerWithState.f4608a);
                if (m3191c == null) {
                    StringBuilder m24u = C0000a.m24u("no event up from ");
                    m24u.append(observerWithState.f4608a);
                    throw new IllegalStateException(m24u.toString());
                }
                observerWithState.m3203a(lifecycleOwner, m3191c);
                m3201i();
                m3197d = m3197d(lifecycleObserver);
            }
            if (!z) {
                m3202j();
            }
            this.f4603d--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    @NonNull
    /* renamed from: b */
    public Lifecycle.State mo3188b() {
        return this.f4601b;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: c */
    public void mo3189c(@NonNull LifecycleObserver lifecycleObserver) {
        m3198e("removeObserver");
        this.f4600a.mo1016f(lifecycleObserver);
    }

    /* renamed from: d */
    public final Lifecycle.State m3197d(LifecycleObserver lifecycleObserver) {
        Map.Entry<LifecycleObserver, ObserverWithState> m1017g = this.f4600a.m1017g(lifecycleObserver);
        Lifecycle.State state = null;
        Lifecycle.State state2 = m1017g != null ? m1017g.getValue().f4608a : null;
        if (!this.f4606g.isEmpty()) {
            state = this.f4606g.get(r0.size() - 1);
        }
        return m3196g(m3196g(this.f4601b, state2), state);
    }

    @SuppressLint
    /* renamed from: e */
    public final void m3198e(String str) {
        if (this.f4607h && !ArchTaskExecutor.m1009d().mo1011b()) {
            throw new IllegalStateException(C0000a.m16m("Method ", str, " must be called on the main thread"));
        }
    }

    /* renamed from: f */
    public void m3199f(@NonNull Lifecycle.Event event) {
        m3198e("handleLifecycleEvent");
        m3200h(event.m3193b());
    }

    /* renamed from: h */
    public final void m3200h(Lifecycle.State state) {
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        Lifecycle.State state3 = this.f4601b;
        if (state3 == state) {
            return;
        }
        if (state3 == Lifecycle.State.INITIALIZED && state == state2) {
            StringBuilder m24u = C0000a.m24u("no event down from ");
            m24u.append(this.f4601b);
            throw new IllegalStateException(m24u.toString());
        }
        this.f4601b = state;
        if (this.f4604e || this.f4603d != 0) {
            this.f4605f = true;
            return;
        }
        this.f4604e = true;
        m3202j();
        this.f4604e = false;
        if (this.f4601b == state2) {
            this.f4600a = new FastSafeIterableMap<>();
        }
    }

    /* renamed from: i */
    public final void m3201i() {
        this.f4606g.remove(r0.size() - 1);
    }

    /* renamed from: j */
    public final void m3202j() {
        LifecycleOwner lifecycleOwner = this.f4602c.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            FastSafeIterableMap<LifecycleObserver, ObserverWithState> fastSafeIterableMap = this.f4600a;
            boolean z = true;
            if (fastSafeIterableMap.f1697e != 0) {
                Lifecycle.State state = fastSafeIterableMap.f1694b.getValue().f4608a;
                Lifecycle.State state2 = this.f4600a.f1695c.getValue().f4608a;
                if (state != state2 || this.f4601b != state2) {
                    z = false;
                }
            }
            if (z) {
                this.f4605f = false;
                return;
            }
            this.f4605f = false;
            if (this.f4601b.compareTo(this.f4600a.f1694b.getValue().f4608a) < 0) {
                Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> descendingIterator = this.f4600a.descendingIterator();
                while (descendingIterator.hasNext() && !this.f4605f) {
                    Map.Entry<LifecycleObserver, ObserverWithState> next = descendingIterator.next();
                    ObserverWithState value = next.getValue();
                    while (value.f4608a.compareTo(this.f4601b) > 0 && !this.f4605f && this.f4600a.contains(next.getKey())) {
                        Lifecycle.Event m3190a = Lifecycle.Event.m3190a(value.f4608a);
                        if (m3190a == null) {
                            StringBuilder m24u = C0000a.m24u("no event down from ");
                            m24u.append(value.f4608a);
                            throw new IllegalStateException(m24u.toString());
                        }
                        this.f4606g.add(m3190a.m3193b());
                        value.m3203a(lifecycleOwner, m3190a);
                        m3201i();
                    }
                }
            }
            SafeIterableMap.Entry<LifecycleObserver, ObserverWithState> entry = this.f4600a.f1695c;
            if (!this.f4605f && entry != null && this.f4601b.compareTo(entry.getValue().f4608a) > 0) {
                SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions m1018b = this.f4600a.m1018b();
                while (m1018b.hasNext() && !this.f4605f) {
                    Map.Entry next2 = m1018b.next();
                    ObserverWithState observerWithState = (ObserverWithState) next2.getValue();
                    while (observerWithState.f4608a.compareTo(this.f4601b) < 0 && !this.f4605f && this.f4600a.contains((LifecycleObserver) next2.getKey())) {
                        this.f4606g.add(observerWithState.f4608a);
                        Lifecycle.Event m3191c = Lifecycle.Event.m3191c(observerWithState.f4608a);
                        if (m3191c == null) {
                            StringBuilder m24u2 = C0000a.m24u("no event up from ");
                            m24u2.append(observerWithState.f4608a);
                            throw new IllegalStateException(m24u2.toString());
                        }
                        observerWithState.m3203a(lifecycleOwner, m3191c);
                        m3201i();
                    }
                }
            }
        }
    }
}
