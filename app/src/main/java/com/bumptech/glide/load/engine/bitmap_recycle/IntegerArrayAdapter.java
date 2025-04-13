package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public final class IntegerArrayAdapter implements ArrayAdapterInterface<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: a */
    public int mo5059a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: b */
    public int mo5060b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* renamed from: e */
    public String mo5061e() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public int[] newArray(int i2) {
        return new int[i2];
    }
}
