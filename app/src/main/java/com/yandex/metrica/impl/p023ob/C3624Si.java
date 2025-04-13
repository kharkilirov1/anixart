package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3300Fi;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import com.yandex.metrica.impl.p023ob.C3599Ri;
import com.yandex.metrica.impl.p023ob.C4083kh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.Si */
/* loaded from: classes2.dex */
public class C3624Si {

    /* renamed from: a */
    @NonNull
    private final C3862c4 f44012a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3550Pi f44013b;

    /* renamed from: c */
    @NonNull
    private final C3575Qi.b f44014c;

    /* renamed from: d */
    @Nullable
    private volatile C3409K2 f44015d;

    /* renamed from: e */
    @NonNull
    private C3325Gi f44016e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3529Om f44017f;

    /* renamed from: g */
    @NonNull
    private final C3556Q f44018g;

    /* renamed from: h */
    @NonNull
    private final C4266ri f44019h;

    /* renamed from: i */
    @NonNull
    private final C3285F3 f44020i;

    /* renamed from: com.yandex.metrica.impl.ob.Si$a */
    public class a implements Function0<C3556Q> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public C3556Q invoke() {
            return C3624Si.this.f44018g;
        }
    }

    public C3624Si(@NonNull Context context, @NonNull String str, @NonNull C4083kh.b bVar, @NonNull InterfaceC3550Pi interfaceC3550Pi) {
        this(context, new C3759Y3(str), bVar, interfaceC3550Pi, new C3575Qi.b(context), new C4348um(context), new C3504Nm(), C3532P0.m18696i().m18703e(), new C4266ri(), C3285F3.m18024a());
    }

    @Nullable
    /* renamed from: b */
    public synchronized C3409K2 m19102b() {
        if (!m19104d()) {
            return null;
        }
        if (this.f44015d == null) {
            this.f44015d = new C3409K2(this, this.f44016e.m19910b());
        }
        return this.f44015d;
    }

    @NonNull
    /* renamed from: c */
    public C3575Qi m19103c() {
        return this.f44016e.m19912d();
    }

    /* renamed from: d */
    public synchronized boolean m19104d() {
        boolean m18686b;
        C3575Qi m19912d = this.f44016e.m19912d();
        m18686b = C3525Oi.m18686b(m19912d);
        if (!m18686b && !(!C3525Oi.m18683a(m19912d))) {
            if (!this.f44019h.m20665a(this.f44016e.m19910b().m20283D(), m19912d, this.f44018g)) {
                m18686b = true;
            }
        }
        return m18686b;
    }

    /* renamed from: a */
    private void m19094a(@NonNull C4348um c4348um, @NonNull C3276Ej c3276Ej, @NonNull C3575Qi c3575Qi) {
        C3575Qi.a m18843a = c3575Qi.m18843a();
        if (!C3525Oi.m18685a(c3575Qi.m18841V())) {
            m18843a = m18843a.m18917l(c3276Ej.m18014a().f45155a);
        }
        String m20906a = c4348um.m20906a();
        if (!C3525Oi.m18685a(c3575Qi.m18851i())) {
            m18843a = m18843a.m18899c(m20906a).m18904e("");
        }
        if (!C3525Oi.m18685a(c3575Qi.m18852j())) {
            m18843a = m18843a.m18902d(m20906a);
        }
        C3575Qi m18891a = m18843a.m18891a();
        m19095b(m18891a);
        m19093a(m18891a);
    }

    private C3624Si(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C4083kh.b bVar, @NonNull InterfaceC3550Pi interfaceC3550Pi, @NonNull C3575Qi.b bVar2, @NonNull C4348um c4348um, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3556Q c3556q, @NonNull C4266ri c4266ri, @NonNull C3285F3 c3285f3) {
        this(context, c3862c4, bVar, interfaceC3550Pi, bVar2, bVar2.m18918a(), c4348um, interfaceC3529Om, c3556q, c4266ri, c3285f3);
    }

    private C3624Si(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C4083kh.b bVar, @NonNull InterfaceC3550Pi interfaceC3550Pi, @NonNull C3575Qi.b bVar2, @NonNull C3575Qi c3575Qi, @NonNull C4348um c4348um, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3556Q c3556q, @NonNull C4266ri c4266ri, @NonNull C3285F3 c3285f3) {
        this(context, c3862c4, interfaceC3550Pi, bVar2, c3575Qi, c4348um, new C3325Gi(new C4083kh.c(context, c3862c4.m19669b()), c3575Qi, bVar), interfaceC3529Om, c3556q, c4266ri, C3301Fj.m18110a(context).m18111a(context, new C3401Jj(bVar2)), c3285f3);
    }

    /* renamed from: b */
    private synchronized void m19095b(@NonNull C3575Qi c3575Qi) {
        this.f44016e.m19907a(c3575Qi);
        this.f44014c.m18919a(c3575Qi);
        C3532P0.m18696i().m18699a(c3575Qi);
        this.f44020i.m18026a((C3335H3) new C3410K3(this.f44012a.m19669b(), c3575Qi));
    }

    @VisibleForTesting
    public C3624Si(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull InterfaceC3550Pi interfaceC3550Pi, @NonNull C3575Qi.b bVar, @NonNull C3575Qi c3575Qi, @NonNull C4348um c4348um, @NonNull C3325Gi c3325Gi, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3556Q c3556q, @NonNull C4266ri c4266ri, @NonNull C3276Ej c3276Ej, @NonNull C3285F3 c3285f3) {
        this.f44012a = c3862c4;
        this.f44013b = interfaceC3550Pi;
        this.f44014c = bVar;
        this.f44016e = c3325Gi;
        this.f44017f = interfaceC3529Om;
        this.f44018g = c3556q;
        this.f44019h = c4266ri;
        this.f44020i = c3285f3;
        m19094a(c4348um, c3276Ej, c3575Qi);
    }

    @NonNull
    /* renamed from: a */
    public C3862c4 m19097a() {
        return this.f44012a;
    }

    /* renamed from: a */
    public void m19098a(@NonNull EnumC3350Hi enumC3350Hi) {
        HashMap hashMap;
        C3803Zm c3803Zm;
        ArrayList arrayList;
        synchronized (this) {
            this.f44015d = null;
        }
        InterfaceC3550Pi interfaceC3550Pi = this.f44013b;
        String m19669b = this.f44012a.m19669b();
        C3575Qi m19912d = this.f44016e.m19912d();
        C3300Fi.a aVar = (C3300Fi.a) interfaceC3550Pi;
        hashMap = C3300Fi.this.f42919b;
        synchronized (hashMap) {
            c3803Zm = C3300Fi.this.f42918a;
            Collection m19534a = c3803Zm.m19534a(m19669b);
            if (m19534a == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(m19534a);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3450Li) it.next()).mo18512a(enumC3350Hi, m19912d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19100a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4371vj r6, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4083kh r7, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.p023ob.C3658U2.m19218b(r8)     // Catch: java.lang.Throwable -> L5f
            r1 = 0
            if (r0 != 0) goto L33
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L5f
            boolean r0 = com.yandex.metrica.impl.p023ob.C3658U2.m19217b(r8)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L33
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L33
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L33
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L33
            java.util.Date r8 = r0.parse(r8)     // Catch: java.lang.Throwable -> L33
            long r2 = r8.getTime()     // Catch: java.lang.Throwable -> L33
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
            r8 = r1
        L34:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
            if (r8 != 0) goto L3d
            r8 = r0
        L3d:
            java.lang.Long r0 = r6.m20993M()     // Catch: java.lang.Throwable -> L5f
            com.yandex.metrica.impl.ob.Lm r2 = com.yandex.metrica.impl.p023ob.C3454Lm.m18520c()     // Catch: java.lang.Throwable -> L5f
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L5f
            r2.m18521a(r3, r0)     // Catch: java.lang.Throwable -> L5f
            com.yandex.metrica.impl.ob.Qi r6 = r5.m19096a(r6, r7, r8)     // Catch: java.lang.Throwable -> L5f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L5f
            r5.f44015d = r1     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            r5.m19095b(r6)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            r5.m19093a(r6)
            return
        L5c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r6     // Catch: java.lang.Throwable -> L5f
        L5f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3624Si.m19100a(com.yandex.metrica.impl.ob.vj, com.yandex.metrica.impl.ob.kh, java.util.Map):void");
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public C3575Qi m19096a(@NonNull C4371vj c4371vj, @NonNull C4083kh c4083kh, @Nullable Long l2) {
        boolean equals;
        String m21262c = C4452ym.m21262c(c4083kh.m20283D());
        Map<String, String> m18729b = c4083kh.m20282C().m18729b();
        String m21050n = c4371vj.m21050n();
        String m18857o = this.f44016e.m19912d().m18857o();
        if (!C4452ym.m21266d(C4452ym.m21241a(m21050n))) {
            m21050n = C4452ym.m21266d(C4452ym.m21241a(m18857o)) ? m18857o : null;
        }
        String m18851i = this.f44016e.m19912d().m18851i();
        if (TextUtils.isEmpty(m18851i)) {
            m18851i = c4371vj.m21045i();
        }
        C3575Qi m19912d = this.f44016e.m19912d();
        C3575Qi.a m18912i = new C3575Qi.a(new C3599Ri.b(c4371vj.m21033e())).m18899c(m18851i).m18904e(c4371vj.m21042h()).m18897c(this.f44017f.mo18644b()).m18902d(m19912d.m18852j()).m18917l(m19912d.m18841V()).m18908g(c4371vj.m21051o()).m18900c(c4371vj.m20986F()).m18895b(c4083kh.m20290K()).m18913i(c4371vj.m21060x()).m18905e(c4371vj.m21054r()).m18914j(c4371vj.m21059w()).m18916k(c4371vj.m20983C()).m18887a(c4371vj.m21030d()).m18888a(c4371vj.m21046j()).m18909g(c4371vj.m21056t()).m18889a(c4371vj.m21039g()).m18906f(m21050n).m18912i(m21262c);
        Objects.requireNonNull(this.f44019h);
        Map<String, String> m21241a = C4452ym.m21241a(m21050n);
        if (C3658U2.m19218b(m18729b)) {
            equals = C3658U2.m19218b(m21241a);
        } else {
            equals = m21241a.equals(m18729b);
        }
        C3575Qi.a m18890a = m18912i.m18901c(equals).m18910h(C4452ym.m21262c(m18729b)).m18874a(c4371vj.m20984D()).m18903d(c4371vj.m21053q()).m18873a(c4371vj.m20994N()).m18915j(c4371vj.m21061y()).m18894b(c4371vj.m21036f()).m18870a(c4371vj.m21058v()).m18911h(c4371vj.m21057u()).m18872a(c4371vj.m20982B()).m18878a(c4371vj.m20987G()).m18890a(true);
        Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l2 != null) {
            valueOf = l2;
        }
        return m18890a.m18892b(valueOf.longValue()).m18869a(this.f44016e.m19910b().m20293a(l2.longValue())).m18896b(false).m18886a(c4371vj.m21052p()).m18871a(c4371vj.m20981A()).m18881a(c4371vj.m20991K()).m18893b(c4371vj.m20990J()).m18898c(c4371vj.m20992L()).m18876a(c4371vj.m20989I()).m18879a(c4371vj.m20988H()).m18884a(c4371vj.m21026c()).m18880a(c4371vj.m21047k()).m18907f(c4371vj.m21055s()).m18883a(c4371vj.m21022b()).m18882a(c4371vj.m20996a()).m18875a(c4371vj.m21048l()).m18885a(c4371vj.m21049m()).m18877a(c4371vj.m20985E()).m18891a();
    }

    /* renamed from: a */
    private void m19093a(@NonNull C3575Qi c3575Qi) {
        HashMap hashMap;
        C3803Zm c3803Zm;
        ArrayList arrayList;
        InterfaceC3550Pi interfaceC3550Pi = this.f44013b;
        String m19669b = this.f44012a.m19669b();
        C3300Fi.a aVar = (C3300Fi.a) interfaceC3550Pi;
        hashMap = C3300Fi.this.f42919b;
        synchronized (hashMap) {
            C3300Fi.this.f42920c = c3575Qi;
            c3803Zm = C3300Fi.this.f42918a;
            Collection m19534a = c3803Zm.m19534a(m19669b);
            if (m19534a == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(m19534a);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3450Li) it.next()).mo18513a(c3575Qi);
        }
    }

    /* renamed from: a */
    public synchronized boolean m19101a(@Nullable List<String> list, @NonNull Map<String, String> map) {
        return !C3525Oi.m18684a(this.f44016e.m19912d(), list, map, new a());
    }

    /* renamed from: a */
    public synchronized void m19099a(@NonNull C4083kh.b bVar) {
        this.f44016e.m18172a(bVar);
        C4083kh m19910b = this.f44016e.m19910b();
        if (m19910b.m20291L()) {
            boolean z = false;
            List<String> m20287H = m19910b.m20287H();
            boolean z2 = true;
            C3575Qi.a aVar = null;
            if (C3658U2.m19217b(m20287H) && !C3658U2.m19217b(m19910b.m20290K())) {
                aVar = this.f44016e.m19912d().m18843a().m18895b((List<String>) null);
                z = true;
            }
            if (C3658U2.m19217b(m20287H) || C3658U2.m19213a(m20287H, m19910b.m20290K())) {
                z2 = z;
            } else {
                aVar = this.f44016e.m19912d().m18843a().m18895b(m20287H);
            }
            if (z2) {
                C3575Qi m18891a = aVar.m18891a();
                m19095b(m18891a);
                m19093a(m18891a);
            }
        }
    }
}
