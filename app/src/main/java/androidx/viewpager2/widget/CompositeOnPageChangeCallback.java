package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    @NonNull
    public final List<ViewPager2.OnPageChangeCallback> f6619a;

    public CompositeOnPageChangeCallback(int i2) {
        this.f6619a = new ArrayList(i2);
    }

    /* renamed from: a */
    public final void m4380a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i2) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.f6619a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i2);
            }
        } catch (ConcurrentModificationException e2) {
            m4380a(e2);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i2, float f2, @Px int i3) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.f6619a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i2, f2, i3);
            }
        } catch (ConcurrentModificationException e2) {
            m4380a(e2);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i2) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.f6619a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i2);
            }
        } catch (ConcurrentModificationException e2) {
            m4380a(e2);
            throw null;
        }
    }
}
