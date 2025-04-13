package com.stfalcon.imageviewer.common.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.stfalcon.imageviewer.common.extensions.ViewPagerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MultiTouchViewPager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/MultiTouchViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class MultiTouchViewPager extends ViewPager {

    /* renamed from: j0 */
    public boolean f25248j0;

    /* renamed from: k0 */
    public boolean f25249k0;

    /* renamed from: l0 */
    public ViewPager.OnPageChangeListener f25250l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiTouchViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m32180i(context, "context");
        this.f25248j0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.m32180i(ev, "ev");
        if (ev.getPointerCount() <= 1 || !this.f25249k0) {
            return super.dispatchTouchEvent(ev);
        }
        this.f25249k0 = false;
        super.requestDisallowInterceptTouchEvent(false);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(ev);
        this.f25249k0 = true;
        super.requestDisallowInterceptTouchEvent(true);
        return dispatchTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25250l0 = ViewPagerKt.m14025a(this, null, null, new MultiTouchViewPager$onAttachedToWindow$1(this), 3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<ViewPager.OnPageChangeListener> list;
        super.onDetachedFromWindow();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f25250l0;
        if (onPageChangeListener == null || (list = this.f6542S) == null) {
            return;
        }
        list.remove(onPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.m32180i(ev, "ev");
        if (ev.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.m32180i(ev, "ev");
        try {
            return super.onTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f25249k0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }
}
