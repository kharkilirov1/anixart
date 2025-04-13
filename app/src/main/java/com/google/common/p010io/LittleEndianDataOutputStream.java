package com.google.common.p010io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import kotlin.KotlinVersion;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i2) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i2);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i2) throws IOException {
        writeShort(i2);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            writeShort(str.charAt(i2));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f2) throws IOException {
        writeInt(Float.floatToIntBits(f2));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        ((FilterOutputStream) this).out.write((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        ((FilterOutputStream) this).out.write((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        ((FilterOutputStream) this).out.write((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j2) throws IOException {
        long reverseBytes = Long.reverseBytes(j2);
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) (255 & reverseBytes);
            reverseBytes >>= 8;
        }
        ((FilterOutputStream) this).out.write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        ((FilterOutputStream) this).out.write((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
