package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {

    /* renamed from: k */
    public static final ChunkExtractor.Factory f12680k = C0954j.f10228u;

    /* renamed from: l */
    public static final PositionHolder f12681l = new PositionHolder();

    /* renamed from: b */
    public final Extractor f12682b;

    /* renamed from: c */
    public final int f12683c;

    /* renamed from: d */
    public final Format f12684d;

    /* renamed from: e */
    public final SparseArray<BindingTrackOutput> f12685e = new SparseArray<>();

    /* renamed from: f */
    public boolean f12686f;

    /* renamed from: g */
    @Nullable
    public ChunkExtractor.TrackOutputProvider f12687g;

    /* renamed from: h */
    public long f12688h;

    /* renamed from: i */
    public SeekMap f12689i;

    /* renamed from: j */
    public Format[] f12690j;

    public static final class BindingTrackOutput implements TrackOutput {

        /* renamed from: a */
        public final int f12691a;

        /* renamed from: b */
        public final int f12692b;

        /* renamed from: c */
        @Nullable
        public final Format f12693c;

        /* renamed from: d */
        public final DummyTrackOutput f12694d = new DummyTrackOutput();

        /* renamed from: e */
        public Format f12695e;

        /* renamed from: f */
        public TrackOutput f12696f;

        /* renamed from: g */
        public long f12697g;

        public BindingTrackOutput(int i2, int i3, @Nullable Format format) {
            this.f12691a = i2;
            this.f12692b = i3;
            this.f12693c = format;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: a */
        public int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
            TrackOutput trackOutput = this.f12696f;
            int i4 = Util.f14736a;
            return trackOutput.mo6396b(dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: b */
        public /* synthetic */ int mo6396b(DataReader dataReader, int i2, boolean z) {
            return C1008a.m6434a(this, dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: c */
        public /* synthetic */ void mo6397c(ParsableByteArray parsableByteArray, int i2) {
            C1008a.m6435b(this, parsableByteArray, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: d */
        public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
            long j3 = this.f12697g;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                this.f12696f = this.f12694d;
            }
            TrackOutput trackOutput = this.f12696f;
            int i5 = Util.f14736a;
            trackOutput.mo6398d(j2, i2, i3, i4, cryptoData);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: e */
        public void mo6399e(Format format) {
            Format format2 = this.f12693c;
            if (format2 != null) {
                format = format.m5832i(format2);
            }
            this.f12695e = format;
            TrackOutput trackOutput = this.f12696f;
            int i2 = Util.f14736a;
            trackOutput.mo6399e(format);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: f */
        public void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3) {
            TrackOutput trackOutput = this.f12696f;
            int i4 = Util.f14736a;
            trackOutput.mo6397c(parsableByteArray, i2);
        }

        /* renamed from: g */
        public void m6964g(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2) {
            if (trackOutputProvider == null) {
                this.f12696f = this.f12694d;
                return;
            }
            this.f12697g = j2;
            TrackOutput mo6959b = trackOutputProvider.mo6959b(this.f12691a, this.f12692b);
            this.f12696f = mo6959b;
            Format format = this.f12695e;
            if (format != null) {
                mo6959b.mo6399e(format);
            }
        }
    }

    public BundledChunkExtractor(Extractor extractor, int i2, Format format) {
        this.f12682b = extractor;
        this.f12683c = i2;
        this.f12684d = format;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    /* renamed from: a */
    public boolean mo6960a(ExtractorInput extractorInput) throws IOException {
        int mo6404g = this.f12682b.mo6404g(extractorInput, f12681l);
        Assertions.m7516d(mo6404g != 1);
        return mo6404g == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: b */
    public TrackOutput mo6392b(int i2, int i3) {
        BindingTrackOutput bindingTrackOutput = this.f12685e.get(i2);
        if (bindingTrackOutput == null) {
            Assertions.m7516d(this.f12690j == null);
            bindingTrackOutput = new BindingTrackOutput(i2, i3, i3 == this.f12683c ? this.f12684d : null);
            bindingTrackOutput.m6964g(this.f12687g, this.f12688h);
            this.f12685e.put(i2, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    /* renamed from: c */
    public Format[] mo6961c() {
        return this.f12690j;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: d */
    public void mo6393d(SeekMap seekMap) {
        this.f12689i = seekMap;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    /* renamed from: e */
    public void mo6962e(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2, long j3) {
        this.f12687g = trackOutputProvider;
        this.f12688h = j3;
        if (!this.f12686f) {
            this.f12682b.mo6401b(this);
            if (j2 != -9223372036854775807L) {
                this.f12682b.mo6402c(0L, j2);
            }
            this.f12686f = true;
            return;
        }
        Extractor extractor = this.f12682b;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        extractor.mo6402c(0L, j2);
        for (int i2 = 0; i2 < this.f12685e.size(); i2++) {
            this.f12685e.valueAt(i2).m6964g(trackOutputProvider, j3);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    /* renamed from: f */
    public ChunkIndex mo6963f() {
        SeekMap seekMap = this.f12689i;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: h */
    public void mo6394h() {
        Format[] formatArr = new Format[this.f12685e.size()];
        for (int i2 = 0; i2 < this.f12685e.size(); i2++) {
            Format format = this.f12685e.valueAt(i2).f12695e;
            Assertions.m7518f(format);
            formatArr[i2] = format;
        }
        this.f12690j = formatArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.f12682b.release();
    }
}
