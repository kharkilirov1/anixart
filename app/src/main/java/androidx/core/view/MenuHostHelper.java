package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MenuHostHelper {

    /* renamed from: a */
    public final Runnable f3620a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<MenuProvider> f3621b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<MenuProvider, LifecycleContainer> f3622c = new HashMap();

    public static class LifecycleContainer {

        /* renamed from: a */
        public final Lifecycle f3623a;

        /* renamed from: b */
        public LifecycleEventObserver f3624b;

        public LifecycleContainer(@NonNull Lifecycle lifecycle, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f3623a = lifecycle;
            this.f3624b = lifecycleEventObserver;
            lifecycle.mo3187a(lifecycleEventObserver);
        }

        /* renamed from: a */
        public void m2110a() {
            this.f3623a.mo3189c(this.f3624b);
            this.f3624b = null;
        }
    }

    public MenuHostHelper(@NonNull Runnable runnable) {
        this.f3620a = runnable;
    }

    /* renamed from: a */
    public void m2104a(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.f3621b.add(menuProvider);
        this.f3620a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer remove = this.f3622c.remove(menuProvider);
        if (remove != null) {
            remove.m2110a();
        }
        this.f3622c.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public final void mo304c(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = MenuHostHelper.this;
                MenuProvider menuProvider2 = menuProvider;
                Objects.requireNonNull(menuHostHelper);
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.m2109f(menuProvider2);
                }
            }
        }));
    }

    @SuppressLint
    /* renamed from: b */
    public void m2105b(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        LifecycleContainer remove = this.f3622c.remove(menuProvider);
        if (remove != null) {
            remove.m2110a();
        }
        this.f3622c.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public final void mo304c(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = MenuHostHelper.this;
                Lifecycle.State state2 = state;
                MenuProvider menuProvider2 = menuProvider;
                Objects.requireNonNull(menuHostHelper);
                if (event == Lifecycle.Event.m3192d(state2)) {
                    menuHostHelper.f3621b.add(menuProvider2);
                    menuHostHelper.f3620a.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.m2109f(menuProvider2);
                } else if (event == Lifecycle.Event.m3190a(state2)) {
                    menuHostHelper.f3621b.remove(menuProvider2);
                    menuHostHelper.f3620a.run();
                }
            }
        }));
    }

    /* renamed from: c */
    public void m2106c(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.f3621b.iterator();
        while (it.hasNext()) {
            it.next().mo2132c(menu, menuInflater);
        }
    }

    /* renamed from: d */
    public boolean m2107d(@NonNull MenuItem menuItem) {
        Iterator<MenuProvider> it = this.f3621b.iterator();
        while (it.hasNext()) {
            if (it.next().mo2130a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m2108e(@NonNull Menu menu) {
        Iterator<MenuProvider> it = this.f3621b.iterator();
        while (it.hasNext()) {
            it.next().mo2133d(menu);
        }
    }

    /* renamed from: f */
    public void m2109f(@NonNull MenuProvider menuProvider) {
        this.f3621b.remove(menuProvider);
        LifecycleContainer remove = this.f3622c.remove(menuProvider);
        if (remove != null) {
            remove.m2110a();
        }
        this.f3620a.run();
    }
}
