package com.yandex.mobile.ads.exo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5660qx;
import com.yandex.mobile.ads.impl.RunnableC6136zq;
import com.yandex.mobile.ads.impl.d90;
import java.util.Objects;

@RequiresApi
/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d */
    private static int f48257d;

    /* renamed from: e */
    private static boolean f48258e;

    /* renamed from: a */
    public final boolean f48259a;

    /* renamed from: b */
    private final HandlerThreadC4784a f48260b;

    /* renamed from: c */
    private boolean f48261c;

    public /* synthetic */ PlaceholderSurface(HandlerThreadC4784a handlerThreadC4784a, SurfaceTexture surfaceTexture, boolean z, int i2) {
        this(handlerThreadC4784a, surfaceTexture, z);
    }

    /* renamed from: a */
    public static synchronized boolean m22329a(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            if (!f48258e) {
                f48257d = C5660qx.m27794a(context) ? C5660qx.m27796c() ? 1 : 2 : 0;
                f48258e = true;
            }
            z = f48257d != 0;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f48260b) {
            if (!this.f48261c) {
                this.f48260b.m22332a();
                this.f48261c = true;
            }
        }
    }

    private PlaceholderSurface(HandlerThreadC4784a handlerThreadC4784a, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f48260b = handlerThreadC4784a;
        this.f48259a = z;
    }

    /* renamed from: a */
    public static PlaceholderSurface m22328a(Context context, boolean z) {
        C5220ia.m25476b(!z || m22329a(context));
        return new HandlerThreadC4784a().m22331a(z ? f48257d : 0);
    }

    /* renamed from: com.yandex.mobile.ads.exo.video.PlaceholderSurface$a */
    public static class HandlerThreadC4784a extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        private RunnableC6136zq f48262b;

        /* renamed from: c */
        private Handler f48263c;

        /* renamed from: d */
        @Nullable
        private Error f48264d;

        /* renamed from: e */
        @Nullable
        private RuntimeException f48265e;

        /* renamed from: f */
        @Nullable
        private PlaceholderSurface f48266f;

        public HandlerThreadC4784a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: b */
        private void m22330b(int i2) {
            Objects.requireNonNull(this.f48262b);
            this.f48262b.m30278a(i2);
            this.f48266f = new PlaceholderSurface(this, this.f48262b.m30277a(), i2 != 0, 0);
        }

        /* renamed from: a */
        public final PlaceholderSurface m22331a(int i2) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f48263c = handler;
            this.f48262b = new RunnableC6136zq(handler);
            synchronized (this) {
                z = false;
                this.f48263c.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f48266f == null && this.f48265e == null && this.f48264d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f48265e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f48264d;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.f48266f;
            Objects.requireNonNull(placeholderSurface);
            return placeholderSurface;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        Objects.requireNonNull(this.f48262b);
                        this.f48262b.m30279b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m22330b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    d90.m23838a("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f48264d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    d90.m23838a("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f48265e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public final void m22332a() {
            Objects.requireNonNull(this.f48263c);
            this.f48263c.sendEmptyMessage(2);
        }
    }
}
