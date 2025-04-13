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
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel;
import com.swiftsoft.anixartd.utils.Plurals;
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

/* compiled from: FriendRequestModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRequestModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class FriendRequestModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29922k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29923l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29924m;

    /* renamed from: n */
    @EpoxyAttribute
    public int f29925n;

    /* renamed from: o */
    @EpoxyAttribute
    public long f29926o;

    /* renamed from: p */
    @StringRes
    @EpoxyAttribute
    public int f29927p;

    /* renamed from: q */
    @StringRes
    @EpoxyAttribute
    public int f29928q;

    /* renamed from: r */
    @EpoxyAttribute
    public int f29929r;

    /* renamed from: s */
    @EpoxyAttribute
    public int f29930s;

    /* renamed from: t */
    @EpoxyAttribute
    public boolean f29931t;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29932u;

    /* renamed from: v */
    @EpoxyAttribute
    public Listener f29933v;

    /* compiled from: FriendRequestModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRequestModel$Companion;", "", "", "ADDED_DATE_CHANGED", "I", "AVATAR_CHANGED", "FRIEND_COUNT_CHANGED", "NEGATIVE_BUTTON_TEXT_CHANGED", "NICKNAME_CHANGED", "ONLINE_CHANGED", "POSITIVE_BUTTON_TEXT_CHANGED", "SPONSOR_CHANGED", "VERIFIED_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: FriendRequestModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendRequestModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
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
        ViewsKt.m16379l(appCompatImageView, this.f29931t);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29932u);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29922k);
        String str = this.f29923l;
        if (str != null) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView3, "view.avatar");
            ViewsKt.m16368a(appCompatImageView3, str);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.isOnline);
        Intrinsics.m32178g(appCompatImageView4, "view.isOnline");
        ViewsKt.m16379l(appCompatImageView4, this.f29924m);
        Button bind$lambda$6 = (Button) view2.findViewById(C2507R.id.btnPositive);
        Intrinsics.m32178g(bind$lambda$6, "bind$lambda$6");
        ViewsKt.m16379l(bind$lambda$6, this.f29927p != 0);
        if (this.f29927p != 0) {
            ((Button) view2.findViewById(C2507R.id.btnPositive)).setText(context.getString(this.f29927p));
        }
        Button bind$lambda$7 = (Button) view2.findViewById(C2507R.id.btnNegative);
        Intrinsics.m32178g(bind$lambda$7, "bind$lambda$7");
        ViewsKt.m16379l(bind$lambda$7, this.f29928q != 0);
        if (this.f29928q != 0) {
            ((Button) view2.findViewById(C2507R.id.btnNegative)).setText(context.getString(this.f29928q));
        }
        Button button = (Button) view2.findViewById(C2507R.id.btnPositive);
        Intrinsics.m32178g(button, "view.btnPositive");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel$bind$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                FriendRequestModel.Listener m16137v2 = FriendRequestModel.this.m16137v2();
                FriendRequestModel friendRequestModel = FriendRequestModel.this;
                m16137v2.mo14773a(friendRequestModel.f6925b, friendRequestModel.f29929r);
                return Unit.f63088a;
            }
        });
        Button button2 = (Button) view2.findViewById(C2507R.id.btnNegative);
        Intrinsics.m32178g(button2, "view.btnNegative");
        ViewsKt.m16377j(button2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendRequestModel$bind$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                FriendRequestModel.Listener m16137v2 = FriendRequestModel.this.m16137v2();
                FriendRequestModel friendRequestModel = FriendRequestModel.this;
                m16137v2.mo14774b(friendRequestModel.f6925b, friendRequestModel.f29930s);
                return Unit.f63088a;
            }
        });
        TextView bind$lambda$8 = (TextView) view2.findViewById(C2507R.id.subtitle);
        Intrinsics.m32178g(bind$lambda$8, "bind$lambda$8");
        ViewsKt.m16379l(bind$lambda$8, this.f29925n > 0);
        Plurals plurals = Plurals.f30231a;
        Context context2 = view2.getContext();
        Intrinsics.m32178g(context2, "view.context");
        bind$lambda$8.setText(plurals.m16342b(context2, this.f29925n, C2507R.plurals.friend_count, C2507R.string.friends_zero));
        TextView bind$lambda$9 = (TextView) view2.findViewById(C2507R.id.subtitle2);
        Intrinsics.m32178g(bind$lambda$9, "bind$lambda$9");
        ViewsKt.m16379l(bind$lambda$9, this.f29926o > 0);
        Time time = Time.f30247a;
        Context context3 = view2.getContext();
        Intrinsics.m32178g(context3, "view.context");
        bind$lambda$9.setText(time.m16361g(context3, this.f29926o));
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 14));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof FriendRequestModel) {
            FriendRequestModel friendRequestModel = (FriendRequestModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29922k, friendRequestModel.f29922k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29923l, friendRequestModel.f29923l)) {
                m12276k.add(1);
            }
            if (this.f29924m != friendRequestModel.f29924m) {
                m12276k.add(2);
            }
            if (this.f29925n != friendRequestModel.f29925n) {
                m12276k.add(3);
            }
            if (this.f29926o != friendRequestModel.f29926o) {
                m12276k.add(4);
            }
            if (this.f29927p != friendRequestModel.f29927p) {
                m12276k.add(5);
            }
            if (this.f29927p != friendRequestModel.f29927p) {
                m12276k.add(6);
            }
            if (this.f29931t != friendRequestModel.f29931t) {
                m12276k.add(7);
            }
            if (this.f29932u != friendRequestModel.f29932u) {
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
        String str;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29922k);
        }
        if (list.contains(1) && (str = this.f29923l) != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView, "view.avatar");
            ViewsKt.m16368a(appCompatImageView, str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.isOnline);
            Intrinsics.m32178g(appCompatImageView2, "view.isOnline");
            ViewsKt.m16379l(appCompatImageView2, this.f29924m);
        }
        if (list.contains(3)) {
            TextView bind$lambda$1 = (TextView) view.findViewById(C2507R.id.subtitle);
            Intrinsics.m32178g(bind$lambda$1, "bind$lambda$1");
            ViewsKt.m16379l(bind$lambda$1, this.f29925n > 0);
            Plurals plurals = Plurals.f30231a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            bind$lambda$1.setText(plurals.m16342b(context, this.f29925n, C2507R.plurals.friend_count, C2507R.string.friends_zero));
        }
        if (list.contains(4)) {
            TextView bind$lambda$2 = (TextView) view.findViewById(C2507R.id.subtitle2);
            Intrinsics.m32178g(bind$lambda$2, "bind$lambda$2");
            ViewsKt.m16379l(bind$lambda$2, this.f29926o > 0);
            Time time = Time.f30247a;
            Context context2 = view.getContext();
            Intrinsics.m32178g(context2, "view.context");
            bind$lambda$2.setText(time.m16361g(context2, this.f29926o));
        }
        if (list.contains(5)) {
            Button bind$lambda$3 = (Button) view.findViewById(C2507R.id.btnPositive);
            Intrinsics.m32178g(bind$lambda$3, "bind$lambda$3");
            ViewsKt.m16379l(bind$lambda$3, this.f29927p != 0);
            if (this.f29927p != 0) {
                ((Button) view.findViewById(C2507R.id.btnPositive)).setText(m12267b.getString(this.f29927p));
            }
        }
        if (list.contains(6)) {
            Button bind$lambda$4 = (Button) view.findViewById(C2507R.id.btnNegative);
            Intrinsics.m32178g(bind$lambda$4, "bind$lambda$4");
            ViewsKt.m16379l(bind$lambda$4, this.f29928q != 0);
            if (this.f29928q != 0) {
                ((Button) view.findViewById(C2507R.id.btnNegative)).setText(m12267b.getString(this.f29928q));
            }
        }
        if (list.contains(7)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29931t);
        }
        if (list.contains(8)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29932u);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16137v2() {
        Listener listener = this.f29933v;
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
