package com.yandex.div.core.view2;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div2.DivAccessibility;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAccessibilityBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivAccessibilityBinder {

    /* renamed from: a */
    public final boolean f31599a;

    /* compiled from: DivAccessibilityBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAccessibility.Type.values().length];
            DivAccessibility.Type type = DivAccessibility.Type.NONE;
            iArr[0] = 1;
            DivAccessibility.Type type2 = DivAccessibility.Type.BUTTON;
            iArr[1] = 2;
            DivAccessibility.Type type3 = DivAccessibility.Type.IMAGE;
            iArr[2] = 3;
            DivAccessibility.Type type4 = DivAccessibility.Type.TEXT;
            iArr[3] = 4;
            DivAccessibility.Type type5 = DivAccessibility.Type.EDIT_TEXT;
            iArr[4] = 5;
            DivAccessibility.Type type6 = DivAccessibility.Type.HEADER;
            iArr[5] = 6;
            DivAccessibility.Type type7 = DivAccessibility.Type.TAB_BAR;
            iArr[6] = 7;
            int[] iArr2 = new int[DivAccessibility.Mode.values().length];
            DivAccessibility.Mode mode = DivAccessibility.Mode.EXCLUDE;
            iArr2[2] = 1;
            DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
            iArr2[1] = 2;
            DivAccessibility.Mode mode3 = DivAccessibility.Mode.DEFAULT;
            iArr2[0] = 3;
        }
    }

    @Inject
    public DivAccessibilityBinder(@ExperimentFlag boolean z) {
        this.f31599a = z;
    }

    /* renamed from: a */
    public final void m16829a(View view, DivAccessibility.Mode mode, Div2View div2View, boolean z) {
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            view.setImportantForAccessibility(0);
            view.setFocusable(true);
        } else if (ordinal == 1) {
            view.setImportantForAccessibility(1);
            if (z) {
                view.setClickable(false);
                view.setLongClickable(false);
                view.setFocusable(false);
            } else {
                view.setFocusable(true);
            }
        } else if (ordinal == 2) {
            view.setImportantForAccessibility(4);
            view.setFocusable(false);
        }
        div2View.f31569w.put(view, mode);
    }

    /* renamed from: b */
    public void m16830b(@NotNull View view, @NotNull Div2View divView, @NotNull DivAccessibility.Mode mode) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(mode, "mode");
        if (this.f31599a) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            DivAccessibility.Mode mode2 = view2 != null ? divView.f31569w.get(view2) : null;
            if (mode2 == null) {
                m16829a(view, mode, divView, false);
                return;
            }
            if (m16832d(mode2) < m16832d(mode)) {
                mode = mode2;
            }
            m16829a(view, mode, divView, mode2 == mode);
        }
    }

    /* renamed from: c */
    public void m16831c(@NotNull View view, @NotNull final DivAccessibility.Type type) {
        if (this.f31599a) {
            ViewCompat.m2196e0(view, (type == DivAccessibility.Type.LIST && (view instanceof BackHandlingRecyclerView)) ? new AccessibilityListDelegate((BackHandlingRecyclerView) view) : new AccessibilityDelegateWrapper(ViewCompat.m2205j(view), new Function2<View, AccessibilityNodeInfoCompat, Unit>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindType$accessibilityDelegate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public Unit invoke(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    String str;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
                    if (accessibilityNodeInfoCompat2 != null) {
                        DivAccessibilityBinder divAccessibilityBinder = DivAccessibilityBinder.this;
                        DivAccessibility.Type type2 = type;
                        Objects.requireNonNull(divAccessibilityBinder);
                        switch (type2.ordinal()) {
                            case 1:
                                str = "android.widget.Button";
                                break;
                            case 2:
                                str = "android.widget.ImageView";
                                break;
                            case 3:
                            case 5:
                                str = "android.widget.TextView";
                                break;
                            case 4:
                                str = "android.widget.EditText";
                                break;
                            case 6:
                                str = "android.widget.TabWidget";
                                break;
                            default:
                                str = "";
                                break;
                        }
                        accessibilityNodeInfoCompat2.f3743a.setClassName(str);
                        if (DivAccessibility.Type.HEADER == type2) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfoCompat2.f3743a.setHeading(true);
                            } else {
                                accessibilityNodeInfoCompat2.m2510p(2, true);
                            }
                        }
                    }
                    return Unit.f63088a;
                }
            }));
        }
    }

    /* renamed from: d */
    public final int m16832d(DivAccessibility.Mode mode) {
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
