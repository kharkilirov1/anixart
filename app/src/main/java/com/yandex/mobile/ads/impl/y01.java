package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class y01 extends AbstractC5968wd {

    /* renamed from: i */
    private final long f56619i = 150000;

    /* renamed from: j */
    private final long f56620j = 20000;

    /* renamed from: k */
    private final short f56621k = 1024;

    /* renamed from: l */
    private int f56622l;

    /* renamed from: m */
    private boolean f56623m;

    /* renamed from: n */
    private byte[] f56624n;

    /* renamed from: o */
    private byte[] f56625o;

    /* renamed from: p */
    private int f56626p;

    /* renamed from: q */
    private int f56627q;

    /* renamed from: r */
    private int f56628r;

    /* renamed from: s */
    private boolean f56629s;

    /* renamed from: t */
    private long f56630t;

    public y01(int i2) {
        byte[] bArr = s91.f54535f;
        this.f56624n = bArr;
        this.f56625o = bArr;
    }

    /* renamed from: a */
    public final void m29839a(boolean z) {
        this.f56623m = z;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: b */
    public final InterfaceC5737sb.a mo25202b(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        if (aVar.f54555c == 2) {
            return this.f56623m ? aVar : InterfaceC5737sb.a.f54552e;
        }
        throw new InterfaceC5737sb.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd, com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: d */
    public final boolean mo25439d() {
        return this.f56623m;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: f */
    public final void mo25203f() {
        if (this.f56623m) {
            InterfaceC5737sb.a aVar = this.f56110b;
            int i2 = aVar.f54556d;
            this.f56622l = i2;
            long j2 = this.f56619i;
            long j3 = aVar.f54553a;
            int i3 = ((int) ((j2 * j3) / 1000000)) * i2;
            if (this.f56624n.length != i3) {
                this.f56624n = new byte[i3];
            }
            int i4 = ((int) ((this.f56620j * j3) / 1000000)) * i2;
            this.f56628r = i4;
            if (this.f56625o.length != i4) {
                this.f56625o = new byte[i4];
            }
        }
        this.f56626p = 0;
        this.f56630t = 0L;
        this.f56627q = 0;
        this.f56629s = false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: g */
    public final void mo29472g() {
        int i2 = this.f56627q;
        if (i2 > 0) {
            m29470a(i2).put(this.f56624n, 0, i2).flip();
            if (i2 > 0) {
                this.f56629s = true;
            }
        }
        if (this.f56629s) {
            return;
        }
        this.f56630t += this.f56628r / this.f56622l;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5968wd
    /* renamed from: h */
    public final void mo25204h() {
        this.f56623m = false;
        this.f56628r = 0;
        byte[] bArr = s91.f54535f;
        this.f56624n = bArr;
        this.f56625o = bArr;
    }

    /* renamed from: i */
    public final long m29840i() {
        return this.f56630t;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final void mo25200a(ByteBuffer byteBuffer) {
        int limit;
        int limit2;
        int position;
        while (byteBuffer.hasRemaining() && !m29471e()) {
            int i2 = this.f56626p;
            if (i2 == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f56624n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f56621k) {
                            int i3 = this.f56622l;
                            position = ((limit4 / i3) * i3) + i3;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f56626p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m29470a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f56629s = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i2 == 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position2)) > this.f56621k) {
                            int i4 = this.f56622l;
                            limit2 = (position2 / i4) * i4;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit2 - byteBuffer.position();
                byte[] bArr = this.f56624n;
                int length = bArr.length;
                int i5 = this.f56627q;
                int i6 = length - i5;
                if (limit2 >= limit5 || position3 >= i6) {
                    int min = Math.min(position3, i6);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f56624n, this.f56627q, min);
                    int i7 = this.f56627q + min;
                    this.f56627q = i7;
                    byte[] bArr2 = this.f56624n;
                    if (i7 == bArr2.length) {
                        if (this.f56629s) {
                            int i8 = this.f56628r;
                            m29470a(i8).put(bArr2, 0, i8).flip();
                            if (i8 > 0) {
                                this.f56629s = true;
                            }
                            this.f56630t += (this.f56627q - (this.f56628r * 2)) / this.f56622l;
                        } else {
                            this.f56630t += (i7 - this.f56628r) / this.f56622l;
                        }
                        byte[] bArr3 = this.f56624n;
                        int i9 = this.f56627q;
                        int min2 = Math.min(byteBuffer.remaining(), this.f56628r);
                        int i10 = this.f56628r - min2;
                        System.arraycopy(bArr3, i9 - i10, this.f56625o, 0, i10);
                        byteBuffer.position(byteBuffer.limit() - min2);
                        byteBuffer.get(this.f56625o, i10, min2);
                        this.f56627q = 0;
                        this.f56626p = 2;
                    }
                    byteBuffer.limit(limit5);
                } else {
                    m29470a(i5).put(bArr, 0, i5).flip();
                    if (i5 > 0) {
                        this.f56629s = true;
                    }
                    this.f56627q = 0;
                    this.f56626p = 0;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int limit6 = byteBuffer.limit();
                int position4 = byteBuffer.position();
                while (true) {
                    if (position4 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position4)) > this.f56621k) {
                            int i11 = this.f56622l;
                            limit = (position4 / i11) * i11;
                            break;
                        }
                        position4 += 2;
                    }
                }
                byteBuffer.limit(limit);
                this.f56630t += byteBuffer.remaining() / this.f56622l;
                byte[] bArr4 = this.f56625o;
                int i12 = this.f56628r;
                int min3 = Math.min(byteBuffer.remaining(), this.f56628r);
                int i13 = this.f56628r - min3;
                System.arraycopy(bArr4, i12 - i13, this.f56625o, 0, i13);
                byteBuffer.position(byteBuffer.limit() - min3);
                byteBuffer.get(this.f56625o, i13, min3);
                if (limit < limit6) {
                    byte[] bArr5 = this.f56625o;
                    int i14 = this.f56628r;
                    m29470a(i14).put(bArr5, 0, i14).flip();
                    if (i14 > 0) {
                        this.f56629s = true;
                    }
                    this.f56626p = 0;
                    byteBuffer.limit(limit6);
                }
            }
        }
    }
}
