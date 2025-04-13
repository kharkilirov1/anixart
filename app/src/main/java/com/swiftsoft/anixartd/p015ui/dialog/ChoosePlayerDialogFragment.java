package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.TwoFieldsRadioButton;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChoosePlayerDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChoosePlayerDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChoosePlayerDialogFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: h */
    public static final /* synthetic */ int f27677h = 0;

    /* renamed from: d */
    @Nullable
    public Episode f27678d;

    /* renamed from: f */
    public boolean f27680f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27681g = new LinkedHashMap();

    /* renamed from: e */
    public int f27679e = -1;

    /* compiled from: ChoosePlayerDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChoosePlayerDialogFragment$Companion;", "", "", "CB_ASK_ALWAYS_VALUE", "Ljava/lang/String;", "CHOOSE_PLAYER_CONTINUE_BUTTON", "EPISODE_VALUE", "LAST_SELECTED_PLAYER_VALUE", "SELECTED_PLAYER_VALUE", "SHOW_MORE_PLAYERS_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27681g.clear();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        int id2 = view.getId();
        if (id2 == C2507R.id.itemSwiftPlayer) {
            this.f27679e = 2;
        } else if (id2 == C2507R.id.itemThirdPartyPlayer) {
            this.f27679e = 3;
        } else {
            if (id2 != C2507R.id.itemWebPlayer) {
                return;
            }
            this.f27679e = 1;
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("EPISODE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
            this.f27678d = (Episode) serializable;
            this.f27680f = arguments.getBoolean("SHOW_MORE_PLAYERS_VALUE");
            if (bundle == null) {
                this.f27679e = arguments.getInt("LAST_SELECTED_PLAYER_VALUE");
            } else {
                this.f27679e = bundle.getInt("SELECTED_PLAYER_VALUE", -1);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_player, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.showMorePlayers);
            Intrinsics.m32178g(linearLayout, "view.showMorePlayers");
            final int i2 = 0;
            ViewsKt.m16373f(linearLayout, this.f27680f, false, null, 6);
            TwoFieldsRadioButton twoFieldsRadioButton = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemSwiftPlayer);
            Intrinsics.m32178g(twoFieldsRadioButton, "view.itemSwiftPlayer");
            final int i3 = 1;
            ViewsKt.m16373f(twoFieldsRadioButton, !this.f27680f, false, null, 6);
            TwoFieldsRadioButton twoFieldsRadioButton2 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemThirdPartyPlayer);
            Intrinsics.m32178g(twoFieldsRadioButton2, "view.itemThirdPartyPlayer");
            ViewsKt.m16373f(twoFieldsRadioButton2, !this.f27680f, false, null, 6);
            int i4 = this.f27679e;
            if (i4 == 1) {
                CustomRadioGroup customRadioGroup = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton3 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemWebPlayer);
                Intrinsics.m32178g(twoFieldsRadioButton3, "view.itemWebPlayer");
                customRadioGroup.setSelectedButtonToSelectedState(twoFieldsRadioButton3);
            } else if (i4 == 2) {
                CustomRadioGroup customRadioGroup2 = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton4 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemSwiftPlayer);
                Intrinsics.m32178g(twoFieldsRadioButton4, "view.itemSwiftPlayer");
                customRadioGroup2.setSelectedButtonToSelectedState(twoFieldsRadioButton4);
            } else if (i4 == 3) {
                CustomRadioGroup customRadioGroup3 = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton5 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemThirdPartyPlayer);
                Intrinsics.m32178g(twoFieldsRadioButton5, "view.itemThirdPartyPlayer");
                customRadioGroup3.setSelectedButtonToSelectedState(twoFieldsRadioButton5);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom)).setOnRadioClickListener(this);
            ((CheckBox) inflate.findViewById(C2507R.id.cbAskAlways)).setOnClickListener(new ViewOnClickListenerC2625a(this, 4));
            ((LinearLayout) inflate.findViewById(C2507R.id.showMorePlayers)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.h

                /* renamed from: c */
                public final /* synthetic */ ChoosePlayerDialogFragment f27758c;

                {
                    this.f27758c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ChoosePlayerDialogFragment this$0 = this.f27758c;
                            View view2 = inflate;
                            int i5 = ChoosePlayerDialogFragment.f27677h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27680f = true;
                            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.showMorePlayers);
                            Intrinsics.m32178g(linearLayout2, "view.showMorePlayers");
                            ViewsKt.m16372e(linearLayout2);
                            TwoFieldsRadioButton twoFieldsRadioButton6 = (TwoFieldsRadioButton) view2.findViewById(C2507R.id.itemSwiftPlayer);
                            Intrinsics.m32178g(twoFieldsRadioButton6, "view.itemSwiftPlayer");
                            twoFieldsRadioButton6.setVisibility(0);
                            TwoFieldsRadioButton twoFieldsRadioButton7 = (TwoFieldsRadioButton) view2.findViewById(C2507R.id.itemThirdPartyPlayer);
                            Intrinsics.m32178g(twoFieldsRadioButton7, "view.itemThirdPartyPlayer");
                            twoFieldsRadioButton7.setVisibility(0);
                            break;
                        default:
                            ChoosePlayerDialogFragment this$02 = this.f27758c;
                            View view3 = inflate;
                            int i6 = ChoosePlayerDialogFragment.f27677h;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.f27679e == -1) {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали плеер", null, null, 24);
                                break;
                            } else {
                                Intent intent = new Intent();
                                intent.putExtra("EPISODE_VALUE", this$02.f27678d);
                                intent.putExtra("SELECTED_PLAYER_VALUE", this$02.f27679e);
                                intent.putExtra("CB_ASK_ALWAYS_VALUE", ((CheckBox) view3.findViewById(C2507R.id.cbAskAlways)).isChecked());
                                intent.putExtra("SHOW_MORE_PLAYERS_VALUE", this$02.f27680f);
                                if (this$02.m15411u3("CHOOSE_PLAYER_CONTINUE_BUTTON", intent)) {
                                    this$02.dismiss();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.h

                /* renamed from: c */
                public final /* synthetic */ ChoosePlayerDialogFragment f27758c;

                {
                    this.f27758c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ChoosePlayerDialogFragment this$0 = this.f27758c;
                            View view2 = inflate;
                            int i5 = ChoosePlayerDialogFragment.f27677h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27680f = true;
                            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.showMorePlayers);
                            Intrinsics.m32178g(linearLayout2, "view.showMorePlayers");
                            ViewsKt.m16372e(linearLayout2);
                            TwoFieldsRadioButton twoFieldsRadioButton6 = (TwoFieldsRadioButton) view2.findViewById(C2507R.id.itemSwiftPlayer);
                            Intrinsics.m32178g(twoFieldsRadioButton6, "view.itemSwiftPlayer");
                            twoFieldsRadioButton6.setVisibility(0);
                            TwoFieldsRadioButton twoFieldsRadioButton7 = (TwoFieldsRadioButton) view2.findViewById(C2507R.id.itemThirdPartyPlayer);
                            Intrinsics.m32178g(twoFieldsRadioButton7, "view.itemThirdPartyPlayer");
                            twoFieldsRadioButton7.setVisibility(0);
                            break;
                        default:
                            ChoosePlayerDialogFragment this$02 = this.f27758c;
                            View view3 = inflate;
                            int i6 = ChoosePlayerDialogFragment.f27677h;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.f27679e == -1) {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали плеер", null, null, 24);
                                break;
                            } else {
                                Intent intent = new Intent();
                                intent.putExtra("EPISODE_VALUE", this$02.f27678d);
                                intent.putExtra("SELECTED_PLAYER_VALUE", this$02.f27679e);
                                intent.putExtra("CB_ASK_ALWAYS_VALUE", ((CheckBox) view3.findViewById(C2507R.id.cbAskAlways)).isChecked());
                                intent.putExtra("SHOW_MORE_PLAYERS_VALUE", this$02.f27680f);
                                if (this$02.m15411u3("CHOOSE_PLAYER_CONTINUE_BUTTON", intent)) {
                                    this$02.dismiss();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27681g.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_PLAYER_VALUE", this.f27679e);
        super.onSaveInstanceState(outState);
    }
}
