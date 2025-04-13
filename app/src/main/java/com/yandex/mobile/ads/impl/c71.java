package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public class c71 implements InterfaceC5589pf {

    /* renamed from: A */
    public static final c71 f49120A = new c71(new C4907a());

    /* renamed from: a */
    public final int f49121a;

    /* renamed from: b */
    public final int f49122b;

    /* renamed from: c */
    public final int f49123c;

    /* renamed from: d */
    public final int f49124d;

    /* renamed from: e */
    public final int f49125e;

    /* renamed from: f */
    public final int f49126f;

    /* renamed from: g */
    public final int f49127g;

    /* renamed from: h */
    public final int f49128h;

    /* renamed from: i */
    public final int f49129i;

    /* renamed from: j */
    public final int f49130j;

    /* renamed from: k */
    public final boolean f49131k;

    /* renamed from: l */
    public final AbstractC4698p<String> f49132l;

    /* renamed from: m */
    public final int f49133m;

    /* renamed from: n */
    public final AbstractC4698p<String> f49134n;

    /* renamed from: o */
    public final int f49135o;

    /* renamed from: p */
    public final int f49136p;

    /* renamed from: q */
    public final int f49137q;

    /* renamed from: r */
    public final AbstractC4698p<String> f49138r;

    /* renamed from: s */
    public final AbstractC4698p<String> f49139s;

    /* renamed from: t */
    public final int f49140t;

    /* renamed from: u */
    public final int f49141u;

    /* renamed from: v */
    public final boolean f49142v;

    /* renamed from: w */
    public final boolean f49143w;

    /* renamed from: x */
    public final boolean f49144x;

    /* renamed from: y */
    public final AbstractC4700q<w61, b71> f49145y;

    /* renamed from: z */
    public final AbstractC4702r<Integer> f49146z;

    /* renamed from: com.yandex.mobile.ads.impl.c71$a */
    public static class C4907a {

        /* renamed from: a */
        private int f49147a;

        /* renamed from: b */
        private int f49148b;

        /* renamed from: c */
        private int f49149c;

        /* renamed from: d */
        private int f49150d;

        /* renamed from: e */
        private int f49151e;

        /* renamed from: f */
        private int f49152f;

        /* renamed from: g */
        private int f49153g;

        /* renamed from: h */
        private int f49154h;

        /* renamed from: i */
        private int f49155i;

        /* renamed from: j */
        private int f49156j;

        /* renamed from: k */
        private boolean f49157k;

        /* renamed from: l */
        private AbstractC4698p<String> f49158l;

        /* renamed from: m */
        private int f49159m;

        /* renamed from: n */
        private AbstractC4698p<String> f49160n;

        /* renamed from: o */
        private int f49161o;

        /* renamed from: p */
        private int f49162p;

        /* renamed from: q */
        private int f49163q;

        /* renamed from: r */
        private AbstractC4698p<String> f49164r;

        /* renamed from: s */
        private AbstractC4698p<String> f49165s;

        /* renamed from: t */
        private int f49166t;

        /* renamed from: u */
        private int f49167u;

        /* renamed from: v */
        private boolean f49168v;

        /* renamed from: w */
        private boolean f49169w;

        /* renamed from: x */
        private boolean f49170x;

        /* renamed from: y */
        private HashMap<w61, b71> f49171y;

        /* renamed from: z */
        private HashSet<Integer> f49172z;

        @Deprecated
        public C4907a() {
            this.f49147a = Integer.MAX_VALUE;
            this.f49148b = Integer.MAX_VALUE;
            this.f49149c = Integer.MAX_VALUE;
            this.f49150d = Integer.MAX_VALUE;
            this.f49155i = Integer.MAX_VALUE;
            this.f49156j = Integer.MAX_VALUE;
            this.f49157k = true;
            this.f49158l = AbstractC4698p.m22055i();
            this.f49159m = 0;
            this.f49160n = AbstractC4698p.m22055i();
            this.f49161o = 0;
            this.f49162p = Integer.MAX_VALUE;
            this.f49163q = Integer.MAX_VALUE;
            this.f49164r = AbstractC4698p.m22055i();
            this.f49165s = AbstractC4698p.m22055i();
            this.f49166t = 0;
            this.f49167u = 0;
            this.f49168v = false;
            this.f49169w = false;
            this.f49170x = false;
            this.f49171y = new HashMap<>();
            this.f49172z = new HashSet<>();
        }

        /* renamed from: a */
        public C4907a mo23065a(int i2, int i3) {
            this.f49155i = i2;
            this.f49156j = i3;
            this.f49157k = true;
            return this;
        }

        /* renamed from: b */
        public void mo23067b(Context context) {
            Point m28126c = s91.m28126c(context);
            mo23065a(m28126c.x, m28126c.y);
        }

        /* renamed from: a */
        public void mo23066a(Context context) {
            CaptioningManager captioningManager;
            int i2 = s91.f54530a;
            if (i2 >= 19) {
                if ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f49166t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f49165s = AbstractC4698p.m22048a(s91.m28102a(locale));
                    }
                }
            }
        }

        /* renamed from: a */
        private static AbstractC4698p<String> m23039a(String[] strArr) {
            int i2 = AbstractC4698p.f47900c;
            AbstractC4698p.a aVar = new AbstractC4698p.a();
            for (String str : strArr) {
                Objects.requireNonNull(str);
                aVar.m22060b(s91.m28130d(str));
            }
            return aVar.m22058a();
        }

        public C4907a(Context context) {
            this();
            mo23066a(context);
            mo23067b(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
        public C4907a(Bundle bundle) {
            AbstractC4698p m27717a;
            String m23037a = c71.m23037a(6);
            c71 c71Var = c71.f49120A;
            this.f49147a = bundle.getInt(m23037a, c71Var.f49121a);
            this.f49148b = bundle.getInt(c71.m23037a(7), c71Var.f49122b);
            this.f49149c = bundle.getInt(c71.m23037a(8), c71Var.f49123c);
            this.f49150d = bundle.getInt(c71.m23037a(9), c71Var.f49124d);
            this.f49151e = bundle.getInt(c71.m23037a(10), c71Var.f49125e);
            this.f49152f = bundle.getInt(c71.m23037a(11), c71Var.f49126f);
            this.f49153g = bundle.getInt(c71.m23037a(12), c71Var.f49127g);
            this.f49154h = bundle.getInt(c71.m23037a(13), c71Var.f49128h);
            this.f49155i = bundle.getInt(c71.m23037a(14), c71Var.f49129i);
            this.f49156j = bundle.getInt(c71.m23037a(15), c71Var.f49130j);
            this.f49157k = bundle.getBoolean(c71.m23037a(16), c71Var.f49131k);
            this.f49158l = AbstractC4698p.m22053b((String[]) ye0.m29921a(bundle.getStringArray(c71.m23037a(17)), new String[0]));
            this.f49159m = bundle.getInt(c71.m23037a(25), c71Var.f49133m);
            this.f49160n = m23039a((String[]) ye0.m29921a(bundle.getStringArray(c71.m23037a(1)), new String[0]));
            this.f49161o = bundle.getInt(c71.m23037a(2), c71Var.f49135o);
            this.f49162p = bundle.getInt(c71.m23037a(18), c71Var.f49136p);
            this.f49163q = bundle.getInt(c71.m23037a(19), c71Var.f49137q);
            this.f49164r = AbstractC4698p.m22053b((String[]) ye0.m29921a(bundle.getStringArray(c71.m23037a(20)), new String[0]));
            this.f49165s = m23039a((String[]) ye0.m29921a(bundle.getStringArray(c71.m23037a(3)), new String[0]));
            this.f49166t = bundle.getInt(c71.m23037a(4), c71Var.f49140t);
            this.f49167u = bundle.getInt(c71.m23037a(26), c71Var.f49141u);
            this.f49168v = bundle.getBoolean(c71.m23037a(5), c71Var.f49142v);
            this.f49169w = bundle.getBoolean(c71.m23037a(21), c71Var.f49143w);
            this.f49170x = bundle.getBoolean(c71.m23037a(22), c71Var.f49144x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(c71.m23037a(23));
            if (parcelableArrayList == null) {
                m27717a = AbstractC4698p.m22055i();
            } else {
                m27717a = C5637qf.m27717a(b71.f48792c, parcelableArrayList);
            }
            this.f49171y = new HashMap<>();
            for (int i2 = 0; i2 < m27717a.size(); i2++) {
                b71 b71Var = (b71) m27717a.get(i2);
                this.f49171y.put(b71Var.f48793a, b71Var);
            }
            int[] iArr = (int[]) ye0.m29921a(bundle.getIntArray(c71.m23037a(24)), new int[0]);
            this.f49172z = new HashSet<>();
            for (int i3 : iArr) {
                this.f49172z.add(Integer.valueOf(i3));
            }
        }
    }

    static {
        dn1 dn1Var = dn1.f49704o;
    }

    public c71(C4907a c4907a) {
        this.f49121a = c4907a.f49147a;
        this.f49122b = c4907a.f49148b;
        this.f49123c = c4907a.f49149c;
        this.f49124d = c4907a.f49150d;
        this.f49125e = c4907a.f49151e;
        this.f49126f = c4907a.f49152f;
        this.f49127g = c4907a.f49153g;
        this.f49128h = c4907a.f49154h;
        this.f49129i = c4907a.f49155i;
        this.f49130j = c4907a.f49156j;
        this.f49131k = c4907a.f49157k;
        this.f49132l = c4907a.f49158l;
        this.f49133m = c4907a.f49159m;
        this.f49134n = c4907a.f49160n;
        this.f49135o = c4907a.f49161o;
        this.f49136p = c4907a.f49162p;
        this.f49137q = c4907a.f49163q;
        this.f49138r = c4907a.f49164r;
        this.f49139s = c4907a.f49165s;
        this.f49140t = c4907a.f49166t;
        this.f49141u = c4907a.f49167u;
        this.f49142v = c4907a.f49168v;
        this.f49143w = c4907a.f49169w;
        this.f49144x = c4907a.f49170x;
        this.f49145y = AbstractC4700q.m22062a(c4907a.f49171y);
        this.f49146z = AbstractC4702r.m22073a(c4907a.f49172z);
    }

    /* renamed from: a */
    public static c71 m23036a(Bundle bundle) {
        return new c71(new C4907a(bundle));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c71 c71Var = (c71) obj;
        return this.f49121a == c71Var.f49121a && this.f49122b == c71Var.f49122b && this.f49123c == c71Var.f49123c && this.f49124d == c71Var.f49124d && this.f49125e == c71Var.f49125e && this.f49126f == c71Var.f49126f && this.f49127g == c71Var.f49127g && this.f49128h == c71Var.f49128h && this.f49131k == c71Var.f49131k && this.f49129i == c71Var.f49129i && this.f49130j == c71Var.f49130j && this.f49132l.equals(c71Var.f49132l) && this.f49133m == c71Var.f49133m && this.f49134n.equals(c71Var.f49134n) && this.f49135o == c71Var.f49135o && this.f49136p == c71Var.f49136p && this.f49137q == c71Var.f49137q && this.f49138r.equals(c71Var.f49138r) && this.f49139s.equals(c71Var.f49139s) && this.f49140t == c71Var.f49140t && this.f49141u == c71Var.f49141u && this.f49142v == c71Var.f49142v && this.f49143w == c71Var.f49143w && this.f49144x == c71Var.f49144x && this.f49145y.equals(c71Var.f49145y) && this.f49146z.equals(c71Var.f49146z);
    }

    public int hashCode() {
        return this.f49146z.hashCode() + ((this.f49145y.hashCode() + ((((((((((((this.f49139s.hashCode() + ((this.f49138r.hashCode() + ((((((((this.f49134n.hashCode() + ((((this.f49132l.hashCode() + ((((((((((((((((((((((this.f49121a + 31) * 31) + this.f49122b) * 31) + this.f49123c) * 31) + this.f49124d) * 31) + this.f49125e) * 31) + this.f49126f) * 31) + this.f49127g) * 31) + this.f49128h) * 31) + (this.f49131k ? 1 : 0)) * 31) + this.f49129i) * 31) + this.f49130j) * 31)) * 31) + this.f49133m) * 31)) * 31) + this.f49135o) * 31) + this.f49136p) * 31) + this.f49137q) * 31)) * 31)) * 31) + this.f49140t) * 31) + this.f49141u) * 31) + (this.f49142v ? 1 : 0)) * 31) + (this.f49143w ? 1 : 0)) * 31) + (this.f49144x ? 1 : 0)) * 31)) * 31);
    }

    /* renamed from: a */
    public static String m23037a(int i2) {
        return Integer.toString(i2, 36);
    }
}
