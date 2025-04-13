package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class GifHeaderParser {

    /* renamed from: b */
    public ByteBuffer f8018b;

    /* renamed from: c */
    public GifHeader f8019c;

    /* renamed from: a */
    public final byte[] f8017a = new byte[256];

    /* renamed from: d */
    public int f8020d = 0;

    /* renamed from: a */
    public final boolean m4940a() {
        return this.f8019c.f8007b != 0;
    }

    @NonNull
    /* renamed from: b */
    public GifHeader m4941b() {
        if (this.f8018b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m4940a()) {
            return this.f8019c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) m4942c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f8019c.f8011f = m4945f();
            this.f8019c.f8012g = m4945f();
            int m4942c = m4942c();
            GifHeader gifHeader = this.f8019c;
            gifHeader.f8013h = (m4942c & 128) != 0;
            gifHeader.f8014i = (int) Math.pow(2.0d, (m4942c & 7) + 1);
            this.f8019c.f8015j = m4942c();
            GifHeader gifHeader2 = this.f8019c;
            m4942c();
            Objects.requireNonNull(gifHeader2);
            if (this.f8019c.f8013h && !m4940a()) {
                GifHeader gifHeader3 = this.f8019c;
                gifHeader3.f8006a = m4944e(gifHeader3.f8014i);
                GifHeader gifHeader4 = this.f8019c;
                gifHeader4.f8016k = gifHeader4.f8006a[gifHeader4.f8015j];
            }
        } else {
            this.f8019c.f8007b = 1;
        }
        if (!m4940a()) {
            boolean z = false;
            while (!z && !m4940a() && this.f8019c.f8008c <= Integer.MAX_VALUE) {
                int m4942c2 = m4942c();
                if (m4942c2 == 33) {
                    int m4942c3 = m4942c();
                    if (m4942c3 == 1) {
                        m4946g();
                    } else if (m4942c3 == 249) {
                        this.f8019c.f8009d = new GifFrame();
                        m4942c();
                        int m4942c4 = m4942c();
                        GifFrame gifFrame = this.f8019c.f8009d;
                        int i3 = (m4942c4 & 28) >> 2;
                        gifFrame.f8001g = i3;
                        if (i3 == 0) {
                            gifFrame.f8001g = 1;
                        }
                        gifFrame.f8000f = (m4942c4 & 1) != 0;
                        int m4945f = m4945f();
                        if (m4945f < 2) {
                            m4945f = 10;
                        }
                        GifFrame gifFrame2 = this.f8019c.f8009d;
                        gifFrame2.f8003i = m4945f * 10;
                        gifFrame2.f8002h = m4942c();
                        m4942c();
                    } else if (m4942c3 == 254) {
                        m4946g();
                    } else if (m4942c3 != 255) {
                        m4946g();
                    } else {
                        m4943d();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i4 = 0; i4 < 11; i4++) {
                            sb2.append((char) this.f8017a[i4]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m4943d();
                                byte[] bArr = this.f8017a;
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    Objects.requireNonNull(this.f8019c);
                                }
                                if (this.f8020d > 0) {
                                }
                            } while (!m4940a());
                        } else {
                            m4946g();
                        }
                    }
                } else if (m4942c2 == 44) {
                    GifHeader gifHeader5 = this.f8019c;
                    if (gifHeader5.f8009d == null) {
                        gifHeader5.f8009d = new GifFrame();
                    }
                    gifHeader5.f8009d.f7995a = m4945f();
                    this.f8019c.f8009d.f7996b = m4945f();
                    this.f8019c.f8009d.f7997c = m4945f();
                    this.f8019c.f8009d.f7998d = m4945f();
                    int m4942c5 = m4942c();
                    boolean z2 = (m4942c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (m4942c5 & 7) + 1);
                    GifFrame gifFrame3 = this.f8019c.f8009d;
                    gifFrame3.f7999e = (m4942c5 & 64) != 0;
                    if (z2) {
                        gifFrame3.f8005k = m4944e(pow);
                    } else {
                        gifFrame3.f8005k = null;
                    }
                    this.f8019c.f8009d.f8004j = this.f8018b.position();
                    m4942c();
                    m4946g();
                    if (!m4940a()) {
                        GifHeader gifHeader6 = this.f8019c;
                        gifHeader6.f8008c++;
                        gifHeader6.f8010e.add(gifHeader6.f8009d);
                    }
                } else if (m4942c2 != 59) {
                    this.f8019c.f8007b = 1;
                } else {
                    z = true;
                }
            }
            GifHeader gifHeader7 = this.f8019c;
            if (gifHeader7.f8008c < 0) {
                gifHeader7.f8007b = 1;
            }
        }
        return this.f8019c;
    }

    /* renamed from: c */
    public final int m4942c() {
        try {
            return this.f8018b.get() & 255;
        } catch (Exception unused) {
            this.f8019c.f8007b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void m4943d() {
        int m4942c = m4942c();
        this.f8020d = m4942c;
        if (m4942c <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f8020d;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.f8018b.get(this.f8017a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder m26w = C0000a.m26w("Error Reading Block n: ", i2, " count: ", i3, " blockSize: ");
                    m26w.append(this.f8020d);
                    Log.d("GifHeaderParser", m26w.toString(), e2);
                }
                this.f8019c.f8007b = 1;
                return;
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public final int[] m4944e(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f8018b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f8019c.f8007b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final int m4945f() {
        return this.f8018b.getShort();
    }

    /* renamed from: g */
    public final void m4946g() {
        int m4942c;
        do {
            m4942c = m4942c();
            this.f8018b.position(Math.min(this.f8018b.position() + m4942c, this.f8018b.limit()));
        } while (m4942c > 0);
    }
}
