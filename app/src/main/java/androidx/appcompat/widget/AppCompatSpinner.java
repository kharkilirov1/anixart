package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: j */
    @SuppressLint
    @StyleableRes
    public static final int[] f1211j = {R.attr.spinnerMode};

    /* renamed from: b */
    public final AppCompatBackgroundHelper f1212b;

    /* renamed from: c */
    public final Context f1213c;

    /* renamed from: d */
    public ForwardingListener f1214d;

    /* renamed from: e */
    public SpinnerAdapter f1215e;

    /* renamed from: f */
    public final boolean f1216f;

    /* renamed from: g */
    public SpinnerPopup f1217g;

    /* renamed from: h */
    public int f1218h;

    /* renamed from: i */
    public final Rect f1219i;

    @RequiresApi
    public static final class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m760a(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @RequiresApi
    public static final class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m761a(@NonNull View view) {
            return view.getTextAlignment();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m762b(@NonNull View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m763c(@NonNull View view, int i2) {
            view.setTextAlignment(i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m764d(@NonNull View view, int i2) {
            view.setTextDirection(i2);
        }
    }

    @RequiresApi
    public static final class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m765a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @VisibleForTesting
    public class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {

        /* renamed from: b */
        @VisibleForTesting
        public AlertDialog f1223b;

        /* renamed from: c */
        public ListAdapter f1224c;

        /* renamed from: d */
        public CharSequence f1225d;

        public DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: b */
        public void mo766b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: c */
        public boolean mo767c() {
            AlertDialog alertDialog = this.f1223b;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: d */
        public Drawable mo768d() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
            AlertDialog alertDialog = this.f1223b;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f1223b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: e */
        public int mo769e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: g */
        public void mo770g(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: h */
        public CharSequence mo771h() {
            return this.f1225d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: j */
        public void mo772j(CharSequence charSequence) {
            this.f1225d = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: l */
        public void mo773l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: m */
        public void mo774m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: n */
        public void mo775n(int i2, int i3) {
            if (this.f1224c == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1225d;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f1224c;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.AlertParams alertParams = builder.f413a;
            alertParams.f389r = listAdapter;
            alertParams.f390s = this;
            alertParams.f395x = selectedItemPosition;
            alertParams.f394w = true;
            AlertDialog create = builder.create();
            this.f1223b = create;
            ListView m366h = create.m366h();
            Api17Impl.m764d(m366h, i2);
            Api17Impl.m763c(m366h, i3);
            this.f1223b.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: o */
        public int mo776o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f1224c.getItemId(i2));
            }
            AlertDialog alertDialog = this.f1223b;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f1223b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: p */
        public void mo777p(ListAdapter listAdapter) {
            this.f1224c = listAdapter;
        }
    }

    public static class DropDownAdapter implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f1227b;

        /* renamed from: c */
        public ListAdapter f1228c;

        public DropDownAdapter(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f1227b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1228c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                    Api23Impl.m765a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1228c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1228c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1227b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class DropdownPopup extends ListPopupWindow implements SpinnerPopup {

        /* renamed from: E */
        public CharSequence f1229E;

        /* renamed from: F */
        public ListAdapter f1230F;

        /* renamed from: G */
        public final Rect f1231G;

        /* renamed from: H */
        public int f1232H;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.f1231G = new Rect();
            this.f1369p = AppCompatSpinner.this;
            m871s(true);
            this.f1370q = new AdapterView.OnItemClickListener(AppCompatSpinner.this) { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                    AppCompatSpinner.this.setSelection(i3);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        AppCompatSpinner.this.performItemClick(view, i3, dropdownPopup.f1230F.getItemId(i3));
                    }
                    DropdownPopup.this.dismiss();
                }
            };
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: h */
        public CharSequence mo771h() {
            return this.f1229E;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: j */
        public void mo772j(CharSequence charSequence) {
            this.f1229E = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: m */
        public void mo774m(int i2) {
            this.f1232H = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: n */
        public void mo775n(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean mo572c = mo572c();
            m778t();
            this.f1354A.setInputMethodMode(2);
            mo571a();
            DropDownListView dropDownListView = this.f1357d;
            dropDownListView.setChoiceMode(1);
            Api17Impl.m764d(dropDownListView, i2);
            Api17Impl.m763c(dropDownListView, i3);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.f1357d;
            if (mo572c() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (mo572c || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                    Objects.requireNonNull(dropdownPopup);
                    if (!(ViewCompat.m2173M(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(dropdownPopup.f1231G))) {
                        DropdownPopup.this.dismiss();
                    } else {
                        DropdownPopup.this.m778t();
                        DropdownPopup.this.mo571a();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f1354A.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        /* renamed from: p */
        public void mo777p(ListAdapter listAdapter) {
            super.mo777p(listAdapter);
            this.f1230F = listAdapter;
        }

        /* renamed from: t */
        public void m778t() {
            Drawable m864d = m864d();
            int i2 = 0;
            if (m864d != null) {
                m864d.getPadding(AppCompatSpinner.this.f1219i);
                i2 = ViewUtils.m1007b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1219i.right : -AppCompatSpinner.this.f1219i.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1219i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f1218h;
            if (i3 == -2) {
                int m758a = appCompatSpinner.m758a((SpinnerAdapter) this.f1230F, m864d());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1219i;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (m758a > i5) {
                    m758a = i5;
                }
                m870r(Math.max(m758a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                m870r((width - paddingLeft) - paddingRight);
            } else {
                m870r(i3);
            }
            this.f1360g = ViewUtils.m1007b(AppCompatSpinner.this) ? (((width - paddingRight) - this.f1359f) - this.f1232H) + i2 : paddingLeft + this.f1232H + i2;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public boolean f1238b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f1238b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1238b = parcel.readByte() != 0;
        }
    }

    @VisibleForTesting
    public interface SpinnerPopup {
        /* renamed from: b */
        void mo766b(Drawable drawable);

        /* renamed from: c */
        boolean mo767c();

        /* renamed from: d */
        Drawable mo768d();

        void dismiss();

        /* renamed from: e */
        int mo769e();

        /* renamed from: g */
        void mo770g(int i2);

        /* renamed from: h */
        CharSequence mo771h();

        /* renamed from: j */
        void mo772j(CharSequence charSequence);

        /* renamed from: l */
        void mo773l(int i2);

        /* renamed from: m */
        void mo774m(int i2);

        /* renamed from: n */
        void mo775n(int i2, int i3);

        /* renamed from: o */
        int mo776o();

        /* renamed from: p */
        void mo777p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f1219i = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.ThemeUtils.m945a(r9, r0)
            int[] r0 = androidx.appcompat.C0055R.styleable.f312w
            androidx.appcompat.widget.TintTypedArray r1 = new androidx.appcompat.widget.TintTypedArray
            r2 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r2)
            r1.<init>(r10, r0)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r0.<init>(r9)
            r9.f1212b = r0
            r0 = 4
            int r0 = r1.m964m(r0, r2)
            if (r0 == 0) goto L33
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>(r10, r0)
            r9.f1213c = r3
            goto L35
        L33:
            r9.f1213c = r10
        L35:
            r0 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.AppCompatSpinner.f1211j     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            boolean r5 = r4.hasValue(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4c
            if (r5 == 0) goto L5d
            int r3 = r4.getInt(r2, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4c
            goto L5d
        L48:
            r10 = move-exception
            r0 = r4
            goto Ld9
        L4c:
            r5 = move-exception
            goto L54
        L4e:
            r10 = move-exception
            goto Ld9
        L51:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L54:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L60
        L5d:
            r4.recycle()
        L60:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L9c
            if (r3 == r5) goto L67
            goto Laa
        L67:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r3 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r6 = r9.f1213c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f1213c
            int[] r7 = androidx.appcompat.C0055R.styleable.f312w
            androidx.appcompat.widget.TintTypedArray r6 = androidx.appcompat.widget.TintTypedArray.m951r(r6, r11, r7, r12, r2)
            r7 = 3
            r8 = -2
            int r7 = r6.m963l(r7, r8)
            r9.f1218h = r7
            android.graphics.drawable.Drawable r7 = r6.m958g(r5)
            android.widget.PopupWindow r8 = r3.f1354A
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r1.m965n(r4)
            r3.f1229E = r4
            android.content.res.TypedArray r4 = r6.f1582b
            r4.recycle()
            r9.f1217g = r3
            androidx.appcompat.widget.AppCompatSpinner$1 r4 = new androidx.appcompat.widget.AppCompatSpinner$1
            r4.<init>(r9)
            r9.f1214d = r4
            goto Laa
        L9c:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r3 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r3.<init>()
            r9.f1217g = r3
            java.lang.String r4 = r1.m965n(r4)
            r3.mo772j(r4)
        Laa:
            android.content.res.TypedArray r3 = r1.f1582b
            java.lang.CharSequence[] r2 = r3.getTextArray(r2)
            if (r2 == 0) goto Lc3
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r2)
            r10 = 2131558798(0x7f0d018e, float:1.8742922E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lc3:
            android.content.res.TypedArray r10 = r1.f1582b
            r10.recycle()
            r9.f1216f = r5
            android.widget.SpinnerAdapter r10 = r9.f1215e
            if (r10 == 0) goto Ld3
            r9.setAdapter(r10)
            r9.f1215e = r0
        Ld3:
            androidx.appcompat.widget.AppCompatBackgroundHelper r10 = r9.f1212b
            r10.m717d(r11, r12)
            return
        Ld9:
            if (r0 == 0) goto Lde
            r0.recycle()
        Lde:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public int m758a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f1219i);
        Rect rect = this.f1219i;
        return i3 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void m759b() {
        this.f1217g.mo775n(Api17Impl.m762b(this), Api17Impl.m761a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m714a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.f1217g;
        return spinnerPopup != null ? spinnerPopup.mo769e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.f1217g;
        return spinnerPopup != null ? spinnerPopup.mo776o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1217g != null ? this.f1218h : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final SpinnerPopup getInternalPopup() {
        return this.f1217g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.f1217g;
        return spinnerPopup != null ? spinnerPopup.mo768d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1213c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.f1217g;
        return spinnerPopup != null ? spinnerPopup.mo771h() : super.getPrompt();
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m715b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m716c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup == null || !spinnerPopup.mo767c()) {
            return;
        }
        this.f1217g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1217g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m758a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1238b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!AppCompatSpinner.this.getInternalPopup().mo767c()) {
                    AppCompatSpinner.this.m759b();
                }
                ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    Api16Impl.m760a(viewTreeObserver2, this);
                }
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.f1217g;
        savedState.f1238b = spinnerPopup != null && spinnerPopup.mo767c();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f1214d;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.mo767c()) {
            return true;
        }
        m759b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m718e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m719f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            spinnerPopup.mo774m(i2);
            this.f1217g.mo770g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup != null) {
            spinnerPopup.mo773l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f1217g != null) {
            this.f1218h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup != null) {
            spinnerPopup.mo766b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i2) {
        setPopupBackgroundDrawable(AppCompatResources.m497b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.f1217g;
        if (spinnerPopup != null) {
            spinnerPopup.mo772j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m721h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1212b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m722i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1216f) {
            this.f1215e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1217g != null) {
            Context context = this.f1213c;
            if (context == null) {
                context = getContext();
            }
            this.f1217g.mo777p(new DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }
}
