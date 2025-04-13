package com.google.android.exoplayer2.extractor.p008ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {

    /* renamed from: a */
    public final int f11458a;

    /* renamed from: b */
    public final List<Format> f11459b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        ImmutableList m11627D = ImmutableList.m11627D();
        this.f11458a = 0;
        this.f11459b = m11627D;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    @Nullable
    /* renamed from: a */
    public TsPayloadReader mo6558a(int i2, TsPayloadReader.EsInfo esInfo) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new PesReader(new MpegAudioReader(esInfo.f11737a));
            }
            if (i2 == 21) {
                return new PesReader(new Id3Reader());
            }
            if (i2 == 27) {
                if (m6561d(4)) {
                    return null;
                }
                return new PesReader(new H264Reader(new SeiReader(m6560c(esInfo)), m6561d(1), m6561d(8)));
            }
            if (i2 == 36) {
                return new PesReader(new H265Reader(new SeiReader(m6560c(esInfo))));
            }
            if (i2 == 89) {
                return new PesReader(new DvbSubtitleReader(esInfo.f11738b));
            }
            if (i2 != 138) {
                if (i2 == 172) {
                    return new PesReader(new Ac4Reader(esInfo.f11737a));
                }
                if (i2 == 257) {
                    return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                }
                if (i2 == 134) {
                    if (m6561d(16)) {
                        return null;
                    }
                    return new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                }
                if (i2 != 135) {
                    switch (i2) {
                        case 15:
                            if (!m6561d(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!m6561d(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 130:
                                    if (!m6561d(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new PesReader(new Ac3Reader(esInfo.f11737a));
            }
            return new PesReader(new DtsReader(esInfo.f11737a));
        }
        return new PesReader(new H262Reader(new UserDataReader(m6560c(esInfo))));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    /* renamed from: b */
    public SparseArray<TsPayloadReader> mo6559b() {
        return new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* renamed from: c */
    public final List<Format> m6560c(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i2;
        if (m6561d(32)) {
            return this.f11459b;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.f11739c);
        ArrayList arrayList = this.f11459b;
        while (parsableByteArray.m7637a() > 0) {
            int m7657u = parsableByteArray.m7657u();
            int m7657u2 = parsableByteArray.f14699b + parsableByteArray.m7657u();
            if (m7657u == 134) {
                arrayList = new ArrayList();
                int m7657u3 = parsableByteArray.m7657u() & 31;
                for (int i3 = 0; i3 < m7657u3; i3++) {
                    String m7654r = parsableByteArray.m7654r(3);
                    int m7657u4 = parsableByteArray.m7657u();
                    boolean z = (m7657u4 & 128) != 0;
                    if (z) {
                        i2 = m7657u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte m7657u5 = (byte) parsableByteArray.m7657u();
                    parsableByteArray.m7636G(1);
                    List<byte[]> list = null;
                    if (z) {
                        list = Collections.singletonList((m7657u5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.Builder builder = new Format.Builder();
                    builder.f9687k = str;
                    builder.f9679c = m7654r;
                    builder.f9675C = i2;
                    builder.f9689m = list;
                    arrayList.add(builder.m5833a());
                }
            }
            parsableByteArray.m7635F(m7657u2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m6561d(int i2) {
        return (i2 & this.f11458a) != 0;
    }

    public DefaultTsPayloadReaderFactory(int i2) {
        ImmutableList m11627D = ImmutableList.m11627D();
        this.f11458a = i2;
        this.f11459b = m11627D;
    }

    public DefaultTsPayloadReaderFactory(int i2, List<Format> list) {
        this.f11458a = i2;
        this.f11459b = list;
    }
}
