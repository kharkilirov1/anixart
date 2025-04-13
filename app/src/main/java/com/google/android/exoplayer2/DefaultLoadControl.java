package com.google.android.exoplayer2;

import android.util.Log;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public class DefaultLoadControl implements LoadControl {

    /* renamed from: a */
    public final DefaultAllocator f9483a;

    /* renamed from: b */
    public final long f9484b;

    /* renamed from: c */
    public final long f9485c;

    /* renamed from: d */
    public final long f9486d;

    /* renamed from: e */
    public final long f9487e;

    /* renamed from: f */
    public final int f9488f;

    /* renamed from: g */
    public final boolean f9489g;

    /* renamed from: h */
    public final long f9490h;

    /* renamed from: i */
    public final boolean f9491i;

    /* renamed from: j */
    public int f9492j;

    /* renamed from: k */
    public boolean f9493k;

    public static final class Builder {
    }

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator(true, TextBuffer.MAX_SEGMENT_LEN);
        m5686j(2500, 0, "bufferForPlaybackMs", "0");
        m5686j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m5686j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m5686j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m5686j(50000, 50000, "maxBufferMs", "minBufferMs");
        m5686j(0, 0, "backBufferDurationMs", "0");
        this.f9483a = defaultAllocator;
        long j2 = 50000;
        this.f9484b = Util.m7717P(j2);
        this.f9485c = Util.m7717P(j2);
        this.f9486d = Util.m7717P(2500);
        this.f9487e = Util.m7717P(5000);
        this.f9488f = -1;
        this.f9492j = 13107200;
        this.f9489g = false;
        this.f9490h = Util.m7717P(0);
        this.f9491i = false;
    }

    /* renamed from: j */
    public static void m5686j(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        Assertions.m7514b(z, sb.toString());
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: a */
    public void mo5687a() {
        m5696k(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: b */
    public boolean mo5688b() {
        return this.f9491i;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: c */
    public long mo5689c() {
        return this.f9490h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: d */
    public void mo5690d(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int i2 = this.f9488f;
        if (i2 == -1) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < rendererArr.length) {
                    if (exoTrackSelectionArr[i3] != null) {
                        switch (rendererArr[i3].mo5661g()) {
                            case -2:
                                i5 = 0;
                                i4 += i5;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i5 = 144310272;
                                i4 += i5;
                                break;
                            case 1:
                                i4 += i5;
                                break;
                            case 2:
                                i5 = 131072000;
                                i4 += i5;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i5 = 131072;
                                i4 += i5;
                                break;
                        }
                    }
                    i3++;
                } else {
                    i2 = Math.max(13107200, i4);
                }
            }
        }
        this.f9492j = i2;
        this.f9483a.m7439f(i2);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: e */
    public void mo5691e() {
        m5696k(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: f */
    public boolean mo5692f(long j2, float f2, boolean z, long j3) {
        int i2;
        long m7704C = Util.m7704C(j2, f2);
        long j4 = z ? this.f9487e : this.f9486d;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        if (j4 > 0 && m7704C < j4) {
            if (!this.f9489g) {
                DefaultAllocator defaultAllocator = this.f9483a;
                synchronized (defaultAllocator) {
                    i2 = defaultAllocator.f14387f * defaultAllocator.f14383b;
                }
                if (i2 >= this.f9492j) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: g */
    public boolean mo5693g(long j2, long j3, float f2) {
        int i2;
        DefaultAllocator defaultAllocator = this.f9483a;
        synchronized (defaultAllocator) {
            i2 = defaultAllocator.f14387f * defaultAllocator.f14383b;
        }
        boolean z = true;
        boolean z2 = i2 >= this.f9492j;
        long j4 = this.f9484b;
        if (f2 > 1.0f) {
            j4 = Math.min(Util.m7756y(j4, f2), this.f9485c);
        }
        if (j3 < Math.max(j4, 500000L)) {
            if (!this.f9489g && z2) {
                z = false;
            }
            this.f9493k = z;
            if (!z && j3 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f9485c || z2) {
            this.f9493k = false;
        }
        return this.f9493k;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: h */
    public Allocator mo5694h() {
        return this.f9483a;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    /* renamed from: i */
    public void mo5695i() {
        m5696k(true);
    }

    /* renamed from: k */
    public final void m5696k(boolean z) {
        int i2 = this.f9488f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f9492j = i2;
        this.f9493k = false;
        if (z) {
            DefaultAllocator defaultAllocator = this.f9483a;
            synchronized (defaultAllocator) {
                if (defaultAllocator.f14382a) {
                    defaultAllocator.m7439f(0);
                }
            }
        }
    }
}
