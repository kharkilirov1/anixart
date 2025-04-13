package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivIdLoggingImageDownloadCallback.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {
    public DivIdLoggingImageDownloadCallback(@NotNull Div2View divView) {
        Intrinsics.m32179h(divView, "divView");
        String divId = divView.getLogId();
        Intrinsics.m32179h(divId, "divId");
    }
}
