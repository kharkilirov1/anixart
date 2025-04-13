package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.cursoradapter.widget.CursorFilter;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {

    /* renamed from: b */
    @RestrictTo
    public boolean f3859b;

    /* renamed from: c */
    @RestrictTo
    public boolean f3860c;

    /* renamed from: d */
    @RestrictTo
    public Cursor f3861d;

    /* renamed from: e */
    @RestrictTo
    public Context f3862e;

    /* renamed from: f */
    @RestrictTo
    public int f3863f;

    /* renamed from: g */
    @RestrictTo
    public ChangeObserver f3864g;

    /* renamed from: h */
    @RestrictTo
    public DataSetObserver f3865h;

    /* renamed from: i */
    @RestrictTo
    public CursorFilter f3866i;

    public class ChangeObserver extends ContentObserver {
        public ChangeObserver() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            CursorAdapter cursorAdapter = CursorAdapter.this;
            if (!cursorAdapter.f3860c || (cursor = cursorAdapter.f3861d) == null || cursor.isClosed()) {
                return;
            }
            cursorAdapter.f3859b = cursorAdapter.f3861d.requery();
        }
    }

    public class MyDataSetObserver extends DataSetObserver {
        public MyDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f3859b = true;
            cursorAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f3859b = false;
            cursorAdapter.notifyDataSetInvalidated();
        }
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z) {
        int i2 = z ? 1 : 2;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f3860c = true;
        } else {
            this.f3860c = false;
        }
        boolean z2 = cursor != null;
        this.f3861d = cursor;
        this.f3859b = z2;
        this.f3862e = context;
        this.f3863f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f3864g = new ChangeObserver();
            this.f3865h = new MyDataSetObserver();
        } else {
            this.f3864g = null;
            this.f3865h = null;
        }
        if (z2) {
            ChangeObserver changeObserver = this.f3864g;
            if (changeObserver != null) {
                cursor.registerContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.f3865h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo927a(Cursor cursor) {
        Cursor mo2686h = mo2686h(cursor);
        if (mo2686h != null) {
            mo2686h.close();
        }
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* renamed from: b */
    public Cursor mo2684b() {
        return this.f3861d;
    }

    /* renamed from: c */
    public CharSequence mo928c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: d */
    public Cursor mo929d(CharSequence charSequence) {
        return this.f3861d;
    }

    /* renamed from: e */
    public abstract void mo930e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public View mo2685f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo931g(context, cursor, viewGroup);
    }

    /* renamed from: g */
    public abstract View mo931g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3859b || (cursor = this.f3861d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3859b) {
            return null;
        }
        this.f3861d.moveToPosition(i2);
        if (view == null) {
            view = mo2685f(this.f3862e, this.f3861d, viewGroup);
        }
        mo930e(view, this.f3862e, this.f3861d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3866i == null) {
            this.f3866i = new CursorFilter(this);
        }
        return this.f3866i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f3859b || (cursor = this.f3861d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f3861d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f3859b && (cursor = this.f3861d) != null && cursor.moveToPosition(i2)) {
            return this.f3861d.getLong(this.f3863f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3859b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3861d.moveToPosition(i2)) {
            throw new IllegalStateException(C0000a.m7d("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = mo931g(this.f3862e, this.f3861d, viewGroup);
        }
        mo930e(view, this.f3862e, this.f3861d);
        return view;
    }

    /* renamed from: h */
    public Cursor mo2686h(Cursor cursor) {
        Cursor cursor2 = this.f3861d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.f3864g;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.f3865h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3861d = cursor;
        if (cursor != null) {
            ChangeObserver changeObserver2 = this.f3864g;
            if (changeObserver2 != null) {
                cursor.registerContentObserver(changeObserver2);
            }
            DataSetObserver dataSetObserver2 = this.f3865h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3863f = cursor.getColumnIndexOrThrow("_id");
            this.f3859b = true;
            notifyDataSetChanged();
        } else {
            this.f3863f = -1;
            this.f3859b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
