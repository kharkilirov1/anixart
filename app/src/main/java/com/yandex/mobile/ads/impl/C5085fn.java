package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.C5138gn;
import com.yandex.mobile.ads.impl.C6020xb;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.InterfaceC5853ub;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.ta0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.fn */
/* loaded from: classes3.dex */
public final class C5085fn implements InterfaceC5853ub {

    /* renamed from: A */
    private int f50307A;

    /* renamed from: B */
    private long f50308B;

    /* renamed from: C */
    private long f50309C;

    /* renamed from: D */
    private long f50310D;

    /* renamed from: E */
    private long f50311E;

    /* renamed from: F */
    private int f50312F;

    /* renamed from: G */
    private boolean f50313G;

    /* renamed from: H */
    private boolean f50314H;

    /* renamed from: I */
    private long f50315I;

    /* renamed from: J */
    private float f50316J;

    /* renamed from: K */
    private InterfaceC5737sb[] f50317K;

    /* renamed from: L */
    private ByteBuffer[] f50318L;

    /* renamed from: M */
    @Nullable
    private ByteBuffer f50319M;

    /* renamed from: N */
    private int f50320N;

    /* renamed from: O */
    @Nullable
    private ByteBuffer f50321O;

    /* renamed from: P */
    private byte[] f50322P;

    /* renamed from: Q */
    private int f50323Q;

    /* renamed from: R */
    private int f50324R;

    /* renamed from: S */
    private boolean f50325S;

    /* renamed from: T */
    private boolean f50326T;

    /* renamed from: U */
    private boolean f50327U;

    /* renamed from: V */
    private boolean f50328V;

    /* renamed from: W */
    private int f50329W;

    /* renamed from: X */
    private C5174hc f50330X;

    /* renamed from: Y */
    private boolean f50331Y;

    /* renamed from: Z */
    private long f50332Z;

    /* renamed from: a */
    private final C5574pb f50333a;

    /* renamed from: a0 */
    private boolean f50334a0;

    /* renamed from: b */
    private final c f50335b;

    /* renamed from: b0 */
    private boolean f50336b0;

    /* renamed from: c */
    private final boolean f50337c;

    /* renamed from: d */
    private final C5186hh f50338d;

    /* renamed from: e */
    private final y71 f50339e;

    /* renamed from: f */
    private final InterfaceC5737sb[] f50340f;

    /* renamed from: g */
    private final InterfaceC5737sb[] f50341g;

    /* renamed from: h */
    private final C4813ak f50342h;

    /* renamed from: i */
    private final C6020xb f50343i;

    /* renamed from: j */
    private final ArrayDeque<i> f50344j;

    /* renamed from: k */
    private final boolean f50345k;

    /* renamed from: l */
    private final int f50346l;

    /* renamed from: m */
    private l f50347m;

    /* renamed from: n */
    private final j<InterfaceC5853ub.b> f50348n;

    /* renamed from: o */
    private final j<InterfaceC5853ub.e> f50349o;

    /* renamed from: p */
    private final C5138gn f50350p;

    /* renamed from: q */
    @Nullable
    private uq0 f50351q;

    /* renamed from: r */
    @Nullable
    private InterfaceC5853ub.c f50352r;

    /* renamed from: s */
    @Nullable
    private f f50353s;

    /* renamed from: t */
    private f f50354t;

    /* renamed from: u */
    @Nullable
    private AudioTrack f50355u;

    /* renamed from: v */
    private C5481nb f50356v;

    /* renamed from: w */
    @Nullable
    private i f50357w;

    /* renamed from: x */
    private i f50358x;

    /* renamed from: y */
    private nq0 f50359y;

    /* renamed from: z */
    @Nullable
    private ByteBuffer f50360z;

