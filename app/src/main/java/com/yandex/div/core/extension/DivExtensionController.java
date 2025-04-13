package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivExtensionController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/extension/DivExtensionController;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivExtensionController {

    /* renamed from: a */
    @NotNull
    public final List<DivExtensionHandler> f31269a;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public DivExtensionController(@NotNull List<? extends DivExtensionHandler> extensionHandlers) {
        Intrinsics.m32179h(extensionHandlers, "extensionHandlers");
        this.f31269a = extensionHandlers;
    }

    /* renamed from: a */
    public void m16691a(@NotNull Div2View div2View, @NotNull View view, @NotNull DivBase div) {
        Intrinsics.m32179h(div, "div");
        if (m16693c(div)) {
            for (DivExtensionHandler divExtensionHandler : this.f31269a) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.beforeBindView(div2View, view, div);
                }
            }
        }
    }

    /* renamed from: b */
    public void m16692b(@NotNull Div2View divView, @NotNull View view, @NotNull DivBase div) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        if (m16693c(div)) {
            for (DivExtensionHandler divExtensionHandler : this.f31269a) {
                if (divExtensionHandler.matches(div)) {
                    divExtensionHandler.bindView(divView, view, div);
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m16693c(DivBase divBase) {
        List<DivExtension> mo17580n = divBase.mo17580n();
        return !(mo17580n == null || mo17580n.isEmpty()) && (this.f31269a.isEmpty() ^ true);
    }

    /* renamed from: d */
    public void m16694d(@NotNull Div2View divView, @NotNull View view, @NotNull DivBase divBase) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(view, "view");
        if (m16693c(divBase)) {
            for (DivExtensionHandler divExtensionHandler : this.f31269a) {
                if (divExtensionHandler.matches(divBase)) {
                    divExtensionHandler.unbindView(divView, view, divBase);
                }
            }
        }
    }
}
