package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.yandex.mobile.ads.impl.vg0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g */
/* loaded from: classes2.dex */
abstract class AbstractC4680g<K, V> implements vg0<K, V> {

    /* renamed from: a */
    @CheckForNull
    @LazyInit
    private transient Set<K> f47857a;

    /* renamed from: b */
    @CheckForNull
    @LazyInit
    private transient Collection<V> f47858b;

    /* renamed from: c */
    @CheckForNull
    @LazyInit
    private transient Map<K, Collection<V>> f47859c;

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g$a */
    public class a extends AbstractCollection<V> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4680g f47860a;

        public a(AbstractC4676e abstractC4676e) {
            this.f47860a = abstractC4676e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractC4676e) this.f47860a).m21996d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            Iterator<Collection<V>> it = this.f47860a.mo21982a().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            AbstractC4676e abstractC4676e = (AbstractC4676e) this.f47860a;
            Objects.requireNonNull(abstractC4676e);
            return new C4674d(abstractC4676e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractC4676e) this.f47860a).m21999g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.vg0
    /* renamed from: a */
    public Map<K, Collection<V>> mo21982a() {
        Map<K, Collection<V>> map = this.f47859c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> m21997e = ((C4671b0) this).m21997e();
        this.f47859c = m21997e;
        return m21997e;
    }

    /* renamed from: b */
    public final Set<K> m22019b() {
        Set<K> set = this.f47857a;
        if (set != null) {
            return set;
        }
        Set<K> m21998f = ((C4671b0) this).m21998f();
        this.f47857a = m21998f;
        return m21998f;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vg0) {
            return ((AbstractC4672c) this).mo21982a().equals(((vg0) obj).mo21982a());
        }
        return false;
    }

    public final int hashCode() {
        return mo21982a().hashCode();
    }

    public final String toString() {
        return mo21982a().toString();
    }

    @Override // com.yandex.mobile.ads.impl.vg0
    public Collection<V> values() {
        Collection<V> collection = this.f47858b;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((AbstractC4676e) this);
        this.f47858b = aVar;
        return aVar;
    }
}
