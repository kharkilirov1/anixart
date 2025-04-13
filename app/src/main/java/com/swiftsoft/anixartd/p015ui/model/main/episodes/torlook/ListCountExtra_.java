package com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ListCountExtra_ extends ListCountExtra implements GeneratedModel<View>, ListCountExtraBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.ListCountExtraBuilder
    /* renamed from: B1 */
    public ListCountExtraBuilder mo15987B1(@NotNull String str) {
        m4524l2();
        this.f29726l = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.ListCountExtraBuilder
    /* renamed from: N */
    public ListCountExtraBuilder mo15988N(long j2) {
        m4524l2();
        this.f29725k = j2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.ListCountExtraBuilder
    /* renamed from: a */
    public ListCountExtraBuilder mo15989a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_list_count_torlook;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCountExtra_) || !super.equals(obj)) {
            return false;
        }
        ListCountExtra_ listCountExtra_ = (ListCountExtra_) obj;
        Objects.requireNonNull(listCountExtra_);
        if (this.f29725k != listCountExtra_.f29725k) {
            return false;
        }
        String str = this.f29726l;
        return str == null ? listCountExtra_.f29726l == null : str.equals(listCountExtra_.f29726l);
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
        long j2 = this.f29725k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29726l;
        return i2 + (str != null ? str.hashCode() : 0);
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
        StringBuilder m24u = C0000a.m24u("ListCountExtra_{totalCount=");
        m24u.append(this.f29725k);
        m24u.append(", extra=");
        m24u.append(this.f29726l);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
