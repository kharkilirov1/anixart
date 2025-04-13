package com.swiftsoft.anixartd.p015ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseEpisodeQualityDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseGenresDialogFragment;
import com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresPresenter;
import com.swiftsoft.anixartd.utils.Dialogs;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2646c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27743b;

    /* renamed from: c */
    public final /* synthetic */ Object f27744c;

    /* renamed from: d */
    public final /* synthetic */ Object f27745d;

    public /* synthetic */ ViewOnClickListenerC2646c(BaseDialogFragment baseDialogFragment, View view, int i2) {
        this.f27743b = i2;
        this.f27745d = baseDialogFragment;
        this.f27744c = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = 0;
        switch (this.f27743b) {
            case 0:
                View view2 = (View) this.f27744c;
                BookmarksExportFragment this$0 = (BookmarksExportFragment) this.f27745d;
                int i3 = BookmarksExportFragment.f27608l;
                Intrinsics.m32179h(this$0, "this$0");
                AlertDialog.Builder builder = new AlertDialog.Builder(view2.getContext(), C2507R.style.DialogTheme);
                builder.mo377k(C2507R.string.select_lists);
                String[] strArr = this$0.f27611f;
                if (strArr == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                boolean[] zArr = this$0.f27613h;
                if (zArr == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                DialogInterfaceOnMultiChoiceClickListenerC2645b dialogInterfaceOnMultiChoiceClickListenerC2645b = new DialogInterfaceOnMultiChoiceClickListenerC2645b(this$0, i2);
                AlertController.AlertParams alertParams = builder.f413a;
                alertParams.f388q = strArr;
                alertParams.f396y = dialogInterfaceOnMultiChoiceClickListenerC2645b;
                alertParams.f392u = zArr;
                alertParams.f393v = true;
                AlertDialog create = builder.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterfaceOnClickListenerC2644a(this$0, i2)).create();
                Intrinsics.m32178g(create, "builder.setTitle(R.strin…                .create()");
                create.show();
                Button m365g = create.m365g(-1);
                m365g.setOnClickListener(new ViewOnClickListenerC2647d(this$0, view2, create, m365g, 0));
                return;
            case 1:
                ChooseDownloaderDialogFragment this$02 = (ChooseDownloaderDialogFragment) this.f27745d;
                View view3 = (View) this.f27744c;
                int i4 = ChooseDownloaderDialogFragment.f27656g;
                Intrinsics.m32179h(this$02, "this$0");
                if (this$02.f27658e == -1) {
                    Dialogs.m16303e(Dialogs.f30143a, this$02, "Ошибка", "Вы не выбрали плеер", null, null, 24);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("EPISODE_VALUE", this$02.f27657d);
                intent.putExtra("SELECTED_DOWNLOADER_VALUE", this$02.f27658e);
                intent.putExtra("CB_ASK_ALWAYS_VALUE", ((CheckBox) view3.findViewById(C2507R.id.cbAskAlways)).isChecked());
                if (this$02.m15411u3("CHOOSE_DOWNLOADER_CONTINUE_BUTTON", intent)) {
                    this$02.dismiss();
                    return;
                }
                return;
            case 2:
                CheckBox checkBox = (CheckBox) this.f27744c;
                ChooseEpisodeQualityDialogFragment this$03 = (ChooseEpisodeQualityDialogFragment) this.f27745d;
                ChooseEpisodeQualityDialogFragment.Companion companion = ChooseEpisodeQualityDialogFragment.f27660k;
                Intrinsics.m32179h(this$03, "this$0");
                Dialogs dialogs = Dialogs.f30143a;
                Context context = checkBox.getContext();
                Intrinsics.m32178g(context, "context");
                String string = this$03.getString(C2507R.string.hint_ask_always);
                Intrinsics.m32178g(string, "getString(R.string.hint_ask_always)");
                dialogs.m16307f(context, string);
                return;
            case 3:
                ChooseEpisodeQualityDialogFragment this$04 = (ChooseEpisodeQualityDialogFragment) this.f27745d;
                View view4 = (View) this.f27744c;
                ChooseEpisodeQualityDialogFragment.Companion companion2 = ChooseEpisodeQualityDialogFragment.f27660k;
                Intrinsics.m32179h(this$04, "this$0");
                if (this$04.f27665h == -1) {
                    Dialogs.m16303e(Dialogs.f30143a, this$04, "Ошибка", "Вы не выбрали плеер", null, null, 24);
                    return;
                }
                Intent intent2 = new Intent();
                String str = this$04.m15418c4().get(0);
                String str2 = this$04.m15418c4().get(this$04.f27665h + 1);
                intent2.putExtra("REFERER_STRING_VALUE", str);
                intent2.putExtra("URI_STRING_VALUE", str2);
                String str3 = this$04.f27662e;
                if (str3 != null) {
                    intent2.putExtra("COOKIE", str3);
                }
                String str4 = this$04.f27663f;
                if (str4 != null) {
                    intent2.putExtra("RELEASE_TITLE_VALUE", str4);
                }
                String str5 = this$04.f27664g;
                if (str5 != null) {
                    intent2.putExtra("EPISODE_TITLE_VALUE", str5);
                }
                intent2.putExtra("SELECTED_QUALITY_VALUE", this$04.f27665h);
                int i5 = this$04.f27666i;
                if (i5 != -1) {
                    intent2.putExtra("SELECTED_DOWNLOADER_VALUE", i5);
                }
                intent2.putExtra("CB_ASK_ALWAYS_VALUE", ((CheckBox) view4.findViewById(C2507R.id.cbAskAlways)).isChecked());
                if (this$04.m15411u3("CHOOSE_EPISODE_QUALITY_BUTTON", intent2)) {
                    this$04.dismiss();
                    return;
                }
                return;
            case 4:
                ChooseGenresDialogFragment this$05 = (ChooseGenresDialogFragment) this.f27744c;
                TextView textView = (TextView) this.f27745d;
                ChooseGenresDialogFragment.Companion companion3 = ChooseGenresDialogFragment.f27668j;
                Intrinsics.m32179h(this$05, "this$0");
                if (this$05.m15420A3().f26403a.m15684b()) {
                    ChooseGenresPresenter m15420A3 = this$05.m15420A3();
                    m15420A3.f26403a.f29098c.clear();
                    m15420A3.m14648a();
                } else {
                    ChooseGenresPresenter m15420A32 = this$05.m15420A3();
                    m15420A32.f26403a.f29098c.clear();
                    String[] m15683a = m15420A32.f26403a.m15683a();
                    int length = m15683a.length;
                    int i6 = 0;
                    while (i2 < length) {
                        m15420A32.f26403a.f29098c.put(Integer.valueOf(i6), m15683a[i2]);
                        i2++;
                        i6++;
                    }
                    m15420A32.m14648a();
                }
                Intrinsics.m32178g(textView, "this");
                this$05.m15421c4(textView);
                return;
            default:
                View view5 = (View) this.f27744c;
                ChooseGenresDialogFragment this$06 = (ChooseGenresDialogFragment) this.f27745d;
                ChooseGenresDialogFragment.Companion companion4 = ChooseGenresDialogFragment.f27668j;
                Intrinsics.m32179h(this$06, "this$0");
                ((MaterialSwitch) view5.findViewById(C2507R.id.swExcludeMode)).setChecked(!this$06.f27674h);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2646c(Object obj, Object obj2, int i2) {
        this.f27743b = i2;
        this.f27744c = obj;
        this.f27745d = obj2;
    }
}
