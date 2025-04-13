package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class PlayerMessage {

    /* renamed from: a */
    public final Target f9965a;

    /* renamed from: b */
    public final Sender f9966b;

    /* renamed from: c */
    public final Clock f9967c;

    /* renamed from: d */
    public final Timeline f9968d;

    /* renamed from: e */
    public int f9969e;

    /* renamed from: f */
    @Nullable
    public Object f9970f;

    /* renamed from: g */
    public Looper f9971g;

    /* renamed from: h */
    public int f9972h;

    /* renamed from: i */
    public boolean f9973i;

    /* renamed from: j */
    public boolean f9974j;

    /* renamed from: k */
    public boolean f9975k;

    public interface Sender {
        /* renamed from: b */
        void mo5778b(PlayerMessage playerMessage);
    }

    public interface Target {
        /* renamed from: q */
        void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i2, Clock clock, Looper looper) {
        this.f9966b = sender;
        this.f9965a = target;
        this.f9968d = timeline;
        this.f9971g = looper;
        this.f9967c = clock;
        this.f9972h = i2;
    }

    /* renamed from: a */
    public synchronized boolean m5930a(long j2) throws InterruptedException, TimeoutException {
        boolean z;
        Assertions.m7516d(this.f9973i);
        Assertions.m7516d(this.f9971g.getThread() != Thread.currentThread());
        long mo7527a = this.f9967c.mo7527a() + j2;
        while (true) {
            z = this.f9975k;
            if (z || j2 <= 0) {
                break;
            }
            this.f9967c.mo7530d();
            wait(j2);
            j2 = mo7527a - this.f9967c.mo7527a();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f9974j;
    }

    /* renamed from: b */
    public synchronized boolean m5931b() {
        return false;
    }

    /* renamed from: c */
    public synchronized void m5932c(boolean z) {
        this.f9974j = z | this.f9974j;
        this.f9975k = true;
        notifyAll();
    }

    /* renamed from: d */
    public PlayerMessage m5933d() {
        Assertions.m7516d(!this.f9973i);
        this.f9973i = true;
        this.f9966b.mo5778b(this);
        return this;
    }

    /* renamed from: e */
    public PlayerMessage m5934e(@Nullable Object obj) {
        Assertions.m7516d(!this.f9973i);
        this.f9970f = obj;
        return this;
    }

    /* renamed from: f */
    public PlayerMessage m5935f(int i2) {
        Assertions.m7516d(!this.f9973i);
        this.f9969e = i2;
        return this;
    }
}
