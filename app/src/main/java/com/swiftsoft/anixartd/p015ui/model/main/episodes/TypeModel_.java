package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class TypeModel_ extends TypeModel implements GeneratedModel<View>, TypeModelBuilder {
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
        return C2507R.layout.item_type;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TypeModel_) || !super.equals(obj)) {
            return false;
        }
        TypeModel_ typeModel_ = (TypeModel_) obj;
        Objects.requireNonNull(typeModel_);
        if (this.f29713k != typeModel_.f29713k) {
            return false;
        }
        String str = this.f29714l;
        if (str == null ? typeModel_.f29714l != null : !str.equals(typeModel_.f29714l)) {
            return false;
        }
        String str2 = this.f29715m;
        if (str2 == null ? typeModel_.f29715m != null : !str2.equals(typeModel_.f29715m)) {
            return false;
        }
        if (this.f29716n != typeModel_.f29716n || this.f29717o != typeModel_.f29717o) {
            return false;
        }
        Long l2 = this.f29718p;
        if (l2 == null ? typeModel_.f29718p == null : l2.equals(typeModel_.f29718p)) {
            return (this.f29719q == null) == (typeModel_.f29719q == null);
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
        long j2 = this.f29713k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29714l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29715m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j3 = this.f29716n;
        int i3 = (hashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29717o;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        Long l2 = this.f29718p;
        return ((i4 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f29719q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TypeModel_{typeId=");
        m24u.append(this.f29713k);
        m24u.append(", name=");
        m24u.append(this.f29714l);
        m24u.append(", workers=");
        m24u.append(this.f29715m);
        m24u.append(", episodesCount=");
        m24u.append(this.f29716n);
        m24u.append(", viewCount=");
        m24u.append(this.f29717o);
        m24u.append(", lastEpisodeTypeUpdateId=");
        m24u.append(this.f29718p);
        m24u.append(", listener=");
        m24u.append(this.f29719q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: w2 */
    public TypeModelBuilder m15985w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: x2 */
    public TypeModelBuilder m15986x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29714l = str;
        return this;
    }
}
