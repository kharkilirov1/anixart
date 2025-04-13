package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class FactoryPools {

    /* renamed from: a */
    public static final Resetter<Object> f8855a = new Resetter<Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        /* renamed from: a */
        public void mo5355a(@NonNull Object obj) {
        }
    };

    public interface Factory<T> {
        /* renamed from: a */
        T mo5033a();
    }

    public static final class FactoryPool<T> implements Pools.Pool<T> {

        /* renamed from: a */
        public final Factory<T> f8856a;

        /* renamed from: b */
        public final Resetter<T> f8857b;

        /* renamed from: c */
        public final Pools.Pool<T> f8858c;

        public FactoryPool(@NonNull Pools.Pool<T> pool, @NonNull Factory<T> factory, @NonNull Resetter<T> resetter) {
            this.f8858c = pool;
            this.f8856a = factory;
            this.f8857b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        /* renamed from: a */
        public boolean mo2026a(@NonNull T t) {
            if (t instanceof Poolable) {
                ((Poolable) t).mo5005h().mo5357b(true);
            }
            this.f8857b.mo5355a(t);
            return this.f8858c.mo2026a(t);
        }

        @Override // androidx.core.util.Pools.Pool
        /* renamed from: b */
        public T mo2027b() {
            T mo2027b = this.f8858c.mo2027b();
            if (mo2027b == null) {
                mo2027b = this.f8856a.mo5033a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder m24u = C0000a.m24u("Created new ");
                    m24u.append(mo2027b.getClass());
                    Log.v("FactoryPools", m24u.toString());
                }
            }
            if (mo2027b instanceof Poolable) {
                mo2027b.mo5005h().mo5357b(false);
            }
            return (T) mo2027b;
        }
    }

    public interface Poolable {
        @NonNull
        /* renamed from: h */
        StateVerifier mo5005h();
    }

    public interface Resetter<T> {
        /* renamed from: a */
        void mo5355a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    public static <T extends Poolable> Pools.Pool<T> m5353a(int i2, @NonNull Factory<T> factory) {
        return new FactoryPool(new Pools.SynchronizedPool(i2), factory, f8855a);
    }

    @NonNull
    /* renamed from: b */
    public static <T> Pools.Pool<List<T>> m5354b() {
        return new FactoryPool(new Pools.SynchronizedPool(20), new Factory<List<Object>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            @NonNull
            /* renamed from: a */
            public List<Object> mo5033a() {
                return new ArrayList();
            }
        }, new Resetter<List<Object>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            /* renamed from: a */
            public void mo5355a(@NonNull List<Object> list) {
                list.clear();
            }
        });
    }
}
