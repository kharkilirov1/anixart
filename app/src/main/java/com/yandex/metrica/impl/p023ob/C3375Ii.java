package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.Ii */
/* loaded from: classes2.dex */
public class C3375Ii implements InterfaceC3425Ki, InterfaceC3807a1 {

    /* renamed from: j */
    public static final Map<EnumC3350Hi, IParamsCallback.Reason> f43128j = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private final List<String> f43129a;

    /* renamed from: b */
    private final C4146n2 f43130b;

    /* renamed from: c */
    private final C3500Ni f43131c;

    /* renamed from: d */
    @NonNull
    private final Handler f43132d;

    /* renamed from: e */
    @Nullable
    private C3379Im f43133e;

    /* renamed from: f */
    private final ResultReceiverC4144n0.a f43134f;

    /* renamed from: g */
    private final Object f43135g;

    /* renamed from: h */
    private final Map<InterfaceC4448yi, List<String>> f43136h;

    /* renamed from: i */
    private Map<String, String> f43137i;

    /* renamed from: com.yandex.metrica.impl.ob.Ii$a */
    public class a extends HashMap<EnumC3350Hi, IParamsCallback.Reason> {
        public a() {
            put(EnumC3350Hi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(EnumC3350Hi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(EnumC3350Hi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ii$b */
    public class b implements ResultReceiverC4144n0.a {
        public b(C3375Ii c3375Ii) {
        }

        @Override // com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0.a
        /* renamed from: a */
        public void mo18335a(int i2, @NonNull Bundle bundle) {
        }
    }

    public C3375Ii(@NonNull Context context, C4146n2 c4146n2, C3291F9 c3291f9, @NonNull Handler handler) {
        this(c4146n2, new C3500Ni(context, c3291f9), handler);
    }

    /* renamed from: f */
    private void m18320f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry<InterfaceC4448yi, List<String>> entry : this.f43136h.entrySet()) {
            List<String> value = entry.getValue();
            if (this.f43131c.m18629a((Collection<String>) value)) {
                weakHashMap.put(entry.getKey(), value);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC4448yi interfaceC4448yi = (InterfaceC4448yi) ((Map.Entry) it.next()).getKey();
            if (interfaceC4448yi != null) {
                m18319a(interfaceC4448yi, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3807a1
    /* renamed from: a */
    public long mo18321a() {
        return this.f43131c.m18634e();
    }

    /* renamed from: b */
    public String m18329b() {
        return this.f43131c.m18632c();
    }

    @NonNull
    /* renamed from: c */
    public C3741Xa m18331c() {
        return this.f43131c.m18633d();
    }

    @Nullable
    /* renamed from: d */
    public C3378Il m18332d() {
        return this.f43131c.m18635f();
    }

    /* renamed from: e */
    public String m18333e() {
        return this.f43131c.m18636g();
    }

    /* renamed from: g */
    public void m18334g() {
        boolean m18631b;
        synchronized (this.f43135g) {
            C3500Ni c3500Ni = this.f43131c;
            synchronized (c3500Ni) {
                m18631b = c3500Ni.m18631b(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"));
            }
            if (m18631b) {
                Map<String, String> map = this.f43137i;
                this.f43130b.m20429a(this.f43129a, new ResultReceiverC4144n0(this.f43132d, this.f43134f), map);
            }
        }
    }

    @VisibleForTesting
    public C3375Ii(C4146n2 c4146n2, @NonNull C3500Ni c3500Ni, @NonNull Handler handler) {
        this.f43129a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.f43135g = new Object();
        this.f43136h = new WeakHashMap();
        this.f43130b = c4146n2;
        this.f43131c = c3500Ni;
        this.f43132d = handler;
        this.f43134f = new b(this);
    }

    /* renamed from: a */
    public void m18323a(IIdentifierCallback iIdentifierCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        C4240qi c4240qi = new C4240qi(iIdentifierCallback);
        synchronized (this.f43135g) {
            this.f43131c.m18627a(map);
            if (this.f43136h.isEmpty()) {
                this.f43130b.m20442g();
            }
            this.f43136h.put(c4240qi, list);
            if (this.f43131c.m18631b(list)) {
                this.f43130b.m20429a(list, new ResultReceiverC4144n0(this.f43132d, new C3400Ji(this, c4240qi)), map);
            } else {
                m18319a(c4240qi, new Bundle());
            }
        }
    }

    /* renamed from: b */
    public void m18330b(@Nullable String str) {
        synchronized (this.f43135g) {
            this.f43130b.m20435b(str);
        }
    }

    /* renamed from: a */
    public void m18322a(@NonNull Bundle bundle, @Nullable InterfaceC4448yi interfaceC4448yi) {
        synchronized (this.f43135g) {
            this.f43131c.m18623a(bundle);
            m18320f();
            m18320f();
            if (interfaceC4448yi != null) {
                m18319a(interfaceC4448yi, bundle);
            }
        }
    }

    /* renamed from: a */
    public void m18324a(@NonNull C3379Im c3379Im) {
        this.f43133e = c3379Im;
    }

    /* renamed from: a */
    public void m18327a(List<String> list) {
        synchronized (this.f43135g) {
            List<String> m18630b = this.f43131c.m18630b();
            if (C3658U2.m19217b(list)) {
                if (!C3658U2.m19217b(m18630b)) {
                    this.f43131c.m18625a((List<String>) null);
                    this.f43130b.m20428a((List<String>) null);
                }
            } else if (!C3658U2.m19213a(list, m18630b)) {
                this.f43131c.m18625a(list);
                this.f43130b.m20428a(list);
            } else {
                this.f43130b.m20428a(m18630b);
            }
        }
    }

    /* renamed from: a */
    public void m18328a(Map<String, String> map) {
        if (C3658U2.m19218b(map)) {
            return;
        }
        synchronized (this.f43135g) {
            Map<String, String> m21274i = C4452ym.m21274i(map);
            this.f43137i = m21274i;
            this.f43130b.m20430a(m21274i);
            this.f43131c.m18627a(m21274i);
        }
    }

    /* renamed from: a */
    public void m18326a(String str) {
        synchronized (this.f43135g) {
            this.f43130b.m20425a(str);
        }
    }

    /* renamed from: a */
    public void m18325a(@NonNull InterfaceC3403Jl interfaceC3403Jl) {
        this.f43131c.m18624a(interfaceC3403Jl);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m18319a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.InterfaceC4448yi r7, @androidx.annotation.NonNull android.os.Bundle r8) {
        /*
            r6 = this;
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r0 = r6.f43136h
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L99
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r0 = r6.f43136h
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.Ni r1 = r6.f43131c
            boolean r1 = r1.m18629a(r0)
            r2 = 0
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = r6.f43131c
            r8.m18626a(r0, r2)
        L26:
            r7.onReceive(r2)
            goto L87
        L2a:
            java.lang.String r1 = "startup_error_key_code"
            boolean r3 = r8.containsKey(r1)
            r4 = 1
            if (r3 == 0) goto L45
            int r8 = r8.getInt(r1)
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p023ob.EnumC3350Hi.UNKNOWN
            if (r8 == r4) goto L42
            r3 = 2
            if (r8 == r3) goto L3f
            goto L46
        L3f:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p023ob.EnumC3350Hi.PARSE
            goto L46
        L42:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p023ob.EnumC3350Hi.NETWORK
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 != 0) goto L65
            com.yandex.metrica.impl.ob.Ni r8 = r6.f43131c
            boolean r8 = r8.m18628a()
            if (r8 != 0) goto L63
            com.yandex.metrica.impl.ob.Im r8 = r6.f43133e
            if (r8 == 0) goto L60
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f43137i
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.m21336c(r4, r3)
        L60:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L66
        L63:
            com.yandex.metrica.impl.ob.Hi r1 = com.yandex.metrica.impl.p023ob.EnumC3350Hi.UNKNOWN
        L65:
            r8 = r2
        L66:
            if (r8 != 0) goto L77
            java.util.Map<com.yandex.metrica.impl.ob.Hi, com.yandex.metrica.IParamsCallback$Reason> r8 = com.yandex.metrica.impl.p023ob.C3375Ii.f43128j
            com.yandex.metrica.IParamsCallback$Reason r3 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r8 = r8.get(r1)
            if (r8 != 0) goto L73
            goto L74
        L73:
            r3 = r8
        L74:
            r8 = r3
            com.yandex.metrica.IParamsCallback$Reason r8 = (com.yandex.metrica.IParamsCallback.Reason) r8
        L77:
            if (r0 != 0) goto L7a
            goto L84
        L7a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.Ni r1 = r6.f43131c
            r1.m18626a(r0, r2)
        L84:
            r7.mo20599a(r8, r2)
        L87:
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r8 = r6.f43136h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r7 = r6.f43136h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L99
            com.yandex.metrica.impl.ob.n2 r7 = r6.f43130b
            r7.m20441f()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3375Ii.m18319a(com.yandex.metrica.impl.ob.yi, android.os.Bundle):void");
    }
}
