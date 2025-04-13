package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.net.UriKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChangeEmailDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfilePreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnDonate;
import com.swiftsoft.anixartd.utils.OnGoogleBound;
import com.swiftsoft.anixartd.utils.OnGoogleUnbound;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnVkBound;
import com.swiftsoft.anixartd.utils.OnVkUnbound;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.cropper.CropImage;
import com.swiftsoft.anixartd.utils.cropper.CropImageOptions;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.C4632R;
import dagger.Lazy;
import id.zelory.compressor.Compressor;
import java.io.File;
import java.util.Arrays;
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
import kotlin.p033io.FilesKt;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p005c.C0694a;
import p031j.C6523a;
import pl.aprilapps.easyphotopicker.ChooserType;
import pl.aprilapps.easyphotopicker.DefaultCallback;
import pl.aprilapps.easyphotopicker.EasyImage;
import pl.aprilapps.easyphotopicker.MediaFile;
import pl.aprilapps.easyphotopicker.MediaSource;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: ProfilePreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/ProfilePreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePreferenceView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "", "onChooseImage", "Lcom/swiftsoft/anixartd/utils/OnVkBound;", "onVkBound", "Lcom/swiftsoft/anixartd/utils/OnGoogleBound;", "onGoogleBound", "Lcom/swiftsoft/anixartd/utils/OnVkUnbound;", "onVkUnbound", "Lcom/swiftsoft/anixartd/utils/OnGoogleUnbound;", "onGoogleUnbound", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfilePreferenceFragment extends BasePreferenceFragment implements ProfilePreferenceView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: t */
    public static final /* synthetic */ KProperty<Object>[] f28361t = {C2052a.m12277l(ProfilePreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePreferencePresenter;", 0)};

    /* renamed from: u */
    @NotNull
    public static final String[] f28362u = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: p */
    public EasyImage f28364p;

    /* renamed from: q */
    @Inject
    public Lazy<ProfilePreferencePresenter> f28365q;

    /* renamed from: r */
    @NotNull
    public final MoxyKtxDelegate f28366r;

    /* renamed from: s */
    @NotNull
    public Map<Integer, View> f28367s = new LinkedHashMap();

    /* renamed from: o */
    @NotNull
    public final kotlin.Lazy f28363o = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = ProfilePreferenceFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: ProfilePreferenceFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/ProfilePreferenceFragment$Companion;", "", "", "CHANGE_EMAIL_CONFIRM_TAG", "Ljava/lang/String;", "CHANGE_EMAIL_TAG", "CHANGE_PASSWORD_TAG", "CHOOSE_AVATAR_TYPE_TAG", "", "RC_STORAGE", "I", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public ProfilePreferenceFragment() {
        Function0<ProfilePreferencePresenter> function0 = new Function0<ProfilePreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfilePreferencePresenter invoke() {
                Lazy<ProfilePreferencePresenter> lazy = ProfilePreferenceFragment.this.f28365q;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28366r = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfilePreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    /* renamed from: e4 */
    public static boolean m15546e4(final ProfilePreferenceFragment this$0, final Preference prefStatus, Preference it) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(prefStatus, "$prefStatus");
        Intrinsics.m32179h(it, "it");
        final Context context = this$0.getContext();
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
            View inflate = this$0.getLayoutInflater().inflate(C2507R.layout.dialog_change_status, (ViewGroup) null);
            builder.setView(inflate);
            final AlertDialog m378l = builder.m378l();
            TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(C2507R.id.edit_text);
            if (this$0.m15548n4().f26596d.f29156b.length() == 0) {
                textInputEditText.setHint(context.getString(C2507R.string.hint_your_status));
            } else {
                textInputEditText.setText(this$0.m15548n4().f26596d.f29156b);
            }
            Intrinsics.m32178g(textInputEditText, "initializePreferences$la…da$21$lambda$20$lambda$19");
            textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$lambda$21$lambda$20$lambda$19$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    String valueOf = String.valueOf(editable);
                    ProfilePreferenceFragment profilePreferenceFragment = ProfilePreferenceFragment.this;
                    KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                    ProfilePreferenceUiLogic profilePreferenceUiLogic = profilePreferenceFragment.m15548n4().f26596d;
                    Objects.requireNonNull(profilePreferenceUiLogic);
                    profilePreferenceUiLogic.f29156b = valueOf;
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
            Intrinsics.m32178g(materialButton, "view.positive_button");
            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$4$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it2 = view;
                    Intrinsics.m32179h(it2, "it");
                    ProfilePreferenceFragment profilePreferenceFragment = ProfilePreferenceFragment.this;
                    KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                    if (profilePreferenceFragment.m15548n4().f26596d.f29156b.length() == 0) {
                        prefStatus.mo3362M(ProfilePreferenceFragment.this.getString(C2507R.string.status_not_set));
                        m378l.dismiss();
                        ProfilePreferenceUiLogic profilePreferenceUiLogic = ProfilePreferenceFragment.this.m15548n4().f26596d;
                        Objects.requireNonNull(profilePreferenceUiLogic);
                        profilePreferenceUiLogic.f29156b = "";
                        ProfilePreferenceFragment.this.m15548n4().m14801k();
                    } else if (ProfilePreferenceFragment.this.m15548n4().f26596d.f29156b.length() > 80) {
                        Dialogs dialogs = Dialogs.f30143a;
                        Context context2 = context;
                        Intrinsics.m32178g(context2, "context");
                        String string = ProfilePreferenceFragment.this.getString(C2507R.string.error);
                        Intrinsics.m32178g(string, "getString(R.string.error)");
                        String string2 = ProfilePreferenceFragment.this.getString(C2507R.string.error_status_is_too_long);
                        Intrinsics.m32178g(string2, "getString(R.string.error_status_is_too_long)");
                        dialogs.m16306c(context2, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                    } else {
                        prefStatus.mo3362M(ProfilePreferenceFragment.this.m15548n4().f26596d.f29156b);
                        m378l.dismiss();
                        ProfilePreferenceFragment.this.m15548n4().m14801k();
                    }
                    return Unit.f63088a;
                }
            });
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
            Intrinsics.m32178g(materialButton2, "view.negative_button");
            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$4$1$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it2 = view;
                    Intrinsics.m32179h(it2, "it");
                    AlertDialog.this.dismiss();
                    return Unit.f63088a;
                }
            });
        }
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28367s.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: C */
    public void mo14802C() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.error_email_already_taken);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: D2 */
    public void mo14803D2(@NotNull String emailHint, @NotNull String currentPassword) {
        Intrinsics.m32179h(emailHint, "emailHint");
        Intrinsics.m32179h(currentPassword, "currentPassword");
        Fragment m3000H = getChildFragmentManager().m3000H("CHANGE_EMAIL_CONFIRM_TAG");
        DialogFragment dialogFragment = m3000H instanceof DialogFragment ? (DialogFragment) m3000H : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        ChangeEmailDialogFragment changeEmailDialogFragment = new ChangeEmailDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL_HINT", emailHint);
        bundle.putString("EMAIL_CONFIRM_TOKEN", currentPassword);
        changeEmailDialogFragment.setArguments(bundle);
        changeEmailDialogFragment.show(getChildFragmentManager(), "CHANGE_EMAIL_TAG");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: D3 */
    public void mo14804D3() {
        Fragment m3000H = getChildFragmentManager().m3000H("CHANGE_EMAIL_TAG");
        DialogFragment dialogFragment = m3000H instanceof DialogFragment ? (DialogFragment) m3000H : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        String string = getString(C2507R.string.email_changed);
        Intrinsics.m32178g(string, "getString(R.string.email_changed)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: L2 */
    public void mo14805L2() {
        String string = getString(C2507R.string.password_changed);
        Intrinsics.m32178g(string, "getString(R.string.password_changed)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: Q3 */
    public void mo14806Q3() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.current_password_incorrect);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: S */
    public void mo14807S() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.password_not_match);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: U3 */
    public void mo14808U3() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.error_email_current_invalid);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: a */
    public void mo14809a() {
        ProgressBar progress_bar = (ProgressBar) m15547m4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: b */
    public void mo14810b() {
        ProgressBar progress_bar = (ProgressBar) m15547m4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: c */
    public void mo14811c() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: h */
    public void mo14812h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28363o.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: h1 */
    public void mo14813h1() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.information);
            Intrinsics.m32178g(string, "getString(R.string.information)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.forgot_password_desc);
            builder.m16315g(C2507R.string.understand);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: j */
    public void mo14814j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28363o.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: j1 */
    public void mo14815j1(@NotNull String avatar, @NotNull String status, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Intrinsics.m32179h(avatar, "avatar");
        Intrinsics.m32179h(status, "status");
        PreferenceScreen preferenceScreen = this.f5025c.f5085g;
        Preference mo3340t0 = mo3340t0("profile");
        Intrinsics.m32176e(mo3340t0);
        Preference mo3340t02 = mo3340t0("avatar");
        Intrinsics.m32176e(mo3340t02);
        Preference mo3340t03 = mo3340t0("status");
        Intrinsics.m32176e(mo3340t03);
        Preference mo3340t04 = mo3340t0("social_pages");
        Intrinsics.m32176e(mo3340t04);
        Preference mo3340t05 = mo3340t0("change_login");
        Intrinsics.m32176e(mo3340t05);
        Preference mo3340t06 = mo3340t0("change_email");
        Intrinsics.m32176e(mo3340t06);
        Preference mo3340t07 = mo3340t0("change_password");
        Intrinsics.m32176e(mo3340t07);
        Preference mo3340t08 = mo3340t0("privacy_stats");
        Intrinsics.m32176e(mo3340t08);
        final ListPreference listPreference = (ListPreference) mo3340t08;
        Preference mo3340t09 = mo3340t0("privacy_counts");
        Intrinsics.m32176e(mo3340t09);
        final ListPreference listPreference2 = (ListPreference) mo3340t09;
        Preference mo3340t010 = mo3340t0("privacy_social");
        Intrinsics.m32176e(mo3340t010);
        final ListPreference listPreference3 = (ListPreference) mo3340t010;
        Preference mo3340t011 = mo3340t0("privacy_friend_requests");
        Intrinsics.m32176e(mo3340t011);
        ListPreference listPreference4 = (ListPreference) mo3340t011;
        Preference mo3340t012 = mo3340t0("block_list");
        Intrinsics.m32176e(mo3340t012);
        Preference mo3340t013 = mo3340t0("logout");
        Intrinsics.m32176e(mo3340t013);
        Preference mo3340t014 = mo3340t0("vk");
        Intrinsics.m32176e(mo3340t014);
        SwitchPreference switchPreference = (SwitchPreference) mo3340t014;
        Preference mo3340t015 = mo3340t0("google");
        Intrinsics.m32176e(mo3340t015);
        SwitchPreference switchPreference2 = (SwitchPreference) mo3340t015;
        Preference mo3340t016 = mo3340t0("donation");
        Intrinsics.m32176e(mo3340t016);
        Preference mo3340t017 = mo3340t0("donation_separator");
        Intrinsics.m32176e(mo3340t017);
        if (m15548n4().f26596d.f29156b.length() > 0) {
            mo3340t03.mo3362M(m15548n4().f26596d.f29156b);
        } else {
            mo3340t03.mo3362M("Не установлен");
        }
        listPreference.mo3342V(m15548n4().f26596d.f29157c);
        listPreference2.mo3342V(m15548n4().f26596d.f29158d);
        listPreference3.mo3342V(m15548n4().f26596d.f29159e);
        listPreference4.mo3342V(m15548n4().f26596d.f29160f);
        switchPreference.m3461R(m15548n4().f26596d.f29161g);
        switchPreference2.m3461R(m15548n4().f26596d.f29162h);
        String string = m15548n4().f26595c.f25344a.getString("SPONSORSHIP_TEXT", "");
        String str = string != null ? string : "";
        if (!TextUtils.equals(str, mo3340t016.f4971i)) {
            mo3340t016.f4971i = str;
            mo3340t016.mo3344o();
        }
        int i6 = BuildConfig.f25343a;
        if (!m15548n4().f26595c.f25344a.getBoolean("IS_SPONSORSHIP_AVAILABLE", false)) {
            preferenceScreen.m3428V(mo3340t016);
            preferenceScreen.m3428V(mo3340t017);
        }
        mo3340t016.f4969g = C6523a.f63028s;
        mo3340t013.f4969g = new C2711q(this, 3);
        mo3340t02.f4969g = new C2711q(this, 4);
        mo3340t03.f4969g = new C0919e(this, mo3340t03, 16);
        mo3340t04.f4969g = new C2711q(this, 5);
        mo3340t05.f4969g = new C2711q(this, 6);
        mo3340t06.f4969g = new C2711q(this, 7);
        mo3340t07.f4969g = new C2711q(this, 8);
        final int i7 = 1;
        listPreference.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.p
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i7) {
                    case 0:
                        ListPreference prefPrivacySocial = listPreference;
                        ProfilePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacySocial, "$prefPrivacySocial");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = prefPrivacySocial.m3363R(obj.toString());
                        prefPrivacySocial.mo3342V(m3363R);
                        this$0.m15548n4().m14799i(m3363R);
                        break;
                    case 1:
                        ListPreference prefPrivacyStats = listPreference;
                        ProfilePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyStats, "$prefPrivacyStats");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = prefPrivacyStats.m3363R(obj.toString());
                        prefPrivacyStats.mo3342V(m3363R2);
                        this$02.m15548n4().m14800j(m3363R2);
                        break;
                    default:
                        ListPreference prefPrivacyCounts = listPreference;
                        ProfilePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyCounts, "$prefPrivacyCounts");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = prefPrivacyCounts.m3363R(obj.toString());
                        prefPrivacyCounts.mo3342V(m3363R3);
                        this$03.m15548n4().m14797g(m3363R3);
                        break;
                }
                return true;
            }
        };
        final int i8 = 2;
        listPreference2.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.p
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i8) {
                    case 0:
                        ListPreference prefPrivacySocial = listPreference2;
                        ProfilePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacySocial, "$prefPrivacySocial");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = prefPrivacySocial.m3363R(obj.toString());
                        prefPrivacySocial.mo3342V(m3363R);
                        this$0.m15548n4().m14799i(m3363R);
                        break;
                    case 1:
                        ListPreference prefPrivacyStats = listPreference2;
                        ProfilePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyStats, "$prefPrivacyStats");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = prefPrivacyStats.m3363R(obj.toString());
                        prefPrivacyStats.mo3342V(m3363R2);
                        this$02.m15548n4().m14800j(m3363R2);
                        break;
                    default:
                        ListPreference prefPrivacyCounts = listPreference2;
                        ProfilePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyCounts, "$prefPrivacyCounts");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = prefPrivacyCounts.m3363R(obj.toString());
                        prefPrivacyCounts.mo3342V(m3363R3);
                        this$03.m15548n4().m14797g(m3363R3);
                        break;
                }
                return true;
            }
        };
        final int i9 = 0;
        listPreference3.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.p
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i9) {
                    case 0:
                        ListPreference prefPrivacySocial = listPreference3;
                        ProfilePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacySocial, "$prefPrivacySocial");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = prefPrivacySocial.m3363R(obj.toString());
                        prefPrivacySocial.mo3342V(m3363R);
                        this$0.m15548n4().m14799i(m3363R);
                        break;
                    case 1:
                        ListPreference prefPrivacyStats = listPreference3;
                        ProfilePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyStats, "$prefPrivacyStats");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = prefPrivacyStats.m3363R(obj.toString());
                        prefPrivacyStats.mo3342V(m3363R2);
                        this$02.m15548n4().m14800j(m3363R2);
                        break;
                    default:
                        ListPreference prefPrivacyCounts = listPreference3;
                        ProfilePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = ProfilePreferenceFragment.f28361t;
                        Intrinsics.m32179h(prefPrivacyCounts, "$prefPrivacyCounts");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = prefPrivacyCounts.m3363R(obj.toString());
                        prefPrivacyCounts.mo3342V(m3363R3);
                        this$03.m15548n4().m14797g(m3363R3);
                        break;
                }
                return true;
            }
        };
        listPreference4.f4968f = new C0694a(listPreference3, listPreference4, this);
        mo3340t012.f4969g = new C2711q(this, i9);
        switchPreference.f4968f = new C2711q(this, 1);
        switchPreference2.f4968f = new C2711q(this, i8);
        RelativeLayout resultLayout = (RelativeLayout) m15547m4(C2507R.id.resultLayout);
        Intrinsics.m32178g(resultLayout, "resultLayout");
        ViewsKt.m16378k(resultLayout);
    }

    @Nullable
    /* renamed from: m4 */
    public View m15547m4(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28367s;
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

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14097M(this);
        getMvpDelegate().onCreate(bundle);
        EventBusKt.m16328b(this);
        Context context = getContext();
        if (context != null) {
            EasyImage.Builder builder = new EasyImage.Builder(context);
            builder.f69343c = ChooserType.CAMERA_AND_GALLERY;
            this.f28364p = builder.m34985a();
        }
        m15548n4().m14796f();
        m3418u3(C2507R.xml.preference_profile, str);
    }

    /* renamed from: n4 */
    public final ProfilePreferencePresenter m15548n4() {
        return (ProfilePreferencePresenter) this.f28366r.getValue(this, f28361t[0]);
    }

    /* renamed from: o4 */
    public final void m15549o4(Uri uri) {
        Context context = getContext();
        if (context != null) {
            File m1939a = UriKt.m1939a(uri);
            if (!Intrinsics.m32174c(FilesKt.m32140a(m1939a), "gif")) {
                m1939a = new Compressor(context).m30795a(m1939a, m1939a.getName());
            }
            if (m1939a.length() > (m15548n4().f26595c.m14047C() ? 4194304 : 1048576)) {
                Dialogs dialogs = Dialogs.f30143a;
                String string = getString(C2507R.string.error_file_too_large);
                Intrinsics.m32178g(string, "getString(R.string.error_file_too_large)");
                dialogs.m16307f(context, string);
                return;
            }
            m15548n4().m14792b(m1939a);
            Dialogs dialogs2 = Dialogs.f30143a;
            String string2 = getString(C2507R.string.avatar_changed);
            Intrinsics.m32178g(string2, "getString(R.string.avatar_changed)");
            dialogs2.m16307f(context, string2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 203) {
            CropImage.ActivityResult activityResult = intent != null ? (CropImage.ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT") : null;
            if (i3 == -1) {
                Uri uri = activityResult.f30407c;
                Intrinsics.m32178g(uri, "result.uri");
                m15549o4(uri);
            } else if (i3 == 204) {
                Objects.requireNonNull(activityResult);
            }
        }
        final Context context = getContext();
        if (context == null || (activity = getActivity()) == null) {
            return;
        }
        EasyImage easyImage = this.f28364p;
        if (easyImage != null) {
            easyImage.m34981a(i2, i3, intent, activity, new DefaultCallback() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$onActivityResult$1$1$1
                @Override // pl.aprilapps.easyphotopicker.EasyImage.Callbacks
                /* renamed from: b */
                public void mo15474b(@NotNull MediaFile[] mediaFileArr, @NotNull MediaSource mediaSource) {
                    if (!(mediaFileArr.length == 0)) {
                        MediaFile mediaFile = mediaFileArr[0];
                        String m32140a = FilesKt.m32140a(mediaFile.f69350c);
                        Uri fromFile = Uri.fromFile(mediaFile.f69350c);
                        Intrinsics.m32178g(fromFile, "fromFile(this)");
                        ProfilePreferenceFragment profilePreferenceFragment = ProfilePreferenceFragment.this;
                        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                        if (profilePreferenceFragment.m15548n4().f26595c.m14047C() && Intrinsics.m32174c(m32140a, "gif")) {
                            ProfilePreferenceFragment.this.m15549o4(fromFile);
                            return;
                        }
                        int hashCode = m32140a.hashCode();
                        if (hashCode == 105441 ? !m32140a.equals("jpg") : !(hashCode == 111145 ? m32140a.equals("png") : hashCode == 3268712 && m32140a.equals("jpeg"))) {
                            Dialogs dialogs = Dialogs.f30143a;
                            Context context2 = context;
                            Intrinsics.m32178g(context2, "context");
                            String string = ProfilePreferenceFragment.this.getString(C2507R.string.error_file_incorrect_format);
                            Intrinsics.m32178g(string, "getString(R.string.error_file_incorrect_format)");
                            dialogs.m16307f(context2, string);
                            return;
                        }
                        CropImage.ActivityBuilder activityBuilder = new CropImage.ActivityBuilder(fromFile, null);
                        CropImageOptions cropImageOptions = activityBuilder.f30303b;
                        cropImageOptions.f30318A = 128;
                        cropImageOptions.f30319B = 128;
                        cropImageOptions.f30320C = RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                        cropImageOptions.f30321D = RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
                        cropImageOptions.f30353n = 1;
                        cropImageOptions.f30354o = 1;
                        cropImageOptions.f30352m = true;
                        cropImageOptions.f30326I = 80;
                        cropImageOptions.f30341b = CropImageView.CropShape.OVAL;
                        cropImageOptions.f30352m = true;
                        activityBuilder.f30303b.f30339V = ProfilePreferenceFragment.this.getString(C2507R.string.crop_image_save);
                        activityBuilder.m16408a(context, ProfilePreferenceFragment.this);
                    }
                }
            });
        } else {
            Intrinsics.m32189r("easyImage");
            throw null;
        }
    }

    @AfterPermissionGranted(C4632R.styleable.AppCompatTheme_windowMinWidthMajor)
    public final void onChooseImage() {
        Context context = getContext();
        if (context != null) {
            String[] strArr = f28362u;
            if (!EasyPermissions.m34989a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                EasyPermissions.m34991c(new PermissionRequest.Builder(this, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
                return;
            }
            EasyImage easyImage = this.f28364p;
            if (easyImage != null) {
                easyImage.m34984d(this);
            } else {
                Intrinsics.m32189r("easyImage");
                throw null;
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((TextView) inflate.findViewById(C2507R.id.title)).setText(getString(C2507R.string.profile_settings));
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 7));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28367s.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGoogleBound(@NotNull OnGoogleBound onGoogleBound) {
        Intrinsics.m32179h(onGoogleBound, "onGoogleBound");
        Preference mo3340t0 = mo3340t0("google");
        Intrinsics.m32176e(mo3340t0);
        ((SwitchPreference) mo3340t0).m3461R(true);
        Dialogs.f30143a.m16308g(this, "Учётная запись Google была успешна привязана к Вашему аккаунту.", 0);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onGoogleUnbound(@NotNull OnGoogleUnbound onGoogleUnbound) {
        Intrinsics.m32179h(onGoogleUnbound, "onGoogleUnbound");
        Preference mo3340t0 = mo3340t0("google");
        Intrinsics.m32176e(mo3340t0);
        ((SwitchPreference) mo3340t0).m3461R(false);
        Dialogs.f30143a.m16308g(this, "Учётная запись Google была успешна отвязана от Вашего аккаунта.", 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVkBound(@NotNull OnVkBound onVkBound) {
        Intrinsics.m32179h(onVkBound, "onVkBound");
        Preference mo3340t0 = mo3340t0("vk");
        Intrinsics.m32176e(mo3340t0);
        ((SwitchPreference) mo3340t0).m3461R(true);
        Dialogs.f30143a.m16308g(this, "Учётная запись ВКонтакте была успешна привязана к Вашему аккаунту.", 0);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVkUnbound(@NotNull OnVkUnbound onVkUnbound) {
        Intrinsics.m32179h(onVkUnbound, "onVkUnbound");
        Preference mo3340t0 = mo3340t0("vk");
        Intrinsics.m32176e(mo3340t0);
        ((SwitchPreference) mo3340t0).m3461R(false);
        Dialogs.f30143a.m16308g(this, "Учётная запись ВКонтакте была успешна отвязана от Вашего аккаунта.", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: u2 */
    public void mo14816u2() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.new_password_incorrect);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: w */
    public void mo14817w() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.error_email_invalid);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        String stringExtra;
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        switch (button.hashCode()) {
            case 38068671:
                if (button.equals("CHANGE_PASSWORD_SAVE_BUTTON")) {
                    String stringExtra2 = intent.getStringExtra("CURRENT_PASSWORD_VALUE");
                    String stringExtra3 = intent.getStringExtra("NEW_PASSWORD_VALUE");
                    String stringExtra4 = intent.getStringExtra("REPEAT_PASSWORD_VALUE");
                    if (stringExtra2 != null && stringExtra3 != null && stringExtra4 != null) {
                        m15548n4().m14795e(stringExtra2, stringExtra3, stringExtra4);
                    }
                    return true;
                }
                return false;
            case 150992899:
                if (button.equals("CHANGE_EMAIL_CONFIRM_SAVE_BUTTON") && (stringExtra = intent.getStringExtra("CURRENT_PASSWORD_VALUE")) != null) {
                    m15548n4().m14794d(stringExtra);
                }
                return false;
            case 402325678:
                if (button.equals("CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON")) {
                    onChooseImage();
                    return true;
                }
                return false;
            case 464184610:
                if (button.equals("CHANGE_EMAIL_SAVE_BUTTON")) {
                    String stringExtra5 = intent.getStringExtra("EMAIL_CONFIRM_TOKEN");
                    String stringExtra6 = intent.getStringExtra("CURRENT_EMAIL_VALUE");
                    String stringExtra7 = intent.getStringExtra("NEW_EMAIL_VALUE");
                    if (stringExtra5 != null && stringExtra6 != null && stringExtra7 != null) {
                        m15548n4().m14793c(stringExtra5, stringExtra6, stringExtra7);
                    }
                    return false;
                }
                return false;
            case 666361914:
                if (button.equals("FORGOT_PASSWORD_BUTTON")) {
                    m15548n4().getViewState().mo14813h1();
                }
                return false;
            case 1250222075:
                if (button.equals("CHOOSE_SPONSOR_INFO")) {
                    YandexMetrica.reportEvent("Переход в раздел Спонсорство");
                    EventBusKt.m16327a(new OnDonate());
                    return true;
                }
                return false;
            case 1596408232:
                if (button.equals("CHOOSE_GIF_TYPE_CONTINUE_BUTTON")) {
                    if (m15548n4().f26595c.m14047C()) {
                        onChooseImage();
                    } else {
                        YandexMetrica.reportEvent("Переход в раздел Спонсорство");
                        EventBusKt.m16327a(new OnDonate());
                    }
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView
    /* renamed from: z */
    public void mo14818z() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            builder.m16319k(string);
            builder.m16309a(C2507R.string.error_password_invalid);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }
}
