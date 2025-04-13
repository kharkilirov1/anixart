package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CommentProfileVoteModel_ extends CommentProfileVoteModel implements GeneratedModel<View>, CommentProfileVoteModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: Q */
    public CommentProfileVoteModelBuilder mo15885Q(boolean z) {
        m4524l2();
        this.f29574m = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: S */
    public CommentProfileVoteModelBuilder mo15886S(int i2) {
        m4524l2();
        this.f29577p = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: U0 */
    public CommentProfileVoteModelBuilder mo15887U0(CommentProfileVoteModel.Listener listener) {
        m4524l2();
        this.f29578q = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: b */
    public CommentProfileVoteModelBuilder mo15888b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_profile_vote;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommentProfileVoteModel_) || !super.equals(obj)) {
            return false;
        }
        CommentProfileVoteModel_ commentProfileVoteModel_ = (CommentProfileVoteModel_) obj;
        Objects.requireNonNull(commentProfileVoteModel_);
        String str = this.f29572k;
        if (str == null ? commentProfileVoteModel_.f29572k != null : !str.equals(commentProfileVoteModel_.f29572k)) {
            return false;
        }
        String str2 = this.f29573l;
        if (str2 == null ? commentProfileVoteModel_.f29573l != null : !str2.equals(commentProfileVoteModel_.f29573l)) {
            return false;
        }
        if (this.f29574m == commentProfileVoteModel_.f29574m && this.f29575n == commentProfileVoteModel_.f29575n && this.f29576o == commentProfileVoteModel_.f29576o && this.f29577p == commentProfileVoteModel_.f29577p) {
            return (this.f29578q == null) == (commentProfileVoteModel_.f29578q == null);
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
        String str = this.f29572k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29573l;
        return ((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29574m ? 1 : 0)) * 31) + (this.f29575n ? 1 : 0)) * 31) + (this.f29576o ? 1 : 0)) * 31) + this.f29577p) * 31) + (this.f29578q != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: k */
    public CommentProfileVoteModelBuilder mo15889k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29572k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: l */
    public CommentProfileVoteModelBuilder mo15890l(@Nullable String str) {
        m4524l2();
        this.f29573l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: p */
    public CommentProfileVoteModelBuilder mo15891p(boolean z) {
        m4524l2();
        this.f29576o = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModelBuilder
    /* renamed from: r */
    public CommentProfileVoteModelBuilder mo15892r(boolean z) {
        m4524l2();
        this.f29575n = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CommentProfileVoteModel_{nickname=");
        m24u.append(this.f29572k);
        m24u.append(", avatar=");
        m24u.append(this.f29573l);
        m24u.append(", online=");
        m24u.append(this.f29574m);
        m24u.append(", sponsor=");
        m24u.append(this.f29575n);
        m24u.append(", verified=");
        m24u.append(this.f29576o);
        m24u.append(", vote=");
        m24u.append(this.f29577p);
        m24u.append(", listener=");
        m24u.append(this.f29578q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.CommentProfileVoteModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
