package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

/* loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f8531a = new FitCenter();

    /* renamed from: b */
    public static final DownsampleStrategy f8532b;

    /* renamed from: c */
    public static final DownsampleStrategy f8533c;

    /* renamed from: d */
    public static final DownsampleStrategy f8534d;

    /* renamed from: e */
    public static final DownsampleStrategy f8535e;

    /* renamed from: f */
    public static final Option<DownsampleStrategy> f8536f;

    public static class AtLeast extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            if (Math.min(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class AtMost extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            int ceil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    public static class CenterInside extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, DownsampleStrategy.f8531a.mo5169b(i2, i3, i4, i5));
        }
    }

    public static class CenterOutside extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    public static class FitCenter extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            return Math.min(i4 / i2, i5 / i3);
        }
    }

    public static class None extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo5169b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    static {
        CenterOutside centerOutside = new CenterOutside();
        f8532b = centerOutside;
        f8533c = new CenterInside();
        f8534d = new None();
        f8535e = centerOutside;
        f8536f = Option.m4958a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", centerOutside);
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo5168a(int i2, int i3, int i4, int i5);

    /* renamed from: b */
    public abstract float mo5169b(int i2, int i3, int i4, int i5);
}
