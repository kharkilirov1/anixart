package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.iv */
/* loaded from: classes3.dex */
final class C5249iv extends AbstractC5968wd {

    /* renamed from: i */
    private static final int f51442i = Float.floatToIntBits(Float.NaN);

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final void mo25200a(ByteBuffer byteBuffer) {
        ByteBuffer m29470a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f56110b.f54555c;
        if (i3 == 536870912) {
            m29470a = m29470a((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == f51442i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                m29470a.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            m29470a = m29470a(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f51442i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                m29470a.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m29470a.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: b */
    public final InterfaceC5737sb.a mo25202b(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        int i2 = aVar.f54555c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new InterfaceC5737sb.a(aVar.f54553a, aVar.f54554b, 4) : InterfaceC5737sb.a.f54552e;
        }
        throw new InterfaceC5737sb.b(aVar);
    }
}
