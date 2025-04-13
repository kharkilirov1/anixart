package com.yandex.div.internal.widget.tabs;

import com.yandex.div.internal.widget.tabs.TabView;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.internal.widget.tabs.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2919d implements TabView.MaxWidthProvider, TabView.OnUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseIndicatorTabLayout f34307a;

    public /* synthetic */ C2919d(BaseIndicatorTabLayout baseIndicatorTabLayout) {
        this.f34307a = baseIndicatorTabLayout;
    }

    @Override // com.yandex.div.internal.widget.tabs.TabView.OnUpdateListener
    /* renamed from: a */
    public void mo17513a(TabView tabView) {
        Objects.requireNonNull(this.f34307a);
    }

    @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
    /* renamed from: b */
    public int mo17512b() {
        int tabMaxWidth;
        tabMaxWidth = this.f34307a.getTabMaxWidth();
        return tabMaxWidth;
    }
}
