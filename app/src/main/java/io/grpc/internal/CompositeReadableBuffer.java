package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class CompositeReadableBuffer extends AbstractReadableBuffer {

    /* renamed from: f */
    public static final NoThrowReadOperation<Void> f58522f = new NoThrowReadOperation<Void>() { // from class: io.grpc.internal.CompositeReadableBuffer.1
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        /* renamed from: a */
        public int mo31072a(ReadableBuffer readableBuffer, int i2, Object obj, int i3) {
            return readableBuffer.readUnsignedByte();
        }
    };

    /* renamed from: g */
    public static final NoThrowReadOperation<Void> f58523g = new NoThrowReadOperation<Void>() { // from class: io.grpc.internal.CompositeReadableBuffer.2
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        /* renamed from: a */
        public int mo31072a(ReadableBuffer readableBuffer, int i2, Object obj, int i3) {
            readableBuffer.skipBytes(i2);
            return 0;
        }
    };

    /* renamed from: h */
    public static final NoThrowReadOperation<byte[]> f58524h = new NoThrowReadOperation<byte[]>() { // from class: io.grpc.internal.CompositeReadableBuffer.3
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        /* renamed from: a */
        public int mo31072a(ReadableBuffer readableBuffer, int i2, Object obj, int i3) {
            readableBuffer.mo31071u0((byte[]) obj, i3, i2);
            return i3 + i2;
        }
    };

    /* renamed from: i */
    public static final NoThrowReadOperation<ByteBuffer> f58525i = new NoThrowReadOperation<ByteBuffer>() { // from class: io.grpc.internal.CompositeReadableBuffer.4
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        /* renamed from: a */
        public int mo31072a(ReadableBuffer readableBuffer, int i2, Object obj, int i3) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i2);
            readableBuffer.mo31067d1(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    };

    /* renamed from: j */
    public static final ReadOperation<OutputStream> f58526j = new ReadOperation<OutputStream>() { // from class: io.grpc.internal.CompositeReadableBuffer.5
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        /* renamed from: a */
        public int mo31072a(ReadableBuffer readableBuffer, int i2, OutputStream outputStream, int i3) throws IOException {
            readableBuffer.mo31064V0(outputStream, i2);
            return 0;
        }
    };

    /* renamed from: b */
    public final Deque<ReadableBuffer> f58527b;

    /* renamed from: c */
    public Deque<ReadableBuffer> f58528c;

    /* renamed from: d */
    public int f58529d;

    /* renamed from: e */
    public boolean f58530e;

    public interface NoThrowReadOperation<T> extends ReadOperation<T> {
    }

    public interface ReadOperation<T> {
        /* renamed from: a */
        int mo31072a(ReadableBuffer readableBuffer, int i2, T t, int i3) throws IOException;
    }

    public CompositeReadableBuffer(int i2) {
        this.f58527b = new ArrayDeque(i2);
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    /* renamed from: E0 */
    public void mo31018E0() {
        if (this.f58528c == null) {
            this.f58528c = new ArrayDeque(Math.min(this.f58527b.size(), 16));
        }
        while (!this.f58528c.isEmpty()) {
            this.f58528c.remove().close();
        }
        this.f58530e = true;
        ReadableBuffer peek = this.f58527b.peek();
        if (peek != null) {
            peek.mo31018E0();
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: O */
    public ReadableBuffer mo31063O(int i2) {
        ReadableBuffer poll;
        int i3;
        ReadableBuffer readableBuffer;
        if (i2 <= 0) {
            return ReadableBuffers.f58955a;
        }
        if (mo31070r() < i2) {
            throw new IndexOutOfBoundsException();
        }
        this.f58529d -= i2;
        ReadableBuffer readableBuffer2 = null;
        CompositeReadableBuffer compositeReadableBuffer = null;
        while (true) {
            ReadableBuffer peek = this.f58527b.peek();
            int mo31070r = peek.mo31070r();
            if (mo31070r > i2) {
                readableBuffer = peek.mo31063O(i2);
                i3 = 0;
            } else {
                if (this.f58530e) {
                    poll = peek.mo31063O(mo31070r);
                    m31066c();
                } else {
                    poll = this.f58527b.poll();
                }
                ReadableBuffer readableBuffer3 = poll;
                i3 = i2 - mo31070r;
                readableBuffer = readableBuffer3;
            }
            if (readableBuffer2 == null) {
                readableBuffer2 = readableBuffer;
            } else {
                if (compositeReadableBuffer == null) {
                    compositeReadableBuffer = new CompositeReadableBuffer(i3 != 0 ? Math.min(this.f58527b.size() + 2, 16) : 2);
                    compositeReadableBuffer.m31065b(readableBuffer2);
                    readableBuffer2 = compositeReadableBuffer;
                }
                compositeReadableBuffer.m31065b(readableBuffer);
            }
            if (i3 <= 0) {
                return readableBuffer2;
            }
            i2 = i3;
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: V0 */
    public void mo31064V0(OutputStream outputStream, int i2) throws IOException {
        m31068e(f58526j, i2, outputStream, 0);
    }

    /* renamed from: b */
    public void m31065b(ReadableBuffer readableBuffer) {
        boolean z = this.f58530e && this.f58527b.isEmpty();
        if (readableBuffer instanceof CompositeReadableBuffer) {
            CompositeReadableBuffer compositeReadableBuffer = (CompositeReadableBuffer) readableBuffer;
            while (!compositeReadableBuffer.f58527b.isEmpty()) {
                this.f58527b.add(compositeReadableBuffer.f58527b.remove());
            }
            this.f58529d += compositeReadableBuffer.f58529d;
            compositeReadableBuffer.f58529d = 0;
            compositeReadableBuffer.close();
        } else {
            this.f58527b.add(readableBuffer);
            this.f58529d = readableBuffer.mo31070r() + this.f58529d;
        }
        if (z) {
            this.f58527b.peek().mo31018E0();
        }
    }

    /* renamed from: c */
    public final void m31066c() {
        if (!this.f58530e) {
            this.f58527b.remove().close();
            return;
        }
        this.f58528c.add(this.f58527b.remove());
        ReadableBuffer peek = this.f58527b.peek();
        if (peek != null) {
            peek.mo31018E0();
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f58527b.isEmpty()) {
            this.f58527b.remove().close();
        }
        if (this.f58528c != null) {
            while (!this.f58528c.isEmpty()) {
                this.f58528c.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: d1 */
    public void mo31067d1(ByteBuffer byteBuffer) {
        m31069g(f58525i, byteBuffer.remaining(), byteBuffer, 0);
    }

    /* renamed from: e */
    public final <T> int m31068e(ReadOperation<T> readOperation, int i2, T t, int i3) throws IOException {
        if (this.f58529d < i2) {
            throw new IndexOutOfBoundsException();
        }
        if (!this.f58527b.isEmpty() && this.f58527b.peek().mo31070r() == 0) {
            m31066c();
        }
        while (i2 > 0 && !this.f58527b.isEmpty()) {
            ReadableBuffer peek = this.f58527b.peek();
            int min = Math.min(i2, peek.mo31070r());
            i3 = readOperation.mo31072a(peek, min, t, i3);
            i2 -= min;
            this.f58529d -= min;
            if (this.f58527b.peek().mo31070r() == 0) {
                m31066c();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* renamed from: g */
    public final <T> int m31069g(NoThrowReadOperation<T> noThrowReadOperation, int i2, T t, int i3) {
        try {
            return m31068e(noThrowReadOperation, i2, t, i3);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    public boolean markSupported() {
        Iterator<ReadableBuffer> it = this.f58527b.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: r */
    public int mo31070r() {
        return this.f58529d;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public int readUnsignedByte() {
        return m31069g(f58522f, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    public void reset() {
        if (!this.f58530e) {
            throw new InvalidMarkException();
        }
        ReadableBuffer peek = this.f58527b.peek();
        if (peek != null) {
            int mo31070r = peek.mo31070r();
            peek.reset();
            this.f58529d = (peek.mo31070r() - mo31070r) + this.f58529d;
        }
        while (true) {
            ReadableBuffer pollLast = this.f58528c.pollLast();
            if (pollLast == null) {
                return;
            }
            pollLast.reset();
            this.f58527b.addFirst(pollLast);
            this.f58529d = pollLast.mo31070r() + this.f58529d;
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void skipBytes(int i2) {
        m31069g(f58523g, i2, null, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: u0 */
    public void mo31071u0(byte[] bArr, int i2, int i3) {
        m31069g(f58524h, i3, bArr, i2);
    }

    public CompositeReadableBuffer() {
        this.f58527b = new ArrayDeque();
    }
}
