package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class LazySet<T> implements Provider<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f22510b = null;

    /* renamed from: a */
    public volatile Set<Provider<T>> f22509a = Collections.newSetFromMap(new ConcurrentHashMap());

    public LazySet(Collection<Provider<T>> collection) {
        this.f22509a.addAll(collection);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        if (this.f22510b == null) {
            synchronized (this) {
                if (this.f22510b == null) {
                    this.f22510b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<Provider<T>> it = this.f22509a.iterator();
                        while (it.hasNext()) {
                            this.f22510b.add(it.next().get());
                        }
                        this.f22509a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f22510b);
    }
}
