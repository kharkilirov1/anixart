package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {

    /* renamed from: a */
    public final List<ViewPager2.PageTransformer> f6620a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    /* renamed from: a */
    public void mo4381a(@NonNull View view, float f2) {
        Iterator<ViewPager2.PageTransformer> it = this.f6620a.iterator();
        while (it.hasNext()) {
            it.next().mo4381a(view, f2);
        }
    }
}
