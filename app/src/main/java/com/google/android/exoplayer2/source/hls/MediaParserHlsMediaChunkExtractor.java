package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RequiresApi
/* loaded from: classes.dex */
public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {

    /* renamed from: a */
    public final OutputConsumerAdapterV30 f13224a;

    /* renamed from: b */
    public final InputReaderAdapterV30 f13225b = new InputReaderAdapterV30();

    /* renamed from: c */
    public final MediaParser f13226c;

    /* renamed from: d */
    public final Format f13227d;

    /* renamed from: e */
    public final boolean f13228e;

    /* renamed from: f */
    public final ImmutableList<MediaFormat> f13229f;

    /* renamed from: g */
    public int f13230g;

    public static final class PeekingInputReader implements MediaParser.SeekableInputReader {

        /* renamed from: a */
        public final ExtractorInput f13231a;

        /* renamed from: b */
        public int f13232b;

        public PeekingInputReader(ExtractorInput extractorInput, C11151 c11151) {
            this.f13231a = extractorInput;
        }

        @Override // android.media.MediaParser.InputReader
        public long getLength() {
            return this.f13231a.getLength();
        }

        @Override // android.media.MediaParser.InputReader
        public long getPosition() {
            return this.f13231a.mo6379e();
        }

        @Override // android.media.MediaParser.InputReader
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int mo6382h = this.f13231a.mo6382h(bArr, i2, i3);
            this.f13232b += mo6382h;
            return mo6382h;
        }

        @Override // android.media.MediaParser.SeekableInputReader
        public void seekToPosition(long j2) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C0954j c0954j = C0954j.f10230w;
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format, boolean z, ImmutableList<MediaFormat> immutableList, int i2) {
        this.f13226c = mediaParser;
        this.f13224a = outputConsumerAdapterV30;
        this.f13228e = z;
        this.f13229f = immutableList;
        this.f13227d = format;
        this.f13230g = i2;
    }

    /* renamed from: g */
    public static HlsMediaChunkExtractor m7124g(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
        List list2 = list;
        if (FileTypes.m7546a(format.f9659m) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.f9650d, timestampAdjuster), format, timestampAdjuster);
        }
        boolean z = list2 != null;
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (list2 != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                builder.m11640d(MediaParserUtil.m7171a((Format) list2.get(i2)));
            }
        } else {
            Format.Builder builder2 = new Format.Builder();
            builder2.f9687k = "application/cea-608";
            builder.m11640d(MediaParserUtil.m7171a(builder2.m5833a()));
        }
        ImmutableList m11641e = builder.m11641e();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(null, -2, false);
        if (list2 == null) {
            list2 = ImmutableList.m11627D();
        }
        outputConsumerAdapterV30.f13427o = list2;
        outputConsumerAdapterV30.f13426n = timestampAdjuster;
        MediaParser m7125h = m7125h(outputConsumerAdapterV30, format, z, m11641e, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput, null);
        m7125h.advance(peekingInputReader);
        outputConsumerAdapterV30.m7174c(m7125h.getParserName());
        return new MediaParserHlsMediaChunkExtractor(m7125h, outputConsumerAdapterV30, format, z, m11641e, peekingInputReader.f13232b);
    }

    @SuppressLint
    /* renamed from: h */
    public static MediaParser m7125h(MediaParser.OutputConsumer outputConsumer, Format format, boolean z, ImmutableList<MediaFormat> immutableList, String... strArr) {
        MediaParser createByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], outputConsumer) : MediaParser.create(outputConsumer, strArr);
        createByName.setParameter("android.media.mediaParser.exposeCaptionFormats", immutableList);
        createByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", Boolean.valueOf(z));
        Boolean bool = Boolean.TRUE;
        createByName.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        createByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        createByName.setParameter("android.media.mediaparser.ignoreTimestampOffset", bool);
        createByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        createByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.f9656j;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(MimeTypes.m7594b(str))) {
                createByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!"video/avc".equals(MimeTypes.m7602j(str))) {
                createByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        return createByName;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: a */
    public boolean mo7082a(ExtractorInput extractorInput) throws IOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.mo6384k(this.f13230g);
        this.f13230g = 0;
        InputReaderAdapterV30 inputReaderAdapterV30 = this.f13225b;
        long j2 = defaultExtractorInput.f10833c;
        inputReaderAdapterV30.f13407a = extractorInput;
        inputReaderAdapterV30.f13408b = j2;
        inputReaderAdapterV30.f13410d = -1L;
        return this.f13226c.advance(inputReaderAdapterV30);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: b */
    public void mo7083b(ExtractorOutput extractorOutput) {
        this.f13224a.f13421i = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: c */
    public void mo7084c() {
        this.f13226c.seek(MediaParser.SeekPoint.START);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: d */
    public boolean mo7085d() {
        String parserName = this.f13226c.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: e */
    public boolean mo7086e() {
        String parserName = this.f13226c.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    /* renamed from: f */
    public HlsMediaChunkExtractor mo7087f() {
        Assertions.m7516d(!mo7086e());
        return new MediaParserHlsMediaChunkExtractor(m7125h(this.f13224a, this.f13227d, this.f13228e, this.f13229f, this.f13226c.getParserName()), this.f13224a, this.f13227d, this.f13228e, this.f13229f, 0);
    }
}
