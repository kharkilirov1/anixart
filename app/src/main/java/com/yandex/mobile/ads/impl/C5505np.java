package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.np */
/* loaded from: classes3.dex */
public final class C5505np implements InterfaceC5922vi {

    /* renamed from: a */
    @NonNull
    private final InterfaceC6256u f53064a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f53065b;

    /* renamed from: f */
    @Nullable
    private Dialog f53069f;

    /* renamed from: d */
    @NonNull
    private final C5195hp f53067d = new C5195hp();

    /* renamed from: e */
    @NonNull
    private final C4984dq f53068e = new C4984dq();

    /* renamed from: c */
    @NonNull
    private final C5933vp f53066c = new C5933vp();

    public C5505np(@NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this.f53064a = interfaceC6256u;
        this.f53065b = interfaceC5541ok;
    }

    /* renamed from: a */
    public final void m26937a(@NonNull Context context) {
        C5933vp c5933vp = this.f53066c;
        InterfaceC6256u interfaceC6256u = this.f53064a;
        Objects.requireNonNull(c5933vp);
        C5600pp m29250c = C5933vp.m29250c(interfaceC6256u);
        if (m29250c == null) {
            this.f53065b.mo27088c();
            return;
        }
        Objects.requireNonNull(this.f53067d);
        DivData m25353a = C5195hp.m25353a(m29250c);
        if (m25353a == null) {
            this.f53065b.mo27088c();
            return;
        }
        Dialog dialog = new Dialog(context, C4632R.style.YandexAdsInternal_FullscreenDialog);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.np1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C5505np.this.m26934a(dialogInterface);
            }
        });
        C5863ui c5863ui = new C5863ui(new C5804ti(dialog, this.f53065b));
        Objects.requireNonNull(this.f53068e);
        Div2View m23926a = C4984dq.m23926a(context);
        m23926a.setActionHandler(c5863ui);
        m23926a.m16823x(m25353a, new DivDataTag(UUID.randomUUID().toString()));
        dialog.setContentView(m23926a);
        this.f53069f = dialog;
        dialog.show();
    }

    /* renamed from: a */
    public final void m26936a() {
        Dialog dialog = this.f53069f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26934a(DialogInterface dialogInterface) {
        this.f53069f = null;
    }
}
