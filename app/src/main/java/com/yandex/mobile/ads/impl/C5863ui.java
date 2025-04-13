package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ui */
/* loaded from: classes3.dex */
public final class C5863ui extends DivActionHandler {

    /* renamed from: a */
    @NonNull
    private final C5804ti f55506a;

    public C5863ui(@NonNull C5804ti c5804ti) {
        this.f55506a = c5804ti;
    }

    /* renamed from: a */
    private boolean m29004a(@NonNull String str) {
        Objects.requireNonNull(str);
        if (str.equals("close_dialog")) {
            this.f55506a.m28665b();
            return true;
        }
        if (!str.equals("close_ad")) {
            return false;
        }
        this.f55506a.m28664a();
        return true;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade) {
        Expression<Uri> expression = divAction.f34556f;
        boolean m29004a = expression != null ? m29004a(expression.mo17535b(ExpressionResolver.f34350a).toString()) : false;
        return m29004a ? m29004a : super.handleAction(divAction, divViewFacade);
    }
}
