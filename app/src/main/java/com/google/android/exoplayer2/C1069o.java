package com.google.android.exoplayer2;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.util.Clock;
import com.google.common.base.Supplier;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C1069o implements Supplier {

    /* renamed from: b */
    public final /* synthetic */ int f12143b;

    /* renamed from: c */
    public final /* synthetic */ Object f12144c;

    public /* synthetic */ C1069o(Object obj, int i2) {
        this.f12143b = i2;
        this.f12144c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f12143b) {
            case 0:
                return Boolean.valueOf(((ExoPlayerImplInternal) this.f12144c).f9567A);
            case 1:
                return (RenderersFactory) this.f12144c;
            default:
                Clock clock = ((ExoPlayer.Builder) this.f12144c).f9514b;
                Objects.requireNonNull(clock);
                return new AnalyticsCollector(clock);
        }
    }
}
