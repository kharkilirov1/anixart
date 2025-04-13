package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class InetAddresses {

    /* renamed from: a */
    public static final CharMatcher f21890a = CharMatcher.m11131j('.');

    /* renamed from: b */
    public static final CharMatcher f21891b = CharMatcher.m11131j(':');

    @Beta
    public static final class TeredoInfo {
    }

    static {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012c, code lost:
    
        if (r3 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012e, code lost:
    
        r11 = (r11 << 4) | java.lang.Character.digit(r2.charAt(r3), 16);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x013c, code lost:
    
        r1.putShort((short) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0148, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0149, code lost:
    
        r7 = r1.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0104, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0050, code lost:
    
        r11 = java.lang.Integer.toHexString(((r2[0] & 255) << 8) | (r2[1] & 255));
        r2 = java.lang.Integer.toHexString((r2[3] & 255) | ((r2[2] & 255) << 8));
        r2 = com.google.android.exoplayer2.extractor.C1008a.m6437d(androidx.room.util.C0576a.m4106e(r2, androidx.room.util.C0576a.m4106e(r11, androidx.room.util.C0576a.m4106e(r10, 1))), r10, r11, ":", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0083, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0150, code lost:
    
        if (r2 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        if (r1 == (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0155, code lost:
    
        r7 = m12067c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        if (r3 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0039, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        r2 = r14.lastIndexOf(58) + 1;
        r10 = r14.substring(0, r2);
        r2 = m12067c(r14.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r1 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        r2 = r2.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r1 = com.google.common.net.InetAddresses.f21891b.mo11136f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r1 < 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (r1 <= 8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r1 = r1 + 1;
        r10 = 8 - r1;
        r11 = 0;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r11 >= (r2.length() - 1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r2.charAt(r11) != ':') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        if (r2.charAt(r11 + 1) != ':') goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
    
        if (r12 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (r11 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r11 != (r2.length() - 2)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r2.charAt(0) != ':') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        if (r2.charAt(1) == ':') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
    
        if (r2.charAt(r2.length() - 1) != ':') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e9, code lost:
    
        if (r2.charAt(r2.length() - 2) == ':') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ed, code lost:
    
        if (r12 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ef, code lost:
    
        if (r10 > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f3, code lost:
    
        if (r12 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f5, code lost:
    
        if (r1 == 8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
    
        r1 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:
    
        if (r2.charAt(0) != ':') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0102, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
    
        if (r3 >= r2.length()) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        r4 = r2.indexOf(58, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010f, code lost:
    
        if (r4 != (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0111, code lost:
    
        r4 = r2.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0119, code lost:
    
        if (r2.charAt(r3) != ':') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011c, code lost:
    
        if (r3 >= r10) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011e, code lost:
    
        r1.putShort(0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0140, code lost:
    
        r3 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0124, code lost:
    
        r11 = r4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0126, code lost:
    
        if (r11 <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0129, code lost:
    
        if (r11 > 4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012b, code lost:
    
        r11 = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress m12065a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.m12065a(java.lang.String):java.net.InetAddress");
    }

    /* renamed from: b */
    public static byte m12066b(String str, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 3) {
            throw new NumberFormatException();
        }
        if (i4 > 1 && str.charAt(i2) == '0') {
            throw new NumberFormatException();
        }
        int i5 = 0;
        while (i2 < i3) {
            int i6 = i5 * 10;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit < 0) {
                throw new NumberFormatException();
            }
            i5 = i6 + digit;
            i2++;
        }
        if (i5 <= 255) {
            return (byte) i5;
        }
        throw new NumberFormatException();
    }

    @NullableDecl
    /* renamed from: c */
    public static byte[] m12067c(String str) {
        if (f21890a.mo11136f(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int indexOf = str.indexOf(46, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i3] = m12066b(str, i2, indexOf);
                i2 = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }
}
