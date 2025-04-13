package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.hh */
/* loaded from: classes3.dex */
final class C5186hh extends AbstractC5968wd {

    /* renamed from: i */
    @Nullable
    private int[] f50931i;

    /* renamed from: j */
    @Nullable
    private int[] f50932j;

    /* renamed from: a */
    public final void m25201a(@Nullable int[] iArr) {
        this.f50931i = iArr;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: b */
    public final InterfaceC5737sb.a mo25202b(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        int[] iArr = this.f50931i;
        if (iArr == null) {
            return InterfaceC5737sb.a.f54552e;
        }
        if (aVar.f54555c != 2) {
            throw new InterfaceC5737sb.b(aVar);
        }
        boolean z = aVar.f54554b != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= aVar.f54554b) {
                throw new InterfaceC5737sb.b(aVar);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new InterfaceC5737sb.a(aVar.f54553a, iArr.length, 2) : InterfaceC5737sb.a.f54552e;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: f */
    public final void mo25203f() {
        this.f50932j = this.f50931i;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: h */
    public final void mo25204h() {
        this.f50932j = null;
        this.f50931i = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final void mo25200a(ByteBuffer byteBuffer) {
        int[] iArr = this.f50932j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m29470a = m29470a(((limit - position) / this.f56110b.f54556d) * this.f56111c.f54556d);
        while (position < limit) {
            for (int i2 : iArr) {
                m29470a.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f56110b.f54556d;
        }
        byteBuffer.position(limit);
        m29470a.flip();
    }
}
