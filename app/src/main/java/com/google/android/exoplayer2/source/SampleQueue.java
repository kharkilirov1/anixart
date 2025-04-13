package com.google.android.exoplayer2.source;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleDataQueue;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public class SampleQueue implements TrackOutput {

    /* renamed from: A */
    public boolean f12487A;

    /* renamed from: B */
    @Nullable
    public Format f12488B;

    /* renamed from: C */
    @Nullable
    public Format f12489C;

    /* renamed from: D */
    public int f12490D;

    /* renamed from: E */
    public boolean f12491E;

    /* renamed from: F */
    public boolean f12492F;

    /* renamed from: G */
    public long f12493G;

    /* renamed from: H */
    public boolean f12494H;

    /* renamed from: a */
    public final SampleDataQueue f12495a;

    /* renamed from: d */
    @Nullable
    public final DrmSessionManager f12498d;

    /* renamed from: e */
    @Nullable
    public final DrmSessionEventListener.EventDispatcher f12499e;

    /* renamed from: f */
    @Nullable
    public final Looper f12500f;

    /* renamed from: g */
    @Nullable
    public UpstreamFormatChangedListener f12501g;

    /* renamed from: h */
    @Nullable
    public Format f12502h;

    /* renamed from: i */
    @Nullable
    public DrmSession f12503i;

    /* renamed from: q */
    public int f12511q;

    /* renamed from: r */
    public int f12512r;

    /* renamed from: s */
    public int f12513s;

    /* renamed from: t */
    public int f12514t;

    /* renamed from: x */
    public boolean f12518x;

    /* renamed from: b */
    public final SampleExtrasHolder f12496b = new SampleExtrasHolder();

    /* renamed from: j */
    public int f12504j = 1000;

    /* renamed from: k */
    public int[] f12505k = new int[1000];

    /* renamed from: l */
    public long[] f12506l = new long[1000];

    /* renamed from: o */
    public long[] f12509o = new long[1000];

    /* renamed from: n */
    public int[] f12508n = new int[1000];

    /* renamed from: m */
    public int[] f12507m = new int[1000];

    /* renamed from: p */
    public TrackOutput.CryptoData[] f12510p = new TrackOutput.CryptoData[1000];

    /* renamed from: c */
    public final SpannedData<SharedSampleMetadata> f12497c = new SpannedData<>(C1123j.f13401c);

    /* renamed from: u */
    public long f12515u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f12516v = Long.MIN_VALUE;

    /* renamed from: w */
    public long f12517w = Long.MIN_VALUE;

    /* renamed from: z */
    public boolean f12520z = true;

    /* renamed from: y */
    public boolean f12519y = true;

    public static final class SampleExtrasHolder {

        /* renamed from: a */
        public int f12521a;

        /* renamed from: b */
        public long f12522b;

        /* renamed from: c */
        @Nullable
        public TrackOutput.CryptoData f12523c;
    }

    public static final class SharedSampleMetadata {

        /* renamed from: a */
        public final Format f12524a;

        /* renamed from: b */
        public final DrmSessionManager.DrmSessionReference f12525b;

        public SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference, C10881 c10881) {
            this.f12524a = format;
            this.f12525b = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
        /* renamed from: a */
        void mo6850a(Format format);
    }

    public SampleQueue(Allocator allocator, @Nullable Looper looper, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.f12500f = looper;
        this.f12498d = drmSessionManager;
        this.f12499e = eventDispatcher;
        this.f12495a = new SampleDataQueue(allocator);
    }

    /* renamed from: A */
    public final synchronized int m6880A() {
        return m6904v() ? this.f12505k[m6900r(this.f12514t)] : this.f12490D;
    }

    @CallSuper
    /* renamed from: B */
    public void m6881B() {
        m6891i();
        DrmSession drmSession = this.f12503i;
        if (drmSession != null) {
            drmSession.mo6263b(this.f12499e);
            this.f12503i = null;
            this.f12502h = null;
        }
    }

    @CallSuper
    /* renamed from: C */
    public int m6882C(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2, boolean z) {
        int i3;
        boolean z2 = (i2 & 2) != 0;
        SampleExtrasHolder sampleExtrasHolder = this.f12496b;
        synchronized (this) {
            decoderInputBuffer.f10606e = false;
            i3 = -5;
            if (m6904v()) {
                Format format = this.f12497c.m6919b(m6899q()).f12524a;
                if (!z2 && format == this.f12502h) {
                    int m6900r = m6900r(this.f12514t);
                    if (m6906x(m6900r)) {
                        decoderInputBuffer.f10580b = this.f12508n[m6900r];
                        long j2 = this.f12509o[m6900r];
                        decoderInputBuffer.f10607f = j2;
                        if (j2 < this.f12515u) {
                            decoderInputBuffer.m6238e(Integer.MIN_VALUE);
                        }
                        sampleExtrasHolder.f12521a = this.f12507m[m6900r];
                        sampleExtrasHolder.f12522b = this.f12506l[m6900r];
                        sampleExtrasHolder.f12523c = this.f12510p[m6900r];
                        i3 = -4;
                    } else {
                        decoderInputBuffer.f10606e = true;
                        i3 = -3;
                    }
                }
                m6908z(format, formatHolder);
            } else {
                if (!z && !this.f12518x) {
                    Format format2 = this.f12489C;
                    if (format2 == null || (!z2 && format2 == this.f12502h)) {
                        i3 = -3;
                    } else {
                        m6908z(format2, formatHolder);
                    }
                }
                decoderInputBuffer.f10580b = 4;
                i3 = -4;
            }
        }
        if (i3 == -4 && !decoderInputBuffer.m6242j()) {
            boolean z3 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                if (z3) {
                    SampleDataQueue sampleDataQueue = this.f12495a;
                    SampleDataQueue.m6874g(sampleDataQueue.f12479e, decoderInputBuffer, this.f12496b, sampleDataQueue.f12477c);
                } else {
                    SampleDataQueue sampleDataQueue2 = this.f12495a;
                    sampleDataQueue2.f12479e = SampleDataQueue.m6874g(sampleDataQueue2.f12479e, decoderInputBuffer, this.f12496b, sampleDataQueue2.f12477c);
                }
            }
            if (!z3) {
                this.f12514t++;
            }
        }
        return i3;
    }

    @CallSuper
    /* renamed from: D */
    public void m6883D() {
        m6884E(true);
        DrmSession drmSession = this.f12503i;
        if (drmSession != null) {
            drmSession.mo6263b(this.f12499e);
            this.f12503i = null;
            this.f12502h = null;
        }
    }

    @CallSuper
    /* renamed from: E */
    public void m6884E(boolean z) {
        SampleDataQueue sampleDataQueue = this.f12495a;
        sampleDataQueue.m6875a(sampleDataQueue.f12478d);
        SampleDataQueue.AllocationNode allocationNode = new SampleDataQueue.AllocationNode(0L, sampleDataQueue.f12476b);
        sampleDataQueue.f12478d = allocationNode;
        sampleDataQueue.f12479e = allocationNode;
        sampleDataQueue.f12480f = allocationNode;
        sampleDataQueue.f12481g = 0L;
        sampleDataQueue.f12475a.mo7423c();
        this.f12511q = 0;
        this.f12512r = 0;
        this.f12513s = 0;
        this.f12514t = 0;
        this.f12519y = true;
        this.f12515u = Long.MIN_VALUE;
        this.f12516v = Long.MIN_VALUE;
        this.f12517w = Long.MIN_VALUE;
        this.f12518x = false;
        SpannedData<SharedSampleMetadata> spannedData = this.f12497c;
        for (int i2 = 0; i2 < spannedData.f12586b.size(); i2++) {
            spannedData.f12587c.accept(spannedData.f12586b.valueAt(i2));
        }
        spannedData.f12585a = -1;
        spannedData.f12586b.clear();
        if (z) {
            this.f12488B = null;
            this.f12489C = null;
            this.f12520z = true;
        }
    }

    /* renamed from: F */
    public final synchronized void m6885F() {
        this.f12514t = 0;
        SampleDataQueue sampleDataQueue = this.f12495a;
        sampleDataQueue.f12479e = sampleDataQueue.f12478d;
    }

    /* renamed from: G */
    public final synchronized boolean m6886G(long j2, boolean z) {
        m6885F();
        int m6900r = m6900r(this.f12514t);
        if (m6904v() && j2 >= this.f12509o[m6900r] && (j2 <= this.f12517w || z)) {
            int m6895m = m6895m(m6900r, this.f12511q - this.f12514t, j2, true);
            if (m6895m == -1) {
                return false;
            }
            this.f12515u = j2;
            this.f12514t += m6895m;
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final void m6887H(long j2) {
        if (this.f12493G != j2) {
            this.f12493G = j2;
            this.f12487A = true;
        }
    }

    /* renamed from: I */
    public final synchronized void m6888I(int i2) {
        boolean z;
        if (i2 >= 0) {
            try {
                if (this.f12514t + i2 <= this.f12511q) {
                    z = true;
                    Assertions.m7513a(z);
                    this.f12514t += i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        Assertions.m7513a(z);
        this.f12514t += i2;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: a */
    public final int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
        SampleDataQueue sampleDataQueue = this.f12495a;
        int m6878d = sampleDataQueue.m6878d(i2);
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f12480f;
        int read = dataReader.read(allocationNode.f12485d.f14324a, allocationNode.m6879a(sampleDataQueue.f12481g), m6878d);
        if (read != -1) {
            sampleDataQueue.m6877c(read);
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: b */
    public /* synthetic */ int mo6396b(DataReader dataReader, int i2, boolean z) {
        return C1008a.m6434a(this, dataReader, i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: c */
    public /* synthetic */ void mo6397c(ParsableByteArray parsableByteArray, int i2) {
        C1008a.m6435b(this, parsableByteArray, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: d */
    public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
        DrmSessionManager.DrmSessionReference drmSessionReference;
        boolean z;
        if (this.f12487A) {
            Format format = this.f12488B;
            Assertions.m7518f(format);
            mo6399e(format);
        }
        int i5 = i2 & 1;
        boolean z2 = i5 != 0;
        if (this.f12519y) {
            if (!z2) {
                return;
            } else {
                this.f12519y = false;
            }
        }
        long j3 = j2 + this.f12493G;
        if (this.f12491E) {
            if (j3 < this.f12515u) {
                return;
            }
            if (i5 == 0) {
                if (!this.f12492F) {
                    String valueOf = String.valueOf(this.f12489C);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.f12492F = true;
                }
                i2 |= 1;
            }
        }
        if (this.f12494H) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f12511q == 0) {
                    z = j3 > this.f12516v;
                } else {
                    synchronized (this) {
                        long max = Math.max(this.f12516v, m6898p(this.f12514t));
                        if (max >= j3) {
                            z = false;
                        } else {
                            int i6 = this.f12511q;
                            int m6900r = m6900r(i6 - 1);
                            while (i6 > this.f12514t && this.f12509o[m6900r] >= j3) {
                                i6--;
                                m6900r--;
                                if (m6900r == -1) {
                                    m6900r = this.f12504j - 1;
                                }
                            }
                            m6893k(this.f12512r + i6);
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return;
            } else {
                this.f12494H = false;
            }
        }
        long j4 = (this.f12495a.f12481g - i3) - i4;
        synchronized (this) {
            int i7 = this.f12511q;
            if (i7 > 0) {
                int m6900r2 = m6900r(i7 - 1);
                Assertions.m7513a(this.f12506l[m6900r2] + ((long) this.f12507m[m6900r2]) <= j4);
            }
            this.f12518x = (536870912 & i2) != 0;
            this.f12517w = Math.max(this.f12517w, j3);
            int m6900r3 = m6900r(this.f12511q);
            this.f12509o[m6900r3] = j3;
            this.f12506l[m6900r3] = j4;
            this.f12507m[m6900r3] = i3;
            this.f12508n[m6900r3] = i2;
            this.f12510p[m6900r3] = cryptoData;
            this.f12505k[m6900r3] = this.f12490D;
            if ((this.f12497c.f12586b.size() == 0) || !this.f12497c.m6920c().f12524a.equals(this.f12489C)) {
                DrmSessionManager drmSessionManager = this.f12498d;
                if (drmSessionManager != null) {
                    Looper looper = this.f12500f;
                    Objects.requireNonNull(looper);
                    drmSessionReference = drmSessionManager.mo6285a(looper, this.f12499e, this.f12489C);
                } else {
                    drmSessionReference = DrmSessionManager.DrmSessionReference.f10724v1;
                }
                SpannedData<SharedSampleMetadata> spannedData = this.f12497c;
                int m6903u = m6903u();
                Format format2 = this.f12489C;
                Objects.requireNonNull(format2);
                spannedData.m6918a(m6903u, new SharedSampleMetadata(format2, drmSessionReference, null));
            }
            int i8 = this.f12511q + 1;
            this.f12511q = i8;
            int i9 = this.f12504j;
            if (i8 == i9) {
                int i10 = i9 + 1000;
                int[] iArr = new int[i10];
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i10];
                int i11 = this.f12513s;
                int i12 = i9 - i11;
                System.arraycopy(this.f12506l, i11, jArr, 0, i12);
                System.arraycopy(this.f12509o, this.f12513s, jArr2, 0, i12);
                System.arraycopy(this.f12508n, this.f12513s, iArr2, 0, i12);
                System.arraycopy(this.f12507m, this.f12513s, iArr3, 0, i12);
                System.arraycopy(this.f12510p, this.f12513s, cryptoDataArr, 0, i12);
                System.arraycopy(this.f12505k, this.f12513s, iArr, 0, i12);
                int i13 = this.f12513s;
                System.arraycopy(this.f12506l, 0, jArr, i12, i13);
                System.arraycopy(this.f12509o, 0, jArr2, i12, i13);
                System.arraycopy(this.f12508n, 0, iArr2, i12, i13);
                System.arraycopy(this.f12507m, 0, iArr3, i12, i13);
                System.arraycopy(this.f12510p, 0, cryptoDataArr, i12, i13);
                System.arraycopy(this.f12505k, 0, iArr, i12, i13);
                this.f12506l = jArr;
                this.f12509o = jArr2;
                this.f12508n = iArr2;
                this.f12507m = iArr3;
                this.f12510p = cryptoDataArr;
                this.f12505k = iArr;
                this.f12513s = 0;
                this.f12504j = i10;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: e */
    public final void mo6399e(Format format) {
        Format mo6896n = mo6896n(format);
        boolean z = false;
        this.f12487A = false;
        this.f12488B = format;
        synchronized (this) {
            this.f12520z = false;
            if (!Util.m7728a(mo6896n, this.f12489C)) {
                if ((this.f12497c.f12586b.size() == 0) || !this.f12497c.m6920c().f12524a.equals(mo6896n)) {
                    this.f12489C = mo6896n;
                } else {
                    this.f12489C = this.f12497c.m6920c().f12524a;
                }
                Format format2 = this.f12489C;
                this.f12491E = MimeTypes.m7593a(format2.f9659m, format2.f9656j);
                this.f12492F = false;
                z = true;
            }
        }
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.f12501g;
        if (upstreamFormatChangedListener == null || !z) {
            return;
        }
        upstreamFormatChangedListener.mo6850a(mo6896n);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: f */
    public final void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3) {
        SampleDataQueue sampleDataQueue = this.f12495a;
        Objects.requireNonNull(sampleDataQueue);
        while (i2 > 0) {
            int m6878d = sampleDataQueue.m6878d(i2);
            SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f12480f;
            parsableByteArray.m7641e(allocationNode.f12485d.f14324a, allocationNode.m6879a(sampleDataQueue.f12481g), m6878d);
            i2 -= m6878d;
            sampleDataQueue.m6877c(m6878d);
        }
    }

    @GuardedBy
    /* renamed from: g */
    public final long m6889g(int i2) {
        this.f12516v = Math.max(this.f12516v, m6898p(i2));
        this.f12511q -= i2;
        int i3 = this.f12512r + i2;
        this.f12512r = i3;
        int i4 = this.f12513s + i2;
        this.f12513s = i4;
        int i5 = this.f12504j;
        if (i4 >= i5) {
            this.f12513s = i4 - i5;
        }
        int i6 = this.f12514t - i2;
        this.f12514t = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.f12514t = 0;
        }
        SpannedData<SharedSampleMetadata> spannedData = this.f12497c;
        while (i7 < spannedData.f12586b.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < spannedData.f12586b.keyAt(i8)) {
                break;
            }
            spannedData.f12587c.accept(spannedData.f12586b.valueAt(i7));
            spannedData.f12586b.removeAt(i7);
            int i9 = spannedData.f12585a;
            if (i9 > 0) {
                spannedData.f12585a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.f12511q != 0) {
            return this.f12506l[this.f12513s];
        }
        int i10 = this.f12513s;
        if (i10 == 0) {
            i10 = this.f12504j;
        }
        return this.f12506l[i10 - 1] + this.f12507m[r6];
    }

    /* renamed from: h */
    public final void m6890h(long j2, boolean z, boolean z2) {
        long j3;
        int i2;
        SampleDataQueue sampleDataQueue = this.f12495a;
        synchronized (this) {
            int i3 = this.f12511q;
            j3 = -1;
            if (i3 != 0) {
                long[] jArr = this.f12509o;
                int i4 = this.f12513s;
                if (j2 >= jArr[i4]) {
                    if (z2 && (i2 = this.f12514t) != i3) {
                        i3 = i2 + 1;
                    }
                    int m6895m = m6895m(i4, i3, j2, z);
                    if (m6895m != -1) {
                        j3 = m6889g(m6895m);
                    }
                }
            }
        }
        sampleDataQueue.m6876b(j3);
    }

    /* renamed from: i */
    public final void m6891i() {
        long m6889g;
        SampleDataQueue sampleDataQueue = this.f12495a;
        synchronized (this) {
            int i2 = this.f12511q;
            m6889g = i2 == 0 ? -1L : m6889g(i2);
        }
        sampleDataQueue.m6876b(m6889g);
    }

    /* renamed from: j */
    public final void m6892j() {
        long m6889g;
        SampleDataQueue sampleDataQueue = this.f12495a;
        synchronized (this) {
            int i2 = this.f12514t;
            m6889g = i2 == 0 ? -1L : m6889g(i2);
        }
        sampleDataQueue.m6876b(m6889g);
    }

    /* renamed from: k */
    public final long m6893k(int i2) {
        int m6903u = m6903u() - i2;
        boolean z = false;
        Assertions.m7513a(m6903u >= 0 && m6903u <= this.f12511q - this.f12514t);
        int i3 = this.f12511q - m6903u;
        this.f12511q = i3;
        this.f12517w = Math.max(this.f12516v, m6898p(i3));
        if (m6903u == 0 && this.f12518x) {
            z = true;
        }
        this.f12518x = z;
        SpannedData<SharedSampleMetadata> spannedData = this.f12497c;
        for (int size = spannedData.f12586b.size() - 1; size >= 0 && i2 < spannedData.f12586b.keyAt(size); size--) {
            spannedData.f12587c.accept(spannedData.f12586b.valueAt(size));
            spannedData.f12586b.removeAt(size);
        }
        spannedData.f12585a = spannedData.f12586b.size() > 0 ? Math.min(spannedData.f12585a, spannedData.f12586b.size() - 1) : -1;
        int i4 = this.f12511q;
        if (i4 == 0) {
            return 0L;
        }
        return this.f12506l[m6900r(i4 - 1)] + this.f12507m[r9];
    }

    /* renamed from: l */
    public final void m6894l(int i2) {
        SampleDataQueue sampleDataQueue = this.f12495a;
        long m6893k = m6893k(i2);
        sampleDataQueue.f12481g = m6893k;
        if (m6893k != 0) {
            SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f12478d;
            if (m6893k != allocationNode.f12482a) {
                while (sampleDataQueue.f12481g > allocationNode.f12483b) {
                    allocationNode = allocationNode.f12486e;
                }
                SampleDataQueue.AllocationNode allocationNode2 = allocationNode.f12486e;
                sampleDataQueue.m6875a(allocationNode2);
                SampleDataQueue.AllocationNode allocationNode3 = new SampleDataQueue.AllocationNode(allocationNode.f12483b, sampleDataQueue.f12476b);
                allocationNode.f12486e = allocationNode3;
                if (sampleDataQueue.f12481g == allocationNode.f12483b) {
                    allocationNode = allocationNode3;
                }
                sampleDataQueue.f12480f = allocationNode;
                if (sampleDataQueue.f12479e == allocationNode2) {
                    sampleDataQueue.f12479e = allocationNode3;
                    return;
                }
                return;
            }
        }
        sampleDataQueue.m6875a(sampleDataQueue.f12478d);
        SampleDataQueue.AllocationNode allocationNode4 = new SampleDataQueue.AllocationNode(sampleDataQueue.f12481g, sampleDataQueue.f12476b);
        sampleDataQueue.f12478d = allocationNode4;
        sampleDataQueue.f12479e = allocationNode4;
        sampleDataQueue.f12480f = allocationNode4;
    }

    /* renamed from: m */
    public final int m6895m(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long[] jArr = this.f12509o;
            if (jArr[i2] > j2) {
                return i4;
            }
            if (!z || (this.f12508n[i2] & 1) != 0) {
                if (jArr[i2] == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f12504j) {
                i2 = 0;
            }
        }
        return i4;
    }

    @CallSuper
    /* renamed from: n */
    public Format mo6896n(Format format) {
        if (this.f12493G == 0 || format.f9663q == Long.MAX_VALUE) {
            return format;
        }
        Format.Builder m5829b = format.m5829b();
        m5829b.f9691o = format.f9663q + this.f12493G;
        return m5829b.m5833a();
    }

    /* renamed from: o */
    public final synchronized long m6897o() {
        return this.f12517w;
    }

    /* renamed from: p */
    public final long m6898p(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int m6900r = m6900r(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.f12509o[m6900r]);
            if ((this.f12508n[m6900r] & 1) != 0) {
                break;
            }
            m6900r--;
            if (m6900r == -1) {
                m6900r = this.f12504j - 1;
            }
        }
        return j2;
    }

    /* renamed from: q */
    public final int m6899q() {
        return this.f12512r + this.f12514t;
    }

    /* renamed from: r */
    public final int m6900r(int i2) {
        int i3 = this.f12513s + i2;
        int i4 = this.f12504j;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* renamed from: s */
    public final synchronized int m6901s(long j2, boolean z) {
        int m6900r = m6900r(this.f12514t);
        if (m6904v() && j2 >= this.f12509o[m6900r]) {
            if (j2 > this.f12517w && z) {
                return this.f12511q - this.f12514t;
            }
            int m6895m = m6895m(m6900r, this.f12511q - this.f12514t, j2, true);
            if (m6895m == -1) {
                return 0;
            }
            return m6895m;
        }
        return 0;
    }

    @Nullable
    /* renamed from: t */
    public final synchronized Format m6902t() {
        return this.f12520z ? null : this.f12489C;
    }

    /* renamed from: u */
    public final int m6903u() {
        return this.f12512r + this.f12511q;
    }

    /* renamed from: v */
    public final boolean m6904v() {
        return this.f12514t != this.f12511q;
    }

    @CallSuper
    /* renamed from: w */
    public synchronized boolean m6905w(boolean z) {
        Format format;
        boolean z2 = true;
        if (m6904v()) {
            if (this.f12497c.m6919b(m6899q()).f12524a != this.f12502h) {
                return true;
            }
            return m6906x(m6900r(this.f12514t));
        }
        if (!z && !this.f12518x && ((format = this.f12489C) == null || format == this.f12502h)) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: x */
    public final boolean m6906x(int i2) {
        DrmSession drmSession = this.f12503i;
        return drmSession == null || drmSession.getState() == 4 || ((this.f12508n[i2] & 1073741824) == 0 && this.f12503i.mo6265d());
    }

    @CallSuper
    /* renamed from: y */
    public void m6907y() throws IOException {
        DrmSession drmSession = this.f12503i;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException mo6267f = this.f12503i.mo6267f();
        Objects.requireNonNull(mo6267f);
        throw mo6267f;
    }

    /* renamed from: z */
    public final void m6908z(Format format, FormatHolder formatHolder) {
        Format format2 = this.f12502h;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.f9662p;
        this.f12502h = format;
        DrmInitData drmInitData2 = format.f9662p;
        DrmSessionManager drmSessionManager = this.f12498d;
        formatHolder.f9704b = drmSessionManager != null ? format.m5830c(drmSessionManager.mo6287c(format)) : format;
        formatHolder.f9703a = this.f12503i;
        if (this.f12498d == null) {
            return;
        }
        if (z || !Util.m7728a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f12503i;
            DrmSessionManager drmSessionManager2 = this.f12498d;
            Looper looper = this.f12500f;
            Objects.requireNonNull(looper);
            DrmSession mo6286b = drmSessionManager2.mo6286b(looper, this.f12499e, format);
            this.f12503i = mo6286b;
            formatHolder.f9703a = mo6286b;
            if (drmSession != null) {
                drmSession.mo6263b(this.f12499e);
            }
        }
    }
}
