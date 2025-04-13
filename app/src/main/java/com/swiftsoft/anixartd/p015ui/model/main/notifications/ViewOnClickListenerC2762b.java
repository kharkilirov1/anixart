package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.view.View;
import android.widget.TextView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.notifications.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2762b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f29806b;

    /* renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f29807c;

    /* renamed from: d */
    public final /* synthetic */ View f29808d;

    public /* synthetic */ ViewOnClickListenerC2762b(Ref.BooleanRef booleanRef, View view, int i2) {
        this.f29806b = i2;
        this.f29807c = booleanRef;
        this.f29808d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29806b) {
            case 0:
                Ref.BooleanRef isExpanded = this.f29807c;
                View view2 = this.f29808d;
                Intrinsics.m32179h(isExpanded, "$isExpanded");
                Intrinsics.m32179h(view2, "$view");
                if (!isExpanded.f63347b) {
                    isExpanded.f63347b = true;
                    TextView textView = (TextView) view2.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView, "view.tvSpoilerHint");
                    ViewsKt.m16372e(textView);
                    ((TextView) view2.findViewById(C2507R.id.tvSpoilerAction)).setText("Нажмите, чтобы скрыть");
                    TextView textView2 = (TextView) view2.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView2, "view.message");
                    textView2.setVisibility(0);
                    break;
                } else {
                    isExpanded.f63347b = false;
                    TextView textView3 = (TextView) view2.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView3, "view.tvSpoilerHint");
                    textView3.setVisibility(0);
                    ((TextView) view2.findViewById(C2507R.id.tvSpoilerAction)).setText("Нажмите, чтобы увидеть");
                    TextView textView4 = (TextView) view2.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView4, "view.message");
                    ViewsKt.m16372e(textView4);
                    break;
                }
            case 1:
                Ref.BooleanRef isExpanded2 = this.f29807c;
                View view3 = this.f29808d;
                Intrinsics.m32179h(isExpanded2, "$isExpanded");
                Intrinsics.m32179h(view3, "$view");
                if (!isExpanded2.f63347b) {
                    isExpanded2.f63347b = true;
                    TextView textView5 = (TextView) view3.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView5, "view.tvSpoilerHint");
                    ViewsKt.m16372e(textView5);
                    ((TextView) view3.findViewById(C2507R.id.tvSpoilerAction)).setText(view3.getContext().getString(C2507R.string.comment_spoiler_hide));
                    TextView textView6 = (TextView) view3.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView6, "view.message");
                    textView6.setVisibility(0);
                    break;
                } else {
                    isExpanded2.f63347b = false;
                    TextView textView7 = (TextView) view3.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView7, "view.tvSpoilerHint");
                    textView7.setVisibility(0);
                    ((TextView) view3.findViewById(C2507R.id.tvSpoilerAction)).setText(view3.getContext().getString(C2507R.string.comment_spoiler_show));
                    TextView textView8 = (TextView) view3.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView8, "view.message");
                    ViewsKt.m16372e(textView8);
                    break;
                }
            case 2:
                Ref.BooleanRef isExpanded3 = this.f29807c;
                View view4 = this.f29808d;
                Intrinsics.m32179h(isExpanded3, "$isExpanded");
                Intrinsics.m32179h(view4, "$view");
                if (!isExpanded3.f63347b) {
                    isExpanded3.f63347b = true;
                    TextView textView9 = (TextView) view4.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView9, "view.tvSpoilerHint");
                    ViewsKt.m16372e(textView9);
                    ((TextView) view4.findViewById(C2507R.id.tvSpoilerAction)).setText(view4.getContext().getString(C2507R.string.comment_spoiler_hide));
                    TextView textView10 = (TextView) view4.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView10, "view.message");
                    textView10.setVisibility(0);
                    break;
                } else {
                    isExpanded3.f63347b = false;
                    TextView textView11 = (TextView) view4.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView11, "view.tvSpoilerHint");
                    textView11.setVisibility(0);
                    ((TextView) view4.findViewById(C2507R.id.tvSpoilerAction)).setText(view4.getContext().getString(C2507R.string.comment_spoiler_show));
                    TextView textView12 = (TextView) view4.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView12, "view.message");
                    ViewsKt.m16372e(textView12);
                    break;
                }
            default:
                Ref.BooleanRef isExpanded4 = this.f29807c;
                View view5 = this.f29808d;
                Intrinsics.m32179h(isExpanded4, "$isExpanded");
                Intrinsics.m32179h(view5, "$view");
                if (!isExpanded4.f63347b) {
                    isExpanded4.f63347b = true;
                    TextView textView13 = (TextView) view5.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView13, "view.tvSpoilerHint");
                    ViewsKt.m16372e(textView13);
                    ((TextView) view5.findViewById(C2507R.id.tvSpoilerAction)).setText("Нажмите, чтобы скрыть");
                    TextView textView14 = (TextView) view5.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView14, "view.message");
                    textView14.setVisibility(0);
                    break;
                } else {
                    isExpanded4.f63347b = false;
                    TextView textView15 = (TextView) view5.findViewById(C2507R.id.tvSpoilerHint);
                    Intrinsics.m32178g(textView15, "view.tvSpoilerHint");
                    textView15.setVisibility(0);
                    ((TextView) view5.findViewById(C2507R.id.tvSpoilerAction)).setText("Нажмите, чтобы увидеть");
                    TextView textView16 = (TextView) view5.findViewById(C2507R.id.message);
                    Intrinsics.m32178g(textView16, "view.message");
                    ViewsKt.m16372e(textView16);
                    break;
                }
        }
    }
}
