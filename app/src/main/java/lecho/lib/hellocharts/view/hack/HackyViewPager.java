package lecho.lib.hellocharts.view.hack;

import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class HackyViewPager extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
