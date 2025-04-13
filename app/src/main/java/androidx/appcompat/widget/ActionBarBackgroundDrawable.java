package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class ActionBarBackgroundDrawable extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f983a;

    @RequiresApi
    public static class Api21Impl {
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f983a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f983a;
        if (actionBarContainer.f991i) {
            Drawable drawable = actionBarContainer.f990h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f988f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f983a;
        Drawable drawable3 = actionBarContainer2.f989g;
        if (drawable3 == null || !actionBarContainer2.f992j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f983a;
        if (actionBarContainer.f991i) {
            if (actionBarContainer.f990h != null) {
                actionBarContainer.f988f.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f988f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
