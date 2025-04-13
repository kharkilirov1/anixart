package com.google.firebase.components;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.PopupMenu;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.util.Logger;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChangeCustomFilterTabNameFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCollectionsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.components.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2060a implements ComponentFactory, Continuation, PopupMenu.OnMenuItemClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: b */
    public final /* synthetic */ int f22522b;

    /* renamed from: c */
    public final /* synthetic */ Object f22523c;

    public /* synthetic */ C2060a(Object obj, int i2) {
        this.f22522b = i2;
        this.f22523c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    /* renamed from: a */
    public Object mo12326a(ComponentContainer componentContainer) {
        switch (this.f22522b) {
        }
        return this.f22523c;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public Object mo7340e(Task task) {
        Task<String> m9723e;
        FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = (FirebaseAuthCredentialsProvider) this.f22523c;
        int i2 = this.f22522b;
        synchronized (firebaseAuthCredentialsProvider) {
            if (i2 != 0) {
                Logger.m12494a(Logger.Level.DEBUG, "FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                m9723e = firebaseAuthCredentialsProvider.m12390a();
            } else {
                m9723e = task.mo9712q() ? Tasks.m9723e(((GetTokenResult) task.mo9708m()).f22322a) : Tasks.m9722d(task.mo9707l());
            }
        }
        return m9723e;
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        HomeFragment this$0 = (HomeFragment) this.f22523c;
        int i2 = this.f22522b;
        KProperty<Object>[] kPropertyArr = HomeFragment.f28249k;
        Intrinsics.m32179h(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == C2507R.id.change_tab_name) {
            String m14675a = this$0.m15517o4().m14675a();
            ChangeCustomFilterTabNameFragment changeCustomFilterTabNameFragment = new ChangeCustomFilterTabNameFragment();
            Bundle bundle = new Bundle();
            bundle.putString("CURRENT_TAB_NAME_VALUE", m14675a);
            changeCustomFilterTabNameFragment.setArguments(bundle);
            changeCustomFilterTabNameFragment.show(this$0.getChildFragmentManager(), "CHANGE_CUSTOM_TAB_NAME_DIALOG_TAG");
        } else if (itemId == C2507R.id.settings) {
            FragmentNavigation m15437u3 = this$0.m15437u3();
            Objects.requireNonNull(FilterFragment.f28149U);
            FilterFragment filterFragment = new FilterFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("IS_FROM", "IS_FROM_CUSTOM_FILTER_TAB");
            filterFragment.setArguments(bundle2);
            m15437u3.mo15324d2(filterFragment, null);
        }
        this$0.m15518p4().getChildAt(i2).clearAnimation();
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        switch (this.f22522b) {
            case 0:
                ReleaseCollectionsFragment this$0 = (ReleaseCollectionsFragment) this.f22523c;
                ReleaseCollectionsFragment.Companion companion = ReleaseCollectionsFragment.f28653i;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15603u();
                break;
            case 1:
                ReleaseCommentsFragment this$02 = (ReleaseCommentsFragment) this.f22523c;
                ReleaseCommentsFragment.Companion companion2 = ReleaseCommentsFragment.f28664l;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15608u();
                break;
            default:
                ReleaseCommentsRepliesFragment this$03 = (ReleaseCommentsRepliesFragment) this.f22523c;
                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15613u();
                break;
        }
    }
}
