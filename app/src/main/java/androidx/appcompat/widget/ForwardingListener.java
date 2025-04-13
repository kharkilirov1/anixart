package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

@RestrictTo
/* loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f1325b;

    /* renamed from: c */
    public final int f1326c;

    /* renamed from: d */
    public final int f1327d;

    /* renamed from: e */
    public final View f1328e;

    /* renamed from: f */
    public Runnable f1329f;

    /* renamed from: g */
    public Runnable f1330g;

    /* renamed from: h */
    public boolean f1331h;

    /* renamed from: i */
    public int f1332i;

    /* renamed from: j */
    public final int[] f1333j = new int[2];

    public class DisallowIntercept implements Runnable {
        public DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ForwardingListener.this.f1328e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class TriggerLongPress implements Runnable {
        public TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.m858a();
            View view = forwardingListener.f1328e;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.mo555c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                forwardingListener.f1331h = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.f1328e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1325b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1326c = tapTimeout;
        this.f1327d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m858a() {
        Runnable runnable = this.f1330g;
        if (runnable != null) {
            this.f1328e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1329f;
        if (runnable2 != null) {
            this.f1328e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract ShowableListMenu mo554b();

    /* renamed from: c */
    public boolean mo555c() {
        ShowableListMenu mo554b = mo554b();
        if (mo554b == null || mo554b.mo572c()) {
            return true;
        }
        mo554b.mo571a();
        return true;
    }

    /* renamed from: d */
    public boolean mo693d() {
        ShowableListMenu mo554b = mo554b();
        if (mo554b == null || !mo554b.mo572c()) {
            return true;
        }
        mo554b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r4 != 3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1331h = false;
        this.f1332i = -1;
        Runnable runnable = this.f1329f;
        if (runnable != null) {
            this.f1328e.removeCallbacks(runnable);
        }
    }
}
