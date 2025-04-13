package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.android.beacon.SendBeaconManager;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivVisibilityAction;
import dagger.Lazy;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivActionBeaconSender.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivActionBeaconSender {

    /* renamed from: a */
    @NotNull
    public final Lazy<SendBeaconManager> f31819a;

    /* renamed from: b */
    public final boolean f31820b;

    /* renamed from: c */
    public final boolean f31821c;

    /* compiled from: DivActionBeaconSender.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBeaconSender$Companion;", "", "", "HTTP_HEADER_REFERER", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Inject
    public DivActionBeaconSender(@NotNull Lazy<SendBeaconManager> sendBeaconManagerLazy, @ExperimentFlag boolean z, @ExperimentFlag boolean z2) {
        Intrinsics.m32179h(sendBeaconManagerLazy, "sendBeaconManagerLazy");
        this.f31819a = sendBeaconManagerLazy;
        this.f31820b = z;
        this.f31821c = z2;
    }

    /* renamed from: a */
    public void m16967a(@NotNull DivAction action, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(action, "action");
        Intrinsics.m32179h(resolver, "resolver");
        Expression<Uri> expression = action.f34552b;
        Uri mo17535b = expression == null ? null : expression.mo17535b(resolver);
        if (!this.f31820b || mo17535b == null) {
            return;
        }
        SendBeaconManager sendBeaconManager = this.f31819a.get();
        if (sendBeaconManager == null) {
            int i2 = Assert.f33709a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expression2 = action.f34555e;
        if (expression2 != null) {
            String uri = expression2.mo17535b(resolver).toString();
            Intrinsics.m32178g(uri, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", uri);
        }
        sendBeaconManager.m16543a(mo17535b, linkedHashMap, action.f34554d);
    }

    /* renamed from: b */
    public void m16968b(@NotNull DivVisibilityAction action, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(action, "action");
        Intrinsics.m32179h(resolver, "resolver");
        Expression<Uri> expression = action.f40952f;
        Uri mo17535b = expression == null ? null : expression.mo17535b(resolver);
        if (!this.f31821c || mo17535b == null) {
            return;
        }
        SendBeaconManager sendBeaconManager = this.f31819a.get();
        if (sendBeaconManager == null) {
            int i2 = Assert.f33709a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expression2 = action.f40951e;
        if (expression2 != null) {
            String uri = expression2.mo17535b(resolver).toString();
            Intrinsics.m32178g(uri, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", uri);
        }
        sendBeaconManager.m16543a(mo17535b, linkedHashMap, action.f40950d);
    }
}
