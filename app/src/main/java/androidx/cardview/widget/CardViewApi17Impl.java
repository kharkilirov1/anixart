package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

@RequiresApi
/* loaded from: classes.dex */
class CardViewApi17Impl extends CardViewBaseImpl {

    /* renamed from: androidx.cardview.widget.CardViewApi17Impl$1 */
    class C01691 implements RoundRectDrawableWithShadow.RoundRectHelper {
        @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
        /* renamed from: a */
        public void mo1056a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }
}
