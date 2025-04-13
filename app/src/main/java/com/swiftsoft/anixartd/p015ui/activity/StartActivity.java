package com.swiftsoft.anixartd.p015ui.activity;

import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.presentation.start.StartPresenter;
import com.swiftsoft.anixartd.presentation.start.StartView;
import dagger.Lazy;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpAppCompatActivity;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;

/* compiled from: StartActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/StartActivity;", "Lmoxy/MvpAppCompatActivity;", "Lcom/swiftsoft/anixartd/presentation/start/StartView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class StartActivity extends MvpAppCompatActivity implements StartView {

    /* renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f27470d = {C2052a.m12277l(StartActivity.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/start/StartPresenter;", 0)};

    /* renamed from: b */
    @Inject
    public Lazy<StartPresenter> f27471b;

    /* renamed from: c */
    @NotNull
    public final MoxyKtxDelegate f27472c;

    /* compiled from: StartActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/StartActivity$Companion;", "", "", "DEEP_LINK_TYPE_COLLECTION", "Ljava/lang/String;", "DEEP_LINK_TYPE_PROFILE", "DEEP_LINK_TYPE_RELEASE", "ID_VALUE", "TYPE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public StartActivity() {
        new LinkedHashMap();
        Function0<StartPresenter> function0 = new Function0<StartPresenter>() { // from class: com.swiftsoft.anixartd.ui.activity.StartActivity$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public StartPresenter invoke() {
                Lazy<StartPresenter> lazy = StartActivity.this.f27471b;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27472c = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(StartPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.activity.StartActivity.onCreate(android.os.Bundle):void");
    }
}
