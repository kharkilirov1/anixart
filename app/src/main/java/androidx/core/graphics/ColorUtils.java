package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ColorUtils {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f3366a = new ThreadLocal<>();

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static Color m1777a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                StringBuilder m24u = C0000a.m24u("Color models must match (");
                m24u.append(color.getModel());
                m24u.append(" vs. ");
                m24u.append(color2.getModel());
                m24u.append(")");
                throw new IllegalArgumentException(m24u.toString());
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = (1.0f - alpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            components2[componentCount] = alpha + alpha2;
            if (components2[componentCount] > 0.0f) {
                alpha /= components2[componentCount];
                alpha2 /= components2[componentCount];
            }
            for (int i2 = 0; i2 < componentCount; i2++) {
                components2[i2] = (components2[i2] * alpha2) + (components[i2] * alpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    @ColorInt
    /* renamed from: a */
    public static int m1772a(@FloatRange double d, @FloatRange double d2, @FloatRange double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m1775d((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), m1775d((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), m1775d((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* renamed from: b */
    public static int m1773b(@ColorInt int i2, @ColorInt int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int i4 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i4, m1774c(Color.red(i2), alpha2, Color.red(i3), alpha, i4), m1774c(Color.green(i2), alpha2, Color.green(i3), alpha, i4), m1774c(Color.blue(i2), alpha2, Color.blue(i3), alpha, i4));
    }

    /* renamed from: c */
    public static int m1774c(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((255 - i3) * (i4 * i5)) + ((i2 * KotlinVersion.MAX_COMPONENT_VALUE) * i3)) / (i6 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: d */
    public static int m1775d(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : Math.min(i2, i4);
    }

    @ColorInt
    /* renamed from: e */
    public static int m1776e(@ColorInt int i2, @IntRange int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
