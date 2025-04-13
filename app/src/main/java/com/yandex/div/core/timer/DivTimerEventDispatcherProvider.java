package com.yandex.div.core.timer;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTimerEventDispatcherProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/timer/DivTimerEventDispatcherProvider;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivTimerEventDispatcherProvider {

    /* renamed from: a */
    @NotNull
    public final DivActionHandler f31352a;

    /* renamed from: b */
    @NotNull
    public final ErrorCollectors f31353b;

    /* renamed from: c */
    public final Map<String, DivTimerEventDispatcher> f31354c;

    @Inject
    public DivTimerEventDispatcherProvider(@NotNull DivActionHandler divActionHandler, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f31352a = divActionHandler;
        this.f31353b = errorCollectors;
        this.f31354c = Collections.synchronizedMap(new LinkedHashMap());
    }
}
