package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class RestrictedComponentContainer extends AbstractComponentContainer {

    /* renamed from: a */
    public final Set<Class<?>> f22514a;

    /* renamed from: b */
    public final Set<Class<?>> f22515b;

    /* renamed from: c */
    public final Set<Class<?>> f22516c;

    /* renamed from: d */
    public final Set<Class<?>> f22517d;

    /* renamed from: e */
    public final Set<Class<?>> f22518e;

    /* renamed from: f */
    public final Set<Class<?>> f22519f;

    /* renamed from: g */
    public final ComponentContainer f22520g;

    public static class RestrictedPublisher implements Publisher {

        /* renamed from: a */
        public final Publisher f22521a;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.f22521a = publisher;
        }
    }

    public RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.f22470b) {
            int i2 = dependency.f22501c;
            if (!(i2 == 0)) {
                if (i2 == 2) {
                    hashSet3.add(dependency.f22499a);
                } else if (dependency.m12349a()) {
                    hashSet5.add(dependency.f22499a);
                } else {
                    hashSet2.add(dependency.f22499a);
                }
            } else if (dependency.m12349a()) {
                hashSet4.add(dependency.f22499a);
            } else {
                hashSet.add(dependency.f22499a);
            }
        }
        if (!component.f22474f.isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.f22514a = Collections.unmodifiableSet(hashSet);
        this.f22515b = Collections.unmodifiableSet(hashSet2);
        this.f22516c = Collections.unmodifiableSet(hashSet3);
        this.f22517d = Collections.unmodifiableSet(hashSet4);
        this.f22518e = Collections.unmodifiableSet(hashSet5);
        this.f22519f = component.f22474f;
        this.f22520g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: a */
    public <T> Provider<T> mo12337a(Class<T> cls) {
        if (this.f22515b.contains(cls)) {
            return this.f22520g.mo12337a(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: b */
    public <T> Provider<Set<T>> mo12338b(Class<T> cls) {
        if (this.f22518e.contains(cls)) {
            return this.f22520g.mo12338b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    /* renamed from: c */
    public <T> Set<T> mo12327c(Class<T> cls) {
        if (this.f22517d.contains(cls)) {
            return this.f22520g.mo12327c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: d */
    public <T> Deferred<T> mo12339d(Class<T> cls) {
        if (this.f22516c.contains(cls)) {
            return this.f22520g.mo12339d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        if (!this.f22514a.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f22520g.get(cls);
        return !cls.equals(Publisher.class) ? t : (T) new RestrictedPublisher(this.f22519f, (Publisher) t);
    }
}
