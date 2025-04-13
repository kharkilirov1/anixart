package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame;
import com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.GeobFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.exo.metadata.id3.PrivFrame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;
import com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class d10 extends g11 {

    /* renamed from: b */
    public static final InterfaceC4950a f49524b = dn1.f49707r;

    /* renamed from: a */
    @Nullable
    private final InterfaceC4950a f49525a;

    /* renamed from: com.yandex.mobile.ads.impl.d10$a */
    public interface InterfaceC4950a {
        /* renamed from: a */
        boolean mo23779a(int i2, int i3, int i4, int i5, int i6);
    }

    /* renamed from: com.yandex.mobile.ads.impl.d10$b */
    public static final class C4951b {

        /* renamed from: a */
        private final int f49526a;

        /* renamed from: b */
        private final boolean f49527b;

        /* renamed from: c */
        private final int f49528c;

        public C4951b(int i2, int i3, boolean z) {
            this.f49526a = i2;
            this.f49527b = z;
            this.f49528c = i3;
        }
    }

    public d10(@Nullable InterfaceC4950a interfaceC4950a) {
        this.f49525a = interfaceC4950a;
    }

    /* renamed from: a */
    private static int m23758a(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static UrlLinkFrame m23770b(int i2, ap0 ap0Var, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        ap0Var.m22583a(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m23767b(0, bArr), "ISO-8859-1"));
    }

    /* renamed from: b */
    private static String m23771b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m23772b(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    /* renamed from: c */
    private static MlltFrame m23773c(int i2, ap0 ap0Var) {
        int m22613z = ap0Var.m22613z();
        int m22610w = ap0Var.m22610w();
        int m22610w2 = ap0Var.m22610w();
        int m22607t = ap0Var.m22607t();
        int m22607t2 = ap0Var.m22607t();
        zo0 zo0Var = new zo0();
        zo0Var.m30249a(ap0Var.m22590e(), ap0Var.m22587c());
        zo0Var.m30255c(ap0Var.m22588d() * 8);
        int i3 = ((i2 - 10) * 8) / (m22607t + m22607t2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m30252b = zo0Var.m30252b(m22607t);
            int m30252b2 = zo0Var.m30252b(m22607t2);
            iArr[i4] = m30252b;
            iArr2[i4] = m30252b2;
        }
        return new MlltFrame(m22613z, m22610w, m22610w2, iArr, iArr2);
    }

    /* renamed from: d */
    private static PrivFrame m23775d(int i2, ap0 ap0Var) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        ap0Var.m22583a(bArr, 0, i2);
        int m23767b = m23767b(0, bArr);
        String str = new String(bArr, 0, m23767b, "ISO-8859-1");
        int i3 = m23767b + 1;
        return new PrivFrame(str, i2 <= i3 ? s91.f54535f : Arrays.copyOfRange(bArr, i3, i2));
    }

    @Nullable
    /* renamed from: e */
    private static TextInformationFrame m23776e(int i2, ap0 ap0Var) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        ap0Var.m22583a(bArr, 0, i3);
        int m23759a = m23759a(bArr, 0, m22607t);
        String str = new String(bArr, 0, m23759a, m23771b);
        int m23758a = m23759a + m23758a(m22607t);
        int m23759a2 = m23759a(bArr, m23758a, m22607t);
        return new TextInformationFrame("TXXX", str, (m23759a2 <= m23758a || m23759a2 > i3) ? "" : new String(bArr, m23758a, m23759a2 - m23758a, m23771b));
    }

    @Nullable
    /* renamed from: f */
    private static UrlLinkFrame m23777f(int i2, ap0 ap0Var) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        ap0Var.m22583a(bArr, 0, i3);
        int m23759a = m23759a(bArr, 0, m22607t);
        String str = new String(bArr, 0, m23759a, m23771b);
        int m23758a = m23759a + m23758a(m22607t);
        int m23767b = m23767b(m23758a, bArr);
        return new UrlLinkFrame("WXXX", str, (m23767b <= m23758a || m23767b > i3) ? "" : new String(bArr, m23758a, m23767b - m23758a, "ISO-8859-1"));
    }

    @Override // com.yandex.mobile.ads.impl.g11
    @Nullable
    /* renamed from: a */
    public final Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer) {
        return m23778a(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.exo.metadata.Metadata m23778a(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d10.m23778a(int, byte[]):com.yandex.mobile.ads.exo.metadata.Metadata");
    }

    /* renamed from: b */
    private static GeobFrame m23769b(int i2, ap0 ap0Var) throws UnsupportedEncodingException {
        byte[] copyOfRange;
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        ap0Var.m22583a(bArr, 0, i3);
        int m23767b = m23767b(0, bArr);
        String str = new String(bArr, 0, m23767b, "ISO-8859-1");
        int i4 = m23767b + 1;
        int m23759a = m23759a(bArr, i4, m22607t);
        String str2 = "";
        String str3 = (m23759a <= i4 || m23759a > i3) ? "" : new String(bArr, i4, m23759a - i4, m23771b);
        int m23758a = m23759a + m23758a(m22607t);
        int m23759a2 = m23759a(bArr, m23758a, m22607t);
        if (m23759a2 > m23758a && m23759a2 <= i3) {
            str2 = new String(bArr, m23758a, m23759a2 - m23758a, m23771b);
        }
        int m23758a2 = m23759a2 + m23758a(m22607t);
        if (i3 <= m23758a2) {
            copyOfRange = s91.f54535f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m23758a2, i3);
        }
        return new GeobFrame(str, str3, str2, copyOfRange);
    }

    /* renamed from: b */
    private static ChapterTocFrame m23768b(ap0 ap0Var, int i2, int i3, boolean z, int i4, @Nullable InterfaceC4950a interfaceC4950a) throws UnsupportedEncodingException {
        int m22588d = ap0Var.m22588d();
        int m23767b = m23767b(m22588d, ap0Var.m22587c());
        String str = new String(ap0Var.m22587c(), m22588d, m23767b - m22588d, "ISO-8859-1");
        ap0Var.m22591e(m23767b + 1);
        int m22607t = ap0Var.m22607t();
        boolean z2 = (m22607t & 2) != 0;
        boolean z3 = (m22607t & 1) != 0;
        int m22607t2 = ap0Var.m22607t();
        String[] strArr = new String[m22607t2];
        for (int i5 = 0; i5 < m22607t2; i5++) {
            int m22588d2 = ap0Var.m22588d();
            int m23767b2 = m23767b(m22588d2, ap0Var.m22587c());
            strArr[i5] = new String(ap0Var.m22587c(), m22588d2, m23767b2 - m22588d2, "ISO-8859-1");
            ap0Var.m22591e(m23767b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = m22588d + i2;
        while (ap0Var.m22588d() < i6) {
            Id3Frame m23763a = m23763a(i3, ap0Var, z, i4, interfaceC4950a);
            if (m23763a != null) {
                arrayList.add(m23763a);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m23766a(com.yandex.mobile.ads.impl.ap0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m22588d()
        L8:
            int r3 = r18.m22579a()     // Catch: java.lang.Throwable -> Lad
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m22595h()     // Catch: java.lang.Throwable -> Lad
            long r8 = r18.m22609v()     // Catch: java.lang.Throwable -> Lad
            int r10 = r18.m22613z()     // Catch: java.lang.Throwable -> Lad
            goto L2c
        L22:
            int r7 = r18.m22610w()     // Catch: java.lang.Throwable -> Lad
            int r8 = r18.m22610w()     // Catch: java.lang.Throwable -> Lad
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m22591e(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.m22591e(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L88
            goto L89
        L79:
            if (r0 != r3) goto L87
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = 1
            goto L82
        L81:
            r3 = 0
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L88
            goto L89
        L87:
            r3 = 0
        L88:
            r4 = 0
        L89:
            if (r4 == 0) goto L8d
            int r3 = r3 + 4
        L8d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L96
            r1.m22591e(r2)
            return r6
        L96:
            int r3 = r18.m22579a()     // Catch: java.lang.Throwable -> Lad
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La3
            r1.m22591e(r2)
            return r6
        La3:
            int r3 = (int) r8
            r1.m22593f(r3)     // Catch: java.lang.Throwable -> Lad
            goto L8
        La9:
            r1.m22591e(r2)
            return r4
        Lad:
            r0 = move-exception
            r1.m22591e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d10.m23766a(com.yandex.mobile.ads.impl.ap0, int, int, boolean):boolean");
    }

    /* renamed from: b */
    private static int m23767b(int i2, byte[] bArr) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b3, code lost:
    
        if (r13 == 67) goto L140;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.exo.metadata.id3.Id3Frame m23763a(int r19, com.yandex.mobile.ads.impl.ap0 r20, boolean r21, int r22, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.d10.InterfaceC4950a r23) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d10.m23763a(int, com.yandex.mobile.ads.impl.ap0, boolean, int, com.yandex.mobile.ads.impl.d10$a):com.yandex.mobile.ads.exo.metadata.id3.Id3Frame");
    }

    @Nullable
    /* renamed from: a */
    private static TextInformationFrame m23764a(int i2, ap0 ap0Var, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        ap0Var.m22583a(bArr, 0, i3);
        return new TextInformationFrame(str, null, new String(bArr, 0, m23759a(bArr, 0, m22607t), m23771b));
    }

    /* renamed from: a */
    private static ApicFrame m23760a(int i2, int i3, ap0 ap0Var) throws UnsupportedEncodingException {
        int m23767b;
        String m29049a;
        byte[] copyOfRange;
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        ap0Var.m22583a(bArr, 0, i4);
        if (i3 == 2) {
            StringBuilder m26356a = l60.m26356a("image/");
            m26356a.append(C5114ga.m24832b(new String(bArr, 0, 3, "ISO-8859-1")));
            String sb = m26356a.toString();
            if ("image/jpg".equals(sb)) {
                sb = "image/jpeg";
            }
            m29049a = sb;
            m23767b = 2;
        } else {
            m23767b = m23767b(0, bArr);
            String m24832b = C5114ga.m24832b(new String(bArr, 0, m23767b, "ISO-8859-1"));
            m29049a = m24832b.indexOf(47) == -1 ? um1.m29049a("image/", m24832b) : m24832b;
        }
        int i5 = bArr[m23767b + 1] & 255;
        int i6 = m23767b + 2;
        int m23759a = m23759a(bArr, i6, m22607t);
        String str = new String(bArr, i6, m23759a - i6, m23771b);
        int m23758a = m23759a + m23758a(m22607t);
        if (i4 <= m23758a) {
            copyOfRange = s91.f54535f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m23758a, i4);
        }
        return new ApicFrame(m29049a, str, i5, copyOfRange);
    }

    @Nullable
    /* renamed from: a */
    private static CommentFrame m23762a(int i2, ap0 ap0Var) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int m22607t = ap0Var.m22607t();
        String m23771b = m23771b(m22607t);
        byte[] bArr = new byte[3];
        ap0Var.m22583a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        ap0Var.m22583a(bArr2, 0, i3);
        int m23759a = m23759a(bArr2, 0, m22607t);
        String str2 = new String(bArr2, 0, m23759a, m23771b);
        int m23758a = m23759a + m23758a(m22607t);
        int m23759a2 = m23759a(bArr2, m23758a, m22607t);
        return new CommentFrame(str, str2, (m23759a2 <= m23758a || m23759a2 > i3) ? "" : new String(bArr2, m23758a, m23759a2 - m23758a, m23771b));
    }

    /* renamed from: a */
    private static ChapterFrame m23761a(ap0 ap0Var, int i2, int i3, boolean z, int i4, @Nullable InterfaceC4950a interfaceC4950a) throws UnsupportedEncodingException {
        int m22588d = ap0Var.m22588d();
        int m23767b = m23767b(m22588d, ap0Var.m22587c());
        String str = new String(ap0Var.m22587c(), m22588d, m23767b - m22588d, "ISO-8859-1");
        ap0Var.m22591e(m23767b + 1);
        int m22595h = ap0Var.m22595h();
        int m22595h2 = ap0Var.m22595h();
        long m22609v = ap0Var.m22609v();
        long j2 = m22609v == 4294967295L ? -1L : m22609v;
        long m22609v2 = ap0Var.m22609v();
        long j3 = m22609v2 == 4294967295L ? -1L : m22609v2;
        ArrayList arrayList = new ArrayList();
        int i5 = m22588d + i2;
        while (ap0Var.m22588d() < i5) {
            Id3Frame m23763a = m23763a(i3, ap0Var, z, i4, interfaceC4950a);
            if (m23763a != null) {
                arrayList.add(m23763a);
            }
        }
        return new ChapterFrame(str, m22595h, m22595h2, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: a */
    private static String m23765a(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    /* renamed from: a */
    private static int m23759a(byte[] bArr, int i2, int i3) {
        int m23767b = m23767b(i2, bArr);
        if (i3 == 0 || i3 == 3) {
            return m23767b;
        }
        while (m23767b < bArr.length - 1) {
            if ((m23767b - i2) % 2 == 0 && bArr[m23767b + 1] == 0) {
                return m23767b;
            }
            m23767b = m23767b(m23767b + 1, bArr);
        }
        return bArr.length;
    }
}
