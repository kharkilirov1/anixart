package com.google.android.exoplayer2.audio;

import com.fasterxml.jackson.core.p006io.NumberInput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OpusUtil {
    /* renamed from: a */
    public static List<byte[]> m6226a(byte[] bArr) {
        long j2 = ((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * NumberInput.L_BILLION) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m6227b(j2));
        arrayList.add(m6227b(80000000L));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m6227b(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }
}
