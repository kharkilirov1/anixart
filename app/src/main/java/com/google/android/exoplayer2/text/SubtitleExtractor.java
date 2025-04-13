package com.google.android.exoplayer2.text;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.IndexSeekMap;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SubtitleExtractor implements Extractor {

    /* renamed from: a */
    public final SubtitleDecoder f13482a;

    /* renamed from: b */
    public final CueEncoder f13483b = new CueEncoder();

    /* renamed from: c */
    public final ParsableByteArray f13484c = new ParsableByteArray();

    /* renamed from: d */
    public final Format f13485d;

    /* renamed from: e */
    public final List<Long> f13486e;

    /* renamed from: f */
    public final List<ParsableByteArray> f13487f;

    /* renamed from: g */
    public ExtractorOutput f13488g;

    /* renamed from: h */
    public TrackOutput f13489h;

    /* renamed from: i */
    public int f13490i;

    /* renamed from: j */
    public int f13491j;

    /* renamed from: k */
    public long f13492k;

    public SubtitleExtractor(SubtitleDecoder subtitleDecoder, Format format) {
        this.f13482a = subtitleDecoder;
        Format.Builder m5829b = format.m5829b();
        m5829b.f9687k = "text/x-exoplayer-cues";
        m5829b.f9684h = format.f9659m;
        this.f13485d = m5829b.m5833a();
        this.f13486e = new ArrayList();
        this.f13487f = new ArrayList();
        this.f13491j = 0;
        this.f13492k = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m7188a() {
        Assertions.m7518f(this.f13489h);
        Assertions.m7516d(this.f13486e.size() == this.f13487f.size());
        long j2 = this.f13492k;
        for (int m7734d = j2 == -9223372036854775807L ? 0 : Util.m7734d(this.f13486e, Long.valueOf(j2), true, true); m7734d < this.f13487f.size(); m7734d++) {
            ParsableByteArray parsableByteArray = this.f13487f.get(m7734d);
            parsableByteArray.m7635F(0);
            int length = parsableByteArray.f14698a.length;
            this.f13489h.mo6397c(parsableByteArray, length);
            this.f13489h.mo6398d(this.f13486e.get(m7734d).longValue(), 1, length, 0, null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        Assertions.m7516d(this.f13491j == 0);
        this.f13488g = extractorOutput;
        this.f13489h = extractorOutput.mo6392b(0, 3);
        this.f13488g.mo6394h();
        this.f13488g.mo6393d(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f13489h.mo6399e(this.f13485d);
        this.f13491j = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        int i2 = this.f13491j;
        Assertions.m7516d((i2 == 0 || i2 == 5) ? false : true);
        this.f13492k = j3;
        if (this.f13491j == 2) {
            this.f13491j = 1;
        }
        if (this.f13491j == 4) {
            this.f13491j = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i2 = this.f13491j;
        Assertions.m7516d((i2 == 0 || i2 == 5) ? false : true);
        int i3 = this.f13491j;
        int i4 = RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
        if (i3 == 1) {
            this.f13484c.m7631B(extractorInput.getLength() != -1 ? Ints.m12080b(extractorInput.getLength()) : RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
            this.f13490i = 0;
            this.f13491j = 2;
        }
        if (this.f13491j == 2) {
            ParsableByteArray parsableByteArray = this.f13484c;
            int length = parsableByteArray.f14698a.length;
            int i5 = this.f13490i;
            if (length == i5) {
                parsableByteArray.m7638b(i5 + RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
            }
            byte[] bArr = this.f13484c.f14698a;
            int i6 = this.f13490i;
            int read = extractorInput.read(bArr, i6, bArr.length - i6);
            if (read != -1) {
                this.f13490i += read;
            }
            long length2 = extractorInput.getLength();
            if ((length2 != -1 && ((long) this.f13490i) == length2) || read == -1) {
                try {
                    SubtitleInputBuffer mo6246c = this.f13482a.mo6246c();
                    while (mo6246c == null) {
                        Thread.sleep(5L);
                        mo6246c = this.f13482a.mo6246c();
                    }
                    mo6246c.m6250n(this.f13490i);
                    mo6246c.f10605d.put(this.f13484c.f14698a, 0, this.f13490i);
                    mo6246c.f10605d.limit(this.f13490i);
                    this.f13482a.mo6247d(mo6246c);
                    SubtitleOutputBuffer mo6245b = this.f13482a.mo6245b();
                    while (mo6245b == null) {
                        Thread.sleep(5L);
                        mo6245b = this.f13482a.mo6245b();
                    }
                    for (int i7 = 0; i7 < mo6245b.mo7184d(); i7++) {
                        byte[] m7179a = this.f13483b.m7179a(mo6245b.mo7183c(mo6245b.mo7182b(i7)));
                        this.f13486e.add(Long.valueOf(mo6245b.mo7182b(i7)));
                        this.f13487f.add(new ParsableByteArray(m7179a));
                    }
                    mo6245b.mo6253l();
                    m7188a();
                    this.f13491j = 4;
                } catch (SubtitleDecoderException e2) {
                    throw ParserException.m5907a("SubtitleDecoder failed.", e2);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.f13491j == 3) {
            if (extractorInput.getLength() != -1) {
                i4 = Ints.m12080b(extractorInput.getLength());
            }
            if (extractorInput.mo6381g(i4) == -1) {
                m7188a();
                this.f13491j = 4;
            }
        }
        return this.f13491j == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
        if (this.f13491j == 5) {
            return;
        }
        this.f13482a.release();
        this.f13491j = 5;
    }
}
