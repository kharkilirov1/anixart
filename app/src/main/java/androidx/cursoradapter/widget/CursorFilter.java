package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class CursorFilter extends Filter {

    /* renamed from: a */
    public CursorFilterClient f3869a;

    public interface CursorFilterClient {
        /* renamed from: a */
        void mo927a(Cursor cursor);

        /* renamed from: b */
        Cursor mo2684b();

        /* renamed from: c */
        CharSequence mo928c(Cursor cursor);

        /* renamed from: d */
        Cursor mo929d(CharSequence charSequence);
    }

    public CursorFilter(CursorFilterClient cursorFilterClient) {
        this.f3869a = cursorFilterClient;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f3869a.mo928c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo929d = this.f3869a.mo929d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo929d != null) {
            filterResults.count = mo929d.getCount();
            filterResults.values = mo929d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo2684b = this.f3869a.mo2684b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo2684b) {
            return;
        }
        this.f3869a.mo927a((Cursor) obj);
    }
}
