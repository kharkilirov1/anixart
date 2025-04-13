package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class TsDurationReader {

    /* renamed from: a */
    public final int f11700a;

    /* renamed from: d */
    public boolean f11703d;

    /* renamed from: e */
    public boolean f11704e;

    /* renamed from: f */
    public boolean f11705f;

    /* renamed from: b */
    public final TimestampAdjuster f11701b = new TimestampAdjuster(0);

    /* renamed from: g */
    public long f11706g = -9223372036854775807L;

    /* renamed from: h */
    public long f11707h = -9223372036854775807L;

    /* renamed from: i */
    public long f11708i = -9223372036854775807L;

    /* renamed from: c */
    public final ParsableByteArray f11702c = new ParsableByteArray();

    public TsDurationReader(int i2) {
        this.f11700a = i2;
    }

    /* renamed from: a */
    public final int m6588a(ExtractorInput extractorInput) {
        this.f11702c.m7632C(Util.f14741f);
        this.f11703d = true;
        extractorInput.mo6383j();
        return 0;
    }
}
