package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3734X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Z3 */
/* loaded from: classes2.dex */
public class C3784Z3 implements InterfaceC4044j4, InterfaceC3450Li, InterfaceC4096l4 {

    /* renamed from: a */
    @NonNull
    private final Context f44607a;

    /* renamed from: b */
    @NonNull
    private final C3862c4 f44608b;

    /* renamed from: c */
    @NonNull
    private final C3300Fi f44609c;

    /* renamed from: d */
    @NonNull
    private final C3624Si f44610d;

    /* renamed from: e */
    @NonNull
    private final C4382w4 f44611e;

    /* renamed from: f */
    @NonNull
    private final C3922ec f44612f;

    /* renamed from: g */
    @NonNull
    private final C4019i5<AbstractC3993h5, C3784Z3> f44613g;

    /* renamed from: h */
    @NonNull
    private final C3559Q2<C3784Z3> f44614h;

    /* renamed from: j */
    @NonNull
    private final C3888d4 f44616j;

    /* renamed from: k */
    @Nullable
    private C4108lg f44617k;

    /* renamed from: l */
    @NonNull
    private final C3680V f44618l;

    /* renamed from: m */
    @NonNull
    private final C3722Wg f44619m;

    /* renamed from: i */
    @NonNull
    private List<C3937f1> f44615i = new ArrayList();

    /* renamed from: n */
    private final Object f44620n = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.Z3$a */
    public class a implements InterfaceC3273Eg {

        /* renamed from: a */
        public final /* synthetic */ ResultReceiver f44621a;

        public a(C3784Z3 c3784z3, ResultReceiver resultReceiver) {
            this.f44621a = resultReceiver;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3273Eg
        /* renamed from: a */
        public void mo17971a(@Nullable C3298Fg c3298Fg) {
            ResultReceiver resultReceiver = this.f44621a;
            int i2 = ResultReceiverC3323Gg.f43008b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("referrer", c3298Fg == null ? null : c3298Fg.m18103a());
                resultReceiver.send(1, bundle);
            }
        }
    }

    @VisibleForTesting
    public C3784Z3(@NonNull Context context, @NonNull C3300Fi c3300Fi, @NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3, @NonNull C4382w4 c4382w4, @NonNull C3672Ug c3672Ug, @NonNull C3888d4 c3888d4, @NonNull C3836b4 c3836b4, @NonNull C3705W c3705w, @NonNull C3922ec c3922ec, @NonNull C3722Wg c3722Wg) {
        Context applicationContext = context.getApplicationContext();
        this.f44607a = applicationContext;
        this.f44608b = c3862c4;
        this.f44609c = c3300Fi;
        this.f44611e = c4382w4;
        this.f44616j = c3888d4;
        this.f44613g = c3836b4.m19646a(this);
        C3624Si m18108a = c3300Fi.m18108a(applicationContext, c3862c4, c3734x3.f44441a);
        this.f44610d = m18108a;
        this.f44612f = c3922ec;
        c3922ec.m19808a(applicationContext, m18108a.m19103c());
        this.f44618l = c3705w.m19349a(m18108a, c3922ec, applicationContext);
        this.f44614h = c3836b4.m19645a(this, m18108a);
        this.f44619m = c3722Wg;
        c3300Fi.m18109a(c3862c4, this);
    }

    /* renamed from: a */
    public void m19498a(@NonNull C3734X3.a aVar) {
        this.f44611e.m21084a(aVar);
    }

    /* renamed from: b */
    public synchronized void m19503b(@NonNull C3336H4 c3336h4) {
        this.f44616j.m19707b(c3336h4);
    }

    /* renamed from: a */
    public synchronized void m19497a(@NonNull C3336H4 c3336h4) {
        this.f44616j.m19706a(c3336h4);
        c3336h4.mo18187a(this.f44618l.m19259a(C4452ym.m21241a(this.f44610d.m19103c().m18865w())));
    }

    @NonNull
    /* renamed from: b */
    public Context m19502b() {
        return this.f44607a;
    }

    /* renamed from: a */
    public void m19501a(@NonNull C4066k0 c4066k0, @NonNull C3336H4 c3336h4) {
        this.f44613g.m20050a(c4066k0, c3336h4);
    }

    @NonNull
    /* renamed from: a */
    public C3734X3.a m19495a() {
        return this.f44611e.m21083a();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public void mo18513a(@NonNull C3575Qi c3575Qi) {
        this.f44612f.m19809a(c3575Qi);
        synchronized (this.f44620n) {
            Iterator<InterfaceC3261E4> it = this.f44616j.m19705a().iterator();
            while (it.hasNext()) {
                ((InterfaceC3630T) it.next()).mo18187a(this.f44618l.m19259a(C4452ym.m21241a(c3575Qi.m18865w())));
            }
            ArrayList arrayList = new ArrayList();
            for (C3937f1 c3937f1 : this.f44615i) {
                if (c3937f1.m19836a(c3575Qi)) {
                    m19494a(c3937f1.m19838c(), c3937f1.m19835a());
                } else {
                    arrayList.add(c3937f1);
                }
            }
            this.f44615i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f44614h.m18777d();
            }
        }
        if (this.f44617k == null) {
            this.f44617k = C3532P0.m18696i().m18711n();
        }
        this.f44617k.m20369a(c3575Qi);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public void mo18512a(@NonNull EnumC3350Hi enumC3350Hi, @Nullable C3575Qi c3575Qi) {
        synchronized (this.f44620n) {
            for (C3937f1 c3937f1 : this.f44615i) {
                ResultReceiver m19838c = c3937f1.m19838c();
                C3655U m19259a = this.f44618l.m19259a(c3937f1.m19835a());
                int i2 = ResultReceiverC4144n0.f45965b;
                if (m19838c != null) {
                    Bundle bundle = new Bundle();
                    enumC3350Hi.m18234a(bundle);
                    m19259a.m19180c(bundle);
                    m19838c.send(2, bundle);
                }
            }
            this.f44615i.clear();
        }
    }

    /* renamed from: a */
    public void m19500a(@Nullable C3937f1 c3937f1) {
        ResultReceiver resultReceiver;
        Map<String, String> hashMap = new HashMap<>();
        List<String> list = null;
        if (c3937f1 != null) {
            list = c3937f1.m19837b();
            resultReceiver = c3937f1.m19838c();
            hashMap = c3937f1.m19835a();
        } else {
            resultReceiver = null;
        }
        boolean m19101a = this.f44610d.m19101a(list, hashMap);
        if (!m19101a) {
            m19494a(resultReceiver, hashMap);
        }
        if (!this.f44610d.m19104d()) {
            if (m19101a) {
                m19494a(resultReceiver, hashMap);
            }
        } else {
            synchronized (this.f44620n) {
                if (m19101a && c3937f1 != null) {
                    this.f44615i.add(c3937f1);
                }
            }
            this.f44614h.m18777d();
        }
    }

    /* renamed from: a */
    public void m19496a(@Nullable ResultReceiver resultReceiver) {
        this.f44619m.m19360a(new a(this, resultReceiver));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4096l4
    /* renamed from: a */
    public void mo19499a(@NonNull C3734X3 c3734x3) {
        this.f44610d.m19099a(c3734x3.f44441a);
        this.f44611e.m21084a(c3734x3.f44442b);
    }

    /* renamed from: a */
    private void m19494a(@Nullable ResultReceiver resultReceiver, @Nullable Map<String, String> map) {
        C3655U m19259a = this.f44618l.m19259a(map);
        int i2 = ResultReceiverC4144n0.f45965b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            m19259a.m19180c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
