package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationFriendModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationFriendModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class NotificationFriendModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29774k;

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public ProfileFriendNotification.Status f29775l;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29776m;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public String f29777n;

    /* renamed from: o */
    @EpoxyAttribute
    public long f29778o;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29779p;

    /* renamed from: q */
    @EpoxyAttribute
    public Listener f29780q;

    /* compiled from: NotificationFriendModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationFriendModel$Companion;", "", "", "AVATAR_CHANGED", "I", "LOGIN_CHANGED", "NEW_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: NotificationFriendModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationFriendModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: f */
        void mo14716f(long j2);

        /* renamed from: k */
        void mo14718k(long j2);
    }

    /* compiled from: NotificationFriendModel.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29781a;

        static {
            int[] iArr = new int[ProfileFriendNotification.Status.values().length];
            try {
                iArr[ProfileFriendNotification.Status.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileFriendNotification.Status.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29781a = iArr;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ProfileFriendNotification.Status status = this.f29775l;
        int i2 = status == null ? -1 : WhenMappings.f29781a[status.ordinal()];
        Integer valueOf = i2 != 1 ? i2 != 2 ? null : Integer.valueOf(C2507R.string.friend_accept_notification_text) : Integer.valueOf(C2507R.string.friend_request_notification_text);
        if (valueOf == null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16368a(appCompatImageView, this.f29777n);
        TextView textView = (TextView) view2.findViewById(C2507R.id.message);
        String string = context.getString(valueOf.intValue());
        Intrinsics.m32178g(string, "context.getString(descriptionTextResourceId)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.f29776m}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.date);
        long j2 = this.f29778o;
        textView2.setText(j2 != 0 ? Time.f30247a.m16361g(context, j2) : "время не указано");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.is_new);
        Intrinsics.m32178g(appCompatImageView2, "view.is_new");
        ViewsKt.m16379l(appCompatImageView2, this.f29779p);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.NotificationFriendModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                NotificationFriendModel notificationFriendModel = NotificationFriendModel.this;
                NotificationFriendModel.Listener listener = notificationFriendModel.f29780q;
                if (listener != null) {
                    listener.mo14716f(notificationFriendModel.f29774k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 9));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof NotificationFriendModel) {
            NotificationFriendModel notificationFriendModel = (NotificationFriendModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29776m, notificationFriendModel.f29776m)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29777n, notificationFriendModel.f29777n)) {
                m12276k.add(1);
            }
            if (this.f29778o != notificationFriendModel.f29778o) {
                m12276k.add(2);
            }
            if (this.f29779p != notificationFriendModel.f29779p) {
                m12276k.add(3);
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
        Context context = C2052a.m12267b(view, "view", list, "payloads");
        ProfileFriendNotification.Status status = this.f29775l;
        int i2 = status == null ? -1 : WhenMappings.f29781a[status.ordinal()];
        Integer valueOf = i2 != 1 ? i2 != 2 ? null : Integer.valueOf(C2507R.string.friend_accept_notification_text) : Integer.valueOf(C2507R.string.friend_request_notification_text);
        if (list.contains(0) && valueOf != null) {
            TextView textView = (TextView) view.findViewById(C2507R.id.message);
            String string = view.getContext().getString(valueOf.intValue());
            Intrinsics.m32178g(string, "view.context.getString(descriptionTextResourceId)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.f29776m}, 1));
            Intrinsics.m32178g(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
        }
        if (list.contains(1)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16368a(appCompatImageView, this.f29777n);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.date);
            if (this.f29778o != 0) {
                Time time = Time.f30247a;
                Intrinsics.m32178g(context, "context");
                str = time.m16361g(context, this.f29778o);
            } else {
                str = "время не указано";
            }
            textView2.setText(str);
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.is_new);
            Intrinsics.m32178g(appCompatImageView2, "view.is_new");
            ViewsKt.m16379l(appCompatImageView2, this.f29779p);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
