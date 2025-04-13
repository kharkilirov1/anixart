package com.swiftsoft.anixartd.p015ui.model.main.preference;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Plurals;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseNotificationPreferenceModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/ReleaseNotificationPreferenceModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseNotificationPreferenceModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29816k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29817l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29818m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29819n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29820o = "";

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29821p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29822q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29823r;

    /* renamed from: s */
    @EpoxyAttribute
    public int f29824s;

    /* renamed from: t */
    @EpoxyAttribute
    public int f29825t;

    /* renamed from: u */
    @EpoxyAttribute
    public Listener f29826u;

    /* compiled from: ReleaseNotificationPreferenceModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/ReleaseNotificationPreferenceModel$Companion;", "", "", "EPISODES_RELEASED_CHANGED", "I", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "TYPE_COUNT_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseNotificationPreferenceModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/ReleaseNotificationPreferenceModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: e1 */
        void mo14758e1(long j2);

        /* renamed from: g */
        void mo14759g(long j2);

        /* renamed from: k */
        void mo14760k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        String m16342b;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        String str = this.f29816k;
        Integer num = this.f29817l;
        Integer num2 = this.f29818m;
        Double d = this.f29819n;
        boolean z = this.f29821p;
        int i2 = this.f29822q;
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
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        ViewsKt.m16379l(linearLayout, this.f29823r);
        TextView textView11 = (TextView) view2.findViewById(C2507R.id.type_count);
        if (this.f29824s == this.f29825t) {
            m16342b = context.getString(C2507R.string.release_types_all);
        } else {
            Plurals plurals = Plurals.f30231a;
            Intrinsics.m32178g(context, "context");
            m16342b = plurals.m16342b(context, this.f29824s, C2507R.plurals.release_types, C2507R.string.release_types_zero);
        }
        textView11.setText(m16342b);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29820o);
        MaterialButton materialButton = (MaterialButton) view2.findViewById(C2507R.id.release_type_notification_preferences);
        Intrinsics.m32178g(materialButton, "view.release_type_notification_preferences");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseNotificationPreferenceModel.this.m16039v2().mo14758e1(ReleaseNotificationPreferenceModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseNotificationPreferenceModel.this.m16039v2().mo14759g(ReleaseNotificationPreferenceModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 12));
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView, "view.more");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel$bind$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseNotificationPreferenceModel.this.m16039v2().mo14760k(ReleaseNotificationPreferenceModel.this.f6925b);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseNotificationPreferenceModel) {
            ReleaseNotificationPreferenceModel releaseNotificationPreferenceModel = (ReleaseNotificationPreferenceModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29816k, releaseNotificationPreferenceModel.f29816k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29817l, releaseNotificationPreferenceModel.f29817l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29818m, releaseNotificationPreferenceModel.f29818m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29819n, releaseNotificationPreferenceModel.f29819n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29820o, releaseNotificationPreferenceModel.f29820o)) {
                m12276k.add(4);
            }
            if (this.f29821p != releaseNotificationPreferenceModel.f29821p) {
                m12276k.add(5);
            }
            if (this.f29822q != releaseNotificationPreferenceModel.f29822q) {
                m12276k.add(6);
            }
            if (this.f29823r != releaseNotificationPreferenceModel.f29823r) {
                m12276k.add(7);
            }
            if (this.f29824s != releaseNotificationPreferenceModel.f29824s) {
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
        String m16342b;
        Double d;
        Context context = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29816k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29817l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29818m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29817l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29818m, textView2);
        }
        if (list.contains(3) && (d = this.f29819n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29820o);
        }
        if (list.contains(5)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29821p ? 0 : 8);
        }
        if (list.contains(6)) {
            if (this.f29822q != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i2 = this.f29822q;
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
        if (list.contains(7)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f29823r);
        }
        if (list.contains(8)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.type_count);
            if (this.f29824s == this.f29825t) {
                m16342b = context.getString(C2507R.string.release_types_all);
            } else {
                Plurals plurals = Plurals.f30231a;
                Intrinsics.m32178g(context, "context");
                m16342b = plurals.m16342b(context, this.f29824s, C2507R.plurals.release_types, C2507R.string.release_types_zero);
            }
            textView3.setText(m16342b);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16039v2() {
        Listener listener = this.f29826u;
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
