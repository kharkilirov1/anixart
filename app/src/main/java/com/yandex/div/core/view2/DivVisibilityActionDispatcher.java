package com.yandex.div.core.view2;

import androidx.collection.ArrayMap;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVisibilityActionDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivVisibilityActionDispatcher {

    /* renamed from: a */
    @NotNull
    public final Div2Logger f31683a;

    /* renamed from: b */
    @NotNull
    public final DivVisibilityChangeListener f31684b;

    /* renamed from: c */
    @NotNull
    public final DivActionHandler f31685c;

    /* renamed from: d */
    @NotNull
    public final DivActionBeaconSender f31686d;

    /* renamed from: e */
    @NotNull
    public final Map<CompositeLogId, Integer> f31687e;

    /* compiled from: DivVisibilityActionDispatcher.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher$Companion;", "", "", "LIMITLESS_LOG", "J", "", "TAG", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Inject
    public DivVisibilityActionDispatcher(@NotNull Div2Logger logger, @NotNull DivVisibilityChangeListener visibilityListener, @NotNull DivActionHandler divActionHandler, @NotNull DivActionBeaconSender divActionBeaconSender) {
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(visibilityListener, "visibilityListener");
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(divActionBeaconSender, "divActionBeaconSender");
        this.f31683a = logger;
        this.f31684b = visibilityListener;
        this.f31685c = divActionHandler;
        this.f31686d = divActionBeaconSender;
        this.f31687e = new ArrayMap();
    }
}
