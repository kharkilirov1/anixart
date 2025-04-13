package com.google.android.exoplayer2.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RequiresApi
/* loaded from: classes.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    /* renamed from: a */
    public final OutputConsumerAdapterV30 f12352a;

    /* renamed from: b */
    public final InputReaderAdapterV30 f12353b;

    /* renamed from: c */
    public final MediaParser f12354c;

    /* renamed from: d */
    public String f12355d;

    static {
        C1123j c1123j = C1123j.f13403e;
    }

    @SuppressLint
    public MediaParserExtractorAdapter() {
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(null, -2, false);
        this.f12352a = outputConsumerAdapterV30;
        this.f12353b = new InputReaderAdapterV30();
        MediaParser create = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.f12354c = create;
        Boolean bool = Boolean.TRUE;
        create.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        create.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        create.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        this.f12355d = "android.media.mediaparser.UNKNOWN";
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: a */
    public void mo6782a(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j2, long j3, ExtractorOutput extractorOutput) throws IOException {
        this.f12352a.f13421i = extractorOutput;
        InputReaderAdapterV30 inputReaderAdapterV30 = this.f12353b;
        inputReaderAdapterV30.f13407a = dataReader;
        inputReaderAdapterV30.f13408b = j3;
        inputReaderAdapterV30.f13410d = -1L;
        inputReaderAdapterV30.f13409c = j2;
        String parserName = this.f12354c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f12354c.advance(this.f12353b);
            String parserName2 = this.f12354c.getParserName();
            this.f12355d = parserName2;
            this.f12352a.m7174c(parserName2);
            return;
        }
        if (parserName.equals(this.f12355d)) {
            return;
        }
        String parserName3 = this.f12354c.getParserName();
        this.f12355d = parserName3;
        this.f12352a.m7174c(parserName3);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: b */
    public int mo6783b(PositionHolder positionHolder) throws IOException {
        boolean advance = this.f12354c.advance(this.f12353b);
        InputReaderAdapterV30 inputReaderAdapterV30 = this.f12353b;
        long j2 = inputReaderAdapterV30.f13410d;
        inputReaderAdapterV30.f13410d = -1L;
        positionHolder.f10871a = j2;
        if (advance) {
            return j2 != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: c */
    public void mo6784c(long j2, long j3) {
        this.f12353b.f13409c = j2;
        MediaParser.SeekMap seekMap = this.f12352a.f13423k;
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = seekMap != null ? seekMap.getSeekPoints(j3) : OutputConsumerAdapterV30.f13411u;
        MediaParser mediaParser = this.f12354c;
        MediaParser.SeekPoint seekPoint = (MediaParser.SeekPoint) seekPoints.second;
        if (seekPoint.position != j2) {
            seekPoint = (MediaParser.SeekPoint) seekPoints.first;
        }
        mediaParser.seek(seekPoint);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: d */
    public long mo6785d() {
        return this.f12353b.f13409c;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: e */
    public void mo6786e() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f12355d)) {
            this.f12352a.f13432t = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        this.f12354c.release();
    }
}
