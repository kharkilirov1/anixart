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
public class SourceModel_ extends SourceModel implements GeneratedModel<View>, SourceModelBuilder {
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
        return C2507R.layout.item_source;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceModel_) || !super.equals(obj)) {
            return false;
        }
        SourceModel_ sourceModel_ = (SourceModel_) obj;
        Objects.requireNonNull(sourceModel_);
        if (this.f29705k != sourceModel_.f29705k) {
            return false;
        }
        String str = this.f29706l;
        if (str == null ? sourceModel_.f29706l != null : !str.equals(sourceModel_.f29706l)) {
            return false;
        }
        if (this.f29707m != sourceModel_.f29707m) {
            return false;
        }
        Long l2 = this.f29708n;
        if (l2 == null ? sourceModel_.f29708n == null : l2.equals(sourceModel_.f29708n)) {
            return (this.f29709o == null) == (sourceModel_.f29709o == null);
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
        long j2 = this.f29705k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29706l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        long j3 = this.f29707m;
        int i3 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l2 = this.f29708n;
        return ((i3 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f29709o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SourceModel_{sourceId=");
        m24u.append(this.f29705k);
        m24u.append(", name=");
        m24u.append(this.f29706l);
        m24u.append(", episodesCount=");
        m24u.append(this.f29707m);
        m24u.append(", lastEpisodeSourceUpdateId=");
        m24u.append(this.f29708n);
        m24u.append(", listener=");
        m24u.append(this.f29709o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: w2 */
    public SourceModelBuilder m15980w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: x2 */
    public SourceModelBuilder m15981x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29706l = str;
        return this;
    }
}
