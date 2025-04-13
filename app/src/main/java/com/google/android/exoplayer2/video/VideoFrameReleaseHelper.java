package com.google.android.exoplayer2.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.inputmethod.C0273a;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public final class VideoFrameReleaseHelper {

    /* renamed from: a */
    public final FixedFrameRateEstimator f14873a = new FixedFrameRateEstimator();

    /* renamed from: b */
    @Nullable
    public final DisplayHelper f14874b;

    /* renamed from: c */
    @Nullable
    public final VSyncSampler f14875c;

    /* renamed from: d */
    public boolean f14876d;

    /* renamed from: e */
    @Nullable
    public Surface f14877e;

    /* renamed from: f */
    public float f14878f;

    /* renamed from: g */
    public float f14879g;

    /* renamed from: h */
    public float f14880h;

    /* renamed from: i */
    public float f14881i;

    /* renamed from: j */
    public int f14882j;

    /* renamed from: k */
    public long f14883k;

    /* renamed from: l */
    public long f14884l;

    /* renamed from: m */
    public long f14885m;

    /* renamed from: n */
    public long f14886n;

    /* renamed from: o */
    public long f14887o;

    /* renamed from: p */
    public long f14888p;

    /* renamed from: q */
    public long f14889q;

    @RequiresApi
    public static final class Api30 {
        @DoNotInline
        /* renamed from: a */
        public static void m7812a(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                Log.m7585b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    public interface DisplayHelper {

        public interface Listener {
            /* renamed from: f */
            void mo2564f(@Nullable Display display);
        }

        /* renamed from: a */
        void mo7813a(Listener listener);

        /* renamed from: b */
        void mo7814b();
    }

    public static final class DisplayHelperV16 implements DisplayHelper {

        /* renamed from: a */
        public final WindowManager f14890a;

        public DisplayHelperV16(WindowManager windowManager) {
            this.f14890a = windowManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        /* renamed from: a */
        public void mo7813a(DisplayHelper.Listener listener) {
            ((C0273a) listener).mo2564f(this.f14890a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        /* renamed from: b */
        public void mo7814b() {
        }
    }

    @RequiresApi
    public static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f14891a;

        /* renamed from: b */
        @Nullable
        public DisplayHelper.Listener f14892b;

        public DisplayHelperV17(DisplayManager displayManager) {
            this.f14891a = displayManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        /* renamed from: a */
        public void mo7813a(DisplayHelper.Listener listener) {
            this.f14892b = listener;
            this.f14891a.registerDisplayListener(this, Util.m7744m());
            ((C0273a) listener).mo2564f(this.f14891a.getDisplay(0));
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        /* renamed from: b */
        public void mo7814b() {
            this.f14891a.unregisterDisplayListener(this);
            this.f14892b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            DisplayHelper.Listener listener = this.f14892b;
            if (listener == null || i2 != 0) {
                return;
            }
            listener.mo2564f(this.f14891a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        public static final VSyncSampler f14893f = new VSyncSampler();

        /* renamed from: b */
        public volatile long f14894b = -9223372036854775807L;

        /* renamed from: c */
        public final Handler f14895c;

        /* renamed from: d */
        public Choreographer f14896d;

        /* renamed from: e */
        public int f14897e;

        public VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i2 = Util.f14736a;
            Handler handler = new Handler(looper, this);
            this.f14895c = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f14894b = j2;
            Choreographer choreographer = this.f14896d;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f14896d = Choreographer.getInstance();
                return true;
            }
            if (i2 == 1) {
                int i3 = this.f14897e + 1;
                this.f14897e = i3;
                if (i3 == 1) {
                    Choreographer choreographer = this.f14896d;
                    Objects.requireNonNull(choreographer);
                    choreographer.postFrameCallback(this);
                }
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            int i4 = this.f14897e - 1;
            this.f14897e = i4;
            if (i4 == 0) {
                Choreographer choreographer2 = this.f14896d;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f14894b = -9223372036854775807L;
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoFrameReleaseHelper(@androidx.annotation.Nullable android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = new com.google.android.exoplayer2.video.FixedFrameRateEstimator
            r0.<init>()
            r3.f14873a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = com.google.android.exoplayer2.util.Util.f14736a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV17 r2 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV17
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV16 r2 = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelperV16
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f14874b = r2
            if (r2 == 0) goto L41
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper$VSyncSampler r0 = com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler.f14893f
        L41:
            r3.f14875c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f14883k = r0
            r3.f14884l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f14878f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f14881i = r4
            r4 = 0
            r3.f14882j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.VideoFrameReleaseHelper.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m7808a() {
        Surface surface;
        if (Util.f14736a < 30 || (surface = this.f14877e) == null || this.f14882j == Integer.MIN_VALUE || this.f14880h == 0.0f) {
            return;
        }
        this.f14880h = 0.0f;
        Api30.m7812a(surface, 0.0f);
    }

    /* renamed from: b */
    public final void m7809b() {
        this.f14885m = 0L;
        this.f14888p = -1L;
        this.f14886n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (java.lang.Math.abs(r0 - r10.f14879g) < (!r1 ? 0.02f : 1.0f)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r10.f14873a.f14804e >= 30) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7810c() {
        /*
            r10 = this;
            int r0 = com.google.android.exoplayer2.util.Util.f14736a
            r1 = 30
            if (r0 < r1) goto L98
            android.view.Surface r0 = r10.f14877e
            if (r0 != 0) goto Lc
            goto L98
        Lc:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r10.f14873a
            boolean r0 = r0.m7782a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L38
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r0 = r10.f14873a
            boolean r3 = r0.m7782a()
            if (r3 == 0) goto L35
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r0 = r0.f14800a
            long r5 = r0.f14809e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2e
            goto L31
        L2e:
            long r7 = r0.f14810f
            long r7 = r7 / r5
        L31:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L3a
        L35:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3a
        L38:
            float r0 = r10.f14878f
        L3a:
            float r3 = r10.f14879g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L41
            return
        L41:
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L88
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L88
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r10.f14873a
            boolean r1 = r1.m7782a()
            if (r1 == 0) goto L70
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r1 = r10.f14873a
            boolean r2 = r1.m7782a()
            if (r2 == 0) goto L60
            com.google.android.exoplayer2.video.FixedFrameRateEstimator$Matcher r1 = r1.f14800a
            long r1 = r1.f14810f
            goto L65
        L60:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            if (r1 == 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r10.f14879g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L86
            goto L91
        L86:
            r5 = 0
            goto L91
        L88:
            if (r6 == 0) goto L8b
            goto L91
        L8b:
            com.google.android.exoplayer2.video.FixedFrameRateEstimator r2 = r10.f14873a
            int r2 = r2.f14804e
            if (r2 < r1) goto L86
        L91:
            if (r5 == 0) goto L98
            r10.f14879g = r0
            r10.m7811d(r4)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.VideoFrameReleaseHelper.m7810c():void");
    }

    /* renamed from: d */
    public final void m7811d(boolean z) {
        Surface surface;
        if (Util.f14736a < 30 || (surface = this.f14877e) == null || this.f14882j == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.f14876d) {
            float f3 = this.f14879g;
            if (f3 != -1.0f) {
                f2 = this.f14881i * f3;
            }
        }
        if (z || this.f14880h != f2) {
            this.f14880h = f2;
            Api30.m7812a(surface, f2);
        }
    }
}
