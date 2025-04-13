package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivStateBinder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivStateBinder {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32395a;

    /* renamed from: b */
    @NotNull
    public final DivViewCreator f32396b;

    /* renamed from: c */
    @NotNull
    public final Provider<DivBinder> f32397c;

    /* renamed from: d */
    @NotNull
    public final DivStateCache f32398d;

    /* renamed from: e */
    @NotNull
    public final TemporaryDivStateCache f32399e;

    /* renamed from: f */
    @NotNull
    public final DivActionBinder f32400f;

    /* renamed from: g */
    @NotNull
    public final DivPatchManager f32401g;

    /* renamed from: h */
    @NotNull
    public final DivPatchCache f32402h;

    /* renamed from: i */
    @NotNull
    public final Div2Logger f32403i;

    /* renamed from: j */
    @NotNull
    public final DivVisibilityActionTracker f32404j;

    /* renamed from: k */
    @NotNull
    public final ErrorCollectors f32405k;

    @Inject
    public DivStateBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull Provider<DivBinder> viewBinder, @NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryStateCache, @NotNull DivActionBinder divActionBinder, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(viewBinder, "viewBinder");
        Intrinsics.m32179h(divStateCache, "divStateCache");
        Intrinsics.m32179h(temporaryStateCache, "temporaryStateCache");
        Intrinsics.m32179h(divActionBinder, "divActionBinder");
        Intrinsics.m32179h(divPatchManager, "divPatchManager");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(div2Logger, "div2Logger");
        Intrinsics.m32179h(divVisibilityActionTracker, "divVisibilityActionTracker");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32395a = baseBinder;
        this.f32396b = viewCreator;
        this.f32397c = viewBinder;
        this.f32398d = divStateCache;
        this.f32399e = temporaryStateCache;
        this.f32400f = divActionBinder;
        this.f32401g = divPatchManager;
        this.f32402h = divPatchCache;
        this.f32403i = div2Logger;
        this.f32404j = divVisibilityActionTracker;
        this.f32405k = errorCollectors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
    
        if ((r7 != null && com.yandex.div.core.util.DivUtilKt.m16758a(r7) == r5) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17034a(@org.jetbrains.annotations.NotNull final com.yandex.div.core.view2.divs.widgets.DivStateLayout r22, @org.jetbrains.annotations.NotNull com.yandex.div2.DivState r23, @org.jetbrains.annotations.NotNull final com.yandex.div.core.view2.Div2View r24, @org.jetbrains.annotations.NotNull final com.yandex.div.core.state.DivStatePath r25) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinder.m17034a(com.yandex.div.core.view2.divs.widgets.DivStateLayout, com.yandex.div2.DivState, com.yandex.div.core.view2.Div2View, com.yandex.div.core.state.DivStatePath):void");
    }

    /* renamed from: b */
    public final void m17035b(View view, Div2View div2View) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            View view2 = (View) viewGroupKt$iterator$1.next();
            Div m16809G = div2View.m16809G(view2);
            if (m16809G != null) {
                this.f32404j.m16876d(div2View, null, m16809G, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(m16809G.m17557a()) : null);
            }
            m17035b(view2, div2View);
        }
    }
}
