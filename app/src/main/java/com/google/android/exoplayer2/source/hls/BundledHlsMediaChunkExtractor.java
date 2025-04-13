package com.google.android.exoplayer2.source.hls;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.p008ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.p008ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.p008ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.p008ts.TsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: classes.dex */
public final class BundledHlsMediaChunkExtractor implements HlsMediaChunkExtractor {

    /* renamed from: d */
    public static final PositionHolder f13037d = new PositionHolder();

    /* renamed from: a */
    @VisibleForTesting
    public final Extractor f13038a;

    /* renamed from: b */
    public final Format f13039b;

    /* renamed from: c */
    public final TimestampAdjuster f13040c;

    public BundledHlsMediaChunkExtractor(Extractor extractor, Format format, TimestampAdjuster timestampAdjuster) {
        this.f13038a = extractor;
        this.f13039b = format;
        this.f13040c = timestampAdjuster;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: a */
    public boolean mo7082a(ExtractorInput extractorInput) throws IOException {
        return this.f13038a.mo6404g(extractorInput, f13037d) == 0;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: b */
    public void mo7083b(ExtractorOutput extractorOutput) {
        this.f13038a.mo6401b(extractorOutput);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: c */
    public void mo7084c() {
        this.f13038a.mo6402c(0L, 0L);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: d */
    public boolean mo7085d() {
        Extractor extractor = this.f13038a;
        return (extractor instanceof AdtsExtractor) || (extractor instanceof Ac3Extractor) || (extractor instanceof Ac4Extractor) || (extractor instanceof Mp3Extractor);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: e */
    public boolean mo7086e() {
        Extractor extractor = this.f13038a;
        return (extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: f */
    public HlsMediaChunkExtractor mo7087f() {
        Extractor mp3Extractor;
        Extractor extractor = this.f13038a;
        Assertions.m7516d(!((extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor)));
        Extractor extractor2 = this.f13038a;
        if (extractor2 instanceof WebvttExtractor) {
            mp3Extractor = new WebvttExtractor(this.f13039b.f9650d, this.f13040c);
        } else if (extractor2 instanceof AdtsExtractor) {
            mp3Extractor = new AdtsExtractor(0);
        } else if (extractor2 instanceof Ac3Extractor) {
            mp3Extractor = new Ac3Extractor();
        } else if (extractor2 instanceof Ac4Extractor) {
            mp3Extractor = new Ac4Extractor();
        } else {
            if (!(extractor2 instanceof Mp3Extractor)) {
                String simpleName = this.f13038a.getClass().getSimpleName();
                throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
            }
            mp3Extractor = new Mp3Extractor(0, -9223372036854775807L);
        }
        return new BundledHlsMediaChunkExtractor(mp3Extractor, this.f13039b, this.f13040c);
    }
}
