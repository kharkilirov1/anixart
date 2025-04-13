package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import at.blogc.android.views.ExpandableTextView;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.release.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2735j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f28823b;

    /* renamed from: c */
    public final /* synthetic */ ReleaseFragment f28824c;

    public /* synthetic */ RunnableC2735j(ReleaseFragment releaseFragment, int i2) {
        this.f28823b = i2;
        this.f28824c = releaseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.f28823b) {
            case 0:
                ReleaseFragment this$0 = this.f28824c;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$0, "this$0");
                try {
                    ((TextView) this$0.m15618c4(C2507R.id.last_episode_update_info_text)).setSelected(true);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                ReleaseFragment this$02 = this.f28824c;
                ReleaseFragment.Companion companion2 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$02, "this$0");
                try {
                    MaterialButton expand = (MaterialButton) this$02.m15618c4(C2507R.id.expand);
                    Intrinsics.m32178g(expand, "expand");
                    if (((ExpandableTextView) this$02.m15618c4(C2507R.id.description)).getLineCount() <= ((ExpandableTextView) this$02.m15618c4(C2507R.id.description)).getMaxLines()) {
                        z = false;
                    }
                    ViewsKt.m16380m(expand, z);
                    NestedScrollView nested_scroll_view = (NestedScrollView) this$02.m15618c4(C2507R.id.nested_scroll_view);
                    Intrinsics.m32178g(nested_scroll_view, "nested_scroll_view");
                    nested_scroll_view.setVisibility(0);
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
