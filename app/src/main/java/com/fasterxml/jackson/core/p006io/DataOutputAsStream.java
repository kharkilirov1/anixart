package com.fasterxml.jackson.core.p006io;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class DataOutputAsStream extends OutputStream {
    public final DataOutput _output;

    public DataOutputAsStream(DataOutput dataOutput) {
        this._output = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this._output.write(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this._output.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this._output.write(bArr, i2, i3);
    }
}
