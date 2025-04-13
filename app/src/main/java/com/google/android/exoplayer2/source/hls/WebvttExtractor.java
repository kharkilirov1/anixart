package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer2.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class WebvttExtractor implements Extractor {

    /* renamed from: g */
    public static final Pattern f13234g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f13235h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    @Nullable
    public final String f13236a;

    /* renamed from: b */
    public final TimestampAdjuster f13237b;

    /* renamed from: d */
    public ExtractorOutput f13239d;

    /* renamed from: f */
    public int f13241f;

    /* renamed from: c */
    public final ParsableByteArray f13238c = new ParsableByteArray();

    /* renamed from: e */
    public byte[] f13240e = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];

    public WebvttExtractor(@Nullable String str, TimestampAdjuster timestampAdjuster) {
        this.f13236a = str;
        this.f13237b = timestampAdjuster;
    }

    @RequiresNonNull({"output"})
    /* renamed from: a */
    public final TrackOutput m7126a(long j2) {
        TrackOutput mo6392b = this.f13239d.mo6392b(0, 3);
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "text/vtt";
        builder.f9679c = this.f13236a;
        builder.f9691o = j2;
        mo6392b.mo6399e(builder.m5833a());
        this.f13239d.mo6394h();
        return mo6392b;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f13239d = extractorOutput;
        extractorOutput.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo6378d(this.f13240e, 0, 6, false);
        this.f13238c.m7633D(this.f13240e, 6);
        if (WebvttParserUtil.m7283a(this.f13238c)) {
            return true;
        }
        extractorInput.mo6378d(this.f13240e, 6, 3, false);
        this.f13238c.m7633D(this.f13240e, 9);
        return WebvttParserUtil.m7283a(this.f13238c);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        String m7643g;
        Objects.requireNonNull(this.f13239d);
        int length = (int) extractorInput.getLength();
        int i2 = this.f13241f;
        byte[] bArr = this.f13240e;
        if (i2 == bArr.length) {
            this.f13240e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f13240e;
        int i3 = this.f13241f;
        int read = extractorInput.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.f13241f + read;
            this.f13241f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.f13240e);
        WebvttParserUtil.m7286d(parsableByteArray);
        String m7643g2 = parsableByteArray.m7643g();
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(m7643g2)) {
                while (true) {
                    String m7643g3 = parsableByteArray.m7643g();
                    if (m7643g3 == null) {
                        break;
                    }
                    if (WebvttParserUtil.f13849a.matcher(m7643g3).matches()) {
                        do {
                            m7643g = parsableByteArray.m7643g();
                            if (m7643g != null) {
                            }
                        } while (!m7643g.isEmpty());
                    } else {
                        Matcher matcher2 = WebvttCueParser.f13824a.matcher(m7643g3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m7126a(0L);
                    return -1;
                }
                String group = matcher.group(1);
                Objects.requireNonNull(group);
                long m7285c = WebvttParserUtil.m7285c(group);
                long m7692b = this.f13237b.m7692b(((((j2 + m7285c) - j3) * 90000) / 1000000) % 8589934592L);
                TrackOutput m7126a = m7126a(m7692b - m7285c);
                this.f13238c.m7633D(this.f13240e, this.f13241f);
                m7126a.mo6397c(this.f13238c, this.f13241f);
                m7126a.mo6398d(m7692b, 1, this.f13241f, 0, null);
                return -1;
            }
            if (m7643g2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f13234g.matcher(m7643g2);
                if (!matcher3.find()) {
                    throw ParserException.m5907a(m7643g2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(m7643g2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "), null);
                }
                Matcher matcher4 = f13235h.matcher(m7643g2);
                if (!matcher4.find()) {
                    throw ParserException.m5907a(m7643g2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(m7643g2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "), null);
                }
                String group2 = matcher3.group(1);
                Objects.requireNonNull(group2);
                j3 = WebvttParserUtil.m7285c(group2);
                String group3 = matcher4.group(1);
                Objects.requireNonNull(group3);
                j2 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            m7643g2 = parsableByteArray.m7643g();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
