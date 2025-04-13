package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* renamed from: a */
        public final LongAddable f20610a = LongAddables.m11317a();

        /* renamed from: b */
        public final LongAddable f20611b = LongAddables.m11317a();

        /* renamed from: c */
        public final LongAddable f20612c = LongAddables.m11317a();

        /* renamed from: d */
        public final LongAddable f20613d = LongAddables.m11317a();

        /* renamed from: e */
        public final LongAddable f20614e = LongAddables.m11317a();

        /* renamed from: f */
        public final LongAddable f20615f = LongAddables.m11317a();

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: a */
        public void mo11227a() {
            this.f20615f.mo11316b();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: b */
        public void mo11228b(int i2) {
            this.f20610a.mo11315a(i2);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: c */
        public void mo11229c(int i2) {
            this.f20611b.mo11315a(i2);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: d */
        public void mo11230d(long j2) {
            this.f20613d.mo11316b();
            this.f20614e.mo11315a(j2);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: e */
        public void mo11231e(long j2) {
            this.f20612c.mo11316b();
            this.f20614e.mo11315a(j2);
        }
    }

    public interface StatsCounter {
        /* renamed from: a */
        void mo11227a();

        /* renamed from: b */
        void mo11228b(int i2);

        /* renamed from: c */
        void mo11229c(int i2);

        /* renamed from: d */
        void mo11230d(long j2);

        /* renamed from: e */
        void mo11231e(long j2);
    }
}
