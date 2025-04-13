package com.swiftsoft.anixartd.p015ui.model.main.profile.vote;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVoteModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ReleaseVoteModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseVoteModel extends EpoxyModel<View> {

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29952p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29953q;

    /* renamed from: s */
    @EpoxyAttribute
    public long f29955s;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29957u;

    /* renamed from: v */
    @EpoxyAttribute
    public Listener f29958v;

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29947k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29948l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29949m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29950n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29951o = "";

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public Integer f29954r = 0;

    /* renamed from: t */
    @EpoxyAttribute
    public boolean f29956t = true;

    /* compiled from: ReleaseVoteModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ReleaseVoteModel$Companion;", "", "", "EPISODES_RELEASED_CHANGED", "I", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "VOTED_AT_CHANGED", "VOTE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseVoteModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ReleaseVoteModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: b */
        void mo14972b(long j2);

        /* renamed from: c */
        void mo14973c(long j2, int i2);

        /* renamed from: g */
        void mo14974g(long j2);

        /* renamed from: k */
        void mo14975k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        final View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        String str = this.f29947k;
        Integer num = this.f29948l;
        Integer num2 = this.f29949m;
        Double d = this.f29950n;
        boolean z = this.f29952p;
        int i2 = this.f29953q;
        Integer num3 = this.f29954r;
        long j2 = this.f29955s;
        boolean z2 = this.f29956t;
        ((ImageView) view2.findViewById(C2507R.id.favorite)).setVisibility(z ? 0 : 8);
        if (i2 != 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout, "view.status_layout");
            ViewsKt.m16380m(relativeLayout, true);
            if (i2 == 1) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("смотрю");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.green_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 2) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("в планах");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.purple_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 3) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("просмотрено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.blue_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 4) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("отложено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.yellow_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 5) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("брошено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.red_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout2, "view.status_layout");
            ViewsKt.m16380m(relativeLayout2, false);
        }
        if (str == null || str.length() == 0) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText("Без названия");
        } else {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str);
        }
        if (num != null && num2 != null && Intrinsics.m32174c(num, num2)) {
            TextView textView = (TextView) C2052a.m12272g(num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            TextView textView2 = (TextView) C2052a.m12265C(textView, "view.episodes", textView, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16378k(textView2);
        } else if (num != null && num2 != null) {
            C2052a.m12286u(num, " из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView3 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView4 = (TextView) C2052a.m12265C(textView3, "view.episodes", textView3, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView4, "view.dot");
            ViewsKt.m16378k(textView4);
        } else if (num != null && num2 == null) {
            TextView textView5 = (TextView) C2052a.m12272g(num, " из ? эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            TextView textView6 = (TextView) C2052a.m12265C(textView5, "view.episodes", textView5, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView6, "view.dot");
            ViewsKt.m16378k(textView6);
        } else if (num != null || num2 == null) {
            TextView textView7 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView8 = (TextView) C2052a.m12271f(textView7, "view.episodes", textView7, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView8, "view.dot");
            ViewsKt.m16372e(textView8);
        } else {
            C2052a.m12287v("? из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView9 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView10 = (TextView) C2052a.m12265C(textView9, "view.episodes", textView9, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView10, "view.dot");
            ViewsKt.m16378k(textView10);
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        ViewsKt.m16379l(linearLayout, this.f29957u);
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29951o);
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.layout_no_voted);
        Intrinsics.m32178g(linearLayout2, "view.layout_no_voted");
        ViewsKt.m16373f(linearLayout2, num3 != null, false, null, 6);
        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2507R.id.layout_voted);
        Intrinsics.m32178g(linearLayout3, "view.layout_voted");
        ViewsKt.m16379l(linearLayout3, num3 != null);
        LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(C2507R.id.deleteVoteLayout);
        Intrinsics.m32178g(linearLayout4, "view.deleteVoteLayout");
        ViewsKt.m16379l(linearLayout4, z2);
        if (num3 != null) {
            int intValue = num3.intValue();
            if (Build.VERSION.SDK_INT == 28) {
                RatingBar ratingBar = (RatingBar) view2.findViewById(C2507R.id.rating_bar);
                Intrinsics.m32178g(ratingBar, "view.rating_bar");
                ViewsKt.m16372e(ratingBar);
                LinearLayout linearLayout5 = (LinearLayout) view2.findViewById(C2507R.id.rating_bar_text);
                Intrinsics.m32178g(linearLayout5, "view.rating_bar_text");
                ViewsKt.m16378k(linearLayout5);
            }
            ((RatingBar) view2.findViewById(C2507R.id.rating_bar)).setRating(intValue);
            TextView textView11 = (TextView) view2.findViewById(C2507R.id.rating_text);
            String string = context.getString(C2507R.string.rating_text);
            Intrinsics.m32178g(string, "context.getString(R.string.rating_text)");
            C2052a.m12290y(new Object[]{Integer.valueOf(intValue)}, 1, string, "format(format, *args)", textView11);
        }
        TextView textView12 = (TextView) view2.findViewById(C2507R.id.tvVotedAt);
        Time time = Time.f30247a;
        Intrinsics.m32178g(context, "context");
        textView12.setText(time.m16361g(context, j2));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.star1);
        Intrinsics.m32178g(appCompatImageView2, "view.star1");
        ViewsKt.m16377j(appCompatImageView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((AppCompatImageView) view2.findViewById(C2507R.id.star1)).performHapticFeedback(1);
                this.m16157v2().mo14973c(this.f6925b, 1);
                return Unit.f63088a;
            }
        });
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.star2);
        Intrinsics.m32178g(appCompatImageView3, "view.star2");
        ViewsKt.m16377j(appCompatImageView3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((AppCompatImageView) view2.findViewById(C2507R.id.star2)).performHapticFeedback(1);
                this.m16157v2().mo14973c(this.f6925b, 2);
                return Unit.f63088a;
            }
        });
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.star3);
        Intrinsics.m32178g(appCompatImageView4, "view.star3");
        ViewsKt.m16377j(appCompatImageView4, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((AppCompatImageView) view2.findViewById(C2507R.id.star3)).performHapticFeedback(1);
                this.m16157v2().mo14973c(this.f6925b, 3);
                return Unit.f63088a;
            }
        });
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C2507R.id.star4);
        Intrinsics.m32178g(appCompatImageView5, "view.star4");
        ViewsKt.m16377j(appCompatImageView5, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((AppCompatImageView) view2.findViewById(C2507R.id.star4)).performHapticFeedback(1);
                this.m16157v2().mo14973c(this.f6925b, 4);
                return Unit.f63088a;
            }
        });
        AppCompatImageView appCompatImageView6 = (AppCompatImageView) view2.findViewById(C2507R.id.star5);
        Intrinsics.m32178g(appCompatImageView6, "view.star5");
        ViewsKt.m16377j(appCompatImageView6, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ((AppCompatImageView) view2.findViewById(C2507R.id.star5)).performHapticFeedback(1);
                this.m16157v2().mo14973c(this.f6925b, 5);
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout6 = (LinearLayout) view2.findViewById(C2507R.id.btnDeleteVote);
        Intrinsics.m32178g(linearLayout6, "view.btnDeleteVote");
        ViewsKt.m16377j(linearLayout6, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVoteModel.this.m16157v2().mo14972b(ReleaseVoteModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVoteModel.this.m16157v2().mo14974g(ReleaseVoteModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 13));
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView, "view.more");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.ReleaseVoteModel$bind$12
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVoteModel.this.m16157v2().mo14975k(ReleaseVoteModel.this.f6925b);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseVoteModel) {
            ReleaseVoteModel releaseVoteModel = (ReleaseVoteModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29947k, releaseVoteModel.f29947k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29948l, releaseVoteModel.f29948l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29949m, releaseVoteModel.f29949m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29950n, releaseVoteModel.f29950n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29951o, releaseVoteModel.f29951o)) {
                m12276k.add(4);
            }
            if (this.f29952p != releaseVoteModel.f29952p) {
                m12276k.add(5);
            }
            if (this.f29953q != releaseVoteModel.f29953q) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f29954r, releaseVoteModel.f29954r)) {
                m12276k.add(7);
            }
            if (this.f29955s != releaseVoteModel.f29955s) {
                m12276k.add(8);
            }
            if (this.f29957u != releaseVoteModel.f29957u) {
                m12276k.add(9);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        Integer num;
        Double d;
        Context context = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29947k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29948l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29949m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29948l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29949m, textView2);
        }
        if (list.contains(3) && (d = this.f29950n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29951o);
        }
        if (list.contains(5)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29952p ? 0 : 8);
        }
        if (list.contains(6)) {
            if (this.f29953q != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i2 = this.f29953q;
                if (i2 == 1) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("смотрю");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.green_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 2) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("в планах");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.purple_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 3) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("просмотрено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.blue_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 4) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("отложено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.yellow_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 5) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("брошено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.red_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                }
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout2, "view.status_layout");
                ViewsKt.m16380m(relativeLayout2, false);
            }
        }
        if (list.contains(7) && ((num = this.f29954r) == null || num.intValue() != 0)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.layout_no_voted);
            Intrinsics.m32178g(linearLayout, "view.layout_no_voted");
            ViewsKt.m16373f(linearLayout, this.f29954r != null, false, null, 6);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2507R.id.layout_voted);
            Intrinsics.m32178g(linearLayout2, "view.layout_voted");
            ViewsKt.m16379l(linearLayout2, this.f29954r != null);
            Integer num2 = this.f29954r;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (Build.VERSION.SDK_INT == 28) {
                    RatingBar ratingBar = (RatingBar) view.findViewById(C2507R.id.rating_bar);
                    Intrinsics.m32178g(ratingBar, "view.rating_bar");
                    ViewsKt.m16372e(ratingBar);
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C2507R.id.rating_bar_text);
                    Intrinsics.m32178g(linearLayout3, "view.rating_bar_text");
                    ViewsKt.m16378k(linearLayout3);
                }
                ((RatingBar) view.findViewById(C2507R.id.rating_bar)).setRating(intValue);
                TextView textView3 = (TextView) view.findViewById(C2507R.id.rating_text);
                String string = context.getString(C2507R.string.rating_text);
                Intrinsics.m32178g(string, "context.getString(R.string.rating_text)");
                C2052a.m12290y(new Object[]{Integer.valueOf(intValue)}, 1, string, "format(format, *args)", textView3);
            }
        }
        if (list.contains(8) && this.f29955s != 0) {
            TextView textView4 = (TextView) view.findViewById(C2507R.id.tvVotedAt);
            Time time = Time.f30247a;
            Intrinsics.m32178g(context, "context");
            textView4.setText(time.m16361g(context, this.f29955s));
        }
        if (list.contains(9)) {
            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout4, "view.rating_layout");
            ViewsKt.m16379l(linearLayout4, this.f29957u);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16157v2() {
        Listener listener = this.f29958v;
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
        view.setOnLongClickListener(null);
        ((ImageView) view.findViewById(C2507R.id.more)).setOnClickListener(null);
    }
}
