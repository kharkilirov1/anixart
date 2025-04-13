package com.yandex.mobile.ads.exo.offline;

import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.yandex.mobile.ads.exo.offline.C4778c;
import com.yandex.mobile.ads.exo.offline.InterfaceC4779d;
import com.yandex.mobile.ads.impl.C4809ag;
import com.yandex.mobile.ads.impl.C5192hm;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5396lg;
import com.yandex.mobile.ads.impl.es0;
import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.s91;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.exo.offline.e */
/* loaded from: classes2.dex */
public final class C4780e implements InterfaceC4779d {

    /* renamed from: a */
    private final Executor f48244a;

    /* renamed from: b */
    private final C5192hm f48245b;

    /* renamed from: c */
    private final C4809ag f48246c;

    /* renamed from: d */
    private final C5396lg f48247d;

    /* renamed from: e */
    @Nullable
    private InterfaceC4779d.a f48248e;

    /* renamed from: f */
    private volatile iy0<Void, IOException> f48249f;

    /* renamed from: g */
    private volatile boolean f48250g;

    /* renamed from: com.yandex.mobile.ads.exo.offline.e$a */
    public class a extends iy0<Void, IOException> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.iy0
        /* renamed from: b */
        public final void mo22320b() {
            C4780e.this.f48247d.m26448b();
        }

        @Override // com.yandex.mobile.ads.impl.iy0
        /* renamed from: c */
        public final void mo22321c() throws Exception {
            C4780e.this.f48247d.m26447a();
        }
    }

    public C4780e(pb0 pb0Var, C4809ag.b bVar, Executor executor) {
        this.f48244a = (Executor) C5220ia.m25469a(executor);
        C5220ia.m25469a(pb0Var.f53429b);
        C5192hm m25244a = new C5192hm.a().m25240a(pb0Var.f53429b.f53477a).m25241a(pb0Var.f53429b.f53481e).m25238a(4).m25244a();
        this.f48245b = m25244a;
        C4809ag m22498b = bVar.m22498b();
        this.f48246c = m22498b;
        this.f48247d = new C5396lg(m22498b, m25244a, new C2722a(this, 8));
    }

    @Override // com.yandex.mobile.ads.exo.offline.InterfaceC4779d
    public final void cancel() {
        this.f48250g = true;
        iy0<Void, IOException> iy0Var = this.f48249f;
        if (iy0Var != null) {
            iy0Var.cancel(true);
        }
    }

    @Override // com.yandex.mobile.ads.exo.offline.InterfaceC4779d
    public final void remove() {
        this.f48246c.m22491g().mo22702a(this.f48246c.m22492h().mo23917a(this.f48245b));
    }

    @Override // com.yandex.mobile.ads.exo.offline.InterfaceC4779d
    /* renamed from: a */
    public final void mo22316a(@Nullable InterfaceC4779d.a aVar) throws IOException, InterruptedException {
        this.f48248e = aVar;
        this.f48249f = new a();
        boolean z = false;
        while (!z) {
            try {
                if (this.f48250g) {
                    break;
                }
                this.f48244a.execute(this.f48249f);
                try {
                    this.f48249f.get();
                    z = true;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    Objects.requireNonNull(cause);
                    if (!(cause instanceof es0)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i2 = s91.f54530a;
                        throw cause;
                    }
                }
            } finally {
                this.f48249f.m25748a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m22318a(long j2, long j3, long j4) {
        InterfaceC4779d.a aVar = this.f48248e;
        if (aVar == null) {
            return;
        }
        ((C4778c.d) aVar).m22314a(j2, j3, (j2 == -1 || j2 == 0) ? -1.0f : (j3 * 100.0f) / j2);
    }
}
