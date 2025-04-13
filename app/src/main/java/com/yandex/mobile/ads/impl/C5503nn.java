package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.yandex.mobile.ads.impl.aa0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.nn */
/* loaded from: classes3.dex */
final class C5503nn implements InterfaceC4882br {

    /* renamed from: a */
    private final byte[] f53041a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<a> f53042b = new ArrayDeque<>();

    /* renamed from: c */
    private final ba1 f53043c = new ba1();

    /* renamed from: d */
    private InterfaceC4821ar f53044d;

    /* renamed from: e */
    private int f53045e;

    /* renamed from: f */
    private int f53046f;

    /* renamed from: g */
    private long f53047g;

    /* renamed from: com.yandex.mobile.ads.impl.nn$a */
    public static final class a {

        /* renamed from: a */
        private final int f53048a;

        /* renamed from: b */
        private final long f53049b;

        public /* synthetic */ a(int i2, long j2, int i3) {
            this(i2, j2);
        }

        private a(int i2, long j2) {
            this.f53048a = i2;
            this.f53049b = j2;
        }
    }

    /* renamed from: a */
    public final void m26928a(InterfaceC4821ar interfaceC4821ar) {
        this.f53044d = interfaceC4821ar;
    }

    /* renamed from: a */
    public final void m26927a() {
        this.f53045e = 0;
        this.f53042b.clear();
        this.f53043c.m22759b();
    }

    /* renamed from: a */
    public final boolean m26929a(C5598pn c5598pn) throws IOException {
        int i2;
        String str;
        double longBitsToDouble;
        C5220ia.m25474b(this.f53044d);
        while (true) {
            a peek = this.f53042b.peek();
            if (peek != null && c5598pn.getPosition() >= peek.f53049b) {
                aa0.this.m22433b(this.f53042b.pop().f53048a);
                return true;
            }
            int i3 = 0;
            if (this.f53045e == 0) {
                long m22758a = this.f53043c.m22758a(c5598pn, true, false, 4);
                if (m22758a == -2) {
                    c5598pn.mo26765c();
                    while (true) {
                        c5598pn.mo26764b(this.f53041a, 0, 4, false);
                        int m22755a = ba1.m22755a(this.f53041a[0]);
                        if (m22755a != -1 && m22755a <= 4) {
                            int m22756a = (int) ba1.m22756a(this.f53041a, m22755a, false);
                            if (((aa0.C4799a) this.f53044d).m22434a(m22756a)) {
                                c5598pn.mo26760a(m22755a);
                                m22758a = m22756a;
                            }
                        }
                        c5598pn.mo26760a(1);
                    }
                }
                if (m22758a == -1) {
                    return false;
                }
                this.f53046f = (int) m22758a;
                this.f53045e = 1;
            }
            if (this.f53045e == 1) {
                this.f53047g = this.f53043c.m22758a(c5598pn, false, true, 8);
                this.f53045e = 2;
            }
            InterfaceC4821ar interfaceC4821ar = this.f53044d;
            int i4 = this.f53046f;
            Objects.requireNonNull(aa0.this);
            switch (i4) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long position = c5598pn.getPosition();
                    this.f53042b.push(new a(this.f53046f, this.f53047g + position, i3));
                    aa0.this.m22428a(this.f53046f, position, this.f53047g);
                    this.f53045e = 0;
                    return true;
                }
                long j2 = 0;
                if (i2 == 2) {
                    long j3 = this.f53047g;
                    if (j3 <= 8) {
                        InterfaceC4821ar interfaceC4821ar2 = this.f53044d;
                        int i5 = this.f53046f;
                        int i6 = (int) j3;
                        c5598pn.mo26762a(this.f53041a, 0, i6, false);
                        for (int i7 = 0; i7 < i6; i7++) {
                            j2 = (this.f53041a[i7] & 255) | (j2 << 8);
                        }
                        aa0.this.m22427a(i5, j2);
                        this.f53045e = 0;
                        return true;
                    }
                    StringBuilder m26356a = l60.m26356a("Invalid integer size: ");
                    m26356a.append(this.f53047g);
                    throw ep0.m24225a(m26356a.toString(), (Exception) null);
                }
                if (i2 == 3) {
                    long j4 = this.f53047g;
                    if (j4 <= ParserMinimalBase.MAX_INT_L) {
                        InterfaceC4821ar interfaceC4821ar3 = this.f53044d;
                        int i8 = this.f53046f;
                        int i9 = (int) j4;
                        if (i9 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i9];
                            c5598pn.mo26762a(bArr, 0, i9, false);
                            while (i9 > 0 && bArr[i9 - 1] == 0) {
                                i9--;
                            }
                            str = new String(bArr, 0, i9);
                        }
                        aa0.this.m22429a(i8, str);
                        this.f53045e = 0;
                        return true;
                    }
                    StringBuilder m26356a2 = l60.m26356a("String element size: ");
                    m26356a2.append(this.f53047g);
                    throw ep0.m24225a(m26356a2.toString(), (Exception) null);
                }
                if (i2 == 4) {
                    aa0.this.m22426a(this.f53046f, (int) this.f53047g, c5598pn);
                    this.f53045e = 0;
                    return true;
                }
                if (i2 == 5) {
                    long j5 = this.f53047g;
                    if (j5 != 4 && j5 != 8) {
                        StringBuilder m26356a3 = l60.m26356a("Invalid float size: ");
                        m26356a3.append(this.f53047g);
                        throw ep0.m24225a(m26356a3.toString(), (Exception) null);
                    }
                    InterfaceC4821ar interfaceC4821ar4 = this.f53044d;
                    int i10 = this.f53046f;
                    int i11 = (int) j5;
                    c5598pn.mo26762a(this.f53041a, 0, i11, false);
                    for (int i12 = 0; i12 < i11; i12++) {
                        j2 = (j2 << 8) | (this.f53041a[i12] & 255);
                    }
                    if (i11 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) j2);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(j2);
                    }
                    aa0.this.m22425a(i10, longBitsToDouble);
                    this.f53045e = 0;
                    return true;
                }
                throw ep0.m24225a("Invalid element type " + i2, (Exception) null);
            }
            c5598pn.mo26760a((int) this.f53047g);
            this.f53045e = 0;
        }
    }
}
