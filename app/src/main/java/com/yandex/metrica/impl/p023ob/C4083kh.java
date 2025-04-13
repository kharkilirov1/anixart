package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3535P3;
import com.yandex.metrica.impl.p023ob.C3901dh;
import com.yandex.metrica.impl.p023ob.C3979gh;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.kh */
/* loaded from: classes2.dex */
public class C4083kh extends C3979gh {

    /* renamed from: o */
    @Nullable
    private List<String> f45820o;

    /* renamed from: p */
    @Nullable
    private List<String> f45821p;

    /* renamed from: q */
    @Nullable
    private String f45822q;

    /* renamed from: r */
    @Nullable
    private String f45823r;

    /* renamed from: s */
    @Nullable
    private Map<String, String> f45824s;

    /* renamed from: t */
    @NonNull
    private C3535P3.a f45825t;

    /* renamed from: u */
    @Nullable
    private List<String> f45826u;

    /* renamed from: v */
    private boolean f45827v;

    /* renamed from: w */
    private boolean f45828w;

    /* renamed from: x */
    private String f45829x;

    /* renamed from: y */
    private long f45830y;

    /* renamed from: z */
    @NonNull
    private final C3672Ug f45831z;

    /* renamed from: com.yandex.metrica.impl.ob.kh$b */
    public static class b extends C3901dh.a<b, b> {

        /* renamed from: d */
        @Nullable
        public final String f45832d;

        /* renamed from: e */
        @Nullable
        public final String f45833e;

        /* renamed from: f */
        @Nullable
        public final Map<String, String> f45834f;

        /* renamed from: g */
        public final boolean f45835g;

        /* renamed from: h */
        @Nullable
        public final List<String> f45836h;

