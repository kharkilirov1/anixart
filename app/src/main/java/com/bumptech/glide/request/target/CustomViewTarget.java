package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.request.Request;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class CustomViewTarget<T extends View, Z> implements Target<Z> {

    /* renamed from: com.bumptech.glide.request.target.CustomViewTarget$1 */
    class ViewOnAttachStateChangeListenerC08231 implements View.OnAttachStateChangeListener {
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

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<SizeDeterminer> f8791b;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                if (this.f8791b.get() == null) {
                    return true;
                }
                throw null;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: a */
    public final void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
        throw null;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: d */
    public final void mo5290d(@Nullable Request request) {
        throw null;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: i */
    public final void mo5294i(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    /* renamed from: j */
    public final Request mo5295j() {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: k */
    public final void mo5296k(@Nullable Drawable drawable) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: l */
    public final void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
        throw null;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    public String toString() {
        return "Target for: null";
    }
}
