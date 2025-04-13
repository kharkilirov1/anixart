package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.p006io.NumberInput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class oo0 {
    /* renamed from: a */
    public static ArrayList m27096a(byte[] bArr) {
        long j2 = ((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * NumberInput.L_BILLION) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }
}