        public b(@NonNull C3634T3 c3634t3) {
            this(c3634t3.m19136b().f42234b.getAsString("CFG_DEVICE_SIZE_TYPE"), c3634t3.m19136b().f42234b.getAsString("CFG_APP_VERSION"), c3634t3.m19136b().f42234b.getAsString("CFG_APP_VERSION_CODE"), c3634t3.m19135a().m19230d(), c3634t3.m19135a().m19231e(), c3634t3.m19135a().m19222a(), c3634t3.m19135a().m19236j(), c3634t3.m19135a().m19226b());
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo19382b(@NonNull Object obj) {
            return false;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo19381a(@NonNull b bVar) {
            String str = this.f44963a;
            String str2 = bVar.f44963a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f44964b;
            String str4 = bVar.f44964b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f44965c;
            String str6 = bVar.f44965c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f45832d;
            String str8 = bVar.f45832d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f45833e;
            String str10 = bVar.f45833e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f45834f;
            Map<String, String> map2 = bVar.f45834f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.f45835g || bVar.f45835g, bVar.f45835g ? bVar.f45836h : this.f45836h);
        }

        public b(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, boolean z, @Nullable List<String> list) {
            super(str, str2, str3);
            this.f45832d = str4;
            this.f45833e = str5;
            this.f45834f = map;
            this.f45835g = z;
            this.f45836h = list;
        }

        public b() {
            this(null, null, null, null, null, null, false, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kh$c */
    public static class c extends C3979gh.a<C4083kh, b> {

        /* renamed from: d */
        @NonNull
        private final C3556Q f45837d;

        public c(@NonNull Context context, @NonNull String str) {
            this(context, str, new C3729Wn(), C3532P0.m18696i().m18703e());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.p023ob.C3901dh.d
        /* renamed from: a */
        public C3901dh mo18753a(@NonNull Object obj) {
            C3901dh.c cVar = (C3901dh.c) obj;
            C4083kh m19972a = m19972a(cVar);
            C3575Qi c3575Qi = cVar.f44968a;
            m19972a.m20301c(c3575Qi.m18862t());
            m19972a.m20299b(c3575Qi.m18861s());
            String str = ((b) cVar.f44969b).f45832d;
            if (str != null) {
                C4083kh.m20280a(m19972a, str);
                C4083kh.m20281b(m19972a, ((b) cVar.f44969b).f45833e);
            }
            Map<String, String> map = ((b) cVar.f44969b).f45834f;
            m19972a.m20296a(map);
            m19972a.m20294a(this.f45837d.m17846a(new C3535P3.a(map, EnumC3257E0.APP)));
            m19972a.m20297a(((b) cVar.f44969b).f45835g);
            m19972a.m20295a(((b) cVar.f44969b).f45836h);
            m19972a.m20300b(cVar.f44968a.m18860r());
            m19972a.m20302h(cVar.f44968a.m18849g());
            m19972a.m20298b(cVar.f44968a.m18858p());
            return m19972a;
        }

        public c(@NonNull Context context, @NonNull String str, @NonNull C3729Wn c3729Wn, @NonNull C3556Q c3556q) {
            super(context, str, c3729Wn);
            this.f45837d = c3556q;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3901dh.b
        @NonNull
        /* renamed from: a */
        public C3901dh mo19389a() {
            return new C4083kh();
        }
    }

    @NonNull
    /* renamed from: C */
    public C3535P3.a m20282C() {
        return this.f45825t;
    }

    @Nullable
    /* renamed from: D */
    public Map<String, String> m20283D() {
        return this.f45824s;
    }

    /* renamed from: E */
    public String m20284E() {
        return this.f45829x;
    }

    @Nullable
    /* renamed from: F */
    public String m20285F() {
        return this.f45822q;
    }

    @Nullable
    /* renamed from: G */
    public String m20286G() {
        return this.f45823r;
    }

    @Nullable
    /* renamed from: H */
    public List<String> m20287H() {
        return this.f45826u;
    }

    @NonNull
    /* renamed from: I */
    public C3672Ug m20288I() {
        return this.f45831z;
    }

    /* renamed from: J */
    public List<String> m20289J() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!C3658U2.m19217b(this.f45820o)) {
            linkedHashSet.addAll(this.f45820o);
        }
        if (!C3658U2.m19217b(this.f45821p)) {
            linkedHashSet.addAll(this.f45821p);
        }
        linkedHashSet.add("https://startup.mobile.yandex.net/");
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: K */
    public List<String> m20290K() {
        return this.f45821p;
    }

    @Nullable
    /* renamed from: L */
    public boolean m20291L() {
        return this.f45827v;
    }

    /* renamed from: M */
    public boolean m20292M() {
        return this.f45828w;
    }

    /* renamed from: a */
    public long m20293a(long j2) {
        if (this.f45830y == 0) {
            this.f45830y = j2;
        }
        return this.f45830y;
    }

    /* renamed from: b */
    public void m20300b(boolean z) {
        this.f45828w = z;
    }

    /* renamed from: c */
    public void m20301c(@Nullable List<String> list) {
        this.f45820o = list;
    }

    /* renamed from: h */
    public void m20302h(String str) {
        this.f45829x = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3979gh
    public String toString() {
        StringBuilder m24u = C0000a.m24u("StartupRequestConfig{mStartupHostsFromStartup=");
        m24u.append(this.f45820o);
        m24u.append(", mStartupHostsFromClient=");
        m24u.append(this.f45821p);
        m24u.append(", mDistributionReferrer='");
        C0576a.m4100A(m24u, this.f45822q, '\'', ", mInstallReferrerSource='");
        C0576a.m4100A(m24u, this.f45823r, '\'', ", mClidsFromClient=");
        m24u.append(this.f45824s);
        m24u.append(", mNewCustomHosts=");
        m24u.append(this.f45826u);
        m24u.append(", mHasNewCustomHosts=");
        m24u.append(this.f45827v);
        m24u.append(", mSuccessfulStartup=");
        m24u.append(this.f45828w);
        m24u.append(", mCountryInit='");
        C0576a.m4100A(m24u, this.f45829x, '\'', ", mFirstStartupTime=");
        m24u.append(this.f45830y);
        m24u.append(", mReferrerHolder=");
        m24u.append(this.f45831z);
        m24u.append("} ");
        m24u.append(super.toString());
        return m24u.toString();
    }

    private C4083kh() {
        this(C3532P0.m18696i().m18712o());
    }

    /* renamed from: b */
    public void m20298b(long j2) {
        if (this.f45830y == 0) {
            this.f45830y = j2;
        }
    }

    @VisibleForTesting
    public C4083kh(@NonNull C3672Ug c3672Ug) {
        this.f45825t = new C3535P3.a(null, EnumC3257E0.APP);
        this.f45830y = 0L;
        this.f45831z = c3672Ug;
    }

    /* renamed from: a */
    public void m20296a(@Nullable Map<String, String> map) {
        this.f45824s = map;
    }

    /* renamed from: b */
    public void m20299b(@Nullable List<String> list) {
        this.f45821p = list;
    }

    /* renamed from: b */
    public static void m20281b(C4083kh c4083kh, String str) {
        c4083kh.f45823r = str;
    }

    /* renamed from: a */
    public void m20294a(@NonNull C3535P3.a aVar) {
        this.f45825t = aVar;
    }

    /* renamed from: a */
    public static void m20280a(C4083kh c4083kh, String str) {
        c4083kh.f45822q = str;
    }

    /* renamed from: a */
    public void m20295a(@Nullable List<String> list) {
        this.f45826u = list;
    }

    /* renamed from: a */
    public void m20297a(boolean z) {
        this.f45827v = z;
    }
}
