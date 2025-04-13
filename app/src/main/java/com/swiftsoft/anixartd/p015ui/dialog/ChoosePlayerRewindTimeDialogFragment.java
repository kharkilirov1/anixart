package com.swiftsoft.anixartd.p015ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Dialogs;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChoosePlayerRewindTimeDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChoosePlayerRewindTimeDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChoosePlayerRewindTimeDialogFragment extends BaseDialogFragment {

    /* renamed from: h */
    public static final /* synthetic */ int f27682h = 0;

    /* renamed from: d */
    public int f27683d;

    /* renamed from: e */
    public int f27684e;

    /* renamed from: f */
    public int f27685f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27686g = new LinkedHashMap();

    /* compiled from: ChoosePlayerRewindTimeDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChoosePlayerRewindTimeDialogFragment$Companion;", "", "", "CHOOSE_CONTINUE_BUTTON", "Ljava/lang/String;", "SELECTED_MINUTES_VALUE", "SELECTED_PLAYER_REWIND_TIME", "SELECTED_SECONDS_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @SuppressLint
    /* renamed from: A3 */
    public final void m15422A3(@NotNull NumberPicker numberPicker) {
        Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(numberPicker);
        Intrinsics.m32177f(obj, "null cannot be cast to non-null type android.widget.EditText");
        ((EditText) obj).setFilters(new InputFilter[0]);
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27686g.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("SELECTED_PLAYER_REWIND_TIME")) {
            int i2 = arguments.getInt("SELECTED_PLAYER_REWIND_TIME");
            this.f27683d = i2;
            this.f27684e = i2 / 60;
            this.f27685f = i2 % 60;
        }
        if (bundle != null) {
            this.f27684e = bundle.getInt("SELECTED_MINUTES_VALUE");
            this.f27685f = bundle.getInt("SELECTED_SECONDS_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_player_rewind_time, (ViewGroup) null);
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalMinutes)).setFormatter(C2653j.f27762b);
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalSeconds)).setFormatter(C2653j.f27763c);
            final int i2 = 0;
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalMinutes)).setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.k

                /* renamed from: b */
                public final /* synthetic */ ChoosePlayerRewindTimeDialogFragment f27766b;

                {
                    this.f27766b = this;
                }

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                    switch (i2) {
                        case 0:
                            ChoosePlayerRewindTimeDialogFragment this$0 = this.f27766b;
                            int i5 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27684e = i4;
                            break;
                        default:
                            ChoosePlayerRewindTimeDialogFragment this$02 = this.f27766b;
                            int i6 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27685f = i4;
                            break;
                    }
                }
            });
            final int i3 = 1;
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalSeconds)).setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.k

                /* renamed from: b */
                public final /* synthetic */ ChoosePlayerRewindTimeDialogFragment f27766b;

                {
                    this.f27766b = this;
                }

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i32, int i4) {
                    switch (i3) {
                        case 0:
                            ChoosePlayerRewindTimeDialogFragment this$0 = this.f27766b;
                            int i5 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27684e = i4;
                            break;
                        default:
                            ChoosePlayerRewindTimeDialogFragment this$02 = this.f27766b;
                            int i6 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27685f = i4;
                            break;
                    }
                }
            });
            NumberPicker numberPicker = (NumberPicker) inflate.findViewById(C2507R.id.intervalMinutes);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(3);
            numberPicker.setValue(this.f27684e);
            NumberPicker numberPicker2 = (NumberPicker) inflate.findViewById(C2507R.id.intervalSeconds);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(59);
            numberPicker2.setValue(this.f27685f);
            NumberPicker numberPicker3 = (NumberPicker) inflate.findViewById(C2507R.id.intervalMinutes);
            Intrinsics.m32178g(numberPicker3, "view.intervalMinutes");
            m15422A3(numberPicker3);
            NumberPicker numberPicker4 = (NumberPicker) inflate.findViewById(C2507R.id.intervalSeconds);
            Intrinsics.m32178g(numberPicker4, "view.intervalSeconds");
            m15422A3(numberPicker4);
            ((MaterialButton) inflate.findViewById(C2507R.id.btnCancel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.i

                /* renamed from: c */
                public final /* synthetic */ ChoosePlayerRewindTimeDialogFragment f27761c;

                {
                    this.f27761c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ChoosePlayerRewindTimeDialogFragment this$0 = this.f27761c;
                            int i4 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChoosePlayerRewindTimeDialogFragment this$02 = this.f27761c;
                            int i5 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$02, "this$0");
                            int i6 = (this$02.f27684e * 60) + this$02.f27685f;
                            if (i6 >= 5) {
                                Intent intent = new Intent();
                                intent.putExtra("SELECTED_PLAYER_REWIND_TIME", i6);
                                if (this$02.m15411u3("CHOOSE_CONTINUE_BUTTON", intent)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Минимальное значение 5 секунд", null, null, 24);
                                break;
                            }
                            break;
                    }
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.i

                /* renamed from: c */
                public final /* synthetic */ ChoosePlayerRewindTimeDialogFragment f27761c;

                {
                    this.f27761c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ChoosePlayerRewindTimeDialogFragment this$0 = this.f27761c;
                            int i4 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChoosePlayerRewindTimeDialogFragment this$02 = this.f27761c;
                            int i5 = ChoosePlayerRewindTimeDialogFragment.f27682h;
                            Intrinsics.m32179h(this$02, "this$0");
                            int i6 = (this$02.f27684e * 60) + this$02.f27685f;
                            if (i6 >= 5) {
                                Intent intent = new Intent();
                                intent.putExtra("SELECTED_PLAYER_REWIND_TIME", i6);
                                if (this$02.m15411u3("CHOOSE_CONTINUE_BUTTON", intent)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Минимальное значение 5 секунд", null, null, 24);
                                break;
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
        this.f27686g.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_PLAYER_REWIND_TIME", this.f27683d);
        outState.putInt("SELECTED_MINUTES_VALUE", this.f27684e);
        outState.putInt("SELECTED_SECONDS_VALUE", this.f27685f);
        super.onSaveInstanceState(outState);
    }
}
