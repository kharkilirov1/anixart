package com.swiftsoft.anixartd.p015ui.model.main.profile.friends;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FriendRecommendationModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRecommendationModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class FriendRecommendationModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29910k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29911l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29912m;

    /* renamed from: n */
    @StringRes
    @EpoxyAttribute
    public int f29913n;

    /* renamed from: o */
    @StringRes
    @EpoxyAttribute
    public int f29914o;

    /* renamed from: p */
    @EpoxyAttribute
    public int f29915p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29916q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29917r;

    /* renamed from: s */
    @EpoxyAttribute
    public boolean f29918s;

    /* renamed from: t */
    @EpoxyAttribute
    public Listener f29919t;

    /* compiled from: FriendRecommendationModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRecommendationModel$Companion;", "", "", "AVATAR_CHANGED", "I", "NEGATIVE_BUTTON_TEXT_CHANGED", "NICKNAME_CHANGED", "ONLINE_CHANGED", "POSITIVE_BUTTON_TEXT_CHANGED", "SPONSOR_CHANGED", "VERIFIED_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: FriendRecommendationModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRecommendationModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14773a(long j2, int i2);

        /* renamed from: b */
        void mo14774b(long j2, int i2);

        /* renamed from: f */
        void mo14775f(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29917r);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29918s);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29910k);
        String str = this.f29911l;
        if (str != null) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView3, "view.avatar");
            ViewsKt.m16368a(appCompatImageView3, str);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.isOnline);
        Intrinsics.m32178g(appCompatImageView4, "view.isOnline");
        ViewsKt.m16379l(appCompatImageView4, this.f29912m);
        Button bind$lambda$4 = (Button) view2.findViewById(C2507R.id.btnPositive);
        Intrinsics.m32178g(bind$lambda$4, "bind$lambda$4");
        ViewsKt.m16379l(bind$lambda$4, this.f29913n != 0);
        if (this.f29913n != 0) {
            ((Button) view2.findViewById(C2507R.id.btnPositive)).setText(context.getString(this.f29913n));
        }
        Button bind$lambda$5 = (Button) view2.findViewById(C2507R.id.btnNegative);
        Intrinsics.m32178g(bind$lambda$5, "bind$lambda$5");
        ViewsKt.m16379l(bind$lambda$5, this.f29914o != 0);
        if (this.f29914o != 0) {
            ((Button) view2.findViewById(C2507R.id.btnNegative)).setText(context.getString(this.f29914o));
        }
        Button button = (Button) view2.findViewById(C2507R.id.btnPositive);
        Intrinsics.m32178g(button, "view.btnPositive");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRecommendationModel$bind$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                FriendRecommendationModel.Listener m16133v2 = FriendRecommendationModel.this.m16133v2();
                FriendRecommendationModel friendRecommendationModel = FriendRecommendationModel.this;
                m16133v2.mo14773a(friendRecommendationModel.f6925b, friendRecommendationModel.f29915p);
                return Unit.f63088a;
            }
        });
        Button button2 = (Button) view2.findViewById(C2507R.id.btnNegative);
        Intrinsics.m32178g(button2, "view.btnNegative");
        ViewsKt.m16377j(button2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRecommendationModel$bind$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                FriendRecommendationModel.Listener m16133v2 = FriendRecommendationModel.this.m16133v2();
                FriendRecommendationModel friendRecommendationModel = FriendRecommendationModel.this;
                m16133v2.mo14774b(friendRecommendationModel.f6925b, friendRecommendationModel.f29916q);
                return Unit.f63088a;
            }
        });
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 13));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof FriendRecommendationModel) {
            FriendRecommendationModel friendRecommendationModel = (FriendRecommendationModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29910k, friendRecommendationModel.f29910k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29911l, friendRecommendationModel.f29911l)) {
                m12276k.add(1);
            }
            if (this.f29912m != friendRecommendationModel.f29912m) {
                m12276k.add(2);
            }
            if (this.f29913n != friendRecommendationModel.f29913n) {
                m12276k.add(3);
            }
            if (this.f29913n != friendRecommendationModel.f29913n) {
                m12276k.add(4);
            }
            if (this.f29917r != friendRecommendationModel.f29917r) {
                m12276k.add(5);
            }
            if (this.f29918s != friendRecommendationModel.f29918s) {
                m12276k.add(6);
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
        String str;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29910k);
        }
        if (list.contains(1) && (str = this.f29911l) != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView, "view.avatar");
            ViewsKt.m16368a(appCompatImageView, str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.isOnline);
            Intrinsics.m32178g(appCompatImageView2, "view.isOnline");
            ViewsKt.m16379l(appCompatImageView2, this.f29912m);
        }
        if (list.contains(3)) {
            Button bind$lambda$1 = (Button) view.findViewById(C2507R.id.btnPositive);
            Intrinsics.m32178g(bind$lambda$1, "bind$lambda$1");
            ViewsKt.m16379l(bind$lambda$1, this.f29913n != 0);
            if (this.f29913n != 0) {
                ((Button) view.findViewById(C2507R.id.btnPositive)).setText(m12267b.getString(this.f29913n));
            }
        }
        if (list.contains(4)) {
            Button bind$lambda$2 = (Button) view.findViewById(C2507R.id.btnNegative);
            Intrinsics.m32178g(bind$lambda$2, "bind$lambda$2");
            ViewsKt.m16379l(bind$lambda$2, this.f29914o != 0);
            if (this.f29914o != 0) {
                ((Button) view.findViewById(C2507R.id.btnNegative)).setText(m12267b.getString(this.f29914o));
            }
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29917r);
        }
        if (list.contains(6)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29918s);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16133v2() {
        Listener listener = this.f29919t;
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
