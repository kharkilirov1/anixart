package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionHeaderModel_ extends CollectionHeaderModel implements GeneratedModel<View>, CollectionHeaderModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: G */
    public CollectionHeaderModelBuilder mo15825G(int i2) {
        m4524l2();
        this.f29495q = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: H */
    public CollectionHeaderModelBuilder mo15826H(long j2) {
        m4524l2();
        this.f29494p = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: H1 */
    public CollectionHeaderModelBuilder mo15827H1(boolean z) {
        m4524l2();
        this.f29499u = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: U */
    public CollectionHeaderModelBuilder mo15828U(boolean z) {
        m4524l2();
        this.f29497s = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: X0 */
    public CollectionHeaderModelBuilder mo15829X0(CollectionHeaderModel.Listener listener) {
        m4524l2();
        this.f29500v = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: a */
    public CollectionHeaderModelBuilder mo15830a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: c */
    public CollectionHeaderModelBuilder mo15831c(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29491m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_collection_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionHeaderModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionHeaderModel_ collectionHeaderModel_ = (CollectionHeaderModel_) obj;
        Objects.requireNonNull(collectionHeaderModel_);
        String str = this.f29489k;
        if (str == null ? collectionHeaderModel_.f29489k != null : !str.equals(collectionHeaderModel_.f29489k)) {
            return false;
        }
        String str2 = this.f29490l;
        if (str2 == null ? collectionHeaderModel_.f29490l != null : !str2.equals(collectionHeaderModel_.f29490l)) {
            return false;
        }
        String str3 = this.f29491m;
        if (str3 == null ? collectionHeaderModel_.f29491m != null : !str3.equals(collectionHeaderModel_.f29491m)) {
            return false;
        }
        if (this.f29492n != collectionHeaderModel_.f29492n || this.f29493o != collectionHeaderModel_.f29493o || this.f29494p != collectionHeaderModel_.f29494p || this.f29495q != collectionHeaderModel_.f29495q || this.f29496r != collectionHeaderModel_.f29496r || this.f29497s != collectionHeaderModel_.f29497s) {
            return false;
        }
        String str4 = this.f29498t;
        if (str4 == null ? collectionHeaderModel_.f29498t != null : !str4.equals(collectionHeaderModel_.f29498t)) {
            return false;
        }
        if (this.f29499u != collectionHeaderModel_.f29499u) {
            return false;
        }
        return (this.f29500v == null) == (collectionHeaderModel_.f29500v == null);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: g */
    public CollectionHeaderModelBuilder mo15832g(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29490l = str;
        return this;
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
        String str = this.f29489k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29490l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29491m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.f29492n;
        int i2 = (hashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29493o;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29494p;
        int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f29495q) * 31) + (this.f29496r ? 1 : 0)) * 31) + (this.f29497s ? 1 : 0)) * 31;
        String str4 = this.f29498t;
        return ((((i4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29499u ? 1 : 0)) * 31) + (this.f29500v != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: j */
    public CollectionHeaderModelBuilder mo15833j(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29489k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: l */
    public CollectionHeaderModelBuilder mo15834l(@NotNull String str) {
        m4524l2();
        this.f29498t = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: o1 */
    public CollectionHeaderModelBuilder mo15835o1(long j2) {
        m4524l2();
        this.f29493o = j2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: s0 */
    public CollectionHeaderModelBuilder mo15836s0(boolean z) {
        m4524l2();
        this.f29496r = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionHeaderModel_{title=");
        m24u.append(this.f29489k);
        m24u.append(", description=");
        m24u.append(this.f29490l);
        m24u.append(", image=");
        m24u.append(this.f29491m);
        m24u.append(", creationDate=");
        m24u.append(this.f29492n);
        m24u.append(", lastUpdateDate=");
        m24u.append(this.f29493o);
        m24u.append(", commentCount=");
        m24u.append(this.f29494p);
        m24u.append(", favoriteCount=");
        m24u.append(this.f29495q);
        m24u.append(", mFavorite=");
        m24u.append(this.f29496r);
        m24u.append(", mPrivate=");
        m24u.append(this.f29497s);
        m24u.append(", avatar=");
        m24u.append(this.f29498t);
        m24u.append(", mMyCollection=");
        m24u.append(this.f29499u);
        m24u.append(", listener=");
        m24u.append(this.f29500v);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModelBuilder
    /* renamed from: v0 */
    public CollectionHeaderModelBuilder mo15837v0(long j2) {
        m4524l2();
        this.f29492n = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel
    /* renamed from: y2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}
