package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.SlidingPercentile;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.upstream.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1170d implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C1170d f14608c = new C1170d(0);

    /* renamed from: d */
    public static final /* synthetic */ C1170d f14609d = new C1170d(1);

    /* renamed from: b */
    public final /* synthetic */ int f14610b;

    public /* synthetic */ C1170d(int i2) {
        this.f14610b = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14610b) {
            case 0:
                return ((SlidingPercentile.Sample) obj).f14517a - ((SlidingPercentile.Sample) obj2).f14517a;
            default:
                return Float.compare(((SlidingPercentile.Sample) obj).f14519c, ((SlidingPercentile.Sample) obj2).f14519c);
        }
    }
}
