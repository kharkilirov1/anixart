package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SinglePeriodTimeline extends Timeline {

    /* renamed from: p */
    public static final Object f12538p = new Object();

    /* renamed from: c */
    public final long f12539c;

    /* renamed from: d */
    public final long f12540d;

    /* renamed from: e */
    public final long f12541e;

    /* renamed from: f */
    public final long f12542f;

    /* renamed from: g */
    public final long f12543g;

    /* renamed from: h */
    public final long f12544h;

    /* renamed from: i */
    public final long f12545i;

    /* renamed from: j */
    public final boolean f12546j;

    /* renamed from: k */
    public final boolean f12547k;

    /* renamed from: l */
    public final boolean f12548l;

    /* renamed from: m */
    @Nullable
    public final Object f12549m;

    /* renamed from: n */
    @Nullable
    public final MediaItem f12550n;

    /* renamed from: o */
    @Nullable
    public final MediaItem.LiveConfiguration f12551o;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f9718a = "SinglePeriodTimeline";
        builder.f9719b = Uri.EMPTY;
        builder.m5839a();
    }

    public SinglePeriodTimeline(long j2, boolean z, boolean z2, boolean z3, @Nullable Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z, z2, false, null, mediaItem, z3 ? mediaItem.f9715d : null);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: d */
    public int mo5609d(Object obj) {
        return f12538p.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
        Assertions.m7515c(i2, 0, 1);
        period.m5999i(null, z ? f12538p : null, 0, this.f12542f, -this.f12544h);
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: k */
    public int mo5936k() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    public Object mo5615o(int i2) {
        Assertions.m7515c(i2, 0, 1);
        return f12538p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.Timeline.Window mo5616q(int r25, com.google.android.exoplayer2.Timeline.Window r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.google.android.exoplayer2.util.Assertions.m7515c(r3, r1, r2)
            long r1 = r0.f12545i
            boolean r14 = r0.f12547k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f12548l
            if (r5 != 0) goto L2e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r5 = r0.f12543g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.Timeline.Window.f10060s
            com.google.android.exoplayer2.MediaItem r5 = r0.f12550n
            java.lang.Object r6 = r0.f12549m
            long r7 = r0.f12539c
            long r9 = r0.f12540d
            long r11 = r0.f12541e
            boolean r13 = r0.f12546j
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r15 = r0.f12551o
            long r1 = r0.f12543g
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f12544h
            r22 = r1
            r3 = r26
            r3.m6005f(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.mo5616q(int, com.google.android.exoplayer2.Timeline$Window, long):com.google.android.exoplayer2.Timeline$Window");
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: r */
    public int mo5937r() {
        return 1;
    }

    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.f12539c = j2;
        this.f12540d = j3;
        this.f12541e = j4;
        this.f12542f = j5;
        this.f12543g = j6;
        this.f12544h = j7;
        this.f12545i = j8;
        this.f12546j = z;
        this.f12547k = z2;
        this.f12548l = z3;
        this.f12549m = obj;
        Objects.requireNonNull(mediaItem);
        this.f12550n = mediaItem;
        this.f12551o = liveConfiguration;
    }
}
