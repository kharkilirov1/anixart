package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.swiftsoft.anixartd.C2507R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DropDownListView extends ListView {

    /* renamed from: b */
    public final Rect f1304b;

    /* renamed from: c */
    public int f1305c;

    /* renamed from: d */
    public int f1306d;

    /* renamed from: e */
    public int f1307e;

    /* renamed from: f */
    public int f1308f;

    /* renamed from: g */
    public int f1309g;

    /* renamed from: h */
    public Field f1310h;

    /* renamed from: i */
    public GateKeeperDrawable f1311i;

    /* renamed from: j */
    public boolean f1312j;

    /* renamed from: k */
    public boolean f1313k;

    /* renamed from: l */
    public boolean f1314l;

    /* renamed from: m */
    public ListViewAutoScrollHelper f1315m;

    /* renamed from: n */
    public ResolveHoverRunnable f1316n;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m857a(View view, float f2, float f3) {
            view.drawableHotspotChanged(f2, f3);
        }
    }

    @RequiresApi
    public static class Api30Impl {

        /* renamed from: a */
        public static Method f1317a;

        /* renamed from: b */
        public static Method f1318b;

        /* renamed from: c */
        public static Method f1319c;

        /* renamed from: d */
        public static boolean f1320d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1317a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1318b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1319c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1320d = true;
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class GateKeeperDrawable extends DrawableWrapper {

        /* renamed from: c */
        public boolean f1321c;

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
            this.f1321c = true;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1321c) {
                this.f668b.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1321c) {
                DrawableCompat.m1838j(this.f668b, f2, f3);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1321c) {
                DrawableCompat.m1839k(this.f668b, i2, i3, i4, i5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1321c) {
                return this.f668b.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1321c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f1316n = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(@NonNull Context context, boolean z) {
        super(context, null, C2507R.attr.dropDownListViewStyle);
        this.f1304b = new Rect();
        this.f1305c = 0;
        this.f1306d = 0;
        this.f1307e = 0;
        this.f1308f = 0;
        this.f1313k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1310h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        GateKeeperDrawable gateKeeperDrawable = this.f1311i;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.f1321c = z;
        }
    }

    /* renamed from: a */
    public int m854a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m855b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.m855b(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: c */
    public final void m856c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1314l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1304b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1304b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1316n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m856c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1313k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1313k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1313k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1313k && this.f1312j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1316n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1316n == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.f1316n = resolveHoverRunnable;
            post(resolveHoverRunnable);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !Api30Impl.f1320d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            Api30Impl.f1317a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            Api30Impl.f1318b.invoke(this, Integer.valueOf(pointToPosition));
                            Api30Impl.f1319c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                m856c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1309g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.f1316n;
        if (resolveHoverRunnable != null) {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f1316n = null;
            dropDownListView.removeCallbacks(resolveHoverRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1312j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = drawable != null ? new GateKeeperDrawable(drawable) : null;
        this.f1311i = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1305c = rect.left;
        this.f1306d = rect.top;
        this.f1307e = rect.right;
        this.f1308f = rect.bottom;
    }
}
