package com.google.android.exoplayer2.text.cea;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.text.cea.CeaDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
abstract class CeaDecoder implements SubtitleDecoder {

    /* renamed from: a */
    public final ArrayDeque<CeaInputBuffer> f13596a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<SubtitleOutputBuffer> f13597b;

    /* renamed from: c */
    public final PriorityQueue<CeaInputBuffer> f13598c;

    /* renamed from: d */
    @Nullable
    public CeaInputBuffer f13599d;

    /* renamed from: e */
    public long f13600e;

    /* renamed from: f */
    public long f13601f;

    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {

        /* renamed from: k */
        public long f13602k;

        public CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(CeaInputBuffer ceaInputBuffer) {
            CeaInputBuffer ceaInputBuffer2 = ceaInputBuffer;
            if (m6242j() == ceaInputBuffer2.m6242j()) {
                long j2 = this.f10607f - ceaInputBuffer2.f10607f;
                if (j2 == 0) {
                    j2 = this.f13602k - ceaInputBuffer2.f13602k;
                    if (j2 == 0) {
                        return 0;
                    }
                }
                if (j2 > 0) {
                    return 1;
                }
            } else if (m6242j()) {
                return 1;
            }
            return -1;
        }

        public CeaInputBuffer(C11291 c11291) {
        }
    }

    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {

        /* renamed from: g */
        public DecoderOutputBuffer.Owner<CeaOutputBuffer> f13603g;

        public CeaOutputBuffer(DecoderOutputBuffer.Owner<CeaOutputBuffer> owner) {
            this.f13603g = owner;
        }

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        /* renamed from: l */
        public final void mo6253l() {
            this.f13603g.mo6254a(this);
        }
    }

    public CeaDecoder() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.f13596a.add(new CeaInputBuffer(null));
        }
        this.f13597b = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.f13597b.add(new CeaOutputBuffer(new DecoderOutputBuffer.Owner() { // from class: com.google.android.exoplayer2.text.cea.b
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner
                /* renamed from: a */
                public final void mo6254a(DecoderOutputBuffer decoderOutputBuffer) {
                    CeaDecoder ceaDecoder = CeaDecoder.this;
                    CeaDecoder.CeaOutputBuffer ceaOutputBuffer = (CeaDecoder.CeaOutputBuffer) decoderOutputBuffer;
                    Objects.requireNonNull(ceaDecoder);
                    ceaOutputBuffer.m7189m();
                    ceaDecoder.f13597b.add(ceaOutputBuffer);
                }
            }));
        }
        this.f13598c = new PriorityQueue<>();
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    /* renamed from: a */
    public void mo7180a(long j2) {
        this.f13600e = j2;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: c */
    public SubtitleInputBuffer mo6246c() throws DecoderException {
        Assertions.m7516d(this.f13599d == null);
        if (this.f13596a.isEmpty()) {
            return null;
        }
        CeaInputBuffer pollFirst = this.f13596a.pollFirst();
        this.f13599d = pollFirst;
        return pollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    /* renamed from: d */
    public void mo6247d(SubtitleInputBuffer subtitleInputBuffer) throws DecoderException {
        SubtitleInputBuffer subtitleInputBuffer2 = subtitleInputBuffer;
        Assertions.m7513a(subtitleInputBuffer2 == this.f13599d);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer2;
        if (ceaInputBuffer.m6241i()) {
            m7221i(ceaInputBuffer);
        } else {
            long j2 = this.f13601f;
            this.f13601f = 1 + j2;
            ceaInputBuffer.f13602k = j2;
            this.f13598c.add(ceaInputBuffer);
        }
        this.f13599d = null;
    }

    /* renamed from: e */
    public abstract Subtitle mo7196e();

    /* renamed from: f */
    public abstract void mo7197f(SubtitleInputBuffer subtitleInputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.f13601f = 0L;
        this.f13600e = 0L;
        while (!this.f13598c.isEmpty()) {
            CeaInputBuffer poll = this.f13598c.poll();
            int i2 = Util.f14736a;
            m7221i(poll);
        }
        CeaInputBuffer ceaInputBuffer = this.f13599d;
        if (ceaInputBuffer != null) {
            m7221i(ceaInputBuffer);
            this.f13599d = null;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public SubtitleOutputBuffer mo6245b() throws SubtitleDecoderException {
        if (this.f13597b.isEmpty()) {
            return null;
        }
        while (!this.f13598c.isEmpty()) {
            CeaInputBuffer peek = this.f13598c.peek();
            int i2 = Util.f14736a;
            if (peek.f10607f > this.f13600e) {
                break;
            }
            CeaInputBuffer poll = this.f13598c.poll();
            if (poll.m6242j()) {
                SubtitleOutputBuffer pollFirst = this.f13597b.pollFirst();
                pollFirst.m6238e(4);
                m7221i(poll);
                return pollFirst;
            }
            mo7197f(poll);
            if (mo7199h()) {
                Subtitle mo7196e = mo7196e();
                SubtitleOutputBuffer pollFirst2 = this.f13597b.pollFirst();
                pollFirst2.m7190n(poll.f10607f, mo7196e, Long.MAX_VALUE);
                m7221i(poll);
                return pollFirst2;
            }
            m7221i(poll);
        }
        return null;
    }

    /* renamed from: h */
    public abstract boolean mo7199h();

    /* renamed from: i */
    public final void m7221i(CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.mo6248l();
        this.f13596a.add(ceaInputBuffer);
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }
}
