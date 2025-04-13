package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public class RandomFidGenerator {

    /* renamed from: a */
    public static final byte f23153a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f23154b = Byte.parseByte("00001111", 2);

    @NonNull
    /* renamed from: a */
    public String m12577a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f23154b & array[0]) | f23153a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
