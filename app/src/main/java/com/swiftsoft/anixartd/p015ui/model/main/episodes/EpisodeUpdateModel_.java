package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class EpisodeUpdateModel_ extends EpisodeUpdateModel implements GeneratedModel<View>, EpisodeUpdateModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModelBuilder
    /* renamed from: D */
    public EpisodeUpdateModelBuilder mo15972D(@Nullable Number[] numberArr) {
        m4521i2(numberArr);
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

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_episodes_updates;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EpisodeUpdateModel_) || !super.equals(obj)) {
            return false;
        }
        EpisodeUpdateModel_ episodeUpdateModel_ = (EpisodeUpdateModel_) obj;
        Objects.requireNonNull(episodeUpdateModel_);
        String str = this.f29698k;
        if (str == null ? episodeUpdateModel_.f29698k != null : !str.equals(episodeUpdateModel_.f29698k)) {
            return false;
        }
        String str2 = this.f29699l;
        if (str2 == null ? episodeUpdateModel_.f29699l != null : !str2.equals(episodeUpdateModel_.f29699l)) {
            return false;
        }
        String str3 = this.f29700m;
        if (str3 == null ? episodeUpdateModel_.f29700m == null : str3.equals(episodeUpdateModel_.f29700m)) {
            return this.f29701n == episodeUpdateModel_.f29701n;
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
        String str = this.f29698k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29699l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29700m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.f29701n;
        return hashCode4 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModelBuilder
    /* renamed from: t */
    public EpisodeUpdateModelBuilder mo15973t(long j2) {
        m4524l2();
        this.f29701n = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("EpisodeUpdateModel_{name=");
        m24u.append(this.f29698k);
        m24u.append(", type=");
        m24u.append(this.f29699l);
        m24u.append(", source=");
        m24u.append(this.f29700m);
        m24u.append(", date=");
        m24u.append(this.f29701n);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModelBuilder
    /* renamed from: v1 */
    public EpisodeUpdateModelBuilder mo15974v1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29700m = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModelBuilder
    /* renamed from: z */
    public EpisodeUpdateModelBuilder mo15975z(@org.jetbrains.annotations.Nullable String str) {
        m4524l2();
        this.f29698k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModelBuilder
    /* renamed from: z0 */
    public EpisodeUpdateModelBuilder mo15976z0(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29699l = str;
        return this;
    }
}
