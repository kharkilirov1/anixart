package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* loaded from: classes.dex */
public final class SeiReader {

    /* renamed from: a */
    public final List<Format> f11694a;

    /* renamed from: b */
    public final TrackOutput[] f11695b;

    public SeiReader(List<Format> list) {
        this.f11694a = list;
        this.f11695b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public void m6587a(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i2 = 0; i2 < this.f11695b.length; i2++) {
            trackIdGenerator.m6589a();
            TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 3);
            Format format = this.f11694a.get(i2);
            String str = format.f9659m;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            Assertions.m7514b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = format.f9648b;
            if (str2 == null) {
                str2 = trackIdGenerator.m6590b();
            }
            Format.Builder builder = new Format.Builder();
            builder.f9677a = str2;
            builder.f9687k = str;
            builder.f9680d = format.f9651e;
            builder.f9679c = format.f9650d;
            builder.f9675C = format.f9645E;
            builder.f9689m = format.f9661o;
            mo6392b.mo6399e(builder.m5833a());
            this.f11695b[i2] = mo6392b;
        }
    }
}
