package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C4788a1;
import com.yandex.mobile.ads.impl.C5467n0;
import com.yandex.mobile.ads.impl.C5612q0;
import com.yandex.mobile.ads.impl.InterfaceC5370l0;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.sg1;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AdActivity extends Activity {

    /* renamed from: a */
    @NonNull
    private final sg1 f47755a = new sg1();

    /* renamed from: b */
    @Nullable
    private RelativeLayout f47756b;

    /* renamed from: c */
    @Nullable
    private InterfaceC5370l0 f47757c;

    /* renamed from: d */
    @Nullable
    private C5612q0 f47758d;

    @Override // android.app.Activity
    public final void onBackPressed() {
        InterfaceC5370l0 interfaceC5370l0 = this.f47757c;
        if (interfaceC5370l0 == null || interfaceC5370l0.mo25418e()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5612q0 c5612q0 = this.f47758d;
        if (c5612q0 != null) {
            c5612q0.m27586a(configuration);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ResultReceiver resultReceiver;
        super.onCreate(bundle);
        this.f47756b = new RelativeLayout(this);
        C5612q0 c5612q0 = new C5612q0(this);
        this.f47758d = c5612q0;
        RelativeLayout relativeLayout = this.f47756b;
        Intent intent = getIntent();
        InterfaceC5370l0 interfaceC5370l0 = null;
        if (intent != null) {
            Window window = getWindow();
            try {
                resultReceiver = (ResultReceiver) intent.getParcelableExtra("extra_receiver");
            } catch (Exception unused) {
                n60.m26810c("Failed to get Ad result receiver from intent's extras", new Object[0]);
                resultReceiver = null;
            }
            interfaceC5370l0 = C5467n0.m26780a().m26781a(this, relativeLayout, resultReceiver, new C4788a1(this, resultReceiver), c5612q0, intent, window);
        }
        this.f47757c = interfaceC5370l0;
        if (interfaceC5370l0 == null) {
            finish();
            return;
        }
        interfaceC5370l0.mo25419f();
        this.f47757c.mo25420g();
        RelativeLayout relativeLayout2 = this.f47756b;
        Objects.requireNonNull(this.f47755a);
        relativeLayout2.setTag(sg1.m28248a("root_layout"));
        setContentView(this.f47756b);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        InterfaceC5370l0 interfaceC5370l0 = this.f47757c;
        if (interfaceC5370l0 != null) {
            interfaceC5370l0.onAdClosed();
            this.f47757c.mo25417d();
        }
        RelativeLayout relativeLayout = this.f47756b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        InterfaceC5370l0 interfaceC5370l0 = this.f47757c;
        if (interfaceC5370l0 != null) {
            interfaceC5370l0.mo25416b();
        }
        C5612q0 c5612q0 = this.f47758d;
        if (c5612q0 != null) {
            c5612q0.m27585a();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        InterfaceC5370l0 interfaceC5370l0 = this.f47757c;
        if (interfaceC5370l0 != null) {
            interfaceC5370l0.mo25415a();
        }
        C5612q0 c5612q0 = this.f47758d;
        if (c5612q0 != null) {
            c5612q0.m27588b();
        }
    }
}
