package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.mj */
/* loaded from: classes3.dex */
public abstract class AbstractC5446mj {

    /* renamed from: a */
    private static final AbstractC5446mj f52690a = new a();

    /* renamed from: b */
    private static final AbstractC5446mj f52691b = new b(-1);

    /* renamed from: c */
    private static final AbstractC5446mj f52692c = new b(1);

    /* renamed from: com.yandex.mobile.ads.impl.mj$b */
    public static final class b extends AbstractC5446mj {

        /* renamed from: d */
        public final int f52693d;

        public b(int i2) {
            super(0);
            this.f52693d = i2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26682a(int i2, int i3) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26683a(long j2, long j3) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final <T> AbstractC5446mj mo26684a(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26685a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: b */
        public final AbstractC5446mj mo26686b(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: d */
        public final int mo26687d() {
            return this.f52693d;
        }
    }

    public /* synthetic */ AbstractC5446mj(int i2) {
        this();
    }

    /* renamed from: e */
    public static AbstractC5446mj m26681e() {
        return f52690a;
    }

    /* renamed from: a */
    public abstract AbstractC5446mj mo26682a(int i2, int i3);

    /* renamed from: a */
    public abstract AbstractC5446mj mo26683a(long j2, long j3);

    /* renamed from: a */
    public abstract <T> AbstractC5446mj mo26684a(T t, T t2, Comparator<T> comparator);

    /* renamed from: a */
    public abstract AbstractC5446mj mo26685a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract AbstractC5446mj mo26686b(boolean z, boolean z2);

    /* renamed from: d */
    public abstract int mo26687d();

    /* renamed from: com.yandex.mobile.ads.impl.mj$a */
    public class a extends AbstractC5446mj {
        public a() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final <T> AbstractC5446mj mo26684a(T t, T t2, Comparator<T> comparator) {
            int compare = comparator.compare(t, t2);
            return compare < 0 ? AbstractC5446mj.f52691b : compare > 0 ? AbstractC5446mj.f52692c : AbstractC5446mj.f52690a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: b */
        public final AbstractC5446mj mo26686b(boolean z, boolean z2) {
            char c2 = z2 == z ? (char) 0 : z2 ? (char) 1 : (char) 65535;
            return c2 < 0 ? AbstractC5446mj.f52691b : c2 > 0 ? AbstractC5446mj.f52692c : AbstractC5446mj.f52690a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: d */
        public final int mo26687d() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26682a(int i2, int i3) {
            char c2 = i2 < i3 ? (char) 65535 : i2 > i3 ? (char) 1 : (char) 0;
            if (c2 < 0) {
                return AbstractC5446mj.f52691b;
            }
            return c2 > 0 ? AbstractC5446mj.f52692c : AbstractC5446mj.f52690a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26683a(long j2, long j3) {
            char c2 = j2 < j3 ? (char) 65535 : j2 > j3 ? (char) 1 : (char) 0;
            if (c2 < 0) {
                return AbstractC5446mj.f52691b;
            }
            return c2 > 0 ? AbstractC5446mj.f52692c : AbstractC5446mj.f52690a;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5446mj
        /* renamed from: a */
        public final AbstractC5446mj mo26685a(boolean z, boolean z2) {
            char c2 = z == z2 ? (char) 0 : z ? (char) 1 : (char) 65535;
            if (c2 < 0) {
                return AbstractC5446mj.f52691b;
            }
            return c2 > 0 ? AbstractC5446mj.f52692c : AbstractC5446mj.f52690a;
        }
    }

    private AbstractC5446mj() {
    }
}
