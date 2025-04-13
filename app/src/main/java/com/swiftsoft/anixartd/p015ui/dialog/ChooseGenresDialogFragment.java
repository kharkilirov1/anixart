package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.C1251a;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseGenresDialogFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.genres.ChooseGenresUiLogic;
import com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresPresenter;
import com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresView;
import com.swiftsoft.anixartd.utils.Dialogs;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseGenresDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseGenresDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/presentation/main/genres/ChooseGenresView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseGenresDialogFragment extends BaseDialogFragment implements ChooseGenresView {

    /* renamed from: d */
    @Inject
    public Lazy<ChooseGenresPresenter> f27670d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f27671e;

    /* renamed from: f */
    @NotNull
    public String[] f27672f;

    /* renamed from: g */
    @NotNull
    public List<String> f27673g;

    /* renamed from: h */
    public boolean f27674h;

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f27675i = new LinkedHashMap();

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f27669k = {C2052a.m12277l(ChooseGenresDialogFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/genres/ChooseGenresPresenter;", 0)};

    /* renamed from: j */
    @NotNull
    public static final Companion f27668j = new Companion(null);

    /* compiled from: ChooseGenresDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseGenresDialogFragment$Companion;", "", "", "CHOOSE_GENRES_CONTINUE_BUTTON", "Ljava/lang/String;", "GENRES_VALUE", "IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", "SELECTED_GENRES_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChooseGenresDialogFragment() {
        Function0<ChooseGenresPresenter> function0 = new Function0<ChooseGenresPresenter>() { // from class: com.swiftsoft.anixartd.ui.dialog.ChooseGenresDialogFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ChooseGenresPresenter invoke() {
                Lazy<ChooseGenresPresenter> lazy = ChooseGenresDialogFragment.this.f27670d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27671e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ChooseGenresPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f27672f = new String[0];
        this.f27673g = EmptyList.f63144b;
    }

    /* renamed from: A3 */
    public final ChooseGenresPresenter m15420A3() {
        return (ChooseGenresPresenter) this.f27671e.getValue(this, f27669k[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresView
    /* renamed from: W1 */
    public void mo14650W1() {
        Dialog dialog = getDialog();
        TextView textView = dialog != null ? (TextView) dialog.findViewById(C2507R.id.select_all) : null;
        if (textView != null) {
            m15421c4(textView);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresView
    /* renamed from: c */
    public void mo14651c() {
    }

    /* renamed from: c4 */
    public final void m15421c4(TextView textView) {
        if (m15420A3().f26403a.m15684b()) {
            textView.setText(C2507R.string.text_reset);
        } else {
            textView.setText(C2507R.string.select_all);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27675i.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14160y0(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        int i2 = 0;
        if (arguments != null) {
            String[] stringArray = arguments.getStringArray("GENRES_VALUE");
            if (stringArray != null) {
                this.f27672f = stringArray;
            }
            ArrayList<String> stringArrayList = arguments.getStringArrayList("SELECTED_GENRES_VALUE");
            if (stringArrayList != null) {
                this.f27673g = stringArrayList;
            }
            this.f27674h = arguments.getBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", false);
        }
        if (bundle != null) {
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("SELECTED_GENRES_VALUE");
            if (stringArrayList2 != null) {
                this.f27673g = stringArrayList2;
            }
            this.f27674h = bundle.getBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", false);
        }
        ChooseGenresPresenter m15420A3 = m15420A3();
        String[] genres = this.f27672f;
        List<String> selectedGenres = this.f27673g;
        Objects.requireNonNull(m15420A3);
        Intrinsics.m32179h(genres, "genres");
        Intrinsics.m32179h(selectedGenres, "selectedGenres");
        ChooseGenresUiLogic chooseGenresUiLogic = m15420A3.f26403a;
        Objects.requireNonNull(chooseGenresUiLogic);
        chooseGenresUiLogic.f29097b = genres;
        for (Object obj : selectedGenres) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            String str = (String) obj;
            chooseGenresUiLogic.f29098c.put(Integer.valueOf(ArraysKt.m31935K(genres, str)), str);
            i2 = i3;
        }
        chooseGenresUiLogic.f28956a = true;
        m15420A3().m14648a();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_genres, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C2507R.id.select_all);
            Intrinsics.m32178g(textView, "this");
            m15421c4(textView);
            textView.setOnClickListener(new ViewOnClickListenerC2646c((Object) this, (Object) textView, 4));
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
            epoxyRecyclerView.getContext();
            final int i2 = 1;
            final int i3 = 0;
            epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            epoxyRecyclerView.setController(m15420A3().f26404b);
            ((LinearLayout) inflate.findViewById(C2507R.id.excludeModeLayout)).setOnClickListener(new ViewOnClickListenerC2646c(inflate, this, 5));
            MaterialSwitch materialSwitch = (MaterialSwitch) inflate.findViewById(C2507R.id.swExcludeMode);
            materialSwitch.setChecked(this.f27674h);
            materialSwitch.setOnCheckedChangeListener(new C1251a(this, 1));
            ((MaterialButton) inflate.findViewById(C2507R.id.btnReset)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.g

                /* renamed from: c */
                public final /* synthetic */ ChooseGenresDialogFragment f27756c;

                {
                    this.f27756c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ChooseGenresDialogFragment this$0 = this.f27756c;
                            ChooseGenresDialogFragment.Companion companion = ChooseGenresDialogFragment.f27668j;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intent intent = new Intent();
                            intent.putStringArrayListExtra("SELECTED_GENRES_VALUE", new ArrayList<>());
                            intent.putExtra("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", false);
                            if (this$0.m15411u3("CHOOSE_GENRES_CONTINUE_BUTTON", intent)) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseGenresDialogFragment this$02 = this.f27756c;
                            ChooseGenresDialogFragment.Companion companion2 = ChooseGenresDialogFragment.f27668j;
                            Intrinsics.m32179h(this$02, "this$0");
                            Intent intent2 = new Intent();
                            HashMap<Integer, String> hashMap = this$02.m15420A3().f26403a.f29098c;
                            if (!hashMap.isEmpty()) {
                                intent2.putStringArrayListExtra("SELECTED_GENRES_VALUE", new ArrayList<>(hashMap.values()));
                                intent2.putExtra("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", this$02.f27674h);
                                if (this$02.m15411u3("CHOOSE_GENRES_CONTINUE_BUTTON", intent2)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали ни одного жанра", null, null, 24);
                                break;
                            }
                            break;
                    }
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.g

                /* renamed from: c */
                public final /* synthetic */ ChooseGenresDialogFragment f27756c;

                {
                    this.f27756c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ChooseGenresDialogFragment this$0 = this.f27756c;
                            ChooseGenresDialogFragment.Companion companion = ChooseGenresDialogFragment.f27668j;
                            Intrinsics.m32179h(this$0, "this$0");
                            Intent intent = new Intent();
                            intent.putStringArrayListExtra("SELECTED_GENRES_VALUE", new ArrayList<>());
                            intent.putExtra("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", false);
                            if (this$0.m15411u3("CHOOSE_GENRES_CONTINUE_BUTTON", intent)) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseGenresDialogFragment this$02 = this.f27756c;
                            ChooseGenresDialogFragment.Companion companion2 = ChooseGenresDialogFragment.f27668j;
                            Intrinsics.m32179h(this$02, "this$0");
                            Intent intent2 = new Intent();
                            HashMap<Integer, String> hashMap = this$02.m15420A3().f26403a.f29098c;
                            if (!hashMap.isEmpty()) {
                                intent2.putStringArrayListExtra("SELECTED_GENRES_VALUE", new ArrayList<>(hashMap.values()));
                                intent2.putExtra("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", this$02.f27674h);
                                if (this$02.m15411u3("CHOOSE_GENRES_CONTINUE_BUTTON", intent2)) {
                                    this$02.dismiss();
                                    break;
                                }
                            } else {
                                Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали ни одного жанра", null, null, 24);
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
        this.f27675i.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(this.f27673g));
        outState.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", this.f27674h);
        super.onSaveInstanceState(outState);
    }
}
