package androidx.core.app;

import android.os.Build;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    @RequiresApi
    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {

        /* renamed from: a */
        public int f3124a;

        /* renamed from: b */
        public SparseIntArray[] f3125b = new SparseIntArray[9];

        /* renamed from: androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1 */
        public class WindowOnFrameMetricsAvailableListenerC02271 implements Window.OnFrameMetricsAvailableListener {

            /* renamed from: a */
            public final /* synthetic */ FrameMetricsApi24Impl f3126a;

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                FrameMetricsApi24Impl frameMetricsApi24Impl = this.f3126a;
                if ((frameMetricsApi24Impl.f3124a & 1) != 0) {
                    frameMetricsApi24Impl.m1578a(frameMetricsApi24Impl.f3125b[0], frameMetrics.getMetric(8));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl2 = this.f3126a;
                if ((frameMetricsApi24Impl2.f3124a & 2) != 0) {
                    frameMetricsApi24Impl2.m1578a(frameMetricsApi24Impl2.f3125b[1], frameMetrics.getMetric(1));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl3 = this.f3126a;
                if ((frameMetricsApi24Impl3.f3124a & 4) != 0) {
                    frameMetricsApi24Impl3.m1578a(frameMetricsApi24Impl3.f3125b[2], frameMetrics.getMetric(3));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl4 = this.f3126a;
                if ((frameMetricsApi24Impl4.f3124a & 8) != 0) {
                    frameMetricsApi24Impl4.m1578a(frameMetricsApi24Impl4.f3125b[3], frameMetrics.getMetric(4));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl5 = this.f3126a;
                if ((frameMetricsApi24Impl5.f3124a & 16) != 0) {
                    frameMetricsApi24Impl5.m1578a(frameMetricsApi24Impl5.f3125b[4], frameMetrics.getMetric(5));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl6 = this.f3126a;
                if ((frameMetricsApi24Impl6.f3124a & 64) != 0) {
                    frameMetricsApi24Impl6.m1578a(frameMetricsApi24Impl6.f3125b[6], frameMetrics.getMetric(7));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl7 = this.f3126a;
                if ((frameMetricsApi24Impl7.f3124a & 32) != 0) {
                    frameMetricsApi24Impl7.m1578a(frameMetricsApi24Impl7.f3125b[5], frameMetrics.getMetric(6));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl8 = this.f3126a;
                if ((frameMetricsApi24Impl8.f3124a & 128) != 0) {
                    frameMetricsApi24Impl8.m1578a(frameMetricsApi24Impl8.f3125b[7], frameMetrics.getMetric(0));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl9 = this.f3126a;
                if ((frameMetricsApi24Impl9.f3124a & 256) != 0) {
                    frameMetricsApi24Impl9.m1578a(frameMetricsApi24Impl9.f3125b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public FrameMetricsApi24Impl(int i2) {
            new ArrayList();
            this.f3124a = i2;
        }

        /* renamed from: a */
        public void m1578a(SparseIntArray sparseIntArray, long j2) {
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + j2) / 1000000);
                if (j2 >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }

    public static class FrameMetricsBaseImpl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        if (Build.VERSION.SDK_INT >= 24) {
            new FrameMetricsApi24Impl(1);
        }
    }
}
