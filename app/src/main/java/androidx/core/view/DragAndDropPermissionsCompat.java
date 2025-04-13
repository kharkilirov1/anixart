package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2080a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        /* renamed from: b */
        public static DragAndDropPermissions m2081b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }
}
