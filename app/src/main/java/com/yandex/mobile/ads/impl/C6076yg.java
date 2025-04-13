package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.yg */
/* loaded from: classes3.dex */
public final class C6076yg extends AbstractC5074fe {

    /* renamed from: n */
    private final C5752sm f56834n;

    /* renamed from: o */
    private final ap0 f56835o;

    /* renamed from: p */
    private long f56836p;

    /* renamed from: q */
    @Nullable
    private InterfaceC6026xg f56837q;

    /* renamed from: r */
    private long f56838r;

    public C6076yg() {
        super(6);
        this.f56834n = new C5752sm(1);
        this.f56835o = new ap0();
    }

    @Override // com.yandex.mobile.ads.impl.dv0
    /* renamed from: a */
    public final int mo22243a(C5606pv c5606pv) {
        return "application/x-camera-motion".equals(c5606pv.f53820l) ? co1.m23502a(4) : co1.m23502a(0);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public final boolean mo22248d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dv0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public final void mo22249u() {
        InterfaceC6026xg interfaceC6026xg = this.f56837q;
        if (interfaceC6026xg != null) {
            interfaceC6026xg.mo25724f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.vq0.InterfaceC5936b
    /* renamed from: a */
    public final void mo24074a(int i2, @Nullable Object obj) throws C5043es {
        if (i2 == 8) {
            this.f56837q = (InterfaceC6026xg) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22246a(C5606pv[] c5606pvArr, long j2, long j3) {
        this.f56836p = j3;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22245a(long j2, boolean z) {
        this.f56838r = Long.MIN_VALUE;
        InterfaceC6026xg interfaceC6026xg = this.f56837q;
        if (interfaceC6026xg != null) {
            interfaceC6026xg.mo25724f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo22244a(long j2, long j3) {
        float[] fArr;
        while (!mo23526e() && this.f56838r < 100000 + j2) {
            this.f56834n.mo22727b();
            if (m24559a(m24564q(), this.f56834n, 0) != -4 || this.f56834n.m26638f()) {
                return;
            }
            C5752sm c5752sm = this.f56834n;
            this.f56838r = c5752sm.f54759e;
            if (this.f56837q != null && !c5752sm.m26637e()) {
                this.f56834n.m28324h();
                ByteBuffer byteBuffer = this.f56834n.f54757c;
                int i2 = s91.f54530a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f56835o.m22582a(byteBuffer.limit(), byteBuffer.array());
                    this.f56835o.m22591e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(this.f56835o.m22598k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f56837q.mo25723a(this.f56838r - this.f56836p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final boolean mo22247a() {
        return mo23526e();
    }
}
