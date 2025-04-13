package com.google.android.exoplayer2.util;

import android.media.MediaFormat;
import androidx.room.util.C0576a;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaFormatUtil {
    /* renamed from: a */
    public static void m7591a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    /* renamed from: b */
    public static void m7592b(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(C0576a.m4111j(15, "csd-", i2), ByteBuffer.wrap(list.get(i2)));
        }
    }
}
