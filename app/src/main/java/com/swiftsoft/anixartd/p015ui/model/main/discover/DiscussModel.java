package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DiscussModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/DiscussModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class DiscussModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29618k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29619l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29620m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29621n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public Integer f29622o = 0;

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f29623p = "";

    /* renamed from: q */
    @EpoxyAttribute
    public boolean f29624q;

    /* renamed from: r */
    @EpoxyAttribute
    public int f29625r;

    /* renamed from: s */
    @EpoxyAttribute
    public boolean f29626s;

    /* renamed from: t */
    @EpoxyAttribute
    public Listener f29627t;

    /* compiled from: DiscussModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/DiscussModel$Companion;", "", "", "COMMENT_COUNT_CHANGED", "I", "EPISODES_RELEASED_CHANGED", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: DiscussModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/DiscussModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo14550g(long j2);

        /* renamed from: k */
        void mo14551k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        String str = this.f29618k;
        Integer num = this.f29619l;
        Integer num2 = this.f29620m;
        Double d = this.f29621n;
        Integer num3 = this.f29622o;
        boolean z = this.f29624q;
        int i2 = this.f29625r;
        ((ImageView) view2.findViewById(C2507R.id.favorite)).setVisibility(z ? 0 : 8);
        int i3 = 5;
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
        ViewsKt.m16379l(linearLayout, this.f29626s);
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        TextView textView11 = (TextView) view2.findViewById(C2507R.id.commentPerDayCount);
        StringBuilder m24u = C0000a.m24u("<b>");
        m24u.append(num3 != null ? DigitsKt.m16324e(num3.intValue()) : null);
        m24u.append(" коммент.</b> за сутки");
        textView11.setText(Html.fromHtml(m24u.toString()));
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29623p);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.discover.DiscussModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                DiscussModel.this.m15925v2().mo14550g(DiscussModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, i3));
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView, "view.more");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.discover.DiscussModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                DiscussModel.this.m15925v2().mo14551k(DiscussModel.this.f6925b);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof DiscussModel) {
            DiscussModel discussModel = (DiscussModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29618k, discussModel.f29618k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29619l, discussModel.f29619l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29620m, discussModel.f29620m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29621n, discussModel.f29621n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29622o, discussModel.f29622o)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29623p, discussModel.f29623p)) {
                m12276k.add(5);
            }
            if (this.f29624q != discussModel.f29624q) {
                m12276k.add(6);
            }
            if (this.f29625r != discussModel.f29625r) {
                m12276k.add(7);
            }
            if (this.f29626s != discussModel.f29626s) {
                m12276k.add(8);
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
        Double d;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29618k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29619l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29620m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29619l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29620m, textView2);
        }
        if (list.contains(3) && (d = this.f29621n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.commentPerDayCount);
            StringBuilder m24u = C0000a.m24u("<b>");
            Integer num = this.f29622o;
            m24u.append(num != null ? DigitsKt.m16324e(num.intValue()) : null);
            m24u.append(" коммент.</b> за сутки");
            textView3.setText(Html.fromHtml(m24u.toString()));
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29623p);
        }
        if (list.contains(6)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29624q ? 0 : 8);
        }
        if (list.contains(7)) {
            if (this.f29625r != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i2 = this.f29625r;
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
            if (list.contains(8)) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
                Intrinsics.m32178g(linearLayout, "view.rating_layout");
                ViewsKt.m16379l(linearLayout, this.f29626s);
            }
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15925v2() {
        Listener listener = this.f29627t;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
