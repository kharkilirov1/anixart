package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class y71 extends AbstractC5968wd {

    /* renamed from: i */
    private int f56684i;

    /* renamed from: j */
    private int f56685j;

    /* renamed from: k */
    private boolean f56686k;

    /* renamed from: l */
    private int f56687l;

    /* renamed from: m */
    private byte[] f56688m = s91.f54535f;

    /* renamed from: n */
    private int f56689n;

    /* renamed from: o */
    private long f56690o;

    /* renamed from: a */
    public final void m29869a(int i2, int i3) {
        this.f56684i = i2;
        this.f56685j = i3;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: b */
    public final InterfaceC5737sb.a mo25202b(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        if (aVar.f54555c != 2) {
            throw new InterfaceC5737sb.b(aVar);
        }
        this.f56686k = true;
        return (this.f56684i == 0 && this.f56685j == 0) ? InterfaceC5737sb.a.f54552e : aVar;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: f */
    public final void mo25203f() {
        if (this.f56686k) {
            this.f56686k = false;
            int i2 = this.f56685j;
            int i3 = this.f56110b.f54556d;
            this.f56688m = new byte[i2 * i3];
            this.f56687l = this.f56684i * i3;
        }
        this.f56689n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: g */
    public final void mo29472g() {
        if (this.f56686k) {
            if (this.f56689n > 0) {
                this.f56690o += r0 / this.f56110b.f54556d;
            }
            this.f56689n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: h */
    public final void mo25204h() {
        this.f56688m = s91.f54535f;
    }

    /* renamed from: i */
    public final long m29870i() {
        return this.f56690o;
    }

    /* renamed from: j */
    public final void m29871j() {
        this.f56690o = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final void mo25200a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.f56687l);
        this.f56690o += min / this.f56110b.f54556d;
        this.f56687l -= min;
        byteBuffer.position(position + min);
        if (this.f56687l > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.f56689n + i3) - this.f56688m.length;
        ByteBuffer m29470a = m29470a(length);
        int i4 = this.f56689n;
        int i5 = s91.f54530a;
        int max = Math.max(0, Math.min(length, i4));
        m29470a.put(this.f56688m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i3));
        byteBuffer.limit(byteBuffer.position() + max2);
        m29470a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i3 - max2;
        int i7 = this.f56689n - max;
        this.f56689n = i7;
        byte[] bArr = this.f56688m;
        System.arraycopy(bArr, max, bArr, 0, i7);
        byteBuffer.get(this.f56688m, this.f56689n, i6);
        this.f56689n += i6;
        m29470a.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd, com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: b */
    public final ByteBuffer mo25436b() {
        int i2;
        if (super.mo25435a() && (i2 = this.f56689n) > 0) {
            m29470a(i2).put(this.f56688m, 0, this.f56689n).flip();
            this.f56689n = 0;
        }
        return super.mo25436b();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd, com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final boolean mo25435a() {
        return super.mo25435a() && this.f56689n == 0;
    }
}
