package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.content.res.ColorStateList;
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
import com.swiftsoft.anixartd.database.entity.Category;
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

/* compiled from: RelatedModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class RelatedModel extends EpoxyModel<View> {

    /* renamed from: A */
    @EpoxyAttribute
    public boolean f29994A;

    /* renamed from: B */
    @EpoxyAttribute
    public Listener f29995B;

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public Category f30003r;

    /* renamed from: t */
    @EpoxyAttribute
    public int f30005t;

    /* renamed from: u */
    @EpoxyAttribute
    public long f30006u;

    /* renamed from: w */
    @EpoxyAttribute
    public boolean f30008w;

    /* renamed from: x */
    @EpoxyAttribute
    public int f30009x;

    /* renamed from: y */
    @EpoxyAttribute
    public boolean f30010y;

    /* renamed from: z */
    @EpoxyAttribute
    public boolean f30011z;

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public Long f29996k = 0L;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29997l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29998m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Integer f29999n = 0;

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public Double f30000o = Double.valueOf(0.0d);

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f30001p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @Nullable
    public String f30002q = "";

    /* renamed from: s */
    @EpoxyAttribute
    @Nullable
    public String f30004s = "";

    /* renamed from: v */
    @EpoxyAttribute
    @Nullable
    public Long f30007v = 0L;

    /* compiled from: RelatedModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedModel$Companion;", "", "", "CATEGORY_CHANGED", "I", "DESCRIPTION_CHANGED", "EPISODES_RELEASED_CHANGED", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "LAST_POSITION_CHANGED", "RATING_AVAILABLE_CHANGED", "RELEASE_STATUS_CHANGED", "SEASON_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "YEAR_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: RelatedModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo15004g(long j2);

        /* renamed from: k */
        void mo15005k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        String str;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Long l2 = this.f29996k;
        String str2 = this.f29997l;
        Integer num = this.f29998m;
        Integer num2 = this.f29999n;
        Double d = this.f30000o;
        Long l3 = this.f30007v;
        int i2 = this.f30005t;
        String str3 = this.f30004s;
        String str4 = this.f30001p;
        boolean z = this.f30008w;
        int i3 = this.f30009x;
        view2.setEnabled(l2 == null || l2.longValue() != this.f6925b);
        ((LinearLayout) view2.findViewById(C2507R.id.inactive)).setBackgroundResource((l2 != null && l2.longValue() == this.f6925b) ? C2507R.color.accent_alpha_10 : 0);
        ((TextView) view2.findViewById(C2507R.id.year)).setBackgroundResource((l2 != null && l2.longValue() == this.f6925b) ? C2507R.drawable.background_related_category_active : C2507R.drawable.background_related_category);
        ((TextView) view2.findViewById(C2507R.id.category)).setBackgroundResource((l2 != null && l2.longValue() == this.f6925b) ? C2507R.drawable.background_related_category_active : C2507R.drawable.background_related_category);
        ((ImageView) view2.findViewById(C2507R.id.favorite)).setVisibility(z ? 0 : 8);
        if (i3 != 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout, "view.status_layout");
            ViewsKt.m16380m(relativeLayout, true);
            if (i3 == 1) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("смотрю");
                ((RelativeLayout) view2.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view2.getResources().getColor(C2507R.color.green_alpha)));
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) view2.findViewById(C2507R.id.status));
            } else if (i3 == 2) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("в планах");
                ((RelativeLayout) view2.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view2.getResources().getColor(C2507R.color.purple_alpha)));
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) view2.findViewById(C2507R.id.status));
            } else if (i3 == 3) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("просмотрено");
                ((RelativeLayout) view2.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view2.getResources().getColor(C2507R.color.blue_alpha)));
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) view2.findViewById(C2507R.id.status));
            } else if (i3 == 4) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("отложено");
                ((RelativeLayout) view2.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view2.getResources().getColor(C2507R.color.yellow_alpha)));
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) view2.findViewById(C2507R.id.status));
            } else if (i3 == 5) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("брошено");
                ((RelativeLayout) view2.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view2.getResources().getColor(C2507R.color.red_alpha)));
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) view2.findViewById(C2507R.id.status));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout2, "view.status_layout");
            ViewsKt.m16380m(relativeLayout2, false);
        }
        if (str2 == null || str2.length() == 0) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText("Без названия");
        } else {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str2);
        }
        if ((num != null && num2 != null && Intrinsics.m32174c(num, num2)) || (l3 != null && l3.longValue() == 3)) {
            TextView textView = (TextView) view2.findViewById(C2507R.id.episodes);
            if (num2 != null) {
                str = num2 + " эп";
            } else {
                str = "? эп";
            }
            textView.setText(str);
            TextView textView2 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView3 = (TextView) C2052a.m12265C(textView2, "view.episodes", textView2, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView3, "view.dot");
            ViewsKt.m16378k(textView3);
        } else if (num != null && num2 != null) {
            C2052a.m12286u(num, " из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView4 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView5 = (TextView) C2052a.m12265C(textView4, "view.episodes", textView4, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView5, "view.dot");
            ViewsKt.m16378k(textView5);
        } else if (num != null && num2 == null) {
            TextView textView6 = (TextView) C2052a.m12272g(num, " из ? эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            TextView textView7 = (TextView) C2052a.m12265C(textView6, "view.episodes", textView6, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView7, "view.dot");
            ViewsKt.m16378k(textView7);
        } else if (num != null || num2 == null) {
            TextView textView8 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView9 = (TextView) C2052a.m12271f(textView8, "view.episodes", textView8, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView9, "view.dot");
            ViewsKt.m16372e(textView9);
        } else {
            C2052a.m12287v("? из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView10 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView11 = (TextView) C2052a.m12265C(textView10, "view.episodes", textView10, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView11, "view.dot");
            ViewsKt.m16378k(textView11);
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        ViewsKt.m16379l(linearLayout, this.f30010y);
        TextView textView12 = (TextView) view2.findViewById(C2507R.id.category);
        Intrinsics.m32178g(textView12, "view.category");
        ViewsKt.m16379l(textView12, this.f30003r != null);
        Category category = this.f30003r;
        if (category != null) {
            ((TextView) view2.findViewById(C2507R.id.category)).setText(category.getName());
        }
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        if (!(str4 == null || str4.length() == 0) || (l3 != null && l3.longValue() == 3)) {
            ((TextView) view2.findViewById(C2507R.id.description)).setText(str4);
        } else {
            ((TextView) view2.findViewById(C2507R.id.description)).setText(view2.getContext().getString(C2507R.string.description_not_specified));
        }
        String str5 = "";
        if (1 <= i2 && i2 < 5) {
            str5 = C0000a.m15l("", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "осень" : "лето" : "весна" : "зима", ' ');
        }
        if (!(str3 == null || str3.length() == 0)) {
            str5 = C0000a.m16m(str5, str3, " г.");
        }
        TextView textView13 = (TextView) view2.findViewById(C2507R.id.year);
        Intrinsics.m32178g(textView13, "view.year");
        ViewsKt.m16373f(textView13, str5.length() == 0, false, null, 6);
        ((TextView) view2.findViewById(C2507R.id.year)).setText(str5);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f30002q);
        View findViewById = view2.findViewById(C2507R.id.lineTop);
        Intrinsics.m32178g(findViewById, "view.lineTop");
        ViewsKt.m16373f(findViewById, this.f30011z, false, null, 6);
        View findViewById2 = view2.findViewById(C2507R.id.lineBottom);
        Intrinsics.m32178g(findViewById2, "view.lineBottom");
        ViewsKt.m16373f(findViewById2, this.f29994A, false, null, 6);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.RelatedModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                RelatedModel.this.m16180v2().mo15004g(RelatedModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 14));
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView, "view.more");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.RelatedModel$bind$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                RelatedModel.this.m16180v2().mo15005k(RelatedModel.this.f6925b);
                return Unit.f63088a;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof RelatedModel) {
            RelatedModel relatedModel = (RelatedModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29997l, relatedModel.f29997l)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29998m, relatedModel.f29998m)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29999n, relatedModel.f29999n)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f30000o, relatedModel.f30000o)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f30001p, relatedModel.f30001p)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f30002q, relatedModel.f30002q)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f30003r, relatedModel.f30003r)) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f30004s, relatedModel.f30004s)) {
                m12276k.add(7);
            }
            if (this.f30005t != relatedModel.f30005t) {
                m12276k.add(8);
            }
            if (!Intrinsics.m32174c(this.f30007v, relatedModel.f30007v)) {
                m12276k.add(9);
            }
            if (this.f30008w != relatedModel.f30008w) {
                m12276k.add(10);
            }
            if (this.f30009x != relatedModel.f30009x) {
                m12276k.add(11);
            }
            if (this.f30010y != relatedModel.f30010y) {
                m12276k.add(12);
            }
            if (this.f29994A != relatedModel.f29994A) {
                m12276k.add(13);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_related;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        Long l2;
        Double d;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29997l);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29998m);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29999n, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29998m);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29999n, textView2);
        }
        if (list.contains(3) && (d = this.f30000o) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            String str = this.f30001p;
            if (!(str == null || str.length() == 0) || ((l2 = this.f30007v) != null && l2.longValue() == 3)) {
                ((TextView) view.findViewById(C2507R.id.description)).setText(this.f30001p);
            } else {
                ((TextView) view.findViewById(C2507R.id.description)).setText(view.getContext().getString(C2507R.string.description_not_specified));
            }
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f30002q);
        }
        if (list.contains(6)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.category);
            Intrinsics.m32178g(textView3, "view.category");
            ViewsKt.m16379l(textView3, this.f30003r != null);
            Category category = this.f30003r;
            if (category != null) {
                ((TextView) view.findViewById(C2507R.id.category)).setText(category.getName());
            }
        }
        if (list.contains(7) || list.contains(8)) {
            int i2 = this.f30005t;
            String str2 = "";
            if (1 <= i2 && i2 < 5) {
                str2 = C0000a.m15l("", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "осень" : "лето" : "весна" : "зима", ' ');
            }
            String str3 = this.f30004s;
            if (!(str3 == null || str3.length() == 0)) {
                str2 = C0000a.m20q(C0000a.m24u(str2), this.f30004s, " г.");
            }
            TextView textView4 = (TextView) view.findViewById(C2507R.id.year);
            Intrinsics.m32178g(textView4, "view.year");
            ViewsKt.m16373f(textView4, str2.length() == 0, false, null, 6);
            ((TextView) view.findViewById(C2507R.id.year)).setText(str2);
        }
        if (list.contains(10)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f30008w ? 0 : 8);
        }
        if (list.contains(11)) {
            if (this.f30009x != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i3 = this.f30009x;
                if (i3 == 1) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("смотрю");
                    ((RelativeLayout) view.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view.getResources().getColor(C2507R.color.green_alpha)));
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) view.findViewById(C2507R.id.status));
                } else if (i3 == 2) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("в планах");
                    ((RelativeLayout) view.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view.getResources().getColor(C2507R.color.purple_alpha)));
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) view.findViewById(C2507R.id.status));
                } else if (i3 == 3) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("просмотрено");
                    ((RelativeLayout) view.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view.getResources().getColor(C2507R.color.blue_alpha)));
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) view.findViewById(C2507R.id.status));
                } else if (i3 == 4) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("отложено");
                    ((RelativeLayout) view.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view.getResources().getColor(C2507R.color.yellow_alpha)));
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) view.findViewById(C2507R.id.status));
                } else if (i3 == 5) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("брошено");
                    ((RelativeLayout) view.findViewById(C2507R.id.status_layout)).setBackgroundTintList(ColorStateList.valueOf(view.getResources().getColor(C2507R.color.red_alpha)));
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) view.findViewById(C2507R.id.status));
                }
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout2, "view.status_layout");
                ViewsKt.m16380m(relativeLayout2, false);
            }
        }
        if (list.contains(12)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f30010y);
        }
        if (list.contains(13)) {
            View findViewById = view.findViewById(C2507R.id.lineBottom);
            Intrinsics.m32178g(findViewById, "view.lineBottom");
            ViewsKt.m16373f(findViewById, this.f29994A, false, null, 6);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16180v2() {
        Listener listener = this.f29995B;
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
