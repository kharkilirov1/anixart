package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;

/* loaded from: classes.dex */
final class MediaPeriodQueue {

    /* renamed from: a */
    public final Timeline.Period f9881a = new Timeline.Period();

    /* renamed from: b */
    public final Timeline.Window f9882b = new Timeline.Window();

    /* renamed from: c */
    @Nullable
    public final AnalyticsCollector f9883c;

    /* renamed from: d */
    public final Handler f9884d;

    /* renamed from: e */
    public long f9885e;

    /* renamed from: f */
    public int f9886f;

    /* renamed from: g */
    public boolean f9887g;

    /* renamed from: h */
    @Nullable
    public MediaPeriodHolder f9888h;

    /* renamed from: i */
    @Nullable
    public MediaPeriodHolder f9889i;

    /* renamed from: j */
    @Nullable
    public MediaPeriodHolder f9890j;

    /* renamed from: k */
    public int f9891k;

    /* renamed from: l */
    @Nullable
    public Object f9892l;

    /* renamed from: m */
    public long f9893m;

    public MediaPeriodQueue(@Nullable AnalyticsCollector analyticsCollector, Handler handler) {
        this.f9883c = analyticsCollector;
        this.f9884d = handler;
    }

    /* renamed from: p */
    public static MediaSource.MediaPeriodId m5862p(Timeline timeline, Object obj, long j2, long j3, Timeline.Period period) {
        timeline.mo5613j(obj, period);
        int m6927d = period.f10055h.m6927d(j2, period.f10052e);
        return m6927d == -1 ? new MediaSource.MediaPeriodId(obj, j3, period.f10055h.m6926c(j2, period.f10052e)) : new MediaSource.MediaPeriodId(obj, m6927d, period.m5996e(m6927d), j3);
    }

