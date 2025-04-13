package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* renamed from: c */
    public final T f8805c;

    /* renamed from: d */
    public final SizeDeterminer f8806d;

    /* renamed from: com.bumptech.glide.request.target.ViewTarget$1 */
    class ViewOnAttachStateChangeListenerC08251 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    @VisibleForTesting
    public static final class SizeDeterminer {

        /* renamed from: d */
        @Nullable
        @VisibleForTesting
        public static Integer f8807d;

        /* renamed from: a */
        public final View f8808a;

        /* renamed from: b */
        public final List<SizeReadyCallback> f8809b = new ArrayList();

        /* renamed from: c */
        @Nullable
        public SizeDeterminerLayoutListener f8810c;

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<SizeDeterminer> f8811b;

            public SizeDeterminerLayoutListener(@NonNull SizeDeterminer sizeDeterminer) {
                this.f8811b = new WeakReference<>(sizeDeterminer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                SizeDeterminer sizeDeterminer = this.f8811b.get();
                if (sizeDeterminer == null || sizeDeterminer.f8809b.isEmpty()) {
                    return true;
                }
                int m5322d = sizeDeterminer.m5322d();
                int m5321c = sizeDeterminer.m5321c();
                if (!sizeDeterminer.m5323e(m5322d, m5321c)) {
                    return true;
                }
                Iterator it = new ArrayList(sizeDeterminer.f8809b).iterator();
                while (it.hasNext()) {
                    ((SizeReadyCallback) it.next()).mo5302e(m5322d, m5321c);
                }
                sizeDeterminer.m5319a();
                return true;
            }
        }

        public SizeDeterminer(@NonNull View view) {
            this.f8808a = view;
        }

        /* renamed from: a */
        public void m5319a() {
            ViewTreeObserver viewTreeObserver = this.f8808a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8810c);
            }
            this.f8810c = null;
            this.f8809b.clear();
        }

        /* renamed from: b */
        public final int m5320b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f8808a.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f8808a.getContext();
            if (f8807d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f8807d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f8807d.intValue();
        }

        /* renamed from: c */
        public final int m5321c() {
            int paddingBottom = this.f8808a.getPaddingBottom() + this.f8808a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f8808a.getLayoutParams();
            return m5320b(this.f8808a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* renamed from: d */
        public final int m5322d() {
            int paddingRight = this.f8808a.getPaddingRight() + this.f8808a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f8808a.getLayoutParams();
            return m5320b(this.f8808a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        /* renamed from: e */
        public final boolean m5323e(int i2, int i3) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public ViewTarget(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f8805c = t;
        this.f8806d = new SizeDeterminer(t);
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    /* renamed from: a */
    public void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f8806d.f8809b.remove(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    /* renamed from: d */
    public void mo5290d(@Nullable Request request) {
        this.f8805c.setTag(request);
    }

    @NonNull
    public T getView() {
        return this.f8805c;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    /* renamed from: i */
    public void mo5294i(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @Nullable
    /* renamed from: j */
    public Request mo5295j() {
        Object tag = this.f8805c.getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    /* renamed from: k */
    public void mo5296k(@Nullable Drawable drawable) {
        this.f8806d.m5319a();
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    /* renamed from: l */
    public void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
        SizeDeterminer sizeDeterminer = this.f8806d;
        int m5322d = sizeDeterminer.m5322d();
        int m5321c = sizeDeterminer.m5321c();
        if (sizeDeterminer.m5323e(m5322d, m5321c)) {
            ((SingleRequest) sizeReadyCallback).mo5302e(m5322d, m5321c);
            return;
        }
        if (!sizeDeterminer.f8809b.contains(sizeReadyCallback)) {
            sizeDeterminer.f8809b.add(sizeReadyCallback);
        }
        if (sizeDeterminer.f8810c == null) {
            ViewTreeObserver viewTreeObserver = sizeDeterminer.f8808a.getViewTreeObserver();
            SizeDeterminer.SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new SizeDeterminer.SizeDeterminerLayoutListener(sizeDeterminer);
            sizeDeterminer.f8810c = sizeDeterminerLayoutListener;
            viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
        }
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Target for: ");
        m24u.append(this.f8805c);
        return m24u.toString();
    }
}
