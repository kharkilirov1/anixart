package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wp */
/* loaded from: classes3.dex */
public final class C5983wp implements DivExtensionHandler {

    /* renamed from: b */
    private static final Object f56176b = new Object();

    /* renamed from: c */
    @Nullable
    private static volatile C5983wp f56177c;

    /* renamed from: a */
    @NonNull
    private final ArrayList f56178a = new ArrayList();

    private C5983wp() {
    }

    @NonNull
    /* renamed from: a */
    public static C5983wp m29518a() {
        if (f56177c == null) {
            synchronized (f56176b) {
                if (f56177c == null) {
                    f56177c = new C5983wp();
                }
            }
        }
        return f56177c;
    }

    /* renamed from: b */
    public final void m29520b(@NonNull xi0 xi0Var) {
        synchronized (f56176b) {
            this.f56178a.remove(xi0Var);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public void beforeBindView(@NotNull Div2View divView, @NotNull View view, @NotNull DivBase div) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(@NonNull Div2View div2View, @NonNull View view, @NonNull DivBase divBase) {
        ArrayList arrayList = new ArrayList();
        synchronized (f56176b) {
            Iterator it = this.f56178a.iterator();
            while (it.hasNext()) {
                DivExtensionHandler divExtensionHandler = (DivExtensionHandler) it.next();
                if (divExtensionHandler.matches(divBase)) {
                    arrayList.add(divExtensionHandler);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((DivExtensionHandler) it2.next()).bindView(div2View, view, divBase);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(@NonNull DivBase divBase) {
        ArrayList arrayList = new ArrayList();
        synchronized (f56176b) {
            arrayList.addAll(this.f56178a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((DivExtensionHandler) it.next()).matches(divBase)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public void preprocess(@NotNull DivBase div, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(expressionResolver, "expressionResolver");
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(@NonNull Div2View div2View, @NonNull View view, @NonNull DivBase divBase) {
        ArrayList arrayList = new ArrayList();
        synchronized (f56176b) {
            Iterator it = this.f56178a.iterator();
            while (it.hasNext()) {
                DivExtensionHandler divExtensionHandler = (DivExtensionHandler) it.next();
                if (divExtensionHandler.matches(divBase)) {
                    arrayList.add(divExtensionHandler);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((DivExtensionHandler) it2.next()).unbindView(div2View, view, divBase);
        }
    }

    /* renamed from: a */
    public final void m29519a(@NonNull xi0 xi0Var) {
        synchronized (f56176b) {
            this.f56178a.add(xi0Var);
        }
    }
}
