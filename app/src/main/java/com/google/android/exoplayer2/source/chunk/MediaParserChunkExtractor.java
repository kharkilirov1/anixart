package com.google.android.exoplayer2.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {

    /* renamed from: j */
    public static final /* synthetic */ int f12751j = 0;

    /* renamed from: b */
    public final OutputConsumerAdapterV30 f12752b;

    /* renamed from: c */
    public final InputReaderAdapterV30 f12753c;

    /* renamed from: d */
    public final MediaParser f12754d;

    /* renamed from: e */
    public final TrackOutputProviderAdapter f12755e;

    /* renamed from: f */
    public final DummyTrackOutput f12756f;

    /* renamed from: g */
    public long f12757g;

    /* renamed from: h */
    @Nullable
    public ChunkExtractor.TrackOutputProvider f12758h;

    /* renamed from: i */
    @Nullable
    public Format[] f12759i;

    public class TrackOutputProviderAdapter implements ExtractorOutput {
        public TrackOutputProviderAdapter(C10991 c10991) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: b */
        public TrackOutput mo6392b(int i2, int i3) {
            MediaParserChunkExtractor mediaParserChunkExtractor = MediaParserChunkExtractor.this;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = mediaParserChunkExtractor.f12758h;
            return trackOutputProvider != null ? trackOutputProvider.mo6959b(i2, i3) : mediaParserChunkExtractor.f12756f;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: d */
        public void mo6393d(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: h */
        public void mo6394h() {
            Format[] formatArr;
            MediaParserChunkExtractor mediaParserChunkExtractor = MediaParserChunkExtractor.this;
            OutputConsumerAdapterV30 outputConsumerAdapterV30 = mediaParserChunkExtractor.f12752b;
            if (outputConsumerAdapterV30.f13430r) {
                Format[] formatArr2 = new Format[outputConsumerAdapterV30.f13414b.size()];
                for (int i2 = 0; i2 < outputConsumerAdapterV30.f13414b.size(); i2++) {
                    Format format = outputConsumerAdapterV30.f13414b.get(i2);
                    Objects.requireNonNull(format);
                    formatArr2[i2] = format;
                }
                formatArr = formatArr2;
            } else {
                formatArr = null;
            }
            mediaParserChunkExtractor.f12759i = formatArr;
        }
    }

    static {
        C0954j c0954j = C0954j.f10229v;
    }

    @SuppressLint
    public MediaParserChunkExtractor(int i2, Format format, List<Format> list) {
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(format, i2, true);
        this.f12752b = outputConsumerAdapterV30;
        this.f12753c = new InputReaderAdapterV30();
        String str = format.f9658l;
        Objects.requireNonNull(str);
        String str2 = MimeTypes.m7605m(str) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        outputConsumerAdapterV30.m7174c(str2);
        MediaParser createByName = MediaParser.createByName(str2, outputConsumerAdapterV30);
        this.f12754d = createByName;
        Boolean bool = Boolean.TRUE;
        createByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        createByName.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        createByName.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        createByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        createByName.setParameter("android.media.mediaparser.exposeDummySeekMap", bool);
        createByName.setParameter("android.media.mediaParser.exposeChunkIndexAsMediaFormat", bool);
        createByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", bool);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(MediaParserUtil.m7171a(list.get(i3)));
        }
        this.f12754d.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList);
        this.f12752b.f13427o = list;
        this.f12755e = new TrackOutputProviderAdapter(null);
        this.f12756f = new DummyTrackOutput();
        this.f12757g = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    /* renamed from: a */
    public boolean mo6960a(ExtractorInput extractorInput) throws IOException {
        MediaParser.SeekMap seekMap = this.f12752b.f13422j;
        long j2 = this.f12757g;
        if (j2 != -9223372036854775807L && seekMap != null) {
            this.f12754d.seek((MediaParser.SeekPoint) seekMap.getSeekPoints(j2).first);
            this.f12757g = -9223372036854775807L;
        }
        InputReaderAdapterV30 inputReaderAdapterV30 = this.f12753c;
        long j3 = ((DefaultExtractorInput) extractorInput).f10833c;
        inputReaderAdapterV30.f13407a = extractorInput;
        inputReaderAdapterV30.f13408b = j3;
        inputReaderAdapterV30.f13410d = -1L;
        return this.f12754d.advance(inputReaderAdapterV30);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    /* renamed from: c */
    public Format[] mo6961c() {
        return this.f12759i;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    /* renamed from: e */
    public void mo6962e(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2, long j3) {
        this.f12758h = trackOutputProvider;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = this.f12752b;
        outputConsumerAdapterV30.f13429q = j3;
        outputConsumerAdapterV30.f13421i = this.f12755e;
        this.f12757g = j2;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    /* renamed from: f */
    public ChunkIndex mo6963f() {
        return this.f12752b.f13425m;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.f12754d.release();
    }
}
