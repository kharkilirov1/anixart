package com.swiftsoft.anixartd.p015ui.model.main;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class DescModel_ extends DescModel implements GeneratedModel<View>, DescModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModelBuilder
    /* renamed from: J1 */
    public DescModelBuilder mo15797J1(DescModel.Listener listener) {
        m4524l2();
        this.f29462l = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModelBuilder
    /* renamed from: M0 */
    public DescModelBuilder mo15798M0(@StringRes int i2) {
        m4524l2();
        this.f29461k = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModelBuilder
    /* renamed from: a */
    public DescModelBuilder mo15799a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModelBuilder
    /* renamed from: d */
    public DescModelBuilder mo15800d(@Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.f6932i = spanSizeOverrideCallback;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_desc;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescModel_) || !super.equals(obj)) {
            return false;
        }
        DescModel_ descModel_ = (DescModel_) obj;
        Objects.requireNonNull(descModel_);
        if (this.f29461k != descModel_.f29461k) {
            return false;
        }
        return (this.f29462l == null) == (descModel_.f29462l == null);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29461k) * 31) + (this.f29462l != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.clear_history)).setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DescModel_{descResourceId=");
        m24u.append(this.f29461k);
        m24u.append(", listener=");
        m24u.append(this.f29462l);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.DescModel
    /* renamed from: u2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        ((TextView) view.findViewById(C2507R.id.clear_history)).setOnClickListener(null);
    }
}
