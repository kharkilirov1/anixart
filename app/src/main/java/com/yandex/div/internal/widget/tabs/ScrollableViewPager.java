package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import java.util.Set;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class ScrollableViewPager extends ViewPager implements OnInterceptTouchEventListenerHost {

    /* renamed from: j0 */
    public final NestedHorizontalScrollCompanion f34257j0;

    /* renamed from: k0 */
    @Nullable
    public ViewDragHelper f34258k0;

    /* renamed from: l0 */
    public boolean f34259l0;

    /* renamed from: m0 */
    public boolean f34260m0;

    /* renamed from: n0 */
    public boolean f34261n0;

    /* renamed from: o0 */
    public boolean f34262o0;

    /* renamed from: p0 */
    @Nullable
    public Set<Integer> f34263p0;

    /* renamed from: q0 */
    @Nullable
    public OnInterceptTouchEventListener f34264q0;

    public ScrollableViewPager(@NonNull Context context) {
        super(context, null);
        this.f34257j0 = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.f34259l0 = true;
        this.f34260m0 = true;
        this.f34261n0 = false;
        this.f34262o0 = false;
    }

    /* renamed from: B */
    public final boolean m17507B(@NonNull MotionEvent motionEvent) {
        if (!this.f34260m0 && this.f34258k0 != null) {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                this.f34261n0 = false;
            }
            this.f34258k0.m2728r(motionEvent);
        }
        Set<Integer> set = this.f34263p0;
        if (set != null) {
            this.f34262o0 = this.f34259l0 && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.f34261n0 || this.f34262o0 || !this.f34259l0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f34257j0.m17393b(motionEvent);
        return dispatchTouchEvent;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.f34264q0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.f34264q0;
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.mo17109a(this, motionEvent) : false) || (m17507B(motionEvent) && super.onInterceptTouchEvent(motionEvent));
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f34257j0.f33890b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return m17507B(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(@Nullable Set<Integer> set) {
        this.f34263p0 = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.f34260m0 = z;
        if (z) {
            return;
        }
        ViewDragHelper viewDragHelper = new ViewDragHelper(getContext(), this, new ViewDragHelper.Callback() { // from class: com.yandex.div.internal.widget.tabs.ScrollableViewPager.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: e */
            public void mo2741e(int i2, int i3) {
                ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
                boolean z2 = true;
                if ((i2 & 2) == 0 && (i2 & 1) == 0) {
                    z2 = false;
                }
                scrollableViewPager.f34261n0 = z2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: k */
            public boolean mo2747k(View view, int i2) {
                return false;
            }
        });
        this.f34258k0 = viewDragHelper;
        viewDragHelper.f3911q = 3;
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.f34264q0 = onInterceptTouchEventListener;
    }

    public void setScrollEnabled(boolean z) {
        this.f34259l0 = z;
    }
}
