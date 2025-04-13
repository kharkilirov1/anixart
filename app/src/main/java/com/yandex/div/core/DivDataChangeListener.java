package com.yandex.div.core;

import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivDataChangeListener.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/DivDataChangeListener;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivDataChangeListener {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final DivDataChangeListener f30957a = new DivDataChangeListener() { // from class: com.yandex.div.core.DivDataChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.DivDataChangeListener
        /* renamed from: a */
        public void mo16585a(@NotNull Div2View divView, @NotNull DivData data) {
            Intrinsics.m32179h(divView, "divView");
            Intrinsics.m32179h(data, "data");
        }

        @Override // com.yandex.div.core.DivDataChangeListener
        /* renamed from: b */
        public void mo16586b(@NotNull Div2View div2View, @NotNull DivData data) {
            Intrinsics.m32179h(data, "data");
        }
    };

    /* compiled from: DivDataChangeListener.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/DivDataChangeListener$Companion;", "", "Lcom/yandex/div/core/DivDataChangeListener;", "STUB", "Lcom/yandex/div/core/DivDataChangeListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    void mo16585a(@NotNull Div2View div2View, @NotNull DivData divData);

    /* renamed from: b */
    void mo16586b(@NotNull Div2View div2View, @NotNull DivData divData);
}
