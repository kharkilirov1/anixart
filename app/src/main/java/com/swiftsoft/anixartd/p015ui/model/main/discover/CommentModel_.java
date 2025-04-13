package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CommentModel_ extends CommentModel implements GeneratedModel<View>, CommentModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: B */
    public CommentModelBuilder mo15910B(long j2) {
        m4524l2();
        this.f29603k = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: J0 */
    public CommentModelBuilder mo15911J0(CommentModel.Listener listener) {
        m4524l2();
        this.f29615w = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: O */
    public CommentModelBuilder mo15912O(@Nullable String str) {
        m4524l2();
        this.f29605m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: b */
    public CommentModelBuilder mo15913b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_discover_comment;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommentModel_) || !super.equals(obj)) {
            return false;
        }
        CommentModel_ commentModel_ = (CommentModel_) obj;
        Objects.requireNonNull(commentModel_);
        if (this.f29603k != commentModel_.f29603k || this.f29604l != commentModel_.f29604l) {
            return false;
        }
        String str = this.f29605m;
        if (str == null ? commentModel_.f29605m != null : !str.equals(commentModel_.f29605m)) {
            return false;
        }
        String str2 = this.f29606n;
        if (str2 == null ? commentModel_.f29606n != null : !str2.equals(commentModel_.f29606n)) {
            return false;
        }
        if (this.f29607o != commentModel_.f29607o || this.f29608p != commentModel_.f29608p || this.f29609q != commentModel_.f29609q || this.f29610r != commentModel_.f29610r) {
            return false;
        }
        String str3 = this.f29611s;
        if (str3 == null ? commentModel_.f29611s != null : !str3.equals(commentModel_.f29611s)) {
            return false;
        }
        String str4 = this.f29612t;
        if (str4 == null ? commentModel_.f29612t != null : !str4.equals(commentModel_.f29612t)) {
            return false;
        }
        if (this.f29613u == commentModel_.f29613u && this.f29614v == commentModel_.f29614v) {
            return (this.f29615w == null) == (commentModel_.f29615w == null);
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
        long j2 = this.f29603k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29604l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f29605m;
        int hashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29606n;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29607o ? 1 : 0)) * 31) + this.f29608p) * 31;
        long j4 = this.f29609q;
        int i4 = (((hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f29610r ? 1 : 0)) * 31;
        String str3 = this.f29611s;
        int hashCode4 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29612t;
        return ((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29613u ? 1 : 0)) * 31) + (this.f29614v ? 1 : 0)) * 31) + (this.f29615w != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: k */
    public CommentModelBuilder mo15914k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29611s = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: l */
    public CommentModelBuilder mo15915l(@Nullable String str) {
        m4524l2();
        this.f29612t = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: p */
    public CommentModelBuilder mo15916p(boolean z) {
        m4524l2();
        this.f29614v = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: r */
    public CommentModelBuilder mo15917r(boolean z) {
        m4524l2();
        this.f29613u = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: t */
    public CommentModelBuilder mo15918t(long j2) {
        m4524l2();
        this.f29609q = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CommentModel_{profileId=");
        m24u.append(this.f29603k);
        m24u.append(", releaseId=");
        m24u.append(this.f29604l);
        m24u.append(", releaseTitleRu=");
        m24u.append(this.f29605m);
        m24u.append(", message=");
        m24u.append(this.f29606n);
        m24u.append(", spoiler=");
        m24u.append(this.f29607o);
        m24u.append(", votes=");
        m24u.append(this.f29608p);
        m24u.append(", date=");
        m24u.append(this.f29609q);
        m24u.append(", edited=");
        m24u.append(this.f29610r);
        m24u.append(", nickname=");
        m24u.append(this.f29611s);
        m24u.append(", avatar=");
        m24u.append(this.f29612t);
        m24u.append(", sponsor=");
        m24u.append(this.f29613u);
        m24u.append(", verified=");
        m24u.append(this.f29614v);
        m24u.append(", listener=");
        m24u.append(this.f29615w);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: u */
    public CommentModelBuilder mo15919u(boolean z) {
        m4524l2();
        this.f29607o = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: v */
    public CommentModelBuilder mo15920v(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29606n = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: w */
    public CommentModelBuilder mo15921w(boolean z) {
        m4524l2();
        this.f29610r = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: x */
    public CommentModelBuilder mo15922x(int i2) {
        m4524l2();
        this.f29608p = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModelBuilder
    /* renamed from: y */
    public CommentModelBuilder mo15923y(long j2) {
        m4524l2();
        this.f29604l = j2;
        return this;
    }
}
