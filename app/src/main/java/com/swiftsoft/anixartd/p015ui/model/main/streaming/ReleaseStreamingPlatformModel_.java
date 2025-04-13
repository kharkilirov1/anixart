package com.swiftsoft.anixartd.p015ui.model.main.streaming;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseStreamingPlatformModel_ extends ReleaseStreamingPlatformModel implements GeneratedModel<View>, ReleaseStreamingPlatformModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModelBuilder
    /* renamed from: A1 */
    public ReleaseStreamingPlatformModelBuilder mo16278A1(ReleaseStreamingPlatformModel.Listener listener) {
        m4524l2();
        this.f30115n = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModelBuilder
    /* renamed from: H0 */
    public ReleaseStreamingPlatformModelBuilder mo16279H0(@Nullable String str) {
        m4524l2();
        this.f30114m = str;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModelBuilder
    /* renamed from: b */
    public ReleaseStreamingPlatformModelBuilder mo16280b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_stream_platform;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseStreamingPlatformModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseStreamingPlatformModel_ releaseStreamingPlatformModel_ = (ReleaseStreamingPlatformModel_) obj;
        Objects.requireNonNull(releaseStreamingPlatformModel_);
        String str = this.f30112k;
        if (str == null ? releaseStreamingPlatformModel_.f30112k != null : !str.equals(releaseStreamingPlatformModel_.f30112k)) {
            return false;
        }
        String str2 = this.f30113l;
        if (str2 == null ? releaseStreamingPlatformModel_.f30113l != null : !str2.equals(releaseStreamingPlatformModel_.f30113l)) {
            return false;
        }
        String str3 = this.f30114m;
        if (str3 == null ? releaseStreamingPlatformModel_.f30114m == null : str3.equals(releaseStreamingPlatformModel_.f30114m)) {
            return (this.f30115n == null) == (releaseStreamingPlatformModel_.f30115n == null);
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
        String str = this.f30112k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30113l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30114m;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f30115n != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModelBuilder
    /* renamed from: j0 */
    public ReleaseStreamingPlatformModelBuilder mo16281j0(@Nullable String str) {
        m4524l2();
        this.f30113l = str;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseStreamingPlatformModel_{name=");
        m24u.append(this.f30112k);
        m24u.append(", icon=");
        m24u.append(this.f30113l);
        m24u.append(", url=");
        m24u.append(this.f30114m);
        m24u.append(", listener=");
        m24u.append(this.f30115n);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModelBuilder
    /* renamed from: z */
    public ReleaseStreamingPlatformModelBuilder mo16282z(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30112k = str;
        return this;
    }
}
