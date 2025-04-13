package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Sf */
/* loaded from: classes2.dex */
public final class C3621Sf extends AbstractC3909e {

    /* renamed from: b */
    public byte[] f44000b;

    public C3621Sf() {
        m19088b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        if (Arrays.equals(this.f44000b, C3961g.f45152d)) {
            return;
        }
        c3831b.m19618b(1, this.f44000b);
    }

    /* renamed from: b */
    public C3621Sf m19088b() {
        this.f44000b = C3961g.f45152d;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        if (Arrays.equals(this.f44000b, C3961g.f45152d)) {
            return 0;
        }
        return 0 + C3831b.m19601a(1, this.f44000b);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
        while (true) {
            int m19562l = c3805a.m19562l();
            if (m19562l == 0) {
                break;
            }
            if (m19562l != 10) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f44000b = c3805a.m19550d();
            }
        }
        return this;
    }
}
