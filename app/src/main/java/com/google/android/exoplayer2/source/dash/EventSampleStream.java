package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
final class EventSampleStream implements SampleStream {

    /* renamed from: b */
    public final Format f12890b;

    /* renamed from: d */
    public long[] f12892d;

    /* renamed from: e */
    public boolean f12893e;

    /* renamed from: f */
    public EventStream f12894f;

    /* renamed from: g */
    public boolean f12895g;

    /* renamed from: h */
    public int f12896h;

    /* renamed from: c */
    public final EventMessageEncoder f12891c = new EventMessageEncoder();

    /* renamed from: i */
    public long f12897i = -9223372036854775807L;

    public EventSampleStream(EventStream eventStream, Format format, boolean z) {
        this.f12890b = format;
        this.f12894f = eventStream;
        this.f12892d = eventStream.f12958b;
        m7038e(eventStream, z);
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: a */
    public void mo6791a() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: b */
    public boolean mo6792b() {
        return true;
    }

    /* renamed from: c */
    public void m7037c(long j2) {
        int m7730b = Util.m7730b(this.f12892d, j2, true, false);
        this.f12896h = m7730b;
        if (!(this.f12893e && m7730b == this.f12892d.length)) {
            j2 = -9223372036854775807L;
        }
        this.f12897i = j2;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: d */
    public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        int i3 = this.f12896h;
        boolean z = i3 == this.f12892d.length;
        if (z && !this.f12893e) {
            decoderInputBuffer.f10580b = 4;
            return -4;
        }
        if ((i2 & 2) != 0 || !this.f12895g) {
            formatHolder.f9704b = this.f12890b;
            this.f12895g = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        this.f12896h = i3 + 1;
        byte[] m6707a = this.f12891c.m6707a(this.f12894f.f12957a[i3]);
        decoderInputBuffer.m6250n(m6707a.length);
        decoderInputBuffer.f10605d.put(m6707a);
        decoderInputBuffer.f10607f = this.f12892d[i3];
        decoderInputBuffer.f10580b = 1;
        return -4;
    }

    /* renamed from: e */
    public void m7038e(EventStream eventStream, boolean z) {
        int i2 = this.f12896h;
        long j2 = i2 == 0 ? -9223372036854775807L : this.f12892d[i2 - 1];
        this.f12893e = z;
        this.f12894f = eventStream;
        long[] jArr = eventStream.f12958b;
        this.f12892d = jArr;
        long j3 = this.f12897i;
        if (j3 != -9223372036854775807L) {
            m7037c(j3);
        } else if (j2 != -9223372036854775807L) {
            this.f12896h = Util.m7730b(jArr, j2, false, false);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: h */
    public int mo6794h(long j2) {
        int max = Math.max(this.f12896h, Util.m7730b(this.f12892d, j2, true, false));
        int i2 = max - this.f12896h;
        this.f12896h = max;
        return i2;
    }
}
