package com.yandex.div.core;

import android.net.Uri;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.items.Direction;
import com.yandex.div.core.view2.items.DivItemChangeActionHandlerKt;
import com.yandex.div.core.view2.items.DivViewWithItems;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivVisibilityAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p000a.C0000a;

@PublicApi
/* loaded from: classes2.dex */
public class DivActionHandler {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    public boolean getUseActionUid() {
        return false;
    }

    @CallSuper
    public boolean handleAction(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade) {
        Expression<Uri> expression = divAction.f34556f;
        Uri mo17535b = expression != null ? expression.mo17535b(divViewFacade.getExpressionResolver()) : null;
        if (!DivDownloadActionHandler.m16660a(mo17535b, divViewFacade)) {
            return handleActionUrl(mo17535b, divViewFacade);
        }
        Div2View div2View = (Div2View) divViewFacade;
        Expression<Uri> expression2 = divAction.f34556f;
        Uri mo17535b2 = expression2 != null ? expression2.mo17535b(div2View.getExpressionResolver()) : null;
        if (mo17535b2 == null) {
            return false;
        }
        return DivDownloadActionHandler.f31155a.m16661b(mo17535b2, divAction.f34551a, div2View);
    }

    public final boolean handleActionUrl(@Nullable Uri uri, @NonNull DivViewFacade divViewFacade) {
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            return handleAction(uri, divViewFacade);
        }
        return false;
    }

    public void handlePayload(@NonNull JSONObject jSONObject) {
    }

    @CallSuper
    @Deprecated
    public boolean handleUri(@NonNull Uri uri, @NonNull DivViewFacade divViewFacade) {
        return handleActionUrl(uri, divViewFacade);
    }

    @CallSuper
    public boolean handleAction(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade, @NonNull String str) {
        return handleAction(divAction, divViewFacade);
    }

    @CallSuper
    public boolean handleAction(@NonNull DivVisibilityAction divVisibilityAction, @NonNull DivViewFacade divViewFacade) {
        Expression<Uri> expression = divVisibilityAction.f40952f;
        Uri mo17535b = expression != null ? expression.mo17535b(divViewFacade.getExpressionResolver()) : null;
        if (DivDownloadActionHandler.m16660a(mo17535b, divViewFacade)) {
            Div2View div2View = (Div2View) divViewFacade;
            Expression<Uri> expression2 = divVisibilityAction.f40952f;
            Uri mo17535b2 = expression2 != null ? expression2.mo17535b(div2View.getExpressionResolver()) : null;
            if (mo17535b2 == null) {
                return false;
            }
            return DivDownloadActionHandler.f31155a.m16661b(mo17535b2, divVisibilityAction.f40947a, div2View);
        }
        return handleActionUrl(mo17535b, divViewFacade);
    }

    @CallSuper
    public boolean handleAction(@NonNull DivVisibilityAction divVisibilityAction, @NonNull DivViewFacade divViewFacade, @NonNull String str) {
        return handleAction(divVisibilityAction, divViewFacade);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean handleAction(@NonNull Uri uri, @NonNull DivViewFacade view) {
        View findViewWithTag;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String authority = uri.getAuthority();
        boolean z = true;
        if (AUTHORITY_SWITCH_STATE.equals(authority)) {
            String queryParameter6 = uri.getQueryParameter(PARAM_STATE_ID);
            if (queryParameter6 == null) {
                return false;
            }
            try {
                view.mo16608d(DivStatePath.m16715e(queryParameter6), uri.getBooleanQueryParameter(PARAM_TEMPORARY, true));
                return true;
            } catch (PathFormatException unused) {
                return false;
            }
        }
        if (AUTHORITY_SHOW_TOOLTIP.equals(authority)) {
            String queryParameter7 = uri.getQueryParameter(PARAM_ID);
            if (queryParameter7 == null) {
                return false;
            }
            view.mo16607b(queryParameter7);
            return true;
        }
        if (AUTHORITY_HIDE_TOOLTIP.equals(authority)) {
            String queryParameter8 = uri.getQueryParameter(PARAM_ID);
            if (queryParameter8 == null) {
                return false;
            }
            view.mo16609f(queryParameter8);
            return true;
        }
        DivViewWithItems divViewWithItems = null;
        Unit unit = null;
        if (AUTHORITY_SET_VARIABLE.equals(authority)) {
            String queryParameter9 = uri.getQueryParameter(PARAM_VARIABLE_NAME);
            if (queryParameter9 == null || (queryParameter5 = uri.getQueryParameter(PARAM_VARIABLE_VALUE)) == null) {
                return false;
            }
            Div2View div2View = view instanceof Div2View ? (Div2View) view : null;
            if (div2View == null) {
                view.getClass();
                return false;
            }
            try {
                div2View.m16824y(queryParameter9, queryParameter5);
                return true;
            } catch (VariableMutationException e2) {
                e2.getMessage();
                return false;
            }
        }
        if (AUTHORITY_TIMER.equals(authority)) {
            String queryParameter10 = uri.getQueryParameter(PARAM_ID);
            if (queryParameter10 == null || (queryParameter4 = uri.getQueryParameter(PARAM_ACTION)) == null) {
                return false;
            }
            Div2View div2View2 = view instanceof Div2View ? (Div2View) view : null;
            if (div2View2 == null) {
                view.getClass();
                return false;
            }
            DivTimerEventDispatcher divTimerEventDispatcher = div2View2.getDivTimerEventDispatcher();
            if (divTimerEventDispatcher != null) {
                TimerController m16725b = divTimerEventDispatcher.m16725b(queryParameter10);
                if (m16725b != null) {
                    switch (queryParameter4.hashCode()) {
                        case -1367724422:
                            if (queryParameter4.equals("cancel")) {
                                m16725b.f31399j.m16728a();
                                break;
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        case -934426579:
                            if (queryParameter4.equals("resume")) {
                                Ticker ticker = m16725b.f31399j;
                                int ordinal = ticker.f31367k.ordinal();
                                if (ordinal == 0) {
                                    C2817d.m16616b(C0000a.m24u("The timer '"), ticker.f31357a, "' is stopped!", ticker);
                                    break;
                                } else if (ordinal == 1) {
                                    C2817d.m16616b(C0000a.m24u("The timer '"), ticker.f31357a, "' already working!", ticker);
                                    break;
                                } else if (ordinal == 2) {
                                    ticker.f31367k = Ticker.State.WORKING;
                                    ticker.f31370n = -1L;
                                    ticker.m16734g();
                                    break;
                                }
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        case 3540994:
                            if (queryParameter4.equals("stop")) {
                                Ticker ticker2 = m16725b.f31399j;
                                int ordinal2 = ticker2.f31367k.ordinal();
                                if (ordinal2 == 0) {
                                    C2817d.m16616b(C0000a.m24u("The timer '"), ticker2.f31357a, "' already stopped!", ticker2);
                                    break;
                                } else if (ordinal2 == 1 || ordinal2 == 2) {
                                    ticker2.f31367k = Ticker.State.STOPPED;
                                    ticker2.f31360d.invoke(Long.valueOf(ticker2.m16731d()));
                                    ticker2.m16729b();
                                    ticker2.m16733f();
                                    break;
                                }
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        case 106440182:
                            if (queryParameter4.equals("pause")) {
                                Ticker ticker3 = m16725b.f31399j;
                                int ordinal3 = ticker3.f31367k.ordinal();
                                if (ordinal3 == 0) {
                                    C2817d.m16616b(C0000a.m24u("The timer '"), ticker3.f31357a, "' already stopped!", ticker3);
                                    break;
                                } else if (ordinal3 == 1) {
                                    ticker3.f31367k = Ticker.State.PAUSED;
                                    ticker3.f31358b.invoke(Long.valueOf(ticker3.m16731d()));
                                    ticker3.m16735h();
                                    ticker3.f31369m = -1L;
                                    break;
                                } else if (ordinal3 == 2) {
                                    C2817d.m16616b(C0000a.m24u("The timer '"), ticker3.f31357a, "' already paused!", ticker3);
                                    break;
                                }
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        case 108404047:
                            if (queryParameter4.equals("reset")) {
                                Ticker ticker4 = m16725b.f31399j;
                                ticker4.m16728a();
                                ticker4.m16737k();
                                break;
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        case 109757538:
                            if (queryParameter4.equals("start")) {
                                m16725b.f31399j.m16737k();
                                break;
                            }
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                        default:
                            m16725b.f31392c.m17112a(new IllegalArgumentException(Intrinsics.m32187p(queryParameter4, " is unsupported timer command!")));
                            break;
                    }
                    unit = Unit.f63088a;
                }
                if (unit == null) {
                    divTimerEventDispatcher.f31347a.m17112a(new IllegalArgumentException(C0000a.m16m("Timer with id '", queryParameter10, "' does not exist!")));
                }
            }
            return true;
        }
        if (AUTHORITY_VIDEO.equals(authority)) {
            Div2View div2View3 = view instanceof Div2View ? (Div2View) view : null;
            if (div2View3 == null || (queryParameter2 = uri.getQueryParameter(PARAM_ID)) == null || (queryParameter3 = uri.getQueryParameter(PARAM_ACTION)) == null) {
                return false;
            }
            return div2View3.m16812m(queryParameter2, queryParameter3);
        }
        Intrinsics.m32179h(authority, "authority");
        int hashCode = authority.hashCode();
        if (!(hashCode == -1789088446 ? authority.equals("set_next_item") : hashCode == -1280379330 ? authority.equals("set_previous_item") : hashCode == -88123690 && authority.equals("set_current_item"))) {
            return false;
        }
        Direction direction = Direction.PREVIOUS;
        Direction direction2 = Direction.NEXT;
        Intrinsics.m32179h(view, "view");
        String queryParameter11 = uri.getQueryParameter(PARAM_ID);
        if (queryParameter11 == null || (findViewWithTag = view.getView().findViewWithTag(queryParameter11)) == null) {
            return false;
        }
        String authority2 = uri.getAuthority();
        ExpressionResolver expressionResolver = view.getExpressionResolver();
        Intrinsics.m32178g(expressionResolver, "view.expressionResolver");
        if (findViewWithTag instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) findViewWithTag;
            DivGallery div = divRecyclerView.getDiv();
            Intrinsics.m32176e(div);
            int ordinal4 = div.f35962x.mo17535b(expressionResolver).ordinal();
            if (ordinal4 == 0) {
                if (!Intrinsics.m32174c(authority2, "set_previous_item")) {
                    Intrinsics.m32174c(authority2, "set_next_item");
                    direction = direction2;
                }
                divViewWithItems = new DivViewWithItems.PagingGallery(divRecyclerView, direction);
            } else {
                if (ordinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!Intrinsics.m32174c(authority2, "set_previous_item")) {
                    Intrinsics.m32174c(authority2, "set_next_item");
                    direction = direction2;
                }
                divViewWithItems = new DivViewWithItems.Gallery(divRecyclerView, direction);
            }
        } else if (findViewWithTag instanceof DivPagerView) {
            divViewWithItems = new DivViewWithItems.Pager((DivPagerView) findViewWithTag);
        } else if (findViewWithTag instanceof TabsLayout) {
            divViewWithItems = new DivViewWithItems.Tabs((TabsLayout) findViewWithTag);
        }
        if (divViewWithItems == null) {
            return false;
        }
        if (authority2 != null) {
            int hashCode2 = authority2.hashCode();
            if (hashCode2 != -1789088446) {
                if (hashCode2 != -1280379330) {
                    if (hashCode2 == -88123690 && authority2.equals("set_current_item") && (queryParameter = uri.getQueryParameter("item")) != null) {
                        try {
                            divViewWithItems.mo17126c(Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused2) {
                        }
                    }
                } else if (authority2.equals("set_previous_item")) {
                    divViewWithItems.mo17126c(DivItemChangeActionHandlerKt.m17123a(uri, divViewWithItems.mo17124a(), divViewWithItems.mo17125b()).mo17130b());
                }
            } else if (authority2.equals("set_next_item")) {
                divViewWithItems.mo17126c(DivItemChangeActionHandlerKt.m17123a(uri, divViewWithItems.mo17124a(), divViewWithItems.mo17125b()).mo17129a());
            }
            return z;
        }
        z = false;
        return z;
    }
}
