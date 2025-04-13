package com.google.android.play.core.internal;

import android.util.Pair;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.KotlinVersion;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzi {
    /* renamed from: a */
    public static X509Certificate[][] m10899a(String str) throws zzf, SecurityException, IOException {
        Pair<ByteBuffer, Long> m10910a;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                m10910a = null;
            } else {
                m10910a = zzj.m10910a(randomAccessFile, 0);
                if (m10910a == null) {
                    m10910a = zzj.m10910a(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            if (m10910a == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzf(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) m10910a.first;
            long longValue = ((Long) m10910a.second).longValue();
            long j2 = (-20) + longValue;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            zzj.m10911b(byteBuffer);
            long j3 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j3 >= longValue) {
                StringBuilder sb2 = new StringBuilder(C4632R.styleable.AppCompatTheme_windowFixedWidthMajor);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j3);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new zzf(sb2.toString());
            }
            zzj.m10911b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j3 != longValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j3 < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j3);
                throw new zzf(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j3 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j4 = allocate.getLong(0);
            if (j4 < allocate.capacity() || j4 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j4);
                throw new zzf(sb4.toString());
            }
            int i2 = (int) (8 + j4);
            long j5 = j3 - i2;
            if (j5 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j5);
                throw new zzf(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j4) {
                StringBuilder sb6 = new StringBuilder(C4632R.styleable.AppCompatTheme_textAppearanceListItem);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j6);
                sb6.append(" vs ");
                sb6.append(j4);
                throw new zzf(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j5));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i3 = 0;
                while (slice.hasRemaining()) {
                    i3++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(70);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i3);
                        throw new zzf(sb9.toString());
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > ParserMinimalBase.MAX_INT_L) {
                        StringBuilder sb10 = new StringBuilder(76);
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i3);
                        sb10.append(" size out of range: ");
                        sb10.append(j7);
                        throw new zzf(sb10.toString());
                    }
                    int i4 = (int) j7;
                    int position2 = slice.position() + i4;
                    if (i4 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(91);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i3);
                        sb11.append(" size out of range: ");
                        sb11.append(i4);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new zzf(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] m10909k = m10909k(randomAccessFile.getChannel(), new zze(m10903e(slice, i4 - 4), longValue2, j3, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return m10909k;
                    }
                    slice.position(position2);
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: b */
    public static int m10900b(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(C0576a.m4111j(44, "Unknown content digest algorthm: ", i2));
    }

    /* renamed from: c */
    public static int m10901c(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString(i2));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: d */
    public static String m10902d(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(C0576a.m4111j(44, "Unknown content digest algorthm: ", i2));
    }

    /* renamed from: e */
    public static ByteBuffer m10903e(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        if (i2 < 0) {
            throw new IllegalArgumentException(C0576a.m4111j(17, "size: ", i2));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (i3 < position || i3 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: f */
    public static ByteBuffer m10904f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(C0576a.m4111j(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return m10903e(byteBuffer, i2);
        }
        throw new IOException(C0576a.m4112k(101, "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", byteBuffer.remaining()));
    }

    /* renamed from: g */
    public static void m10905g(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[2] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[3] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[4] = (byte) (i2 >> 24);
    }

    /* renamed from: h */
    public static byte[] m10906h(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 > byteBuffer.remaining()) {
            throw new IOException(C0576a.m4112k(90, "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = m10901c(r10);
        r12 = m10901c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L146;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] m10907i(java.nio.ByteBuffer r21, java.util.Map<java.lang.Integer, byte[]> r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzi.m10907i(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: j */
    public static byte[][] m10908j(int[] iArr, zzc[] zzcVarArr) throws DigestException {
        int i2;
        long j2;
        int length;
        String str;
        long j3 = 0;
        int i3 = 0;
        long j4 = 0;
        while (true) {
            i2 = 3;
            j2 = 1048576;
            if (i3 >= 3) {
                break;
            }
            j4 += (zzcVarArr[i3].mo10852u() + 1048575) / 1048576;
            i3++;
        }
        if (j4 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j4);
            throw new DigestException(sb.toString());
        }
        int i4 = (int) j4;
        byte[][] bArr = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(m10900b(iArr[i5]) * i4) + 5];
            bArr2[0] = 90;
            m10905g(i4, bArr2);
            bArr[i5] = bArr2;
            i5++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String m10902d = m10902d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(m10902d);
                i6++;
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(m10902d.concat(" digest not supported"), e2);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i2) {
            zzc zzcVar = zzcVarArr[i7];
            String str2 = str;
            int i10 = i9;
            long mo10852u = zzcVar.mo10852u();
            long j5 = j2;
            long j6 = j3;
            while (mo10852u > j3) {
                int min = (int) Math.min(mo10852u, j5);
                m10905g(min, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    zzcVar.mo10851a(messageDigestArr, j6, min);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int m10900b = m10900b(i13);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i8 * m10900b) + 5, m10900b);
                        if (digest != m10900b) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i12++;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j7 = min;
                    j6 += j7;
                    mo10852u -= j7;
                    i8++;
                    j3 = 0;
                    j5 = 1048576;
                } catch (IOException e3) {
                    throw new DigestException(C0576a.m4112k(59, "Failed to digest chunk #", i8, " of section #", i10), e3);
                }
            }
            i9 = i10 + 1;
            i7++;
            j3 = 0;
            i2 = 3;
            j2 = 1048576;
            str = str2;
        }
        String str3 = str;
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String m10902d2 = m10902d(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(m10902d2).digest(bArr7);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(m10902d2.concat(str3), e4);
            }
        }
        return bArr6;
    }

    /* renamed from: k */
    public static X509Certificate[][] m10909k(FileChannel fileChannel, zze zzeVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer m10904f = m10904f(zzeVar.f20149a);
                int i2 = 0;
                while (m10904f.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(m10907i(m10904f(m10904f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j2 = zzeVar.f20150b;
                long j3 = zzeVar.f20151c;
                long j4 = zzeVar.f20152d;
                ByteBuffer byteBuffer = zzeVar.f20153e;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                zzd zzdVar = new zzd(fileChannel, 0L, j2);
                zzd zzdVar2 = new zzd(fileChannel, j3, j4 - j3);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzj.m10911b(duplicate);
                int position = duplicate.position() + 16;
                if (j2 < 0 || j2 > 4294967295L) {
                    StringBuilder sb2 = new StringBuilder(47);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(j2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                duplicate.putInt(duplicate.position() + position, (int) j2);
                zzb zzbVar = new zzb(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] m10908j = m10908j(iArr, new zzc[]{zzdVar, zzdVar2, zzbVar});
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i5)), m10908j[i4])) {
                            throw new SecurityException(m10902d(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e3) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e3);
                }
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e5);
        }
    }
}
