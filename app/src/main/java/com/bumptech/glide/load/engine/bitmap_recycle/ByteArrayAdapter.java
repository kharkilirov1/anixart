package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public final class ByteArrayAdapter implements ArrayAdapterInterface<byte[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: a */
    public int mo5059a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: b */
    public int mo5060b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: e */
    public String mo5061e() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public byte[] newArray(int i2) {
        return new byte[i2];
    }
}
