package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionReleaseEditableModel_ extends CollectionReleaseEditableModel implements GeneratedModel<View>, CollectionReleaseEditableModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: K1 */
    public CollectionReleaseEditableModelBuilder mo15850K1(CollectionReleaseEditableModel.Listener listener) {
        m4524l2();
        this.f29522t = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: b */
    public CollectionReleaseEditableModelBuilder mo15851b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: c */
    public CollectionReleaseEditableModelBuilder mo15852c(@Nullable String str) {
        m4524l2();
        this.f29518p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_editable;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: e */
    public CollectionReleaseEditableModelBuilder mo15853e(@Nullable String str) {
        m4524l2();
        this.f29513k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionReleaseEditableModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionReleaseEditableModel_ collectionReleaseEditableModel_ = (CollectionReleaseEditableModel_) obj;
        Objects.requireNonNull(collectionReleaseEditableModel_);
        String str = this.f29513k;
        if (str == null ? collectionReleaseEditableModel_.f29513k != null : !str.equals(collectionReleaseEditableModel_.f29513k)) {
            return false;
        }
        Integer num = this.f29514l;
        if (num == null ? collectionReleaseEditableModel_.f29514l != null : !num.equals(collectionReleaseEditableModel_.f29514l)) {
            return false;
        }
        Integer num2 = this.f29515m;
        if (num2 == null ? collectionReleaseEditableModel_.f29515m != null : !num2.equals(collectionReleaseEditableModel_.f29515m)) {
            return false;
        }
        Double d = this.f29516n;
        if (d == null ? collectionReleaseEditableModel_.f29516n != null : !d.equals(collectionReleaseEditableModel_.f29516n)) {
            return false;
        }
        String str2 = this.f29517o;
        if (str2 == null ? collectionReleaseEditableModel_.f29517o != null : !str2.equals(collectionReleaseEditableModel_.f29517o)) {
            return false;
        }
        String str3 = this.f29518p;
        if (str3 == null ? collectionReleaseEditableModel_.f29518p != null : !str3.equals(collectionReleaseEditableModel_.f29518p)) {
            return false;
        }
        if (this.f29519q == collectionReleaseEditableModel_.f29519q && this.f29520r == collectionReleaseEditableModel_.f29520r && this.f29521s == collectionReleaseEditableModel_.f29521s) {
            return (this.f29522t == null) == (collectionReleaseEditableModel_.f29522t == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: f */
    public CollectionReleaseEditableModelBuilder mo15854f(boolean z) {
        m4524l2();
        this.f29519q = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: g */
    public CollectionReleaseEditableModelBuilder mo15855g(@Nullable String str) {
        m4524l2();
        this.f29517o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: h */
    public CollectionReleaseEditableModelBuilder mo15856h(@Nullable Double d) {
        m4524l2();
        this.f29516n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29513k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29514l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29515m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29516n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29517o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29518p;
        return ((((((((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f29519q ? 1 : 0)) * 31) + this.f29520r) * 31) + (this.f29521s ? 1 : 0)) * 31) + (this.f29522t != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: i */
    public CollectionReleaseEditableModelBuilder mo15857i(boolean z) {
        m4524l2();
        this.f29521s = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: m */
    public CollectionReleaseEditableModelBuilder mo15858m(@Nullable Integer num) {
        m4524l2();
        this.f29515m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: n */
    public CollectionReleaseEditableModelBuilder mo15859n(@Nullable Integer num) {
        m4524l2();
        this.f29514l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModelBuilder
    /* renamed from: o */
    public CollectionReleaseEditableModelBuilder mo15860o(int i2) {
        m4524l2();
        this.f29520r = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionReleaseEditableModel_{titleRussian=");
        m24u.append(this.f29513k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29514l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29515m);
        m24u.append(", grade=");
        m24u.append(this.f29516n);
        m24u.append(", description=");
        m24u.append(this.f29517o);
        m24u.append(", image=");
        m24u.append(this.f29518p);
        m24u.append(", favorite=");
        m24u.append(this.f29519q);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29520r);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29521s);
        m24u.append(", listener=");
        m24u.append(this.f29522t);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}
