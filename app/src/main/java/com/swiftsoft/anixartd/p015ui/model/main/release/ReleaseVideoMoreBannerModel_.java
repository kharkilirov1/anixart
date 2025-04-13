package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseVideoMoreBannerModel_ extends ReleaseVideoMoreBannerModel implements GeneratedModel<View>, ReleaseVideoMoreBannerModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModelBuilder
    /* renamed from: Q0 */
    public ReleaseVideoMoreBannerModelBuilder mo16205Q0(ReleaseVideoMoreBannerModel.Listener listener) {
        m4524l2();
        this.f30023l = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModelBuilder
    /* renamed from: a */
    public ReleaseVideoMoreBannerModelBuilder mo16206a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_video_more_banner;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseVideoMoreBannerModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseVideoMoreBannerModel_ releaseVideoMoreBannerModel_ = (ReleaseVideoMoreBannerModel_) obj;
        Objects.requireNonNull(releaseVideoMoreBannerModel_);
        if (this.f30022k != releaseVideoMoreBannerModel_.f30022k) {
            return false;
        }
        return (this.f30023l == null) == (releaseVideoMoreBannerModel_.f30023l == null);
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
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        long j2 = this.f30022k;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f30023l != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseVideoMoreBannerModel_{releaseId=");
        m24u.append(this.f30022k);
        m24u.append(", listener=");
        m24u.append(this.f30023l);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel
    /* renamed from: u2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModelBuilder
    /* renamed from: y */
    public ReleaseVideoMoreBannerModelBuilder mo16207y(long j2) {
        m4524l2();
        this.f30022k = j2;
        return this;
    }
}
