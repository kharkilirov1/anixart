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
public class EpisodeModel_ extends EpisodeModel implements GeneratedModel<View>, EpisodeModelBuilder {
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
        return C2507R.layout.item_episode;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EpisodeModel_) || !super.equals(obj)) {
            return false;
        }
        EpisodeModel_ episodeModel_ = (EpisodeModel_) obj;
        Objects.requireNonNull(episodeModel_);
        String str = this.f29685k;
        if (str == null ? episodeModel_.f29685k != null : !str.equals(episodeModel_.f29685k)) {
            return false;
        }
        if (this.f29686l != episodeModel_.f29686l) {
            return false;
        }
        String str2 = this.f29687m;
        if (str2 == null ? episodeModel_.f29687m != null : !str2.equals(episodeModel_.f29687m)) {
            return false;
        }
        if (this.f29688n == episodeModel_.f29688n && this.f29689o == episodeModel_.f29689o && this.f29690p == episodeModel_.f29690p && this.f29691q == episodeModel_.f29691q) {
            return (this.f29692r == null) == (episodeModel_.f29692r == null);
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
        String str = this.f29685k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f29686l;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f29687m;
        return ((((((((((i2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29688n ? 1 : 0)) * 31) + (this.f29689o ? 1 : 0)) * 31) + (this.f29690p ? 1 : 0)) * 31) + this.f29691q) * 31) + (this.f29692r != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("EpisodeModel_{name=");
        m24u.append(this.f29685k);
        m24u.append(", playbackPosition=");
        m24u.append(this.f29686l);
        m24u.append(", url=");
        m24u.append(this.f29687m);
        m24u.append(", filler=");
        m24u.append(this.f29688n);
        m24u.append(", opened=");
        m24u.append(this.f29689o);
        m24u.append(", downloadAvailable=");
        m24u.append(this.f29690p);
        m24u.append(", position=");
        m24u.append(this.f29691q);
        m24u.append(", listener=");
        m24u.append(this.f29692r);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    /* renamed from: x2 */
    public EpisodeModelBuilder m15969x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29687m = str;
        return this;
    }
}
