package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.RunnableC0977d;
import com.google.android.exoplayer2.audio.RunnableC0978e;
import com.google.android.exoplayer2.audio.RunnableC0979f;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.tb */
/* loaded from: classes3.dex */
public interface InterfaceC5790tb {

    /* renamed from: com.yandex.mobile.ads.impl.tb$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        private final Handler f55005a;

        /* renamed from: b */
        @Nullable
        private final InterfaceC5790tb f55006b;

        public a(@Nullable Handler handler, @Nullable InterfaceC5790tb interfaceC5790tb) {
            this.f55005a = (Handler) C5220ia.m25469a(handler);
            this.f55006b = interfaceC5790tb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m28546c(C5647qm c5647qm) {
            synchronized (c5647qm) {
            }
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25712a(c5647qm);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m28549d(C5647qm c5647qm) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25717b(c5647qm);
        }

        /* renamed from: a */
        public final void m28562a(String str, long j2, long j3) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new RunnableC0978e(this, str, j2, j3, 3));
            }
        }

        /* renamed from: b */
        public final void m28565b(C5647qm c5647qm) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new aq1(this, c5647qm, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m28551d(Exception exc) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25714a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m28545b(String str, long j2, long j3) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25720b(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m28548c(Exception exc) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25718b(exc);
        }

        /* renamed from: a */
        public final void m28558a(C5606pv c5606pv, @Nullable C5873um c5873um) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new sq1(this, c5606pv, c5873um, 7));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m28539a(long j2) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25708a(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m28542b(C5606pv c5606pv, C5873um c5873um) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            Objects.requireNonNull(interfaceC5790tb);
            this.f55006b.mo25711a(c5606pv, c5873um);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m28538a(int i2, long j2, long j3) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i3 = s91.f54530a;
            interfaceC5790tb.mo25707a(i2, j2, j3);
        }

        /* renamed from: b */
        public final void m28564b(long j2) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new RunnableC0977d(this, j2, 1));
            }
        }

        /* renamed from: a */
        public final void m28561a(String str) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new hn1(this, str, 27));
            }
        }

        /* renamed from: b */
        public final void m28563b(int i2, long j2, long j3) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new cq1(this, i2, j2, j3, 1));
            }
        }

        /* renamed from: a */
        public final void m28559a(C5647qm c5647qm) {
            synchronized (c5647qm) {
            }
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new aq1(this, c5647qm, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m28544b(String str) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.mo25719b(str);
        }

        /* renamed from: b */
        public final void m28567b(boolean z) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new RunnableC0979f(this, z, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m28541a(boolean z) {
            InterfaceC5790tb interfaceC5790tb = this.f55006b;
            int i2 = s91.f54530a;
            interfaceC5790tb.onSkipSilenceEnabledChanged(z);
        }

        /* renamed from: a */
        public final void m28560a(Exception exc) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new bq1(this, exc, 0));
            }
        }

        /* renamed from: b */
        public final void m28566b(Exception exc) {
            Handler handler = this.f55005a;
            if (handler != null) {
                handler.post(new bq1(this, exc, 1));
            }
        }
    }

    /* renamed from: a */
    void mo25707a(int i2, long j2, long j3);

    /* renamed from: a */
    void mo25708a(long j2);

    /* renamed from: a */
    void mo25711a(C5606pv c5606pv, @Nullable C5873um c5873um);

    /* renamed from: a */
    void mo25712a(C5647qm c5647qm);

    /* renamed from: a */
    void mo25714a(Exception exc);

    /* renamed from: b */
    void mo25717b(C5647qm c5647qm);

    /* renamed from: b */
    void mo25718b(Exception exc);

    /* renamed from: b */
    void mo25719b(String str);

    /* renamed from: b */
    void mo25720b(String str, long j2, long j3);

    void onSkipSilenceEnabledChanged(boolean z);
}
