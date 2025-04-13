package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.preference.Preference;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChangeEmailConfirmDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChangePasswordDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseAvatarTypeDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileBlockListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileSocialFragment;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnGoogleBind;
import com.swiftsoft.anixartd.utils.OnGoogleUnbind;
import com.swiftsoft.anixartd.utils.OnLogOut;
import com.swiftsoft.anixartd.utils.OnVkBind;
import com.swiftsoft.anixartd.utils.OnVkUnbind;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2711q implements Preference.OnPreferenceClickListener, Preference.OnPreferenceChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f28436b;

    /* renamed from: c */
    public final /* synthetic */ ProfilePreferenceFragment f28437c;

    public /* synthetic */ C2711q(ProfilePreferenceFragment profilePreferenceFragment, int i2) {
        this.f28436b = i2;
        this.f28437c = profilePreferenceFragment;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, Object obj) {
        switch (this.f28436b) {
            case 1:
                ProfilePreferenceFragment this$0 = this.f28437c;
                KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(preference, "preference");
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (((Boolean) obj).booleanValue()) {
                    EventBusKt.m16327a(new OnVkBind());
                } else {
                    Context context = this$0.getContext();
                    if (context != null) {
                        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
                        builder.f30150b = 3;
                        builder.f30151c = "Отвязатка учётной записи";
                        builder.f30152d = "Учётная запись ВКонтакте будет отвязана от этого аккаунта. Вход будет возможен только по логину и паролю, если больше нет привязки к другим сервисам. Вы действительно хотите продолжить?";
                        builder.f30153e = "Нет";
                        builder.f30154f = "Да";
                        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$14$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                Dialogs.MaterialDialog it = materialDialog;
                                Intrinsics.m32179h(it, "it");
                                EventBusKt.m16327a(new OnVkUnbind());
                                return Unit.f63088a;
                            }
                        });
                        builder.m16317i();
                    }
                }
                return false;
            default:
                ProfilePreferenceFragment this$02 = this.f28437c;
                KProperty<Object>[] kPropertyArr2 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(preference, "preference");
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (((Boolean) obj).booleanValue()) {
                    EventBusKt.m16327a(new OnGoogleBind());
                } else {
                    Context context2 = this$02.getContext();
                    if (context2 != null) {
                        Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(context2);
                        builder2.f30150b = 3;
                        builder2.f30151c = "Отвязатка учётной записи";
                        builder2.f30152d = "Учётная запись Google будет отвязана от этого аккаунта. Вход будет возможен только по логину и паролю, если больше нет привязки к другим сервисам. Вы действительно хотите продолжить?";
                        builder2.f30153e = "Нет";
                        builder2.f30154f = "Да";
                        builder2.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$15$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                Dialogs.MaterialDialog it = materialDialog;
                                Intrinsics.m32179h(it, "it");
                                EventBusKt.m16327a(new OnGoogleUnbind());
                                return Unit.f63088a;
                            }
                        });
                        builder2.m16317i();
                    }
                }
                return false;
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        switch (this.f28436b) {
            case 0:
                ProfilePreferenceFragment this$0 = this.f28437c;
                KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15438c4().mo15324d2(new ProfileBlockListFragment(), null);
                break;
            case 1:
            case 2:
            default:
                ProfilePreferenceFragment this$02 = this.f28437c;
                KProperty<Object>[] kPropertyArr2 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$02, "this$0");
                new ChangePasswordDialogFragment().show(this$02.getChildFragmentManager(), "CHANGE_PASSWORD_TAG");
                break;
            case 3:
                ProfilePreferenceFragment this$03 = this.f28437c;
                KProperty<Object>[] kPropertyArr3 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$03, "this$0");
                Context context = this$03.getContext();
                if (context != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
                    View inflate = this$03.getLayoutInflater().inflate(C2507R.layout.dialog_normal, (ViewGroup) null);
                    builder.setView(inflate);
                    final AlertDialog m378l = builder.m378l();
                    ((TextView) inflate.findViewById(C2507R.id.title)).setText("Выход");
                    ((TextView) inflate.findViewById(C2507R.id.content)).setText("Вы уверены, что хотите выйти из своей учетной записи?");
                    ((MaterialButton) inflate.findViewById(C2507R.id.positive_button)).setText("Выйти");
                    ((MaterialButton) inflate.findViewById(C2507R.id.negative_button)).setText("Отмена");
                    MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
                    Intrinsics.m32178g(materialButton, "view.positive_button");
                    ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$2$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(View view) {
                            View it = view;
                            Intrinsics.m32179h(it, "it");
                            AlertDialog.this.dismiss();
                            EventBusKt.m16327a(new OnLogOut());
                            return Unit.f63088a;
                        }
                    });
                    MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
                    Intrinsics.m32178g(materialButton2, "view.negative_button");
                    ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfilePreferenceFragment$initializePreferences$2$1$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(View view) {
                            View it = view;
                            Intrinsics.m32179h(it, "it");
                            AlertDialog.this.dismiss();
                            return Unit.f63088a;
                        }
                    });
                    break;
                }
                break;
            case 4:
                ProfilePreferenceFragment this$04 = this.f28437c;
                KProperty<Object>[] kPropertyArr4 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$04, "this$0");
                boolean z = this$04.m15548n4().f26596d.f29165k;
                long j2 = this$04.m15548n4().f26596d.f29166l;
                if (!z) {
                    boolean m14047C = this$04.m15548n4().f26595c.m14047C();
                    boolean m14048D = this$04.m15548n4().f26595c.m14048D();
                    ChooseAvatarTypeDialogFragment chooseAvatarTypeDialogFragment = new ChooseAvatarTypeDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IS_SPONSOR_VALUE", m14047C);
                    bundle.putBoolean("IS_SPONSORSHIP_PROMOTION_VALUE", m14048D);
                    chooseAvatarTypeDialogFragment.setArguments(bundle);
                    chooseAvatarTypeDialogFragment.show(this$04.getChildFragmentManager(), "CHOOSE_AVATAR_TYPE_TAG");
                    break;
                } else {
                    Context context2 = this$04.getContext();
                    if (context2 != null) {
                        String m16361g = Time.f30247a.m16361g(context2, j2);
                        Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(context2);
                        builder2.f30150b = 2;
                        builder2.m16318j(C2507R.string.error);
                        String string = this$04.getString(C2507R.string.error_change_avatar_banned);
                        Intrinsics.m32178g(string, "getString(R.string.error_change_avatar_banned)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{m16361g}, 1));
                        Intrinsics.m32178g(format, "format(format, *args)");
                        builder2.f30152d = format;
                        builder2.m16315g(C2507R.string.ok);
                        builder2.m16317i();
                        break;
                    }
                }
                break;
            case 5:
                ProfilePreferenceFragment this$05 = this.f28437c;
                KProperty<Object>[] kPropertyArr5 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.m15438c4().mo15324d2(new ProfileSocialFragment(), null);
                break;
            case 6:
                ProfilePreferenceFragment this$06 = this.f28437c;
                KProperty<Object>[] kPropertyArr6 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$06, "this$0");
                boolean z2 = this$06.m15548n4().f26596d.f29163i;
                long j3 = this$06.m15548n4().f26596d.f29164j;
                if (!z2) {
                    this$06.m15438c4().mo15324d2(new ChangeLoginPreferenceFragment(), null);
                    break;
                } else {
                    Context context3 = this$06.getContext();
                    if (context3 != null) {
                        String m16361g2 = Time.f30247a.m16361g(context3, j3);
                        Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(context3);
                        builder3.f30150b = 2;
                        builder3.m16318j(C2507R.string.error);
                        String string2 = this$06.getString(C2507R.string.error_change_login_banned);
                        Intrinsics.m32178g(string2, "getString(R.string.error_change_login_banned)");
                        String format2 = String.format(string2, Arrays.copyOf(new Object[]{m16361g2}, 1));
                        Intrinsics.m32178g(format2, "format(format, *args)");
                        builder3.f30152d = format2;
                        builder3.m16315g(C2507R.string.ok);
                        builder3.m16317i();
                        break;
                    }
                }
                break;
            case 7:
                ProfilePreferenceFragment this$07 = this.f28437c;
                KProperty<Object>[] kPropertyArr7 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$07, "this$0");
                new ChangeEmailConfirmDialogFragment().show(this$07.getChildFragmentManager(), "CHANGE_EMAIL_CONFIRM_TAG");
                break;
        }
        return true;
    }
}
