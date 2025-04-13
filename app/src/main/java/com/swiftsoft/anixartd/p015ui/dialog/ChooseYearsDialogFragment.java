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
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseYearsDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseYearsDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseYearsDialogFragment extends BaseDialogFragment {

    /* renamed from: k */
    public static final /* synthetic */ int f27700k = 0;

    /* renamed from: e */
    public final int f27702e;

    /* renamed from: f */
    public final int f27703f;

    /* renamed from: g */
    public final int f27704g;

    /* renamed from: h */
    public int f27705h;

    /* renamed from: i */
    public int f27706i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f27707j = new LinkedHashMap();

    /* renamed from: d */
    public final int f27701d = 1917;

    /* compiled from: ChooseYearsDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseYearsDialogFragment$Companion;", "", "", "CHOOSE_YEARS_CONTINUE_BUTTON", "Ljava/lang/String;", "", "MIN_YEAR_VALUE", "I", "SELECTED_END_YEAR_VALUE", "SELECTED_START_YEAR_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public ChooseYearsDialogFragment() {
        int i2 = Calendar.getInstance().get(1) + 2;
        this.f27702e = i2;
        int i3 = 1917 - 1;
        this.f27703f = i3;
        int i4 = i2 + 1;
        this.f27704g = i4;
        this.f27705h = i3;
        this.f27706i = i4;
    }

    @SuppressLint
    /* renamed from: A3 */
    public final void m15433A3(@NotNull NumberPicker numberPicker) {
        Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(numberPicker);
        Intrinsics.m32177f(obj, "null cannot be cast to non-null type android.widget.EditText");
        ((EditText) obj).setFilters(new InputFilter[0]);
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27707j.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("SELECTED_START_YEAR_VALUE")) {
                this.f27705h = arguments.getInt("SELECTED_START_YEAR_VALUE");
            }
            if (arguments.containsKey("SELECTED_END_YEAR_VALUE")) {
                this.f27706i = arguments.getInt("SELECTED_END_YEAR_VALUE");
            }
        }
        if (bundle != null) {
            this.f27705h = bundle.getInt("SELECTED_START_YEAR_VALUE");
            this.f27706i = bundle.getInt("SELECTED_END_YEAR_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_years, (ViewGroup) null);
            final int i2 = 0;
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalStart)).setFormatter(new NumberPicker.Formatter(this) { // from class: com.swiftsoft.anixartd.ui.dialog.o

                /* renamed from: b */
                public final /* synthetic */ ChooseYearsDialogFragment f27776b;

                {
                    this.f27776b = this;
                }

                @Override // android.widget.NumberPicker.Formatter
                public final String format(int i3) {
                    switch (i2) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27776b;
                            int i4 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (i3 != this$0.f27703f) {
                                break;
                            }
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27776b;
                            int i5 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (i3 != this$02.f27704g) {
                                break;
                            }
                            break;
                    }
                    return String.valueOf(i3);
                }
            });
            final int i3 = 1;
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalEnd)).setFormatter(new NumberPicker.Formatter(this) { // from class: com.swiftsoft.anixartd.ui.dialog.o

                /* renamed from: b */
                public final /* synthetic */ ChooseYearsDialogFragment f27776b;

                {
                    this.f27776b = this;
                }

                @Override // android.widget.NumberPicker.Formatter
                public final String format(int i32) {
                    switch (i3) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27776b;
                            int i4 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (i32 != this$0.f27703f) {
                                break;
                            }
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27776b;
                            int i5 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (i32 != this$02.f27704g) {
                                break;
                            }
                            break;
                    }
                    return String.valueOf(i32);
                }
            });
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalStart)).setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.p

                /* renamed from: b */
                public final /* synthetic */ ChooseYearsDialogFragment f27778b;

                {
                    this.f27778b = this;
                }

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i4, int i5) {
                    switch (i2) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27778b;
                            View view = inflate;
                            int i6 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27705h = i5;
                            ((NumberPicker) view.findViewById(C2507R.id.intervalEnd)).setMinValue(Math.max(i5, this$0.f27701d));
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27778b;
                            View view2 = inflate;
                            int i7 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27706i = i5;
                            ((NumberPicker) view2.findViewById(C2507R.id.intervalStart)).setMaxValue(Math.min(i5, this$02.f27702e));
                            break;
                    }
                }
            });
            ((NumberPicker) inflate.findViewById(C2507R.id.intervalEnd)).setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.p

                /* renamed from: b */
                public final /* synthetic */ ChooseYearsDialogFragment f27778b;

                {
                    this.f27778b = this;
                }

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i4, int i5) {
                    switch (i3) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27778b;
                            View view = inflate;
                            int i6 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.f27705h = i5;
                            ((NumberPicker) view.findViewById(C2507R.id.intervalEnd)).setMinValue(Math.max(i5, this$0.f27701d));
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27778b;
                            View view2 = inflate;
                            int i7 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.f27706i = i5;
                            ((NumberPicker) view2.findViewById(C2507R.id.intervalStart)).setMaxValue(Math.min(i5, this$02.f27702e));
                            break;
                    }
                }
            });
            NumberPicker numberPicker = (NumberPicker) inflate.findViewById(C2507R.id.intervalStart);
            numberPicker.setMinValue(this.f27703f);
            numberPicker.setMaxValue(this.f27702e);
            numberPicker.setValue(this.f27705h);
            numberPicker.setMaxValue(Math.min(this.f27706i, this.f27702e));
            NumberPicker numberPicker2 = (NumberPicker) inflate.findViewById(C2507R.id.intervalEnd);
            numberPicker2.setMinValue(this.f27701d);
            numberPicker2.setMaxValue(this.f27704g);
            numberPicker2.setValue(this.f27706i);
            numberPicker2.setMinValue(Math.max(this.f27705h, this.f27701d));
            NumberPicker numberPicker3 = (NumberPicker) inflate.findViewById(C2507R.id.intervalStart);
            Intrinsics.m32178g(numberPicker3, "view.intervalStart");
            m15433A3(numberPicker3);
            NumberPicker numberPicker4 = (NumberPicker) inflate.findViewById(C2507R.id.intervalEnd);
            Intrinsics.m32178g(numberPicker4, "view.intervalEnd");
            m15433A3(numberPicker4);
            ((MaterialButton) inflate.findViewById(C2507R.id.btnNoMatter)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.n

                /* renamed from: c */
                public final /* synthetic */ ChooseYearsDialogFragment f27774c;

                {
                    this.f27774c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4;
                    switch (i2) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27774c;
                            int i5 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intent intent = new Intent();
                            intent.putExtra("SELECTED_START_YEAR_VALUE", -1);
                            intent.putExtra("SELECTED_END_YEAR_VALUE", -1);
                            if (this$0.m15411u3("CHOOSE_YEARS_CONTINUE_BUTTON", intent)) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27774c;
                            int i6 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            int i7 = this$02.f27705h;
                            int i8 = this$02.f27703f;
                            if (i7 != i8 || this$02.f27706i != this$02.f27704g) {
                                if (i7 != i8 && this$02.f27706i == this$02.f27704g) {
                                    this$02.f27706i = i7;
                                }
                                if (i7 == i8 && (i4 = this$02.f27706i) != this$02.f27704g) {
                                    this$02.f27705h = i4;
                                }
                                Intent intent2 = new Intent();
                                intent2.putExtra("SELECTED_START_YEAR_VALUE", this$02.f27705h);
                                intent2.putExtra("SELECTED_END_YEAR_VALUE", this$02.f27706i);
                                if (this$02.m15411u3("CHOOSE_YEARS_CONTINUE_BUTTON", intent2)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали интервал", null, null, 24);
                                break;
                            }
                            break;
                    }
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.n

                /* renamed from: c */
                public final /* synthetic */ ChooseYearsDialogFragment f27774c;

                {
                    this.f27774c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4;
                    switch (i3) {
                        case 0:
                            ChooseYearsDialogFragment this$0 = this.f27774c;
                            int i5 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intent intent = new Intent();
                            intent.putExtra("SELECTED_START_YEAR_VALUE", -1);
                            intent.putExtra("SELECTED_END_YEAR_VALUE", -1);
                            if (this$0.m15411u3("CHOOSE_YEARS_CONTINUE_BUTTON", intent)) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseYearsDialogFragment this$02 = this.f27774c;
                            int i6 = ChooseYearsDialogFragment.f27700k;
                            Intrinsics.m32179h(this$02, "this$0");
                            int i7 = this$02.f27705h;
                            int i8 = this$02.f27703f;
                            if (i7 != i8 || this$02.f27706i != this$02.f27704g) {
                                if (i7 != i8 && this$02.f27706i == this$02.f27704g) {
                                    this$02.f27706i = i7;
                                }
                                if (i7 == i8 && (i4 = this$02.f27706i) != this$02.f27704g) {
                                    this$02.f27705h = i4;
                                }
                                Intent intent2 = new Intent();
                                intent2.putExtra("SELECTED_START_YEAR_VALUE", this$02.f27705h);
                                intent2.putExtra("SELECTED_END_YEAR_VALUE", this$02.f27706i);
                                if (this$02.m15411u3("CHOOSE_YEARS_CONTINUE_BUTTON", intent2)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали интервал", null, null, 24);
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
        this.f27707j.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_START_YEAR_VALUE", this.f27705h);
        outState.putInt("SELECTED_END_YEAR_VALUE", this.f27706i);
        super.onSaveInstanceState(outState);
    }
}
