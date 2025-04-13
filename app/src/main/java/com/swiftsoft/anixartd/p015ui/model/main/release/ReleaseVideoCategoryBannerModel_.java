package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseVideoCategoryBannerModel_ extends ReleaseVideoCategoryBannerModel implements GeneratedModel<View>, ReleaseVideoCategoryBannerModelBuilder {
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
        return C2507R.layout.item_release_video_category_banner;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseVideoCategoryBannerModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseVideoCategoryBannerModel_ releaseVideoCategoryBannerModel_ = (ReleaseVideoCategoryBannerModel_) obj;
        Objects.requireNonNull(releaseVideoCategoryBannerModel_);
        if (this.f30014k != releaseVideoCategoryBannerModel_.f30014k) {
            return false;
        }
        String str = this.f30015l;
        if (str == null ? releaseVideoCategoryBannerModel_.f30015l != null : !str.equals(releaseVideoCategoryBannerModel_.f30015l)) {
            return false;
        }
        String str2 = this.f30016m;
        if (str2 == null ? releaseVideoCategoryBannerModel_.f30016m != null : !str2.equals(releaseVideoCategoryBannerModel_.f30016m)) {
            return false;
        }
        if (this.f30017n != releaseVideoCategoryBannerModel_.f30017n) {
            return false;
        }
        String str3 = this.f30018o;
        if (str3 == null ? releaseVideoCategoryBannerModel_.f30018o != null : !str3.equals(releaseVideoCategoryBannerModel_.f30018o)) {
            return false;
        }
        if (this.f30019p != releaseVideoCategoryBannerModel_.f30019p) {
            return false;
        }
        return (this.f30020q == null) == (releaseVideoCategoryBannerModel_.f30020q == null);
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
        long j2 = this.f30014k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f30015l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30016m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j3 = this.f30017n;
        int i3 = (hashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str3 = this.f30018o;
        return ((((i3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f30019p ? 1 : 0)) * 31) + (this.f30020q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoCategoryBannerModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseVideoCategoryBannerModel_{releaseId=");
        m24u.append(this.f30014k);
        m24u.append(", name=");
        m24u.append(this.f30015l);
        m24u.append(", image=");
        m24u.append(this.f30016m);
        m24u.append(", actionId=");
        m24u.append(this.f30017n);
        m24u.append(", value=");
        m24u.append(this.f30018o);
        m24u.append(", statusIsNew=");
        m24u.append(this.f30019p);
        m24u.append(", listener=");
        m24u.append(this.f30020q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoCategoryBannerModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: w2 */
    public ReleaseVideoCategoryBannerModel_ m16203w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}
