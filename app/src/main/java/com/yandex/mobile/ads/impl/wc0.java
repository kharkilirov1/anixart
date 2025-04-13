package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.mediation.base.C6164a;
import com.yandex.mobile.ads.mediation.base.C6165b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class wc0<T extends C6164a, L> {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f56102a;

    /* renamed from: b */
    @NonNull
    private final C5724s3 f56103b;

    /* renamed from: c */
    @NonNull
    private final zc0<T, L> f56104c;

    /* renamed from: d */
    @NonNull
    private final ed0 f56105d;

    /* renamed from: e */
    @NonNull
    private final xc0<T> f56106e;

    /* renamed from: f */
    @NonNull
    private final C6165b f56107f = new C6165b();

    /* renamed from: g */
    @NonNull
    private final hp0 f56108g;

    /* renamed from: h */
    @Nullable
    private vc0<T> f56109h;

    public wc0(@NonNull C5101g2 c5101g2, @NonNull C5724s3 c5724s3, @NonNull zc0<T, L> zc0Var, @NonNull ed0 ed0Var, @NonNull xc0<T> xc0Var, @NonNull hp0 hp0Var) {
        this.f56102a = c5101g2;
        this.f56103b = c5724s3;
        this.f56104c = zc0Var;
        this.f56108g = hp0Var;
        this.f56106e = xc0Var;
        this.f56105d = ed0Var;
    }

    /* renamed from: a */
    public final void m29457a(@NonNull Context context) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            try {
                this.f56104c.mo30149a(vc0Var.m29212a());
            } catch (Throwable th) {
                qd0 m29214b = this.f56109h.m29214b();
                n60.m26808a(th, th.toString(), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("exception_in_adapter", th.toString());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", hashMap);
                this.f56105d.m24119a(context, m29214b, hashMap2);
            }
        }
    }

    /* renamed from: b */
    public final void m29465b(@NonNull Context context, @NonNull HashMap hashMap) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            qd0 m29214b = vc0Var.m29214b();
            List<String> m27679f = m29214b.m27679f();
            if (m27679f != null) {
                Iterator<String> it = m27679f.iterator();
                while (it.hasNext()) {
                    new C4957d6(context, this.f56102a).m23816a(it.next());
                }
            }
            this.f56105d.m24124c(context, m29214b, hashMap);
        }
    }

    /* renamed from: c */
    public final void m29469c(@NonNull Context context, @NonNull HashMap hashMap) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            List<String> m27675b = vc0Var.m29214b().m27675b();
            C4957d6 c4957d6 = new C4957d6(context, this.f56102a);
            if (m27675b != null) {
                Iterator<String> it = m27675b.iterator();
                while (it.hasNext()) {
                    c4957d6.m23816a(it.next());
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(hashMap);
        hashMap2.put("status", "success");
        vc0<T> vc0Var2 = this.f56109h;
        if (vc0Var2 != null) {
            T m29212a = vc0Var2.m29212a();
            Objects.requireNonNull(this.f56107f);
            hashMap2.putAll(C6165b.m30417a(m29212a));
            this.f56105d.m24126e(context, this.f56109h.m29214b(), hashMap2);
        }
    }

    /* renamed from: b */
    public final void m29463b(@NonNull Context context) {
        if (this.f56109h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "success");
            this.f56105d.m24125d(context, this.f56109h.m29214b(), hashMap);
        }
    }

    @Nullable
    /* renamed from: a */
    public final vc0 m29456a() {
        return this.f56109h;
    }

    /* renamed from: a */
    public final void m29460a(@NonNull Context context, @NonNull L l2) {
        vc0<T> mo29736a = this.f56106e.mo29736a(context);
        this.f56109h = mo29736a;
        if (mo29736a != null) {
            this.f56103b.m28055b(EnumC5668r3.f54168a);
            qd0 m29214b = this.f56109h.m29214b();
            this.f56105d.m24121b(context, m29214b);
            try {
                this.f56104c.mo30148a(context, this.f56109h.m29212a(), l2, this.f56109h.m29213a(context), this.f56109h.m29215c());
                return;
            } catch (Throwable th) {
                n60.m26808a(th, th.toString(), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("exception_in_adapter", th.toString());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", hashMap);
                this.f56105d.m24119a(context, m29214b, hashMap2);
                vc0<T> vc0Var = this.f56109h;
                this.f56103b.m28053a(new C5783t6(sv0.EnumC5765c.f54861c, vc0Var != null ? vc0Var.m29214b().m27676c() : null));
                m29460a(context, (Context) l2);
                return;
            }
        }
        this.f56108g.m25354a();
    }

    /* renamed from: b */
    public final void m29466b(@NonNull Context context, @NonNull Map<String, Object> map) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            this.f56105d.m24120a(context, vc0Var.m29214b(), map);
        }
    }

    /* renamed from: b */
    public final void m29464b(@NonNull Context context, @NonNull C5563p2 c5563p2, @NonNull L l2) {
        vc0<T> vc0Var = this.f56109h;
        this.f56103b.m28053a(new C5783t6(sv0.EnumC5765c.f54861c, vc0Var != null ? vc0Var.m29214b().m27676c() : null));
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("error_code", Integer.valueOf(c5563p2.m27144a()));
        hashMap.put("error_description", c5563p2.m27145b());
        vc0<T> vc0Var2 = this.f56109h;
        if (vc0Var2 != null) {
            T m29212a = vc0Var2.m29212a();
            Objects.requireNonNull(this.f56107f);
            hashMap.putAll(C6165b.m30417a(m29212a));
            this.f56105d.m24126e(context, this.f56109h.m29214b(), hashMap);
        }
        m29457a(context);
        m29460a(context, (Context) l2);
    }

    /* renamed from: c */
    public final void m29468c(@NonNull Context context) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            this.f56105d.m24117a(context, vc0Var.m29214b());
        }
    }

    /* renamed from: a */
    public final void m29461a(@NonNull Context context, @NonNull HashMap hashMap) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            qd0 m29214b = vc0Var.m29214b();
            List<String> m27678e = m29214b.m27678e();
            if (m27678e != null) {
                Iterator<String> it = m27678e.iterator();
                while (it.hasNext()) {
                    new C4957d6(context, this.f56102a).m23816a(it.next());
                }
            }
            HashMap hashMap2 = new HashMap(hashMap);
            hashMap2.put("click_type", "default");
            this.f56105d.m24122b(context, m29214b, hashMap2);
        }
    }

    /* renamed from: b */
    public final boolean m29467b() {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            return vc0Var.m29212a().shouldTrackImpressionAutomatically();
        }
        return true;
    }

    /* renamed from: a */
    public final void m29462a(@NonNull Context context, @NonNull Map<String, Object> map) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            this.f56105d.m24123b(context, vc0Var.m29214b(), map);
        }
    }

    /* renamed from: a */
    public final void m29459a(@NonNull Context context, @NonNull C5563p2 c5563p2, @NonNull L l2) {
        if (this.f56109h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "error");
            hashMap.put("error_code", Integer.valueOf(c5563p2.m27144a()));
            this.f56105d.m24125d(context, this.f56109h.m29214b(), hashMap);
        }
        m29457a(context);
        m29460a(context, (Context) l2);
    }

    /* renamed from: a */
    public final void m29458a(@NonNull Context context, @Nullable AdResponse<String> adResponse) {
        vc0<T> vc0Var = this.f56109h;
        if (vc0Var != null) {
            this.f56105d.m24118a(context, vc0Var.m29214b(), adResponse);
        }
    }
}
