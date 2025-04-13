package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    @Deprecated
    public interface Delegate {
    }

    @Deprecated
    public interface DelegateProvider {
    }

    public static class SetIndicatorInfo {
    }

    public class SlideDrawable extends InsetDrawable {
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            copyBounds(null);
            canvas.save();
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    /* renamed from: a */
    public void mo354a(View view, float f2) {
        throw null;
    }
}
