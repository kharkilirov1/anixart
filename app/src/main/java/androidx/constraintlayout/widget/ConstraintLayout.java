package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: s */
    public static SharedValues f2764s;

    /* renamed from: b */
    public SparseArray<View> f2765b;

    /* renamed from: c */
    public ArrayList<ConstraintHelper> f2766c;

    /* renamed from: d */
    public ConstraintWidgetContainer f2767d;

    /* renamed from: e */
    public int f2768e;

    /* renamed from: f */
    public int f2769f;

    /* renamed from: g */
    public int f2770g;

    /* renamed from: h */
    public int f2771h;

    /* renamed from: i */
    public boolean f2772i;

    /* renamed from: j */
    public int f2773j;

    /* renamed from: k */
    public ConstraintSet f2774k;

    /* renamed from: l */
    public ConstraintLayoutStates f2775l;

    /* renamed from: m */
    public int f2776m;

    /* renamed from: n */
    public HashMap<String, Integer> f2777n;

    /* renamed from: o */
    public SparseArray<ConstraintWidget> f2778o;

    /* renamed from: p */
    public Measurer f2779p;

    /* renamed from: q */
    public int f2780q;

    /* renamed from: r */
    public int f2781r;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    public static /* synthetic */ class C02171 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2782a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f2782a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2782a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2782a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2782a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class Measurer implements BasicMeasure.Measurer {

        /* renamed from: a */
        public ConstraintLayout f2853a;

        /* renamed from: b */
        public int f2854b;

        /* renamed from: c */
        public int f2855c;

        /* renamed from: d */
        public int f2856d;

        /* renamed from: e */
        public int f2857e;

        /* renamed from: f */
        public int f2858f;

        /* renamed from: g */
        public int f2859g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f2853a = constraintLayout;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        /* renamed from: a */
        public final void mo1325a() {
            int childCount = this.f2853a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f2853a.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f3023c != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f3023c.getLayoutParams();
                        layoutParams2.f2842q0.f2213n0 = 0;
                        ConstraintWidget.DimensionBehaviour m1281q = layoutParams.f2842q0.m1281q();
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (m1281q != dimensionBehaviour) {
                            layoutParams.f2842q0.m1267X(layoutParams2.f2842q0.m1289y());
                        }
                        if (layoutParams.f2842q0.m1288x() != dimensionBehaviour) {
                            layoutParams.f2842q0.m1262S(layoutParams2.f2842q0.m1280p());
                        }
                        layoutParams2.f2842q0.f2213n0 = 8;
                    }
                }
            }
            int size = this.f2853a.f2766c.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    Objects.requireNonNull(this.f2853a.f2766c.get(i3));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01d1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01f1  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        @android.annotation.SuppressLint
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo1326b(androidx.constraintlayout.core.widgets.ConstraintWidget r18, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
            /*
                Method dump skipped, instructions count: 744
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.mo1326b(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
        }

        /* renamed from: c */
        public final boolean m1442c(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2765b = new SparseArray<>();
        this.f2766c = new ArrayList<>(4);
        this.f2767d = new ConstraintWidgetContainer();
        this.f2768e = 0;
        this.f2769f = 0;
        this.f2770g = Integer.MAX_VALUE;
        this.f2771h = Integer.MAX_VALUE;
        this.f2772i = true;
        this.f2773j = 257;
        this.f2774k = null;
        this.f2775l = null;
        this.f2776m = -1;
        this.f2777n = new HashMap<>();
        this.f2778o = new SparseArray<>();
        this.f2779p = new Measurer(this);
        this.f2780q = 0;
        this.f2781r = 0;
        m1435h(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static SharedValues getSharedValues() {
        if (f2764s == null) {
            f2764s = new SharedValues();
        }
        return f2764s;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x02f5 -> B:76:0x02f6). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1430a(boolean r21, android.view.View r22, androidx.constraintlayout.core.widgets.ConstraintWidget r23, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r24, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r25) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1430a(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public Object m1432d(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2777n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2777n.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2766c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f2766c.get(i2).mo1383o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public View m1433e(int i2) {
        return this.f2765b.get(i2);
    }

    /* renamed from: f */
    public final ConstraintWidget m1434f(View view) {
        if (view == this) {
            return this.f2767d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f2842q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f2842q0;
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f2772i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f2771h;
    }

    public int getMaxWidth() {
        return this.f2770g;
    }

    public int getMinHeight() {
        return this.f2769f;
    }

    public int getMinWidth() {
        return this.f2768e;
    }

    public int getOptimizationLevel() {
        return this.f2767d.f2257R0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb = new StringBuilder();
        if (this.f2767d.f2204j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f2767d.f2204j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f2767d.f2204j = "parent";
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.f2767d;
        if (constraintWidgetContainer.f2217p0 == null) {
            constraintWidgetContainer.f2217p0 = constraintWidgetContainer.f2204j;
            StringBuilder m24u = C0000a.m24u(" setDebugName ");
            m24u.append(this.f2767d.f2217p0);
            Log.v("ConstraintLayout", m24u.toString());
        }
        Iterator<ConstraintWidget> it = this.f2767d.f2331E0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f2209l0;
            if (view != null) {
                if (next.f2204j == null && (id2 = view.getId()) != -1) {
                    next.f2204j = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f2217p0 == null) {
                    next.f2217p0 = next.f2204j;
                    StringBuilder m24u2 = C0000a.m24u(" setDebugName ");
                    m24u2.append(next.f2217p0);
                    Log.v("ConstraintLayout", m24u2.toString());
                }
            }
        }
        this.f2767d.mo1285u(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final void m1435h(AttributeSet attributeSet, int i2, int i3) {
        ConstraintWidgetContainer constraintWidgetContainer = this.f2767d;
        constraintWidgetContainer.f2209l0 = this;
        constraintWidgetContainer.m1301k0(this.f2779p);
        this.f2765b.put(getId(), this);
        this.f2774k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f2768e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2768e);
                } else if (index == 17) {
                    this.f2769f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2769f);
                } else if (index == 14) {
                    this.f2770g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2770g);
                } else if (index == 15) {
                    this.f2771h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2771h);
                } else if (index == 113) {
                    this.f2773j = obtainStyledAttributes.getInt(index, this.f2773j);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1397j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2775l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2774k = constraintSet;
                        constraintSet.m1455g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2774k = null;
                    }
                    this.f2776m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2767d.m1302l0(this.f2773j);
    }

    /* renamed from: i */
    public boolean m1436i() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: j */
    public void mo1397j(int i2) {
        this.f2775l = new ConstraintLayoutStates(getContext(), this, i2);
    }

    /* renamed from: k */
    public void m1437k(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Measurer measurer = this.f2779p;
        int i6 = measurer.f2857e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + measurer.f2856d, i2, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int min = Math.min(this.f2770g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f2771h, resolveSizeAndState2);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f2842q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f2816d0 || layoutParams.f2818e0 || isInEditMode) && !layoutParams.f2820f0) {
                int m1290z = constraintWidget.m1290z();
                int m1246A = constraintWidget.m1246A();
                int m1289y = constraintWidget.m1289y() + m1290z;
                int m1280p = constraintWidget.m1280p() + m1246A;
                childAt.layout(m1290z, m1246A, m1289y, m1280p);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m1290z, m1246A, m1289y, m1280p);
                }
            }
        }
        int size = this.f2766c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f2766c.get(i7).mo1382n(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z;
        String str;
        int m1426i;
        ConstraintWidget constraintWidget;
        if (this.f2780q == i2) {
            int i4 = this.f2781r;
        }
        if (!this.f2772i) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                if (getChildAt(i5).isLayoutRequested()) {
                    this.f2772i = true;
                    break;
                }
                i5++;
            }
        }
        boolean z2 = this.f2772i;
        this.f2780q = i2;
        this.f2781r = i3;
        this.f2767d.f2249J0 = m1436i();
        if (this.f2772i) {
            this.f2772i = false;
            int childCount2 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i6).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i6++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i7 = 0; i7 < childCount3; i7++) {
                    ConstraintWidget m1434f = m1434f(getChildAt(i7));
                    if (m1434f != null) {
                        m1434f.mo1253J();
                    }
                }
                if (isInEditMode) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt = getChildAt(i8);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            m1439r(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                constraintWidget = this.f2767d;
                            } else {
                                View view = this.f2765b.get(id2);
                                if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                constraintWidget = view == this ? this.f2767d : view == null ? null : ((LayoutParams) view.getLayoutParams()).f2842q0;
                            }
                            constraintWidget.f2217p0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f2776m != -1) {
                    for (int i9 = 0; i9 < childCount3; i9++) {
                        View childAt2 = getChildAt(i9);
                        if (childAt2.getId() == this.f2776m && (childAt2 instanceof Constraints)) {
                            this.f2774k = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet = this.f2774k;
                if (constraintSet != null) {
                    constraintSet.m1450b(this, true);
                }
                this.f2767d.f2331E0.clear();
                int size = this.f2766c.size();
                if (size > 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        ConstraintHelper constraintHelper = this.f2766c.get(i10);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f2760f);
                        }
                        Helper helper = constraintHelper.f2759e;
                        if (helper != null) {
                            helper.mo1314a();
                            for (int i11 = 0; i11 < constraintHelper.f2757c; i11++) {
                                int i12 = constraintHelper.f2756b[i11];
                                View m1433e = m1433e(i12);
                                if (m1433e == null && (m1426i = constraintHelper.m1426i(this, (str = constraintHelper.f2763i.get(Integer.valueOf(i12))))) != 0) {
                                    constraintHelper.f2756b[i11] = m1426i;
                                    constraintHelper.f2763i.put(Integer.valueOf(m1426i), str);
                                    m1433e = m1433e(m1426i);
                                }
                                if (m1433e != null) {
                                    constraintHelper.f2759e.mo1315b(m1434f(m1433e));
                                }
                            }
                            constraintHelper.f2759e.mo1316c(this.f2767d);
                        }
                    }
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f3022b == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f3024d);
                        }
                        View findViewById = findViewById(placeholder.f3022b);
                        placeholder.f3023c = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).f2820f0 = true;
                            placeholder.f3023c.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.f2778o.clear();
                this.f2778o.put(0, this.f2767d);
                this.f2778o.put(getId(), this.f2767d);
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt4 = getChildAt(i14);
                    this.f2778o.put(childAt4.getId(), m1434f(childAt4));
                }
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt5 = getChildAt(i15);
                    ConstraintWidget m1434f2 = m1434f(childAt5);
                    if (m1434f2 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        ConstraintWidgetContainer constraintWidgetContainer = this.f2767d;
                        constraintWidgetContainer.f2331E0.add(m1434f2);
                        ConstraintWidget constraintWidget2 = m1434f2.f2181V;
                        if (constraintWidget2 != null) {
                            ((WidgetContainer) constraintWidget2).f2331E0.remove(m1434f2);
                            m1434f2.mo1253J();
                        }
                        m1434f2.f2181V = constraintWidgetContainer;
                        m1430a(isInEditMode, childAt5, m1434f2, layoutParams, this.f2778o);
                    }
                }
            }
            if (z) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f2767d;
                constraintWidgetContainer2.f2245F0.m1324c(constraintWidgetContainer2);
            }
        }
        m1438q(this.f2767d, this.f2773j, i2, i3);
        int m1289y = this.f2767d.m1289y();
        int m1280p = this.f2767d.m1280p();
        ConstraintWidgetContainer constraintWidgetContainer3 = this.f2767d;
        m1437k(i2, i3, m1289y, m1280p, constraintWidgetContainer3.f2258S0, constraintWidgetContainer3.f2259T0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget m1434f = m1434f(view);
        if ((view instanceof Guideline) && !(m1434f instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.f2842q0 = guideline;
            layoutParams.f2816d0 = true;
            guideline.m1313b0(layoutParams.f2804V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m1429p();
            ((LayoutParams) view.getLayoutParams()).f2818e0 = true;
            if (!this.f2766c.contains(constraintHelper)) {
                this.f2766c.add(constraintHelper);
            }
        }
        this.f2765b.put(view.getId(), view);
        this.f2772i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2765b.remove(view.getId());
        ConstraintWidget m1434f = m1434f(view);
        this.f2767d.f2331E0.remove(m1434f);
        m1434f.mo1253J();
        this.f2766c.remove(view);
        this.f2772i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1438q(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1438q(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, int, int, int):void");
    }

    /* renamed from: r */
    public void m1439r(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2777n == null) {
                this.f2777n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2777n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2772i = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m1440s(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i2, ConstraintAnchor.Type type) {
        View view = this.f2765b.get(i2);
        ConstraintWidget constraintWidget2 = sparseArray.get(i2);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f2814c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f2814c0 = true;
            layoutParams2.f2842q0.f2164E = true;
        }
        constraintWidget.mo1277m(type2).m1233b(constraintWidget2.mo1277m(type), layoutParams.f2786D, layoutParams.f2785C, true);
        constraintWidget.f2164E = true;
        constraintWidget.mo1277m(ConstraintAnchor.Type.TOP).m1242k();
        constraintWidget.mo1277m(ConstraintAnchor.Type.BOTTOM).m1242k();
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.f2774k = constraintSet;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f2765b.remove(getId());
        super.setId(i2);
        this.f2765b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f2771h) {
            return;
        }
        this.f2771h = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f2770g) {
            return;
        }
        this.f2770g = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f2769f) {
            return;
        }
        this.f2769f = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f2768e) {
            return;
        }
        this.f2768e = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        ConstraintLayoutStates constraintLayoutStates = this.f2775l;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.f2866f = constraintsChangedListener;
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f2773j = i2;
        ConstraintWidgetContainer constraintWidgetContainer = this.f2767d;
        constraintWidgetContainer.f2257R0 = i2;
        LinearSystem.f1903p = constraintWidgetContainer.m1300j0(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2765b = new SparseArray<>();
        this.f2766c = new ArrayList<>(4);
        this.f2767d = new ConstraintWidgetContainer();
        this.f2768e = 0;
        this.f2769f = 0;
        this.f2770g = Integer.MAX_VALUE;
        this.f2771h = Integer.MAX_VALUE;
        this.f2772i = true;
        this.f2773j = 257;
        this.f2774k = null;
        this.f2775l = null;
        this.f2776m = -1;
        this.f2777n = new HashMap<>();
        this.f2778o = new SparseArray<>();
        this.f2779p = new Measurer(this);
        this.f2780q = 0;
        this.f2781r = 0;
        m1435h(attributeSet, i2, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f2783A;

        /* renamed from: B */
        public int f2784B;

        /* renamed from: C */
        public int f2785C;

        /* renamed from: D */
        public int f2786D;

        /* renamed from: E */
        public float f2787E;

        /* renamed from: F */
        public float f2788F;

        /* renamed from: G */
        public String f2789G;

        /* renamed from: H */
        public float f2790H;

        /* renamed from: I */
        public float f2791I;

        /* renamed from: J */
        public int f2792J;

        /* renamed from: K */
        public int f2793K;

        /* renamed from: L */
        public int f2794L;

        /* renamed from: M */
        public int f2795M;

        /* renamed from: N */
        public int f2796N;

        /* renamed from: O */
        public int f2797O;

        /* renamed from: P */
        public int f2798P;

        /* renamed from: Q */
        public int f2799Q;

        /* renamed from: R */
        public float f2800R;

        /* renamed from: S */
        public float f2801S;

        /* renamed from: T */
        public int f2802T;

        /* renamed from: U */
        public int f2803U;

        /* renamed from: V */
        public int f2804V;

        /* renamed from: W */
        public boolean f2805W;

        /* renamed from: X */
        public boolean f2806X;

        /* renamed from: Y */
        public String f2807Y;

        /* renamed from: Z */
        public int f2808Z;

        /* renamed from: a */
        public int f2809a;

        /* renamed from: a0 */
        public boolean f2810a0;

        /* renamed from: b */
        public int f2811b;

        /* renamed from: b0 */
        public boolean f2812b0;

        /* renamed from: c */
        public float f2813c;

        /* renamed from: c0 */
        public boolean f2814c0;

        /* renamed from: d */
        public boolean f2815d;

        /* renamed from: d0 */
        public boolean f2816d0;

        /* renamed from: e */
        public int f2817e;

        /* renamed from: e0 */
        public boolean f2818e0;

        /* renamed from: f */
        public int f2819f;

        /* renamed from: f0 */
        public boolean f2820f0;

        /* renamed from: g */
        public int f2821g;

        /* renamed from: g0 */
        public int f2822g0;

        /* renamed from: h */
        public int f2823h;

        /* renamed from: h0 */
        public int f2824h0;

        /* renamed from: i */
        public int f2825i;

        /* renamed from: i0 */
        public int f2826i0;

        /* renamed from: j */
        public int f2827j;

        /* renamed from: j0 */
        public int f2828j0;

        /* renamed from: k */
        public int f2829k;

        /* renamed from: k0 */
        public int f2830k0;

        /* renamed from: l */
        public int f2831l;

        /* renamed from: l0 */
        public int f2832l0;

        /* renamed from: m */
        public int f2833m;

        /* renamed from: m0 */
        public float f2834m0;

        /* renamed from: n */
        public int f2835n;

        /* renamed from: n0 */
        public int f2836n0;

        /* renamed from: o */
        public int f2837o;

        /* renamed from: o0 */
        public int f2838o0;

        /* renamed from: p */
        public int f2839p;

        /* renamed from: p0 */
        public float f2840p0;

        /* renamed from: q */
        public int f2841q;

        /* renamed from: q0 */
        public ConstraintWidget f2842q0;

        /* renamed from: r */
        public float f2843r;

        /* renamed from: s */
        public int f2844s;

        /* renamed from: t */
        public int f2845t;

        /* renamed from: u */
        public int f2846u;

        /* renamed from: v */
        public int f2847v;

        /* renamed from: w */
        public int f2848w;

        /* renamed from: x */
        public int f2849x;

        /* renamed from: y */
        public int f2850y;

        /* renamed from: z */
        public int f2851z;

        public static class Table {

            /* renamed from: a */
            public static final SparseIntArray f2852a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2852a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceListItem, 49);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 21);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textColorSearchUrl, 22);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 23);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 24);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, 25);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 26);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, 55);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(C4632R.styleable.AppCompatTheme_tooltipForegroundColor, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2809a = -1;
            this.f2811b = -1;
            this.f2813c = -1.0f;
            this.f2815d = true;
            this.f2817e = -1;
            this.f2819f = -1;
            this.f2821g = -1;
            this.f2823h = -1;
            this.f2825i = -1;
            this.f2827j = -1;
            this.f2829k = -1;
            this.f2831l = -1;
            this.f2833m = -1;
            this.f2835n = -1;
            this.f2837o = -1;
            this.f2839p = -1;
            this.f2841q = 0;
            this.f2843r = 0.0f;
            this.f2844s = -1;
            this.f2845t = -1;
            this.f2846u = -1;
            this.f2847v = -1;
            this.f2848w = Integer.MIN_VALUE;
            this.f2849x = Integer.MIN_VALUE;
            this.f2850y = Integer.MIN_VALUE;
            this.f2851z = Integer.MIN_VALUE;
            this.f2783A = Integer.MIN_VALUE;
            this.f2784B = Integer.MIN_VALUE;
            this.f2785C = Integer.MIN_VALUE;
            this.f2786D = 0;
            this.f2787E = 0.5f;
            this.f2788F = 0.5f;
            this.f2789G = null;
            this.f2790H = -1.0f;
            this.f2791I = -1.0f;
            this.f2792J = 0;
            this.f2793K = 0;
            this.f2794L = 0;
            this.f2795M = 0;
            this.f2796N = 0;
            this.f2797O = 0;
            this.f2798P = 0;
            this.f2799Q = 0;
            this.f2800R = 1.0f;
            this.f2801S = 1.0f;
            this.f2802T = -1;
            this.f2803U = -1;
            this.f2804V = -1;
            this.f2805W = false;
            this.f2806X = false;
            this.f2807Y = null;
            this.f2808Z = 0;
            this.f2810a0 = true;
            this.f2812b0 = true;
            this.f2814c0 = false;
            this.f2816d0 = false;
            this.f2818e0 = false;
            this.f2820f0 = false;
            this.f2822g0 = -1;
            this.f2824h0 = -1;
            this.f2826i0 = -1;
            this.f2828j0 = -1;
            this.f2830k0 = Integer.MIN_VALUE;
            this.f2832l0 = Integer.MIN_VALUE;
            this.f2834m0 = 0.5f;
            this.f2842q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = Table.f2852a.get(index);
                switch (i3) {
                    case 1:
                        this.f2804V = obtainStyledAttributes.getInt(index, this.f2804V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2839p);
                        this.f2839p = resourceId;
                        if (resourceId == -1) {
                            this.f2839p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2841q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2841q);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f2843r) % 360.0f;
                        this.f2843r = f2;
                        if (f2 < 0.0f) {
                            this.f2843r = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2809a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2809a);
                        break;
                    case 6:
                        this.f2811b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2811b);
                        break;
                    case 7:
                        this.f2813c = obtainStyledAttributes.getFloat(index, this.f2813c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2817e);
                        this.f2817e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2817e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2819f);
                        this.f2819f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2819f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2821g);
                        this.f2821g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2821g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2823h);
                        this.f2823h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2823h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2825i);
                        this.f2825i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2825i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2827j);
                        this.f2827j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2827j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2829k);
                        this.f2829k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2829k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2831l);
                        this.f2831l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2831l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2833m);
                        this.f2833m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2833m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2844s);
                        this.f2844s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2844s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2845t);
                        this.f2845t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2845t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2846u);
                        this.f2846u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2846u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2847v);
                        this.f2847v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2847v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2848w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2848w);
                        break;
                    case 22:
                        this.f2849x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2849x);
                        break;
                    case 23:
                        this.f2850y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2850y);
                        break;
                    case 24:
                        this.f2851z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2851z);
                        break;
                    case 25:
                        this.f2783A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2783A);
                        break;
                    case 26:
                        this.f2784B = obtainStyledAttributes.getDimensionPixelSize(index, this.f2784B);
                        break;
                    case 27:
                        this.f2805W = obtainStyledAttributes.getBoolean(index, this.f2805W);
                        break;
                    case 28:
                        this.f2806X = obtainStyledAttributes.getBoolean(index, this.f2806X);
                        break;
                    case 29:
                        this.f2787E = obtainStyledAttributes.getFloat(index, this.f2787E);
                        break;
                    case 30:
                        this.f2788F = obtainStyledAttributes.getFloat(index, this.f2788F);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2794L = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2795M = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2796N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2796N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2796N) == -2) {
                                this.f2796N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2798P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2798P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2798P) == -2) {
                                this.f2798P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2800R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2800R));
                        this.f2794L = 2;
                        break;
                    case 36:
                        try {
                            this.f2797O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2797O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2797O) == -2) {
                                this.f2797O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2799Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2799Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2799Q) == -2) {
                                this.f2799Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.f2801S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2801S));
                        this.f2795M = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                ConstraintSet.m1448i(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f2790H = obtainStyledAttributes.getFloat(index, this.f2790H);
                                break;
                            case 46:
                                this.f2791I = obtainStyledAttributes.getFloat(index, this.f2791I);
                                break;
                            case 47:
                                this.f2792J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2793K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.f2802T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2802T);
                                break;
                            case 50:
                                this.f2803U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2803U);
                                break;
                            case 51:
                                this.f2807Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2835n);
                                this.f2835n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2835n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2837o);
                                this.f2837o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2837o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f2786D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2786D);
                                break;
                            case 55:
                                this.f2785C = obtainStyledAttributes.getDimensionPixelSize(index, this.f2785C);
                                break;
                            default:
                                switch (i3) {
                                    case 64:
                                        ConstraintSet.m1447h(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        ConstraintSet.m1447h(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        this.f2808Z = obtainStyledAttributes.getInt(index, this.f2808Z);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        this.f2815d = obtainStyledAttributes.getBoolean(index, this.f2815d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m1441a();
        }

        /* renamed from: a */
        public void m1441a() {
            this.f2816d0 = false;
            this.f2810a0 = true;
            this.f2812b0 = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.f2805W) {
                this.f2810a0 = false;
                if (this.f2794L == 0) {
                    this.f2794L = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.f2806X) {
                this.f2812b0 = false;
                if (this.f2795M == 0) {
                    this.f2795M = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2810a0 = false;
                if (i2 == 0 && this.f2794L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2805W = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f2812b0 = false;
                if (i3 == 0 && this.f2795M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2806X = true;
                }
            }
            if (this.f2813c == -1.0f && this.f2809a == -1 && this.f2811b == -1) {
                return;
            }
            this.f2816d0 = true;
            this.f2810a0 = true;
            this.f2812b0 = true;
            if (!(this.f2842q0 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.f2842q0 = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.f2842q0).m1313b0(this.f2804V);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f2809a = -1;
            this.f2811b = -1;
            this.f2813c = -1.0f;
            this.f2815d = true;
            this.f2817e = -1;
            this.f2819f = -1;
            this.f2821g = -1;
            this.f2823h = -1;
            this.f2825i = -1;
            this.f2827j = -1;
            this.f2829k = -1;
            this.f2831l = -1;
            this.f2833m = -1;
            this.f2835n = -1;
            this.f2837o = -1;
            this.f2839p = -1;
            this.f2841q = 0;
            this.f2843r = 0.0f;
            this.f2844s = -1;
            this.f2845t = -1;
            this.f2846u = -1;
            this.f2847v = -1;
            this.f2848w = Integer.MIN_VALUE;
            this.f2849x = Integer.MIN_VALUE;
            this.f2850y = Integer.MIN_VALUE;
            this.f2851z = Integer.MIN_VALUE;
            this.f2783A = Integer.MIN_VALUE;
            this.f2784B = Integer.MIN_VALUE;
            this.f2785C = Integer.MIN_VALUE;
            this.f2786D = 0;
            this.f2787E = 0.5f;
            this.f2788F = 0.5f;
            this.f2789G = null;
            this.f2790H = -1.0f;
            this.f2791I = -1.0f;
            this.f2792J = 0;
            this.f2793K = 0;
            this.f2794L = 0;
            this.f2795M = 0;
            this.f2796N = 0;
            this.f2797O = 0;
            this.f2798P = 0;
            this.f2799Q = 0;
            this.f2800R = 1.0f;
            this.f2801S = 1.0f;
            this.f2802T = -1;
            this.f2803U = -1;
            this.f2804V = -1;
            this.f2805W = false;
            this.f2806X = false;
            this.f2807Y = null;
            this.f2808Z = 0;
            this.f2810a0 = true;
            this.f2812b0 = true;
            this.f2814c0 = false;
            this.f2816d0 = false;
            this.f2818e0 = false;
            this.f2820f0 = false;
            this.f2822g0 = -1;
            this.f2824h0 = -1;
            this.f2826i0 = -1;
            this.f2828j0 = -1;
            this.f2830k0 = Integer.MIN_VALUE;
            this.f2832l0 = Integer.MIN_VALUE;
            this.f2834m0 = 0.5f;
            this.f2842q0 = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2809a = -1;
            this.f2811b = -1;
            this.f2813c = -1.0f;
            this.f2815d = true;
            this.f2817e = -1;
            this.f2819f = -1;
            this.f2821g = -1;
            this.f2823h = -1;
            this.f2825i = -1;
            this.f2827j = -1;
            this.f2829k = -1;
            this.f2831l = -1;
            this.f2833m = -1;
            this.f2835n = -1;
            this.f2837o = -1;
            this.f2839p = -1;
            this.f2841q = 0;
            this.f2843r = 0.0f;
            this.f2844s = -1;
            this.f2845t = -1;
            this.f2846u = -1;
            this.f2847v = -1;
            this.f2848w = Integer.MIN_VALUE;
            this.f2849x = Integer.MIN_VALUE;
            this.f2850y = Integer.MIN_VALUE;
            this.f2851z = Integer.MIN_VALUE;
            this.f2783A = Integer.MIN_VALUE;
            this.f2784B = Integer.MIN_VALUE;
            this.f2785C = Integer.MIN_VALUE;
            this.f2786D = 0;
            this.f2787E = 0.5f;
            this.f2788F = 0.5f;
            this.f2789G = null;
            this.f2790H = -1.0f;
            this.f2791I = -1.0f;
            this.f2792J = 0;
            this.f2793K = 0;
            this.f2794L = 0;
            this.f2795M = 0;
            this.f2796N = 0;
            this.f2797O = 0;
            this.f2798P = 0;
            this.f2799Q = 0;
            this.f2800R = 1.0f;
            this.f2801S = 1.0f;
            this.f2802T = -1;
            this.f2803U = -1;
            this.f2804V = -1;
            this.f2805W = false;
            this.f2806X = false;
            this.f2807Y = null;
            this.f2808Z = 0;
            this.f2810a0 = true;
            this.f2812b0 = true;
            this.f2814c0 = false;
            this.f2816d0 = false;
            this.f2818e0 = false;
            this.f2820f0 = false;
            this.f2822g0 = -1;
            this.f2824h0 = -1;
            this.f2826i0 = -1;
            this.f2828j0 = -1;
            this.f2830k0 = Integer.MIN_VALUE;
            this.f2832l0 = Integer.MIN_VALUE;
            this.f2834m0 = 0.5f;
            this.f2842q0 = new ConstraintWidget();
        }
    }
}
