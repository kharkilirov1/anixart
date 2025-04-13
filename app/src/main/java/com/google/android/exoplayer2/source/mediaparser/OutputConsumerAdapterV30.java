package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaParser;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiresApi
@SuppressLint
/* loaded from: classes.dex */
public final class OutputConsumerAdapterV30 implements MediaParser.OutputConsumer {

    /* renamed from: u */
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f13411u;

    /* renamed from: v */
    public static final Pattern f13412v;

    /* renamed from: a */
    public final ArrayList<TrackOutput> f13413a;

    /* renamed from: b */
    public final ArrayList<Format> f13414b;

    /* renamed from: c */
    public final ArrayList<MediaCodec.CryptoInfo> f13415c;

    /* renamed from: d */
    public final ArrayList<TrackOutput.CryptoData> f13416d;

    /* renamed from: e */
    public final DataReaderAdapter f13417e;

    /* renamed from: f */
    public final boolean f13418f;

    /* renamed from: g */
    public final int f13419g;

    /* renamed from: h */
    @Nullable
    public final Format f13420h;

    /* renamed from: i */
    public ExtractorOutput f13421i;

    /* renamed from: j */
    @Nullable
    public MediaParser.SeekMap f13422j;

    /* renamed from: k */
    @Nullable
    public MediaParser.SeekMap f13423k;

    /* renamed from: l */
    @Nullable
    public String f13424l;

    /* renamed from: m */
    @Nullable
    public ChunkIndex f13425m;

    /* renamed from: n */
    @Nullable
    public TimestampAdjuster f13426n;

    /* renamed from: o */
    public List<Format> f13427o;

    /* renamed from: p */
    public int f13428p;

    /* renamed from: q */
    public long f13429q;

    /* renamed from: r */
    public boolean f13430r;

    /* renamed from: s */
    public boolean f13431s;

    /* renamed from: t */
    public boolean f13432t;

    public static final class DataReaderAdapter implements DataReader {

        /* renamed from: a */
        @Nullable
        public MediaParser.InputReader f13433a;

        public DataReaderAdapter() {
        }

        @Override // com.google.android.exoplayer2.upstream.DataReader
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            MediaParser.InputReader inputReader = this.f13433a;
            int i4 = Util.f14736a;
            return inputReader.read(bArr, i2, i3);
        }

