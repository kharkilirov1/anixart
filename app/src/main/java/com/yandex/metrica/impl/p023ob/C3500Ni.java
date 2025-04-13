package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Ni */
/* loaded from: classes2.dex */
public class C3500Ni {

    /* renamed from: a */
    private final Set<String> f43506a;

    /* renamed from: b */
    private final Map<String, C3963g1> f43507b;

    /* renamed from: c */
    private List<String> f43508c;

    /* renamed from: d */
    private Map<String, String> f43509d;

    /* renamed from: e */
    private long f43510e;

    /* renamed from: f */
    private boolean f43511f;

    /* renamed from: g */
    @Nullable
    private C3378Il f43512g;

    /* renamed from: h */
    @NonNull
    private C3741Xa f43513h;

    /* renamed from: i */
    private long f43514i;

    /* renamed from: j */
    @NonNull
    private final List<InterfaceC3403Jl> f43515j;

    /* renamed from: k */
    private final C3291F9 f43516k;

    /* renamed from: l */
    @NonNull
    private final C4266ri f43517l;

    /* renamed from: m */
    @NonNull
    private final C4318ti f43518m;

    /* renamed from: n */
    @NonNull
    private final C4396wi f43519n;

    public C3500Ni(@NonNull Context context, @NonNull C3291F9 c3291f9) {
        this(c3291f9, new C4162ni(), new C4266ri(), C3301Fj.m18110a(context).m18111a(context, new C3376Ij(c3291f9)), new C4318ti(), new C4396wi(), new C4370vi());
    }

    /* renamed from: b */
    private void m18620b(@NonNull String str, @Nullable C3963g1 c3963g1) {
        if (m18619a(c3963g1)) {
            return;
        }
        this.f43507b.put(str, c3963g1);
    }

    /* renamed from: h */
    private void m18622h() {
        this.f43516k.m18069i(this.f43507b.get("yandex_mobile_metrica_uuid")).m18056e(this.f43507b.get("yandex_mobile_metrica_device_id")).m18053d(this.f43507b.get("appmetrica_device_id_hash")).m18040a(this.f43507b.get("yandex_mobile_metrica_get_ad_url")).m18046b(this.f43507b.get("yandex_mobile_metrica_report_ad_url")).m18066h(this.f43510e).m18067h(this.f43507b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).m18087q(C4452ym.m21262c(this.f43509d)).m18038a(this.f43512g).m18039a(this.f43513h).m18059f(this.f43507b.get("yandex_mobile_metrica_google_adv_id")).m18063g(this.f43507b.get("yandex_mobile_metrica_huawei_oaid")).m18072j(this.f43507b.get("yandex_mobile_metrica_yandex_adv_id")).m18054d(this.f43511f).m18050c(this.f43518m.m20834a()).m18062g(this.f43514i).m18041a(this.f43519n.m21112a()).m18227c();
    }

    /* renamed from: a */
    public void m18627a(@Nullable Map<String, String> map) {
        if (C3658U2.m19218b(map) || C3658U2.m19213a(map, this.f43509d)) {
            return;
        }
        this.f43509d = new HashMap(map);
        this.f43511f = true;
        m18622h();
    }

    @Nullable
    /* renamed from: c */
    public String m18632c() {
        C3963g1 c3963g1 = this.f43507b.get("yandex_mobile_metrica_device_id");
        if (c3963g1 == null) {
            return null;
        }
        return c3963g1.f45155a;
    }

    @NonNull
    /* renamed from: d */
    public C3741Xa m18633d() {
        return this.f43513h;
    }

    /* renamed from: e */
    public long m18634e() {
        return this.f43510e;
    }

    /* renamed from: f */
    public C3378Il m18635f() {
        return this.f43512g;
    }

    @Nullable
    /* renamed from: g */
    public String m18636g() {
        C3963g1 c3963g1 = this.f43507b.get("yandex_mobile_metrica_uuid");
        if (c3963g1 == null) {
            return null;
        }
        return c3963g1.f45155a;
    }

    /* renamed from: b */
    private boolean m18621b(@Nullable C3963g1 c3963g1) {
        return c3963g1 == null || TextUtils.isEmpty(c3963g1.f45155a);
    }

