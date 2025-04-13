package io.grpc.internal;

import com.google.common.base.Charsets;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class TransportFrameUtil {

    /* renamed from: a */
    public static final Logger f59165a = Logger.getLogger(TransportFrameUtil.class.getName());

    /* renamed from: b */
    public static final byte[] f59166b = "-bin".getBytes(Charsets.f20502a);

    /* renamed from: a */
    public static boolean m31207a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i2 = length; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2 - length]) {
                return false;
            }
        }
        return true;
    }
}
