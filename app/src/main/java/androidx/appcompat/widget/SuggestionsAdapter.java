package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.swiftsoft.anixartd.C2507R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: z */
    public static final /* synthetic */ int f1502z = 0;

    /* renamed from: m */
    public final SearchView f1503m;

    /* renamed from: n */
    public final SearchableInfo f1504n;

    /* renamed from: o */
    public final Context f1505o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f1506p;

    /* renamed from: q */
    public final int f1507q;

    /* renamed from: r */
    public int f1508r;

    /* renamed from: s */
    public ColorStateList f1509s;

    /* renamed from: t */
    public int f1510t;

    /* renamed from: u */
    public int f1511u;

    /* renamed from: v */
    public int f1512v;

    /* renamed from: w */
    public int f1513w;

    /* renamed from: x */
    public int f1514x;

    /* renamed from: y */
    public int f1515y;

    public static final class ChildViewCache {

        /* renamed from: a */
        public final TextView f1516a;

        /* renamed from: b */
        public final TextView f1517b;

        /* renamed from: c */
        public final ImageView f1518c;

        /* renamed from: d */
        public final ImageView f1519d;

        /* renamed from: e */
        public final ImageView f1520e;

        public ChildViewCache(View view) {
            this.f1516a = (TextView) view.findViewById(R.id.text1);
            this.f1517b = (TextView) view.findViewById(R.id.text2);
            this.f1518c = (ImageView) view.findViewById(R.id.icon1);
            this.f1519d = (ImageView) view.findViewById(R.id.icon2);
            this.f1520e = (ImageView) view.findViewById(C2507R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1508r = 1;
        this.f1510t = -1;
        this.f1511u = -1;
        this.f1512v = -1;
        this.f1513w = -1;
        this.f1514x = -1;
        this.f1515y = -1;
        this.f1503m = searchView;
        this.f1504n = searchableInfo;
        this.f1507q = searchView.getSuggestionCommitIconResId();
        this.f1505o = context;
        this.f1506p = weakHashMap;
    }

    /* renamed from: l */
    public static String m926l(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* renamed from: a */
    public void mo927a(Cursor cursor) {
        try {
            Cursor mo2686h = mo2686h(cursor);
            if (mo2686h != null) {
                mo2686h.close();
            }
            if (cursor != null) {
                this.f1510t = cursor.getColumnIndex("suggest_text_1");
                this.f1511u = cursor.getColumnIndex("suggest_text_2");
                this.f1512v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1513w = cursor.getColumnIndex("suggest_icon_1");
                this.f1514x = cursor.getColumnIndex("suggest_icon_2");
                this.f1515y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* renamed from: c */
    public CharSequence mo928c(Cursor cursor) {
        String m926l;
        String m926l2;
        if (cursor == null) {
            return null;
        }
        String m926l3 = m926l(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m926l3 != null) {
            return m926l3;
        }
        if (this.f1504n.shouldRewriteQueryFromData() && (m926l2 = m926l(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m926l2;
        }
        if (!this.f1504n.shouldRewriteQueryFromText() || (m926l = m926l(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m926l;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* renamed from: d */
    public Cursor mo929d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1503m.getVisibility() == 0 && this.f1503m.getWindowVisibility() == 0) {
            try {
                Cursor m934k = m934k(this.f1504n, charSequence2, 50);
                if (m934k != null) {
                    m934k.getCount();
                    return m934k;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo930e(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.mo930e(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    /* renamed from: g */
    public View mo931g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f3872l.inflate(this.f3870j, viewGroup, false);
        inflate.setTag(new ChildViewCache(inflate));
        ((ImageView) inflate.findViewById(C2507R.id.edit_query)).setImageResource(this.f1507q);
        return inflate;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3872l.inflate(this.f3871k, viewGroup, false);
            if (inflate != null) {
                ((ChildViewCache) inflate.getTag()).f1516a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View mo931g = mo931g(this.f1505o, this.f3861d, viewGroup);
            ((ChildViewCache) mo931g.getTag()).f1516a.setText(e2.toString());
            return mo931g;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public Drawable m932i(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(C0000a.m12i("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f1505o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(C0000a.m12i("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(C0000a.m12i("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(C0000a.m12i("More than two path segments: ", uri));
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException(C0000a.m12i("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(C0000a.m12i("No package found for authority: ", uri));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m933j(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.m933j(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: k */
    public Cursor m934k(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f1505o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3861d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3861d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1503m.m908s((CharSequence) tag);
        }
    }
}
