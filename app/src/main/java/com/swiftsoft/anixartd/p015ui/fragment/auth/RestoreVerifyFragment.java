package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.mukesh.OtpView;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.RestoreVerifyFragment;
import com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter;
import com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div2.C3033a;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RestoreVerifyFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/RestoreVerifyFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/restore/verify/RestoreVerifyView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RestoreVerifyFragment extends BaseFragment implements RestoreVerifyView {

    /* renamed from: e */
    @Inject
    public Lazy<RestoreVerifyPresenter> f27801e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27802f;

    /* renamed from: g */
    @NotNull
    public String f27803g;

    /* renamed from: h */
    @NotNull
    public String f27804h;

    /* renamed from: i */
    @NotNull
    public String f27805i;

    /* renamed from: j */
    public long f27806j;

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f27799m = {C2052a.m12277l(RestoreVerifyFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/restore/verify/RestoreVerifyPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f27798l = new Companion(null);

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f27807k = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27800d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreVerifyFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = RestoreVerifyFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: RestoreVerifyFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/RestoreVerifyFragment$Companion;", "", "", "CODE_TIMESTAMP_EXPIRES", "Ljava/lang/String;", "DATA_VALUE", "HASH_VALUE", "PASSWORD_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RestoreVerifyFragment() {
        Function0<RestoreVerifyPresenter> function0 = new Function0<RestoreVerifyPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreVerifyFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RestoreVerifyPresenter invoke() {
                Lazy<RestoreVerifyPresenter> lazy = RestoreVerifyFragment.this.f27801e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27802f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(RestoreVerifyPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f27803g = "";
        this.f27804h = "";
        this.f27805i = "";
    }

    /* renamed from: A3 */
    public final RestoreVerifyPresenter m15441A3() {
        return (RestoreVerifyPresenter) this.f27802f.getValue(this, f27799m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: B0 */
    public void mo14213B0(long j2) {
        long abs = Math.abs(j2);
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 5;
            builder.f30151c = "Отправить код повторно";
            builder.m16309a(C2507R.string.notification_code_still_actual);
            builder.f30154f = "Закрыть";
            long j3 = 60;
            builder.f30155g = C3033a.m17745g(new Object[]{Long.valueOf(abs / j3), Long.valueOf(abs % j3)}, 2, "%02d:%02d", "format(format, *args)");
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: E */
    public void mo14214E(@NotNull String localizedMessage) {
        Intrinsics.m32179h(localizedMessage, "localizedMessage");
        Dialogs.f30143a.m16308g(this, localizedMessage, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: O0 */
    public void mo14215O0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_hash_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_hash_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: X0 */
    public void mo14216X0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.notification_code_successfully_sent);
        Intrinsics.m32178g(string, "getString(R.string.notif…n_code_successfully_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: b1 */
    public void mo14217b1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_code_expired);
        Intrinsics.m32178g(string, "getString(R.string.error_code_expired)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: h */
    public void mo14218h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27800d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: j */
    public void mo14219j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27800d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: k0 */
    public void mo14220k0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_profile_not_found);
        Intrinsics.m32178g(string, "getString(R.string.error_profile_not_found)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27807k.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14125h(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_confirm, viewGroup, false);
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(true);
            supportActionBar.mo341t(true);
            supportActionBar.mo342u(true);
            supportActionBar.mo345x("Подтверждение");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("DATA_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(DATA_VALUE, \"\")");
            this.f27803g = string;
            String string2 = arguments.getString("PASSWORD_VALUE", "");
            Intrinsics.m32178g(string2, "arguments.getString(PASSWORD_VALUE, \"\")");
            this.f27804h = string2;
            String string3 = arguments.getString("HASH_VALUE", "");
            Intrinsics.m32178g(string3, "arguments.getString(HASH_VALUE, \"\")");
            this.f27805i = string3;
            this.f27806j = arguments.getLong("CODE_TIMESTAMP_EXPIRES", 0L);
        }
        m15441A3().f25852b = this.f27806j;
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.resend_code_button);
        Intrinsics.m32178g(materialButton, "view.resend_code_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreVerifyFragment$onCreateView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                RestoreVerifyFragment restoreVerifyFragment = RestoreVerifyFragment.this;
                RestoreVerifyFragment.Companion companion = RestoreVerifyFragment.f27798l;
                RestoreVerifyPresenter m15441A3 = restoreVerifyFragment.m15441A3();
                RestoreVerifyFragment restoreVerifyFragment2 = RestoreVerifyFragment.this;
                m15441A3.m14211a(restoreVerifyFragment2.f27803g, restoreVerifyFragment2.f27804h, restoreVerifyFragment2.f27805i);
                return Unit.f63088a;
            }
        });
        ((OtpView) inflate.findViewById(C2507R.id.code_otp)).setOtpCompletionListener(new C0919e(this, inflate, 10));
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27807k.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: r0 */
    public void mo14221r0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_code_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_code_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: t */
    public void mo14222t() {
        Intent intent = new Intent(getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(268451840);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyView
    /* renamed from: z */
    public void mo14223z() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_password_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_password_invalid)");
        dialogs.m16308g(this, string, 0);
    }
}
