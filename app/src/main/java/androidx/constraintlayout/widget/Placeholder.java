package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: b */
    public int f3022b;

    /* renamed from: c */
    public View f3023c;

    /* renamed from: d */
    public int f3024d;

    public View getContent() {
        return this.f3023c;
    }

    public int getEmptyVisibility() {
        return this.f3024d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(KotlinVersion.MAX_COMPONENT_VALUE, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f3022b == i2) {
            return;
        }
        View view = this.f3023c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f3023c.getLayoutParams()).f2820f0 = false;
            this.f3023c = null;
        }
        this.f3022b = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f3024d = i2;
    }
}
