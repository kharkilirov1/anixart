package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.yandex.metrica.impl.p023ob.C3156A;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.e4 */
/* loaded from: classes2.dex */
public class C3914e4 {

    /* renamed from: a */
    private final C3940f4 f44986a;

    /* renamed from: b */
    private final C4210pe f44987b;

    /* renamed from: c */
    private List<j> f44988c;

    /* renamed from: com.yandex.metrica.impl.ob.e4$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        private final C3940f4 f44989a;

        public b(@NonNull C3940f4 c3940f4) {
            this.f44989a = c3940f4;
        }

        /* renamed from: a */
        public C3914e4 m19787a(@NonNull C4210pe c4210pe) {
            return new C3914e4(this.f44989a, c4210pe);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$c */
    public static class c extends j {

        /* renamed from: b */
        private final C4314te f44990b;

        /* renamed from: c */
        private final C3316G9 f44991c;

        public c(C3940f4 c3940f4) {
            super(c3940f4);
            this.f44990b = new C4314te(c3940f4.m19876g(), c3940f4.m19874e().toString());
            this.f44991c = c3940f4.m19875f();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            C4436y6 c4436y6 = new C4436y6(this.f44991c, "background");
            if (!c4436y6.m21196h()) {
                long m20822c = this.f44990b.m20822c(-1L);
                if (m20822c != -1) {
                    c4436y6.m21190d(m20822c);
                }
                long m20817a = this.f44990b.m20817a(Long.MIN_VALUE);
                if (m20817a != Long.MIN_VALUE) {
                    c4436y6.m21183a(m20817a);
                }
                long m20820b = this.f44990b.m20820b(0L);
                if (m20820b != 0) {
                    c4436y6.m21188c(m20820b);
                }
                long m20823d = this.f44990b.m20823d(0L);
                if (m20823d != 0) {
                    c4436y6.m21192e(m20823d);
                }
                c4436y6.m21187b();
            }
            C4436y6 c4436y62 = new C4436y6(this.f44991c, "foreground");
            if (!c4436y62.m21196h()) {
                long m20827g = this.f44990b.m20827g(-1L);
                if (-1 != m20827g) {
                    c4436y62.m21190d(m20827g);
                }
                boolean booleanValue = this.f44990b.m20819a(true).booleanValue();
                if (booleanValue) {
                    c4436y62.m21184a(booleanValue);
                }
                long m20824e = this.f44990b.m20824e(Long.MIN_VALUE);
                if (m20824e != Long.MIN_VALUE) {
                    c4436y62.m21183a(m20824e);
                }
                long m20825f = this.f44990b.m20825f(0L);
                if (m20825f != 0) {
                    c4436y62.m21188c(m20825f);
                }
                long m20829h = this.f44990b.m20829h(0L);
                if (m20829h != 0) {
                    c4436y62.m21192e(m20829h);
                }
                c4436y62.m21187b();
            }
            C3156A.a m20826f = this.f44990b.m20826f();
            if (m20826f != null) {
                this.f44991c.m18133a(m20826f);
            }
            String m20821b = this.f44990b.m20821b((String) null);
            if (!TextUtils.isEmpty(m20821b) && TextUtils.isEmpty(this.f44991c.m18152m())) {
                this.f44991c.m18147i(m20821b);
            }
            long m20831i = this.f44990b.m20831i(Long.MIN_VALUE);
            if (m20831i != Long.MIN_VALUE && this.f44991c.m18135b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f44991c.m18136c(m20831i);
            }
            this.f44990b.m20830h();
            this.f44991c.m18227c();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return this.f44990b.m20828g();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$d */
    public static class d extends k {
        public d(C3940f4 c3940f4, C4210pe c4210pe) {
            super(c3940f4, c4210pe);
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            m19791d().m20549a();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return m19790a() instanceof C4174o4;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$e */
    public static class e extends j {

        /* renamed from: b */
        private final C4236qe f44992b;

        /* renamed from: c */
        private final C3266E9 f44993c;

        public e(C3940f4 c3940f4, C4236qe c4236qe) {
            super(c3940f4);
            this.f44992b = c4236qe;
            this.f44993c = c3940f4.m19884o();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            if ("DONE".equals(this.f44992b.m20580c(null))) {
                this.f44993c.m18011i();
            }
            if ("DONE".equals(this.f44992b.m20582d(null))) {
                this.f44993c.m18012j();
            }
            this.f44992b.m20585h();
            this.f44992b.m20584g();
            this.f44992b.m20586i();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return "DONE".equals(this.f44992b.m20580c(null)) || "DONE".equals(this.f44992b.m20582d(null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$f */
    public static class f extends k {
        public f(C3940f4 c3940f4, C4210pe c4210pe) {
            super(c3940f4, c4210pe);
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            C4210pe m19791d = m19791d();
            if (m19790a() instanceof C4174o4) {
                m19791d.m20551b();
            } else {
                m19791d.m20552c();
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return m19790a().m19884o().m18007f(null) == null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$g */
    public static class g extends j {

        /* renamed from: b */
        @NonNull
        private final C3366I9 f44994b;

        @VisibleForTesting
        public g(@NonNull C3940f4 c3940f4, @NonNull C3366I9 c3366i9) {
            super(c3940f4);
            this.f44994b = c3366i9;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            if (this.f44994b.m18219a(new C4444ye("REFERRER_HANDLED", null).m21201a(), false)) {
                m19790a().m19875f().m18155p();
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$h */
    public static class h extends j {

        /* renamed from: c */
        @Deprecated
        public static final C4444ye f44995c = new C4444ye("SESSION_SLEEP_START", null);

        /* renamed from: d */
        @Deprecated
        public static final C4444ye f44996d = new C4444ye("SESSION_ID", null);

        /* renamed from: e */
        @Deprecated
        public static final C4444ye f44997e = new C4444ye("SESSION_COUNTER_ID", null);

        /* renamed from: f */
        @Deprecated
        public static final C4444ye f44998f = new C4444ye("SESSION_INIT_TIME", null);

        /* renamed from: g */
        @Deprecated
        public static final C4444ye f44999g = new C4444ye("SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* renamed from: h */
        @Deprecated
        public static final C4444ye f45000h = new C4444ye("BG_SESSION_ID", null);

        /* renamed from: i */
        @Deprecated
        public static final C4444ye f45001i = new C4444ye("BG_SESSION_SLEEP_START", null);

        /* renamed from: j */
        @Deprecated
        public static final C4444ye f45002j = new C4444ye("BG_SESSION_COUNTER_ID", null);

        /* renamed from: k */
        @Deprecated
        public static final C4444ye f45003k = new C4444ye("BG_SESSION_INIT_TIME", null);

        /* renamed from: l */
        @Deprecated
        public static final C4444ye f45004l = new C4444ye("BG_SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* renamed from: b */
        private final C3316G9 f45005b;

        public h(C3940f4 c3940f4) {
            super(c3940f4);
            this.f45005b = c3940f4.m19875f();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            C3316G9 c3316g9 = this.f45005b;
            C4444ye c4444ye = f45001i;
            long m18216a = c3316g9.m18216a(c4444ye.m21201a(), ParserMinimalBase.MIN_INT_L);
            if (m18216a != ParserMinimalBase.MIN_INT_L) {
                C4436y6 c4436y6 = new C4436y6(this.f45005b, "background");
                if (!c4436y6.m21196h()) {
                    if (m18216a != 0) {
                        c4436y6.m21192e(m18216a);
                    }
                    long m18216a2 = this.f45005b.m18216a(f45000h.m21201a(), -1L);
                    if (m18216a2 != -1) {
                        c4436y6.m21190d(m18216a2);
                    }
                    boolean m18219a = this.f45005b.m18219a(f45004l.m21201a(), true);
                    if (m18219a) {
                        c4436y6.m21184a(m18219a);
                    }
                    long m18216a3 = this.f45005b.m18216a(f45003k.m21201a(), Long.MIN_VALUE);
                    if (m18216a3 != Long.MIN_VALUE) {
                        c4436y6.m21183a(m18216a3);
                    }
                    long m18216a4 = this.f45005b.m18216a(f45002j.m21201a(), 0L);
                    if (m18216a4 != 0) {
                        c4436y6.m21188c(m18216a4);
                    }
                    c4436y6.m21187b();
                }
            }
            C3316G9 c3316g92 = this.f45005b;
            C4444ye c4444ye2 = f44995c;
            long m18216a5 = c3316g92.m18216a(c4444ye2.m21201a(), ParserMinimalBase.MIN_INT_L);
            if (m18216a5 != ParserMinimalBase.MIN_INT_L) {
                C4436y6 c4436y62 = new C4436y6(this.f45005b, "foreground");
                if (!c4436y62.m21196h()) {
                    if (m18216a5 != 0) {
                        c4436y62.m21192e(m18216a5);
                    }
                    long m18216a6 = this.f45005b.m18216a(f44996d.m21201a(), -1L);
                    if (-1 != m18216a6) {
                        c4436y62.m21190d(m18216a6);
                    }
                    boolean m18219a2 = this.f45005b.m18219a(f44999g.m21201a(), true);
                    if (m18219a2) {
                        c4436y62.m21184a(m18219a2);
                    }
                    long m18216a7 = this.f45005b.m18216a(f44998f.m21201a(), Long.MIN_VALUE);
                    if (m18216a7 != Long.MIN_VALUE) {
                        c4436y62.m21183a(m18216a7);
                    }
                    long m18216a8 = this.f45005b.m18216a(f44997e.m21201a(), 0L);
                    if (m18216a8 != 0) {
                        c4436y62.m21188c(m18216a8);
                    }
                    c4436y62.m21187b();
                }
            }
            this.f45005b.m18230e(c4444ye2.m21201a());
            this.f45005b.m18230e(f44996d.m21201a());
            this.f45005b.m18230e(f44997e.m21201a());
            this.f45005b.m18230e(f44998f.m21201a());
            this.f45005b.m18230e(f44999g.m21201a());
            this.f45005b.m18230e(f45000h.m21201a());
            this.f45005b.m18230e(c4444ye.m21201a());
            this.f45005b.m18230e(f45002j.m21201a());
            this.f45005b.m18230e(f45003k.m21201a());
            this.f45005b.m18230e(f45004l.m21201a());
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$i */
    public static class i extends j {

        /* renamed from: b */
        @NonNull
        private final C3266E9 f45006b;

        /* renamed from: c */
        @NonNull
        private final C3316G9 f45007c;

        /* renamed from: d */
        @NonNull
        private final C3365I8 f45008d;

        /* renamed from: e */
        @NonNull
        private final String f45009e;

        /* renamed from: f */
        @NonNull
        private final String f45010f;

        /* renamed from: g */
        @NonNull
        private final String f45011g;

        /* renamed from: h */
        @NonNull
        private final String f45012h;

        /* renamed from: i */
        @NonNull
        private final String f45013i;

        public i(C3940f4 c3940f4) {
            super(c3940f4);
            this.f45009e = new C4444ye("LAST_REQUEST_ID").m21201a();
            this.f45010f = new C4444ye("NEXT_EVENT_GLOBAL_NUMBER").m21201a();
            this.f45011g = new C4444ye("CURRENT_SESSION_ID").m21201a();
            this.f45012h = new C4444ye("ATTRIBUTION_ID").m21201a();
            this.f45013i = new C4444ye("OPEN_ID").m21201a();
            this.f45006b = c3940f4.m19884o();
            this.f45007c = c3940f4.m19875f();
            this.f45008d = c3940f4.m19891w();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f45007c.m18229d()) {
                if (str.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(str.substring(21))), this.f45007c.m18215a(str, 0));
                        this.f45007c.m18230e(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f45008d.m18254a(this.f45006b.m18006e(), this.f45006b.m18008f(), this.f45007c.m18225b(this.f45009e) ? Integer.valueOf(this.f45007c.m18215a(this.f45009e, -1)) : null, this.f45007c.m18225b(this.f45010f) ? Integer.valueOf(this.f45007c.m18215a(this.f45010f, 0)) : null, this.f45007c.m18225b(this.f45011g) ? Long.valueOf(this.f45007c.m18216a(this.f45011g, -1L)) : null, this.f45007c.m18158s(), jSONObject, this.f45007c.m18225b(this.f45013i) ? Integer.valueOf(this.f45007c.m18215a(this.f45013i, 1)) : null, this.f45007c.m18225b(this.f45012h) ? Integer.valueOf(this.f45007c.m18215a(this.f45012h, 1)) : null, this.f45007c.m18148i());
            this.f45006b.m18009g().m18010h().m18227c();
            this.f45007c.m18157r().m18156q().m18230e(this.f45009e).m18230e(this.f45010f).m18230e(this.f45011g).m18230e(this.f45012h).m18230e(this.f45013i).m18227c();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$j */
    public static abstract class j {

        /* renamed from: a */
        private final C3940f4 f45014a;

        public j(C3940f4 c3940f4) {
            this.f45014a = c3940f4;
        }

        /* renamed from: a */
        public C3940f4 m19790a() {
            return this.f45014a;
        }

        /* renamed from: b */
        public abstract void mo19788b();

        /* renamed from: c */
        public abstract boolean mo19789c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$k */
    public static abstract class k extends j {

        /* renamed from: b */
        private C4210pe f45015b;

        public k(C3940f4 c3940f4, C4210pe c4210pe) {
            super(c3940f4);
            this.f45015b = c4210pe;
        }

        /* renamed from: d */
        public C4210pe m19791d() {
            return this.f45015b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$l */
    public static class l extends j {

        /* renamed from: b */
        private final C3266E9 f45016b;

        public l(C3940f4 c3940f4) {
            super(c3940f4);
            this.f45016b = c3940f4.m19884o();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: b */
        public void mo19788b() {
            this.f45016b.m18230e(new C4444ye("first_event_description_key", null).m21201a()).m18227c();
        }

        @Override // com.yandex.metrica.impl.p023ob.C3914e4.j
        /* renamed from: c */
        public boolean mo19789c() {
            return true;
        }
    }

    /* renamed from: b */
    private void m19785b() {
        LinkedList linkedList = new LinkedList();
        this.f44988c = linkedList;
        linkedList.add(new d(this.f44986a, this.f44987b));
        this.f44988c.add(new f(this.f44986a, this.f44987b));
        List<j> list = this.f44988c;
        C3940f4 c3940f4 = this.f44986a;
        list.add(new e(c3940f4, c3940f4.m19883n()));
        this.f44988c.add(new c(this.f44986a));
        this.f44988c.add(new h(this.f44986a));
        List<j> list2 = this.f44988c;
        C3940f4 c3940f42 = this.f44986a;
        list2.add(new g(c3940f42, c3940f42.m19888t()));
        this.f44988c.add(new l(this.f44986a));
        this.f44988c.add(new i(this.f44986a));
    }

    /* renamed from: a */
    public void m19786a() {
        if (C4210pe.f46141b.values().contains(this.f44986a.m19874e().m19668a())) {
            return;
        }
        for (j jVar : this.f44988c) {
            if (jVar.mo19789c()) {
                jVar.mo19788b();
            }
        }
    }

    private C3914e4(C3940f4 c3940f4, C4210pe c4210pe) {
        this.f44986a = c3940f4;
        this.f44987b = c4210pe;
        m19785b();
    }
}
