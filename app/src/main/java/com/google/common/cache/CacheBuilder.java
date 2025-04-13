package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class CacheBuilder<K, V> {

    /* renamed from: c */
    public static final Supplier<? extends AbstractCache.StatsCounter> f20616c = Suppliers.m11219a(new AbstractCache.StatsCounter() { // from class: com.google.common.cache.CacheBuilder.1
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: a */
        public void mo11227a() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: b */
        public void mo11228b(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: c */
        public void mo11229c(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: d */
        public void mo11230d(long j2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        /* renamed from: e */
        public void mo11231e(long j2) {
        }
    });

    /* renamed from: d */
    public static final Ticker f20617d;

    /* renamed from: a */
    @NullableDecl
    public LocalCache.Strength f20618a;

    /* renamed from: b */
    public Supplier<? extends AbstractCache.StatsCounter> f20619b = f20616c;

    /* renamed from: com.google.common.cache.CacheBuilder$2 */
    public class C15812 implements Supplier<AbstractCache.StatsCounter> {
        @Override // com.google.common.base.Supplier
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    }

    public enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        /* renamed from: a */
        public void mo11234a(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        /* renamed from: a */
        public int mo11235a(Object obj, Object obj2) {
            return 1;
        }
    }

    static {
        new CacheStats(0L, 0L, 0L, 0L, 0L, 0L);
        f20617d = new Ticker() { // from class: com.google.common.cache.CacheBuilder.3
            @Override // com.google.common.base.Ticker
            /* renamed from: a */
            public long mo11226a() {
                return 0L;
            }
        };
        Logger.getLogger(CacheBuilder.class.getName());
    }

    @CheckReturnValue
    /* renamed from: a */
    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> m11232a(CacheLoader<? super K1, V1> cacheLoader) {
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    @GwtIncompatible
    /* renamed from: b */
    public CacheBuilder<K, V> m11233b() {
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        LocalCache.Strength strength2 = this.f20618a;
        Preconditions.m11194r(strength2 == null, "Key strength was already set to %s", strength2);
        this.f20618a = strength;
        return this;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        LocalCache.Strength strength = this.f20618a;
        if (strength != null) {
            m11166b.m11171e("keyStrength", Ascii.m11123c(strength.toString()));
        }
        return m11166b.toString();
    }
}