        public DataReaderAdapter(C11241 c11241) {
        }
    }

    public static final class SeekMapAdapter implements SeekMap {

        /* renamed from: a */
        public final MediaParser.SeekMap f13434a;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.f13434a = seekMap;
        }

        /* renamed from: b */
        public static SeekPoint m7175b(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: f */
        public boolean mo6363f() {
            return this.f13434a.isSeekable();
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: h */
        public SeekMap.SeekPoints mo6364h(long j2) {
            Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.f13434a.getSeekPoints(j2);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new SeekMap.SeekPoints(m7175b((MediaParser.SeekPoint) obj)) : new SeekMap.SeekPoints(m7175b((MediaParser.SeekPoint) obj), m7175b((MediaParser.SeekPoint) seekPoints.second));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: i */
        public long mo6365i() {
            long durationMicros = this.f13434a.getDurationMicros();
            if (durationMicros != ParserMinimalBase.MIN_INT_L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }
    }

    static {
        MediaParser.SeekPoint seekPoint = MediaParser.SeekPoint.START;
        f13411u = Pair.create(seekPoint, seekPoint);
        f13412v = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    /* renamed from: a */
    public final void m7172a(int i2) {
        for (int size = this.f13413a.size(); size <= i2; size++) {
            this.f13413a.add(null);
            this.f13414b.add(null);
            this.f13415c.add(null);
            this.f13416d.add(null);
        }
    }

    /* renamed from: b */
    public final void m7173b() {
        if (!this.f13430r || this.f13431s) {
            return;
        }
        int size = this.f13413a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f13413a.get(i2) == null) {
                return;
            }
        }
        this.f13421i.mo6394h();
        this.f13431s = true;
    }

    /* renamed from: c */
    public void m7174c(String str) {
        String str2;
        Objects.requireNonNull(str);
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                str2 = "video/mp4";
                break;
            case "android.media.mediaparser.OggParser":
                str2 = "audio/ogg";
                break;
            case "android.media.mediaparser.TsParser":
                str2 = "video/mp2t";
                break;
            case "android.media.mediaparser.AdtsParser":
                str2 = "audio/mp4a-latm";
                break;
            case "android.media.mediaparser.WavParser":
                str2 = "audio/raw";
                break;
            case "android.media.mediaparser.PsParser":
                str2 = "video/mp2p";
                break;
            case "android.media.mediaparser.Ac3Parser":
                str2 = "audio/ac3";
                break;
            case "android.media.mediaparser.AmrParser":
                str2 = "audio/amr";
                break;
            case "android.media.mediaparser.FlacParser":
                str2 = "audio/flac";
                break;
            case "android.media.mediaparser.MatroskaParser":
                str2 = "video/webm";
                break;
            case "android.media.mediaparser.Ac4Parser":
                str2 = "audio/ac4";
                break;
            case "android.media.mediaparser.Mp3Parser":
                str2 = "audio/mpeg";
                break;
            case "android.media.mediaparser.FlvParser":
                str2 = "video/x-flv";
                break;
            default:
                throw new IllegalArgumentException(str.length() != 0 ? "Illegal parser name: ".concat(str) : new String("Illegal parser name: "));
        }
        this.f13424l = str2;
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int i2, long j2, int i3, int i4, int i5, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        int i6;
        TrackOutput.CryptoData cryptoData;
        long j3 = this.f13429q;
        if (j3 == -9223372036854775807L || j2 < j3) {
            TimestampAdjuster timestampAdjuster = this.f13426n;
            if (timestampAdjuster != null) {
                j2 = timestampAdjuster.m7691a(j2);
            }
            long j4 = j2;
            TrackOutput trackOutput = this.f13413a.get(i2);
            Objects.requireNonNull(trackOutput);
            if (cryptoInfo == null) {
                cryptoData = null;
            } else if (this.f13415c.get(i2) == cryptoInfo) {
                cryptoData = this.f13416d.get(i2);
                Objects.requireNonNull(cryptoData);
            } else {
                int i7 = 0;
                try {
                    Matcher matcher = f13412v.matcher(cryptoInfo.toString());
                    matcher.find();
                    String group = matcher.group(1);
                    int i8 = Util.f14736a;
                    int parseInt = Integer.parseInt(group);
                    i6 = Integer.parseInt(matcher.group(2));
                    i7 = parseInt;
                } catch (RuntimeException e2) {
                    String valueOf = String.valueOf(cryptoInfo);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append("Unexpected error while parsing CryptoInfo: ");
                    sb.append(valueOf);
                    Log.m7585b("OutputConsumerAdapterV30", sb.toString(), e2);
                    i6 = 0;
                }
                TrackOutput.CryptoData cryptoData2 = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i7, i6);
                this.f13415c.set(i2, cryptoInfo);
                this.f13416d.set(i2, cryptoData2);
                cryptoData = cryptoData2;
            }
            trackOutput.mo6398d(j4, i3, i4, i5, cryptoData);
        }
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int i2, MediaParser.InputReader inputReader) throws IOException {
        m7172a(i2);
        this.f13417e.f13433a = inputReader;
        TrackOutput trackOutput = this.f13413a.get(i2);
        if (trackOutput == null) {
            trackOutput = this.f13421i.mo6392b(i2, -1);
            this.f13413a.set(i2, trackOutput);
        }
        trackOutput.mo6396b(this.f13417e, (int) inputReader.getLength(), true);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        if (this.f13418f && this.f13422j == null) {
            this.f13422j = seekMap;
            return;
        }
        this.f13423k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.f13421i;
        if (this.f13432t) {
            if (durationMicros == ParserMinimalBase.MIN_INT_L) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros, 0L);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.mo6393d(seekMapAdapter);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int i2) {
        this.f13430r = true;
        m7173b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    @Override // android.media.MediaParser.OutputConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTrackDataFound(int r17, android.media.MediaParser.TrackData r18) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.onTrackDataFound(int, android.media.MediaParser$TrackData):void");
    }

    public OutputConsumerAdapterV30(@Nullable Format format, int i2, boolean z) {
        this.f13418f = z;
        this.f13420h = format;
        this.f13419g = i2;
        this.f13413a = new ArrayList<>();
        this.f13414b = new ArrayList<>();
        this.f13415c = new ArrayList<>();
        this.f13416d = new ArrayList<>();
        this.f13417e = new DataReaderAdapter(null);
        this.f13421i = new DummyExtractorOutput();
        this.f13429q = -9223372036854775807L;
        this.f13427o = ImmutableList.m11627D();
    }
}
