package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.c51;
import com.yandex.mobile.ads.impl.e80;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.z */
/* loaded from: classes2.dex */
public abstract class AbstractC4710z<K0, V0> {

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.z$a */
    public static final class a<V> implements c51<List<V>>, Serializable {

        /* renamed from: a */
        private final int f47926a;

        public a(int i2) {
            this.f47926a = C4682h.m22032a(i2, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.c51
        public final Object get() {
            return new ArrayList(this.f47926a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.z$b */
    public static abstract class b<K0, V0> extends AbstractC4710z<K0, V0> {
        public b() {
            super(0);
        }

        /* renamed from: b */
        public abstract <K extends K0, V extends V0> e80<K, V> mo21979b();
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.z$c */
    public static abstract class c<K0> {
        /* renamed from: a */
        public final b<K0, Object> m22083a() {
            C4682h.m22032a(2, "expectedValuesPerKey");
            return new C4669a0(this);
        }

        /* renamed from: b */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo22081b();
    }

    public /* synthetic */ AbstractC4710z(int i2) {
        this();
    }

    /* renamed from: a */
    public static c<Comparable> m22082a() {
        C4673c0 c4673c0 = C4673c0.f47821a;
        Objects.requireNonNull(c4673c0);
        return new C4709y(c4673c0);
    }

    private AbstractC4710z() {
    }
}
