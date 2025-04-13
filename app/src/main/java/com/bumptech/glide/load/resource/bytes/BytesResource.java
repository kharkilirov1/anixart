package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.util.Objects;

/* loaded from: classes.dex */
public class BytesResource implements Resource<byte[]> {

    /* renamed from: b */
    public final byte[] f8590b;

    public BytesResource(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f8590b = bArr;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return this.f8590b.length;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<byte[]> mo5046e() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public byte[] get() {
        return this.f8590b;
    }
}
