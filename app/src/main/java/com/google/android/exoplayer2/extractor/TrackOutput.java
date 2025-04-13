package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface TrackOutput {

    public static final class CryptoData {

        /* renamed from: a */
        public final int f10879a;

        /* renamed from: b */
        public final byte[] f10880b;

        /* renamed from: c */
        public final int f10881c;

        /* renamed from: d */
        public final int f10882d;

        public CryptoData(int i2, byte[] bArr, int i3, int i4) {
            this.f10879a = i2;
            this.f10880b = bArr;
            this.f10881c = i3;
            this.f10882d = i4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CryptoData.class != obj.getClass()) {
                return false;
            }
            CryptoData cryptoData = (CryptoData) obj;
            return this.f10879a == cryptoData.f10879a && this.f10881c == cryptoData.f10881c && this.f10882d == cryptoData.f10882d && Arrays.equals(this.f10880b, cryptoData.f10880b);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f10880b) + (this.f10879a * 31)) * 31) + this.f10881c) * 31) + this.f10882d;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    /* renamed from: a */
    int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException;

    /* renamed from: b */
    int mo6396b(DataReader dataReader, int i2, boolean z) throws IOException;

    /* renamed from: c */
    void mo6397c(ParsableByteArray parsableByteArray, int i2);

    /* renamed from: d */
    void mo6398d(long j2, int i2, int i3, int i4, @Nullable CryptoData cryptoData);

    /* renamed from: e */
    void mo6399e(Format format);

    /* renamed from: f */
    void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3);
}
