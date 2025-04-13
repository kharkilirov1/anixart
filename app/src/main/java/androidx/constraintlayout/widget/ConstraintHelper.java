package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: b */
    public int[] f2756b;

    /* renamed from: c */
    public int f2757c;

    /* renamed from: d */
    public Context f2758d;

    /* renamed from: e */
    public Helper f2759e;

    /* renamed from: f */
    public String f2760f;

    /* renamed from: g */
    public String f2761g;

    /* renamed from: h */
    public View[] f2762h;

    /* renamed from: i */
    public HashMap<Integer, String> f2763i;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2756b = new int[32];
        this.f2762h = null;
        this.f2763i = new HashMap<>();
        this.f2758d = context;
        mo1376l(null);
    }

    /* renamed from: c */
    public final void m1421c(String str) {
        if (str == null || str.length() == 0 || this.f2758d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m1427j = m1427j(trim);
        if (m1427j != 0) {
            this.f2763i.put(Integer.valueOf(m1427j), trim);
            m1422d(m1427j);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: d */
    public final void m1422d(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f2757c + 1;
        int[] iArr = this.f2756b;
        if (i3 > iArr.length) {
            this.f2756b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2756b;
        int i4 = this.f2757c;
        iArr2[i4] = i2;
        this.f2757c = i4 + 1;
    }

    /* renamed from: e */
    public final void m1423e(String str) {
        if (str == null || str.length() == 0 || this.f2758d == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f2807Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder m24u = C0000a.m24u("to use ConstraintTag view ");
                    m24u.append(childAt.getClass().getSimpleName());
                    m24u.append(" must have an ID");
                    Log.w("ConstraintHelper", m24u.toString());
                } else {
                    m1422d(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    public void m1424f() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m1425g((ConstraintLayout) parent);
    }

    /* renamed from: g */
    public void m1425g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f2757c; i2++) {
            View m1433e = constraintLayout.m1433e(this.f2756b[i2]);
            if (m1433e != null) {
                m1433e.setVisibility(visibility);
                if (elevation > 0.0f) {
                    m1433e.setTranslationZ(m1433e.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2756b, this.f2757c);
    }

    /* renamed from: h */
    public void mo1381h(ConstraintLayout constraintLayout) {
    }

    /* renamed from: i */
    public final int m1426i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f2758d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: j */
    public final int m1427j(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m1432d = constraintLayout.m1432d(0, str);
            if (m1432d instanceof Integer) {
                i2 = ((Integer) m1432d).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = m1426i(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = C0218R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.f2758d.getResources().getIdentifier(str, "id", this.f2758d.getPackageName()) : i2;
    }

    /* renamed from: k */
    public View[] m1428k(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2762h;
        if (viewArr == null || viewArr.length != this.f2757c) {
            this.f2762h = new View[this.f2757c];
        }
        for (int i2 = 0; i2 < this.f2757c; i2++) {
            this.f2762h[i2] = constraintLayout.m1433e(this.f2756b[i2]);
        }
        return this.f2762h;
    }

    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2760f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2761g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public void mo1379m(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: n */
    public void mo1382n(ConstraintLayout constraintLayout) {
    }

    /* renamed from: o */
    public void mo1383o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2760f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2761g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: p */
    public void m1429p() {
        if (this.f2759e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2842q0 = (ConstraintWidget) this.f2759e;
        }
    }

    public void setIds(String str) {
        this.f2760f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2757c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1421c(str.substring(i2));
                return;
            } else {
                m1421c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2761g = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2757c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1423e(str.substring(i2));
                return;
            } else {
                m1423e(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2760f = null;
        this.f2757c = 0;
        for (int i2 : iArr) {
            m1422d(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f2760f == null) {
            m1422d(i2);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2756b = new int[32];
        this.f2762h = null;
        this.f2763i = new HashMap<>();
        this.f2758d = context;
        mo1376l(attributeSet);
    }
}
