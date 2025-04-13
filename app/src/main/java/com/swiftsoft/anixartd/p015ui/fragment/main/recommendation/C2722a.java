package com.swiftsoft.anixartd.p015ui.fragment.main.recommendation;

import android.view.MenuItem;
import androidx.appcompat.widget.PopupMenu;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.related.RelatedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.ReleaseVideosFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.WatchingFragment;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.mobile.ads.exo.offline.C4778c;
import com.yandex.mobile.ads.exo.offline.C4780e;
import com.yandex.mobile.ads.impl.C5396lg;
import com.yandex.mobile.ads.impl.ow0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.recommendation.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2722a implements SwipeRefreshLayout.OnRefreshListener, PopupMenu.OnMenuItemClickListener, VariableProvider, ow0.InterfaceC5555b, C5396lg.a, NodeVisitor {

    /* renamed from: b */
    public final /* synthetic */ int f28634b;

    /* renamed from: c */
    public final /* synthetic */ Object f28635c;

    public /* synthetic */ C2722a(Object obj, int i2) {
        this.f28634b = i2;
        this.f28635c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.C5396lg.a
    /* renamed from: a */
    public void mo15594a(long j2, long j3, long j4) {
        ((C4780e) this.f28635c).m22318a(j2, j3, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ow0.InterfaceC5555b
    /* renamed from: a */
    public void mo15595a(ow0 ow0Var, int i2) {
        ((C4778c) this.f28635c).m22291a(ow0Var, i2);
    }

    @Override // org.jsoup.select.NodeVisitor
    /* renamed from: a */
    public void mo15596a(Node node, int i2) {
        Element.m34749I(node, (StringBuilder) this.f28635c);
    }

    @Override // org.jsoup.select.NodeVisitor
    /* renamed from: b */
    public /* synthetic */ void mo15597b(Node node, int i2) {
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String variableName) {
        ExpressionResolverImpl this$0 = (ExpressionResolverImpl) this.f28635c;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(variableName, "variableName");
        Variable m16688c = this$0.f31183b.m16688c(variableName);
        if (m16688c == null) {
            return null;
        }
        return m16688c.m17210b();
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        CollectionHeaderModel this$0 = (CollectionHeaderModel) this.f28635c;
        Intrinsics.m32179h(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == C2507R.id.report) {
            this$0.m15821v2().mo14384W0();
            return true;
        }
        if (itemId == C2507R.id.share) {
            this$0.m15821v2().mo14383Q0();
            return true;
        }
        if (itemId != C2507R.id.shortcut) {
            return true;
        }
        this$0.m15821v2().mo14389j0();
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        switch (this.f28634b) {
            case 0:
                RecommendationFragment this$0 = (RecommendationFragment) this.f28635c;
                KProperty<Object>[] kPropertyArr = RecommendationFragment.f28625h;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15593u();
                break;
            case 1:
                RelatedFragment this$02 = (RelatedFragment) this.f28635c;
                RelatedFragment.Companion companion = RelatedFragment.f28636o;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15600u();
                break;
            case 2:
                ReleaseVideosFragment this$03 = (ReleaseVideosFragment) this.f28635c;
                ReleaseVideosFragment.Companion companion2 = ReleaseVideosFragment.f28827i;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15634u();
                break;
            case 3:
                ReleaseVideoCategoryFragment this$04 = (ReleaseVideoCategoryFragment) this.f28635c;
                ReleaseVideoCategoryFragment.Companion companion3 = ReleaseVideoCategoryFragment.f28855j;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.m15639u();
                break;
            default:
                WatchingFragment this$05 = (WatchingFragment) this.f28635c;
                KProperty<Object>[] kPropertyArr2 = WatchingFragment.f28940h;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.m15660u();
                break;
        }
    }
}
