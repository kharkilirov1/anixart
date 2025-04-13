package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseDataSource implements DataSource {

    /* renamed from: a */
    public final boolean f14335a;

    /* renamed from: b */
    public final ArrayList<TransferListener> f14336b = new ArrayList<>(1);

    /* renamed from: c */
    public int f14337c;

    /* renamed from: d */
    @Nullable
    public DataSpec f14338d;

    public BaseDataSource(boolean z) {
        this.f14335a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public final void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        if (this.f14336b.contains(transferListener)) {
            return;
        }
        this.f14336b.add(transferListener);
        this.f14337c++;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map mo6351i() {
        return Collections.emptyMap();
    }

    /* renamed from: o */
    public final void m7427o(int i2) {
        DataSpec dataSpec = this.f14338d;
        int i3 = Util.f14736a;
        for (int i4 = 0; i4 < this.f14337c; i4++) {
            this.f14336b.get(i4).mo7443g(this, dataSpec, this.f14335a, i2);
        }
    }

    /* renamed from: p */
    public final void m7428p() {
        DataSpec dataSpec = this.f14338d;
        int i2 = Util.f14736a;
        for (int i3 = 0; i3 < this.f14337c; i3++) {
            this.f14336b.get(i3).mo7441b(this, dataSpec, this.f14335a);
        }
        this.f14338d = null;
    }

    /* renamed from: q */
    public final void m7429q(DataSpec dataSpec) {
        for (int i2 = 0; i2 < this.f14337c; i2++) {
            this.f14336b.get(i2).mo7444i(this, dataSpec, this.f14335a);
        }
    }

    /* renamed from: r */
    public final void m7430r(DataSpec dataSpec) {
        this.f14338d = dataSpec;
        for (int i2 = 0; i2 < this.f14337c; i2++) {
            this.f14336b.get(i2).mo7442c(this, dataSpec, this.f14335a);
        }
    }
}
