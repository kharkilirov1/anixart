package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CodedInputStream {

    /* renamed from: d */
    public int f65633d;

    /* renamed from: f */
    public final InputStream f65635f;

    /* renamed from: g */
    public int f65636g;

    /* renamed from: j */
    public int f65639j;

    /* renamed from: i */
    public int f65638i = Integer.MAX_VALUE;

    /* renamed from: a */
    public final byte[] f65630a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: c */
    public int f65632c = 0;

    /* renamed from: e */
    public int f65634e = 0;

    /* renamed from: h */
    public int f65637h = 0;

    /* renamed from: b */
    public final boolean f65631b = false;

    public interface RefillCallback {
    }

    public CodedInputStream(InputStream inputStream) {
        this.f65635f = inputStream;
    }

    /* renamed from: a */
    public void m33241a(int i2) throws InvalidProtocolBufferException {
        if (this.f65636g != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public int m33242b() {
        int i2 = this.f65638i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f65637h + this.f65634e);
    }

    /* renamed from: c */
    public void m33243c(int i2) {
        this.f65638i = i2;
        m33256p();
    }

    /* renamed from: d */
    public int m33244d(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m33327a();
        }
        int i3 = this.f65637h + this.f65634e + i2;
        int i4 = this.f65638i;
        if (i3 > i4) {
            throw InvalidProtocolBufferException.m33329d();
        }
        this.f65638i = i3;
        m33256p();
        return i4;
    }

    /* renamed from: e */
    public boolean m33245e() throws IOException {
        return m33253m() != 0;
    }

    /* renamed from: f */
    public ByteString m33246f() throws IOException {
        int m33252l = m33252l();
        int i2 = this.f65632c;
        int i3 = this.f65634e;
        if (m33252l > i2 - i3 || m33252l <= 0) {
            return m33252l == 0 ? ByteString.f65623b : new LiteralByteString(m33249i(m33252l));
        }
        byte[] bArr = this.f65630a;
        ByteString byteString = ByteString.f65623b;
        byte[] bArr2 = new byte[m33252l];
        System.arraycopy(bArr, i3, bArr2, 0, m33252l);
        LiteralByteString literalByteString = new LiteralByteString(bArr2);
        this.f65634e += m33252l;
        return literalByteString;
    }

    /* renamed from: g */
    public int m33247g() throws IOException {
        return m33252l();
    }

    /* renamed from: h */
    public <T extends MessageLite> T m33248h(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int m33252l = m33252l();
        if (this.f65639j >= 64) {
            throw InvalidProtocolBufferException.m33328b();
        }
        int m33244d = m33244d(m33252l);
        this.f65639j++;
        T mo32961a = parser.mo32961a(this, extensionRegistryLite);
        m33241a(0);
        this.f65639j--;
        this.f65638i = m33244d;
        m33256p();
        return mo32961a;
    }

    /* renamed from: i */
    public final byte[] m33249i(int i2) throws IOException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return Internal.f65673a;
            }
            throw InvalidProtocolBufferException.m33327a();
        }
        int i3 = this.f65637h;
        int i4 = this.f65634e;
        int i5 = i3 + i4 + i2;
        int i6 = this.f65638i;
        if (i5 > i6) {
            m33259s((i6 - i3) - i4);
            throw InvalidProtocolBufferException.m33329d();
        }
        if (i2 < 4096) {
            byte[] bArr = new byte[i2];
            int i7 = this.f65632c - i4;
            System.arraycopy(this.f65630a, i4, bArr, 0, i7);
            int i8 = this.f65632c;
            this.f65634e = i8;
            int i9 = i2 - i7;
            if (i8 - i8 < i9 && !m33260t(i9)) {
                throw InvalidProtocolBufferException.m33329d();
            }
            System.arraycopy(this.f65630a, 0, bArr, i7, i9);
            this.f65634e = i9;
            return bArr;
        }
        int i10 = this.f65632c;
        this.f65637h = i3 + i10;
        this.f65634e = 0;
        this.f65632c = 0;
        int i11 = i10 - i4;
        int i12 = i2 - i11;
        ArrayList arrayList = new ArrayList();
        while (i12 > 0) {
            int min = Math.min(i12, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr2 = new byte[min];
            int i13 = 0;
            while (i13 < min) {
                InputStream inputStream = this.f65635f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i13, min - i13);
                if (read == -1) {
                    throw InvalidProtocolBufferException.m33329d();
                }
                this.f65637h += read;
                i13 += read;
            }
            i12 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(this.f65630a, i4, bArr3, 0, i11);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            i11 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: j */
    public int m33250j() throws IOException {
        int i2 = this.f65634e;
        if (this.f65632c - i2 < 4) {
            m33257q(4);
            i2 = this.f65634e;
        }
        byte[] bArr = this.f65630a;
        this.f65634e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: k */
    public long m33251k() throws IOException {
        int i2 = this.f65634e;
        if (this.f65632c - i2 < 8) {
            m33257q(8);
            i2 = this.f65634e;
        }
        byte[] bArr = this.f65630a;
        this.f65634e = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m33252l() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f65634e
            int r1 = r9.f65632c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f65630a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f65634e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.m33254n()
            int r1 = (int) r0
            return r1
        L82:
            r9.f65634e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.m33252l():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r2[r0] < 0) goto L39;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m33253m() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.m33253m():long");
    }

    /* renamed from: n */
    public long m33254n() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f65634e == this.f65632c) {
                m33257q(1);
            }
            byte[] bArr = this.f65630a;
            int i3 = this.f65634e;
            this.f65634e = i3 + 1;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((bArr[i3] & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: o */
    public int m33255o() throws IOException {
        if (this.f65634e == this.f65632c && !m33260t(1)) {
            this.f65636g = 0;
            return 0;
        }
        int m33252l = m33252l();
        this.f65636g = m33252l;
        if ((m33252l >>> 3) != 0) {
            return m33252l;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: p */
    public final void m33256p() {
        int i2 = this.f65632c + this.f65633d;
        this.f65632c = i2;
        int i3 = this.f65637h + i2;
        int i4 = this.f65638i;
        if (i3 <= i4) {
            this.f65633d = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f65633d = i5;
        this.f65632c = i2 - i5;
    }

    /* renamed from: q */
    public final void m33257q(int i2) throws IOException {
        if (!m33260t(i2)) {
            throw InvalidProtocolBufferException.m33329d();
        }
    }

    /* renamed from: r */
    public boolean m33258r(int i2, CodedOutputStream codedOutputStream) throws IOException {
        int m33255o;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long m33253m = m33253m();
            codedOutputStream.m33288z(i2);
            codedOutputStream.m33271A(m33253m);
            return true;
        }
        if (i3 == 1) {
            long m33251k = m33251k();
            codedOutputStream.m33288z(i2);
            codedOutputStream.m33287y(m33251k);
            return true;
        }
        if (i3 == 2) {
            ByteString m33246f = m33246f();
            codedOutputStream.m33288z(i2);
            codedOutputStream.m33276n(m33246f);
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int m33250j = m33250j();
            codedOutputStream.m33288z(i2);
            codedOutputStream.m33286x(m33250j);
            return true;
        }
        codedOutputStream.m33288z(i2);
        do {
            m33255o = m33255o();
            if (m33255o == 0) {
                break;
            }
        } while (m33258r(m33255o, codedOutputStream));
        int i4 = ((i2 >>> 3) << 3) | 4;
        m33241a(i4);
        codedOutputStream.m33288z(i4);
        return true;
    }

    /* renamed from: s */
    public void m33259s(int i2) throws IOException {
        int i3 = this.f65632c;
        int i4 = this.f65634e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.f65634e = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m33327a();
        }
        int i5 = this.f65637h;
        int i6 = i5 + i4 + i2;
        int i7 = this.f65638i;
        if (i6 > i7) {
            m33259s((i7 - i5) - i4);
            throw InvalidProtocolBufferException.m33329d();
        }
        int i8 = i3 - i4;
        this.f65634e = i3;
        m33257q(1);
        while (true) {
            int i9 = i2 - i8;
            int i10 = this.f65632c;
            if (i9 <= i10) {
                this.f65634e = i9;
                return;
            } else {
                i8 += i10;
                this.f65634e = i10;
                m33257q(1);
            }
        }
    }

    /* renamed from: t */
    public final boolean m33260t(int i2) throws IOException {
        int i3 = this.f65634e;
        int i4 = i3 + i2;
        int i5 = this.f65632c;
        if (i4 <= i5) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f65637h + i3 + i2 <= this.f65638i && this.f65635f != null) {
            if (i3 > 0) {
                if (i5 > i3) {
                    byte[] bArr = this.f65630a;
                    System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                }
                this.f65637h += i3;
                this.f65632c -= i3;
                this.f65634e = 0;
            }
            InputStream inputStream = this.f65635f;
            byte[] bArr2 = this.f65630a;
            int i6 = this.f65632c;
            int read = inputStream.read(bArr2, i6, bArr2.length - i6);
            if (read == 0 || read < -1 || read > this.f65630a.length) {
                StringBuilder sb2 = new StringBuilder(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.f65632c += read;
                if ((this.f65637h + i2) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m33256p();
                if (this.f65632c >= i2) {
                    return true;
                }
                return m33260t(i2);
            }
        }
        return false;
    }
}
