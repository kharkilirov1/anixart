package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import com.yandex.metrica.impl.p023ob.C3785Z4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.W4 */
/* loaded from: classes2.dex */
public class C3710W4 {

    /* renamed from: h */
    public static final Map<Integer, Integer> f44366h = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    @NonNull
    private final C4066k0 f44367a;

    /* renamed from: b */
    @NonNull
    private final C3735X4 f44368b;

    /* renamed from: c */
    @NonNull
    private final C3785Z4 f44369c;

    /* renamed from: d */
    @NonNull
    private final C3480Mn f44370d;

    /* renamed from: e */
    @NonNull
    private final C3480Mn f44371e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3529Om f44372f;

    /* renamed from: g */
    @NonNull
    private final C4018i4 f44373g;

    /* renamed from: com.yandex.metrica.impl.ob.W4$a */
    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(Integer.valueOf(EnumC4067k1.EVENT_TYPE_DIAGNOSTIC.m20218b()), 22);
            put(Integer.valueOf(EnumC4067k1.EVENT_TYPE_DIAGNOSTIC_STATBOX.m20218b()), 23);
            put(Integer.valueOf(EnumC4067k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.m20218b()), 24);
            put(Integer.valueOf(EnumC4067k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.m20218b()), 24);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.W4$b */
    public static class b {
    }

    public C3710W4(@NonNull C4066k0 c4066k0, @NonNull C3735X4 c3735x4, @NonNull C3785Z4 c3785z4, @NonNull C4018i4 c4018i4, @NonNull C3480Mn c3480Mn, @NonNull C3480Mn c3480Mn2, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f44367a = c4066k0;
        this.f44368b = c3735x4;
        this.f44369c = c3785z4;
        this.f44373g = c4018i4;
        this.f44371e = c3480Mn;
        this.f44370d = c3480Mn2;
        this.f44372f = interfaceC3529Om;
    }

    /* renamed from: a */
    public byte[] m19351a() {
        C3696Vf c3696Vf = new C3696Vf();
        C3696Vf.d dVar = new C3696Vf.d();
        c3696Vf.f44230b = new C3696Vf.d[]{dVar};
        C3785Z4.a m19504a = this.f44369c.m19504a();
        dVar.f44264b = m19504a.f44625a;
        C3696Vf.d.b bVar = new C3696Vf.d.b();
        dVar.f44265c = bVar;
        bVar.f44300d = 2;
        bVar.f44298b = new C3696Vf.f();
        C3696Vf.f fVar = dVar.f44265c.f44298b;
        long j2 = m19504a.f44626b;
        fVar.f44306b = j2;
        fVar.f44307c = C4013i.m20026a(j2);
        dVar.f44265c.f44299c = this.f44368b.m19756l();
        C3696Vf.d.a aVar = new C3696Vf.d.a();
        dVar.f44266d = new C3696Vf.d.a[]{aVar};
        aVar.f44268b = m19504a.f44627c;
        aVar.f44283q = this.f44373g.m20049a(this.f44367a.m20212n());
        aVar.f44269c = this.f44372f.mo18644b() - m19504a.f44626b;
        aVar.f44270d = f44366h.get(Integer.valueOf(this.f44367a.m20212n())).intValue();
        if (!TextUtils.isEmpty(this.f44367a.m20205g())) {
            aVar.f44271e = this.f44371e.mo17985a(this.f44367a.m20205g());
        }
        if (!TextUtils.isEmpty(this.f44367a.m20214p())) {
            String m20214p = this.f44367a.m20214p();
            String mo17985a = this.f44370d.mo17985a(m20214p);
            if (!TextUtils.isEmpty(mo17985a)) {
                aVar.f44272f = mo17985a.getBytes();
            }
            int length = m20214p.getBytes().length;
            byte[] bArr = aVar.f44272f;
            aVar.f44277k = length - (bArr != null ? bArr.length : 0);
        }
        return AbstractC3909e.m19777a(c3696Vf);
    }
}
