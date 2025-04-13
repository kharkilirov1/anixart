package io.grpc.okhttp;

import androidx.recyclerview.widget.RecyclerView;
import io.grpc.internal.WritableBuffer;
import io.grpc.internal.WritableBufferAllocator;
import okio.Buffer;

/* loaded from: classes3.dex */
class OkHttpWritableBufferAllocator implements WritableBufferAllocator {
    @Override // io.grpc.internal.WritableBufferAllocator
    /* renamed from: a */
    public WritableBuffer mo31212a(int i2) {
        return new OkHttpWritableBuffer(new Buffer(), Math.min(1048576, Math.max(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, i2)));
    }
}
