package com.google.common.p010io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    /* renamed from: a */
    public final byte m12054a() throws IOException, EOFException {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int i2 = ByteStreams.f21841a;
        ByteStreams.m12045b(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readInt() throws IOException {
        byte m12054a = m12054a();
        byte m12054a2 = m12054a();
        return Ints.m12083e(m12054a(), m12054a(), m12054a2, m12054a);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    @DoNotCall
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public long readLong() throws IOException {
        byte m12054a = m12054a();
        byte m12054a2 = m12054a();
        byte m12054a3 = m12054a();
        byte m12054a4 = m12054a();
        byte m12054a5 = m12054a();
        byte m12054a6 = m12054a();
        return Longs.m12087b(m12054a(), m12054a(), m12054a6, m12054a5, m12054a4, m12054a3, m12054a2, m12054a);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedByte() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedShort() throws IOException {
        return Ints.m12083e((byte) 0, (byte) 0, m12054a(), m12054a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i2) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i2);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        ByteStreams.m12045b(this, bArr, i2, i3);
    }
}
