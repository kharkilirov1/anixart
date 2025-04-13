package okio;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ByteString.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Companion", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: b */
    public transient int f68754b;

    /* renamed from: c */
    @Nullable
    public transient String f68755c;

    /* renamed from: d */
    @NotNull
    public final byte[] f68756d;

    /* renamed from: f */
    public static final Companion f68753f = new Companion(null);

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final ByteString f68752e = new ByteString(new byte[0]);

    /* compiled from: ByteString.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lokio/ByteString$Companion;", "", "Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: e */
        public static ByteString m34588e(Companion companion, byte[] bArr, int i2, int i3, int i4) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            Util.m34510b(bArr.length, i2, i3);
            return new ByteString(ArraysKt.m31971u(bArr, i2, i3 + i2));
        }

        @JvmStatic
        @Nullable
        /* renamed from: a */
        public final ByteString m34589a(@NotNull String decodeBase64) {
            int i2;
            int i3;
            char charAt;
            Intrinsics.m32179h(decodeBase64, "$this$decodeBase64");
            byte[] bArr = Base64.f68736a;
            int length = decodeBase64.length();
            while (length > 0 && ((charAt = decodeBase64.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                length = i3;
            }
            int i4 = (int) ((length * 6) / 8);
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i5 < length) {
                    char charAt2 = decodeBase64.charAt(i5);
                    if ('A' <= charAt2 && 'Z' >= charAt2) {
                        i2 = charAt2 - 'A';
                    } else if ('a' <= charAt2 && 'z' >= charAt2) {
                        i2 = charAt2 - 'G';
                    } else if ('0' <= charAt2 && '9' >= charAt2) {
                        i2 = charAt2 + 4;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        i2 = 62;
                    } else if (charAt2 == '/' || charAt2 == '_') {
                        i2 = 63;
                    } else {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                            break;
                        }
                        i5++;
                    }
                    i7 = (i7 << 6) | i2;
                    i6++;
                    if (i6 % 4 == 0) {
                        int i9 = i8 + 1;
                        bArr2[i8] = (byte) (i7 >> 16);
                        int i10 = i9 + 1;
                        bArr2[i9] = (byte) (i7 >> 8);
                        bArr2[i10] = (byte) i7;
                        i8 = i10 + 1;
                    }
                    i5++;
                } else {
                    int i11 = i6 % 4;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            bArr2[i8] = (byte) ((i7 << 12) >> 16);
                            i8++;
                        } else if (i11 == 3) {
                            int i12 = i7 << 6;
                            int i13 = i8 + 1;
                            bArr2[i8] = (byte) (i12 >> 16);
                            i8 = i13 + 1;
                            bArr2[i13] = (byte) (i12 >> 8);
                        }
                        if (i8 != i4) {
                            bArr2 = Arrays.copyOf(bArr2, i8);
                            Intrinsics.m32178g(bArr2, "java.util.Arrays.copyOf(this, newSize)");
                        }
                    }
                }
            }
            bArr2 = null;
            if (bArr2 != null) {
                return new ByteString(bArr2);
            }
            return null;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final ByteString m34590b(@NotNull String str) {
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(C0000a.m14k("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (ByteStringKt.m34626a(str.charAt(i3 + 1)) + (ByteStringKt.m34626a(str.charAt(i3)) << 4));
            }
            return new ByteString(bArr);
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: c */
        public final ByteString m34591c(@NotNull String encode, @NotNull Charset charset) {
            Intrinsics.m32179h(encode, "$this$encode");
            byte[] bytes = encode.getBytes(charset);
            Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @JvmStatic
        @NotNull
        /* renamed from: d */
        public final ByteString m34592d(@NotNull String encodeUtf8) {
            Intrinsics.m32179h(encodeUtf8, "$this$encodeUtf8");
            byte[] bytes = encodeUtf8.getBytes(Charsets.f66855b);
            Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f68755c = encodeUtf8;
            return byteString;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ByteString(@NotNull byte[] data) {
        Intrinsics.m32179h(data, "data");
        this.f68756d = data;
    }

    @JvmStatic
    @NotNull
    /* renamed from: c */
    public static final ByteString m34572c(@NotNull String str) {
        return f68753f.m34592d(str);
    }

    @JvmStatic
    @NotNull
    /* renamed from: i */
    public static final ByteString m34573i(@NotNull byte... data) {
        Intrinsics.m32179h(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        Intrinsics.m32178g(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    @NotNull
    /* renamed from: a */
    public String mo34574a() {
        byte[] encodeBase64 = this.f68756d;
        byte[] bArr = Base64.f68736a;
        byte[] map = Base64.f68736a;
        Intrinsics.m32179h(encodeBase64, "$this$encodeBase64");
        Intrinsics.m32179h(map, "map");
        byte[] bArr2 = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = encodeBase64[i2];
            int i5 = i4 + 1;
            byte b2 = encodeBase64[i4];
            int i6 = i5 + 1;
            byte b3 = encodeBase64[i5];
            int i7 = i3 + 1;
            bArr2[i3] = map[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr2[i8] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr2[i9] = map[b3 & 63];
            i2 = i6;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b4 = encodeBase64[i2];
            int i10 = i3 + 1;
            bArr2[i3] = map[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr2[i10] = map[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr2[i11] = b5;
            bArr2[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = encodeBase64[i2];
            byte b7 = encodeBase64[i12];
            int i13 = i3 + 1;
            bArr2[i3] = map[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr2[i13] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i14] = map[(b7 & 15) << 2];
            bArr2[i14 + 1] = (byte) 61;
        }
        return new String(bArr2, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: b */
    public ByteString mo34575b(@NotNull String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f68756d);
        Intrinsics.m32178g(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r8) {
        /*
            r7 = this;
            okio.ByteString r8 = (okio.ByteString) r8
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.m32179h(r8, r0)
            int r0 = r7.mo34576d()
            int r1 = r8.mo34576d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.mo34579h(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo34579h(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public int mo34576d() {
        return this.f68756d.length;
    }

    @NotNull
    /* renamed from: e */
    public String mo34577e() {
        byte[] bArr = this.f68756d;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = ByteStringKt.f68808a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int mo34576d = byteString.mo34576d();
            byte[] bArr = this.f68756d;
            if (mo34576d == bArr.length && byteString.mo34581k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public byte[] getF68756d() {
        return this.f68756d;
    }

    /* renamed from: h */
    public byte mo34579h(int i2) {
        return this.f68756d[i2];
    }

    public int hashCode() {
        int i2 = this.f68754b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f68756d);
        this.f68754b = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public boolean mo34580j(int i2, @NotNull ByteString byteString, int i3, int i4) {
        return byteString.mo34581k(i3, this.f68756d, i2, i4);
    }

    /* renamed from: k */
    public boolean mo34581k(int i2, @NotNull byte[] other, int i3, int i4) {
        Intrinsics.m32179h(other, "other");
        if (i2 >= 0) {
            byte[] bArr = this.f68756d;
            if (i2 <= bArr.length - i4 && i3 >= 0 && i3 <= other.length - i4 && Util.m34509a(bArr, i2, other, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: l */
    public ByteString m34582l() {
        return mo34575b("SHA-1");
    }

    /* renamed from: m */
    public final boolean m34583m(@NotNull ByteString prefix) {
        Intrinsics.m32179h(prefix, "prefix");
        return mo34580j(0, prefix, 0, prefix.mo34576d());
    }

    @NotNull
    /* renamed from: n */
    public ByteString mo34584n() {
        byte b;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f68756d;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.m32178g(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
            i2++;
        }
    }

    @NotNull
    /* renamed from: o */
    public byte[] mo34585o() {
        byte[] bArr = this.f68756d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.m32178g(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    /* renamed from: p */
    public String m34586p() {
        String str = this.f68755c;
        if (str != null) {
            return str;
        }
        byte[] toUtf8String = getF68756d();
        Intrinsics.m32179h(toUtf8String, "$this$toUtf8String");
        String str2 = new String(toUtf8String, Charsets.f66855b);
        this.f68755c = str2;
        return str2;
    }

    /* renamed from: q */
    public void mo34587q(@NotNull Buffer buffer, int i2, int i3) {
        buffer.m34521N(this.f68756d, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0182, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0171, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015e, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01eb, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0120, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0117, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0105, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00f6, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00e3, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00a5, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x009a, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0089, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01af, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ee, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
    
        if (r4 == 64) goto L214;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }
}
