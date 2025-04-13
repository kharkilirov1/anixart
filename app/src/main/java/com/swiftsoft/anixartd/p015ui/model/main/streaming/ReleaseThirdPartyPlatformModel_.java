package com.swiftsoft.anixartd.p015ui.model.main.streaming;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseThirdPartyPlatformModel_ extends ReleaseThirdPartyPlatformModel implements GeneratedModel<View>, ReleaseThirdPartyPlatformModelBuilder {
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModelBuilder
    /* renamed from: a */
    public ReleaseThirdPartyPlatformModelBuilder mo16284a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModelBuilder
    /* renamed from: d */
    public ReleaseThirdPartyPlatformModelBuilder mo16285d(@Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.f6932i = spanSizeOverrideCallback;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_third_party_stream_platform;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseThirdPartyPlatformModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseThirdPartyPlatformModel_ releaseThirdPartyPlatformModel_ = (ReleaseThirdPartyPlatformModel_) obj;
        Objects.requireNonNull(releaseThirdPartyPlatformModel_);
        return (this.f30116k == null) == (releaseThirdPartyPlatformModel_.f30116k == null);
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
        return (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f30116k != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseThirdPartyPlatformModel_{listener=");
        m24u.append(this.f30116k);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel
    /* renamed from: u2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModelBuilder
    /* renamed from: y0 */
    public ReleaseThirdPartyPlatformModelBuilder mo16286y0(ReleaseThirdPartyPlatformModel.Listener listener) {
        m4524l2();
        this.f30116k = listener;
        return this;
    }
}
