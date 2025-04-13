package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div2.DivAction;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kp */
/* loaded from: classes3.dex */
public final class C5351kp extends DivActionHandler {

    /* renamed from: a */
    @NotNull
    private final InterfaceC5541ok f52045a;

    /* renamed from: b */
    @NotNull
    private final C5454mp f52046b;

    /* renamed from: c */
    @NotNull
    private final C4880bq f52047c;

    /* renamed from: d */
    @NotNull
    private final C4820aq f52048d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C5351kp(@NotNull Context context, @NotNull C5689rh mainClickConnector, @NotNull InterfaceC5541ok contentCloseListener) {
        this(context, mainClickConnector, contentCloseListener, 0);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(mainClickConnector, "mainClickConnector");
        Intrinsics.m32179h(contentCloseListener, "contentCloseListener");
    }

    public /* synthetic */ C5351kp(Context context, C5689rh c5689rh, InterfaceC5541ok interfaceC5541ok, int i2) {
        this(context, c5689rh, interfaceC5541ok, new C5454mp(c5689rh), new C4880bq(new bq0(context)), new C4820aq(context));
    }

    /* renamed from: a */
    public final void m26174a(int i2, @NotNull C5689rh clickConnector) {
        Intrinsics.m32179h(clickConnector, "clickConnector");
        this.f52046b.m26752a(i2, clickConnector);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.div.core.DivActionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleAction(@org.jetbrains.annotations.NotNull com.yandex.div2.DivAction r6, @org.jetbrains.annotations.NotNull com.yandex.div.core.DivViewFacade r7) {
        /*
            r5 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.m32179h(r7, r0)
            boolean r0 = super.handleAction(r6, r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L30
            com.yandex.div.json.expressions.Expression<android.net.Uri> r0 = r6.f34556f
            if (r0 == 0) goto L2d
            com.yandex.div.json.expressions.ExpressionResolver r3 = r7.getExpressionResolver()
            java.lang.String r4 = "view.expressionResolver"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r4)
            java.lang.Object r0 = r0.mo17535b(r3)
            android.net.Uri r0 = (android.net.Uri) r0
            boolean r6 = r5.m26173a(r6, r0, r7)
            if (r6 != r2) goto L2d
            r6 = 1
            goto L2e
        L2d:
            r6 = 0
        L2e:
            if (r6 == 0) goto L31
        L30:
            r1 = 1
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5351kp.handleAction(com.yandex.div2.DivAction, com.yandex.div.core.DivViewFacade):boolean");
    }

    /* renamed from: a */
    private final boolean m26173a(DivAction divAction, Uri uri, DivViewFacade divViewFacade) {
        String host;
        if (Intrinsics.m32174c(uri.getScheme(), "mobileads") && (host = uri.getHost()) != null) {
            int hashCode = host.hashCode();
            if (hashCode != 94750088) {
                if (hashCode != 866535483) {
                    if (hashCode != 986975867) {
                        if (hashCode == 1270469668 && host.equals("trackUrl")) {
                            this.f52047c.m22921a(uri);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        this.f52048d.m22614a(uri, divAction.f34554d);
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.f52045a.mo27088c();
                    return true;
                }
            } else if (host.equals("click")) {
                this.f52046b.m26753a(uri, divViewFacade);
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public C5351kp(@NotNull Context context, @NotNull C5689rh mainClickConnector, @NotNull InterfaceC5541ok contentCloseListener, @NotNull C5454mp clickHandler, @NotNull C4880bq trackingUrlHandler, @NotNull C4820aq trackAnalyticsHandler) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(mainClickConnector, "mainClickConnector");
        Intrinsics.m32179h(contentCloseListener, "contentCloseListener");
        Intrinsics.m32179h(clickHandler, "clickHandler");
        Intrinsics.m32179h(trackingUrlHandler, "trackingUrlHandler");
        Intrinsics.m32179h(trackAnalyticsHandler, "trackAnalyticsHandler");
        this.f52045a = contentCloseListener;
        this.f52046b = clickHandler;
        this.f52047c = trackingUrlHandler;
        this.f52048d = trackAnalyticsHandler;
    }
}
