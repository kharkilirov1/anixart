package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Plurals;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommentModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CommentModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29549k;

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29551m;

    /* renamed from: n */
    @EpoxyAttribute
    public int f29552n;

    /* renamed from: o */
    @EpoxyAttribute
    public int f29553o;

    /* renamed from: p */
    @EpoxyAttribute
    public long f29554p;

    /* renamed from: q */
    @EpoxyAttribute
    public long f29555q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29556r;

    /* renamed from: s */
    @EpoxyAttribute
    public boolean f29557s;

    /* renamed from: v */
    @EpoxyAttribute
    public boolean f29560v;

    /* renamed from: w */
    @EpoxyAttribute
    public boolean f29561w;

    /* renamed from: x */
    @EpoxyAttribute
    public boolean f29562x;

    /* renamed from: y */
    @EpoxyAttribute
    public Listener f29563y;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29550l = "";

    /* renamed from: t */
    @EpoxyAttribute
    @NotNull
    public String f29558t = "";

    /* renamed from: u */
    @EpoxyAttribute
    @Nullable
    public String f29559u = "";

    /* compiled from: CommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel$Companion;", "", "", "AVATAR_CHANGED", "I", "DATE_CHANGED", "DELETED_CHANGED", "EDITED_CHANGED", "MIN_NEGATIVE_VOTES", "NICKNAME_CHANGED", "REPLY_COUNT_CHANGED", "SPOILER_CHANGED", "SPONSOR_CHANGED", "TEXT_CHANGED", "VERIFIED_CHANGED", "VOTES_CHANGED", "VOTE_CHANGED", "VOTE_MINUS", "VOTE_NONE", "VOTE_PLUS", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/comments/CommentModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: b */
        void mo14426b(long j2);

        /* renamed from: c */
        void mo14427c(long j2);

        /* renamed from: e */
        void mo14428e(long j2);

        /* renamed from: f */
        void mo14429f(long j2);

        /* renamed from: h */
        void mo14430h(long j2, int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.message)).setText(this.f29550l);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29558t);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29560v);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29561w);
        TextView textView = (TextView) view2.findViewById(C2507R.id.date);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f29554p));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.edited);
        Intrinsics.m32178g(appCompatImageView3, "view.edited");
        ViewsKt.m16379l(appCompatImageView3, this.f29556r);
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.message);
        Intrinsics.m32178g(textView2, "view.message");
        ViewsKt.m16373f(textView2, this.f29557s, false, null, 6);
        TextView textView3 = (TextView) view2.findViewById(C2507R.id.deleted);
        Intrinsics.m32178g(textView3, "view.deleted");
        ViewsKt.m16379l(textView3, this.f29557s);
        int i2 = 1;
        if (!this.f29557s) {
            if (this.f29551m || this.f29552n <= -5) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                TextView textView4 = (TextView) C2052a.m12270e(view2, C2507R.attr.secondaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView4, "view.message", textView4, view2, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                ViewsKt.m16378k(linearLayout);
                TextView textView5 = (TextView) view2.findViewById(C2507R.id.tvSpoilerHint);
                int i3 = this.f29552n;
                textView5.setText((i3 <= -5 || !this.f29551m) ? (i3 > -5 || !this.f29551m) ? (i3 > -5 || this.f29551m) ? view2.getContext().getString(C2507R.string.comment_spoiler_warning) : view2.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_warning));
                ((LinearLayout) view2.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2752a(booleanRef, view2, i2));
            } else {
                TextView textView6 = (TextView) C2052a.m12270e(view2, C2507R.attr.primaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView6, "view.message", textView6, view2, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                ViewsKt.m16372e(linearLayout2);
            }
        }
        ((TextView) view2.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(DigitsKt.m16324e(this.f29552n), "-", "–", false, 4, null));
        TextView textView7 = (TextView) view2.findViewById(C2507R.id.votes);
        int i4 = this.f29552n;
        textView7.setTextColor(i4 == 0 ? ViewsKt.m16370c(view2, C2507R.attr.tertiaryTextColor) : i4 > 0 ? view2.getResources().getColor(C2507R.color.green) : view2.getResources().getColor(C2507R.color.red));
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.vote_minus_inactive);
        Intrinsics.m32178g(relativeLayout, "view.vote_minus_inactive");
        int i5 = this.f29553o;
        ViewsKt.m16379l(relativeLayout, i5 == 2 || i5 == 0);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.vote_minus_active);
        Intrinsics.m32178g(relativeLayout2, "view.vote_minus_active");
        ViewsKt.m16379l(relativeLayout2, this.f29553o == 1);
        RelativeLayout relativeLayout3 = (RelativeLayout) view2.findViewById(C2507R.id.vote_plus_inactive);
        Intrinsics.m32178g(relativeLayout3, "view.vote_plus_inactive");
        int i6 = this.f29553o;
        ViewsKt.m16379l(relativeLayout3, i6 == 1 || i6 == 0);
        RelativeLayout relativeLayout4 = (RelativeLayout) view2.findViewById(C2507R.id.vote_plus_active);
        Intrinsics.m32178g(relativeLayout4, "view.vote_plus_active");
        ViewsKt.m16379l(relativeLayout4, this.f29553o == 2);
        TextView textView8 = (TextView) view2.findViewById(C2507R.id.show_replies_text);
        Plurals plurals = Plurals.f30231a;
        Context context2 = view2.getContext();
        Intrinsics.m32178g(context2, "view.context");
        textView8.setText(plurals.m16343c(context2, this.f29555q, C2507R.plurals.show_replies, C2507R.string.replies_zero));
        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2507R.id.show_replies);
        Intrinsics.m32178g(linearLayout3, "view.show_replies");
        ViewsKt.m16379l(linearLayout3, this.f29555q > 0);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView4, "view.avatar");
        ViewsKt.m16368a(appCompatImageView4, this.f29559u);
        int m16322c = DigitsKt.m16322c(16, view2);
        int m16322c2 = DigitsKt.m16322c(8, view2);
        int m16322c3 = DigitsKt.m16322c(16, view2);
        int m16322c4 = DigitsKt.m16322c(8, view2);
        int m16322c5 = DigitsKt.m16322c(42, view2);
        int m16322c6 = DigitsKt.m16322c(42, view2);
        if (this.f29562x) {
            m16322c = DigitsKt.m16322c(48, view2);
            m16322c5 = DigitsKt.m16322c(36, view2);
            m16322c6 = DigitsKt.m16322c(36, view2);
        }
        view2.setPadding(m16322c, m16322c2, m16322c3, m16322c4);
        ViewGroup.LayoutParams layoutParams = ((AppCompatImageView) view2.findViewById(C2507R.id.avatar)).getLayoutParams();
        layoutParams.width = m16322c5;
        layoutParams.height = m16322c6;
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel.this.m15866v2().mo14426b(CommentModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView5, "view.avatar");
        ViewsKt.m16377j(appCompatImageView5, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel.this.m15866v2().mo14429f(CommentModel.this.f29549k);
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout5 = (RelativeLayout) view2.findViewById(C2507R.id.vote_minus);
        Intrinsics.m32178g(relativeLayout5, "view.vote_minus");
        ViewsKt.m16377j(relativeLayout5, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((RelativeLayout) view2.findViewById(C2507R.id.vote_minus)).performHapticFeedback(1);
                this.m15866v2().mo14430h(this.f6925b, 1);
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout6 = (RelativeLayout) view2.findViewById(C2507R.id.vote_plus);
        Intrinsics.m32178g(relativeLayout6, "view.vote_plus");
        ViewsKt.m16377j(relativeLayout6, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((RelativeLayout) view2.findViewById(C2507R.id.vote_plus)).performHapticFeedback(1);
                this.m15866v2().mo14430h(this.f6925b, 2);
                return Unit.f63088a;
            }
        });
        TextView textView9 = (TextView) view2.findViewById(C2507R.id.reply);
        Intrinsics.m32178g(textView9, "view.reply");
        ViewsKt.m16377j(textView9, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel.this.m15866v2().mo14427c(CommentModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(C2507R.id.show_replies);
        Intrinsics.m32178g(linearLayout4, "view.show_replies");
        ViewsKt.m16377j(linearLayout4, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.comments.CommentModel$bind$11
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel.this.m15866v2().mo14428e(CommentModel.this.f6925b);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof CommentModel) {
            CommentModel commentModel = (CommentModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29550l, commentModel.f29550l)) {
                m12276k.add(0);
            }
            if (this.f29551m != commentModel.f29551m) {
                m12276k.add(1);
            }
            if (this.f29552n != commentModel.f29552n) {
                m12276k.add(2);
            }
            if (this.f29554p != commentModel.f29554p) {
                m12276k.add(5);
            }
            if (this.f29555q != commentModel.f29555q) {
                m12276k.add(3);
            }
            if (this.f29553o != commentModel.f29553o) {
                m12276k.add(4);
            }
            if (this.f29556r != commentModel.f29556r) {
                m12276k.add(10);
            }
            if (this.f29557s != commentModel.f29557s) {
                m12276k.add(11);
            }
            if (!Intrinsics.m32174c(this.f29558t, commentModel.f29558t)) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f29559u, commentModel.f29559u)) {
                m12276k.add(7);
            }
            if (this.f29560v != commentModel.f29560v) {
                m12276k.add(8);
            }
            if (this.f29561w != commentModel.f29561w) {
                m12276k.add(9);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.message)).setText(this.f29550l);
        }
        if (list.contains(1) || list.contains(11)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.message);
            Intrinsics.m32178g(textView, "view.message");
            ViewsKt.m16373f(textView, this.f29557s, false, null, 6);
            TextView textView2 = (TextView) view.findViewById(C2507R.id.deleted);
            Intrinsics.m32178g(textView2, "view.deleted");
            ViewsKt.m16379l(textView2, this.f29557s);
            if (!this.f29557s) {
                if (this.f29551m || this.f29552n <= -5) {
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    TextView textView3 = (TextView) C2052a.m12270e(view, C2507R.attr.secondaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                    LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView3, "view.message", textView3, view, C2507R.id.spoilerHideShow);
                    Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                    linearLayout.setVisibility(0);
                    TextView textView4 = (TextView) view.findViewById(C2507R.id.tvSpoilerHint);
                    int i2 = this.f29552n;
                    textView4.setText((i2 <= -5 || !this.f29551m) ? (i2 > -5 || !this.f29551m) ? (i2 > -5 || this.f29551m) ? view.getContext().getString(C2507R.string.comment_spoiler_warning) : view.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_warning));
                    ((LinearLayout) view.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2752a(booleanRef, view, null == true ? 1 : 0));
                } else {
                    TextView textView5 = (TextView) C2052a.m12270e(view, C2507R.attr.primaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                    Intrinsics.m32178g(textView5, "view.message");
                    textView5.setVisibility(0);
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2507R.id.spoilerHideShow);
                    Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                    ViewsKt.m16372e(linearLayout2);
                }
            }
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(DigitsKt.m16324e(this.f29552n), "-", "–", false, 4, null));
            TextView textView6 = (TextView) view.findViewById(C2507R.id.votes);
            int i3 = this.f29552n;
            textView6.setTextColor(i3 == 0 ? ViewsKt.m16370c(view, C2507R.attr.tertiaryTextColor) : i3 > 0 ? view.getResources().getColor(C2507R.color.green) : view.getResources().getColor(C2507R.color.red));
        }
        if (list.contains(4)) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.vote_minus_inactive);
            Intrinsics.m32178g(relativeLayout, "view.vote_minus_inactive");
            int i4 = this.f29553o;
            ViewsKt.m16379l(relativeLayout, i4 == 2 || i4 == 0);
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.vote_minus_active);
            Intrinsics.m32178g(relativeLayout2, "view.vote_minus_active");
            ViewsKt.m16379l(relativeLayout2, this.f29553o == 1);
            RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(C2507R.id.vote_plus_inactive);
            Intrinsics.m32178g(relativeLayout3, "view.vote_plus_inactive");
            int i5 = this.f29553o;
            ViewsKt.m16379l(relativeLayout3, i5 == 1 || i5 == 0);
            RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(C2507R.id.vote_plus_active);
            Intrinsics.m32178g(relativeLayout4, "view.vote_plus_active");
            ViewsKt.m16379l(relativeLayout4, this.f29553o == 2);
        }
        if (list.contains(5)) {
            TextView textView7 = (TextView) view.findViewById(C2507R.id.date);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView7.setText(time.m16361g(context, this.f29554p));
        }
        if (list.contains(3)) {
            TextView textView8 = (TextView) view.findViewById(C2507R.id.show_replies_text);
            Plurals plurals = Plurals.f30231a;
            Context context2 = view.getContext();
            Intrinsics.m32178g(context2, "view.context");
            textView8.setText(plurals.m16342b(context2, (int) this.f29555q, C2507R.plurals.show_replies, C2507R.string.replies_zero));
            ViewsKt.m16379l(textView8, this.f29555q > 0);
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C2507R.id.show_replies);
            Intrinsics.m32178g(linearLayout3, "view.show_replies");
            ViewsKt.m16379l(linearLayout3, this.f29555q > 0);
        }
        if (list.contains(10)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.edited);
            Intrinsics.m32178g(appCompatImageView, "view.edited");
            ViewsKt.m16379l(appCompatImageView, this.f29556r);
        }
        if (list.contains(6)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29558t);
        }
        if (list.contains(7)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView2, "view.avatar");
            ViewsKt.m16375h(appCompatImageView2, this.f29559u);
        }
        if (list.contains(8)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29560v);
        }
        if (list.contains(9)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29561w);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15866v2() {
        Listener listener = this.f29563y;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
