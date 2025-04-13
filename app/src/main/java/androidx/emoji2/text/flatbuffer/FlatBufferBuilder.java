package androidx.emoji2.text.flatbuffer;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class FlatBufferBuilder {

    /* renamed from: a */
    public ByteBuffer f4082a;

    public static class ByteBufferBackedInputStream extends InputStream {
        @Override // java.io.InputStream
        public int read() throws IOException {
            throw null;
        }
    }

    public static abstract class ByteBufferFactory {
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {

        /* renamed from: a */
        public static final HeapByteBufferFactory f4083a = new HeapByteBufferFactory();

        /* renamed from: a */
        public ByteBuffer m2851a(int i2) {
            return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder() {
        HeapByteBufferFactory heapByteBufferFactory = HeapByteBufferFactory.f4083a;
        Utf8.m2866a();
        ByteBuffer m2851a = heapByteBufferFactory.m2851a(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        this.f4082a = m2851a;
        m2851a.capacity();
    }
}
