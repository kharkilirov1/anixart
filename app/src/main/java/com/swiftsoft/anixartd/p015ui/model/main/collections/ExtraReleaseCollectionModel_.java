package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ExtraReleaseCollectionModel_ extends ExtraReleaseCollectionModel implements GeneratedModel<View>, ExtraReleaseCollectionModelBuilder {
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
        return C2507R.layout.item_extra_release_collections;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraReleaseCollectionModel_) || !super.equals(obj)) {
            return false;
        }
        ExtraReleaseCollectionModel_ extraReleaseCollectionModel_ = (ExtraReleaseCollectionModel_) obj;
        Objects.requireNonNull(extraReleaseCollectionModel_);
        return (this.f29530k == null) == (extraReleaseCollectionModel_.f29530k == null) && this.f29531l == extraReleaseCollectionModel_.f29531l && this.f29532m == extraReleaseCollectionModel_.f29532m && this.f29533n == extraReleaseCollectionModel_.f29533n && this.f29534o == extraReleaseCollectionModel_.f29534o;
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
        int hashCode = ((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f29530k != null ? 1 : 0)) * 31) + this.f29531l) * 31) + this.f29532m) * 31;
        long j2 = this.f29533n;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29534o;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ExtraReleaseCollectionModel_{listener=");
        m24u.append(this.f29530k);
        m24u.append(", extraResourceId=");
        m24u.append(this.f29531l);
        m24u.append(", zeroResourceId=");
        m24u.append(this.f29532m);
        m24u.append(", extraCount=");
        m24u.append(this.f29533n);
        m24u.append(", selectedSort=");
        m24u.append(this.f29534o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
