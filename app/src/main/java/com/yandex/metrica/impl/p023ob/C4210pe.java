package com.yandex.metrica.impl.p023ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.pe */
/* loaded from: classes2.dex */
public class C4210pe {

    /* renamed from: b */
    public static final Map<String, String> f46141b = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private C4236qe f46142a;

    /* renamed from: com.yandex.metrica.impl.ob.pe$a */
    public class a extends HashMap<String, String> {
        public a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public C4210pe(C4236qe c4236qe) {
        this.f46142a = c4236qe;
    }

    /* renamed from: a */
    public void m20549a() {
        if (this.f46142a.m20579b(null) != null) {
            this.f46142a.m20587j();
            this.f46142a.m20583f();
        }
    }

    /* renamed from: b */
    public void m20551b() {
        Map<String, ?> all = this.f46142a.f46307b.getAll();
        for (String str : f46141b.values()) {
            int i2 = C4236qe.f46233j;
            all.remove(new C4444ye("init_event_pref_key", str).m21201a());
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : all.keySet()) {
            try {
                int i3 = C4236qe.f46233j;
                linkedList.add(Integer.valueOf(Integer.parseInt(str2.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        m20550a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m20552c() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = com.yandex.metrica.impl.p023ob.C4210pe.f46141b
            com.yandex.metrica.impl.ob.qe r1 = r4.f46142a
            java.lang.String r1 = r1.f46306a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L35
            com.yandex.metrica.impl.ob.qe r1 = r4.f46142a
            android.content.SharedPreferences r1 = r1.f46307b
            java.util.Map r1 = r1.getAll()
            int r2 = com.yandex.metrica.impl.p023ob.C4236qe.f46233j
            com.yandex.metrica.impl.ob.ye r2 = new com.yandex.metrica.impl.ob.ye
            java.lang.String r3 = "init_event_pref_key"
            r2.<init>(r3, r0)
            java.lang.String r2 = r2.m21201a()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "DONE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 == 0) goto L3b
            r4.m20550a(r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4210pe.m20552c():void");
    }

    /* renamed from: a */
    public void m20550a(String str) {
        if (str != null) {
            C4236qe c4236qe = this.f46142a;
            Objects.requireNonNull(c4236qe);
            c4236qe.f46307b.edit().remove(new C4444ye("init_event_pref_key", str).m21201a()).apply();
            this.f46142a.m20587j();
        }
    }
}
