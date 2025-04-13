package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class VideoBannerLargeModel_ extends VideoBannerLargeModel implements GeneratedModel<View>, VideoBannerLargeModelBuilder {
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

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_video_banner_large;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoBannerLargeModel_) || !super.equals(obj)) {
            return false;
        }
        VideoBannerLargeModel_ videoBannerLargeModel_ = (VideoBannerLargeModel_) obj;
        Objects.requireNonNull(videoBannerLargeModel_);
        if (this.f30040k != videoBannerLargeModel_.f30040k) {
            return false;
        }
        String str = this.f30041l;
        if (str == null ? videoBannerLargeModel_.f30041l != null : !str.equals(videoBannerLargeModel_.f30041l)) {
            return false;
        }
        String str2 = this.f30042m;
        if (str2 == null ? videoBannerLargeModel_.f30042m != null : !str2.equals(videoBannerLargeModel_.f30042m)) {
            return false;
        }
        String str3 = this.f30043n;
        if (str3 == null ? videoBannerLargeModel_.f30043n == null : str3.equals(videoBannerLargeModel_.f30043n)) {
            return (this.f30044o == null) == (videoBannerLargeModel_.f30044o == null);
        }
        return false;
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
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30040k) * 31;
        String str = this.f30041l;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30042m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30043n;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f30044o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VideoBannerLargeModel_{blockIndex=");
        m24u.append(this.f30040k);
        m24u.append(", name=");
        m24u.append(this.f30041l);
        m24u.append(", image=");
        m24u.append(this.f30042m);
        m24u.append(", hostingIcon=");
        m24u.append(this.f30043n);
        m24u.append(", listener=");
        m24u.append(this.f30044o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public VideoBannerLargeModel_ m16217w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}