    /* renamed from: com.yandex.mobile.ads.impl.fn$a */
    public class a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ AudioTrack f50361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f50361b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f50361b.flush();
                this.f50361b.release();
            } finally {
                C5085fn.this.f50342h.m22536e();
            }
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.fn$b */
    public static final class b {
        @DoNotInline
        /* renamed from: a */
        public static void m24677a(AudioTrack audioTrack, uq0 uq0Var) {
            LogSessionId m29096a = uq0Var.m29096a();
            if (m29096a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(m29096a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$c */
    public interface c {
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$d */
    public interface d {

        /* renamed from: a */
        public static final C5138gn f50363a = new C5138gn(new C5138gn.a());
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$e */
    public static final class e {

        /* renamed from: b */
        @Nullable
        private g f50365b;

        /* renamed from: c */
        private boolean f50366c;

        /* renamed from: d */
        private boolean f50367d;

        /* renamed from: a */
        private C5574pb f50364a = C5574pb.f53421d;

        /* renamed from: e */
        private int f50368e = 0;

        /* renamed from: f */
        public C5138gn f50369f = d.f50363a;

        /* renamed from: a */
        public final e m24683a(C5574pb c5574pb) {
            Objects.requireNonNull(c5574pb);
            this.f50364a = c5574pb;
            return this;
        }

        /* renamed from: b */
        public final e m24685b() {
            this.f50367d = false;
            return this;
        }

        /* renamed from: c */
        public final e m24686c() {
            this.f50366c = false;
            return this;
        }

        /* renamed from: d */
        public final e m24687d() {
            this.f50368e = 0;
            return this;
        }

        /* renamed from: a */
        public final C5085fn m24684a() {
            int i2 = 0;
            if (this.f50365b == null) {
                this.f50365b = new g(new InterfaceC5737sb[0], new y01(0), new i31());
            }
            return new C5085fn(this, i2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$f */
    public static final class f {

        /* renamed from: a */
        public final C5606pv f50370a;

        /* renamed from: b */
        public final int f50371b;

        /* renamed from: c */
        public final int f50372c;

        /* renamed from: d */
        public final int f50373d;

        /* renamed from: e */
        public final int f50374e;

        /* renamed from: f */
        public final int f50375f;

        /* renamed from: g */
        public final int f50376g;

        /* renamed from: h */
        public final int f50377h;

        /* renamed from: i */
        public final InterfaceC5737sb[] f50378i;

        public f(C5606pv c5606pv, int i2, int i3, int i4, int i5, int i6, int i7, int i8, InterfaceC5737sb[] interfaceC5737sbArr) {
            this.f50370a = c5606pv;
            this.f50371b = i2;
            this.f50372c = i3;
            this.f50373d = i4;
            this.f50374e = i5;
            this.f50375f = i6;
            this.f50376g = i7;
            this.f50377h = i8;
            this.f50378i = interfaceC5737sbArr;
        }

        /* renamed from: b */
        private AudioTrack m24688b(boolean z, C5481nb c5481nb, int i2) {
            int i3 = s91.f54530a;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c5481nb.m26831a().f52900a).setAudioFormat(C5085fn.m24640a(this.f50374e, this.f50375f, this.f50376g)).setTransferMode(1).setBufferSizeInBytes(this.f50377h).setSessionId(i2).setOffloadedPlayback(this.f50372c == 1).build();
            }
            if (i3 >= 21) {
                return new AudioTrack(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c5481nb.m26831a().f52900a, C5085fn.m24640a(this.f50374e, this.f50375f, this.f50376g), this.f50377h, 1, i2);
            }
            int m28125c = s91.m28125c(c5481nb.f52896c);
            return i2 == 0 ? new AudioTrack(m28125c, this.f50374e, this.f50375f, this.f50376g, this.f50377h, 1) : new AudioTrack(m28125c, this.f50374e, this.f50375f, this.f50376g, this.f50377h, 1, i2);
        }

        /* renamed from: a */
        public final AudioTrack m24689a(boolean z, C5481nb c5481nb, int i2) throws InterfaceC5853ub.b {
            try {
                AudioTrack m24688b = m24688b(z, c5481nb, i2);
                int state = m24688b.getState();
                if (state == 1) {
                    return m24688b;
                }
                try {
                    m24688b.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC5853ub.b(state, this.f50374e, this.f50375f, this.f50377h, this.f50370a, this.f50372c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new InterfaceC5853ub.b(0, this.f50374e, this.f50375f, this.f50377h, this.f50370a, this.f50372c == 1, e2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$g */
    public static class g implements c {

        /* renamed from: a */
        private final InterfaceC5737sb[] f50379a;

        /* renamed from: b */
        private final y01 f50380b;

        /* renamed from: c */
        private final i31 f50381c;

        public g(InterfaceC5737sb[] interfaceC5737sbArr, y01 y01Var, i31 i31Var) {
            InterfaceC5737sb[] interfaceC5737sbArr2 = new InterfaceC5737sb[interfaceC5737sbArr.length + 2];
            this.f50379a = interfaceC5737sbArr2;
            System.arraycopy(interfaceC5737sbArr, 0, interfaceC5737sbArr2, 0, interfaceC5737sbArr.length);
            this.f50380b = y01Var;
            this.f50381c = i31Var;
            interfaceC5737sbArr2[interfaceC5737sbArr.length] = y01Var;
            interfaceC5737sbArr2[interfaceC5737sbArr.length + 1] = i31Var;
        }

        /* renamed from: a */
        public final InterfaceC5737sb[] m24693a() {
            return this.f50379a;
        }

        /* renamed from: b */
        public final long m24694b() {
            return this.f50380b.m29840i();
        }

        /* renamed from: a */
        public final nq0 m24691a(nq0 nq0Var) {
            this.f50381c.m25437b(nq0Var.f53072a);
            this.f50381c.m25434a(nq0Var.f53073b);
            return nq0Var;
        }

        /* renamed from: a */
        public final boolean m24692a(boolean z) {
            this.f50380b.m29839a(z);
            return z;
        }

        /* renamed from: a */
        public final long m24690a(long j2) {
            return this.f50381c.m25432a(j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$h */
    public static final class h extends RuntimeException {
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$i */
    public static final class i {

        /* renamed from: a */
        public final nq0 f50382a;

        /* renamed from: b */
        public final boolean f50383b;

        /* renamed from: c */
        public final long f50384c;

        /* renamed from: d */
        public final long f50385d;

        public /* synthetic */ i(nq0 nq0Var, boolean z, long j2, long j3, int i2) {
            this(nq0Var, z, j2, j3);
        }

        private i(nq0 nq0Var, boolean z, long j2, long j3) {
            this.f50382a = nq0Var;
            this.f50383b = z;
            this.f50384c = j2;
            this.f50385d = j3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$k */
    public final class k implements C6020xb.a {
        private k() {
        }

        @Override // com.yandex.mobile.ads.impl.C6020xb.a
        /* renamed from: a */
        public final void mo24699a(long j2, long j3, long j4, long j5) {
            d90.m23842d("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + C5085fn.m24648c(C5085fn.this) + ", " + C5085fn.this.m24655i());
        }

        @Override // com.yandex.mobile.ads.impl.C6020xb.a
        /* renamed from: b */
        public final void mo24701b(long j2, long j3, long j4, long j5) {
            d90.m23842d("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + C5085fn.m24648c(C5085fn.this) + ", " + C5085fn.this.m24655i());
        }

        public /* synthetic */ k(C5085fn c5085fn, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.C6020xb.a
        /* renamed from: a */
        public final void mo24698a(long j2) {
            InterfaceC5790tb.a aVar;
            if (C5085fn.this.f50352r != null) {
                aVar = ta0.this.f54993I0;
                aVar.m28564b(j2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C6020xb.a
        /* renamed from: b */
        public final void mo24700b(long j2) {
            d90.m23842d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // com.yandex.mobile.ads.impl.C6020xb.a
        /* renamed from: a */
        public final void mo24697a(int i2, long j2) {
            InterfaceC5790tb.a aVar;
            if (C5085fn.this.f50352r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - C5085fn.this.f50332Z;
                aVar = ta0.this.f54993I0;
                aVar.m28563b(i2, j2, elapsedRealtime);
            }
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.fn$l */
    public final class l {

        /* renamed from: a */
        private final Handler f50389a = new Handler();

        /* renamed from: b */
        private final AudioTrack.StreamEventCallback f50390b = new a();

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$a */
        public class a extends AudioTrack.StreamEventCallback {
            public a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i2) {
                cv0.InterfaceC4941a interfaceC4941a;
                cv0.InterfaceC4941a interfaceC4941a2;
                C5220ia.m25476b(audioTrack == C5085fn.this.f50355u);
                if (C5085fn.this.f50352r == null || !C5085fn.this.f50327U) {
                    return;
                }
                ta0.C5789a c5789a = (ta0.C5789a) C5085fn.this.f50352r;
                interfaceC4941a = ta0.this.f55002R0;
                if (interfaceC4941a != null) {
                    interfaceC4941a2 = ta0.this.f55002R0;
                    interfaceC4941a2.mo23536b();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                cv0.InterfaceC4941a interfaceC4941a;
                cv0.InterfaceC4941a interfaceC4941a2;
                C5220ia.m25476b(audioTrack == C5085fn.this.f50355u);
                if (C5085fn.this.f50352r == null || !C5085fn.this.f50327U) {
                    return;
                }
                ta0.C5789a c5789a = (ta0.C5789a) C5085fn.this.f50352r;
                interfaceC4941a = ta0.this.f55002R0;
                if (interfaceC4941a != null) {
                    interfaceC4941a2 = ta0.this.f55002R0;
                    interfaceC4941a2.mo23536b();
                }
            }
        }

        public l() {
        }

        /* renamed from: a */
        public final void m24702a(AudioTrack audioTrack) {
            Handler handler = this.f50389a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ko1(handler, 0), this.f50390b);
        }

        /* renamed from: b */
        public final void m24703b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f50390b);
            this.f50389a.removeCallbacksAndMessages(null);
        }
    }

    public /* synthetic */ C5085fn(e eVar, int i2) {
        this(eVar);
    }

    /* renamed from: h */
    private i m24654h() {
        i iVar = this.f50357w;
        return iVar != null ? iVar : !this.f50344j.isEmpty() ? this.f50344j.getLast() : this.f50358x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public long m24655i() {
        return this.f50354t.f50372c == 0 ? this.f50310D / r0.f50373d : this.f50311E;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m24656j() throws com.yandex.mobile.ads.impl.InterfaceC5853ub.b {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5085fn.m24656j():boolean");
    }

    /* renamed from: k */
    private boolean m24657k() {
        return this.f50355u != null;
    }

    /* renamed from: l */
    private void m24658l() {
        this.f50308B = 0L;
        this.f50309C = 0L;
        this.f50310D = 0L;
        this.f50311E = 0L;
        int i2 = 0;
        this.f50336b0 = false;
        this.f50312F = 0;
        this.f50358x = new i(m24654h().f50382a, m24654h().f50383b, 0L, 0L, 0);
        this.f50315I = 0L;
        this.f50357w = null;
        this.f50344j.clear();
        this.f50319M = null;
        this.f50320N = 0;
        this.f50321O = null;
        this.f50326T = false;
        this.f50325S = false;
        this.f50324R = -1;
        this.f50360z = null;
        this.f50307A = 0;
        this.f50339e.m29871j();
        while (true) {
            InterfaceC5737sb[] interfaceC5737sbArr = this.f50317K;
            if (i2 >= interfaceC5737sbArr.length) {
                return;
            }
            InterfaceC5737sb interfaceC5737sb = interfaceC5737sbArr[i2];
            interfaceC5737sb.flush();
            this.f50318L[i2] = interfaceC5737sb.mo25436b();
            i2++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: c */
    public final void mo24673c() throws InterfaceC5853ub.e {
        if (!this.f50325S && m24657k() && m24653g()) {
            if (!this.f50326T) {
                this.f50326T = true;
                this.f50343i.m29727c(m24655i());
                this.f50355u.stop();
                this.f50307A = 0;
            }
            this.f50325S = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final void flush() {
        if (m24657k()) {
            m24658l();
            if (this.f50343i.m29726b()) {
                this.f50355u.pause();
            }
            AudioTrack audioTrack = this.f50355u;
            int i2 = s91.f54530a;
            if (i2 >= 29 && audioTrack.isOffloadedPlayback()) {
                l lVar = this.f50347m;
                Objects.requireNonNull(lVar);
                lVar.m24703b(this.f50355u);
            }
            AudioTrack audioTrack2 = this.f50355u;
            this.f50355u = null;
            if (i2 < 21 && !this.f50328V) {
                this.f50329W = 0;
            }
            f fVar = this.f50353s;
            if (fVar != null) {
                this.f50354t = fVar;
                this.f50353s = null;
            }
            this.f50343i.m29729d();
            this.f50342h.m22534c();
            new a(audioTrack2).start();
        }
        this.f50349o.m24695a();
        this.f50348n.m24695a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final nq0 getPlaybackParameters() {
        return this.f50345k ? this.f50359y : m24654h().f50382a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final void pause() {
        this.f50327U = false;
        if (m24657k() && this.f50343i.m29728c()) {
            this.f50355u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final void play() {
        this.f50327U = true;
        if (m24657k()) {
            this.f50343i.m29731e();
            this.f50355u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final void reset() {
        flush();
        for (InterfaceC5737sb interfaceC5737sb : this.f50340f) {
            interfaceC5737sb.reset();
        }
        for (InterfaceC5737sb interfaceC5737sb2 : this.f50341g) {
            interfaceC5737sb2.reset();
        }
        this.f50327U = false;
        this.f50334a0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    public final void setVolume(float f2) {
        if (this.f50316J != f2) {
            this.f50316J = f2;
            if (m24657k()) {
                if (s91.f54530a >= 21) {
                    this.f50355u.setVolume(this.f50316J);
                    return;
                }
                AudioTrack audioTrack = this.f50355u;
                float f3 = this.f50316J;
                audioTrack.setStereoVolume(f3, f3);
            }
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private C5085fn(e eVar) {
        this.f50333a = eVar.f50364a;
        c cVar = eVar.f50365b;
        this.f50335b = cVar;
        int i2 = s91.f54530a;
        int i3 = 0;
        this.f50337c = i2 >= 21 && eVar.f50366c;
        this.f50345k = i2 >= 23 && eVar.f50367d;
        this.f50346l = i2 >= 29 ? eVar.f50368e : 0;
        this.f50350p = eVar.f50369f;
        C4813ak c4813ak = new C4813ak(0);
        this.f50342h = c4813ak;
        c4813ak.m22536e();
        this.f50343i = new C6020xb(new k(this, i3));
        C5186hh c5186hh = new C5186hh();
        this.f50338d = c5186hh;
        y71 y71Var = new y71();
        this.f50339e = y71Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new pw0(), c5186hh, y71Var);
        Collections.addAll(arrayList, ((g) cVar).m24693a());
        this.f50340f = (InterfaceC5737sb[]) arrayList.toArray(new InterfaceC5737sb[0]);
        this.f50341g = new InterfaceC5737sb[]{new C5249iv()};
        this.f50316J = 1.0f;
        this.f50356v = C5481nb.f52893g;
        this.f50329W = 0;
        this.f50330X = new C5174hc();
        nq0 nq0Var = nq0.f53071d;
        this.f50358x = new i(nq0Var, false, 0L, 0L, 0);
        this.f50359y = nq0Var;
        this.f50324R = -1;
        this.f50317K = new InterfaceC5737sb[0];
        this.f50318L = new ByteBuffer[0];
        this.f50344j = new ArrayDeque<>();
        this.f50348n = new j<>();
        this.f50349o = new j<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m24653g() throws com.yandex.mobile.ads.impl.InterfaceC5853ub.e {
        /*
            r9 = this;
            int r0 = r9.f50324R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f50324R = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f50324R
            com.yandex.mobile.ads.impl.sb[] r5 = r9.f50317K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo25438c()
        L1f:
            r9.m24645b(r7)
            boolean r0 = r4.mo25435a()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f50324R
            int r0 = r0 + r2
            r9.f50324R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f50321O
            if (r0 == 0) goto L3b
            r9.m24643a(r0, r7)
            java.nio.ByteBuffer r0 = r9.f50321O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f50324R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5085fn.m24653g():boolean");
    }

    /* renamed from: a */
    public final void m24665a(InterfaceC5853ub.c cVar) {
        this.f50352r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: b */
    public final int mo24670b(C5606pv c5606pv) {
        if (!"audio/raw".equals(c5606pv.f53820l)) {
            if (this.f50334a0 || !m24644a(c5606pv, this.f50356v)) {
                return this.f50333a.m27206a(c5606pv) != null ? 2 : 0;
            }
            return 2;
        }
        if (s91.m28134e(c5606pv.f53803A)) {
            int i2 = c5606pv.f53803A;
            return (i2 == 2 || (this.f50337c && i2 == 4)) ? 2 : 1;
        }
        StringBuilder m26356a = l60.m26356a("Invalid PCM encoding: ");
        m26356a.append(c5606pv.f53803A);
        d90.m23842d("DefaultAudioSink", m26356a.toString());
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: d */
    public final boolean mo24674d() {
        return m24657k() && this.f50343i.m29730d(m24655i());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: e */
    public final void mo24675e() {
        if (this.f50331Y) {
            this.f50331Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: f */
    public final void mo24676f() {
        this.f50313G = true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final void mo24666a(@Nullable uq0 uq0Var) {
        this.f50351q = uq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final boolean mo24668a(C5606pv c5606pv) {
        return mo24670b(c5606pv) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final long mo24659a(boolean z) {
        long j2;
        if (!m24657k() || this.f50314H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f50343i.m29722a(z), (m24655i() * 1000000) / this.f50354t.f50374e);
        while (!this.f50344j.isEmpty() && min >= this.f50344j.getFirst().f50385d) {
            this.f50358x = this.f50344j.remove();
        }
        i iVar = this.f50358x;
        long j3 = min - iVar.f50385d;
        if (iVar.f50382a.equals(nq0.f53071d)) {
            j2 = this.f50358x.f50384c + j3;
        } else if (this.f50344j.isEmpty()) {
            j2 = ((g) this.f50335b).m24690a(j3) + this.f50358x.f50384c;
        } else {
            i first = this.f50344j.getFirst();
            long j4 = first.f50385d - min;
            float f2 = this.f50358x.f50382a.f53072a;
            int i2 = s91.f54530a;
            if (f2 != 1.0f) {
                j4 = Math.round(j4 * f2);
            }
            j2 = first.f50384c - j4;
        }
        return ((((g) this.f50335b).m24694b() * 1000000) / this.f50354t.f50374e) + j2;
    }

    /* renamed from: c */
    public static long m24648c(C5085fn c5085fn) {
        if (c5085fn.f50354t.f50372c == 0) {
            return c5085fn.f50308B / r0.f50371b;
        }
        return c5085fn.f50309C;
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$j */
    public static final class j<T extends Exception> {

        /* renamed from: a */
        @Nullable
        private T f50386a;

        /* renamed from: b */
        private long f50387b;

        /* renamed from: a */
        public final void m24696a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f50386a == null) {
                this.f50386a = t;
                this.f50387b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f50387b) {
                T t2 = this.f50386a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f50386a;
                this.f50386a = null;
                throw t3;
            }
        }

        /* renamed from: a */
        public final void m24695a() {
            this.f50386a = null;
        }
    }

    /* renamed from: b */
    private void m24645b(long j2) throws InterfaceC5853ub.e {
        ByteBuffer byteBuffer;
        int length = this.f50317K.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f50318L[i2 - 1];
            } else {
                byteBuffer = this.f50319M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC5737sb.f54551a;
                }
            }
            if (i2 == length) {
                m24643a(byteBuffer, j2);
            } else {
                InterfaceC5737sb interfaceC5737sb = this.f50317K[i2];
                if (i2 > this.f50324R) {
                    interfaceC5737sb.mo25200a(byteBuffer);
                }
                ByteBuffer mo25436b = interfaceC5737sb.mo25436b();
                this.f50318L[i2] = mo25436b;
                if (mo25436b.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: b */
    public final void mo24671b() {
        C5220ia.m25476b(s91.f54530a >= 21);
        C5220ia.m25476b(this.f50328V);
        if (this.f50331Y) {
            return;
        }
        this.f50331Y = true;
        flush();
    }

    @RequiresApi
    /* renamed from: b */
    private void m24646b(nq0 nq0Var) {
        if (m24657k()) {
            try {
                this.f50355u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(nq0Var.f53072a).setPitch(nq0Var.f53073b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                d90.m23840b("DefaultAudioSink", "Failed to set playback params", e2);
            }
            nq0Var = new nq0(this.f50355u.getPlaybackParams().getSpeed(), this.f50355u.getPlaybackParams().getPitch());
            this.f50343i.m29723a(nq0Var.f53072a);
        }
        this.f50359y = nq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo24664a(com.yandex.mobile.ads.impl.C5606pv r32, @androidx.annotation.Nullable int[] r33) throws com.yandex.mobile.ads.impl.InterfaceC5853ub.a {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5085fn.mo24664a(com.yandex.mobile.ads.impl.pv, int[]):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: b */
    public final void mo24672b(boolean z) {
        nq0 nq0Var = m24654h().f50382a;
        i m24654h = m24654h();
        if (nq0Var.equals(m24654h.f50382a) && z == m24654h.f50383b) {
            return;
        }
        i iVar = new i(nq0Var, z, -9223372036854775807L, -9223372036854775807L, 0);
        if (m24657k()) {
            this.f50357w = iVar;
        } else {
            this.f50358x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final boolean mo24669a(ByteBuffer byteBuffer, long j2, int i2) throws InterfaceC5853ub.b, InterfaceC5853ub.e {
        long j3;
        InterfaceC5790tb.a aVar;
        int m25405a;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        ByteBuffer byteBuffer2 = this.f50319M;
        C5220ia.m25473a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f50353s != null) {
            if (!m24653g()) {
                return false;
            }
            f fVar = this.f50353s;
            f fVar2 = this.f50354t;
            Objects.requireNonNull(fVar);
            if (!(fVar2.f50372c == fVar.f50372c && fVar2.f50376g == fVar.f50376g && fVar2.f50374e == fVar.f50374e && fVar2.f50375f == fVar.f50375f && fVar2.f50373d == fVar.f50373d)) {
                if (!this.f50326T) {
                    this.f50326T = true;
                    this.f50343i.m29727c(m24655i());
                    this.f50355u.stop();
                    this.f50307A = 0;
                }
                if (mo24674d()) {
                    return false;
                }
                flush();
            } else {
                this.f50354t = this.f50353s;
                this.f50353s = null;
                if ((s91.f54530a >= 29 && this.f50355u.isOffloadedPlayback()) && this.f50346l != 3) {
                    if (this.f50355u.getPlayState() == 3) {
                        this.f50355u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f50355u;
                    C5606pv c5606pv = this.f50354t.f50370a;
                    audioTrack.setOffloadDelayPadding(c5606pv.f53804B, c5606pv.f53805C);
                    this.f50336b0 = true;
                }
            }
            m24642a(j2);
        }
        if (!m24657k()) {
            try {
                if (!m24656j()) {
                    return false;
                }
            } catch (InterfaceC5853ub.b e2) {
                if (!e2.f55434b) {
                    this.f50348n.m24696a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.f50348n.m24695a();
        if (this.f50314H) {
            this.f50315I = Math.max(0L, j2);
            this.f50313G = false;
            this.f50314H = false;
            if (this.f50345k && s91.f54530a >= 23) {
                m24646b(this.f50359y);
            }
            m24642a(j2);
            if (this.f50327U) {
                play();
            }
        }
        if (!this.f50343i.m29733f(m24655i())) {
            return false;
        }
        if (this.f50319M == null) {
            C5220ia.m25473a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar3 = this.f50354t;
            if (fVar3.f50372c != 0 && this.f50312F == 0) {
                int i6 = fVar3.f50376g;
                switch (i6) {
                    case 5:
                    case 6:
                    case 18:
                        m25405a = C5206i.m25405a(byteBuffer);
                        break;
                    case 7:
                    case 8:
                        int position = byteBuffer.position();
                        byte b4 = byteBuffer.get(position);
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i3 = (byteBuffer.get(position + 4) & 7) << 4;
                                b3 = byteBuffer.get(position + 7);
                            } else if (b4 != 31) {
                                i3 = (byteBuffer.get(position + 4) & 1) << 6;
                                b2 = byteBuffer.get(position + 5);
                            } else {
                                i3 = (byteBuffer.get(position + 5) & 7) << 4;
                                b3 = byteBuffer.get(position + 6);
                            }
                            i4 = b3 & 60;
                            m25405a = (((i4 >> 2) | i3) + 1) * 32;
                            break;
                        } else {
                            i3 = (byteBuffer.get(position + 5) & 1) << 6;
                            b2 = byteBuffer.get(position + 4);
                        }
                        i4 = b2 & 252;
                        m25405a = (((i4 >> 2) | i3) + 1) * 32;
                    case 9:
                        int position2 = byteBuffer.position();
                        int i7 = s91.f54530a;
                        int i8 = byteBuffer.getInt(position2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            i8 = Integer.reverseBytes(i8);
                        }
                        m25405a = ff0.m24576c(i8);
                        if (m25405a == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        m25405a = RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                        break;
                    case 11:
                    case 12:
                        m25405a = RecyclerView.ViewHolder.FLAG_MOVED;
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(k60.m26036a("Unexpected audio encoding: ", i6));
                    case 14:
                        int position3 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i9 = position3;
                        while (true) {
                            if (i9 <= limit) {
                                int i10 = s91.f54530a;
                                int i11 = byteBuffer.getInt(i9 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    i11 = Integer.reverseBytes(i11);
                                }
                                if ((i11 & (-2)) == -126718022) {
                                    i5 = i9 - position3;
                                } else {
                                    i9++;
                                }
                            } else {
                                i5 = -1;
                            }
                        }
                        if (i5 != -1) {
                            m25405a = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            break;
                        } else {
                            m25405a = 0;
                            break;
                        }
                    case 15:
                        m25405a = RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int position4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position4);
                        m25405a = C5369l.m26306a(new zo0(16, bArr)).f52203c;
                        break;
                }
                this.f50312F = m25405a;
                if (m25405a == 0) {
                    return true;
                }
            }
            if (this.f50357w != null) {
                if (!m24653g()) {
                    return false;
                }
                m24642a(j2);
                this.f50357w = null;
            }
            long j4 = this.f50315I;
            if (this.f50354t.f50372c == 0) {
                j3 = this.f50308B / r5.f50371b;
            } else {
                j3 = this.f50309C;
            }
            long m29870i = (((j3 - this.f50339e.m29870i()) * 1000000) / r5.f50370a.f53834z) + j4;
            if (!this.f50313G && Math.abs(m29870i - j2) > 200000) {
                InterfaceC5853ub.c cVar = this.f50352r;
                InterfaceC5853ub.d dVar = new InterfaceC5853ub.d(j2, m29870i);
                ta0.C5789a c5789a = (ta0.C5789a) cVar;
                Objects.requireNonNull(c5789a);
                d90.m23838a("MediaCodecAudioRenderer", "Audio sink error", dVar);
                aVar = ta0.this.f54993I0;
                aVar.m28566b(dVar);
                this.f50313G = true;
            }
            if (this.f50313G) {
                if (!m24653g()) {
                    return false;
                }
                long j5 = j2 - m29870i;
                this.f50315I += j5;
                this.f50313G = false;
                m24642a(j2);
                InterfaceC5853ub.c cVar2 = this.f50352r;
                if (cVar2 != null && j5 != 0) {
                    ta0.this.m28536R();
                }
            }
            if (this.f50354t.f50372c == 0) {
                this.f50308B += byteBuffer.remaining();
            } else {
                this.f50309C = (this.f50312F * i2) + this.f50309C;
            }
            this.f50319M = byteBuffer;
            this.f50320N = i2;
        }
        m24645b(j2);
        if (!this.f50319M.hasRemaining()) {
            this.f50319M = null;
            this.f50320N = 0;
            return true;
        }
        if (!this.f50343i.m29732e(m24655i())) {
            return false;
        }
        d90.m23842d("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00db, code lost:
    
        if (r15 < r14) goto L26;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m24643a(java.nio.ByteBuffer r13, long r14) throws com.yandex.mobile.ads.impl.InterfaceC5853ub.e {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5085fn.m24643a(java.nio.ByteBuffer, long):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final boolean mo24667a() {
        return !m24657k() || (this.f50325S && !mo24674d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final void mo24663a(nq0 nq0Var) {
        float f2 = nq0Var.f53072a;
        int i2 = s91.f54530a;
        nq0 nq0Var2 = new nq0(Math.max(0.1f, Math.min(f2, 8.0f)), Math.max(0.1f, Math.min(nq0Var.f53073b, 8.0f)));
        if (this.f50345k && i2 >= 23) {
            m24646b(nq0Var2);
            return;
        }
        boolean z = m24654h().f50383b;
        i m24654h = m24654h();
        if (nq0Var2.equals(m24654h.f50382a) && z == m24654h.f50383b) {
            return;
        }
        i iVar = new i(nq0Var2, z, -9223372036854775807L, -9223372036854775807L, 0);
        if (m24657k()) {
            this.f50357w = iVar;
        } else {
            this.f50358x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final void mo24662a(C5481nb c5481nb) {
        if (this.f50356v.equals(c5481nb)) {
            return;
        }
        this.f50356v = c5481nb;
        if (this.f50331Y) {
            return;
        }
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final void mo24660a(int i2) {
        if (this.f50329W != i2) {
            this.f50329W = i2;
            this.f50328V = i2 != 0;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5853ub
    /* renamed from: a */
    public final void mo24661a(C5174hc c5174hc) {
        if (this.f50330X.equals(c5174hc)) {
            return;
        }
        int i2 = c5174hc.f50897a;
        float f2 = c5174hc.f50898b;
        AudioTrack audioTrack = this.f50355u;
        if (audioTrack != null) {
            if (this.f50330X.f50897a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.f50355u.setAuxEffectSendLevel(f2);
            }
        }
        this.f50330X = c5174hc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r1 == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[LOOP:1: B:45:0x00e6->B:47:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[EDGE_INSN: B:48:0x00fb->B:49:0x00fb BREAK  A[LOOP:1: B:45:0x00e6->B:47:0x00eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m24642a(long r17) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5085fn.m24642a(long):void");
    }

    /* renamed from: a */
    private boolean m24644a(C5606pv c5606pv, C5481nb c5481nb) {
        int m28086a;
        int i2;
        int i3 = s91.f54530a;
        if (i3 < 29 || this.f50346l == 0) {
            return false;
        }
        String str = c5606pv.f53820l;
        Objects.requireNonNull(str);
        int m25141b = he0.m25141b(str, c5606pv.f53817i);
        if (m25141b == 0 || (m28086a = s91.m28086a(c5606pv.f53833y)) == 0) {
            return false;
        }
        AudioFormat build = new AudioFormat.Builder().setSampleRate(c5606pv.f53834z).setChannelMask(m28086a).setEncoding(m25141b).build();
        AudioAttributes audioAttributes = c5481nb.m26831a().f52900a;
        if (i3 >= 31) {
            i2 = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(build, audioAttributes)) {
            i2 = (i3 == 30 && s91.f54533d.startsWith("Pixel")) ? 2 : 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return ((c5606pv.f53804B != 0 || c5606pv.f53805C != 0) && (this.f50346l == 1)) ? false : true;
        }
        if (i2 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static AudioFormat m24640a(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }
}
