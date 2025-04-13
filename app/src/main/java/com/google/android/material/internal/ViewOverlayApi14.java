package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {

    /* renamed from: a */
    public OverlayViewGroup f18363a;

    @SuppressLint
    public static class OverlayViewGroup extends ViewGroup {

        /* renamed from: b */
        public ViewGroup f18364b;

        /* renamed from: c */
        public View f18365c;

        /* renamed from: d */
        public ArrayList<Drawable> f18366d;

        /* renamed from: e */
        public boolean f18367e;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f18364b.getLocationOnScreen(new int[2]);
            this.f18365c.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f18365c.getWidth(), this.f18365c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f18366d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f18366d.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f18364b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f18364b;
            if (viewGroup == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            this.f18365c.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
            rect.offset(iArr4[0], iArr4[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f18366d) != null && arrayList.contains(drawable));
        }
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    /* renamed from: a */
    public void mo10162a(@NonNull Drawable drawable) {
        OverlayViewGroup overlayViewGroup = this.f18363a;
        if (overlayViewGroup.f18367e) {
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
        if (overlayViewGroup.f18366d == null) {
            overlayViewGroup.f18366d = new ArrayList<>();
        }
        if (overlayViewGroup.f18366d.contains(drawable)) {
            return;
        }
        overlayViewGroup.f18366d.add(drawable);
        overlayViewGroup.invalidate(drawable.getBounds());
        drawable.setCallback(overlayViewGroup);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    /* renamed from: b */
    public void mo10163b(@NonNull Drawable drawable) {
        OverlayViewGroup overlayViewGroup = this.f18363a;
        ArrayList<Drawable> arrayList = overlayViewGroup.f18366d;
        if (arrayList != null) {
            arrayList.remove(drawable);
            overlayViewGroup.invalidate(drawable.getBounds());
            drawable.setCallback(null);
            if (overlayViewGroup.getChildCount() == 0) {
                ArrayList<Drawable> arrayList2 = overlayViewGroup.f18366d;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    overlayViewGroup.f18367e = true;
                    overlayViewGroup.f18364b.removeView(overlayViewGroup);
                }
            }
        }
    }
}
