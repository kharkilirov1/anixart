package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.swiftsoft.anixartd.C2507R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* renamed from: n0 */
    public static final PreQAutoCompleteTextViewReflector f1430n0;

    /* renamed from: A */
    public Rect f1431A;

    /* renamed from: B */
    public Rect f1432B;

    /* renamed from: C */
    public int[] f1433C;

    /* renamed from: D */
    public int[] f1434D;

    /* renamed from: E */
    public final ImageView f1435E;

    /* renamed from: F */
    public final Drawable f1436F;

    /* renamed from: G */
    public final int f1437G;

    /* renamed from: H */
    public final int f1438H;

    /* renamed from: I */
    public final Intent f1439I;

    /* renamed from: J */
    public final Intent f1440J;

    /* renamed from: K */
    public final CharSequence f1441K;

    /* renamed from: L */
    public OnQueryTextListener f1442L;

    /* renamed from: M */
    public OnCloseListener f1443M;

    /* renamed from: N */
    public View.OnFocusChangeListener f1444N;

    /* renamed from: O */
    public OnSuggestionListener f1445O;

    /* renamed from: P */
    public View.OnClickListener f1446P;

    /* renamed from: Q */
    public boolean f1447Q;

    /* renamed from: R */
    public boolean f1448R;

    /* renamed from: S */
    public CursorAdapter f1449S;

    /* renamed from: T */
    public boolean f1450T;

    /* renamed from: U */
    public CharSequence f1451U;

    /* renamed from: V */
    public boolean f1452V;

    /* renamed from: W */
    public boolean f1453W;

    /* renamed from: a0 */
    public int f1454a0;

    /* renamed from: b0 */
    public boolean f1455b0;

    /* renamed from: c0 */
    public CharSequence f1456c0;

    /* renamed from: d0 */
    public CharSequence f1457d0;

    /* renamed from: e0 */
    public boolean f1458e0;

    /* renamed from: f0 */
    public int f1459f0;

    /* renamed from: g0 */
    public SearchableInfo f1460g0;

    /* renamed from: h0 */
    public Bundle f1461h0;

    /* renamed from: i0 */
    public final Runnable f1462i0;

    /* renamed from: j0 */
    public Runnable f1463j0;

    /* renamed from: k0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1464k0;

    /* renamed from: l0 */
    public View.OnKeyListener f1465l0;

    /* renamed from: m0 */
    public TextWatcher f1466m0;

    /* renamed from: q */
    public final SearchAutoComplete f1467q;

    /* renamed from: r */
    public final View f1468r;

    /* renamed from: s */
    public final View f1469s;

    /* renamed from: t */
    public final View f1470t;

    /* renamed from: u */
    public final ImageView f1471u;

    /* renamed from: v */
    public final ImageView f1472v;

    /* renamed from: w */
    public final ImageView f1473w;

    /* renamed from: x */
    public final ImageView f1474x;

    /* renamed from: y */
    public final View f1475y;

    /* renamed from: z */
    public UpdatableTouchDelegate f1476z;

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m916a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m917b(SearchAutoComplete searchAutoComplete, int i2) {
            searchAutoComplete.setInputMethodMode(i2);
        }
    }

    public interface OnCloseListener {
        /* renamed from: a */
        boolean m918a();
    }

    public interface OnQueryTextListener {
        /* renamed from: a */
        boolean m919a(String str);

        /* renamed from: b */
        boolean m920b(String str);
    }

    public interface OnSuggestionListener {
        /* renamed from: a */
        boolean m921a(int i2);

        /* renamed from: b */
        boolean m922b(int i2);
    }

    public static class PreQAutoCompleteTextViewReflector {

        /* renamed from: a */
        public Method f1487a;

        /* renamed from: b */
        public Method f1488b;

        /* renamed from: c */
        public Method f1489c;

        @SuppressLint
        public PreQAutoCompleteTextViewReflector() {
            this.f1487a = null;
            this.f1488b = null;
            this.f1489c = null;
            m923a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1487a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1488b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1489c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m923a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public boolean f1490d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("SearchView.SavedState{");
            m24u.append(Integer.toHexString(System.identityHashCode(this)));
            m24u.append(" isIconified=");
            m24u.append(this.f1490d);
            m24u.append("}");
            return m24u.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeValue(Boolean.valueOf(this.f1490d));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1490d = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: f */
        public int f1491f;

        /* renamed from: g */
        public SearchView f1492g;

        /* renamed from: h */
        public boolean f1493h;

        /* renamed from: i */
        public final Runnable f1494i;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, C2507R.attr.autoCompleteTextViewStyle);
            this.f1494i = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f1493h) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f1493h = false;
                    }
                }
            };
            this.f1491f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void m924a() {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.m917b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.f1430n0;
            Objects.requireNonNull(preQAutoCompleteTextViewReflector);
            PreQAutoCompleteTextViewReflector.m923a();
            Method method = preQAutoCompleteTextViewReflector.f1489c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1491f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1493h) {
                removeCallbacks(this.f1494i);
                post(this.f1494i);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f1492g;
            searchView.m899A(searchView.f1448R);
            searchView.post(searchView.f1462i0);
            if (searchView.f1467q.hasFocus()) {
                searchView.m903n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1492g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1492g.hasFocus() && getVisibility() == 0) {
                this.f1493h = true;
                Context context = getContext();
                PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.f1430n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m924a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1493h = false;
                removeCallbacks(this.f1494i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1493h = true;
                    return;
                }
                this.f1493h = false;
                removeCallbacks(this.f1494i);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1492g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1491f = i2;
        }
    }

    public static class UpdatableTouchDelegate extends TouchDelegate {

        /* renamed from: a */
        public final View f1496a;

        /* renamed from: b */
        public final Rect f1497b;

        /* renamed from: c */
        public final Rect f1498c;

        /* renamed from: d */
        public final Rect f1499d;

        /* renamed from: e */
        public final int f1500e;

        /* renamed from: f */
        public boolean f1501f;

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1500e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1497b = new Rect();
            this.f1499d = new Rect();
            this.f1498c = new Rect();
            m925a(rect, rect2);
            this.f1496a = view;
        }

        /* renamed from: a */
        public void m925a(Rect rect, Rect rect2) {
            this.f1497b.set(rect);
            this.f1499d.set(rect);
            Rect rect3 = this.f1499d;
            int i2 = this.f1500e;
            rect3.inset(-i2, -i2);
            this.f1498c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f1501f;
                    if (z2 && !this.f1499d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f1501f;
                        this.f1501f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1497b.contains(x, y)) {
                    this.f1501f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f1498c.contains(x, y)) {
                Rect rect = this.f1498c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f1496a.getWidth() / 2, this.f1496a.getHeight() / 2);
            }
            return this.f1496a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1430n0 = Build.VERSION.SDK_INT < 29 ? new PreQAutoCompleteTextViewReflector() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2507R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2507R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1467q.setText(charSequence);
        this.f1467q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public final void m899A(boolean z) {
        this.f1448R = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1467q.getText());
        this.f1471u.setVisibility(i2);
        m915z(z2);
        this.f1468r.setVisibility(z ? 8 : 0);
        this.f1435E.setVisibility((this.f1435E.getDrawable() == null || this.f1447Q) ? 8 : 0);
        m911v();
        m900B(!z2);
        m914y();
    }

    /* renamed from: B */
    public final void m900B(boolean z) {
        int i2 = 8;
        if (this.f1455b0 && !this.f1448R && z) {
            this.f1472v.setVisibility(8);
            i2 = 0;
        }
        this.f1474x.setVisibility(i2);
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    /* renamed from: c */
    public void mo527c() {
        if (this.f1458e0) {
            return;
        }
        this.f1458e0 = true;
        int imeOptions = this.f1467q.getImeOptions();
        this.f1459f0 = imeOptions;
        this.f1467q.setImeOptions(imeOptions | 33554432);
        this.f1467q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1453W = true;
        super.clearFocus();
        this.f1467q.clearFocus();
        this.f1467q.setImeVisibility(false);
        this.f1453W = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    /* renamed from: d */
    public void mo528d() {
        this.f1467q.setText("");
        SearchAutoComplete searchAutoComplete = this.f1467q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1457d0 = "";
        clearFocus();
        m899A(true);
        this.f1467q.setImeOptions(this.f1459f0);
        this.f1458e0 = false;
    }

    public int getImeOptions() {
        return this.f1467q.getImeOptions();
    }

    public int getInputType() {
        return this.f1467q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1454a0;
    }

    public CharSequence getQuery() {
        return this.f1467q.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1451U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1460g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1441K : getContext().getText(this.f1460g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1438H;
    }

    public int getSuggestionRowLayout() {
        return this.f1437G;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f1449S;
    }

    /* renamed from: l */
    public final Intent m901l(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1457d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1461h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1460g0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent m902m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1461h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public void m903n() {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m916a(this.f1467q);
            return;
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = f1430n0;
        SearchAutoComplete searchAutoComplete = this.f1467q;
        Objects.requireNonNull(preQAutoCompleteTextViewReflector);
        PreQAutoCompleteTextViewReflector.m923a();
        Method method = preQAutoCompleteTextViewReflector.f1487a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector2 = f1430n0;
        SearchAutoComplete searchAutoComplete2 = this.f1467q;
        Objects.requireNonNull(preQAutoCompleteTextViewReflector2);
        PreQAutoCompleteTextViewReflector.m923a();
        Method method2 = preQAutoCompleteTextViewReflector2.f1488b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public void m904o(int i2, String str, String str2) {
        getContext().startActivity(m901l("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1462i0);
        post(this.f1463j0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1467q;
            Rect rect = this.f1431A;
            searchAutoComplete.getLocationInWindow(this.f1433C);
            getLocationInWindow(this.f1434D);
            int[] iArr = this.f1433C;
            int i6 = iArr[1];
            int[] iArr2 = this.f1434D;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.f1432B;
            Rect rect3 = this.f1431A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            UpdatableTouchDelegate updatableTouchDelegate = this.f1476z;
            if (updatableTouchDelegate != null) {
                updatableTouchDelegate.m925a(this.f1432B, this.f1431A);
                return;
            }
            UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(this.f1432B, this.f1431A, this.f1467q);
            this.f1476z = updatableTouchDelegate2;
            setTouchDelegate(updatableTouchDelegate2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1448R) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1454a0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1454a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1454a0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        m899A(savedState.f1490d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1490d = this.f1448R;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f1462i0);
    }

    /* renamed from: p */
    public void m905p() {
        if (!TextUtils.isEmpty(this.f1467q.getText())) {
            this.f1467q.setText("");
            this.f1467q.requestFocus();
            this.f1467q.setImeVisibility(true);
        } else if (this.f1447Q) {
            OnCloseListener onCloseListener = this.f1443M;
            if (onCloseListener == null || !onCloseListener.m918a()) {
                clearFocus();
                m899A(true);
            }
        }
    }

    /* renamed from: q */
    public boolean m906q(int i2) {
        int i3;
        String m926l;
        OnSuggestionListener onSuggestionListener = this.f1445O;
        if (onSuggestionListener != null && onSuggestionListener.m922b(i2)) {
            return false;
        }
        Cursor cursor = this.f1449S.f3861d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = SuggestionsAdapter.f1502z;
                String m926l2 = SuggestionsAdapter.m926l(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m926l2 == null) {
                    m926l2 = this.f1460g0.getSuggestIntentAction();
                }
                if (m926l2 == null) {
                    m926l2 = "android.intent.action.SEARCH";
                }
                String str = m926l2;
                String m926l3 = SuggestionsAdapter.m926l(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m926l3 == null) {
                    m926l3 = this.f1460g0.getSuggestIntentData();
                }
                if (m926l3 != null && (m926l = SuggestionsAdapter.m926l(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m926l3 = m926l3 + "/" + Uri.encode(m926l);
                }
                intent = m901l(str, m926l3 == null ? null : Uri.parse(m926l3), SuggestionsAdapter.m926l(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), SuggestionsAdapter.m926l(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.f1467q.setImeVisibility(false);
        this.f1467q.dismissDropDown();
        return true;
    }

    /* renamed from: r */
    public boolean m907r(int i2) {
        OnSuggestionListener onSuggestionListener = this.f1445O;
        if (onSuggestionListener != null && onSuggestionListener.m921a(i2)) {
            return false;
        }
        Editable text = this.f1467q.getText();
        Cursor cursor = this.f1449S.f3861d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return true;
        }
        CharSequence mo928c = this.f1449S.mo928c(cursor);
        if (mo928c != null) {
            setQuery(mo928c);
            return true;
        }
        setQuery(text);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.f1453W || !isFocusable()) {
            return false;
        }
        if (this.f1448R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1467q.requestFocus(i2, rect);
        if (requestFocus) {
            m899A(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public void m908s(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    @RestrictTo
    public void setAppSearchData(Bundle bundle) {
        this.f1461h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m905p();
        } else {
            m909t();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1447Q == z) {
            return;
        }
        this.f1447Q = z;
        m899A(z);
        m913x();
    }

    public void setImeOptions(int i2) {
        this.f1467q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1467q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1454a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.f1443M = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1444N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.f1442L = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1446P = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.f1445O = onSuggestionListener;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f1451U = charSequence;
        m913x();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1452V = z;
        CursorAdapter cursorAdapter = this.f1449S;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).f1508r = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r2, com.fasterxml.jackson.core.util.TextBuffer.MAX_SEGMENT_LEN) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1460g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1467q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1467q
            android.app.SearchableInfo r3 = r6.f1460g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1460g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1460g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1467q
            r3.setInputType(r7)
            androidx.cursoradapter.widget.CursorAdapter r7 = r6.f1449S
            if (r7 == 0) goto L42
            r7.mo927a(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f1460g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            androidx.appcompat.widget.SuggestionsAdapter r7 = new androidx.appcompat.widget.SuggestionsAdapter
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1460g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1464k0
            r7.<init>(r3, r6, r4, r5)
            r6.f1449S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1467q
            r3.setAdapter(r7)
            androidx.cursoradapter.widget.CursorAdapter r7 = r6.f1449S
            androidx.appcompat.widget.SuggestionsAdapter r7 = (androidx.appcompat.widget.SuggestionsAdapter) r7
            boolean r3 = r6.f1452V
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.f1508r = r3
        L6b:
            r6.m913x()
        L6e:
            android.app.SearchableInfo r7 = r6.f1460g0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f1460g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.f1439I
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f1460g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.f1440J
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f1455b0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1467q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f1448R
            r6.m899A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1450T = z;
        m899A(this.f1448R);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f1449S = cursorAdapter;
        this.f1467q.setAdapter(cursorAdapter);
    }

    /* renamed from: t */
    public void m909t() {
        m899A(false);
        this.f1467q.requestFocus();
        this.f1467q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1446P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: u */
    public void m910u() {
        Editable text = this.f1467q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.f1442L;
        if (onQueryTextListener == null || !onQueryTextListener.m920b(text.toString())) {
            if (this.f1460g0 != null) {
                m904o(0, null, text.toString());
            }
            this.f1467q.setImeVisibility(false);
            this.f1467q.dismissDropDown();
        }
    }

    /* renamed from: v */
    public final void m911v() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1467q.getText());
        if (!z2 && (!this.f1447Q || this.f1458e0)) {
            z = false;
        }
        this.f1473w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1473w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: w */
    public void m912w() {
        int[] iArr = this.f1467q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1469s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1470t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: x */
    public final void m913x() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1467q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f1447Q && this.f1436F != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.f1436F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1436F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: y */
    public final void m914y() {
        int i2 = 0;
        if (!((this.f1450T || this.f1455b0) && !this.f1448R) || (this.f1472v.getVisibility() != 0 && this.f1474x.getVisibility() != 0)) {
            i2 = 8;
        }
        this.f1470t.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r2.f1455b0 == false) goto L19;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m915z(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1450T
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f1455b0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f1448R
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f1455b0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f1472v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m915z(boolean):void");
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1431A = new Rect();
        this.f1432B = new Rect();
        this.f1433C = new int[2];
        this.f1434D = new int[2];
        this.f1462i0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public void run() {
                SearchView.this.m912w();
            }
        };
        this.f1463j0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public void run() {
                CursorAdapter cursorAdapter = SearchView.this.f1449S;
                if (cursorAdapter instanceof SuggestionsAdapter) {
                    cursorAdapter.mo927a(null);
                }
            }
        };
        this.f1464k0 = new WeakHashMap<>();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SearchView searchView = SearchView.this;
                if (view == searchView.f1471u) {
                    searchView.m909t();
                    return;
                }
                if (view == searchView.f1473w) {
                    searchView.m905p();
                    return;
                }
                if (view == searchView.f1472v) {
                    searchView.m910u();
                    return;
                }
                if (view != searchView.f1474x) {
                    if (view == searchView.f1467q) {
                        searchView.m903n();
                        return;
                    }
                    return;
                }
                SearchableInfo searchableInfo = searchView.f1460g0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m902m(searchView.f1440J, searchableInfo));
                        }
                    } else {
                        Intent intent = new Intent(searchView.f1439I);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        };
        this.f1465l0 = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                SearchView searchView = SearchView.this;
                if (searchView.f1460g0 == null) {
                    return false;
                }
                if (!searchView.f1467q.isPopupShowing() || SearchView.this.f1467q.getListSelection() == -1) {
                    if ((TextUtils.getTrimmedLength(SearchView.this.f1467q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                        return false;
                    }
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.m904o(0, null, searchView2.f1467q.getText().toString());
                    return true;
                }
                SearchView searchView3 = SearchView.this;
                if (searchView3.f1460g0 == null || searchView3.f1449S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i3 == 66 || i3 == 84 || i3 == 61) {
                    return searchView3.m906q(searchView3.f1467q.getListSelection());
                }
                if (i3 != 21 && i3 != 22) {
                    if (i3 != 19) {
                        return false;
                    }
                    searchView3.f1467q.getListSelection();
                    return false;
                }
                searchView3.f1467q.setSelection(i3 == 21 ? 0 : searchView3.f1467q.length());
                searchView3.f1467q.setListSelection(0);
                searchView3.f1467q.clearListSelection();
                searchView3.f1467q.m924a();
                return true;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                SearchView.this.m910u();
                return true;
            }
        };
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                SearchView.this.m906q(i3);
            }
        };
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i3, long j2) {
                SearchView.this.m907r(i3);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f1466m0 = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                SearchView searchView = SearchView.this;
                Editable text = searchView.f1467q.getText();
                searchView.f1457d0 = text;
                boolean z = !TextUtils.isEmpty(text);
                searchView.m915z(z);
                searchView.m900B(!z);
                searchView.m911v();
                searchView.m914y();
                if (searchView.f1442L != null && !TextUtils.equals(charSequence, searchView.f1456c0)) {
                    searchView.f1442L.m919a(charSequence.toString());
                }
                searchView.f1456c0 = charSequence.toString();
            }
        };
        int[] iArr = C0055R.styleable.f311v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(tintTypedArray.m964m(9, C2507R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2507R.id.search_src_text);
        this.f1467q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1468r = findViewById(C2507R.id.search_edit_frame);
        View findViewById = findViewById(C2507R.id.search_plate);
        this.f1469s = findViewById;
        View findViewById2 = findViewById(C2507R.id.submit_area);
        this.f1470t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C2507R.id.search_button);
        this.f1471u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2507R.id.search_go_btn);
        this.f1472v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2507R.id.search_close_btn);
        this.f1473w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2507R.id.search_voice_btn);
        this.f1474x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2507R.id.search_mag_icon);
        this.f1435E = imageView5;
        ViewCompat.m2204i0(findViewById, tintTypedArray.m958g(10));
        ViewCompat.m2204i0(findViewById2, tintTypedArray.m958g(14));
        imageView.setImageDrawable(tintTypedArray.m958g(13));
        imageView2.setImageDrawable(tintTypedArray.m958g(7));
        imageView3.setImageDrawable(tintTypedArray.m958g(4));
        imageView4.setImageDrawable(tintTypedArray.m958g(16));
        imageView5.setImageDrawable(tintTypedArray.m958g(13));
        this.f1436F = tintTypedArray.m958g(12);
        TooltipCompat.m998a(imageView, getResources().getString(C2507R.string.abc_searchview_description_search));
        this.f1437G = tintTypedArray.m964m(15, C2507R.layout.abc_search_dropdown_item_icons_2line);
        this.f1438H = tintTypedArray.m964m(5, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(this.f1466m0);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(this.f1465l0);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                SearchView searchView = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1444N;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                }
            }
        });
        setIconifiedByDefault(tintTypedArray.m952a(8, true));
        int m957f = tintTypedArray.m957f(1, -1);
        if (m957f != -1) {
            setMaxWidth(m957f);
        }
        this.f1441K = tintTypedArray.m966o(6);
        this.f1451U = tintTypedArray.m966o(11);
        int m961j = tintTypedArray.m961j(3, -1);
        if (m961j != -1) {
            setImeOptions(m961j);
        }
        int m961j2 = tintTypedArray.m961j(2, -1);
        if (m961j2 != -1) {
            setInputType(m961j2);
        }
        setFocusable(tintTypedArray.m952a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1439I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1440J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1475y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    SearchView searchView = SearchView.this;
                    if (searchView.f1475y.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f1469s.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean m1007b = ViewUtils.m1007b(searchView);
                        int dimensionPixelSize = searchView.f1447Q ? resources.getDimensionPixelSize(C2507R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C2507R.dimen.abc_dropdownitem_icon_width) : 0;
                        searchView.f1467q.getDropDownBackground().getPadding(rect);
                        searchView.f1467q.setDropDownHorizontalOffset(m1007b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                        searchView.f1467q.setDropDownWidth((((searchView.f1475y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        m899A(this.f1447Q);
        m913x();
    }
}
