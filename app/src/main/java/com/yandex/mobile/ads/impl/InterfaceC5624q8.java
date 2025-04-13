package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.q8 */
/* loaded from: classes3.dex */
public interface InterfaceC5624q8 {

    /* renamed from: com.yandex.mobile.ads.impl.q8$a */
    public static final class a {

        /* renamed from: a */
        public final long f53956a;

        /* renamed from: b */
        public final k61 f53957b;

        /* renamed from: c */
        public final int f53958c;

        /* renamed from: d */
        @Nullable
        public final bc0.C4858b f53959d;

        /* renamed from: e */
        public final long f53960e;

        /* renamed from: f */
        public final k61 f53961f;

        /* renamed from: g */
        public final int f53962g;

        /* renamed from: h */
        @Nullable
        public final bc0.C4858b f53963h;

        /* renamed from: i */
        public final long f53964i;

        /* renamed from: j */
        public final long f53965j;

        public a(long j2, k61 k61Var, int i2, @Nullable bc0.C4858b c4858b, long j3, k61 k61Var2, int i3, @Nullable bc0.C4858b c4858b2, long j4, long j5) {
            this.f53956a = j2;
            this.f53957b = k61Var;
            this.f53958c = i2;
            this.f53959d = c4858b;
            this.f53960e = j3;
            this.f53961f = k61Var2;
            this.f53962g = i3;
            this.f53963h = c4858b2;
            this.f53964i = j4;
            this.f53965j = j5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f53956a == aVar.f53956a && this.f53958c == aVar.f53958c && this.f53960e == aVar.f53960e && this.f53962g == aVar.f53962g && this.f53964i == aVar.f53964i && this.f53965j == aVar.f53965j && gn0.m24948a(this.f53957b, aVar.f53957b) && gn0.m24948a(this.f53959d, aVar.f53959d) && gn0.m24948a(this.f53961f, aVar.f53961f) && gn0.m24948a(this.f53963h, aVar.f53963h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f53956a), this.f53957b, Integer.valueOf(this.f53958c), this.f53959d, Long.valueOf(this.f53960e), this.f53961f, Integer.valueOf(this.f53962g), this.f53963h, Long.valueOf(this.f53964i), Long.valueOf(this.f53965j)});
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q8$b */
    public static final class b {

        /* renamed from: a */
        private final C5201hv f53966a;

        /* renamed from: b */
        private final SparseArray<a> f53967b;

        public b(C5201hv c5201hv, SparseArray<a> sparseArray) {
            this.f53966a = c5201hv;
            SparseArray<a> sparseArray2 = new SparseArray<>(c5201hv.m25374a());
            for (int i2 = 0; i2 < c5201hv.m25374a(); i2++) {
                int m25376b = c5201hv.m25376b(i2);
                sparseArray2.append(m25376b, (a) C5220ia.m25469a(sparseArray.get(m25376b)));
            }
            this.f53967b = sparseArray2;
        }

        /* renamed from: a */
        public final boolean m27651a(int i2) {
            return this.f53966a.m25375a(i2);
        }

        /* renamed from: b */
        public final int m27652b(int i2) {
            return this.f53966a.m25376b(i2);
        }

        /* renamed from: c */
        public final a m27653c(int i2) {
            a aVar = this.f53967b.get(i2);
            Objects.requireNonNull(aVar);
            return aVar;
        }

        /* renamed from: a */
        public final int m27650a() {
            return this.f53966a.m25374a();
        }
    }
}
