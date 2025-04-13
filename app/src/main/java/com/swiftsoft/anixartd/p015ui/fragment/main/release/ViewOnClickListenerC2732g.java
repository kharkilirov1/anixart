package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.release.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2732g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28814b;

    /* renamed from: c */
    public final /* synthetic */ ReleaseFragment f28815c;

    public /* synthetic */ ViewOnClickListenerC2732g(ReleaseFragment releaseFragment, int i2) {
        this.f28814b = i2;
        this.f28815c = releaseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28814b) {
            case 0:
                ReleaseFragment this$0 = this.f28815c;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15437u3().mo15323a3();
                break;
            case 1:
                ReleaseFragment this$02 = this.f28815c;
                ReleaseFragment.Companion companion2 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15437u3().mo15323a3();
                break;
            case 2:
                ReleaseFragment this$03 = this.f28815c;
                ReleaseFragment.Companion companion3 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15619e4().f26943g.f25344a.edit().putBoolean("IS_ADULT", true).apply();
                NestedScrollView adult_warning_layout = (NestedScrollView) this$03.m15618c4(C2507R.id.adult_warning_layout);
                Intrinsics.m32178g(adult_warning_layout, "adult_warning_layout");
                ViewsKt.m16372e(adult_warning_layout);
                break;
            case 3:
                ReleaseFragment this$04 = this.f28815c;
                ReleaseFragment.Companion companion4 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.m15437u3().mo15323a3();
                break;
            case 4:
                ReleaseFragment this$05 = this.f28815c;
                ReleaseFragment.Companion companion5 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$05, "this$0");
                Context context = this$05.getContext();
                if (context != null) {
                    Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
                    builder.f30150b = 2;
                    builder.m16318j(C2507R.string.error);
                    builder.f30152d = "Просмотр данного релиза недоступен.";
                    builder.m16315g(C2507R.string.ok);
                    builder.f30159k = true;
                    builder.m16317i();
                    break;
                }
                break;
            case 5:
                ReleaseFragment this$06 = this.f28815c;
                ReleaseFragment.Companion companion6 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$06, "this$0");
                Context context2 = this$06.getContext();
                if (context2 != null) {
                    Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(context2);
                    builder2.f30150b = 2;
                    builder2.m16318j(C2507R.string.error);
                    builder2.f30152d = "Просмотр данного релиза недоступен.";
                    builder2.m16315g(C2507R.string.ok);
                    builder2.f30159k = true;
                    builder2.m16317i();
                    break;
                }
                break;
            default:
                ReleaseFragment this$07 = this.f28815c;
                ReleaseFragment.Companion companion7 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$07, "this$0");
                Common common = new Common();
                Context requireContext = this$07.requireContext();
                Intrinsics.m32178g(requireContext, "requireContext()");
                common.m16300e(requireContext, "/full-version?code=24111318");
                break;
        }
    }
}
