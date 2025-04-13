package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0096\u0001\b\u0000\u0010\t\"G\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00002G\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000¨\u0006\n"}, m31884d2 = {"Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "contentView", "", "width", "height", "Lcom/yandex/div/core/util/SafePopupWindow;", "CreatePopupCall", "div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTooltipControllerKt {

    /* compiled from: DivTooltipController.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            DivTooltip.Position position = DivTooltip.Position.LEFT;
            iArr[0] = 1;
            DivTooltip.Position position2 = DivTooltip.Position.TOP_LEFT;
            iArr[1] = 2;
            DivTooltip.Position position3 = DivTooltip.Position.BOTTOM_LEFT;
            iArr[7] = 3;
            DivTooltip.Position position4 = DivTooltip.Position.TOP_RIGHT;
            iArr[3] = 4;
            DivTooltip.Position position5 = DivTooltip.Position.RIGHT;
            iArr[4] = 5;
            DivTooltip.Position position6 = DivTooltip.Position.BOTTOM_RIGHT;
            iArr[5] = 6;
            DivTooltip.Position position7 = DivTooltip.Position.TOP;
            iArr[2] = 7;
            DivTooltip.Position position8 = DivTooltip.Position.BOTTOM;
            iArr[6] = 8;
        }
    }

    /* renamed from: a */
    public static final boolean m16746a(Div2View div2View, View view, Point point) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.left;
        int i3 = point.x;
        if (i2 <= i3 && rect.top <= point.y && rect.right >= view.getWidth() + i3) {
            if (rect.bottom >= view.getHeight() + point.y) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: b */
    public static final Point m16747b(@NotNull View popupView, @NotNull View anchor, @NotNull DivTooltip divTooltip, @NotNull ExpressionResolver resolver) {
        int i2;
        int height;
        DivDimension divDimension;
        int m16934X;
        DivDimension divDimension2;
        Intrinsics.m32179h(popupView, "popupView");
        Intrinsics.m32179h(anchor, "anchor");
        Intrinsics.m32179h(divTooltip, "divTooltip");
        Intrinsics.m32179h(resolver, "resolver");
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int i3 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        DivTooltip.Position mo17535b = divTooltip.f40504g.mo17535b(resolver);
        int i4 = point.x;
        switch (mo17535b) {
            case LEFT:
            case TOP_LEFT:
            case BOTTOM_LEFT:
                i2 = -popupView.getWidth();
                break;
            case TOP:
            case BOTTOM:
                i2 = (anchor.getWidth() / 2) - (popupView.getWidth() / 2);
                break;
            case TOP_RIGHT:
            case RIGHT:
            case BOTTOM_RIGHT:
                i2 = anchor.getWidth();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i4 + i2;
        int i5 = point.y;
        switch (mo17535b) {
            case LEFT:
            case RIGHT:
                height = (anchor.getHeight() / 2) - (popupView.getHeight() / 2);
                break;
            case TOP_LEFT:
            case TOP:
            case TOP_RIGHT:
                height = -popupView.getHeight();
                break;
            case BOTTOM_RIGHT:
            case BOTTOM:
            case BOTTOM_LEFT:
                height = anchor.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i5 + height;
        DisplayMetrics displayMetrics = anchor.getResources().getDisplayMetrics();
        int i6 = point.x;
        DivPoint divPoint = divTooltip.f40503f;
        if (divPoint == null || (divDimension = divPoint.f38066a) == null) {
            m16934X = 0;
        } else {
            Intrinsics.m32178g(displayMetrics, "displayMetrics");
            m16934X = BaseDivViewExtensionsKt.m16934X(divDimension, displayMetrics, resolver);
        }
        point.x = i6 + m16934X;
        int i7 = point.y;
        DivPoint divPoint2 = divTooltip.f40503f;
        if (divPoint2 != null && (divDimension2 = divPoint2.f38067b) != null) {
            Intrinsics.m32178g(displayMetrics, "displayMetrics");
            i3 = BaseDivViewExtensionsKt.m16934X(divDimension2, displayMetrics, resolver);
        }
        point.y = i7 + i3;
        return point;
    }

    /* renamed from: c */
    public static final Pair<DivTooltip, View> m16748c(String str, View view) {
        Object tag = view.getTag(C2507R.id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                if (Intrinsics.m32174c(divTooltip.f40502e, str)) {
                    return new Pair<>(divTooltip, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                Pair<DivTooltip, View> m16748c = m16748c(str, it.next());
                if (m16748c != null) {
                    return m16748c;
                }
            }
        }
        return null;
    }
}
