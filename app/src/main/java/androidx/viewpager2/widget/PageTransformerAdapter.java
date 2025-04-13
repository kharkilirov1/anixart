package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    public final LinearLayoutManager f6622a;

    /* renamed from: b */
    public ViewPager2.PageTransformer f6623b;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.f6622a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i2, float f2, int i3) {
        if (this.f6623b == null) {
            return;
        }
        float f3 = -f2;
        for (int i4 = 0; i4 < this.f6622a.m3869Q(); i4++) {
            View m3868P = this.f6622a.m3868P(i4);
            if (m3868P == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i4), Integer.valueOf(this.f6622a.m3869Q())));
            }
            this.f6623b.mo4381a(m3868P, (this.f6622a.m3894i0(m3868P) - i2) + f3);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i2) {
    }
}
