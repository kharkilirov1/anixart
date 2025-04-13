package androidx.constraintlayout.core.motion.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class KeyCycleOscillator {

    /* renamed from: a */
    public String f2030a;

    /* renamed from: b */
    public int f2031b = 0;

    /* renamed from: c */
    public String f2032c = null;

    /* renamed from: d */
    public int f2033d = 0;

    /* renamed from: e */
    public ArrayList<WavePoint> f2034e = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$1 */
    class C01801 implements Comparator<WavePoint> {
        @Override // java.util.Comparator
        public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
            return Integer.compare(wavePoint.f2035a, wavePoint2.f2035a);
        }
    }

    public static class CoreSpline extends KeyCycleOscillator {
    }

    public static class CycleOscillator {
    }

    public static class IntDoubleSort {
    }

    public static class IntFloatFloatSort {
    }

    public static class PathRotateSet extends KeyCycleOscillator {
    }

    public static class WavePoint {

        /* renamed from: a */
        public int f2035a;

        /* renamed from: b */
        public float f2036b;
    }

    public String toString() {
        String str = this.f2030a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.f2034e.iterator();
        while (it.hasNext()) {
            WavePoint next = it.next();
            StringBuilder m27x = C0000a.m27x(str, "[");
            m27x.append(next.f2035a);
            m27x.append(" , ");
            m27x.append(decimalFormat.format(next.f2036b));
            m27x.append("] ");
            str = m27x.toString();
        }
        return str;
    }
}
