package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
class AnimationHandler {

    /* renamed from: g */
    public static final ThreadLocal<AnimationHandler> f3950g = new ThreadLocal<>();

    /* renamed from: d */
    public AnimationFrameCallbackProvider f3954d;

    /* renamed from: a */
    public final SimpleArrayMap<AnimationFrameCallback, Long> f3951a = new SimpleArrayMap<>();

    /* renamed from: b */
    public final ArrayList<AnimationFrameCallback> f3952b = new ArrayList<>();

    /* renamed from: c */
    public final AnimationCallbackDispatcher f3953c = new AnimationCallbackDispatcher();

    /* renamed from: e */
    public long f3955e = 0;

    /* renamed from: f */
    public boolean f3956f = false;

    public class AnimationCallbackDispatcher {
        public AnimationCallbackDispatcher() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m2774a() {
            /*
                r11 = this;
                androidx.dynamicanimation.animation.AnimationHandler r0 = androidx.dynamicanimation.animation.AnimationHandler.this
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f3955e = r1
                androidx.dynamicanimation.animation.AnimationHandler r0 = androidx.dynamicanimation.animation.AnimationHandler.this
                long r1 = r0.f3955e
                long r3 = android.os.SystemClock.uptimeMillis()
                r5 = 0
                r6 = 0
            L12:
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r7 = r0.f3952b
                int r7 = r7.size()
                if (r6 >= r7) goto L48
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r7 = r0.f3952b
                java.lang.Object r7 = r7.get(r6)
                androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback r7 = (androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback) r7
                if (r7 != 0) goto L25
                goto L45
            L25:
                androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r8 = r0.f3951a
                java.lang.Object r8 = r8.get(r7)
                java.lang.Long r8 = (java.lang.Long) r8
                if (r8 != 0) goto L30
                goto L3d
            L30:
                long r8 = r8.longValue()
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 >= 0) goto L3f
                androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r8 = r0.f3951a
                r8.remove(r7)
            L3d:
                r8 = 1
                goto L40
            L3f:
                r8 = 0
            L40:
                if (r8 == 0) goto L45
                r7.mo2775a(r1)
            L45:
                int r6 = r6 + 1
                goto L12
            L48:
                boolean r1 = r0.f3956f
                if (r1 == 0) goto L66
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r1 = r0.f3952b
                int r1 = r1.size()
            L52:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L64
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r2 = r0.f3952b
                java.lang.Object r2 = r2.get(r1)
                if (r2 != 0) goto L52
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r2 = r0.f3952b
                r2.remove(r1)
                goto L52
            L64:
                r0.f3956f = r5
            L66:
                androidx.dynamicanimation.animation.AnimationHandler r0 = androidx.dynamicanimation.animation.AnimationHandler.this
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r0.f3952b
                int r0 = r0.size()
                if (r0 <= 0) goto L84
                androidx.dynamicanimation.animation.AnimationHandler r0 = androidx.dynamicanimation.animation.AnimationHandler.this
                androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r1 = r0.f3954d
                if (r1 != 0) goto L7f
                androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16 r1 = new androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16
                androidx.dynamicanimation.animation.AnimationHandler$AnimationCallbackDispatcher r2 = r0.f3953c
                r1.<init>(r2)
                r0.f3954d = r1
            L7f:
                androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r0 = r0.f3954d
                r0.mo2776a()
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher.m2774a():void");
        }
    }

    public interface AnimationFrameCallback {
        /* renamed from: a */
        boolean mo2775a(long j2);
    }

    public static abstract class AnimationFrameCallbackProvider {

        /* renamed from: a */
        public final AnimationCallbackDispatcher f3958a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f3958a = animationCallbackDispatcher;
        }

        /* renamed from: a */
        public abstract void mo2776a();
    }

    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* renamed from: b */
        public final Runnable f3959b;

        /* renamed from: c */
        public final Handler f3960c;

        /* renamed from: d */
        public long f3961d;

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1 */
        class RunnableC02931 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ FrameCallbackProvider14 f3962b;

            @Override // java.lang.Runnable
            public void run() {
                this.f3962b.f3961d = SystemClock.uptimeMillis();
                this.f3962b.f3958a.m2774a();
            }
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        /* renamed from: a */
        public void mo2776a() {
            this.f3960c.postDelayed(this.f3959b, Math.max(10 - (SystemClock.uptimeMillis() - this.f3961d), 0L));
        }
    }

    @RequiresApi
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {

        /* renamed from: b */
        public final Choreographer f3963b;

        /* renamed from: c */
        public final Choreographer.FrameCallback f3964c;

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.f3963b = Choreographer.getInstance();
            this.f3964c = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j2) {
                    FrameCallbackProvider16.this.f3958a.m2774a();
                }
            };
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        /* renamed from: a */
        public void mo2776a() {
            this.f3963b.postFrameCallback(this.f3964c);
        }
    }

    /* renamed from: a */
    public static AnimationHandler m2773a() {
        ThreadLocal<AnimationHandler> threadLocal = f3950g;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        return threadLocal.get();
    }
}
