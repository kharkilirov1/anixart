package com.swiftsoft.anixartd.p015ui.activity;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ncapdevi.fragnav.FragNavController;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2626b implements BottomNavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemReselectedListener {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f27493a;

    public /* synthetic */ C2626b(MainActivity mainActivity) {
        this.f27493a = mainActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        return true;
     */
    @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo10203a(android.view.MenuItem r6) {
        /*
            r5 = this;
            com.swiftsoft.anixartd.ui.activity.MainActivity r0 = r5.f27493a
            kotlin.reflect.KProperty<java.lang.Object>[] r1 = com.swiftsoft.anixartd.p015ui.activity.MainActivity.f27425n
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.m32179h(r0, r1)
            java.lang.String r1 = "menuItem"
            kotlin.jvm.internal.Intrinsics.m32179h(r6, r1)
            r1 = 2131362527(0x7f0a02df, float:1.8344837E38)
            android.view.View r1 = r0.m15331s4(r1)
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = (com.google.android.material.bottomnavigation.BottomNavigationView) r1
            com.swiftsoft.anixartd.ui.activity.b r2 = new com.swiftsoft.anixartd.ui.activity.b
            r2.<init>(r0)
            r1.setOnNavigationItemReselectedListener(r2)
            int r6 = r6.getItemId()
            r1 = 4
            r2 = 0
            r3 = 2
            r4 = 1
            switch(r6) {
                case 2131362947: goto L70;
                case 2131362948: goto L5f;
                case 2131362949: goto L2a;
                case 2131362950: goto L4d;
                case 2131362951: goto L2a;
                case 2131362952: goto L2a;
                case 2131362953: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L90
        L2b:
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            boolean r6 = r6.m14312a()
            if (r6 != 0) goto L3c
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            r1 = 3
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r1, r2, r3)
            goto L41
        L3c:
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r1, r2, r3)
        L41:
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            com.swiftsoft.anixartd.ui.logic.main.MainUiLogic r6 = r6.f25958j
            java.lang.String r0 = "TAB_PROFILE"
            r6.m15663a(r0)
            goto L90
        L4d:
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            r1 = 0
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r1, r2, r3)
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            com.swiftsoft.anixartd.ui.logic.main.MainUiLogic r6 = r6.f25958j
            java.lang.String r0 = "TAB_HOME"
            r6.m15663a(r0)
            goto L90
        L5f:
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r4, r2, r3)
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            com.swiftsoft.anixartd.ui.logic.main.MainUiLogic r6 = r6.f25958j
            java.lang.String r0 = "TAB_DISCOVER"
            r6.m15663a(r0)
            goto L90
        L70:
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            boolean r6 = r6.m14312a()
            if (r6 != 0) goto L80
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r3, r2, r3)
            goto L85
        L80:
            com.ncapdevi.fragnav.FragNavController r6 = r0.f27431g
            com.ncapdevi.fragnav.FragNavController.m13814s(r6, r1, r2, r3)
        L85:
            com.swiftsoft.anixartd.presentation.main.MainPresenter r6 = r0.m15333u4()
            com.swiftsoft.anixartd.ui.logic.main.MainUiLogic r6 = r6.f25958j
            java.lang.String r0 = "TAB_BOOKMARKS"
            r6.m15663a(r0)
        L90:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.activity.C2626b.mo10203a(android.view.MenuItem):boolean");
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener
    /* renamed from: b */
    public void mo10202b(MenuItem menuItem) {
        MainActivity this$0 = this.f27493a;
        KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
        Intrinsics.m32179h(this$0, "this$0");
        FragNavController fragNavController = this$0.f27431g;
        String str = FragNavController.f24555n;
        Objects.requireNonNull(fragNavController);
        fragNavController.m13816b(null);
    }
}
