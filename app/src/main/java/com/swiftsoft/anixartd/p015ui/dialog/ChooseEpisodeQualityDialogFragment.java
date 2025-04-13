package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.OneFieldRadioButton;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseEpisodeQualityDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseEpisodeQualityDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseEpisodeQualityDialogFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: k */
    @NotNull
    public static final Companion f27660k = new Companion(null);

    /* renamed from: d */
    public List<String> f27661d;

    /* renamed from: e */
    @Nullable
    public String f27662e;

    /* renamed from: f */
    @Nullable
    public String f27663f;

    /* renamed from: g */
    @Nullable
    public String f27664g;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f27667j = new LinkedHashMap();

    /* renamed from: h */
    public int f27665h = -1;

    /* renamed from: i */
    public int f27666i = -1;

    /* compiled from: ChooseEpisodeQualityDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseEpisodeQualityDialogFragment$Companion;", "", "", "CB_ASK_ALWAYS_VALUE", "Ljava/lang/String;", "CHOOSE_EPISODE_QUALITY_BUTTON", "COOKIE", "EPISODE_TITLE_VALUE", "QUALITIES_VALUE", "REFERER_STRING_VALUE", "RELEASE_TITLE_VALUE", "SELECTED_DOWNLOADER_VALUE", "SELECTED_QUALITY_VALUE", "URI_STRING_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ChooseEpisodeQualityDialogFragment m15419a(@NotNull List<String> qualities, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            Intrinsics.m32179h(qualities, "qualities");
            ChooseEpisodeQualityDialogFragment chooseEpisodeQualityDialogFragment = new ChooseEpisodeQualityDialogFragment();
            Bundle bundle = new Bundle();
            Object[] array = qualities.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putStringArray("QUALITIES_VALUE", (String[]) array);
            if (str != null) {
                bundle.putString("COOKIE", str);
            }
            if (str2 != null) {
                bundle.putString("RELEASE_TITLE_VALUE", str2);
            }
            if (str3 != null) {
                bundle.putString("EPISODE_TITLE_VALUE", str3);
            }
            if (num != null) {
                bundle.putInt("SELECTED_DOWNLOADER_VALUE", num.intValue());
            }
            chooseEpisodeQualityDialogFragment.setArguments(bundle);
            return chooseEpisodeQualityDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Nullable
    /* renamed from: A3 */
    public View m15417A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27667j;
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

    @NotNull
    /* renamed from: c4 */
    public final List<String> m15418c4() {
        List<String> list = this.f27661d;
        if (list != null) {
            return list;
        }
        Intrinsics.m32189r("qualities");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27667j.clear();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        int i2;
        Intrinsics.m32179h(view, "view");
        switch (view.getId()) {
            case C2507R.id.itemQualityDefault /* 2131362398 */:
                i2 = 0;
                break;
            case C2507R.id.itemQualityHigh /* 2131362399 */:
                i2 = 3;
                break;
            case C2507R.id.itemQualityLow /* 2131362400 */:
                i2 = 1;
                break;
            case C2507R.id.itemQualityMedium /* 2131362401 */:
                i2 = 2;
                break;
            case C2507R.id.itemQualityUltraHigh /* 2131362402 */:
                i2 = 4;
                break;
            default:
                i2 = -1;
                break;
        }
        this.f27665h = i2;
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String[] stringArray = arguments.getStringArray("QUALITIES_VALUE");
            if (stringArray != null) {
                this.f27661d = ArraysKt.m31953c0(stringArray);
            }
            this.f27662e = arguments.getString("COOKIE");
            this.f27663f = arguments.getString("RELEASE_TITLE_VALUE");
            this.f27664g = arguments.getString("EPISODE_TITLE_VALUE");
            this.f27666i = arguments.getInt("SELECTED_DOWNLOADER_VALUE", -1);
        }
        if (bundle != null) {
            this.f27665h = bundle.getInt("SELECTED_QUALITY_VALUE", -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_quality, (ViewGroup) null);
            if (m15418c4().get(1) == null) {
                OneFieldRadioButton oneFieldRadioButton = (OneFieldRadioButton) inflate.findViewById(C2507R.id.itemQualityDefault);
                Intrinsics.m32178g(oneFieldRadioButton, "view.itemQualityDefault");
                ViewsKt.m16372e(oneFieldRadioButton);
            }
            int i2 = 2;
            if (m15418c4().get(2) == null) {
                OneFieldRadioButton oneFieldRadioButton2 = (OneFieldRadioButton) inflate.findViewById(C2507R.id.itemQualityLow);
                Intrinsics.m32178g(oneFieldRadioButton2, "view.itemQualityLow");
                ViewsKt.m16372e(oneFieldRadioButton2);
            }
            int i3 = 3;
            if (m15418c4().get(3) == null) {
                OneFieldRadioButton oneFieldRadioButton3 = (OneFieldRadioButton) inflate.findViewById(C2507R.id.itemQualityMedium);
                Intrinsics.m32178g(oneFieldRadioButton3, "view.itemQualityMedium");
                ViewsKt.m16372e(oneFieldRadioButton3);
            }
            if (m15418c4().get(4) == null) {
                OneFieldRadioButton oneFieldRadioButton4 = (OneFieldRadioButton) inflate.findViewById(C2507R.id.itemQualityHigh);
                Intrinsics.m32178g(oneFieldRadioButton4, "view.itemQualityHigh");
                ViewsKt.m16372e(oneFieldRadioButton4);
            }
            if (m15418c4().get(5) == null) {
                OneFieldRadioButton oneFieldRadioButton5 = (OneFieldRadioButton) inflate.findViewById(C2507R.id.itemQualityUltraHigh);
                Intrinsics.m32178g(oneFieldRadioButton5, "view.itemQualityUltraHigh");
                ViewsKt.m16372e(oneFieldRadioButton5);
            }
            int i4 = this.f27665h;
            OneFieldRadioButton oneFieldRadioButton6 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? null : (OneFieldRadioButton) m15417A3(C2507R.id.itemQualityUltraHigh) : (OneFieldRadioButton) m15417A3(C2507R.id.itemQualityHigh) : (OneFieldRadioButton) m15417A3(C2507R.id.itemQualityMedium) : (OneFieldRadioButton) m15417A3(C2507R.id.itemQualityLow) : (OneFieldRadioButton) m15417A3(C2507R.id.itemQualityDefault);
            if (oneFieldRadioButton6 != null) {
                ((CustomRadioGroup) inflate.findViewById(C2507R.id.qualities)).setSelectedButtonToSelectedState(oneFieldRadioButton6);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.qualities)).setOnRadioClickListener(this);
            CheckBox checkBox = (CheckBox) inflate.findViewById(C2507R.id.cbAskAlways);
            checkBox.setOnClickListener(new ViewOnClickListenerC2646c(checkBox, this, i2));
            ViewsKt.m16373f(checkBox, this.f27666i != -1, false, null, 6);
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2646c((BaseDialogFragment) this, inflate, i3));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27667j.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("SELECTED_QUALITY_VALUE", this.f27665h);
        super.onSaveInstanceState(outState);
    }
}
