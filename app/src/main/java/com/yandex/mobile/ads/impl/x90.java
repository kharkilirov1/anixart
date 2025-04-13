package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.vb0;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x90 implements vb0, vb0.InterfaceC5910a {

    /* renamed from: b */
    public final bc0.C4858b f56404b;

    /* renamed from: c */
    private final long f56405c;

    /* renamed from: d */
    private final InterfaceC5476n8 f56406d;

    /* renamed from: e */
    private bc0 f56407e;

    /* renamed from: f */
    private vb0 f56408f;

    /* renamed from: g */
    @Nullable
    private vb0.InterfaceC5910a f56409g;

    /* renamed from: h */
    private boolean f56410h;

    /* renamed from: i */
    private long f56411i = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.x90$a */
    public interface InterfaceC6018a {
        /* renamed from: a */
        void m29707a(bc0.C4858b c4858b);

        /* renamed from: a */
        void m29708a(bc0.C4858b c4858b, IOException iOException);
    }

    public x90(bc0.C4858b c4858b, InterfaceC5476n8 interfaceC5476n8, long j2) {
        this.f56404b = c4858b;
        this.f56406d = interfaceC5476n8;
        this.f56405c = j2;
    }

    @Override // com.yandex.mobile.ads.impl.n01.InterfaceC5468a
    /* renamed from: a */
    public final void mo23268a(vb0 vb0Var) {
        vb0.InterfaceC5910a interfaceC5910a = this.f56409g;
        int i2 = s91.f54530a;
        interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
    }

    /* renamed from: b */
    public final long m29705b() {
        return this.f56405c;
    }

    /* renamed from: c */
    public final void m29706c() {
        if (this.f56408f != null) {
            bc0 bc0Var = this.f56407e;
            Objects.requireNonNull(bc0Var);
            bc0Var.mo22797a(this.f56408f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean continueLoading(long j2) {
        vb0 vb0Var = this.f56408f;
        return vb0Var != null && vb0Var.continueLoading(j2);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void discardBuffer(long j2, boolean z) {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        vb0Var.discardBuffer(j2, z);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getBufferedPositionUs() {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getNextLoadPositionUs() {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final x61 getTrackGroups() {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean isLoading() {
        vb0 vb0Var = this.f56408f;
        return vb0Var != null && vb0Var.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void maybeThrowPrepareError() throws IOException {
        try {
            vb0 vb0Var = this.f56408f;
            if (vb0Var != null) {
                vb0Var.maybeThrowPrepareError();
                return;
            }
            bc0 bc0Var = this.f56407e;
            if (bc0Var != null) {
                bc0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long readDiscontinuity() {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void reevaluateBuffer(long j2) {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        vb0Var.reevaluateBuffer(j2);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long seekToUs(long j2) {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.seekToUs(j2);
    }

    /* renamed from: a */
    public final void m29702a(long j2) {
        this.f56411i = j2;
    }

    /* renamed from: a */
    public final long m29701a() {
        return this.f56411i;
    }

    /* renamed from: a */
    public final void m29704a(bc0 bc0Var) {
        C5220ia.m25476b(this.f56407e == null);
        this.f56407e = bc0Var;
    }

    /* renamed from: a */
    public final void m29703a(bc0.C4858b c4858b) {
        long j2 = this.f56405c;
        long j3 = this.f56411i;
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        bc0 bc0Var = this.f56407e;
        Objects.requireNonNull(bc0Var);
        vb0 mo22790a = bc0Var.mo22790a(c4858b, this.f56406d, j2);
        this.f56408f = mo22790a;
        if (this.f56409g != null) {
            mo22790a.mo23269a(this, j2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final void mo23269a(vb0.InterfaceC5910a interfaceC5910a, long j2) {
        this.f56409g = interfaceC5910a;
        vb0 vb0Var = this.f56408f;
        if (vb0Var != null) {
            long j3 = this.f56405c;
            long j4 = this.f56411i;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
            vb0Var.mo23269a(this, j3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final long mo23266a(InterfaceC5939vs[] interfaceC5939vsArr, boolean[] zArr, uy0[] uy0VarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f56411i;
        if (j4 == -9223372036854775807L || j2 != this.f56405c) {
            j3 = j2;
        } else {
            this.f56411i = -9223372036854775807L;
            j3 = j4;
        }
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.mo23266a(interfaceC5939vsArr, zArr, uy0VarArr, zArr2, j3);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final long mo23265a(long j2, f01 f01Var) {
        vb0 vb0Var = this.f56408f;
        int i2 = s91.f54530a;
        return vb0Var.mo23265a(j2, f01Var);
    }

    @Override // com.yandex.mobile.ads.impl.vb0.InterfaceC5910a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void mo29210a(vb0 vb0Var) {
        vb0.InterfaceC5910a interfaceC5910a = this.f56409g;
        int i2 = s91.f54530a;
        interfaceC5910a.mo29210a((vb0) this);
    }
}
