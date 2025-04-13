package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class DummyTrackOutput implements TrackOutput {

    /* renamed from: a */
    public final byte[] f10842a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: a */
    public int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
        int read = dataReader.read(this.f10842a, 0, Math.min(this.f10842a.length, i2));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: b */
    public int mo6396b(DataReader dataReader, int i2, boolean z) {
        return mo6395a(dataReader, i2, z, 0);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: c */
    public void mo6397c(ParsableByteArray parsableByteArray, int i2) {
        mo6400f(parsableByteArray, i2, 0);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: d */
    public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: e */
    public void mo6399e(Format format) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: f */
    public void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3) {
        parsableByteArray.m7635F(parsableByteArray.f14699b + i2);
    }
}
