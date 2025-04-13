package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Hk */
/* loaded from: classes2.dex */
class C3352Hk implements InterfaceC3828am {

    /* renamed from: a */
    @NonNull
    private final C3452Lk f43066a;

    /* renamed from: b */
    @NonNull
    private final C3291F9 f43067b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4139ml f43068c;

    /* renamed from: d */
    @NonNull
    private final a f43069d;

    /* renamed from: e */
    private final boolean f43070e;

    /* renamed from: com.yandex.metrica.impl.ob.Hk$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Hk$b */
    public static class b {
    }

    @VisibleForTesting
    public C3352Hk(@NonNull C3452Lk c3452Lk, @NonNull C3291F9 c3291f9, boolean z, @NonNull InterfaceC4139ml interfaceC4139ml, @NonNull a aVar) {
        this.f43066a = c3452Lk;
        this.f43067b = c3291f9;
        this.f43070e = z;
        this.f43068c = interfaceC4139ml;
        this.f43069d = aVar;
    }

    /* renamed from: b */
    private boolean m18236b(@NonNull C3378Il c3378Il) {
        if (!c3378Il.f43143c || c3378Il.f43147g == null) {
            return false;
        }
        return this.f43070e || this.f43067b.m18044a(false);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public void mo18237a(long j2, @NonNull Activity activity, @NonNull C3328Gl c3328Gl, @NonNull List<C3727Wl> list, @NonNull C3378Il c3378Il, @NonNull C3879cl c3879cl) {
        if (m18236b(c3378Il)) {
            a aVar = this.f43069d;
            C3428Kl c3428Kl = c3378Il.f43147g;
            Objects.requireNonNull(aVar);
            this.f43066a.m18516a((c3428Kl.f43292h ? new C3983gl() : new C3905dl(list)).m19107a(activity, c3328Gl, c3378Il.f43147g, c3879cl.m19682a(), j2));
            this.f43068c.onResult(this.f43066a.m18515a());
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public void mo18238a(@NonNull Throwable th, @NonNull C3854bm c3854bm) {
        InterfaceC4139ml interfaceC4139ml = this.f43068c;
        StringBuilder m24u = C0000a.m24u("exception: ");
        m24u.append(th.getMessage());
        interfaceC4139ml.onError(m24u.toString());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public boolean mo18239a(@NonNull C3378Il c3378Il) {
        return m18236b(c3378Il) && !c3378Il.f43147g.f43292h;
    }
}
