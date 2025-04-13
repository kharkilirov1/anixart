package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PopupMenuCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static View.OnTouchListener m2629a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }
}
