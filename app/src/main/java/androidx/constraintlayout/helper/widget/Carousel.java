package androidx.constraintlayout.helper.widget;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* renamed from: n */
    public Adapter f2408n;

    /* renamed from: o */
    public int f2409o;

    /* renamed from: p */
    public MotionLayout f2410p;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1 */
    public class RunnableC01941 implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RunnableC01941 f2411b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f2411b);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public interface Adapter {
        /* renamed from: a */
        int m1375a();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    /* renamed from: a */
    public void mo1373a(MotionLayout motionLayout, int i2, int i3, float f2) {
    }

    public int getCount() {
        Adapter adapter = this.f2408n;
        if (adapter != null) {
            return adapter.m1375a();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f2409o;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            if (this.f2757c > 0) {
                motionLayout.m1433e(this.f2756b[0]);
                throw null;
            }
            this.f2410p = motionLayout;
            m1374q();
        }
    }

    /* renamed from: q */
    public final void m1374q() {
        Adapter adapter = this.f2408n;
        if (adapter != null && this.f2410p != null && adapter.m1375a() != 0) {
            throw null;
        }
    }

    public void setAdapter(Adapter adapter) {
        this.f2408n = adapter;
    }
}
