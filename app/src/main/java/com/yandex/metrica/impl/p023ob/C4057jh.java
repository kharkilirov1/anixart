package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3901dh;
import com.yandex.metrica.impl.p023ob.C3979gh;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.jh */
/* loaded from: classes2.dex */
public class C4057jh extends C3979gh {

    /* renamed from: A */
    private String f45425A;

    /* renamed from: B */
    private List<String> f45426B;

    /* renamed from: C */
    private int f45427C;

    /* renamed from: D */
    private long f45428D;

    /* renamed from: E */
    private long f45429E;

    /* renamed from: F */
    private boolean f45430F;

    /* renamed from: G */
    private long f45431G;

    /* renamed from: H */
    @Nullable
    private List<String> f45432H;

    /* renamed from: o */
    private boolean f45433o;

    /* renamed from: p */
    private Location f45434p;

    /* renamed from: q */
    private boolean f45435q;

    /* renamed from: r */
    private int f45436r;

    /* renamed from: s */
    private int f45437s;

    /* renamed from: t */
    private int f45438t;

    /* renamed from: u */
    private Boolean f45439u;

    /* renamed from: v */
    private e f45440v;

    /* renamed from: w */
    @NonNull
    private final d f45441w;

    /* renamed from: x */
    private String f45442x;

    /* renamed from: y */
    private boolean f45443y;

    /* renamed from: z */
    private boolean f45444z;

    /* renamed from: com.yandex.metrica.impl.ob.jh$a */
    public static final class a extends C3901dh.a<C3734X3.a, a> {

        /* renamed from: d */
        @Nullable
        public final String f45445d;

        /* renamed from: e */
        @Nullable
        public final Location f45446e;

        /* renamed from: f */
        public final boolean f45447f;

        /* renamed from: g */
        public final boolean f45448g;

        /* renamed from: h */
        public final int f45449h;

        /* renamed from: i */
        public final int f45450i;

        /* renamed from: j */
        public final int f45451j;

        /* renamed from: k */
        public final boolean f45452k;

        /* renamed from: l */
        public final boolean f45453l;

        /* renamed from: m */
        @Nullable
        public final Map<String, String> f45454m;

        /* renamed from: n */
        public final int f45455n;

