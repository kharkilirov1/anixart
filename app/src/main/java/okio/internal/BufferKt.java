package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.Segment;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"okio"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BufferKt {

    /* renamed from: a */
    @NotNull
    public static final byte[] f68807a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.f66855b);
        Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
        f68807a = bytes;
    }

    /* renamed from: a */
    public static final boolean m34623a(@NotNull Segment segment, int i2, @NotNull byte[] bArr, int i3, int i4) {
        int i5 = segment.f68795c;
        byte[] bArr2 = segment.f68793a;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.f68798f;
                Intrinsics.m32176e(segment);
                byte[] bArr3 = segment.f68793a;
                bArr2 = bArr3;
                i2 = segment.f68794b;
                i5 = segment.f68795c;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @NotNull
    /* renamed from: b */
    public static final String m34624b(@NotNull Buffer readUtf8Line, long j2) {
        Intrinsics.m32179h(readUtf8Line, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (readUtf8Line.m34539e(j3) == ((byte) 13)) {
                String m34555n = readUtf8Line.m34555n(j3);
                readUtf8Line.skip(2L);
                return m34555n;
            }
        }
        String m34555n2 = readUtf8Line.m34555n(j2);
        readUtf8Line.skip(1L);
        return m34555n2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        return r10;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m34625c(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.m34625c(okio.Buffer, okio.Options, boolean):int");
    }
}
