package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class SlidingPercentile {

    /* renamed from: a */
    public final int f14510a;

    /* renamed from: e */
    public int f14514e;

    /* renamed from: f */
    public int f14515f;

    /* renamed from: g */
    public int f14516g;

    /* renamed from: c */
    public final Sample[] f14512c = new Sample[5];

    /* renamed from: b */
    public final ArrayList<Sample> f14511b = new ArrayList<>();

    /* renamed from: d */
    public int f14513d = -1;

    public static class Sample {

        /* renamed from: a */
        public int f14517a;

        /* renamed from: b */
        public int f14518b;

        /* renamed from: c */
        public float f14519c;

        public Sample() {
        }

        public Sample(C11631 c11631) {
        }
    }

    public SlidingPercentile(int i2) {
        this.f14510a = i2;
    }

    /* renamed from: a */
    public void m7481a(int i2, float f2) {
        Sample sample;
        if (this.f14513d != 1) {
            Collections.sort(this.f14511b, C1170d.f14608c);
            this.f14513d = 1;
        }
        int i3 = this.f14516g;
        if (i3 > 0) {
            Sample[] sampleArr = this.f14512c;
            int i4 = i3 - 1;
            this.f14516g = i4;
            sample = sampleArr[i4];
        } else {
            sample = new Sample(null);
        }
        int i5 = this.f14514e;
        this.f14514e = i5 + 1;
        sample.f14517a = i5;
        sample.f14518b = i2;
        sample.f14519c = f2;
        this.f14511b.add(sample);
        this.f14515f += i2;
        while (true) {
            int i6 = this.f14515f;
            int i7 = this.f14510a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            Sample sample2 = this.f14511b.get(0);
            int i9 = sample2.f14518b;
            if (i9 <= i8) {
                this.f14515f -= i9;
                this.f14511b.remove(0);
                int i10 = this.f14516g;
                if (i10 < 5) {
                    Sample[] sampleArr2 = this.f14512c;
                    this.f14516g = i10 + 1;
                    sampleArr2[i10] = sample2;
                }
            } else {
                sample2.f14518b = i9 - i8;
                this.f14515f -= i8;
            }
        }
    }

    /* renamed from: b */
    public float m7482b(float f2) {
        if (this.f14513d != 0) {
            Collections.sort(this.f14511b, C1170d.f14609d);
            this.f14513d = 0;
        }
        float f3 = f2 * this.f14515f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14511b.size(); i3++) {
            Sample sample = this.f14511b.get(i3);
            i2 += sample.f14518b;
            if (i2 >= f3) {
                return sample.f14519c;
            }
        }
        if (this.f14511b.isEmpty()) {
            return Float.NaN;
        }
        return this.f14511b.get(r5.size() - 1).f14519c;
    }
}