    @Nullable
    /* renamed from: a */
    public MediaPeriodHolder m5863a() {
        MediaPeriodHolder mediaPeriodHolder = this.f9888h;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.f9889i) {
            this.f9889i = mediaPeriodHolder.f9868l;
        }
        mediaPeriodHolder.m5857h();
        int i2 = this.f9891k - 1;
        this.f9891k = i2;
        if (i2 == 0) {
            this.f9890j = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.f9888h;
            this.f9892l = mediaPeriodHolder2.f9858b;
            this.f9893m = mediaPeriodHolder2.f9862f.f9872a.f12359d;
        }
        this.f9888h = this.f9888h.f9868l;
        m5874l();
        return this.f9888h;
    }

    /* renamed from: b */
    public void m5864b() {
        if (this.f9891k == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.f9888h;
        Assertions.m7518f(mediaPeriodHolder);
        this.f9892l = mediaPeriodHolder.f9858b;
        this.f9893m = mediaPeriodHolder.f9862f.f9872a.f12359d;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.m5857h();
            mediaPeriodHolder = mediaPeriodHolder.f9868l;
        }
        this.f9888h = null;
        this.f9890j = null;
        this.f9889i = null;
        this.f9891k = 0;
        m5874l();
    }

    @Nullable
    /* renamed from: c */
    public final MediaPeriodInfo m5865c(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j2) {
        long j3;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f9862f;
        long j4 = (mediaPeriodHolder.f9871o + mediaPeriodInfo.f9876e) - j2;
        long j5 = 0;
        if (mediaPeriodInfo.f9878g) {
            int m5986f = timeline.m5986f(timeline.mo5609d(mediaPeriodInfo.f9872a.f12356a), this.f9881a, this.f9882b, this.f9886f, this.f9887g);
            if (m5986f == -1) {
                return null;
            }
            int i2 = timeline.mo5612i(m5986f, this.f9881a, true).f10051d;
            Object obj = this.f9881a.f10050c;
            long j6 = mediaPeriodInfo.f9872a.f12359d;
            if (timeline.m5990p(i2, this.f9882b).f10078p == m5986f) {
                Pair<Object, Long> m5989m = timeline.m5989m(this.f9882b, this.f9881a, i2, -9223372036854775807L, Math.max(0L, j4));
                if (m5989m == null) {
                    return null;
                }
                obj = m5989m.first;
                long longValue = ((Long) m5989m.second).longValue();
                MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.f9868l;
                if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.f9858b.equals(obj)) {
                    j6 = this.f9885e;
                    this.f9885e = 1 + j6;
                } else {
                    j6 = mediaPeriodHolder2.f9862f.f9872a.f12359d;
                }
                j3 = longValue;
                j5 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return m5866d(timeline, m5862p(timeline, obj, j3, j6, this.f9881a), j5, j3);
        }
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f9872a;
        timeline.mo5613j(mediaPeriodId.f12356a, this.f9881a);
        if (!mediaPeriodId.m6828a()) {
            int m5996e = this.f9881a.m5996e(mediaPeriodId.f12360e);
            if (m5996e != this.f9881a.f10055h.m6925b(mediaPeriodId.f12360e).f12610c) {
                return m5867e(timeline, mediaPeriodId.f12356a, mediaPeriodId.f12360e, m5996e, mediaPeriodInfo.f9876e, mediaPeriodId.f12359d);
            }
            return m5868f(timeline, mediaPeriodId.f12356a, m5869g(timeline, mediaPeriodId.f12356a, mediaPeriodId.f12360e), mediaPeriodInfo.f9876e, mediaPeriodId.f12359d);
        }
        int i3 = mediaPeriodId.f12357b;
        int i4 = this.f9881a.f10055h.m6925b(i3).f12610c;
        if (i4 == -1) {
            return null;
        }
        int m6936d = this.f9881a.f10055h.m6925b(i3).m6936d(mediaPeriodId.f12358c);
        if (m6936d < i4) {
            return m5867e(timeline, mediaPeriodId.f12356a, i3, m6936d, mediaPeriodInfo.f9874c, mediaPeriodId.f12359d);
        }
        long j7 = mediaPeriodInfo.f9874c;
        if (j7 == -9223372036854775807L) {
            Timeline.Window window = this.f9882b;
            Timeline.Period period = this.f9881a;
            Pair<Object, Long> m5989m2 = timeline.m5989m(window, period, period.f10051d, -9223372036854775807L, Math.max(0L, j4));
            if (m5989m2 == null) {
                return null;
            }
            j7 = ((Long) m5989m2.second).longValue();
        }
        return m5868f(timeline, mediaPeriodId.f12356a, Math.max(m5869g(timeline, mediaPeriodId.f12356a, mediaPeriodId.f12357b), j7), mediaPeriodInfo.f9874c, mediaPeriodId.f12359d);
    }

    @Nullable
    /* renamed from: d */
    public final MediaPeriodInfo m5866d(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3) {
        timeline.mo5613j(mediaPeriodId.f12356a, this.f9881a);
        return mediaPeriodId.m6828a() ? m5867e(timeline, mediaPeriodId.f12356a, mediaPeriodId.f12357b, mediaPeriodId.f12358c, j2, mediaPeriodId.f12359d) : m5868f(timeline, mediaPeriodId.f12356a, j3, j2, mediaPeriodId.f12359d);
    }

    /* renamed from: e */
    public final MediaPeriodInfo m5867e(Timeline timeline, Object obj, int i2, int i3, long j2, long j3) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i2, i3, j3);
        long m5993b = timeline.mo5613j(obj, this.f9881a).m5993b(i2, i3);
        long j4 = i3 == this.f9881a.f10055h.m6925b(i2).m6936d(-1) ? this.f9881a.f10055h.f12604d : 0L;
        return new MediaPeriodInfo(mediaPeriodId, (m5993b == -9223372036854775807L || j4 < m5993b) ? j4 : Math.max(0L, m5993b - 1), j2, -9223372036854775807L, m5993b, this.f9881a.f10055h.m6925b(i2).f12615h, false, false, false);
    }

    /* renamed from: f */
    public final MediaPeriodInfo m5868f(Timeline timeline, Object obj, long j2, long j3, long j4) {
        long j5 = j2;
        timeline.mo5613j(obj, this.f9881a);
        Timeline.Period period = this.f9881a;
        int m6926c = period.f10055h.m6926c(j5, period.f10052e);
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j4, m6926c);
        boolean m5871i = m5871i(mediaPeriodId);
        boolean m5873k = m5873k(timeline, mediaPeriodId);
        boolean m5872j = m5872j(timeline, mediaPeriodId, m5871i);
        boolean z = m6926c != -1 && this.f9881a.m5998g(m6926c);
        long m5995d = m6926c != -1 ? this.f9881a.m5995d(m6926c) : -9223372036854775807L;
        long j6 = (m5995d == -9223372036854775807L || m5995d == Long.MIN_VALUE) ? this.f9881a.f10052e : m5995d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, j5, j3, m5995d, j6, z, m5871i, m5873k, m5872j);
    }

    /* renamed from: g */
    public final long m5869g(Timeline timeline, Object obj, int i2) {
        timeline.mo5613j(obj, this.f9881a);
        long j2 = this.f9881a.f10055h.m6925b(i2).f12609b;
        return j2 == Long.MIN_VALUE ? this.f9881a.f10052e : j2 + this.f9881a.f10055h.m6925b(i2).f12614g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.MediaPeriodInfo m5870h(com.google.android.exoplayer2.Timeline r19, com.google.android.exoplayer2.MediaPeriodInfo r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r2.f9872a
            boolean r12 = r0.m5871i(r3)
            boolean r13 = r0.m5873k(r1, r3)
            boolean r14 = r0.m5872j(r1, r3, r12)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r2.f9872a
            java.lang.Object r4 = r4.f12356a
            com.google.android.exoplayer2.Timeline$Period r5 = r0.f9881a
            r1.mo5613j(r4, r5)
            boolean r1 = r3.m6828a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f12360e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.google.android.exoplayer2.Timeline$Period r7 = r0.f9881a
            long r7 = r7.m5995d(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.m6828a()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.Timeline$Period r1 = r0.f9881a
            int r5 = r3.f12357b
            int r6 = r3.f12358c
            long r5 = r1.m5993b(r5, r6)
        L46:
            r9 = r5
            goto L5a
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5a
        L55:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.f9881a
            long r5 = r1.f10052e
            goto L46
        L5a:
            boolean r1 = r3.m6828a()
            if (r1 == 0) goto L6a
            com.google.android.exoplayer2.Timeline$Period r1 = r0.f9881a
            int r4 = r3.f12357b
            boolean r1 = r1.m5998g(r4)
            r11 = r1
            goto L7b
        L6a:
            int r1 = r3.f12360e
            if (r1 == r4) goto L79
            com.google.android.exoplayer2.Timeline$Period r4 = r0.f9881a
            boolean r1 = r4.m5998g(r1)
            if (r1 == 0) goto L79
            r1 = 1
            r11 = 1
            goto L7b
        L79:
            r1 = 0
            r11 = 0
        L7b:
            com.google.android.exoplayer2.MediaPeriodInfo r15 = new com.google.android.exoplayer2.MediaPeriodInfo
            long r4 = r2.f9873b
            long r1 = r2.f9874c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MediaPeriodQueue.m5870h(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.MediaPeriodInfo):com.google.android.exoplayer2.MediaPeriodInfo");
    }

    /* renamed from: i */
    public final boolean m5871i(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.m6828a() && mediaPeriodId.f12360e == -1;
    }

    /* renamed from: j */
    public final boolean m5872j(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int mo5609d = timeline.mo5609d(mediaPeriodId.f12356a);
        if (timeline.m5990p(timeline.m5987h(mo5609d, this.f9881a).f10051d, this.f9882b).f10072j) {
            return false;
        }
        return (timeline.m5986f(mo5609d, this.f9881a, this.f9882b, this.f9886f, this.f9887g) == -1) && z;
    }

    /* renamed from: k */
    public final boolean m5873k(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (m5871i(mediaPeriodId)) {
            return timeline.m5990p(timeline.mo5613j(mediaPeriodId.f12356a, this.f9881a).f10051d, this.f9882b).f10079q == timeline.mo5609d(mediaPeriodId.f12356a);
        }
        return false;
    }

    /* renamed from: l */
    public final void m5874l() {
        if (this.f9883c != null) {
            UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
            final ImmutableList.Builder builder = new ImmutableList.Builder();
            for (MediaPeriodHolder mediaPeriodHolder = this.f9888h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f9868l) {
                builder.m11640d(mediaPeriodHolder.f9862f.f9872a);
            }
            MediaPeriodHolder mediaPeriodHolder2 = this.f9889i;
            final MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.f9862f.f9872a;
            this.f9884d.post(new Runnable() { // from class: com.google.android.exoplayer2.p
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPeriodQueue mediaPeriodQueue = MediaPeriodQueue.this;
                    ImmutableList.Builder builder2 = builder;
                    mediaPeriodQueue.f9883c.m6018P(builder2.m11641e(), mediaPeriodId);
                }
            });
        }
    }

    /* renamed from: m */
    public void m5875m(long j2) {
        MediaPeriodHolder mediaPeriodHolder = this.f9890j;
        if (mediaPeriodHolder != null) {
            Assertions.m7516d(mediaPeriodHolder.m5856g());
            if (mediaPeriodHolder.f9860d) {
                mediaPeriodHolder.f9857a.reevaluateBuffer(j2 - mediaPeriodHolder.f9871o);
            }
        }
    }

    /* renamed from: n */
    public boolean m5876n(MediaPeriodHolder mediaPeriodHolder) {
        boolean z = false;
        Assertions.m7516d(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.f9890j)) {
            return false;
        }
        this.f9890j = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.f9868l;
            if (mediaPeriodHolder == null) {
                break;
            }
            if (mediaPeriodHolder == this.f9889i) {
                this.f9889i = this.f9888h;
                z = true;
            }
            mediaPeriodHolder.m5857h();
            this.f9891k--;
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.f9890j;
        if (mediaPeriodHolder2.f9868l != null) {
            mediaPeriodHolder2.m5851b();
            mediaPeriodHolder2.f9868l = null;
            mediaPeriodHolder2.m5852c();
        }
        m5874l();
        return z;
    }

    /* renamed from: o */
    public MediaSource.MediaPeriodId m5877o(Timeline timeline, Object obj, long j2) {
        long j3;
        int mo5609d;
        int i2 = timeline.mo5613j(obj, this.f9881a).f10051d;
        Object obj2 = this.f9892l;
        if (obj2 == null || (mo5609d = timeline.mo5609d(obj2)) == -1 || timeline.m5987h(mo5609d, this.f9881a).f10051d != i2) {
            MediaPeriodHolder mediaPeriodHolder = this.f9888h;
            while (true) {
                if (mediaPeriodHolder == null) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.f9888h;
                    while (true) {
                        if (mediaPeriodHolder2 != null) {
                            int mo5609d2 = timeline.mo5609d(mediaPeriodHolder2.f9858b);
                            if (mo5609d2 != -1 && timeline.m5987h(mo5609d2, this.f9881a).f10051d == i2) {
                                j3 = mediaPeriodHolder2.f9862f.f9872a.f12359d;
                                break;
                            }
                            mediaPeriodHolder2 = mediaPeriodHolder2.f9868l;
                        } else {
                            j3 = this.f9885e;
                            this.f9885e = 1 + j3;
                            if (this.f9888h == null) {
                                this.f9892l = obj;
                                this.f9893m = j3;
                            }
                        }
                    }
                } else {
                    if (mediaPeriodHolder.f9858b.equals(obj)) {
                        j3 = mediaPeriodHolder.f9862f.f9872a.f12359d;
                        break;
                    }
                    mediaPeriodHolder = mediaPeriodHolder.f9868l;
                }
            }
        } else {
            j3 = this.f9893m;
        }
        return m5862p(timeline, obj, j2, j3, this.f9881a);
    }

    /* renamed from: q */
    public final boolean m5878q(Timeline timeline) {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.f9888h;
        if (mediaPeriodHolder2 == null) {
            return true;
        }
        int mo5609d = timeline.mo5609d(mediaPeriodHolder2.f9858b);
        while (true) {
            mo5609d = timeline.m5986f(mo5609d, this.f9881a, this.f9882b, this.f9886f, this.f9887g);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.f9868l;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.f9862f.f9878g) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (mo5609d == -1 || mediaPeriodHolder == null || timeline.mo5609d(mediaPeriodHolder.f9858b) != mo5609d) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
        }
        boolean m5876n = m5876n(mediaPeriodHolder2);
        mediaPeriodHolder2.f9862f = m5870h(timeline, mediaPeriodHolder2.f9862f);
        return !m5876n;
    }

    /* renamed from: r */
    public boolean m5879r(Timeline timeline, long j2, long j3) {
        boolean m5876n;
        MediaPeriodInfo mediaPeriodInfo;
        MediaPeriodHolder mediaPeriodHolder = this.f9888h;
        MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f9862f;
            if (mediaPeriodHolder2 != null) {
                MediaPeriodInfo m5865c = m5865c(timeline, mediaPeriodHolder2, j2);
                if (m5865c == null) {
                    m5876n = m5876n(mediaPeriodHolder2);
                } else {
                    if (mediaPeriodInfo2.f9873b == m5865c.f9873b && mediaPeriodInfo2.f9872a.equals(m5865c.f9872a)) {
                        mediaPeriodInfo = m5865c;
                    } else {
                        m5876n = m5876n(mediaPeriodHolder2);
                    }
                }
                return !m5876n;
            }
            mediaPeriodInfo = m5870h(timeline, mediaPeriodInfo2);
            mediaPeriodHolder.f9862f = mediaPeriodInfo.m5860a(mediaPeriodInfo2.f9874c);
            long j4 = mediaPeriodInfo2.f9876e;
            if (!(j4 == -9223372036854775807L || j4 == mediaPeriodInfo.f9876e)) {
                mediaPeriodHolder.m5859j();
                long j5 = mediaPeriodInfo.f9876e;
                return (m5876n(mediaPeriodHolder) || (mediaPeriodHolder == this.f9889i && !mediaPeriodHolder.f9862f.f9877f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j5 + mediaPeriodHolder.f9871o) ? 1 : (j3 == ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j5 + mediaPeriodHolder.f9871o) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.f9868l;
        }
        return true;
    }
}
