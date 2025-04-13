package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModel;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionCountReleaseModel_ extends CollectionCountReleaseModel implements GeneratedModel<View>, CollectionCountReleaseModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: S0 */
    public CollectionCountReleaseModelBuilder mo15812S0(CollectionCountReleaseModel.Listener listener) {
        m4524l2();
        this.f29488q = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: W1 */
    public CollectionCountReleaseModelBuilder mo15813W1(long j2) {
        m4524l2();
        this.f29483l = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: Y */
    public CollectionCountReleaseModelBuilder mo15814Y(long j2) {
        m4524l2();
        this.f29482k = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: a */
    public CollectionCountReleaseModelBuilder mo15815a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_collection_stats;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionCountReleaseModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionCountReleaseModel_ collectionCountReleaseModel_ = (CollectionCountReleaseModel_) obj;
        Objects.requireNonNull(collectionCountReleaseModel_);
        if (this.f29482k == collectionCountReleaseModel_.f29482k && this.f29483l == collectionCountReleaseModel_.f29483l && this.f29484m == collectionCountReleaseModel_.f29484m && this.f29485n == collectionCountReleaseModel_.f29485n && this.f29486o == collectionCountReleaseModel_.f29486o && this.f29487p == collectionCountReleaseModel_.f29487p) {
            return (this.f29488q == null) == (collectionCountReleaseModel_.f29488q == null);
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
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        long j2 = this.f29482k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29483l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29484m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f29485n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f29486o;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f29487p;
        return ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f29488q != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: i0 */
    public CollectionCountReleaseModelBuilder mo15816i0(long j2) {
        m4524l2();
        this.f29485n = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: m0 */
    public CollectionCountReleaseModelBuilder mo15817m0(long j2) {
        m4524l2();
        this.f29486o = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: q1 */
    public CollectionCountReleaseModelBuilder mo15818q1(long j2) {
        m4524l2();
        this.f29487p = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionCountReleaseModel_{releaseCount=");
        m24u.append(this.f29482k);
        m24u.append(", watchingCount=");
        m24u.append(this.f29483l);
        m24u.append(", planCount=");
        m24u.append(this.f29484m);
        m24u.append(", completedCount=");
        m24u.append(this.f29485n);
        m24u.append(", holdOnCount=");
        m24u.append(this.f29486o);
        m24u.append(", droppedCount=");
        m24u.append(this.f29487p);
        m24u.append(", listener=");
        m24u.append(this.f29488q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModelBuilder
    /* renamed from: z1 */
    public CollectionCountReleaseModelBuilder mo15819z1(long j2) {
        m4524l2();
        this.f29484m = j2;
        return this;
    }
}
