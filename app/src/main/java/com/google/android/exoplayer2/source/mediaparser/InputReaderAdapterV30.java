package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

@RequiresApi
@SuppressLint
/* loaded from: classes.dex */
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {

    /* renamed from: a */
    @Nullable
    public DataReader f13407a;

    /* renamed from: b */
    public long f13408b;

    /* renamed from: c */
    public long f13409c;

    /* renamed from: d */
    public long f13410d;

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.f13408b;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.f13409c;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        DataReader dataReader = this.f13407a;
        int i4 = Util.f14736a;
        int read = dataReader.read(bArr, i2, i3);
        this.f13409c += read;
        return read;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j2) {
        this.f13410d = j2;
    }
}
