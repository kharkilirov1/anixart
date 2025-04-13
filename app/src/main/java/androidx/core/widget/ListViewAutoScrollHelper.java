package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.widget.ListViewCompat;

/* loaded from: classes.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {

    /* renamed from: s */
    public final ListView f3818s;

    public ListViewAutoScrollHelper(@NonNull ListView listView) {
        super(listView);
        this.f3818s = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    /* renamed from: a */
    public boolean mo2567a(int i2) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    /* renamed from: b */
    public boolean mo2568b(int i2) {
        ListView listView = this.f3818s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (i2 > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i2 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    /* renamed from: g */
    public void mo2572g(int i2, int i3) {
        ListViewCompat.Api19Impl.m2603b(this.f3818s, i3);
    }
}
