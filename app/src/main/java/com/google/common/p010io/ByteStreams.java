package com.google.common.p010io;

import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class ByteStreams {

    /* renamed from: a */
    public static final /* synthetic */ int f21841a = 0;

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        @Override // java.io.DataInput
        public boolean readBoolean() {
            throw null;
        }

        @Override // java.io.DataInput
        public byte readByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public char readChar() {
            throw null;
        }

        @Override // java.io.DataInput
        public double readDouble() {
            throw null;
        }

        @Override // java.io.DataInput
        public float readFloat() {
            throw null;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataInput
        public int readInt() {
            throw null;
        }

        @Override // java.io.DataInput
        public String readLine() {
            throw null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            throw null;
        }

        @Override // java.io.DataInput
        public short readShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public String readUTF() {
            throw null;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            throw null;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        @Override // java.io.DataOutput
        public void write(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeBoolean(boolean z) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeByte(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeBytes(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeChar(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeChars(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeDouble(double d) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeFloat(float f2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeInt(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeLong(long j2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeShort(int i2) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void writeUTF(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataOutput
        public void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    static {
        new OutputStream() { // from class: com.google.common.io.ByteStreams.1
            public String toString() {
                return "ByteStreams.nullOutputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) {
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) {
                Objects.requireNonNull(bArr);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i2, int i3) {
                Objects.requireNonNull(bArr);
            }
        };
    }

    /* renamed from: a */
    public static byte[] m12044a(Queue<byte[]> queue, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i3, remove.length);
            System.arraycopy(remove, 0, bArr, i2 - i3, min);
            i3 -= min;
        }
        return bArr;
    }

    @Beta
    /* renamed from: b */
    public static void m12045b(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(bArr);
        int i4 = 0;
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i3)));
        }
        Preconditions.m11190n(i2, i2 + i3, bArr.length);
        while (i4 < i3) {
            int read = inputStream.read(bArr, i2 + i4, i3 - i4);
            if (read == -1) {
                break;
            } else {
                i4 += read;
            }
        }
        if (i4 == i3) {
            return;
        }
        StringBuilder m4120s = C0576a.m4120s(81, "reached end of stream after reading ", i4, " bytes; ", i3);
        m4120s.append(" bytes expected");
        throw new EOFException(m4120s.toString());
    }

    /* renamed from: c */
    public static byte[] m12046c(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
        int i3 = 0;
        while (i3 < 2147483639) {
            int min = Math.min(i2, 2147483639 - i3);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min) {
                int read = inputStream.read(bArr, i4, min - i4);
                if (read == -1) {
                    return m12044a(arrayDeque, i3);
                }
                i4 += read;
                i3 += read;
            }
            i2 = Ints.m12084f(i2 * 2);
        }
        if (inputStream.read() == -1) {
            return m12044a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: b */
        public long f21842b;

        /* renamed from: c */
        public long f21843c;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f21842b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f21843c = this.f21842b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f21842b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f21842b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f21843c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f21842b = this.f21843c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f21842b));
            this.f21842b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            long j2 = this.f21842b;
            if (j2 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
            if (read != -1) {
                this.f21842b -= read;
            }
            return read;
        }
    }
}
