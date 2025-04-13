package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ne1 {

    /* renamed from: a */
    private final C5941vu f52936a = new C5941vu();

    /* renamed from: b */
    @Nullable
    private final InterfaceC5488b f52937b;

    /* renamed from: c */
    @Nullable
    private final ChoreographerFrameCallbackC5491e f52938c;

    /* renamed from: d */
    private boolean f52939d;

    /* renamed from: e */
    @Nullable
    private Surface f52940e;

    /* renamed from: f */
    private float f52941f;

    /* renamed from: g */
    private float f52942g;

    /* renamed from: h */
    private float f52943h;

    /* renamed from: i */
    private float f52944i;

    /* renamed from: j */
    private int f52945j;

    /* renamed from: k */
    private long f52946k;

    /* renamed from: l */
    private long f52947l;

    /* renamed from: m */
    private long f52948m;

    /* renamed from: n */
    private long f52949n;

    /* renamed from: o */
    private long f52950o;

    /* renamed from: p */
    private long f52951p;

    /* renamed from: q */
    private long f52952q;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.ne1$a */
    public static final class C5487a {
        @DoNotInline
        /* renamed from: a */
        public static void m26872a(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                d90.m23838a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ne1$b */
    public interface InterfaceC5488b {

        /* renamed from: com.yandex.mobile.ads.impl.ne1$b$a */
        public interface a {
            /* renamed from: a */
            void mo24219a(@Nullable Display display);
        }

        /* renamed from: a */
        void mo26873a();

        /* renamed from: a */
        void mo26874a(a aVar);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ne1$e */
    public static final class ChoreographerFrameCallbackC5491e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final ChoreographerFrameCallbackC5491e f52956f = new ChoreographerFrameCallbackC5491e();

        /* renamed from: b */
        public volatile long f52957b = -9223372036854775807L;

        /* renamed from: c */
        private final Handler f52958c;

        /* renamed from: d */
        private Choreographer f52959d;

        /* renamed from: e */
        private int f52960e;

        private ChoreographerFrameCallbackC5491e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler m28100a = s91.m28100a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f52958c = m28100a;
            m28100a.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public static ChoreographerFrameCallbackC5491e m26877b() {
            return f52956f;
        }

        /* renamed from: a */
        public final void m26878a() {
            this.f52958c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public final void m26879c() {
            this.f52958c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j2) {
            this.f52957b = j2;
            Choreographer choreographer = this.f52959d;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                try {
                    this.f52959d = Choreographer.getInstance();
                } catch (RuntimeException e2) {
                    d90.m23840b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
                }
                return true;
            }
            if (i2 == 1) {
                Choreographer choreographer = this.f52959d;
                if (choreographer != null) {
                    int i3 = this.f52960e + 1;
                    this.f52960e = i3;
                    if (i3 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f52959d;
            if (choreographer2 != null) {
                int i4 = this.f52960e - 1;
                this.f52960e = i4;
                if (i4 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f52957b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public ne1(@Nullable Context context) {
        InterfaceC5488b m26858a = m26858a(context);
        this.f52937b = m26858a;
        this.f52938c = m26858a != null ? ChoreographerFrameCallbackC5491e.m26877b() : null;
        this.f52946k = -9223372036854775807L;
        this.f52947l = -9223372036854775807L;
        this.f52941f = -1.0f;
        this.f52944i = 1.0f;
        this.f52945j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r8.f52942g) >= (r8.f52936a.m29268e() && (r8.f52936a.m29267d() > 5000000000L ? 1 : (r8.f52936a.m29267d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r8.f52936a.m29266c() >= 30) goto L36;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26862d() {
        /*
            r8 = this;
            int r0 = com.yandex.mobile.ads.impl.s91.f54530a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r8.f52940e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            com.yandex.mobile.ads.impl.vu r0 = r8.f52936a
            boolean r0 = r0.m29268e()
            if (r0 == 0) goto L1b
            com.yandex.mobile.ads.impl.vu r0 = r8.f52936a
            float r0 = r0.m29265b()
            goto L1d
        L1b:
            float r0 = r8.f52941f
        L1d:
            float r2 = r8.f52942g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L5f
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L5f
            com.yandex.mobile.ads.impl.vu r1 = r8.f52936a
            boolean r1 = r1.m29268e()
            if (r1 == 0) goto L49
            com.yandex.mobile.ads.impl.vu r1 = r8.f52936a
            long r1 = r1.m29267d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 < 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r8.f52942g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L6b
            goto L6c
        L5f:
            if (r6 == 0) goto L62
            goto L6c
        L62:
            com.yandex.mobile.ads.impl.vu r2 = r8.f52936a
            int r2 = r2.m29266c()
            if (r2 < r1) goto L6b
            goto L6c
        L6b:
            r3 = 0
        L6c:
            if (r3 == 0) goto L73
            r8.f52942g = r0
            r8.m26861a(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ne1.m26862d():void");
    }

    /* renamed from: a */
    public final void m26866a(int i2) {
        if (this.f52945j == i2) {
            return;
        }
        this.f52945j = i2;
        m26861a(true);
    }

    /* renamed from: b */
    public final void m26868b() {
        this.f52939d = true;
        this.f52948m = 0L;
        this.f52951p = -1L;
        this.f52949n = -1L;
        if (this.f52937b != null) {
            ChoreographerFrameCallbackC5491e choreographerFrameCallbackC5491e = this.f52938c;
            Objects.requireNonNull(choreographerFrameCallbackC5491e);
            choreographerFrameCallbackC5491e.m26878a();
            this.f52937b.mo26874a(new en1(this, 12));
        }
        m26861a(false);
    }

    /* renamed from: c */
    public final void m26871c() {
        Surface surface;
        this.f52939d = false;
        InterfaceC5488b interfaceC5488b = this.f52937b;
        if (interfaceC5488b != null) {
            interfaceC5488b.mo26873a();
            ChoreographerFrameCallbackC5491e choreographerFrameCallbackC5491e = this.f52938c;
            Objects.requireNonNull(choreographerFrameCallbackC5491e);
            choreographerFrameCallbackC5491e.m26879c();
        }
        if (s91.f54530a < 30 || (surface = this.f52940e) == null || this.f52945j == Integer.MIN_VALUE || this.f52943h == 0.0f) {
            return;
        }
        this.f52943h = 0.0f;
        C5487a.m26872a(surface, 0.0f);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ne1$c */
    public static final class C5489c implements InterfaceC5488b {

        /* renamed from: a */
        private final WindowManager f52953a;

        private C5489c(WindowManager windowManager) {
            this.f52953a = windowManager;
        }

        @Nullable
        /* renamed from: a */
        public static C5489c m26875a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C5489c(windowManager);
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.ne1.InterfaceC5488b
        /* renamed from: a */
        public final void mo26873a() {
        }

        @Override // com.yandex.mobile.ads.impl.ne1.InterfaceC5488b
        /* renamed from: a */
        public final void mo26874a(InterfaceC5488b.a aVar) {
            aVar.mo24219a(this.f52953a.getDefaultDisplay());
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.ne1$d */
    public static final class C5490d implements InterfaceC5488b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f52954a;

        /* renamed from: b */
        @Nullable
        private InterfaceC5488b.a f52955b;

        private C5490d(DisplayManager displayManager) {
            this.f52954a = displayManager;
        }

        @Nullable
        /* renamed from: a */
        public static C5490d m26876a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C5490d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i2) {
            InterfaceC5488b.a aVar = this.f52955b;
            if (aVar == null || i2 != 0) {
                return;
            }
            aVar.mo24219a(this.f52954a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i2) {
        }

        @Override // com.yandex.mobile.ads.impl.ne1.InterfaceC5488b
        /* renamed from: a */
        public final void mo26874a(InterfaceC5488b.a aVar) {
            this.f52955b = aVar;
            this.f52954a.registerDisplayListener(this, s91.m28099a((Handler.Callback) null));
            aVar.mo24219a(this.f52954a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.ne1.InterfaceC5488b
        /* renamed from: a */
        public final void mo26873a() {
            this.f52954a.unregisterDisplayListener(this);
            this.f52955b = null;
        }
    }

    /* renamed from: a */
    public final void m26867a(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        Surface surface2 = this.f52940e;
        if (surface2 == surface) {
            return;
        }
        if (s91.f54530a >= 30 && surface2 != null && this.f52945j != Integer.MIN_VALUE && this.f52943h != 0.0f) {
            this.f52943h = 0.0f;
            C5487a.m26872a(surface2, 0.0f);
        }
        this.f52940e = surface;
        m26861a(true);
    }

    /* renamed from: a */
    public final void m26865a(float f2) {
        this.f52941f = f2;
        this.f52936a.m29269f();
        m26862d();
    }

    /* renamed from: b */
    public final void m26869b(float f2) {
        this.f52944i = f2;
        this.f52948m = 0L;
        this.f52951p = -1L;
        this.f52949n = -1L;
        m26861a(false);
    }

    /* renamed from: a */
    public final long m26863a(long j2) {
        long j3;
        if (this.f52951p != -1 && this.f52936a.m29268e()) {
            long m29263a = this.f52952q + ((long) (((this.f52948m - this.f52951p) * this.f52936a.m29263a()) / this.f52944i));
            if (Math.abs(j2 - m29263a) <= 20000000) {
                j2 = m29263a;
            } else {
                this.f52948m = 0L;
                this.f52951p = -1L;
                this.f52949n = -1L;
            }
        }
        this.f52949n = this.f52948m;
        this.f52950o = j2;
        ChoreographerFrameCallbackC5491e choreographerFrameCallbackC5491e = this.f52938c;
        if (choreographerFrameCallbackC5491e == null || this.f52946k == -9223372036854775807L) {
            return j2;
        }
        long j4 = choreographerFrameCallbackC5491e.f52957b;
        if (j4 == -9223372036854775807L) {
            return j2;
        }
        long j5 = this.f52946k;
        long j6 = (((j2 - j4) / j5) * j5) + j4;
        if (j2 <= j6) {
            j3 = j6 - j5;
        } else {
            j3 = j6;
            j6 = j5 + j6;
        }
        if (j6 - j2 >= j2 - j3) {
            j6 = j3;
        }
        return j6 - this.f52947l;
    }

    /* renamed from: b */
    public final void m26870b(long j2) {
        long j3 = this.f52949n;
        if (j3 != -1) {
            this.f52951p = j3;
            this.f52952q = this.f52950o;
        }
        this.f52948m++;
        this.f52936a.m29264a(j2 * 1000);
        m26862d();
    }

    /* renamed from: a */
    public final void m26864a() {
        this.f52948m = 0L;
        this.f52951p = -1L;
        this.f52949n = -1L;
    }

    /* renamed from: a */
    private void m26861a(boolean z) {
        Surface surface;
        if (s91.f54530a < 30 || (surface = this.f52940e) == null || this.f52945j == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.f52939d) {
            float f3 = this.f52942g;
            if (f3 != -1.0f) {
                f2 = this.f52944i * f3;
            }
        }
        if (z || this.f52943h != f2) {
            this.f52943h = f2;
            C5487a.m26872a(surface, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26859a(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f52946k = refreshRate;
            this.f52947l = (refreshRate * 80) / 100;
        } else {
            d90.m23842d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f52946k = -9223372036854775807L;
            this.f52947l = -9223372036854775807L;
        }
    }

    @Nullable
    /* renamed from: a */
    private static InterfaceC5488b m26858a(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        C5490d m26876a = s91.f54530a >= 17 ? C5490d.m26876a(applicationContext) : null;
        return m26876a == null ? C5489c.m26875a(applicationContext) : m26876a;
    }
}
