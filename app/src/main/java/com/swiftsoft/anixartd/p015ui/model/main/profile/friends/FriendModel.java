package com.swiftsoft.anixartd.p015ui.model.main.profile.friends;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendModel;
import com.swiftsoft.anixartd.utils.Plurals;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FriendModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class FriendModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29901k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29902l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29903m;

    /* renamed from: n */
    @EpoxyAttribute
    public int f29904n;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29905o;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29906p;

    /* renamed from: q */
    @EpoxyAttribute
    public boolean f29907q;

    /* renamed from: r */
    @EpoxyAttribute
    public Listener f29908r;

    /* compiled from: FriendModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendModel$Companion;", "", "", "AVATAR_CHANGED", "I", "FRIEND_COUNT_CHANGED", "IS_SOCIAL", "NICKNAME_CHANGED", "ONLINE_CHANGED", "SPONSOR_CHANGED", "VERIFIED_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: FriendModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/friends/FriendModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: c */
        void mo14894c(long j2, boolean z);

        /* renamed from: f */
        void mo14775f(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        int m16370c;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29901k);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29905o);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29906p);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.message_icon);
        boolean z = this.f29907q;
        if (z) {
            m16370c = ViewsKt.m16370c(view2, C2507R.attr.colorAccent);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            m16370c = ViewsKt.m16370c(view2, C2507R.attr.iconSecondaryTintColor);
        }
        appCompatImageView3.setColorFilter(m16370c);
        String str = this.f29902l;
        if (str != null) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView4, "view.avatar");
            ViewsKt.m16368a(appCompatImageView4, str);
        }
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C2507R.id.isOnline);
        Intrinsics.m32178g(appCompatImageView5, "view.isOnline");
        ViewsKt.m16379l(appCompatImageView5, this.f29903m);
        TextView bind$lambda$3 = (TextView) view2.findViewById(C2507R.id.subtitle);
        Intrinsics.m32178g(bind$lambda$3, "bind$lambda$3");
        ViewsKt.m16379l(bind$lambda$3, this.f29904n > 0);
        Plurals plurals = Plurals.f30231a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        bind$lambda$3.setText(plurals.m16342b(context, this.f29904n, C2507R.plurals.friend_count, C2507R.string.friends_zero));
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.message);
        Intrinsics.m32178g(relativeLayout, "view.message");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.friends.FriendModel$bind$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                FriendModel friendModel = FriendModel.this;
                FriendModel.Listener listener = friendModel.f29908r;
                if (listener != null) {
                    listener.mo14894c(friendModel.f6925b, friendModel.f29907q);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 12));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof FriendModel) {
            FriendModel friendModel = (FriendModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29901k, friendModel.f29901k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29902l, friendModel.f29902l)) {
                m12276k.add(1);
            }
            if (this.f29903m != friendModel.f29903m) {
                m12276k.add(2);
            }
            if (this.f29904n != friendModel.f29904n) {
                m12276k.add(3);
            }
            if (this.f29905o != friendModel.f29905o) {
                m12276k.add(4);
            }
            if (this.f29906p != friendModel.f29906p) {
                m12276k.add(5);
            }
            if (this.f29907q != friendModel.f29907q) {
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
        int m16370c;
        String str;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29901k);
        }
        if (list.contains(1) && (str = this.f29902l) != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView, "view.avatar");
            ViewsKt.m16368a(appCompatImageView, str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.isOnline);
            Intrinsics.m32178g(appCompatImageView2, "view.isOnline");
            ViewsKt.m16379l(appCompatImageView2, this.f29903m);
        }
        if (list.contains(3)) {
            TextView bind$lambda$1 = (TextView) view.findViewById(C2507R.id.subtitle);
            Intrinsics.m32178g(bind$lambda$1, "bind$lambda$1");
            ViewsKt.m16379l(bind$lambda$1, this.f29904n > 0);
            Plurals plurals = Plurals.f30231a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            bind$lambda$1.setText(plurals.m16342b(context, this.f29904n, C2507R.plurals.friend_count, C2507R.string.friends_zero));
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29905o);
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29906p);
        }
        if (list.contains(6)) {
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) view.findViewById(C2507R.id.message_icon);
            boolean z = this.f29907q;
            if (z) {
                m16370c = ViewsKt.m16370c(view, C2507R.attr.colorAccent);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                m16370c = ViewsKt.m16370c(view, C2507R.attr.iconSecondaryTintColor);
            }
            appCompatImageView5.setColorFilter(m16370c);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
