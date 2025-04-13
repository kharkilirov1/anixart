package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* renamed from: m */
    @RestrictTo
    public int[] f3873m;

    public interface CursorToStringConverter {
    }

    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* renamed from: c */
    public CharSequence mo928c(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: e */
    public void mo930e(View view, Context context, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: h */
    public Cursor mo2686h(Cursor cursor) {
        if (cursor != null) {
            throw null;
        }
        this.f3873m = null;
        return super.mo2686h(cursor);
    }
}
