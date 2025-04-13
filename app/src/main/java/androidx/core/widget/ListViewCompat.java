package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ListViewCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2602a(ListView listView, int i2) {
            return listView.canScrollList(i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2603b(ListView listView, int i2) {
            listView.scrollListBy(i2);
        }
    }

    /* renamed from: a */
    public static boolean m2601a(@NonNull ListView listView, int i2) {
        return Api19Impl.m2602a(listView, i2);
    }
}
