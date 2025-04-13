package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    /* renamed from: a */
    public void mo1888a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        m1889b();
        outline.setRoundRect(null, this.f3411a);
    }
}
