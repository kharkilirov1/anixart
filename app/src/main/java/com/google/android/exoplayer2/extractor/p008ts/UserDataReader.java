package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: classes.dex */
final class UserDataReader {

    /* renamed from: a */
    public final List<Format> f11745a;

    /* renamed from: b */
    public final TrackOutput[] f11746b;

    public UserDataReader(List<Format> list) {
        this.f11745a = list;
        this.f11746b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public void m6593a(long j2, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.m7637a() < 9) {
            return;
        }
        int m7642f = parsableByteArray.m7642f();
        int m7642f2 = parsableByteArray.m7642f();
        int m7657u = parsableByteArray.m7657u();
        if (m7642f == 434 && m7642f2 == 1195456820 && m7657u == 3) {
            CeaUtil.m6373b(j2, parsableByteArray, this.f11746b);
        }
    }

    /* renamed from: b */
    public void m6594b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i2 = 0; i2 < this.f11746b.length; i2++) {
            trackIdGenerator.m6589a();
            TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 3);
            Format format = this.f11745a.get(i2);
            String str = format.f9659m;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            Assertions.m7514b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            Format.Builder builder = new Format.Builder();
            builder.f9677a = trackIdGenerator.m6590b();
            builder.f9687k = str;
            builder.f9680d = format.f9651e;
            builder.f9679c = format.f9650d;
            builder.f9675C = format.f9645E;
            builder.f9689m = format.f9661o;
            mo6392b.mo6399e(builder.m5833a());
            this.f11746b[i2] = mo6392b;
        }
    }
}
