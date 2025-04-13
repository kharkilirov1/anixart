package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5476n8;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.y61;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
final class sy0 {

    /* renamed from: a */
    private final InterfaceC5476n8 f54883a;

    /* renamed from: b */
    private final int f54884b;

    /* renamed from: c */
    private final ap0 f54885c;

    /* renamed from: d */
    private C5772a f54886d;

    /* renamed from: e */
    private C5772a f54887e;

    /* renamed from: f */
    private C5772a f54888f;

    /* renamed from: g */
    private long f54889g;

    public sy0(InterfaceC5476n8 interfaceC5476n8) {
        this.f54883a = interfaceC5476n8;
        int m22872b = ((C4877bn) interfaceC5476n8).m22872b();
        this.f54884b = m22872b;
        this.f54885c = new ap0(32);
        C5772a c5772a = new C5772a(m22872b, 0L);
        this.f54886d = c5772a;
        this.f54887e = c5772a;
        this.f54888f = c5772a;
    }

    /* renamed from: a */
    public final void m28378a(C5752sm c5752sm, ty0.C5825a c5825a) {
        m28373a(this.f54887e, c5752sm, c5825a, this.f54885c);
    }

    /* renamed from: b */
    public final void m28379b() {
        C5772a c5772a = this.f54886d;
        if (c5772a.f54892c != null) {
            ((C4877bn) this.f54883a).m22871a(c5772a);
            c5772a.f54892c = null;
            c5772a.f54893d = null;
        }
        this.f54886d.m28382a(this.f54884b, 0L);
        C5772a c5772a2 = this.f54886d;
        this.f54887e = c5772a2;
        this.f54888f = c5772a2;
        this.f54889g = 0L;
        ((C4877bn) this.f54883a).m22875e();
    }

    /* renamed from: c */
    public final void m28381c() {
        this.f54887e = this.f54886d;
    }