    @VisibleForTesting
    public C3500Ni(@NonNull C3291F9 c3291f9, @NonNull C4162ni c4162ni, @NonNull C4266ri c4266ri, @NonNull C3276Ej c3276Ej, @NonNull C4318ti c4318ti, @NonNull C4396wi c4396wi, @NonNull C4370vi c4370vi) {
        HashSet hashSet = new HashSet();
        this.f43506a = hashSet;
        this.f43507b = new HashMap();
        this.f43515j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f43516k = c3291f9;
        this.f43517l = c4266ri;
        this.f43518m = c4318ti;
        this.f43519n = c4396wi;
        m18618a("yandex_mobile_metrica_uuid", c3276Ej.m18014a());
        m18618a("yandex_mobile_metrica_device_id", c3291f9.m18075k());
        m18618a("appmetrica_device_id_hash", c3291f9.m18073j());
        m18618a("yandex_mobile_metrica_get_ad_url", c3291f9.m18057e());
        m18618a("yandex_mobile_metrica_report_ad_url", c3291f9.m18060f());
        m18620b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, c3291f9.m18088q());
        m18618a("yandex_mobile_metrica_google_adv_id", c3291f9.m18082n());
        m18618a("yandex_mobile_metrica_huawei_oaid", c3291f9.m18084o());
        m18618a("yandex_mobile_metrica_yandex_adv_id", c3291f9.m18094u());
        c4318ti.m20835a(c3291f9.m18070i());
        c4396wi.m21113a(c3291f9.m18079m());
        this.f43508c = c3291f9.m18068h();
        String m18074j = c3291f9.m18074j((String) null);
        this.f43509d = m18074j != null ? C4452ym.m21241a(m18074j) : null;
        this.f43511f = c3291f9.m18048b(true);
        this.f43510e = c3291f9.m18052d(0L);
        this.f43512g = c3291f9.m18092s();
        this.f43513h = c3291f9.m18077l();
        this.f43514i = c3291f9.m18085p();
        m18622h();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m18631b(@androidx.annotation.NonNull java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Collection r0 = com.yandex.metrica.impl.p023ob.C3525Oi.m18681a(r7)     // Catch: java.lang.Throwable -> L56
            boolean r0 = r6.m18629a(r0)     // Catch: java.lang.Throwable -> L56
            r1 = 1
            r0 = r0 ^ r1
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L53
        L10:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L53
            r3 = 0
            if (r2 == 0) goto L28
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L53
            java.util.Set<java.lang.String> r4 = r6.f43506a     // Catch: java.lang.Throwable -> L53
            boolean r2 = r4.contains(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L10
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            r7 = 1
            goto L2a
        L28:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            r7 = 0
        L2a:
            long r4 = r6.f43514i     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.yandex.metrica.impl.p023ob.C3525Oi.m18682a(r4)     // Catch: java.lang.Throwable -> L56
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L56
            com.yandex.metrica.impl.ob.Il r4 = r6.f43512g     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L3d
            boolean r4 = r4.m18337a()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            r4 = r4 ^ r1
            if (r0 != 0) goto L4e
            if (r7 != 0) goto L4e
            if (r2 != 0) goto L4e
            boolean r7 = r6.f43511f     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L4e
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            monitor-exit(r6)
            return r1
        L50:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r7     // Catch: java.lang.Throwable -> L56
        L53:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r7     // Catch: java.lang.Throwable -> L56
        L56:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3500Ni.m18631b(java.util.List):boolean");
    }

    /* renamed from: a */
    public boolean m18628a() {
        C3963g1 c3963g1 = this.f43507b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!m18619a(c3963g1) && c3963g1.f45155a.isEmpty()) {
            return C3658U2.m19218b(this.f43509d);
        }
        return true;
    }

    /* renamed from: a */
    private void m18618a(@NonNull String str, @Nullable C3963g1 c3963g1) {
        if (m18621b(c3963g1)) {
            return;
        }
        this.f43507b.put(str, c3963g1);
    }

    /* renamed from: a */
    private boolean m18619a(@Nullable C3963g1 c3963g1) {
        return c3963g1 == null || c3963g1.f45155a == null;
    }

    /* renamed from: b */
    public List<String> m18630b() {
        return this.f43508c;
    }

    /* renamed from: a */
    public synchronized void m18626a(@NonNull List<String> list, Map<String, C3963g1> map) {
        for (String str : list) {
            C3963g1 c3963g1 = this.f43507b.get(str);
            if (c3963g1 != null) {
                map.put(str, c3963g1);
            }
        }
        this.f43518m.m20836a(list, map);
        this.f43519n.m21114a(list, map);
    }

    /* renamed from: a */
    public synchronized boolean m18629a(@NonNull Collection<String> collection) {
        for (String str : collection) {
            C3963g1 c3963g1 = this.f43507b.get(str);
            if (c3963g1 == null) {
                c3963g1 = this.f43518m.m20837b().get(str);
            }
            if (c3963g1 == null) {
                c3963g1 = this.f43519n.m21111a(str);
            }
            if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str)) {
                if (this.f43511f || m18619a(c3963g1) || (c3963g1.f45155a.isEmpty() && !C3658U2.m19218b(this.f43509d))) {
                    return false;
                }
            } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str)) {
                if (c3963g1 == null) {
                    return false;
                }
            } else if (m18621b(c3963g1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m18623a(@androidx.annotation.NonNull android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3500Ni.m18623a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public synchronized void m18624a(@NonNull InterfaceC3403Jl interfaceC3403Jl) {
        this.f43515j.add(interfaceC3403Jl);
    }

    /* renamed from: a */
    public void m18625a(List<String> list) {
        this.f43508c = list;
        this.f43516k.m18047b(list);
    }
}
