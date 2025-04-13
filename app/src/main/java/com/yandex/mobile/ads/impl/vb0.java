package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n01;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface vb0 extends n01 {

    /* renamed from: com.yandex.mobile.ads.impl.vb0$a */
    public interface InterfaceC5910a extends n01.InterfaceC5468a<vb0> {
        /* renamed from: a */
        void mo29210a(vb0 vb0Var);
    }

    /* renamed from: a */
    long mo23265a(long j2, f01 f01Var);

    /* renamed from: a */
    long mo23266a(InterfaceC5939vs[] interfaceC5939vsArr, boolean[] zArr, uy0[] uy0VarArr, boolean[] zArr2, long j2);

    /* renamed from: a */
    void mo23269a(InterfaceC5910a interfaceC5910a, long j2);

    boolean continueLoading(long j2);

    void discardBuffer(long j2, boolean z);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    x61 getTrackGroups();

    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    void reevaluateBuffer(long j2);

    long seekToUs(long j2);
}
