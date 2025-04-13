package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    public final GestureDetectorCompatImpl f3590a;

    public interface GestureDetectorCompatImpl {
        /* renamed from: a */
        boolean mo2083a(MotionEvent motionEvent);
    }

    public static class GestureDetectorCompatImplBase implements GestureDetectorCompatImpl {

        /* renamed from: v */
        public static final int f3591v = ViewConfiguration.getTapTimeout();

        /* renamed from: w */
        public static final int f3592w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        public int f3593a;

        /* renamed from: b */
        public int f3594b;

        /* renamed from: c */
        public int f3595c;

        /* renamed from: d */
        public int f3596d;

        /* renamed from: e */
        public final Handler f3597e;

        /* renamed from: f */
        public final GestureDetector.OnGestureListener f3598f;

        /* renamed from: g */
        public GestureDetector.OnDoubleTapListener f3599g;

        /* renamed from: h */
        public boolean f3600h;

        /* renamed from: i */
        public boolean f3601i;

        /* renamed from: j */
        public boolean f3602j;

        /* renamed from: k */
        public boolean f3603k;

        /* renamed from: l */
        public boolean f3604l;

        /* renamed from: m */
        public MotionEvent f3605m;

        /* renamed from: n */
        public MotionEvent f3606n;

        /* renamed from: o */
        public boolean f3607o;

        /* renamed from: p */
        public float f3608p;

        /* renamed from: q */
        public float f3609q;

        /* renamed from: r */
        public float f3610r;

        /* renamed from: s */
        public float f3611s;

        /* renamed from: t */
        public boolean f3612t;

        /* renamed from: u */
        public VelocityTracker f3613u;

        public class GestureHandler extends Handler {

            /* renamed from: a */
            public final /* synthetic */ GestureDetectorCompatImplBase f3614a;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    GestureDetectorCompatImplBase gestureDetectorCompatImplBase = this.f3614a;
                    gestureDetectorCompatImplBase.f3598f.onShowPress(gestureDetectorCompatImplBase.f3605m);
                    return;
                }
                if (i2 == 2) {
                    GestureDetectorCompatImplBase gestureDetectorCompatImplBase2 = this.f3614a;
                    gestureDetectorCompatImplBase2.f3597e.removeMessages(3);
                    gestureDetectorCompatImplBase2.f3601i = false;
                    gestureDetectorCompatImplBase2.f3602j = true;
                    gestureDetectorCompatImplBase2.f3598f.onLongPress(gestureDetectorCompatImplBase2.f3605m);
                    return;
                }
                if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                GestureDetectorCompatImplBase gestureDetectorCompatImplBase3 = this.f3614a;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = gestureDetectorCompatImplBase3.f3599g;
                if (onDoubleTapListener != null) {
                    if (gestureDetectorCompatImplBase3.f3600h) {
                        gestureDetectorCompatImplBase3.f3601i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(gestureDetectorCompatImplBase3.f3605m);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo2083a(android.view.MotionEvent r14) {
            /*
                Method dump skipped, instructions count: 706
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.mo2083a(android.view.MotionEvent):boolean");
        }
    }

    public static class GestureDetectorCompatImplJellybeanMr2 implements GestureDetectorCompatImpl {

        /* renamed from: a */
        public final GestureDetector f3615a;

        public GestureDetectorCompatImplJellybeanMr2(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3615a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        /* renamed from: a */
        public boolean mo2083a(MotionEvent motionEvent) {
            return this.f3615a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this.f3590a = new GestureDetectorCompatImplJellybeanMr2(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m2082a(@NonNull MotionEvent motionEvent) {
        return this.f3590a.mo2083a(motionEvent);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f3590a = new GestureDetectorCompatImplJellybeanMr2(context, onGestureListener, handler);
    }
}
