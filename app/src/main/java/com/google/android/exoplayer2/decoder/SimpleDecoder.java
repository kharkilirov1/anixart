package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* renamed from: a */
    public final Thread f10618a;

    /* renamed from: b */
    public final Object f10619b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f10620c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f10621d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f10622e;

    /* renamed from: f */
    public final O[] f10623f;

    /* renamed from: g */
    public int f10624g;

    /* renamed from: h */
    public int f10625h;

    /* renamed from: i */
    @Nullable
    public I f10626i;

    /* renamed from: j */
    @Nullable
    public E f10627j;

    /* renamed from: k */
    public boolean f10628k;

    /* renamed from: l */
    public boolean f10629l;

    /* renamed from: m */
    public int f10630m;

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.f10622e = iArr;
        this.f10624g = iArr.length;
        for (int i2 = 0; i2 < this.f10624g; i2++) {
            this.f10622e[i2] = new SubtitleInputBuffer();
        }
        this.f10623f = oArr;
        this.f10625h = oArr.length;
        for (int i3 = 0; i3 < this.f10625h; i3++) {
            this.f10623f[i3] = mo6255e();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.google.android.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder simpleDecoder = SimpleDecoder.this;
                Objects.requireNonNull(simpleDecoder);
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (simpleDecoder.m6258h());
            }
        };
        this.f10618a = thread;
        thread.start();
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: b */
    public Object mo6245b() throws DecoderException {
        O removeFirst;
        synchronized (this.f10619b) {
            m6260j();
            removeFirst = this.f10621d.isEmpty() ? null : this.f10621d.removeFirst();
        }
        return removeFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: c */
    public Object mo6246c() throws DecoderException {
        I i2;
        synchronized (this.f10619b) {
            m6260j();
            Assertions.m7516d(this.f10626i == null);
            int i3 = this.f10624g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f10622e;
                int i4 = i3 - 1;
                this.f10624g = i4;
                i2 = iArr[i4];
            }
            this.f10626i = i2;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    /* renamed from: d */
    public void mo6247d(Object obj) throws DecoderException {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f10619b) {
            m6260j();
            Assertions.m7513a(decoderInputBuffer == this.f10626i);
            this.f10620c.addLast(decoderInputBuffer);
            m6259i();
            this.f10626i = null;
        }
    }

    /* renamed from: e */
    public abstract O mo6255e();

    /* renamed from: f */
    public abstract E mo6256f(Throwable th);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.f10619b) {
            this.f10628k = true;
            this.f10630m = 0;
            I i2 = this.f10626i;
            if (i2 != null) {
                m6261k(i2);
                this.f10626i = null;
            }
            while (!this.f10620c.isEmpty()) {
                m6261k(this.f10620c.removeFirst());
            }
            while (!this.f10621d.isEmpty()) {
                this.f10621d.removeFirst().mo6253l();
            }
        }
    }

    @Nullable
    /* renamed from: g */
    public abstract E mo6257g(I i2, O o, boolean z);

    /* renamed from: h */
    public final boolean m6258h() throws InterruptedException {
        E mo6256f;
        synchronized (this.f10619b) {
            while (!this.f10629l) {
                if (!this.f10620c.isEmpty() && this.f10625h > 0) {
                    break;
                }
                this.f10619b.wait();
            }
            if (this.f10629l) {
                return false;
            }
            I removeFirst = this.f10620c.removeFirst();
            O[] oArr = this.f10623f;
            int i2 = this.f10625h - 1;
            this.f10625h = i2;
            O o = oArr[i2];
            boolean z = this.f10628k;
            this.f10628k = false;
            if (removeFirst.m6242j()) {
                o.m6238e(4);
            } else {
                if (removeFirst.m6241i()) {
                    o.m6238e(Integer.MIN_VALUE);
                }
                try {
                    mo6256f = mo6257g(removeFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    mo6256f = mo6256f(e2);
                } catch (RuntimeException e3) {
                    mo6256f = mo6256f(e3);
                }
                if (mo6256f != null) {
                    synchronized (this.f10619b) {
                        this.f10627j = mo6256f;
                    }
                    return false;
                }
            }
            synchronized (this.f10619b) {
                if (this.f10628k) {
                    o.mo6253l();
                } else if (o.m6241i()) {
                    this.f10630m++;
                    o.mo6253l();
                } else {
                    o.f10612d = this.f10630m;
                    this.f10630m = 0;
                    this.f10621d.addLast(o);
                }
                m6261k(removeFirst);
            }
            return true;
        }
    }

    /* renamed from: i */
    public final void m6259i() {
        if (!this.f10620c.isEmpty() && this.f10625h > 0) {
            this.f10619b.notify();
        }
    }

    /* renamed from: j */
    public final void m6260j() throws DecoderException {
        E e2 = this.f10627j;
        if (e2 != null) {
            throw e2;
        }
    }

    /* renamed from: k */
    public final void m6261k(I i2) {
        i2.mo6248l();
        I[] iArr = this.f10622e;
        int i3 = this.f10624g;
        this.f10624g = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.f10619b) {
            this.f10629l = true;
            this.f10619b.notify();
        }
        try {
            this.f10618a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
