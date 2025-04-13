package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {

    /* renamed from: B */
    public static Method f1351B;

    /* renamed from: C */
    public static Method f1352C;

    /* renamed from: D */
    public static Method f1353D;

    /* renamed from: A */
    public PopupWindow f1354A;

    /* renamed from: b */
    public Context f1355b;

    /* renamed from: c */
    public ListAdapter f1356c;

    /* renamed from: d */
    public DropDownListView f1357d;

    /* renamed from: g */
    public int f1360g;

    /* renamed from: h */
    public int f1361h;

    /* renamed from: j */
    public boolean f1363j;

    /* renamed from: k */
    public boolean f1364k;

    /* renamed from: l */
    public boolean f1365l;

    /* renamed from: o */
    public DataSetObserver f1368o;

    /* renamed from: p */
    public View f1369p;

    /* renamed from: q */
    public AdapterView.OnItemClickListener f1370q;

    /* renamed from: r */
    public AdapterView.OnItemSelectedListener f1371r;

    /* renamed from: w */
    public final Handler f1376w;

    /* renamed from: y */
    public Rect f1378y;

    /* renamed from: z */
    public boolean f1379z;

    /* renamed from: e */
    public int f1358e = -2;

    /* renamed from: f */
    public int f1359f = -2;

    /* renamed from: i */
    public int f1362i = 1002;

    /* renamed from: m */
    public int f1366m = 0;

    /* renamed from: n */
    public int f1367n = Integer.MAX_VALUE;

    /* renamed from: s */
    public final ResizePopupRunnable f1372s = new ResizePopupRunnable();

    /* renamed from: t */
    public final PopupTouchInterceptor f1373t = new PopupTouchInterceptor();

    /* renamed from: u */
    public final PopupScrollListener f1374u = new PopupScrollListener();

    /* renamed from: v */
    public final ListSelectorHider f1375v = new ListSelectorHider();

    /* renamed from: x */
    public final Rect f1377x = new Rect();

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$1 */
    class C01161 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: b */
        public /* bridge */ /* synthetic */ ShowableListMenu mo554b() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$2 */
    class RunnableC01172 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ListPopupWindow f1380b;

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f1380b.f1369p;
            if (view == null || view.getWindowToken() == null) {
                return;
            }
            this.f1380b.mo571a();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m872a(PopupWindow popupWindow, View view, int i2, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i2, z);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m873a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m874b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f1357d;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.mo572c()) {
                ListPopupWindow.this.mo571a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                if ((ListPopupWindow.this.f1354A.getInputMethodMode() == 2) || ListPopupWindow.this.f1354A.getContentView() == null) {
                    return;
                }
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1376w.removeCallbacks(listPopupWindow.f1372s);
                ListPopupWindow.this.f1372s.run();
            }
        }
    }

    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1354A) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1354A.getWidth() && y >= 0 && y < ListPopupWindow.this.f1354A.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1376w.postDelayed(listPopupWindow.f1372s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.f1376w.removeCallbacks(listPopupWindow2.f1372s);
            return false;
        }
    }

    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f1357d;
            if (dropDownListView == null || !ViewCompat.m2173M(dropDownListView) || ListPopupWindow.this.f1357d.getCount() <= ListPopupWindow.this.f1357d.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f1357d.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f1367n) {
                listPopupWindow.f1354A.setInputMethodMode(2);
                ListPopupWindow.this.mo571a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1351B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1353D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1352C = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        this.f1355b = context;
        this.f1376w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f305p, i2, i3);
        this.f1360g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1361h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1363j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.f1354A = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: a */
    public void mo571a() {
        int i2;
        int m872a;
        int makeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        if (this.f1357d == null) {
            DropDownListView mo869q = mo869q(this.f1355b, !this.f1379z);
            this.f1357d = mo869q;
            mo869q.setAdapter(this.f1356c);
            this.f1357d.setOnItemClickListener(this.f1370q);
            this.f1357d.setFocusable(true);
            this.f1357d.setFocusableInTouchMode(true);
            this.f1357d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i3, long j2) {
                    DropDownListView dropDownListView2;
                    if (i3 == -1 || (dropDownListView2 = ListPopupWindow.this.f1357d) == null) {
                        return;
                    }
                    dropDownListView2.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f1357d.setOnScrollListener(this.f1374u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1371r;
            if (onItemSelectedListener != null) {
                this.f1357d.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.f1354A.setContentView(this.f1357d);
        }
        Drawable background = this.f1354A.getBackground();
        if (background != null) {
            background.getPadding(this.f1377x);
            Rect rect = this.f1377x;
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f1363j) {
                this.f1361h = -i3;
            }
        } else {
            this.f1377x.setEmpty();
            i2 = 0;
        }
        boolean z = this.f1354A.getInputMethodMode() == 2;
        View view = this.f1369p;
        int i4 = this.f1361h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1352C;
            if (method != null) {
                try {
                    m872a = ((Integer) method.invoke(this.f1354A, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            m872a = this.f1354A.getMaxAvailableHeight(view, i4);
        } else {
            m872a = Api24Impl.m872a(this.f1354A, view, i4, z);
        }
        if (this.f1358e == -1) {
            paddingBottom = m872a + i2;
        } else {
            int i5 = this.f1359f;
            if (i5 == -2) {
                int i6 = this.f1355b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f1377x;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i5 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                int i7 = this.f1355b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1377x;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect3.left + rect3.right), 1073741824);
            }
            int m854a = this.f1357d.m854a(makeMeasureSpec, m872a - 0, -1);
            paddingBottom = m854a + (m854a > 0 ? this.f1357d.getPaddingBottom() + this.f1357d.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.f1354A.getInputMethodMode() == 2;
        PopupWindowCompat.m2631b(this.f1354A, this.f1362i);
        if (this.f1354A.isShowing()) {
            if (ViewCompat.m2173M(this.f1369p)) {
                int i8 = this.f1359f;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f1369p.getWidth();
                }
                int i9 = this.f1358e;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f1354A.setWidth(this.f1359f == -1 ? -1 : 0);
                        this.f1354A.setHeight(0);
                    } else {
                        this.f1354A.setWidth(this.f1359f == -1 ? -1 : 0);
                        this.f1354A.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f1354A.setOutsideTouchable(true);
                this.f1354A.update(this.f1369p, this.f1360g, this.f1361h, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f1359f;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.f1369p.getWidth();
        }
        int i11 = this.f1358e;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.f1354A.setWidth(i10);
        this.f1354A.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1351B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1354A, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.m874b(this.f1354A, true);
        }
        this.f1354A.setOutsideTouchable(true);
        this.f1354A.setTouchInterceptor(this.f1373t);
        if (this.f1365l) {
            PopupWindowCompat.m2630a(this.f1354A, this.f1364k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1353D;
            if (method3 != null) {
                try {
                    method3.invoke(this.f1354A, this.f1378y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            Api29Impl.m873a(this.f1354A, this.f1378y);
        }
        PopupWindowCompat.m2632c(this.f1354A, this.f1369p, this.f1360g, this.f1361h, this.f1366m);
        this.f1357d.setSelection(-1);
        if ((!this.f1379z || this.f1357d.isInTouchMode()) && (dropDownListView = this.f1357d) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f1379z) {
            return;
        }
        this.f1376w.post(this.f1375v);
    }

    /* renamed from: b */
    public void m863b(@Nullable Drawable drawable) {
        this.f1354A.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: c */
    public boolean mo572c() {
        return this.f1354A.isShowing();
    }

    @Nullable
    /* renamed from: d */
    public Drawable m864d() {
        return this.f1354A.getBackground();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.f1354A.dismiss();
        this.f1354A.setContentView(null);
        this.f1357d = null;
        this.f1376w.removeCallbacks(this.f1372s);
    }

    /* renamed from: e */
    public int m865e() {
        return this.f1360g;
    }

    /* renamed from: g */
    public void m866g(int i2) {
        this.f1360g = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    /* renamed from: k */
    public ListView mo574k() {
        return this.f1357d;
    }

    /* renamed from: l */
    public void m867l(int i2) {
        this.f1361h = i2;
        this.f1363j = true;
    }

    /* renamed from: o */
    public int m868o() {
        if (this.f1363j) {
            return this.f1361h;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo777p(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1368o;
        if (dataSetObserver == null) {
            this.f1368o = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f1356c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1356c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1368o);
        }
        DropDownListView dropDownListView = this.f1357d;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1356c);
        }
    }

    @NonNull
    /* renamed from: q */
    public DropDownListView mo869q(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    /* renamed from: r */
    public void m870r(int i2) {
        Drawable background = this.f1354A.getBackground();
        if (background == null) {
            this.f1359f = i2;
            return;
        }
        background.getPadding(this.f1377x);
        Rect rect = this.f1377x;
        this.f1359f = rect.left + rect.right + i2;
    }

    /* renamed from: s */
    public void m871s(boolean z) {
        this.f1379z = z;
        this.f1354A.setFocusable(z);
    }
}
