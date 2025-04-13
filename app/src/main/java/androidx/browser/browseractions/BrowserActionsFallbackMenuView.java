package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b */
    public final int f1717b;

    /* renamed from: c */
    public final int f1718c;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1717b = getResources().getDimensionPixelOffset(C2507R.dimen.browser_actions_context_menu_min_padding);
        this.f1718c = getResources().getDimensionPixelOffset(C2507R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1717b * 2), this.f1718c), 1073741824), i3);
    }
}
