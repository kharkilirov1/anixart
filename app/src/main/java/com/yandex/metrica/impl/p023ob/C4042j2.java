package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.AbstractC3632T1;
import com.yandex.metrica.impl.p023ob.C3156A;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j2 */
/* loaded from: classes2.dex */
class C4042j2 extends AbstractC3657U1<C4239qh> {

    /* renamed from: A */
    private final InterfaceC3555Pn<byte[]> f45366A;

    /* renamed from: B */
    private final C3379Im f45367B;

    /* renamed from: C */
    @Nullable
    private C4057jh f45368C;

    /* renamed from: D */
    @NonNull
    private final C3365I8 f45369D;

    /* renamed from: E */
    @NonNull
    private final InterfaceC3706W0 f45370E;

    /* renamed from: F */
    private int f45371F;

    /* renamed from: r */
    @NonNull
    private final C3940f4 f45372r;

    /* renamed from: s */
    private final Map<String, String> f45373s;

    /* renamed from: t */
    private C4005hh f45374t;

    /* renamed from: u */
    public C3696Vf f45375u;

    /* renamed from: v */
    public C4308t8 f45376v;

    /* renamed from: w */
    public List<Long> f45377w;

    /* renamed from: x */
    public int f45378x;

    /* renamed from: y */
    public int f45379y;

    /* renamed from: z */
    private b f45380z;

    /* renamed from: com.yandex.metrica.impl.ob.j2$a */
    public static final class a {

        /* renamed from: a */
        public final C3696Vf.d f45381a;

        /* renamed from: b */
        public final C3156A.a f45382b;

        /* renamed from: c */
        public final boolean f45383c;

        public a(C3696Vf.d dVar, C3156A.a aVar, boolean z) {
            this.f45381a = dVar;
            this.f45382b = aVar;
            this.f45383c = z;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j2$b */
    public static final class b {

        /* renamed from: a */
        public final List<C3696Vf.d> f45384a;

        /* renamed from: b */
        public final List<Long> f45385b;

        /* renamed from: c */
        public final JSONObject f45386c;

        public b(List<C3696Vf.d> list, List<Long> list2, JSONObject jSONObject) {
            this.f45384a = list;
            this.f45385b = list2;
            this.f45386c = jSONObject;
        }
    }

    public C4042j2(C3940f4 c3940f4) {
        this(c3940f4, c3940f4.m19878i(), c3940f4.m19886q(), c3940f4.m19891w());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: A */
    public boolean mo18504A() {
        return super.mo18504A() & (!m19126m());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1
    /* renamed from: C */
    public void mo18505C() {
        m20078a(false);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1
    /* renamed from: D */
    public void mo18506D() {
        m20078a(true);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: a */
    public void mo18427a(@NonNull Uri.Builder builder) {
        ((C4239qh) this.f44039j).m20597a(builder, this.f45368C);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: b */
    public AbstractC3632T1.a mo18428b() {
        return AbstractC3632T1.a.REPORT;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: b */
    public void mo18429b(@Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: j */
    public C3225Ci mo18430j() {
        return this.f45372r.m19882m().m19762r();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01e4 A[LOOP:2: B:45:0x01de->B:47:0x01e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo18431o() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4042j2.mo18431o():boolean");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3657U1, com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: r */
    public boolean mo18432r() {
        boolean mo18432r = super.mo18432r();
        if (mo18432r && this.f45367B.m21337c()) {
            for (int i2 = 0; i2 < this.f45380z.f45384a.size(); i2++) {
                this.f45367B.m18339a(this.f45380z.f45384a.get(i2), "Event sent");
            }
        }
        return mo18432r;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: t */
    public void mo18434t() {
        this.f45372r.m19881l().m19273c();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: v */
    public boolean mo19131v() {
        this.f45372r.m19881l().m19271a();
        return true;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: w */
    public void mo19132w() {
        this.f45372r.m19878i().m20799a();
        this.f45372r.m19881l().m19272b();
        super.mo19132w();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: x */
    public void mo19133x() {
        this.f45372r.m19881l().m19272b();
        super.mo19133x();
    }

    /* renamed from: a */
    private C3696Vf.a[] m20079a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C3696Vf.a[] aVarArr = new C3696Vf.a[length];
        Iterator<String> keys = jSONObject.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C3696Vf.a aVar = new C3696Vf.a();
                aVar.f44236b = next;
                aVar.f44237c = jSONObject.getString(next);
                aVarArr[i2] = aVar;
            } catch (Throwable unused) {
            }
            i2++;
        }
        return aVarArr;
    }

    private C4042j2(@NonNull C3940f4 c3940f4, @NonNull C4308t8 c4308t8, @NonNull C3379Im c3379Im, @NonNull C3365I8 c3365i8) {
        this(c3940f4, c3379Im, c4308t8, new C4239qh(), c3365i8, new C3255Dn(1024000, "event value in ReportTask", c3379Im), C3524Oh.m18679a());
    }

    @VisibleForTesting
    public C4042j2(@NonNull C3940f4 c3940f4, @NonNull C3379Im c3379Im, @NonNull C4308t8 c4308t8, @NonNull C4239qh c4239qh, @NonNull C3365I8 c3365i8, @NonNull C3255Dn c3255Dn, @NonNull InterfaceC3706W0 interfaceC3706W0) {
        super(c4239qh);
        this.f45373s = new LinkedHashMap();
        this.f45378x = 0;
        this.f45379y = -1;
        this.f45372r = c3940f4;
        this.f45376v = c4308t8;
        this.f45367B = c3379Im;
        this.f45366A = c3255Dn;
        this.f45369D = c3365i8;
        this.f45370E = interfaceC3706W0;
    }

    /* renamed from: a */
    private void m20078a(boolean z) {
        this.f45369D.m18259c(this.f45371F);
        C3696Vf.d[] dVarArr = this.f45375u.f44230b;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            try {
                C3696Vf.d dVar = dVarArr[i2];
                this.f45376v.m20800a(this.f45377w.get(i2).longValue(), C3886d2.m19697a(dVar.f44265c.f44300d).m21291a(), dVar.f44266d.length, z);
                int i3 = C3886d2.f44899e;
            } catch (Throwable unused) {
            }
        }
        this.f45376v.m20795a(this.f45372r.m19889u().m20919a());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:6:0x001f, B:7:0x0025, B:9:0x002d, B:19:0x0052, B:22:0x005e, B:25:0x006d, B:27:0x0076, B:74:0x0098, B:30:0x00a8, B:32:0x00b6, B:37:0x00c2, B:38:0x00c1, B:39:0x00bc, B:40:0x00c8, B:45:0x00df, B:62:0x00e6, B:78:0x00a1, B:52:0x00f8, B:54:0x00fe, B:60:0x00f2, B:85:0x004c, B:91:0x0113, B:93:0x0117), top: B:4:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C4042j2.a m20080a(long r17, com.yandex.metrica.impl.p023ob.C3696Vf.d.b r19, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4057jh r20, @androidx.annotation.NonNull java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4042j2.m20080a(long, com.yandex.metrica.impl.ob.Vf$d$b, com.yandex.metrica.impl.ob.jh, java.util.List, int):com.yandex.metrica.impl.ob.j2$a");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @NonNull
    /* renamed from: a */
    public String mo18426a() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(C4042j2.class, sb, "_");
        sb.append(this.f45372r.m19874e().m19668a());
        return sb.toString();
    }
}
