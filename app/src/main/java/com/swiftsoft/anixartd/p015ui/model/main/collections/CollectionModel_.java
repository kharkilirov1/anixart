package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionModel_ extends CollectionModel implements GeneratedModel<View>, CollectionModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: G */
    public CollectionModelBuilder mo15840G(int i2) {
        m4524l2();
        this.f29508o = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: H */
    public CollectionModelBuilder mo15841H(long j2) {
        m4524l2();
        this.f29507n = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: X */
    public CollectionModelBuilder mo15842X(boolean z) {
        m4524l2();
        this.f29509p = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: b */
    public CollectionModelBuilder mo15843b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: c */
    public CollectionModelBuilder mo15844c(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29506m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_collection;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionModel_ collectionModel_ = (CollectionModel_) obj;
        Objects.requireNonNull(collectionModel_);
        String str = this.f29504k;
        if (str == null ? collectionModel_.f29504k != null : !str.equals(collectionModel_.f29504k)) {
            return false;
        }
        String str2 = this.f29505l;
        if (str2 == null ? collectionModel_.f29505l != null : !str2.equals(collectionModel_.f29505l)) {
            return false;
        }
        String str3 = this.f29506m;
        if (str3 == null ? collectionModel_.f29506m != null : !str3.equals(collectionModel_.f29506m)) {
            return false;
        }
        if (this.f29507n == collectionModel_.f29507n && this.f29508o == collectionModel_.f29508o && this.f29509p == collectionModel_.f29509p && this.f29510q == collectionModel_.f29510q) {
            return (this.f29511r == null) == (collectionModel_.f29511r == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: f */
    public CollectionModelBuilder mo15845f(boolean z) {
        m4524l2();
        this.f29510q = z;
        return this;
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
        String str = this.f29504k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29505l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29506m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.f29507n;
        return ((((((((hashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29508o) * 31) + (this.f29509p ? 1 : 0)) * 31) + (this.f29510q ? 1 : 0)) * 31) + (this.f29511r != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: j */
    public CollectionModelBuilder mo15846j(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29504k = str;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModelBuilder
    /* renamed from: s1 */
    public CollectionModelBuilder mo15847s1(CollectionModel.Listener listener) {
        m4524l2();
        this.f29511r = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionModel_{title=");
        m24u.append(this.f29504k);
        m24u.append(", description=");
        m24u.append(this.f29505l);
        m24u.append(", image=");
        m24u.append(this.f29506m);
        m24u.append(", commentCount=");
        m24u.append(this.f29507n);
        m24u.append(", favoriteCount=");
        m24u.append(this.f29508o);
        m24u.append(", privateCollection=");
        m24u.append(this.f29509p);
        m24u.append(", favorite=");
        m24u.append(this.f29510q);
        m24u.append(", listener=");
        m24u.append(this.f29511r);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