        public a(@NonNull C3734X3.a aVar) {
            this(aVar.f44444a, aVar.f44445b, aVar.f44446c, aVar.f44447d, aVar.f44448e, aVar.f44449f, aVar.f44450g, aVar.f44451h, aVar.f44452i, aVar.f44453j, aVar.f44454k, aVar.f44455l, aVar.f44456m, aVar.f44457n);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        @NonNull
        /* renamed from: a */
        public Object mo19381a(@NonNull Object obj) {
            C3734X3.a aVar = (C3734X3.a) obj;
            String str = aVar.f44444a;
            String str2 = this.f44963a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f44445b;
            String str4 = this.f44964b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f44446c;
            String str6 = this.f44965c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f44447d;
            String str8 = this.f45445d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f44448e;
            Boolean valueOf = Boolean.valueOf(this.f45447f);
            if (bool != null) {
                valueOf = bool;
            }
            Location location = aVar.f44449f;
            Location location2 = this.f45446e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.f44450g;
            Boolean valueOf2 = Boolean.valueOf(this.f45448g);
            if (bool2 != null) {
                valueOf2 = bool2;
            }
            Integer num = aVar.f44451h;
            Integer valueOf3 = Integer.valueOf(this.f45449h);
            if (num != null) {
                valueOf3 = num;
            }
            Integer num2 = aVar.f44452i;
            Integer valueOf4 = Integer.valueOf(this.f45450i);
            if (num2 != null) {
                valueOf4 = num2;
            }
            Integer num3 = aVar.f44453j;
            Integer valueOf5 = Integer.valueOf(this.f45451j);
            if (num3 != null) {
                valueOf5 = num3;
            }
            Boolean bool3 = aVar.f44454k;
            Boolean valueOf6 = Boolean.valueOf(this.f45452k);
            if (bool3 != null) {
                valueOf6 = bool3;
            }
            Boolean bool4 = aVar.f44455l;
            Boolean valueOf7 = Boolean.valueOf(this.f45453l);
            if (bool4 != null) {
                valueOf7 = bool4;
            }
            Map<String, String> map = aVar.f44456m;
            Map<String, String> map2 = this.f45454m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.f44457n;
            return new a(str2, str4, str6, str8, valueOf, location2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, map2, num4 == null ? Integer.valueOf(this.f45455n) : num4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
        
            if (r9.getExtras() != null) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01a3, code lost:
        
            if (r0.getExtras() == null) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01a5, code lost:
        
            r9 = r0.getExtras().equals(r9.getExtras());
         */
        /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo19382b(@androidx.annotation.NonNull java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4057jh.a.mo19382b(java.lang.Object):boolean");
        }

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Location location, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Map<String, String> map, @Nullable Integer num4) {
            super(str, str2, str3);
            this.f45445d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f45447f = ((Boolean) C4452ym.m21236a(bool, bool5)).booleanValue();
            this.f45446e = location;
            this.f45448g = ((Boolean) C4452ym.m21236a(bool2, bool5)).booleanValue();
            this.f45449h = Math.max(10, ((Integer) C4452ym.m21236a((int) num, 10)).intValue());
            this.f45450i = ((Integer) C4452ym.m21236a((int) num2, 7)).intValue();
            this.f45451j = ((Integer) C4452ym.m21236a((int) num3, 90)).intValue();
            this.f45452k = ((Boolean) C4452ym.m21236a(bool3, bool5)).booleanValue();
            this.f45453l = ((Boolean) C4452ym.m21236a(bool4, Boolean.TRUE)).booleanValue();
            this.f45454m = map;
            this.f45455n = ((Integer) C4452ym.m21236a((int) num4, 1000)).intValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$b */
    public static abstract class b implements e {

        /* renamed from: a */
        @NonNull
        public final C3459M2 f45456a;

        public b(@NonNull C3459M2 c3459m2) {
            this.f45456a = c3459m2;
        }

        @Override // com.yandex.metrica.impl.p023ob.C4057jh.e
        /* renamed from: a */
        public boolean mo20133a(@Nullable Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$c */
    public static class c extends C3979gh.a<C4057jh, a> {

        /* renamed from: d */
        @NonNull
        private final C3940f4 f45457d;

        /* renamed from: e */
        @NonNull
        private final e f45458e;

        /* renamed from: f */
        @NonNull
        private final C4266ri f45459f;

        public c(@NonNull C3940f4 c3940f4, @NonNull e eVar) {
            this(c3940f4, eVar, new C4266ri());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.p023ob.C3901dh.d
        @NonNull
        /* renamed from: a */
        public C3901dh mo18753a(@NonNull Object obj) {
            C3901dh.c cVar = (C3901dh.c) obj;
            C4057jh m19972a = m19972a(cVar);
            C4057jh.m20096a(m19972a, ((a) cVar.f44969b).f45445d);
            m19972a.m20116a(this.f45457d.m19891w().m18258c());
            m19972a.m20120a(this.f45457d.m19873d().m18693a());
            m19972a.m20130d(((a) cVar.f44969b).f45447f);
            m19972a.m20118a(((a) cVar.f44969b).f45446e);
            m19972a.m20128c(((a) cVar.f44969b).f45448g);
            m19972a.m20129d(((a) cVar.f44969b).f45449h);
            m19972a.m20126c(((a) cVar.f44969b).f45450i);
            m19972a.m20122b(((a) cVar.f44969b).f45451j);
            a aVar = (a) cVar.f44969b;
            boolean z = aVar.f45452k;
            m19972a.m20119a(Boolean.valueOf(aVar.f45453l), this.f45458e);
            m19972a.m20117a(((a) cVar.f44969b).f45455n);
            C3575Qi c3575Qi = cVar.f44968a;
            a aVar2 = (a) cVar.f44969b;
            m19972a.m20124b(c3575Qi.m18868z().contains(aVar2.f45445d) ? c3575Qi.m18820A() : c3575Qi.m18827H());
            m19972a.m20131e(c3575Qi.m18848f().f46403c);
            if (c3575Qi.m18825F() != null) {
                m19972a.m20123b(c3575Qi.m18825F().f42562a);
                m19972a.m20127c(c3575Qi.m18825F().f42563b);
            }
            m19972a.m20125b(c3575Qi.m18848f().f46404d);
            m19972a.m20132h(c3575Qi.m18857o());
            m19972a.m20121a(this.f45459f.m20665a(aVar2.f45454m, c3575Qi, C3532P0.m18696i().m18703e()));
            return m19972a;
        }

        @VisibleForTesting
        public c(@NonNull C3940f4 c3940f4, @NonNull e eVar, @NonNull C4266ri c4266ri) {
            super(c3940f4.m19876g(), c3940f4.m19874e().m19669b());
            this.f45457d = c3940f4;
            this.f45458e = eVar;
            this.f45459f = c4266ri;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3901dh.b
        @NonNull
        /* renamed from: a */
        public C3901dh mo19389a() {
            return new C4057jh(this.f45457d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$d */
    public interface d {
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$e */
    public interface e {
        /* renamed from: a */
        boolean mo20133a(@Nullable Boolean bool);
    }

    @VisibleForTesting
    public C4057jh(@NonNull d dVar) {
        this.f45441w = dVar;
    }

    /* renamed from: a */
    public static void m20096a(C4057jh c4057jh, String str) {
        c4057jh.f45442x = str;
    }

    /* renamed from: C */
    public String m20097C() {
        return this.f45442x;
    }

    /* renamed from: D */
    public int m20098D() {
        return this.f45427C;
    }

    @Nullable
    /* renamed from: E */
    public List<String> m20099E() {
        return this.f45432H;
    }

    @NonNull
    /* renamed from: F */
    public String m20100F() {
        String str = this.f45425A;
        return str == null ? "" : str;
    }

    /* renamed from: G */
    public boolean m20101G() {
        return this.f45440v.mo20133a(this.f45439u);
    }

    /* renamed from: H */
    public int m20102H() {
        return this.f45437s;
    }

    /* renamed from: I */
    public Location m20103I() {
        return this.f45434p;
    }

    /* renamed from: J */
    public int m20104J() {
        return this.f45438t;
    }

    /* renamed from: K */
    public long m20105K() {
        return this.f45431G;
    }

    /* renamed from: L */
    public long m20106L() {
        return this.f45428D;
    }

    /* renamed from: M */
    public long m20107M() {
        return this.f45429E;
    }

    /* renamed from: N */
    public List<String> m20108N() {
        return this.f45426B;
    }

    /* renamed from: O */
    public int m20109O() {
        return this.f45436r;
    }

    /* renamed from: P */
    public boolean m20110P() {
        return this.f45444z;
    }

    /* renamed from: Q */
    public boolean m20111Q() {
        return this.f45435q;
    }

    /* renamed from: R */
    public boolean m20112R() {
        return this.f45433o;
    }

    /* renamed from: S */
    public boolean m20113S() {
        return this.f45443y;
    }

    /* renamed from: T */
    public boolean m20114T() {
        return m19769y() && !C3658U2.m19217b(this.f45426B) && this.f45430F;
    }

    /* renamed from: U */
    public boolean m20115U() {
        return ((C3940f4) this.f45441w).m19866E();
    }

    /* renamed from: b */
    public void m20124b(List<String> list) {
        this.f45426B = list;
    }

    /* renamed from: c */
    public void m20127c(long j2) {
        this.f45429E = j2;
    }

    /* renamed from: d */
    public void m20130d(boolean z) {
        this.f45433o = z;
    }

    /* renamed from: e */
    public void m20131e(boolean z) {
        this.f45443y = z;
    }

    /* renamed from: h */
    public void m20132h(String str) {
        this.f45425A = str;
    }

    /* renamed from: a */
    public void m20118a(Location location) {
        this.f45434p = location;
    }

    /* renamed from: b */
    public void m20123b(long j2) {
        this.f45428D = j2;
    }

    /* renamed from: c */
    public void m20128c(boolean z) {
        this.f45435q = z;
    }

    /* renamed from: d */
    public void m20129d(int i2) {
        this.f45436r = i2;
    }

    /* renamed from: a */
    public void m20116a(int i2) {
        this.f45427C = i2;
    }

    /* renamed from: b */
    public void m20125b(boolean z) {
        this.f45444z = z;
    }

    /* renamed from: c */
    public void m20126c(int i2) {
        this.f45438t = i2;
    }

    /* renamed from: a */
    public void m20117a(long j2) {
        this.f45431G = j2;
    }

    /* renamed from: b */
    public void m20122b(int i2) {
        this.f45437s = i2;
    }

    /* renamed from: a */
    public void m20120a(@NonNull List<String> list) {
        this.f45432H = list;
    }

    /* renamed from: a */
    public void m20119a(@Nullable Boolean bool, @NonNull e eVar) {
        this.f45439u = bool;
        this.f45440v = eVar;
    }

    /* renamed from: a */
    public void m20121a(boolean z) {
        this.f45430F = z;
    }
}
