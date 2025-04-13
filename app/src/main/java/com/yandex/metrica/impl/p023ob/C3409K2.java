package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3632T1;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.K2 */
/* loaded from: classes2.dex */
public class C3409K2 extends AbstractC3732X1<C4265rh, C4371vj> {

    /* renamed from: o */
    private final C3624Si f43261o;

    /* renamed from: p */
    @Nullable
    private C4371vj f43262p;

    /* renamed from: q */
    private EnumC3350Hi f43263q;

    /* renamed from: r */
    @NonNull
    private final C4083kh f43264r;

    public C3409K2(C3624Si c3624Si, C4083kh c4083kh) {
        this(c3624Si, c4083kh, new C4265rh(new C4031ih()), new C3384J2());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: a */
    public void mo18427a(@NonNull Uri.Builder builder) {
        ((C4265rh) this.f44039j).m20664a(builder, this.f43264r);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: b */
    public void mo18429b(@Nullable Throwable th) {
        this.f43263q = EnumC3350Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: j */
    public C3225Ci mo18430j() {
        return this.f43264r.m19762r();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: o */
    public boolean mo18431o() {
        m19112a("Accept-Encoding", "encrypted");
        return this.f43261o.m19104d();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: r */
    public boolean mo18432r() {
        C4371vj m19377B = m19377B();
        this.f43262p = m19377B;
        boolean z = m19377B != null;
        if (!z) {
            this.f43263q = EnumC3350Hi.PARSE;
        }
        return z;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: s */
    public void mo18433s() {
        super.mo18433s();
        this.f43263q = EnumC3350Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: t */
    public void mo18434t() {
        Map<String, List<String>> map;
        C4371vj c4371vj = this.f43262p;
        if (c4371vj == null || (map = this.f44036g) == null) {
            return;
        }
        this.f43261o.m19100a(c4371vj, this.f43264r, map);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: y */
    public void mo18435y() {
        if (this.f43263q == null) {
            this.f43263q = EnumC3350Hi.UNKNOWN;
        }
        this.f43261o.m19098a(this.f43263q);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: z */
    public boolean mo18436z() {
        return true;
    }

    @VisibleForTesting
    public C3409K2(C3624Si c3624Si, C4083kh c4083kh, @NonNull C4265rh c4265rh, @NonNull C3384J2 c3384j2) {
        super(c3384j2, c4265rh);
        this.f43261o = c3624Si;
        this.f43264r = c4083kh;
        m19114a(c4083kh.m20289J());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @NonNull
    /* renamed from: a */
    public String mo18426a() {
        StringBuilder m24u = C0000a.m24u("Startup task for component: ");
        m24u.append(this.f43261o.m19097a().toString());
        return m24u.toString();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    @Nullable
    /* renamed from: b */
    public AbstractC3632T1.a mo18428b() {
        return AbstractC3632T1.a.STARTUP;
    }
}
