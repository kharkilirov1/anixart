package com.yandex.metrica.impl.p023ob;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.tl */
/* loaded from: classes2.dex */
class C4321tl {

    /* renamed from: l */
    @NonNull
    private static final List<Class> f46551l;

    /* renamed from: m */
    @NonNull
    private static final List<Class> f46552m;

    /* renamed from: a */
    @NonNull
    private final TreeSet<Float> f46553a = new TreeSet<>();

    /* renamed from: b */
    @NonNull
    private final List<C3278El> f46554b = new ArrayList();

    /* renamed from: c */
    @NonNull
    private final C3853bl f46555c;

    /* renamed from: d */
    @NonNull
    private final List<InterfaceC3303Fl> f46556d;

    /* renamed from: e */
    @NonNull
    private final List<InterfaceC3601Rk> f46557e;

    /* renamed from: f */
    @NonNull
    private final C4088km f46558f;

    /* renamed from: g */
    @NonNull
    private final C3651Tk f46559g;

    /* renamed from: h */
    @NonNull
    private final C3854bm f46560h;

    /* renamed from: i */
    @NonNull
    private final C3906dm f46561i;

    /* renamed from: j */
    @NonNull
    private final C3752Xl f46562j;

    /* renamed from: k */
    @NonNull
    private final C4140mm f46563k;

    static {
        ArrayList arrayList = new ArrayList();
        f46551l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f46552m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        m20842a(arrayList, "androidx.recyclerview.widget.RecyclerView");
        m20842a(arrayList, "androidx.viewpager.widget.ViewPager");
        m20842a(arrayList, "androidx.viewpager2.widget.ViewPager2");
        m20842a(arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        m20842a(arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        m20842a(arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        m20842a(arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        m20842a(arrayList2, "androidx.core.widget.NestedScrollView");
        m20842a(arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        m20842a(arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    @VisibleForTesting
    public C4321tl(@NonNull C3854bm c3854bm, @NonNull C4088km c4088km, @NonNull C3651Tk c3651Tk, @NonNull C3853bl c3853bl, @NonNull List<InterfaceC3303Fl> list, @NonNull List<InterfaceC3601Rk> list2, @NonNull C3906dm c3906dm, @NonNull C3752Xl c3752Xl, @NonNull C4140mm c4140mm) {
        this.f46560h = c3854bm;
        this.f46558f = c4088km;
        this.f46559g = c3651Tk;
        this.f46555c = c3853bl;
        this.f46556d = list;
        this.f46557e = list2;
        this.f46561i = c3906dm;
        this.f46562j = c3752Xl;
        this.f46563k = c4140mm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        r1 = r1.mo17940a();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C4269rl m20841a(@androidx.annotation.Nullable com.yandex.metrica.impl.p023ob.C3727Wl r22, @androidx.annotation.NonNull android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4321tl.m20841a(com.yandex.metrica.impl.ob.Wl, android.view.View, int):com.yandex.metrica.impl.ob.rl");
    }

    @Nullable
    /* renamed from: b */
    public C4269rl m20846b(@Nullable C3727Wl c3727Wl, @NonNull View view, int i2) {
        try {
            if (this.f46562j.m19403a(view)) {
                return null;
            }
            return m20841a(c3727Wl, view, i2);
        } catch (Throwable th) {
            this.f46561i.m19773a("ui_parsing_view", th);
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public final List<C3278El> m20847b() {
        return this.f46554b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[LOOP:0: B:33:0x00dd->B:35:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C3727Wl m20840a(@androidx.annotation.NonNull android.widget.TextView r20, @androidx.annotation.NonNull java.lang.String r21, @androidx.annotation.NonNull java.lang.String r22, int r23, boolean r24, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3727Wl.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4321tl.m20840a(android.widget.TextView, java.lang.String, java.lang.String, int, boolean, com.yandex.metrica.impl.ob.Wl$a):com.yandex.metrica.impl.ob.Wl");
    }

    @NonNull
    /* renamed from: a */
    public TreeSet<Float> m20845a() {
        return this.f46553a;
    }

    @NonNull
    /* renamed from: a */
    public List<View> m20844a(@NonNull View view, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int min = Math.min(this.f46559g.m19168a(i2), viewGroup.getChildCount());
                for (int i3 = 0; i3 < min; i3++) {
                    arrayList.add(viewGroup.getChildAt(i3));
                }
            }
        } catch (Throwable th) {
            this.f46561i.m19773a("ui_parsing_children", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m20843a(@NonNull List<Class> list, @NonNull View view) {
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m20842a(@NonNull List<Class> list, @NonNull String str) {
        Class m17881b = C3184B2.m17881b(str);
        if (m17881b != null) {
            list.add(m17881b);
        }
    }
}
