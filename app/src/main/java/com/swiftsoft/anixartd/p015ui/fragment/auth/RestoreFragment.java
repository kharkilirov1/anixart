package com.swiftsoft.anixartd.p015ui.fragment.auth;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.presentation.auth.restore.RestorePresenter;
import com.swiftsoft.anixartd.presentation.auth.restore.RestoreView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RestoreFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/auth/RestoreFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/auth/restore/RestoreView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RestoreFragment extends BaseFragment implements RestoreView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f27789h = {C2052a.m12277l(RestoreFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/auth/restore/RestorePresenter;", 0)};

    /* renamed from: e */
    @Inject
    public Lazy<RestorePresenter> f27791e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27792f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27793g = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27790d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = RestoreFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    public RestoreFragment() {
        Function0<RestorePresenter> function0 = new Function0<RestorePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RestorePresenter invoke() {
                Lazy<RestorePresenter> lazy = RestoreFragment.this.f27791e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27792f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(RestorePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15440A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27793g;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: C1 */
    public void mo14200C1(@NotNull String data, @NotNull String password, @NotNull String hash, long j2) {
        Intrinsics.m32179h(data, "data");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(hash, "hash");
        FragmentNavigation m15437u3 = m15437u3();
        Objects.requireNonNull(RestoreVerifyFragment.f27798l);
        RestoreVerifyFragment restoreVerifyFragment = new RestoreVerifyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DATA_VALUE", data);
        bundle.putString("PASSWORD_VALUE", password);
        bundle.putString("HASH_VALUE", hash);
        bundle.putLong("CODE_TIMESTAMP_EXPIRES", j2);
        restoreVerifyFragment.setArguments(bundle);
        m15437u3.mo15324d2(restoreVerifyFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: E */
    public void mo14201E(@NotNull String localizedMessage) {
        Intrinsics.m32179h(localizedMessage, "localizedMessage");
        Dialogs.f30143a.m16308g(this, localizedMessage, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: G0 */
    public void mo14202G0() {
        ((TextInputLayout) m15440A3(C2507R.id.password_repeat_input_layout)).setError("Пароль слишком короткий или содержит недопустимые символы.");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: I */
    public void mo14203I() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.warning, C2507R.string.notification_code_already_sent, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: S */
    public void mo14204S() {
        ((TextInputLayout) m15440A3(C2507R.id.password_repeat_input_layout)).setError("Пароль не совпадает");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: Z */
    public void mo14205Z() {
        ((TextInputLayout) m15440A3(C2507R.id.password_input_layout)).setError("Пароль слишком короткий или содержит недопустимые символы.");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: Z0 */
    public void mo14206Z0() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_code_cannot_send, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: f3 */
    public void mo14207f3() {
        ((TextInputLayout) m15440A3(C2507R.id.data_input_layout)).setError("Никнейм или Email не указан");
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: h */
    public void mo14208h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27790d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: j */
    public void mo14209j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27790d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.restore.RestoreView
    /* renamed from: k0 */
    public void mo14210k0() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.error_profile_not_found, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27793g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14104T(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_restore_pass, viewGroup, false);
        FragmentActivity activity = getActivity();
        Intrinsics.m32177f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo343v(true);
            supportActionBar.mo341t(true);
            supportActionBar.mo342u(true);
            supportActionBar.mo345x("Восстановление пароля");
        }
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.restore_button);
        Intrinsics.m32178g(materialButton, "view.restore_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.auth.RestoreFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                RestoreFragment restoreFragment = RestoreFragment.this;
                KProperty<Object>[] kPropertyArr = RestoreFragment.f27789h;
                ((TextInputLayout) restoreFragment.m15440A3(C2507R.id.data_input_layout)).setError(null);
                ((TextInputLayout) restoreFragment.m15440A3(C2507R.id.password_input_layout)).setError(null);
                ((TextInputLayout) restoreFragment.m15440A3(C2507R.id.password_repeat_input_layout)).setError(null);
                ((TextInputLayout) restoreFragment.m15440A3(C2507R.id.password_repeat_input_layout)).setError(null);
                String valueOf = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.data_edit_text)).getText());
                String valueOf2 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.password_edit_text)).getText());
                String valueOf3 = String.valueOf(((TextInputEditText) inflate.findViewById(C2507R.id.password_repeat_edit_text)).getText());
                RestoreFragment restoreFragment2 = RestoreFragment.this;
                ((RestorePresenter) restoreFragment2.f27792f.getValue(restoreFragment2, RestoreFragment.f27789h[0])).m14199a(valueOf, valueOf2, valueOf3);
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27793g.clear();
    }
}
