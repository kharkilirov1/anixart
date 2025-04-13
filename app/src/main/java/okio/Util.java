package okio;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: -Util.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"okio"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* renamed from: okio.-Util, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Util {
    /* renamed from: a */
    public static final boolean m34509a(@NotNull byte[] a2, int i2, @NotNull byte[] bArr, int i3, int i4) {
        Intrinsics.m32179h(a2, "a");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != bArr[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m34510b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* renamed from: c */
    public static final int m34511c(int i2) {
        return ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    @NotNull
    /* renamed from: d */
    public static final String m34512d(byte b) {
        char[] cArr = ByteStringKt.f68808a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
