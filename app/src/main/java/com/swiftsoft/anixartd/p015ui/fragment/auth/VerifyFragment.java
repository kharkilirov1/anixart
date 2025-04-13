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
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div2.C3033a;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VerifyFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/VerifyFragment;", "Lmoxy/MvpAppCompatFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/verify/VerifyView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class VerifyFragment extends MvpAppCompatFragment implements VerifyView {

    /* renamed from: c */
    @Inject
    public Lazy<VerifyPresenter> f27864c;

    /* renamed from: d */
    @NotNull
    public final MoxyKtxDelegate f27865d;

    /* renamed from: e */
    @NotNull
    public String f27866e;

    /* renamed from: f */
    @NotNull
    public String f27867f;

    /* renamed from: g */
    @Nullable
    public String f27868g;

    /* renamed from: h */
    @Nullable
    public String f27869h;

    /* renamed from: i */
    @Nullable
    public String f27870i;

    /* renamed from: j */
    @NotNull
    public String f27871j;

    /* renamed from: k */
    public long f27872k;

    /* renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f27862n = {C2052a.m12277l(VerifyFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/signup/verify/VerifyPresenter;", 0)};

    /* renamed from: m */
    @NotNull
    public static final Companion f27861m = new Companion(null);

    /* renamed from: l */
    @NotNull
    public Map<Integer, View> f27873l = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public final kotlin.Lazy f27863b = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.VerifyFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = VerifyFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: VerifyFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/VerifyFragment$Companion;", "", "", "CODE_TIMESTAMP_EXPIRES_VALUE", "Ljava/lang/String;", "EMAIL_VALUE", "GOOGLE_ID_TOKEN_VALUE", "HASH_VALUE", "LOGIN_VALUE", "PASSWORD_VALUE", "VK_ACCESS_TOKEN_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static VerifyFragment m15447a(Companion companion, String str, String str2, String str3, String str4, String str5, String str6, long j2, int i2) {
            if ((i2 & 4) != 0) {
                str3 = null;
            }
            if ((i2 & 8) != 0) {
                str4 = null;
            }
            if ((i2 & 16) != 0) {
                str5 = null;
            }
            Objects.requireNonNull(companion);
            VerifyFragment verifyFragment = new VerifyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("LOGIN_VALUE", str);
            bundle.putString("EMAIL_VALUE", str2);
            bundle.putString("PASSWORD_VALUE", str3);
            bundle.putString("VK_ACCESS_TOKEN_VALUE", str4);
            bundle.putString("GOOGLE_ID_TOKEN_VALUE", str5);
            bundle.putString("HASH_VALUE", str6);
            bundle.putLong("CODE_TIMESTAMP_EXPIRES_VALUE", j2);
            verifyFragment.setArguments(bundle);
            return verifyFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public VerifyFragment() {
        Function0<VerifyPresenter> function0 = new Function0<VerifyPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.VerifyFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public VerifyPresenter invoke() {
                Lazy<VerifyPresenter> lazy = VerifyFragment.this.f27864c;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27865d = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(VerifyPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f27866e = "";
        this.f27867f = "";
        this.f27871j = "";
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: B0 */
    public void mo14269B0(long j2) {
        long abs = Math.abs(j2);
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 5;
            String string = getString(C2507R.string.auth_resend_code);
            Intrinsics.m32178g(string, "getString(R.string.auth_resend_code)");
            builder.f30151c = string;
            builder.m16309a(C2507R.string.notification_code_still_actual);
            String string2 = getString(C2507R.string.cancel);
            Intrinsics.m32178g(string2, "getString(R.string.cancel)");
            builder.f30154f = string2;
            long j3 = 60;
            builder.f30155g = C3033a.m17745g(new Object[]{Long.valueOf(abs / j3), Long.valueOf(abs % j3)}, 2, "%02d:%02d", "format(format, *args)");
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: C */
    public void mo14270C() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_email_already_taken);
        Intrinsics.m32178g(string, "getString(R.string.error_email_already_taken)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: E */
    public void mo14271E(@NotNull String localizedMessage) {
        Intrinsics.m32179h(localizedMessage, "localizedMessage");
        Dialogs.f30143a.m16308g(this, localizedMessage, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: J */
    public void mo14272J() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_too_many_registrations, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: O0 */
    public void mo14273O0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_hash_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_hash_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: Q */
    public void mo14274Q() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_email_service_disallowed, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: X0 */
    public void mo14275X0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.notification_code_successfully_sent);
        Intrinsics.m32178g(string, "getString(R.string.notif…n_code_successfully_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: b1 */
    public void mo14276b1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_code_expired);
        Intrinsics.m32178g(string, "getString(R.string.error_code_expired)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: h */
    public void mo14277h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27863b.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: j */
    public void mo14278j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27863b.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    /* renamed from: n3 */
    public final VerifyPresenter m15446n3() {
        return (VerifyPresenter) this.f27865d.getValue(this, f27862n[0]);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14096L(this);
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
            String string = arguments.getString("LOGIN_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(LOGIN_VALUE, \"\")");
            this.f27866e = string;
            String string2 = arguments.getString("EMAIL_VALUE", "");
            Intrinsics.m32178g(string2, "arguments.getString(EMAIL_VALUE, \"\")");
            this.f27867f = string2;
            this.f27868g = arguments.getString("PASSWORD_VALUE");
            this.f27869h = arguments.getString("VK_ACCESS_TOKEN_VALUE");
            this.f27870i = arguments.getString("GOOGLE_ID_TOKEN_VALUE");
            String string3 = arguments.getString("HASH_VALUE", "");
            Intrinsics.m32178g(string3, "arguments.getString(HASH_VALUE, \"\")");
            this.f27871j = string3;
            this.f27872k = arguments.getLong("CODE_TIMESTAMP_EXPIRES_VALUE", 0L);
        }
        m15446n3().f25903b = this.f27872k;
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.resend_code_button);
        Intrinsics.m32178g(materialButton, "view.resend_code_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.VerifyFragment$onCreateView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                VerifyFragment verifyFragment = VerifyFragment.this;
                VerifyFragment.Companion companion = VerifyFragment.f27861m;
                VerifyPresenter m15446n3 = verifyFragment.m15446n3();
                VerifyFragment verifyFragment2 = VerifyFragment.this;
                m15446n3.m14267a(verifyFragment2.f27866e, verifyFragment2.f27867f, verifyFragment2.f27868g, verifyFragment2.f27869h, verifyFragment2.f27870i, verifyFragment2.f27871j);
                return Unit.f63088a;
            }
        });
        ((OtpView) inflate.findViewById(C2507R.id.code_otp)).setOtpCompletionListener(new C0919e(this, inflate, 11));
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27873l.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: r */
    public void mo14279r() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_login_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_login_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: r0 */
    public void mo14280r0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_code_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_code_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: t */
    public void mo14281t() {
        Intent intent = new Intent(getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(268451840);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: w */
    public void mo14282w() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_email_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_email_invalid)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: y */
    public void mo14283y() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_login_already_taken);
        Intrinsics.m32178g(string, "getString(R.string.error_login_already_taken)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyView
    /* renamed from: z */
    public void mo14284z() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_password_invalid);
        Intrinsics.m32178g(string, "getString(R.string.error_password_invalid)");
        dialogs.m16308g(this, string, 0);
    }
}
