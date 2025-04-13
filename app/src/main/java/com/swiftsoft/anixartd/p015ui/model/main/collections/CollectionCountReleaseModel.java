package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionCountReleaseModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCountReleaseModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CollectionCountReleaseModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29482k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29483l;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29484m;

    /* renamed from: n */
    @EpoxyAttribute
    public long f29485n;

    /* renamed from: o */
    @EpoxyAttribute
    public long f29486o;

    /* renamed from: p */
    @EpoxyAttribute
    public long f29487p;

    /* renamed from: q */
    @EpoxyAttribute
    public Listener f29488q;

    /* compiled from: CollectionCountReleaseModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCountReleaseModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: Y */
        void mo14385Y();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        long j2;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        MaterialButton materialButton = (MaterialButton) view2.findViewById(C2507R.id.random);
        Intrinsics.m32178g(materialButton, "view.random");
        ViewsKt.m16373f(materialButton, this.f29482k <= 1, false, null, 6);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.statsRegularLayout);
        Intrinsics.m32178g(linearLayout, "view.statsRegularLayout");
        ViewsKt.m16373f(linearLayout, App.f25340b.m14044b().m14083z(), false, null, 6);
        long j3 = this.f29483l + this.f29484m + this.f29485n + this.f29486o + this.f29487p;
        TextView textView = (TextView) view2.findViewById(C2507R.id.count);
        String string = context.getString(C2507R.string.collection_release_count);
        Intrinsics.m32178g(string, "context.getString(R.stri…collection_release_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f29482k)}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(format);
        ((TextView) view2.findViewById(C2507R.id.watchingCount)).setText(DigitsKt.m16325f(this.f29483l));
        ((TextView) view2.findViewById(C2507R.id.planCount)).setText(DigitsKt.m16325f(this.f29484m));
        ((TextView) view2.findViewById(C2507R.id.completedCount)).setText(DigitsKt.m16325f(this.f29485n));
        ((TextView) view2.findViewById(C2507R.id.holdOnCount)).setText(DigitsKt.m16325f(this.f29486o));
        ((TextView) view2.findViewById(C2507R.id.droppedCount)).setText(DigitsKt.m16325f(this.f29487p));
        long j4 = this.f29482k;
        long j5 = this.f29483l;
        long j6 = this.f29484m;
        long j7 = this.f29485n;
        long j8 = this.f29486o;
        long j9 = this.f29487p;
        long j10 = j4 - ((((j5 + j6) + j7) + j8) + j9);
        long j11 = 0;
        if (j3 > 0) {
            if (j10 > 0) {
                f2 = (j10 * 100) / j3;
                j11 = 0;
            } else {
                f2 = 0.0f;
            }
            if (j5 > j11) {
                f5 = (j5 * 100) / j3;
                j2 = 0;
            } else {
                j2 = j11;
                f5 = 0.0f;
            }
            f6 = j6 > j2 ? (j6 * 100) / j3 : 0.0f;
            f7 = j7 > j2 ? (j7 * 100) / j3 : 0.0f;
            f4 = j8 > j2 ? (100 * j8) / j3 : 0.0f;
            f3 = j9 > j2 ? (j9 * 100) / j3 : 0.0f;
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
        }
        ViewGroup.LayoutParams layoutParams = view2.findViewById(C2507R.id.emptyView).getLayoutParams();
        Intrinsics.m32177f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).weight = f2;
        ViewGroup.LayoutParams layoutParams2 = view2.findViewById(C2507R.id.watchingView).getLayoutParams();
        Intrinsics.m32177f(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).weight = f5;
        ViewGroup.LayoutParams layoutParams3 = view2.findViewById(C2507R.id.planView).getLayoutParams();
        Intrinsics.m32177f(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams3).weight = f6;
        ViewGroup.LayoutParams layoutParams4 = view2.findViewById(C2507R.id.completedView).getLayoutParams();
        Intrinsics.m32177f(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams4).weight = f7;
        ViewGroup.LayoutParams layoutParams5 = view2.findViewById(C2507R.id.holdOnView).getLayoutParams();
        Intrinsics.m32177f(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams5).weight = f4;
        ViewGroup.LayoutParams layoutParams6 = view2.findViewById(C2507R.id.droppedView).getLayoutParams();
        Intrinsics.m32177f(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams6).weight = f3;
        ((MaterialButton) view2.findViewById(C2507R.id.random)).setOnClickListener(new ViewOnClickListenerC2744a(this, 4));
        ((LinearLayout) view2.findViewById(C2507R.id.statsLine)).requestLayout();
    }
}
