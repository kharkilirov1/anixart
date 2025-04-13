package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zl1 {

    /* renamed from: a */
    private final HashMap<View, String> f57234a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C6129a> f57235b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f57236c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f57237d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f57238e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f57239f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f57240g = new HashMap<>();

    /* renamed from: h */
    private final WeakHashMap f57241h = new WeakHashMap();

    /* renamed from: i */
    private boolean f57242i;

    /* renamed from: com.yandex.mobile.ads.impl.zl1$a */
    public static class C6129a {

        /* renamed from: a */
        private final lm1 f57243a;

        /* renamed from: b */
        private final ArrayList<String> f57244b = new ArrayList<>();

        public C6129a(lm1 lm1Var, String str) {
            this.f57243a = lm1Var;
            m30228a(str);
        }

        /* renamed from: a */
        public final lm1 m30227a() {
            return this.f57243a;
        }

        /* renamed from: a */
        public final void m30228a(String str) {
            this.f57244b.add(str);
        }

        /* renamed from: b */
        public final ArrayList<String> m30229b() {
            return this.f57244b;
        }
    }

    /* renamed from: a */
    public final String m30216a(View view) {
        if (this.f57234a.size() == 0) {
            return null;
        }
        String str = this.f57234a.get(view);
        if (str != null) {
            this.f57234a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public final String m30217a(String str) {
        return this.f57240g.get(str);
    }

    /* renamed from: a */
    public final HashSet<String> m30218a() {
        return this.f57238e;
    }

    /* renamed from: b */
    public final View m30219b(String str) {
        return this.f57236c.get(str);
    }

    /* renamed from: b */
    public final C6129a m30220b(View view) {
        C6129a c6129a = this.f57235b.get(view);
        if (c6129a != null) {
            this.f57235b.remove(view);
        }
        return c6129a;
    }

    /* renamed from: b */
    public final HashSet<String> m30221b() {
        return this.f57239f;
    }

    /* renamed from: c */
    public final int m30222c(View view) {
        if (this.f57237d.contains(view)) {
            return 1;
        }
        return this.f57242i ? 2 : 3;
    }

    /* renamed from: c */
    public final void m30223c() {
        Boolean bool;
        ul1 m29042a = ul1.m29042a();
        if (m29042a != null) {
            for (tl1 tl1Var : m29042a.m29046c()) {
                View m28678e = tl1Var.m28678e();
                if (tl1Var.m28679f()) {
                    String m28681h = tl1Var.m28681h();
                    if (m28678e != null) {
                        String str = null;
                        if (m28678e.isAttachedToWindow()) {
                            if (m28678e.hasWindowFocus()) {
                                this.f57241h.remove(m28678e);
                                bool = Boolean.FALSE;
                            } else if (this.f57241h.containsKey(m28678e)) {
                                bool = (Boolean) this.f57241h.get(m28678e);
                            } else {
                                WeakHashMap weakHashMap = this.f57241h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(m28678e, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = m28678e;
                                while (true) {
                                    if (view == null) {
                                        this.f57237d.addAll(hashSet);
                                        break;
                                    }
                                    String m22557c = an1.m22557c(view);
                                    if (m22557c != null) {
                                        str = m22557c;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f57238e.add(m28681h);
                            this.f57234a.put(m28678e, m28681h);
                            Iterator it = tl1Var.m28676c().iterator();
                            while (it.hasNext()) {
                                lm1 lm1Var = (lm1) it.next();
                                View view2 = lm1Var.m26499a().get();
                                if (view2 != null) {
                                    C6129a c6129a = this.f57235b.get(view2);
                                    if (c6129a != null) {
                                        c6129a.m30228a(tl1Var.m28681h());
                                    } else {
                                        this.f57235b.put(view2, new C6129a(lm1Var, tl1Var.m28681h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f57239f.add(m28681h);
                            this.f57236c.put(m28681h, m28678e);
                            this.f57240g.put(m28681h, str);
                        }
                    } else {
                        this.f57239f.add(m28681h);
                        this.f57240g.put(m28681h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m30224d() {
        this.f57234a.clear();
        this.f57235b.clear();
        this.f57236c.clear();
        this.f57237d.clear();
        this.f57238e.clear();
        this.f57239f.clear();
        this.f57240g.clear();
        this.f57242i = false;
    }

    /* renamed from: d */
    public final boolean m30225d(View view) {
        if (!this.f57241h.containsKey(view)) {
            return true;
        }
        this.f57241h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: e */
    public final void m30226e() {
        this.f57242i = true;
    }
}
