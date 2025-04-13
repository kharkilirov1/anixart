package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CommentModel_ extends CommentModel implements GeneratedModel<View>, CommentModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: B */
    public CommentModelBuilder mo15868B(long j2) {
        m4524l2();
        this.f29549k = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: E */
    public CommentModelBuilder mo15869E(boolean z) {
        m4524l2();
        this.f29557s = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: S */
    public CommentModelBuilder mo15870S(int i2) {
        m4524l2();
        this.f29553o = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: Z0 */
    public CommentModelBuilder mo15871Z0(long j2) {
        m4524l2();
        this.f29555q = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: b */
    public CommentModelBuilder mo15872b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: b1 */
    public CommentModelBuilder mo15873b1(CommentModel.Listener listener) {
        m4524l2();
        this.f29563y = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_comment;
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
        if (this.f29549k != commentModel_.f29549k) {
            return false;
        }
        String str = this.f29550l;
        if (str == null ? commentModel_.f29550l != null : !str.equals(commentModel_.f29550l)) {
            return false;
        }
        if (this.f29551m != commentModel_.f29551m || this.f29552n != commentModel_.f29552n || this.f29553o != commentModel_.f29553o || this.f29554p != commentModel_.f29554p || this.f29555q != commentModel_.f29555q || this.f29556r != commentModel_.f29556r || this.f29557s != commentModel_.f29557s) {
            return false;
        }
        String str2 = this.f29558t;
        if (str2 == null ? commentModel_.f29558t != null : !str2.equals(commentModel_.f29558t)) {
            return false;
        }
        String str3 = this.f29559u;
        if (str3 == null ? commentModel_.f29559u != null : !str3.equals(commentModel_.f29559u)) {
            return false;
        }
        if (this.f29560v == commentModel_.f29560v && this.f29561w == commentModel_.f29561w && this.f29562x == commentModel_.f29562x) {
            return (this.f29563y == null) == (commentModel_.f29563y == null);
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
        long j2 = this.f29549k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29550l;
        int hashCode2 = (((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f29551m ? 1 : 0)) * 31) + this.f29552n) * 31) + this.f29553o) * 31;
        long j3 = this.f29554p;
        int i3 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29555q;
        int i4 = (((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f29556r ? 1 : 0)) * 31) + (this.f29557s ? 1 : 0)) * 31;
        String str2 = this.f29558t;
        int hashCode3 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29559u;
        return ((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f29560v ? 1 : 0)) * 31) + (this.f29561w ? 1 : 0)) * 31) + (this.f29562x ? 1 : 0)) * 31) + (this.f29563y != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: k */
    public CommentModelBuilder mo15874k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29558t = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: l */
    public CommentModelBuilder mo15875l(@Nullable String str) {
        m4524l2();
        this.f29559u = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: p */
    public CommentModelBuilder mo15876p(boolean z) {
        m4524l2();
        this.f29561w = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: r */
    public CommentModelBuilder mo15877r(boolean z) {
        m4524l2();
        this.f29560v = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: t */
    public CommentModelBuilder mo15878t(long j2) {
        m4524l2();
        this.f29554p = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CommentModel_{profileId=");
        m24u.append(this.f29549k);
        m24u.append(", message=");
        m24u.append(this.f29550l);
        m24u.append(", spoiler=");
        m24u.append(this.f29551m);
        m24u.append(", votes=");
        m24u.append(this.f29552n);
        m24u.append(", vote=");
        m24u.append(this.f29553o);
        m24u.append(", date=");
        m24u.append(this.f29554p);
        m24u.append(", replyCount=");
        m24u.append(this.f29555q);
        m24u.append(", edited=");
        m24u.append(this.f29556r);
        m24u.append(", deleted=");
        m24u.append(this.f29557s);
        m24u.append(", nickname=");
        m24u.append(this.f29558t);
        m24u.append(", avatar=");
        m24u.append(this.f29559u);
        m24u.append(", sponsor=");
        m24u.append(this.f29560v);
        m24u.append(", verified=");
        m24u.append(this.f29561w);
        m24u.append(", reply=");
        m24u.append(this.f29562x);
        m24u.append(", listener=");
        m24u.append(this.f29563y);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: u */
    public CommentModelBuilder mo15879u(boolean z) {
        m4524l2();
        this.f29551m = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: v */
    public CommentModelBuilder mo15880v(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29550l = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: w */
    public CommentModelBuilder mo15881w(boolean z) {
        m4524l2();
        this.f29556r = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentModelBuilder
    /* renamed from: x */
    public CommentModelBuilder mo15882x(int i2) {
        m4524l2();
        this.f29552n = i2;
        return this;
    }
}
