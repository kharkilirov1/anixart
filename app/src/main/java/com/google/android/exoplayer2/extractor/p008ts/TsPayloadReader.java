package com.google.android.exoplayer2.extractor.p008ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface TsPayloadReader {

    public static final class DvbSubtitleInfo {

        /* renamed from: a */
        public final String f11735a;

        /* renamed from: b */
        public final byte[] f11736b;

        public DvbSubtitleInfo(String str, int i2, byte[] bArr) {
            this.f11735a = str;
            this.f11736b = bArr;
        }
    }

    public static final class EsInfo {

        /* renamed from: a */
        @Nullable
        public final String f11737a;

        /* renamed from: b */
        public final List<DvbSubtitleInfo> f11738b;

        /* renamed from: c */
        public final byte[] f11739c;

        public EsInfo(int i2, @Nullable String str, @Nullable List<DvbSubtitleInfo> list, byte[] bArr) {
            this.f11737a = str;
            this.f11738b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f11739c = bArr;
        }
    }

    public interface Factory {
        @Nullable
        /* renamed from: a */
        TsPayloadReader mo6558a(int i2, EsInfo esInfo);

        /* renamed from: b */
        SparseArray<TsPayloadReader> mo6559b();
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackIdGenerator {

        /* renamed from: a */
        public final String f11740a;

        /* renamed from: b */
        public final int f11741b;

        /* renamed from: c */
        public final int f11742c;

        /* renamed from: d */
        public int f11743d;

        /* renamed from: e */
        public String f11744e;

        public TrackIdGenerator(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i2);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.f11740a = str;
            this.f11741b = i3;
            this.f11742c = i4;
            this.f11743d = Integer.MIN_VALUE;
            this.f11744e = "";
        }

        /* renamed from: a */
        public void m6589a() {
            int i2 = this.f11743d;
            int i3 = i2 == Integer.MIN_VALUE ? this.f11741b : i2 + this.f11742c;
            this.f11743d = i3;
            String str = this.f11740a;
            this.f11744e = C0576a.m4111j(C0576a.m4106e(str, 11), str, i3);
        }

        /* renamed from: b */
        public String m6590b() {
            if (this.f11743d != Integer.MIN_VALUE) {
                return this.f11744e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public int m6591c() {
            int i2 = this.f11743d;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo6578a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    /* renamed from: b */
    void mo6579b(ParsableByteArray parsableByteArray, int i2) throws ParserException;

    /* renamed from: c */
    void mo6580c();
}
