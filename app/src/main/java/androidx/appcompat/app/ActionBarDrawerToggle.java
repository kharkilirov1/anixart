package androidx.appcompat.app;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1 */
    class ViewOnClickListenerC00561 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface Delegate {
    }

    public interface DelegateProvider {
    }

    public static class FrameworkActionBarDelegate implements Delegate {

        @RequiresApi
        public static class Api18Impl {
            @DoNotInline
            /* renamed from: a */
            public static void m356a(android.app.ActionBar actionBar, int i2) {
                actionBar.setHomeActionContentDescription(i2);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m357b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
    }

    public static class ToolbarCompatDelegate implements Delegate {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    /* renamed from: a */
    public void mo354a(View view, float f2) {
        m355b(0.0f);
        throw null;
    }

    /* renamed from: b */
    public final void m355b(float f2) {
        if (f2 == 1.0f) {
            throw null;
        }
        if (f2 != 0.0f) {
            throw null;
        }
        throw null;
    }
}
