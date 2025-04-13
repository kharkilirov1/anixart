package com.yandex.div.core.view2.divs;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.PopupMenu;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder;", "", "LogType", "MenuWrapperListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivActionBinder {

    /* renamed from: a */
    @NotNull
    public final DivActionHandler f31825a;

    /* renamed from: b */
    @NotNull
    public final Div2Logger f31826b;

    /* renamed from: c */
    @NotNull
    public final DivActionBeaconSender f31827c;

    /* renamed from: d */
    public final boolean f31828d;

    /* renamed from: e */
    public final boolean f31829e;

    /* renamed from: f */
    public final boolean f31830f;

    /* renamed from: g */
    @NotNull
    public final Function1<View, Boolean> f31831g;

    /* compiled from: DivActionBinder.kt */
    @Metadata(m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0081\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$LogType;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LogType {

        /* compiled from: DivActionBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$LogType$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }
    }

    /* compiled from: DivActionBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$MenuWrapperListener;", "Lcom/yandex/div/internal/widget/menu/OverflowMenuWrapper$Listener$Simple;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {

        /* renamed from: a */
        @NotNull
        public final Div2View f31832a;

        /* renamed from: b */
        @NotNull
        public final List<DivAction.MenuItem> f31833b;

        /* renamed from: c */
        public final /* synthetic */ DivActionBinder f31834c;

        /* JADX WARN: Multi-variable type inference failed */
        public MenuWrapperListener(@NotNull DivActionBinder divActionBinder, @NotNull Div2View divView, List<? extends DivAction.MenuItem> list) {
            Intrinsics.m32179h(divView, "divView");
            this.f31834c = divActionBinder;
            this.f31832a = divView;
            this.f31833b = list;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener.Simple, com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        /* renamed from: a */
        public void mo16972a(@NotNull PopupMenu popupMenu) {
            final ExpressionResolver expressionResolver = this.f31832a.getExpressionResolver();
            MenuBuilder menuBuilder = popupMenu.f1394b;
            Intrinsics.m32178g(menuBuilder, "popupMenu.menu");
            for (final DivAction.MenuItem menuItem : this.f31833b) {
                final int size = menuBuilder.size();
                MenuItem add = menuBuilder.add(menuItem.f34563c.mo17535b(expressionResolver));
                final DivActionBinder divActionBinder = this.f31834c;
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.e
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem it) {
                        final DivActionBinder.MenuWrapperListener this$0 = DivActionBinder.MenuWrapperListener.this;
                        final DivAction.MenuItem itemData = menuItem;
                        final DivActionBinder this$1 = divActionBinder;
                        final int i2 = size;
                        final ExpressionResolver expressionResolver2 = expressionResolver;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(itemData, "$itemData");
                        Intrinsics.m32179h(this$1, "this$1");
                        Intrinsics.m32179h(expressionResolver2, "$expressionResolver");
                        Intrinsics.m32179h(it, "it");
                        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        this$0.f31832a.m16816q(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public Unit invoke() {
                                List<DivAction> list = DivAction.MenuItem.this.f34562b;
                                List<DivAction> list2 = null;
                                if (list == null || list.isEmpty()) {
                                    list = null;
                                }
                                if (list == null) {
                                    DivAction divAction = DivAction.MenuItem.this.f34561a;
                                    if (divAction != null) {
                                        list2 = CollectionsKt.m31993F(divAction);
                                    }
                                } else {
                                    list2 = list;
                                }
                                if (list2 == null || list2.isEmpty()) {
                                    int i3 = Assert.f33709a;
                                } else {
                                    DivActionBinder divActionBinder2 = this$1;
                                    DivActionBinder.MenuWrapperListener menuWrapperListener = this$0;
                                    int i4 = i2;
                                    DivAction.MenuItem menuItem2 = DivAction.MenuItem.this;
                                    ExpressionResolver expressionResolver3 = expressionResolver2;
                                    for (DivAction divAction2 : list2) {
                                        divActionBinder2.f31826b.mo16576k(menuWrapperListener.f31832a, i4, menuItem2.f34563c.mo17535b(expressionResolver3), divAction2);
                                        divActionBinder2.f31827c.m16967a(divAction2, menuWrapperListener.f31832a.getExpressionResolver());
                                        divActionBinder2.m16970a(menuWrapperListener.f31832a, divAction2, null);
                                    }
                                    booleanRef.f63347b = true;
                                }
                                return Unit.f63088a;
                            }
                        });
                        return booleanRef.f63347b;
                    }
                });
            }
        }
    }

    @Inject
    public DivActionBinder(@NotNull DivActionHandler actionHandler, @NotNull Div2Logger logger, @NotNull DivActionBeaconSender divActionBeaconSender, @ExperimentFlag boolean z, @ExperimentFlag boolean z2, @ExperimentFlag boolean z3) {
        Intrinsics.m32179h(actionHandler, "actionHandler");
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(divActionBeaconSender, "divActionBeaconSender");
        this.f31825a = actionHandler;
        this.f31826b = logger;
        this.f31827c = divActionBeaconSender;
        this.f31828d = z;
        this.f31829e = z2;
        this.f31830f = z3;
        this.f31831g = new Function1<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, android.view.ViewGroup] */
            /* JADX WARN: Type inference failed for: r3v8 */
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(View view) {
                View view2 = view;
                Intrinsics.m32179h(view2, "view");
                boolean z4 = false;
                do {
                    ViewParent parent = view2.getParent();
                    view2 = parent instanceof ViewGroup ? (ViewGroup) parent : 0;
                    if (view2 == 0 || view2.getParent() == null) {
                        break;
                    }
                    z4 = view2.performLongClick();
                } while (!z4);
                return Boolean.valueOf(z4);
            }
        };
    }

    /* renamed from: a */
    public void m16970a(@NotNull Div2View divView, @NotNull DivAction action, @Nullable String str) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(action, "action");
        DivActionHandler actionHandler = divView.getActionHandler();
        if (!this.f31825a.getUseActionUid() || str == null) {
            if (actionHandler == null || !actionHandler.handleAction(action, divView)) {
                this.f31825a.handleAction(action, divView);
                return;
            }
            return;
        }
        if (actionHandler == null || !actionHandler.handleAction(action, divView, str)) {
            this.f31825a.handleAction(action, divView, str);
        }
    }

    /* renamed from: c */
    public void m16971c(@NotNull final Div2View divView, @NotNull final View target, @NotNull final List<? extends DivAction> actions, @NotNull final String actionLogType) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(target, "target");
        Intrinsics.m32179h(actions, "actions");
        Intrinsics.m32179h(actionLogType, "actionLogType");
        divView.m16816q(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.m32178g(uuid, "randomUUID().toString()");
                List<DivAction> list = actions;
                String str = actionLogType;
                DivActionBinder divActionBinder = this;
                Div2View div2View = divView;
                View view = target;
                for (DivAction divAction : list) {
                    switch (str.hashCode()) {
                        case -338877947:
                            if (str.equals("long_click")) {
                                divActionBinder.f31826b.mo16575j(div2View, view, divAction, uuid);
                                break;
                            }
                            int i2 = Assert.f33709a;
                            break;
                        case 3027047:
                            if (str.equals("blur")) {
                                divActionBinder.f31826b.mo16582q(div2View, view, divAction, Boolean.FALSE);
                                break;
                            }
                            int i22 = Assert.f33709a;
                            break;
                        case 94750088:
                            if (str.equals("click")) {
                                divActionBinder.f31826b.mo16581p(div2View, view, divAction, uuid);
                                break;
                            }
                            int i222 = Assert.f33709a;
                            break;
                        case 97604824:
                            if (str.equals("focus")) {
                                divActionBinder.f31826b.mo16582q(div2View, view, divAction, Boolean.TRUE);
                                break;
                            }
                            int i2222 = Assert.f33709a;
                            break;
                        case 1374143386:
                            if (str.equals("double_click")) {
                                divActionBinder.f31826b.mo16577l(div2View, view, divAction, uuid);
                                break;
                            }
                            int i22222 = Assert.f33709a;
                            break;
                        default:
                            int i222222 = Assert.f33709a;
                            break;
                    }
                    divActionBinder.f31827c.m16967a(divAction, div2View.getExpressionResolver());
                    divActionBinder.m16970a(div2View, divAction, uuid);
                }
                return Unit.f63088a;
            }
        });
    }
}
