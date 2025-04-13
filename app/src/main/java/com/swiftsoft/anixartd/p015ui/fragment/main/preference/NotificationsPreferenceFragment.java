package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.layout.ProfileMainNotificationPreferenceLayout;
import com.swiftsoft.anixartd.p015ui.logic.main.notifications.NotificationsPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationsPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/NotificationsPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPreferenceView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationsPreferenceFragment extends BasePreferenceFragment implements NotificationsPreferenceView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: E */
    public static final /* synthetic */ KProperty<Object>[] f28332E = {C2052a.m12277l(NotificationsPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPreferencePresenter;", 0)};

    /* renamed from: A */
    public Preference f28333A;

    /* renamed from: B */
    public Preference f28334B;

    /* renamed from: C */
    public SwitchPreference f28335C;

    /* renamed from: D */
    @NotNull
    public Map<Integer, View> f28336D = new LinkedHashMap();

    /* renamed from: o */
    @NotNull
    public final Lazy f28337o = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.NotificationsPreferenceFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = NotificationsPreferenceFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* renamed from: p */
    @Inject
    public dagger.Lazy<NotificationsPreferencePresenter> f28338p;

    /* renamed from: q */
    @NotNull
    public final MoxyKtxDelegate f28339q;

    /* renamed from: r */
    public String[] f28340r;

    /* renamed from: s */
    public String[] f28341s;

    /* renamed from: t */
    public String[] f28342t;

    /* renamed from: u */
    public String[] f28343u;

    /* renamed from: v */
    public boolean[] f28344v;

    /* renamed from: w */
    public List<Integer> f28345w;

    /* renamed from: x */
    public PreferenceCategory f28346x;

    /* renamed from: y */
    public ProfileMainNotificationPreferenceLayout f28347y;

    /* renamed from: z */
    public Preference f28348z;

    /* compiled from: NotificationsPreferenceFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/NotificationsPreferenceFragment$Companion;", "", "", "CHOOSE_STATUS_TAG", "Ljava/lang/String;", "CHOOSE_TYPE_TAG", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public NotificationsPreferenceFragment() {
        Function0<NotificationsPreferencePresenter> function0 = new Function0<NotificationsPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.NotificationsPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public NotificationsPreferencePresenter invoke() {
                dagger.Lazy<NotificationsPreferencePresenter> lazy = NotificationsPreferenceFragment.this.f28338p;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28339q = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(NotificationsPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28336D.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: X2 */
    public void mo14700X2() {
        final NotificationsPreferenceFragment notificationsPreferenceFragment;
        final PreferenceCategory preferenceCategory = (PreferenceCategory) mo3340t0("episodes");
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) mo3340t0("comments");
        final ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout = (ProfileMainNotificationPreferenceLayout) mo3340t0("profile_main_notification_preferences");
        final Preference mo3340t0 = mo3340t0("profile_status_notification_preferences");
        final Preference mo3340t02 = mo3340t0("profile_type_notification_preferences");
        Preference mo3340t03 = mo3340t0("profile_release_type_notification_preferences");
        SwitchPreference switchPreference = (SwitchPreference) mo3340t0("is_episode_notifications_enabled");
        final SwitchPreference switchPreference2 = (SwitchPreference) mo3340t0("is_first_episode_notification_enabled");
        SwitchPreference switchPreference3 = (SwitchPreference) mo3340t0("is_related_release_notifications_enabled");
        SwitchPreference switchPreference4 = (SwitchPreference) mo3340t0("is_report_process_notifications_enabled");
        SwitchPreference switchPreference5 = (SwitchPreference) mo3340t0("is_comment_notifications_enabled");
        SwitchPreference switchPreference6 = (SwitchPreference) mo3340t0("is_my_collection_comment_notifications_enabled");
        if (preferenceCategory == null || preferenceCategory2 == null || profileMainNotificationPreferenceLayout == null || mo3340t0 == null || mo3340t02 == null || mo3340t03 == null || switchPreference == null || switchPreference2 == null || switchPreference3 == null || switchPreference4 == null || switchPreference5 == null || switchPreference6 == null) {
            notificationsPreferenceFragment = this;
        } else {
            this.f28346x = preferenceCategory;
            this.f28347y = profileMainNotificationPreferenceLayout;
            this.f28348z = mo3340t0;
            this.f28333A = mo3340t02;
            this.f28334B = mo3340t03;
            this.f28335C = switchPreference2;
            final NotificationsPreferenceUiLogic notificationsPreferenceUiLogic = m15535n4().f26450c;
            final Set<Long> set = notificationsPreferenceUiLogic.f29111d;
            boolean z = notificationsPreferenceUiLogic.f29113f;
            boolean z2 = notificationsPreferenceUiLogic.f29114g;
            boolean z3 = notificationsPreferenceUiLogic.f29115h;
            boolean z4 = notificationsPreferenceUiLogic.f29116i;
            boolean z5 = notificationsPreferenceUiLogic.f29117j;
            boolean z6 = notificationsPreferenceUiLogic.f29118k;
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (Iterator it = notificationsPreferenceUiLogic.f29109b.iterator(); it.hasNext(); it = it) {
                Type type = (Type) it.next();
                arrayList.add(type.getName());
                arrayList2.add(String.valueOf(type.getId()));
            }
            int i2 = 0;
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.f28342t = (String[]) array;
            Object[] array2 = arrayList2.toArray(new String[0]);
            Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.f28343u = (String[]) array2;
            String[] strArr = this.f28340r;
            if (strArr == null) {
                Intrinsics.m32189r("profileLists");
                throw null;
            }
            this.f28344v = new boolean[strArr.length];
            this.f28345w = new ArrayList(notificationsPreferenceUiLogic.f29110c);
            m15534m4();
            profileMainNotificationPreferenceLayout.f4968f = new C2707m(this, i2);
            m15538q4();
            mo3340t0.f4969g = new C2707m(this, 1);
            mo3340t02.f4969g = new C0919e(this, set, 14);
            mo3340t03.f4969g = new C2707m(this, 2);
            m15541t4();
            m15543v4();
            m15540s4();
            m15539r4();
            switchPreference.m3461R(z);
            final int i3 = 0;
            switchPreference.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.l
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = NotificationsPreferenceUiLogic.this;
                    NotificationsPreferenceFragment this$0 = this;
                    Set profileTypeNotificationPreferences = set;
                    List typesValues = arrayList2;
                    PreferenceCategory preferenceCategory3 = preferenceCategory;
                    ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout2 = profileMainNotificationPreferenceLayout;
                    Preference preference2 = mo3340t0;
                    Preference preference3 = mo3340t02;
                    SwitchPreference switchPreference7 = switchPreference2;
                    KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                    Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                    Intrinsics.m32179h(this$0, "this$0");
                    Intrinsics.m32179h(profileTypeNotificationPreferences, "$profileTypeNotificationPreferences");
                    Intrinsics.m32179h(typesValues, "$typesValues");
                    Intrinsics.m32179h(preference, "preference");
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    Boolean bool = (Boolean) obj;
                    notificationsPreferenceUiLogic2.f29113f = bool.booleanValue();
                    this$0.m15535n4().m14691b();
                    if (!bool.booleanValue()) {
                        preferenceCategory3.m3428V(profileMainNotificationPreferenceLayout2);
                        preferenceCategory3.m3428V(preference2);
                        preferenceCategory3.m3428V(preference3);
                        preferenceCategory3.m3428V(switchPreference7);
                        return true;
                    }
                    List<Integer> list = this$0.f28345w;
                    if (list == null) {
                        Intrinsics.m32189r("profileStatusNotificationPreferences");
                        throw null;
                    }
                    if (list.size() == 0) {
                        String[] strArr2 = this$0.f28340r;
                        if (strArr2 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        int length = strArr2.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            String str = strArr2[i4];
                            int i6 = i5 + 1;
                            List<Integer> list2 = this$0.f28345w;
                            if (list2 == null) {
                                Intrinsics.m32189r("profileStatusNotificationPreferences");
                                throw null;
                            }
                            list2.add(Integer.valueOf(i5));
                            i4++;
                            i5 = i6;
                        }
                        this$0.m15535n4().m14695f();
                        this$0.m15541t4();
                    }
                    if (profileTypeNotificationPreferences.size() == 0) {
                        Iterator it2 = typesValues.iterator();
                        while (it2.hasNext()) {
                            profileTypeNotificationPreferences.add(Long.valueOf(Long.parseLong((String) it2.next())));
                        }
                        this$0.m15535n4().m14696g();
                        this$0.m15543v4();
                    }
                    preferenceCategory3.m3424R(profileMainNotificationPreferenceLayout2);
                    preferenceCategory3.m3424R(preference2);
                    preferenceCategory3.m3424R(preference3);
                    preferenceCategory3.m3424R(switchPreference7);
                    return true;
                }
            };
            switchPreference2.m3461R(z2);
            notificationsPreferenceFragment = this;
            switchPreference2.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    switch (i3) {
                        case 0:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$0 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic2.f29114g = ((Boolean) obj).booleanValue();
                            this$0.m15535n4().m14692c();
                            return true;
                        case 1:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic3 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$02 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic3, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$02, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic3.f29115h = ((Boolean) obj).booleanValue();
                            this$02.m15535n4().m14697h();
                            return true;
                        case 2:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic4 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$03 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr3 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic4, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic4.f29116i = ((Boolean) obj).booleanValue();
                            this$03.m15535n4().m14698i();
                            return true;
                        case 3:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic5 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$04 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr4 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic5, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic5.f29117j = ((Boolean) obj).booleanValue();
                            this$04.m15535n4().m14690a();
                            return true;
                        default:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic6 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$05 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic6, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$05, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic6.f29118k = ((Boolean) obj).booleanValue();
                            this$05.m15535n4().m14693d();
                            return true;
                    }
                }
            };
            switchPreference3.m3461R(z3);
            final int i4 = 1;
            switchPreference3.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    switch (i4) {
                        case 0:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$0 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic2.f29114g = ((Boolean) obj).booleanValue();
                            this$0.m15535n4().m14692c();
                            return true;
                        case 1:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic3 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$02 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic3, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$02, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic3.f29115h = ((Boolean) obj).booleanValue();
                            this$02.m15535n4().m14697h();
                            return true;
                        case 2:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic4 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$03 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr3 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic4, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic4.f29116i = ((Boolean) obj).booleanValue();
                            this$03.m15535n4().m14698i();
                            return true;
                        case 3:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic5 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$04 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr4 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic5, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic5.f29117j = ((Boolean) obj).booleanValue();
                            this$04.m15535n4().m14690a();
                            return true;
                        default:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic6 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$05 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic6, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$05, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic6.f29118k = ((Boolean) obj).booleanValue();
                            this$05.m15535n4().m14693d();
                            return true;
                    }
                }
            };
            switchPreference4.m3461R(z4);
            final int i5 = 2;
            switchPreference4.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    switch (i5) {
                        case 0:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$0 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic2.f29114g = ((Boolean) obj).booleanValue();
                            this$0.m15535n4().m14692c();
                            return true;
                        case 1:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic3 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$02 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic3, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$02, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic3.f29115h = ((Boolean) obj).booleanValue();
                            this$02.m15535n4().m14697h();
                            return true;
                        case 2:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic4 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$03 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr3 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic4, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic4.f29116i = ((Boolean) obj).booleanValue();
                            this$03.m15535n4().m14698i();
                            return true;
                        case 3:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic5 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$04 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr4 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic5, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic5.f29117j = ((Boolean) obj).booleanValue();
                            this$04.m15535n4().m14690a();
                            return true;
                        default:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic6 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$05 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic6, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$05, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic6.f29118k = ((Boolean) obj).booleanValue();
                            this$05.m15535n4().m14693d();
                            return true;
                    }
                }
            };
            switchPreference5.m3461R(z5);
            final int i6 = 3;
            switchPreference5.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    switch (i6) {
                        case 0:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$0 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic2.f29114g = ((Boolean) obj).booleanValue();
                            this$0.m15535n4().m14692c();
                            return true;
                        case 1:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic3 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$02 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic3, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$02, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic3.f29115h = ((Boolean) obj).booleanValue();
                            this$02.m15535n4().m14697h();
                            return true;
                        case 2:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic4 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$03 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr3 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic4, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic4.f29116i = ((Boolean) obj).booleanValue();
                            this$03.m15535n4().m14698i();
                            return true;
                        case 3:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic5 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$04 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr4 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic5, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic5.f29117j = ((Boolean) obj).booleanValue();
                            this$04.m15535n4().m14690a();
                            return true;
                        default:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic6 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$05 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic6, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$05, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic6.f29118k = ((Boolean) obj).booleanValue();
                            this$05.m15535n4().m14693d();
                            return true;
                    }
                }
            };
            switchPreference6.m3461R(z6);
            final int i7 = 4;
            switchPreference6.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.k
                @Override // androidx.preference.Preference.OnPreferenceChangeListener
                /* renamed from: a */
                public final boolean mo3394a(Preference preference, Object obj) {
                    switch (i7) {
                        case 0:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$0 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic2, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$0, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic2.f29114g = ((Boolean) obj).booleanValue();
                            this$0.m15535n4().m14692c();
                            return true;
                        case 1:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic3 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$02 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic3, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$02, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic3.f29115h = ((Boolean) obj).booleanValue();
                            this$02.m15535n4().m14697h();
                            return true;
                        case 2:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic4 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$03 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr3 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic4, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$03, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic4.f29116i = ((Boolean) obj).booleanValue();
                            this$03.m15535n4().m14698i();
                            return true;
                        case 3:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic5 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$04 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr4 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic5, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$04, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic5.f29117j = ((Boolean) obj).booleanValue();
                            this$04.m15535n4().m14690a();
                            return true;
                        default:
                            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic6 = notificationsPreferenceUiLogic;
                            NotificationsPreferenceFragment this$05 = notificationsPreferenceFragment;
                            KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                            Intrinsics.m32179h(notificationsPreferenceUiLogic6, "$notificationsPreferenceUiLogic");
                            Intrinsics.m32179h(this$05, "this$0");
                            Intrinsics.m32179h(preference, "preference");
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            notificationsPreferenceUiLogic6.f29118k = ((Boolean) obj).booleanValue();
                            this$05.m15535n4().m14693d();
                            return true;
                    }
                }
            };
            if (!z) {
                preferenceCategory.m3428V(profileMainNotificationPreferenceLayout);
                preferenceCategory.m3428V(mo3340t0);
                preferenceCategory.m3428V(mo3340t02);
                preferenceCategory.m3428V(switchPreference2);
            }
        }
        RelativeLayout resultLayout = (RelativeLayout) notificationsPreferenceFragment.m15533e4(C2507R.id.resultLayout);
        Intrinsics.m32178g(resultLayout, "resultLayout");
        ViewsKt.m16378k(resultLayout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: a */
    public void mo14701a() {
        ProgressBar progress_bar = (ProgressBar) m15533e4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: b */
    public void mo14702b() {
        ProgressBar progress_bar = (ProgressBar) m15533e4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: c */
    public void mo14703c() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Nullable
    /* renamed from: e4 */
    public View m15533e4(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28336D;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: h */
    public void mo14704h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28337o.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPreferenceView
    /* renamed from: j */
    public void mo14705j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28337o.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    /* renamed from: m4 */
    public final void m15534m4() {
        List<Integer> list = this.f28345w;
        if (list == null) {
            Intrinsics.m32189r("profileStatusNotificationPreferences");
            throw null;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            boolean[] zArr = this.f28344v;
            if (zArr == null) {
                Intrinsics.m32189r("selectionProfileLists");
                throw null;
            }
            zArr[intValue] = true;
            i2 = i3;
        }
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14094J(this);
        getMvpDelegate().onCreate(bundle);
        String[] stringArray = getResources().getStringArray(C2507R.array.profile_lists);
        Intrinsics.m32178g(stringArray, "resources.getStringArray(R.array.profile_lists)");
        this.f28340r = stringArray;
        String[] stringArray2 = getResources().getStringArray(C2507R.array.profile_lists_values);
        Intrinsics.m32178g(stringArray2, "resources.getStringArray…ray.profile_lists_values)");
        this.f28341s = stringArray2;
        m15535n4().m14694e();
        m3418u3(C2507R.xml.preference_notifications, str);
    }

    /* renamed from: n4 */
    public final NotificationsPreferencePresenter m15535n4() {
        return (NotificationsPreferencePresenter) this.f28339q.getValue(this, f28332E[0]);
    }

    /* renamed from: o4 */
    public final void m15536o4() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        boolean[] zArr = this.f28344v;
        if (zArr == null) {
            Intrinsics.m32189r("selectionProfileLists");
            throw null;
        }
        if (!ArraysKt.m31965o(zArr, false)) {
            boolean[] zArr2 = this.f28344v;
            if (zArr2 == null) {
                Intrinsics.m32189r("selectionProfileLists");
                throw null;
            }
            int length = zArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                boolean[] zArr3 = this.f28344v;
                if (zArr3 == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                zArr3[i2] = false;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
        builder.mo377k(C2507R.string.select_lists);
        String[] strArr = this.f28340r;
        if (strArr == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        boolean[] zArr4 = this.f28344v;
        if (zArr4 == null) {
            Intrinsics.m32189r("selectionProfileLists");
            throw null;
        }
        builder.mo370d(strArr, zArr4, new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.j
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                NotificationsPreferenceFragment this$0 = NotificationsPreferenceFragment.this;
                KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$0, "this$0");
                boolean[] zArr5 = this$0.f28344v;
                if (zArr5 != null) {
                    zArr5[i3] = z;
                } else {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
            }
        });
        AlertDialog create = builder.setPositiveButton(C2507R.string.choose, null).setNegativeButton(C2507R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                NotificationsPreferenceFragment this$0 = NotificationsPreferenceFragment.this;
                KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15534m4();
            }
        }).mo373g(new DialogInterface.OnDismissListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NotificationsPreferenceFragment this$0 = NotificationsPreferenceFragment.this;
                KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15534m4();
                this$0.m15538q4();
            }
        }).create();
        Intrinsics.m32178g(create, "builder.setTitle(R.strin…  }\n            .create()");
        create.show();
        create.m365g(-1).setOnClickListener(new ViewOnClickListenerC2635k(this, create, context, 4));
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((TextView) inflate.findViewById(C2507R.id.title)).setText(getString(C2507R.string.notifications_settings));
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 5));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28336D.clear();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        super.onViewCreated(view, bundle);
    }

    /* renamed from: p4 */
    public final void m15537p4(@NotNull Preference preference, @NotNull final CharSequence[] charSequenceArr, @NotNull final CharSequence[] charSequenceArr2, @NotNull Set<?> set) {
        preference.mo3362M(CollectionsKt.m31989B(set, ", ", null, null, 0, null, new Function1<Object, CharSequence>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.NotificationsPreferenceFragment$setSummary$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(Object obj) {
                CharSequence[] charSequenceArr3 = charSequenceArr;
                CharSequence[] charSequenceArr4 = charSequenceArr2;
                int length = charSequenceArr4.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (Intrinsics.m32174c(charSequenceArr4[i2], String.valueOf(obj))) {
                        break;
                    }
                    i2++;
                }
                return charSequenceArr3[i2];
            }
        }, 30, null));
    }

    /* renamed from: q4 */
    public final void m15538q4() {
        if (m15535n4().f26450c.f29112e) {
            ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout = this.f28347y;
            if (profileMainNotificationPreferenceLayout != null) {
                profileMainNotificationPreferenceLayout.m15553R(3);
                return;
            } else {
                Intrinsics.m32189r("profileMainNotificationPreference");
                throw null;
            }
        }
        List<Integer> list = this.f28345w;
        if (list == null) {
            Intrinsics.m32189r("profileStatusNotificationPreferences");
            throw null;
        }
        int size = list.size();
        String[] strArr = this.f28340r;
        if (strArr == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        if (size == strArr.length) {
            ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout2 = this.f28347y;
            if (profileMainNotificationPreferenceLayout2 != null) {
                profileMainNotificationPreferenceLayout2.m15553R(1);
                return;
            } else {
                Intrinsics.m32189r("profileMainNotificationPreference");
                throw null;
            }
        }
        ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout3 = this.f28347y;
        if (profileMainNotificationPreferenceLayout3 != null) {
            profileMainNotificationPreferenceLayout3.m15553R(2);
        } else {
            Intrinsics.m32189r("profileMainNotificationPreference");
            throw null;
        }
    }

    /* renamed from: r4 */
    public final void m15539r4() {
        boolean z = m15535n4().f26450c.f29112e;
        SwitchPreference switchPreference = this.f28335C;
        if (switchPreference != null) {
            switchPreference.m3373N(!z);
        } else {
            Intrinsics.m32189r("isFirstEpisodeNotificationEnabledPreference");
            throw null;
        }
    }

    /* renamed from: s4 */
    public final void m15540s4() {
        boolean z = m15535n4().f26450c.f29112e;
        Preference preference = this.f28334B;
        if (preference != null) {
            preference.m3373N(z);
        } else {
            Intrinsics.m32189r("profileReleaseTypeNotificationPreference");
            throw null;
        }
    }

    /* renamed from: t4 */
    public final void m15541t4() {
        Set<Integer> set = m15535n4().f26450c.f29110c;
        boolean z = m15535n4().f26450c.f29112e;
        int size = set.size();
        String[] strArr = this.f28340r;
        if (strArr == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        if (size == strArr.length || z) {
            PreferenceCategory preferenceCategory = this.f28346x;
            if (preferenceCategory == null) {
                Intrinsics.m32189r("episodesCategory");
                throw null;
            }
            Preference preference = this.f28348z;
            if (preference != null) {
                preferenceCategory.m3428V(preference);
                return;
            } else {
                Intrinsics.m32189r("profileStatusNotificationPreference");
                throw null;
            }
        }
        PreferenceCategory preferenceCategory2 = this.f28346x;
        if (preferenceCategory2 == null) {
            Intrinsics.m32189r("episodesCategory");
            throw null;
        }
        Preference preference2 = this.f28348z;
        if (preference2 == null) {
            Intrinsics.m32189r("profileStatusNotificationPreference");
            throw null;
        }
        preferenceCategory2.m3424R(preference2);
        Preference preference3 = this.f28348z;
        if (preference3 == null) {
            Intrinsics.m32189r("profileStatusNotificationPreference");
            throw null;
        }
        String[] strArr2 = this.f28340r;
        if (strArr2 == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        String[] strArr3 = this.f28341s;
        if (strArr3 != null) {
            m15537p4(preference3, strArr2, strArr3, set);
        } else {
            Intrinsics.m32189r("profileListsValues");
            throw null;
        }
    }

    /* renamed from: u4 */
    public final void m15542u4(boolean z, Collection<Integer> collection) {
        if (m15535n4().f26450c.f29112e != z) {
            m15535n4().f26450c.f29112e = z;
            m15535n4().m14699j();
        }
        if (collection != null) {
            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic = m15535n4().f26450c;
            Objects.requireNonNull(notificationsPreferenceUiLogic);
            notificationsPreferenceUiLogic.f29110c.clear();
            notificationsPreferenceUiLogic.f29110c.addAll(collection);
            m15535n4().m14695f();
        }
        m15541t4();
        m15543v4();
        m15540s4();
        m15539r4();
    }

    /* renamed from: v4 */
    public final void m15543v4() {
        Set<Long> set = m15535n4().f26450c.f29111d;
        boolean z = m15535n4().f26450c.f29112e;
        Preference preference = this.f28333A;
        if (preference == null) {
            Intrinsics.m32189r("profileTypeNotificationPreference");
            throw null;
        }
        preference.m3373N(!z);
        int size = set.size();
        String[] strArr = this.f28343u;
        if (strArr == null) {
            Intrinsics.m32189r("typesValues");
            throw null;
        }
        if (size == strArr.length) {
            Preference preference2 = this.f28333A;
            if (preference2 != null) {
                preference2.mo3362M(getString(C2507R.string.notifications_receive_from_all_types));
                return;
            } else {
                Intrinsics.m32189r("profileTypeNotificationPreference");
                throw null;
            }
        }
        Preference preference3 = this.f28333A;
        if (preference3 == null) {
            Intrinsics.m32189r("profileTypeNotificationPreference");
            throw null;
        }
        String[] strArr2 = this.f28342t;
        if (strArr2 == null) {
            Intrinsics.m32189r("types");
            throw null;
        }
        if (strArr != null) {
            m15537p4(preference3, strArr2, strArr, set);
        } else {
            Intrinsics.m32189r("typesValues");
            throw null;
        }
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(button, "CHOOSE_STATUS_CONTINUE_BUTTON")) {
            if (!Intrinsics.m32174c(button, "CHOOSE_TYPE_CONTINUE_BUTTON")) {
                return true;
            }
            Serializable serializableExtra = intent.getSerializableExtra("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE");
            ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
            if (arrayList == null) {
                return true;
            }
            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic = m15535n4().f26450c;
            Objects.requireNonNull(notificationsPreferenceUiLogic);
            notificationsPreferenceUiLogic.f29111d.clear();
            notificationsPreferenceUiLogic.f29111d.addAll(arrayList);
            m15535n4().m14696g();
            m15543v4();
            return true;
        }
        ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("PROFILE_STATUS_NOTIFICATION_PREFERENCES_VALUE");
        boolean booleanExtra = intent.getBooleanExtra("IS_RELEASE_TYPE_NOTIFICATIONS_ENABLED_VALUE", false);
        if (m15535n4().f26450c.f29112e != booleanExtra) {
            m15535n4().f26450c.f29112e = booleanExtra;
            m15535n4().m14699j();
        }
        if (integerArrayListExtra != null) {
            NotificationsPreferenceUiLogic notificationsPreferenceUiLogic2 = m15535n4().f26450c;
            Objects.requireNonNull(notificationsPreferenceUiLogic2);
            notificationsPreferenceUiLogic2.f29110c.clear();
            notificationsPreferenceUiLogic2.f29110c.addAll(integerArrayListExtra);
            m15535n4().m14695f();
        }
        m15541t4();
        m15543v4();
        m15540s4();
        m15539r4();
        return true;
    }
}
