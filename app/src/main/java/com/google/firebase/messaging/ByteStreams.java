package com.google.firebase.messaging;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes2.dex */
final class ByteStreams {
    /* renamed from: a */
    public static byte[] m12634a(Queue<byte[]> queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i2) {
            return remove;
        }
        int length = i2 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i2);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m12635b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m12634a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j2 = min * (min < 4096 ? 4 : 2);
            min = j2 > ParserMinimalBase.MAX_INT_L ? Integer.MAX_VALUE : j2 < ParserMinimalBase.MIN_INT_L ? Integer.MIN_VALUE : (int) j2;
        }
        if (inputStream.read() == -1) {
            return m12634a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: b */
        public long f23248b;

        /* renamed from: c */
        public long f23249c;

        public LimitedInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            this.f23249c = -1L;
            this.f23248b = j2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f23248b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f23249c = this.f23248b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f23248b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f23248b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f23249c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f23248b = this.f23249c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f23248b));
            this.f23248b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            long j2 = this.f23248b;
            if (j2 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
            if (read != -1) {
                this.f23248b -= read;
            }
            return read;
        }
    }
}
