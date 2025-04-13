package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4699p0;
import com.yandex.mobile.ads.exo.drm.C4716c;
import com.yandex.mobile.ads.impl.C5754sn;
import com.yandex.mobile.ads.impl.InterfaceC5547oq;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.w60;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.exo.drm.d */
/* loaded from: classes2.dex */
public final class C4717d implements InterfaceC5547oq {

    /* renamed from: a */
    private final Object f48016a = new Object();

    /* renamed from: b */
    @GuardedBy
    private pb0.C5578d f48017b;

    /* renamed from: c */
    @GuardedBy
    private C4716c f48018c;

    @Override // com.yandex.mobile.ads.impl.InterfaceC5547oq
    /* renamed from: a */
    public final InterfaceC4720g mo22158a(pb0 pb0Var) {
        C4716c c4716c;
        Objects.requireNonNull(pb0Var.f53429b);
        pb0.C5578d c5578d = pb0Var.f53429b.f53479c;
        if (c5578d == null || s91.f54530a < 18) {
            return InterfaceC4720g.f48025a;
        }
        synchronized (this.f48016a) {
            if (!s91.m28112a(c5578d, this.f48017b)) {
                this.f48017b = c5578d;
                this.f48018c = m22157a(c5578d);
            }
            c4716c = this.f48018c;
            Objects.requireNonNull(c4716c);
        }
        return c4716c;
    }

    @RequiresApi
    /* renamed from: a */
    private static C4716c m22157a(pb0.C5578d c5578d) {
        C5754sn.a m28337b = new C5754sn.a().m28337b();
        Uri uri = c5578d.f53456b;
        C4728o c4728o = new C4728o(uri == null ? null : uri.toString(), c5578d.f53460f, m28337b);
        AbstractC4699p0<Map.Entry<String, String>> it = c5578d.f53457c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            c4728o.m22219a(next.getKey(), next.getValue());
        }
        C4716c m22143a = new C4716c.a().m22140a(c5578d.f53455a, C4727n.f48033e).m22141a(c5578d.f53458d).m22144b(c5578d.f53459e).m22142a(w60.m29386a(c5578d.f53461g)).m22143a(c4728o);
        m22143a.m22138a(c5578d.m27229a());
        return m22143a;
    }
}
