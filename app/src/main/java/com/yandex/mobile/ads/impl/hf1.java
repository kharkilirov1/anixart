package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.RunnableC0978e;
import com.google.android.exoplayer2.video.RunnableC1181c;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface hf1 {
    /* renamed from: a */
    void mo25150a(int i2, long j2);

    /* renamed from: a */
    void mo25151a(lf1 lf1Var);

    /* renamed from: a */
    void mo25152a(Object obj, long j2);

    /* renamed from: a */
    void mo25153a(String str);

    /* renamed from: a */
    void mo25154a(String str, long j2, long j3);

    /* renamed from: b */
    void mo25155b(int i2, long j2);

    /* renamed from: b */
    void mo25156b(C5606pv c5606pv, @Nullable C5873um c5873um);

    /* renamed from: c */
    void mo25157c(C5647qm c5647qm);

    /* renamed from: c */
    void mo25158c(Exception exc);

    /* renamed from: d */
    void mo25159d(C5647qm c5647qm);

    /* renamed from: com.yandex.mobile.ads.impl.hf1$a */
    public static final class C5183a {

        /* renamed from: a */
        @Nullable
        private final Handler f50927a;

        /* renamed from: b */
        @Nullable
        private final hf1 f50928b;

        public C5183a(@Nullable Handler handler, @Nullable hf1 hf1Var) {
            this.f50927a = (Handler) C5220ia.m25469a(handler);
            this.f50928b = hf1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m25173d(C5647qm c5647qm) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25159d(c5647qm);
        }

        /* renamed from: a */
        public final void m25185a(String str, long j2, long j3) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new RunnableC0978e(this, str, j2, j3, 2));
            }
        }

        /* renamed from: b */
        public final void m25187b(C5647qm c5647qm) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new ro1(this, c5647qm, 1));
            }
        }

        /* renamed from: c */
        public final void m25189c(int i2, long j2) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new so1(this, j2, i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m25169b(String str, long j2, long j3) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25154a(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m25171c(C5647qm c5647qm) {
            synchronized (c5647qm) {
            }
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25157c(c5647qm);
        }

        /* renamed from: a */
        public final void m25182a(C5606pv c5606pv, @Nullable C5873um c5873um) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new sq1(this, c5606pv, c5873um, 3));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m25167b(C5606pv c5606pv, C5873um c5873um) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            Objects.requireNonNull(hf1Var);
            this.f50928b.mo25156b(c5606pv, c5873um);
        }

        /* renamed from: a */
        public final void m25180a(int i2, long j2) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new so1(this, i2, j2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m25160a(long j2, int i2) {
            hf1 hf1Var = this.f50928b;
            int i3 = s91.f54530a;
            hf1Var.mo25150a(i2, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m25165b(int i2, long j2) {
            hf1 hf1Var = this.f50928b;
            int i3 = s91.f54530a;
            hf1Var.mo25155b(i2, j2);
        }

        /* renamed from: b */
        public final void m25186b(lf1 lf1Var) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new hn1(this, lf1Var, 17));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m25162a(lf1 lf1Var) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25151a(lf1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m25168b(String str) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25153a(str);
        }

        /* renamed from: a */
        public final void m25181a(Surface surface) {
            if (this.f50927a != null) {
                this.f50927a.post(new RunnableC1181c(this, surface, SystemClock.elapsedRealtime(), 1));
            }
        }

        /* renamed from: b */
        public final void m25188b(Exception exc) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new hn1(this, exc, 15));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m25164a(Object obj, long j2) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25152a(obj, j2);
        }

        /* renamed from: a */
        public final void m25184a(String str) {
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new hn1(this, str, 16));
            }
        }

        /* renamed from: a */
        public final void m25183a(C5647qm c5647qm) {
            synchronized (c5647qm) {
            }
            Handler handler = this.f50927a;
            if (handler != null) {
                handler.post(new ro1(this, c5647qm, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m25163a(Exception exc) {
            hf1 hf1Var = this.f50928b;
            int i2 = s91.f54530a;
            hf1Var.mo25158c(exc);
        }
    }
}
