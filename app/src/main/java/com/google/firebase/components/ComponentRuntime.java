package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class ComponentRuntime extends AbstractComponentContainer implements ComponentLoader {

    /* renamed from: g */
    public static final Provider<Set<Object>> f22484g = C2065f.f22533c;

    /* renamed from: d */
    public final List<Provider<ComponentRegistrar>> f22488d;

    /* renamed from: e */
    public final EventBus f22489e;

    /* renamed from: a */
    public final Map<Component<?>, Provider<?>> f22485a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Provider<?>> f22486b = new HashMap();

    /* renamed from: c */
    public final Map<Class<?>, LazySet<?>> f22487c = new HashMap();

    /* renamed from: f */
    public final AtomicReference<Boolean> f22490f = new AtomicReference<>();

    public static final class Builder {

        /* renamed from: a */
        public final Executor f22491a;

        /* renamed from: b */
        public final List<Provider<ComponentRegistrar>> f22492b = new ArrayList();

        /* renamed from: c */
        public final List<Component<?>> f22493c = new ArrayList();

        public Builder(Executor executor) {
            this.f22491a = executor;
        }
    }

    public ComponentRuntime(Executor executor, Iterable iterable, Collection collection, C20571 c20571) {
        EventBus eventBus = new EventBus(executor);
        this.f22489e = eventBus;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.m12331e(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.m12331e(this, ComponentLoader.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f22488d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(componentRegistrar.getComponents());
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.f22485a.isEmpty()) {
                CycleDetector.m12347a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f22485a.keySet());
                arrayList4.addAll(arrayList);
                CycleDetector.m12347a(arrayList4);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                final Component<?> component2 = (Component) it4.next();
                this.f22485a.put(component2, new Lazy(new Provider() { // from class: com.google.firebase.components.c
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        ComponentRuntime componentRuntime = ComponentRuntime.this;
                        Component component3 = component2;
                        Provider<Set<Object>> provider = ComponentRuntime.f22484g;
                        Objects.requireNonNull(componentRuntime);
                        return component3.f22473e.mo12326a(new RestrictedComponentContainer(component3, componentRuntime));
                    }
                }));
            }
            arrayList3.addAll(m12345g(arrayList));
            arrayList3.addAll(m12346h());
            m12344f();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f22490f.get();
        if (bool != null) {
            m12343e(this.f22485a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: a */
    public synchronized <T> Provider<T> mo12337a(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return (Provider) this.f22486b.get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: b */
    public synchronized <T> Provider<Set<T>> mo12338b(Class<T> cls) {
        LazySet<?> lazySet = this.f22487c.get(cls);
        if (lazySet != null) {
            return lazySet;
        }
        return (Provider<Set<T>>) f22484g;
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: d */
    public <T> Deferred<T> mo12339d(Class<T> cls) {
        Provider<T> mo12337a = mo12337a(cls);
        return mo12337a == null ? new OptionalProvider(C2064e.f22531a, C2065f.f22532b) : mo12337a instanceof OptionalProvider ? (OptionalProvider) mo12337a : new OptionalProvider(null, mo12337a);
    }

    /* renamed from: e */
    public final void m12343e(Map<Component<?>, Provider<?>> map, boolean z) {
        Queue<Event<?>> queue;
        Set<Map.Entry<EventHandler<Object>, Executor>> emptySet;
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            int i2 = key.f22471c;
            if (!(i2 == 1)) {
                if ((i2 == 2) && z) {
                }
            }
            value.get();
        }
        EventBus eventBus = this.f22489e;
        synchronized (eventBus) {
            queue = eventBus.f22504b;
            if (queue != null) {
                eventBus.f22504b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                Objects.requireNonNull(event);
                synchronized (eventBus) {
                    Queue<Event<?>> queue2 = eventBus.f22504b;
                    if (queue2 != null) {
                        queue2.add(event);
                    } else {
                        synchronized (eventBus) {
                            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = eventBus.f22503a.get(null);
                            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (Map.Entry<EventHandler<Object>, Executor> entry2 : emptySet) {
                            entry2.getValue().execute(new RunnableC2063d(entry2, event, 2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void m12344f() {
        for (Component<?> component : this.f22485a.keySet()) {
            for (Dependency dependency : component.f22470b) {
                if (dependency.m12349a() && !this.f22487c.containsKey(dependency.f22499a)) {
                    this.f22487c.put(dependency.f22499a, new LazySet<>(Collections.emptySet()));
                } else if (this.f22486b.containsKey(dependency.f22499a)) {
                    continue;
                } else {
                    if (dependency.f22500b == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.f22499a));
                    }
                    if (!dependency.m12349a()) {
                        this.f22486b.put(dependency.f22499a, new OptionalProvider(C2064e.f22531a, C2065f.f22532b));
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final List<Runnable> m12345g(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : list) {
            if (component.m12332d()) {
                Provider<?> provider = this.f22485a.get(component);
                for (Class<? super Object> cls : component.f22469a) {
                    if (this.f22486b.containsKey(cls)) {
                        arrayList.add(new RunnableC2063d((OptionalProvider) this.f22486b.get(cls), provider, 0));
                    } else {
                        this.f22486b.put(cls, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<Runnable> m12346h() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<Component<?>, Provider<?>> entry : this.f22485a.entrySet()) {
            Component<?> key = entry.getKey();
            if (!key.m12332d()) {
                Provider<?> value = entry.getValue();
                for (Class<? super Object> cls : key.f22469a) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f22487c.containsKey(entry2.getKey())) {
                LazySet<?> lazySet = this.f22487c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC2063d(lazySet, (Provider) it.next(), 1));
                }
            } else {
                this.f22487c.put((Class) entry2.getKey(), new LazySet<>((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }
}
