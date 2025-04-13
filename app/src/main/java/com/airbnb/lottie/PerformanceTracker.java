package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class PerformanceTracker {

    /* renamed from: a */
    public boolean f7268a = false;

    /* renamed from: b */
    public final Set<FrameListener> f7269b = new ArraySet(0);

    /* renamed from: c */
    public final Map<String, MeanCalculator> f7270c = new HashMap();

    /* renamed from: com.airbnb.lottie.PerformanceTracker$1 */
    public class C07571 implements Comparator<Pair<String, Float>> {
        @Override // java.util.Comparator
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.f3553b.floatValue();
            float floatValue2 = pair2.f3553b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public interface FrameListener {
        /* renamed from: a */
        void m4687a(float f2);
    }
}
