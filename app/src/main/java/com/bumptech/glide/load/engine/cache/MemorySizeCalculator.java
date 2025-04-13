package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MemorySizeCalculator {

    /* renamed from: a */
    public final int f8389a;

    /* renamed from: b */
    public final int f8390b;

    /* renamed from: c */
    public final Context f8391c;

    /* renamed from: d */
    public final int f8392d;

    public static final class Builder {

        /* renamed from: e */
        public static final int f8393e;

        /* renamed from: a */
        public final Context f8394a;

        /* renamed from: b */
        public ActivityManager f8395b;

        /* renamed from: c */
        public ScreenDimensions f8396c;

        /* renamed from: d */
        public float f8397d;

        static {
            f8393e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public Builder(Context context) {
            this.f8397d = f8393e;
            this.f8394a = context;
            this.f8395b = (ActivityManager) context.getSystemService("activity");
            this.f8396c = new DisplayMetricsScreenDimensions(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f8395b.isLowRamDevice()) {
                return;
            }
            this.f8397d = 0.0f;
        }
    }

    public static final class DisplayMetricsScreenDimensions implements ScreenDimensions {

        /* renamed from: a */
        public final DisplayMetrics f8398a;

        public DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics) {
            this.f8398a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        /* renamed from: a */
        public int mo5118a() {
            return this.f8398a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        /* renamed from: b */
        public int mo5119b() {
            return this.f8398a.widthPixels;
        }
    }

    public interface ScreenDimensions {
        /* renamed from: a */
        int mo5118a();

        /* renamed from: b */
        int mo5119b();
    }

    public MemorySizeCalculator(Builder builder) {
        this.f8391c = builder.f8394a;
        int i2 = builder.f8395b.isLowRamDevice() ? 2097152 : 4194304;
        this.f8392d = i2;
        int round = Math.round(r1.getMemoryClass() * RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE * RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE * (builder.f8395b.isLowRamDevice() ? 0.33f : 0.4f));
        float mo5119b = builder.f8396c.mo5119b() * builder.f8396c.mo5118a() * 4;
        int round2 = Math.round(builder.f8397d * mo5119b);
        int round3 = Math.round(mo5119b * 2.0f);
        int i3 = round - i2;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.f8390b = round3;
            this.f8389a = round2;
        } else {
            float f2 = i3 / (builder.f8397d + 2.0f);
            this.f8390b = Math.round(2.0f * f2);
            this.f8389a = Math.round(f2 * builder.f8397d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder m24u = C0000a.m24u("Calculation complete, Calculated memory cache size: ");
            m24u.append(m5117a(this.f8390b));
            m24u.append(", pool size: ");
            m24u.append(m5117a(this.f8389a));
            m24u.append(", byte array size: ");
            m24u.append(m5117a(i2));
            m24u.append(", memory class limited? ");
            m24u.append(i4 > round);
            m24u.append(", max size: ");
            m24u.append(m5117a(round));
            m24u.append(", memoryClass: ");
            m24u.append(builder.f8395b.getMemoryClass());
            m24u.append(", isLowMemoryDevice: ");
            m24u.append(builder.f8395b.isLowRamDevice());
            Log.d("MemorySizeCalculator", m24u.toString());
        }
    }

    /* renamed from: a */
    public final String m5117a(int i2) {
        return Formatter.formatFileSize(this.f8391c, i2);
    }
}
