package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionCompactModel_ extends CollectionCompactModel implements GeneratedModel<View>, CollectionCompactModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: G */
    public CollectionCompactModelBuilder mo15804G(int i2) {
        m4524l2();
        this.f29477o = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: H */
    public CollectionCompactModelBuilder mo15805H(long j2) {
        m4524l2();
        this.f29476n = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: X */
    public CollectionCompactModelBuilder mo15806X(boolean z) {
        m4524l2();
        this.f29478p = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: b */
    public CollectionCompactModelBuilder mo15807b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: c */
    public CollectionCompactModelBuilder mo15808c(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29475m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_collection_compact;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionCompactModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionCompactModel_ collectionCompactModel_ = (CollectionCompactModel_) obj;
        Objects.requireNonNull(collectionCompactModel_);
        String str = this.f29473k;
        if (str == null ? collectionCompactModel_.f29473k != null : !str.equals(collectionCompactModel_.f29473k)) {
            return false;
        }
        String str2 = this.f29474l;
        if (str2 == null ? collectionCompactModel_.f29474l != null : !str2.equals(collectionCompactModel_.f29474l)) {
            return false;
        }
        String str3 = this.f29475m;
        if (str3 == null ? collectionCompactModel_.f29475m != null : !str3.equals(collectionCompactModel_.f29475m)) {
            return false;
        }
        if (this.f29476n == collectionCompactModel_.f29476n && this.f29477o == collectionCompactModel_.f29477o && this.f29478p == collectionCompactModel_.f29478p && this.f29479q == collectionCompactModel_.f29479q) {
            return (this.f29480r == null) == (collectionCompactModel_.f29480r == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: f */
    public CollectionCompactModelBuilder mo15809f(boolean z) {
        m4524l2();
        this.f29479q = z;
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
        String str = this.f29473k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29474l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29475m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.f29476n;
        return ((((((((hashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29477o) * 31) + (this.f29478p ? 1 : 0)) * 31) + (this.f29479q ? 1 : 0)) * 31) + (this.f29480r != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: j */
    public CollectionCompactModelBuilder mo15810j(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29473k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModelBuilder
    /* renamed from: n0 */
    public CollectionCompactModelBuilder mo15811n0(CollectionCompactModel.Listener listener) {
        m4524l2();
        this.f29480r = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionCompactModel_{title=");
        m24u.append(this.f29473k);
        m24u.append(", description=");
        m24u.append(this.f29474l);
        m24u.append(", image=");
        m24u.append(this.f29475m);
        m24u.append(", commentCount=");
        m24u.append(this.f29476n);
        m24u.append(", favoriteCount=");
        m24u.append(this.f29477o);
        m24u.append(", privateCollection=");
        m24u.append(this.f29478p);
        m24u.append(", favorite=");
        m24u.append(this.f29479q);
        m24u.append(", listener=");
        m24u.append(this.f29480r);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
