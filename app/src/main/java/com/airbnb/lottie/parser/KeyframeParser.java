package com.airbnb.lottie.parser;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class KeyframeParser {

    /* renamed from: b */
    public static SparseArrayCompat<WeakReference<Interpolator>> f7748b;

    /* renamed from: a */
    public static final Interpolator f7747a = new LinearInterpolator();

    /* renamed from: c */
    public static JsonReader.Options f7749c = JsonReader.Options.m4804a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: a */
    public static <T> Keyframe<T> m4781a(JsonReader jsonReader, LottieComposition lottieComposition, float f2, ValueParser<T> valueParser, boolean z) throws IOException {
        Interpolator interpolator;
        T t;
        WeakReference<Interpolator> m1130d;
        if (!z) {
            return new Keyframe<>(valueParser.mo4775a(jsonReader, f2));
        }
        jsonReader.mo4788b();
        int i2 = 1;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z2 = false;
        float f3 = 0.0f;
        while (jsonReader.mo4791g()) {
            switch (jsonReader.mo4799p(f7749c)) {
                case 0:
                    f3 = (float) jsonReader.mo4793i();
                    break;
                case 1:
                    t3 = valueParser.mo4775a(jsonReader, f2);
                    continue;
                case 2:
                    t2 = valueParser.mo4775a(jsonReader, f2);
                    continue;
                case 3:
                    pointF = JsonUtils.m4778b(jsonReader, f2);
                    continue;
                case 4:
                    pointF2 = JsonUtils.m4778b(jsonReader, f2);
                    continue;
                case 5:
                    if (jsonReader.mo4794j() == i2) {
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        continue;
                    }
                case 6:
                    pointF4 = JsonUtils.m4778b(jsonReader, f2);
                    continue;
                case 7:
                    pointF3 = JsonUtils.m4778b(jsonReader, f2);
                    continue;
                default:
                    jsonReader.mo4802u();
                    break;
            }
            i2 = 1;
        }
        jsonReader.mo4790e();
        if (z2) {
            interpolator = f7747a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f7747a;
            } else {
                float f4 = -f2;
                pointF.x = MiscUtils.m4845b(pointF.x, f4, f2);
                pointF.y = MiscUtils.m4845b(pointF.y, -100.0f, 100.0f);
                pointF2.x = MiscUtils.m4845b(pointF2.x, f4, f2);
                float m4845b = MiscUtils.m4845b(pointF2.y, -100.0f, 100.0f);
                pointF2.y = m4845b;
                float f5 = pointF.x;
                float f6 = pointF.y;
                float f7 = pointF2.x;
                PathMeasure pathMeasure = Utils.f7847a;
                int i3 = f5 != 0.0f ? (int) (527 * f5) : 17;
                if (f6 != 0.0f) {
                    i3 = (int) (i3 * 31 * f6);
                }
                if (f7 != 0.0f) {
                    i3 = (int) (i3 * 31 * f7);
                }
                if (m4845b != 0.0f) {
                    i3 = (int) (i3 * 31 * m4845b);
                }
                synchronized (KeyframeParser.class) {
                    if (f7748b == null) {
                        f7748b = new SparseArrayCompat<>();
                    }
                    m1130d = f7748b.m1130d(i3, null);
                }
                interpolator = m1130d != null ? m1130d.get() : null;
                if (m1130d == null || interpolator == null) {
                    interpolator = PathInterpolatorCompat.m2548a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                    try {
                        WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator);
                        synchronized (KeyframeParser.class) {
                            f7748b.m1132f(i3, weakReference);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            }
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolator, f3, null);
        keyframe.f7865m = pointF4;
        keyframe.f7866n = pointF3;
        return keyframe;
    }
}
