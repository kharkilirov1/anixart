package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class HlsSampleStream implements SampleStream {

    /* renamed from: b */
    public final int f13152b;

    /* renamed from: c */
    public final HlsSampleStreamWrapper f13153c;

    /* renamed from: d */
    public int f13154d = -1;

    public HlsSampleStream(HlsSampleStreamWrapper hlsSampleStreamWrapper, int i2) {
        this.f13153c = hlsSampleStreamWrapper;
        this.f13152b = i2;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: a */
    public void mo6791a() throws IOException {
        int i2 = this.f13154d;
        if (i2 == -2) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13153c;
            hlsSampleStreamWrapper.m7113k();
            TrackGroupArray trackGroupArray = hlsSampleStreamWrapper.f13164I;
            throw new SampleQueueMappingException(trackGroupArray.f12595c[this.f13152b].f12590c[0].f9659m);
        }
        if (i2 == -1) {
            this.f13153c.m7119u();
        } else if (i2 != -3) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper2 = this.f13153c;
            hlsSampleStreamWrapper2.m7119u();
            hlsSampleStreamWrapper2.f13200v[i2].m6907y();
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: b */
    public boolean mo6792b() {
        if (this.f13154d != -3) {
            if (!m7109e()) {
                return false;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13153c;
            if (!(!hlsSampleStreamWrapper.m7117s() && hlsSampleStreamWrapper.f13200v[this.f13154d].m6905w(hlsSampleStreamWrapper.f13175T))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void m7108c() {
        Assertions.m7513a(this.f13154d == -1);
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13153c;
        int i2 = this.f13152b;
        hlsSampleStreamWrapper.m7113k();
        Objects.requireNonNull(hlsSampleStreamWrapper.f13166K);
        int i3 = hlsSampleStreamWrapper.f13166K[i2];
        if (i3 == -1) {
            if (hlsSampleStreamWrapper.f13165J.contains(hlsSampleStreamWrapper.f13164I.f12595c[i2])) {
                i3 = -3;
            }
            i3 = -2;
        } else {
            boolean[] zArr = hlsSampleStreamWrapper.f13169N;
            if (!zArr[i3]) {
                zArr[i3] = true;
            }
            i3 = -2;
        }
        this.f13154d = i3;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: d */
    public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        Format format;
        if (this.f13154d == -3) {
            decoderInputBuffer.m6238e(4);
            return -4;
        }
        if (!m7109e()) {
            return -3;
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13153c;
        int i3 = this.f13154d;
        if (hlsSampleStreamWrapper.m7117s()) {
            return -3;
        }
        int i4 = 0;
        if (!hlsSampleStreamWrapper.f13192n.isEmpty()) {
            int i5 = 0;
            while (true) {
                boolean z = true;
                if (i5 >= hlsSampleStreamWrapper.f13192n.size() - 1) {
                    break;
                }
                int i6 = hlsSampleStreamWrapper.f13192n.get(i5).f13089k;
                int length = hlsSampleStreamWrapper.f13200v.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        if (hlsSampleStreamWrapper.f13169N[i7] && hlsSampleStreamWrapper.f13200v[i7].m6880A() == i6) {
                            z = false;
                            break;
                        }
                        i7++;
                    } else {
                        break;
                    }
                }
                if (!z) {
                    break;
                }
                i5++;
            }
            Util.m7722U(hlsSampleStreamWrapper.f13192n, 0, i5);
            HlsMediaChunk hlsMediaChunk = hlsSampleStreamWrapper.f13192n.get(0);
            Format format2 = hlsMediaChunk.f12701d;
            if (!format2.equals(hlsSampleStreamWrapper.f13162G)) {
                hlsSampleStreamWrapper.f13189k.m6832c(hlsSampleStreamWrapper.f13180b, format2, hlsMediaChunk.f12702e, hlsMediaChunk.f12703f, hlsMediaChunk.f12704g);
            }
            hlsSampleStreamWrapper.f13162G = format2;
        }
        if (!hlsSampleStreamWrapper.f13192n.isEmpty() && !hlsSampleStreamWrapper.f13192n.get(0).f13088K) {
            return -3;
        }
        int m6882C = hlsSampleStreamWrapper.f13200v[i3].m6882C(formatHolder, decoderInputBuffer, i2, hlsSampleStreamWrapper.f13175T);
        if (m6882C == -5) {
            Format format3 = formatHolder.f9704b;
            Objects.requireNonNull(format3);
            if (i3 == hlsSampleStreamWrapper.f13157B) {
                int m6880A = hlsSampleStreamWrapper.f13200v[i3].m6880A();
                while (i4 < hlsSampleStreamWrapper.f13192n.size() && hlsSampleStreamWrapper.f13192n.get(i4).f13089k != m6880A) {
                    i4++;
                }
                if (i4 < hlsSampleStreamWrapper.f13192n.size()) {
                    format = hlsSampleStreamWrapper.f13192n.get(i4).f12701d;
                } else {
                    format = hlsSampleStreamWrapper.f13161F;
                    Objects.requireNonNull(format);
                }
                format3 = format3.m5832i(format);
            }
            formatHolder.f9704b = format3;
        }
        return m6882C;
    }

    /* renamed from: e */
    public final boolean m7109e() {
        int i2 = this.f13154d;
        return (i2 == -1 || i2 == -3 || i2 == -2) ? false : true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: h */
    public int mo6794h(long j2) {
        if (!m7109e()) {
            return 0;
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13153c;
        int i2 = this.f13154d;
        if (hlsSampleStreamWrapper.m7117s()) {
            return 0;
        }
        HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = hlsSampleStreamWrapper.f13200v[i2];
        int m6901s = hlsSampleQueue.m6901s(j2, hlsSampleStreamWrapper.f13175T);
        HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) Iterables.m11701f(hlsSampleStreamWrapper.f13192n, null);
        if (hlsMediaChunk != null && !hlsMediaChunk.f13088K) {
            m6901s = Math.min(m6901s, hlsMediaChunk.m7096g(i2) - hlsSampleQueue.m6899q());
        }
        hlsSampleQueue.m6888I(m6901s);
        return m6901s;
    }
}
