package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public abstract class FragmentTransitionImpl {
    /* renamed from: d */
    public static void m3139d(List<View> list, View view) {
        int size = list.size();
        if (m3140g(list, view, size)) {
            return;
        }
        if (ViewCompat.m2165E(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!m3140g(list, childAt, size) && ViewCompat.m2165E(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m3140g(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m3141i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo3123a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3124b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3125c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3126e(Object obj);

    /* renamed from: f */
    public abstract Object mo3127f(Object obj);

    /* renamed from: h */
    public void m3142h(View view, Rect rect) {
        if (ViewCompat.m2173M(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo3128j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo3129k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public abstract void mo3130l(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: m */
    public abstract void mo3131m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: n */
    public abstract void mo3132n(Object obj, Rect rect);

    /* renamed from: o */
    public abstract void mo3133o(Object obj, View view);

    /* renamed from: p */
    public void mo3134p(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull Runnable runnable) {
        runnable.run();
    }

    /* renamed from: q */
    public abstract void mo3135q(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: r */
    public abstract void mo3136r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: s */
    public abstract Object mo3137s(Object obj);
}
