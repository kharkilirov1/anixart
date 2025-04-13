package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3694Vd;
import com.yandex.metrica.impl.p023ob.C3200Bi;
import com.yandex.metrica.impl.p023ob.C3834b2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.lg */
/* loaded from: classes2.dex */
public class C4108lg {

    /* renamed from: i */
    private static final Map<C3200Bi.a, C3834b2.d> f45885i = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    @NonNull
    private final Context f45886a;

    /* renamed from: b */
    @NonNull
    private final C3566Q9 f45887b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f45888c;

    /* renamed from: d */
    @NonNull
    private final C3424Kh f45889d;

    /* renamed from: e */
    @NonNull
    private final C3459M2 f45890e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC4400wm f45891f;

    /* renamed from: g */
    private e f45892g;

    /* renamed from: h */
    private boolean f45893h = false;

    /* renamed from: com.yandex.metrica.impl.ob.lg$a */
    public class a extends HashMap<C3200Bi.a, C3834b2.d> {
        public a() {
            put(C3200Bi.a.CELL, C3834b2.d.CELL);
            put(C3200Bi.a.WIFI, C3834b2.d.WIFI);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4108lg.m20359a(C4108lg.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f45895a;

        /* renamed from: b */
        public final /* synthetic */ C3575Qi f45896b;

        public c(List list, C3575Qi c3575Qi) {
            this.f45895a = list;
            this.f45896b = c3575Qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4108lg.m20361a(C4108lg.this, this.f45895a, this.f45896b.m18822C());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ e.a f45898a;

        public d(e.a aVar) {
            this.f45898a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4108lg.this.f45890e.m18567e()) {
                return;
            }
            C4108lg.this.f45889d.m18450b(this.f45898a);
            e.b bVar = new e.b(this.f45898a);
            InterfaceC4400wm interfaceC4400wm = C4108lg.this.f45891f;
            Context context = C4108lg.this.f45886a;
            Objects.requireNonNull((C4270rm) interfaceC4400wm);
            C3834b2.d m19630a = C3834b2.m19630a(context);
            bVar.m20376a(m19630a);
            if (m19630a == C3834b2.d.OFFLINE) {
                bVar.m20377a(e.b.a.OFFLINE);
            } else if (this.f45898a.f45907f.contains(m19630a)) {
                bVar.m20377a(e.b.a.ERROR);
                try {
                    HttpsURLConnection m19508a = C3532P0.m18696i().m18721x().m19508a(this.f45898a.f45903b);
                    for (Map.Entry<String, ? extends Collection<String>> entry : this.f45898a.f45905d.m19536a()) {
                        m19508a.setRequestProperty(entry.getKey(), TextUtils.join(",", entry.getValue()));
                    }
                    m19508a.setInstanceFollowRedirects(true);
                    m19508a.setRequestMethod(this.f45898a.f45904c);
                    int i2 = AbstractC3694Vd.a.f44229a;
                    m19508a.setConnectTimeout(i2);
                    m19508a.setReadTimeout(i2);
                    m19508a.connect();
                    int responseCode = m19508a.getResponseCode();
                    bVar.m20377a(e.b.a.COMPLETE);
                    bVar.m20378a(Integer.valueOf(responseCode));
                    try {
                        bVar.f45912e = C3681V0.m19265a(m19508a.getInputStream(), 102400);
                    } catch (IOException unused) {
                    }
                    try {
                        bVar.f45913f = C3681V0.m19265a(m19508a.getErrorStream(), 102400);
                    } catch (IOException unused2) {
                    }
                    bVar.m20380a((Map<String, List<String>>) m19508a.getHeaderFields());
                } catch (Throwable th) {
                    bVar.m20379a(th);
                }
            } else {
                bVar.m20377a(e.b.a.INCOMPATIBLE_NETWORK_TYPE);
            }
            C4108lg.m20360a(C4108lg.this, bVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$e */
    public static class e {

        /* renamed from: a */
        @NonNull
        private final List<a> f45900a;

        /* renamed from: b */
        @NonNull
        private final LinkedHashMap<String, Object> f45901b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$a */
        public static class a {

            /* renamed from: a */
            @NonNull
            public final String f45902a;

            /* renamed from: b */
            @NonNull
            public final String f45903b;

            /* renamed from: c */
            @NonNull
            public final String f45904c;

            /* renamed from: d */
            @NonNull
            public final C3803Zm<String, String> f45905d;

            /* renamed from: e */
            public final long f45906e;

            /* renamed from: f */
            @NonNull
            public final List<C3834b2.d> f45907f;

            public a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull C3803Zm<String, String> c3803Zm, long j2, @NonNull List<C3834b2.d> list) {
                this.f45902a = str;
                this.f45903b = str2;
                this.f45904c = str3;
                this.f45906e = j2;
                this.f45907f = list;
                this.f45905d = c3803Zm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f45902a.equals(((a) obj).f45902a);
            }

            public int hashCode() {
                return this.f45902a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$b */
        public static class b {

            /* renamed from: a */
            @NonNull
            private final a f45908a;

            /* renamed from: b */
            @Nullable
            private a f45909b;

            /* renamed from: c */
            @Nullable
            private C3834b2.d f45910c;

            /* renamed from: d */
            @Nullable
            private Integer f45911d;

            /* renamed from: e */
            @Nullable
            public byte[] f45912e;

            /* renamed from: f */
            @Nullable
            public byte[] f45913f;

            /* renamed from: g */
            @Nullable
            private Map<String, List<String>> f45914g;

            /* renamed from: h */
            @Nullable
            private Throwable f45915h;

            /* renamed from: com.yandex.metrica.impl.ob.lg$e$b$a */
            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(@NonNull a aVar) {
                this.f45908a = aVar;
            }

            @Nullable
            /* renamed from: b */
            public byte[] m20381b() {
                return this.f45913f;
            }

            @Nullable
            /* renamed from: c */
            public Throwable m20382c() {
                return this.f45915h;
            }

            @NonNull
            /* renamed from: d */
            public a m20383d() {
                return this.f45908a;
            }

            @Nullable
            /* renamed from: e */
            public byte[] m20384e() {
                return this.f45912e;
            }

            @Nullable
            /* renamed from: f */
            public Integer m20385f() {
                return this.f45911d;
            }

            @Nullable
            /* renamed from: g */
            public Map<String, List<String>> m20386g() {
                return this.f45914g;
            }

            @Nullable
            /* renamed from: h */
            public a m20387h() {
                return this.f45909b;
            }

            /* renamed from: a */
            public void m20377a(@NonNull a aVar) {
                this.f45909b = aVar;
            }

            @Nullable
            /* renamed from: a */
            public C3834b2.d m20375a() {
                return this.f45910c;
            }

            /* renamed from: a */
            public void m20376a(@Nullable C3834b2.d dVar) {
                this.f45910c = dVar;
            }

            /* renamed from: a */
            public void m20378a(@Nullable Integer num) {
                this.f45911d = num;
            }

            /* renamed from: a */
            public void m20380a(@Nullable Map<String, List<String>> map) {
                this.f45914g = map;
            }

            /* renamed from: a */
            public void m20379a(@Nullable Throwable th) {
                this.f45915h = th;
            }
        }

        public e(@NonNull List<a> list, @NonNull List<String> list2) {
            this.f45900a = list;
            if (C3658U2.m19217b(list2)) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                this.f45901b.put(it.next(), new Object());
            }
        }

        /* renamed from: a */
        public boolean m20371a(@NonNull a aVar) {
            if (this.f45901b.get(aVar.f45902a) != null || this.f45900a.contains(aVar)) {
                return false;
            }
            this.f45900a.add(aVar);
            return true;
        }

        @NonNull
        /* renamed from: b */
        public List<a> m20372b() {
            return this.f45900a;
        }

        /* renamed from: b */
        public void m20373b(@NonNull a aVar) {
            this.f45901b.put(aVar.f45902a, new Object());
            this.f45900a.remove(aVar);
        }

        @NonNull
        /* renamed from: a */
        public Set<String> m20370a() {
            HashSet hashSet = new HashSet();
            Iterator<String> it = this.f45901b.keySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                hashSet.add(it.next());
                i2++;
                if (i2 > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    @VisibleForTesting
    public C4108lg(@NonNull Context context, @NonNull C3566Q9 c3566q9, @NonNull C3459M2 c3459m2, @NonNull C3424Kh c3424Kh, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC4400wm interfaceC4400wm) {
        this.f45886a = context;
        this.f45887b = c3566q9;
        this.f45890e = c3459m2;
        this.f45889d = c3424Kh;
        this.f45892g = (e) c3566q9.m18782b();
        this.f45888c = interfaceExecutorC4297sn;
        this.f45891f = interfaceC4400wm;
    }

    /* renamed from: a */
    public static void m20361a(C4108lg c4108lg, List list, long j2) {
        Long l2;
        Objects.requireNonNull(c4108lg);
        if (C3658U2.m19217b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3200Bi c3200Bi = (C3200Bi) it.next();
            if (c3200Bi.f42629a != null && c3200Bi.f42630b != null && c3200Bi.f42631c != null && (l2 = c3200Bi.f42633e) != null && l2.longValue() >= 0 && !C3658U2.m19217b(c3200Bi.f42634f)) {
                String str = c3200Bi.f42629a;
                String str2 = c3200Bi.f42630b;
                String str3 = c3200Bi.f42631c;
                List<Pair<String, String>> list2 = c3200Bi.f42632d;
                C3803Zm c3803Zm = new C3803Zm(false);
                for (Pair<String, String> pair : list2) {
                    c3803Zm.m19535a(pair.first, pair.second);
                }
                long millis = TimeUnit.SECONDS.toMillis(c3200Bi.f42633e.longValue() + j2);
                List<C3200Bi.a> list3 = c3200Bi.f42634f;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator<C3200Bi.a> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(f45885i.get(it2.next()));
                }
                c4108lg.m20362a(new e.a(str, str2, str3, c3803Zm, millis, arrayList));
            }
        }
    }

    /* renamed from: b */
    private void m20364b(@NonNull e.a aVar) {
        long max = Math.max(aVar.f45906e - System.currentTimeMillis(), 0L);
        ((C4271rn) this.f45888c).m20673a(new d(aVar), Math.max(C4377w.f46831c, max));
    }

    /* renamed from: a */
    public synchronized void m20368a() {
        ((C4271rn) this.f45888c).execute(new b());
    }

    /* renamed from: a */
    public static void m20359a(C4108lg c4108lg) {
        if (c4108lg.f45893h) {
            return;
        }
        e eVar = (e) c4108lg.f45887b.m18782b();
        c4108lg.f45892g = eVar;
        Iterator<e.a> it = eVar.m20372b().iterator();
        while (it.hasNext()) {
            c4108lg.m20364b(it.next());
        }
        c4108lg.f45893h = true;
    }

    /* renamed from: a */
    public synchronized void m20369a(@NonNull C3575Qi c3575Qi) {
        List<C3200Bi> m18828I = c3575Qi.m18828I();
        ((C4271rn) this.f45888c).execute(new c(m18828I, c3575Qi));
    }

    /* renamed from: a */
    private boolean m20362a(@NonNull e.a aVar) {
        boolean m20371a = this.f45892g.m20371a(aVar);
        if (m20371a) {
            m20364b(aVar);
            this.f45889d.m18448a(aVar);
        }
        this.f45887b.m18781a(this.f45892g);
        return m20371a;
    }

    /* renamed from: a */
    public static void m20360a(C4108lg c4108lg, e.b bVar) {
        synchronized (c4108lg) {
            c4108lg.f45892g.m20373b(bVar.f45908a);
            c4108lg.f45887b.m18781a(c4108lg.f45892g);
            c4108lg.f45889d.m18449a(bVar);
        }
    }
}