    /* renamed from: a */
    public final void m28377a(long j2) {
        C5772a c5772a;
        if (j2 == -1) {
            return;
        }
        while (true) {
            c5772a = this.f54886d;
            if (j2 < c5772a.f54891b) {
                break;
            }
            ((C4877bn) this.f54883a).m22870a(c5772a.f54892c);
            C5772a c5772a2 = this.f54886d;
            c5772a2.f54892c = null;
            C5772a c5772a3 = c5772a2.f54893d;
            c5772a2.f54893d = null;
            this.f54886d = c5772a3;
        }
        if (this.f54887e.f54890a < c5772a.f54890a) {
            this.f54887e = c5772a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sy0$a */
    public static final class C5772a implements InterfaceC5476n8.a {

        /* renamed from: a */
        public long f54890a;

        /* renamed from: b */
        public long f54891b;

        /* renamed from: c */
        @Nullable
        public C5429m8 f54892c;

        /* renamed from: d */
        @Nullable
        public C5772a f54893d;

        public C5772a(int i2, long j2) {
            m28382a(i2, j2);
        }

        /* renamed from: a */
        public final void m28382a(int i2, long j2) {
            C5220ia.m25476b(this.f54892c == null);
            this.f54890a = j2;
            this.f54891b = j2 + i2;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5476n8.a
        @Nullable
        public final InterfaceC5476n8.a next() {
            C5772a c5772a = this.f54893d;
            if (c5772a == null || c5772a.f54892c == null) {
                return null;
            }
            return c5772a;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5476n8.a
        /* renamed from: a */
        public final C5429m8 mo26815a() {
            C5429m8 c5429m8 = this.f54892c;
            Objects.requireNonNull(c5429m8);
            return c5429m8;
        }
    }

    /* renamed from: a */
    public final long m28375a() {
        return this.f54889g;
    }

    /* renamed from: b */
    public final void m28380b(C5752sm c5752sm, ty0.C5825a c5825a) {
        this.f54887e = m28373a(this.f54887e, c5752sm, c5825a, this.f54885c);
    }

    /* renamed from: a */
    public final int m28374a(InterfaceC4815am interfaceC4815am, int i2, boolean z) throws IOException {
        C5772a c5772a = this.f54888f;
        if (c5772a.f54892c == null) {
            C5429m8 m22868a = ((C4877bn) this.f54883a).m22868a();
            C5772a c5772a2 = new C5772a(this.f54884b, this.f54888f.f54891b);
            c5772a.f54892c = m22868a;
            c5772a.f54893d = c5772a2;
        }
        int min = Math.min(i2, (int) (this.f54888f.f54891b - this.f54889g));
        C5772a c5772a3 = this.f54888f;
        C5429m8 c5429m8 = c5772a3.f54892c;
        int read = interfaceC4815am.read(c5429m8.f52592a, ((int) (this.f54889g - c5772a3.f54890a)) + c5429m8.f52593b, min);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j2 = this.f54889g + read;
        this.f54889g = j2;
        C5772a c5772a4 = this.f54888f;
        if (j2 == c5772a4.f54891b) {
            this.f54888f = c5772a4.f54893d;
        }
        return read;
    }

    /* renamed from: a */
    public final void m28376a(int i2, ap0 ap0Var) {
        while (i2 > 0) {
            C5772a c5772a = this.f54888f;
            if (c5772a.f54892c == null) {
                C5429m8 m22868a = ((C4877bn) this.f54883a).m22868a();
                C5772a c5772a2 = new C5772a(this.f54884b, this.f54888f.f54891b);
                c5772a.f54892c = m22868a;
                c5772a.f54893d = c5772a2;
            }
            int min = Math.min(i2, (int) (this.f54888f.f54891b - this.f54889g));
            C5772a c5772a3 = this.f54888f;
            C5429m8 c5429m8 = c5772a3.f54892c;
            ap0Var.m22583a(c5429m8.f52592a, ((int) (this.f54889g - c5772a3.f54890a)) + c5429m8.f52593b, min);
            i2 -= min;
            long j2 = this.f54889g + min;
            this.f54889g = j2;
            C5772a c5772a4 = this.f54888f;
            if (j2 == c5772a4.f54891b) {
                this.f54888f = c5772a4.f54893d;
            }
        }
    }

    /* renamed from: a */
    private static C5772a m28373a(C5772a c5772a, C5752sm c5752sm, ty0.C5825a c5825a, ap0 ap0Var) {
        C5772a c5772a2;
        int i2;
        if (c5752sm.m28325i()) {
            long j2 = c5825a.f55283b;
            ap0Var.m22586c(1);
            C5772a m28372a = m28372a(c5772a, j2, ap0Var.m22587c(), 1);
            long j3 = j2 + 1;
            byte b = ap0Var.m22587c()[0];
            boolean z = (b & 128) != 0;
            int i3 = b & Byte.MAX_VALUE;
            C5695rl c5695rl = c5752sm.f54756b;
            byte[] bArr = c5695rl.f54342a;
            if (bArr == null) {
                c5695rl.f54342a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c5772a2 = m28372a(m28372a, j3, c5695rl.f54342a, i3);
            long j4 = j3 + i3;
            if (z) {
                ap0Var.m22586c(2);
                c5772a2 = m28372a(c5772a2, j4, ap0Var.m22587c(), 2);
                j4 += 2;
                i2 = ap0Var.m22613z();
            } else {
                i2 = 1;
            }
            int[] iArr = c5695rl.f54345d;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c5695rl.f54346e;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i2 * 6;
                ap0Var.m22586c(i4);
                c5772a2 = m28372a(c5772a2, j4, ap0Var.m22587c(), i4);
                j4 += i4;
                ap0Var.m22591e(0);
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr2[i5] = ap0Var.m22613z();
                    iArr4[i5] = ap0Var.m22611x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c5825a.f55282a - ((int) (j4 - c5825a.f55283b));
            }
            y61.C6060a c6060a = c5825a.f55284c;
            int i6 = s91.f54530a;
            c5695rl.m27945a(i2, iArr2, iArr4, c6060a.f56676b, c5695rl.f54342a, c6060a.f56675a, c6060a.f56677c, c6060a.f56678d);
            long j5 = c5825a.f55283b;
            int i7 = (int) (j4 - j5);
            c5825a.f55283b = j5 + i7;
            c5825a.f55282a -= i7;
        } else {
            c5772a2 = c5772a;
        }
        if (c5752sm.m26636d()) {
            ap0Var.m22586c(4);
            C5772a m28372a2 = m28372a(c5772a2, c5825a.f55283b, ap0Var.m22587c(), 4);
            int m22611x = ap0Var.m22611x();
            c5825a.f55283b += 4;
            c5825a.f55282a -= 4;
            c5752sm.m28323e(m22611x);
            C5772a m28371a = m28371a(m28372a2, c5825a.f55283b, c5752sm.f54757c, m22611x);
            c5825a.f55283b += m22611x;
            int i8 = c5825a.f55282a - m22611x;
            c5825a.f55282a = i8;
            ByteBuffer byteBuffer = c5752sm.f54760f;
            if (byteBuffer != null && byteBuffer.capacity() >= i8) {
                c5752sm.f54760f.clear();
            } else {
                c5752sm.f54760f = ByteBuffer.allocate(i8);
            }
            return m28371a(m28371a, c5825a.f55283b, c5752sm.f54760f, c5825a.f55282a);
        }
        c5752sm.m28323e(c5825a.f55282a);
        return m28371a(c5772a2, c5825a.f55283b, c5752sm.f54757c, c5825a.f55282a);
    }

    /* renamed from: a */
    private static C5772a m28371a(C5772a c5772a, long j2, ByteBuffer byteBuffer, int i2) {
        while (j2 >= c5772a.f54891b) {
            c5772a = c5772a.f54893d;
        }
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c5772a.f54891b - j2));
            C5429m8 c5429m8 = c5772a.f54892c;
            byteBuffer.put(c5429m8.f52592a, ((int) (j2 - c5772a.f54890a)) + c5429m8.f52593b, min);
            i2 -= min;
            j2 += min;
            if (j2 == c5772a.f54891b) {
                c5772a = c5772a.f54893d;
            }
        }
        return c5772a;
    }

    /* renamed from: a */
    private static C5772a m28372a(C5772a c5772a, long j2, byte[] bArr, int i2) {
        while (j2 >= c5772a.f54891b) {
            c5772a = c5772a.f54893d;
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (c5772a.f54891b - j2));
            C5429m8 c5429m8 = c5772a.f54892c;
            System.arraycopy(c5429m8.f52592a, ((int) (j2 - c5772a.f54890a)) + c5429m8.f52593b, bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == c5772a.f54891b) {
                c5772a = c5772a.f54893d;
            }
        }
        return c5772a;
    }
}
