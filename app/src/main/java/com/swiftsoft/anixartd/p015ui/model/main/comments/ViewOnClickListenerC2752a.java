package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.view.View;
import android.widget.TextView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.comments.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2752a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f29597b;

    /* renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f29598c;

    /* renamed from: d */
    public final /* synthetic */ View f29599d;

    public /* synthetic */ ViewOnClickListenerC2752a(Ref.BooleanRef booleanRef, View view, int i2) {
        this.f29597b = i2;
        this.f29598c = booleanRef;
        this.f29599d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29597b) {
            case 0:
                Ref.BooleanRef isExpanded = this.f29598c;
                View view2 = this.f29599d;
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
            default:
                Ref.BooleanRef isExpanded2 = this.f29598c;
                View view3 = this.f29599d;
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
        }
    }
}
