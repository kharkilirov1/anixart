package lecho.lib.hellocharts.view.hack;

import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes3.dex */
public class HackyDrawerLayout extends DrawerLayout {
    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            motionEvent.getActionMasked();
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
