package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* renamed from: j */
    public int f3870j;

    /* renamed from: k */
    public int f3871k;

    /* renamed from: l */
    public LayoutInflater f3872l;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i2, Cursor cursor, boolean z) {
        super(context, null, z);
        this.f3871k = i2;
        this.f3870j = i2;
        this.f3872l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: f */
    public View mo2685f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3872l.inflate(this.f3871k, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: g */
    public View mo931g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3872l.inflate(this.f3870j, viewGroup, false);
    }
}
