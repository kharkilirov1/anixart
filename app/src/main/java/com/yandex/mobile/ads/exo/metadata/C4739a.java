package com.yandex.mobile.ads.exo.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.AbstractC5074fe;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.C5658qv;
import com.yandex.mobile.ads.impl.co1;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.wd0;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.impl.yd0;
import com.yandex.mobile.ads.impl.zd0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.exo.metadata.a */
/* loaded from: classes2.dex */
public final class C4739a extends AbstractC5074fe implements Handler.Callback {

    /* renamed from: n */
    private final xd0 f48049n;

    /* renamed from: o */
    private final zd0 f48050o;

    /* renamed from: p */
    @Nullable
    private final Handler f48051p;

    /* renamed from: q */
    private final yd0 f48052q;

    /* renamed from: r */
    @Nullable
    private wd0 f48053r;

    /* renamed from: s */
    private boolean f48054s;

    /* renamed from: t */
    private boolean f48055t;

    /* renamed from: u */
    private long f48056u;

    /* renamed from: v */
    private long f48057v;

    /* renamed from: w */
    @Nullable
    private Metadata f48058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4739a(zd0 zd0Var, @Nullable Looper looper) {
        super(5);
        xd0 xd0Var = xd0.f56459a;
        this.f48050o = (zd0) C5220ia.m25469a(zd0Var);
        this.f48051p = looper == null ? null : s91.m28100a(looper, (Handler.Callback) this);
        this.f48049n = (xd0) C5220ia.m25469a(xd0Var);
        this.f48052q = new yd0();
        this.f48057v = -9223372036854775807L;
    }

    /* renamed from: c */
    private boolean m22242c(long j2) {
        Metadata metadata = this.f48058w;
        boolean z = false;
        if (metadata != null && this.f48057v <= j2) {
            Handler handler = this.f48051p;
            if (handler != null) {
                handler.obtainMessage(0, metadata).sendToTarget();
            } else {
                this.f48050o.mo25710a(metadata);
            }
            this.f48058w = null;
            this.f48057v = -9223372036854775807L;
            z = true;
        }
        if (this.f48054s && this.f48058w == null) {
            this.f48055t = true;
        }
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.dv0
    /* renamed from: a */
    public final int mo22243a(C5606pv c5606pv) {
        if (this.f48049n.mo29742a(c5606pv)) {
            return co1.m23502a(c5606pv.f53807E == 0 ? 4 : 2);
        }
        return co1.m23502a(0);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public final boolean mo22248d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dv0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f48050o.mo25710a((Metadata) message.obj);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public final void mo22249u() {
        this.f48058w = null;
        this.f48057v = -9223372036854775807L;
        this.f48053r = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22246a(C5606pv[] c5606pvArr, long j2, long j3) {
        this.f48053r = this.f48049n.mo29743b(c5606pvArr[0]);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22245a(long j2, boolean z) {
        this.f48058w = null;
        this.f48057v = -9223372036854775807L;
        this.f48054s = false;
        this.f48055t = false;
    }

    /* renamed from: a */
    private void m22241a(Metadata metadata, ArrayList arrayList) {
        for (int i2 = 0; i2 < metadata.m22237c(); i2++) {
            C5606pv mo22238a = metadata.m22234a(i2).mo22238a();
            if (mo22238a != null && this.f48049n.mo29742a(mo22238a)) {
                g11 mo29743b = this.f48049n.mo29743b(mo22238a);
                byte[] mo22240b = metadata.m22234a(i2).mo22240b();
                Objects.requireNonNull(mo22240b);
                this.f48052q.mo22727b();
                this.f48052q.m28323e(mo22240b.length);
                ByteBuffer byteBuffer = this.f48052q.f54757c;
                int i3 = s91.f54530a;
                byteBuffer.put(mo22240b);
                this.f48052q.m28324h();
                Metadata mo24764a = mo29743b.mo24764a(this.f48052q);
                if (mo24764a != null) {
                    m22241a(mo24764a, arrayList);
                }
            } else {
                arrayList.add(metadata.m22234a(i2));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final boolean mo22247a() {
        return this.f48055t;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo22244a(long j2, long j3) {
        boolean z = true;
        while (z) {
            if (!this.f48054s && this.f48058w == null) {
                this.f48052q.mo22727b();
                C5658qv m24564q = m24564q();
                int m24559a = m24559a(m24564q, this.f48052q, 0);
                if (m24559a == -4) {
                    if (this.f48052q.m26638f()) {
                        this.f48054s = true;
                    } else {
                        yd0 yd0Var = this.f48052q;
                        yd0Var.f56802i = this.f48056u;
                        yd0Var.m28324h();
                        wd0 wd0Var = this.f48053r;
                        int i2 = s91.f54530a;
                        Metadata mo24764a = wd0Var.mo24764a(this.f48052q);
                        if (mo24764a != null) {
                            ArrayList arrayList = new ArrayList(mo24764a.m22237c());
                            m22241a(mo24764a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f48058w = new Metadata(arrayList);
                                this.f48057v = this.f48052q.f54759e;
                            }
                        }
                    }
                } else if (m24559a == -5) {
                    C5606pv c5606pv = m24564q.f54140b;
                    Objects.requireNonNull(c5606pv);
                    this.f48056u = c5606pv.f53824p;
                }
            }
            z = m22242c(j2);
        }
    }
}
