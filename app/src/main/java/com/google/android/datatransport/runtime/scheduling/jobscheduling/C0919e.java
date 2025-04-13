package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.PopupMenu;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.mukesh.OnOtpCompletionListener;
import com.mukesh.OtpView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ProfileProcessDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.auth.RestoreVerifyFragment;
import com.swiftsoft.anixartd.p015ui.fragment.auth.VerifyFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.discover.DiscoverFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.MainPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.NotificationsPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.PlaybackPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfilePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileChangeLoginHistoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.streaming.ReleaseStreamingPlatformFragment;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter;
import com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0919e implements SynchronizationGuard.CriticalSection, ListenerSet.Event, ListenerSet.IterationFinishedEvent, OnOtpCompletionListener, SwipeRefreshLayout.OnRefreshListener, Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener, PopupMenu.OnMenuItemClickListener, TabTitlesLayoutView.OnScrollChangedListener {

    /* renamed from: b */
    public final /* synthetic */ int f9330b;

    /* renamed from: c */
    public final /* synthetic */ Object f9331c;

    /* renamed from: d */
    public final /* synthetic */ Object f9332d;

    public /* synthetic */ C0919e(Object obj, Object obj2, int i2) {
        this.f9330b = i2;
        this.f9331c = obj;
        this.f9332d = obj2;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, Object obj) {
        switch (this.f9330b) {
            case 13:
                ListPreference nightMode = (ListPreference) this.f9331c;
                MainPreferenceFragment this$0 = (MainPreferenceFragment) this.f9332d;
                KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                Intrinsics.m32179h(nightMode, "$nightMode");
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(preference, "preference");
                int m3363R = nightMode.m3363R(obj.toString());
                nightMode.mo3342V(m3363R);
                if (m3363R == 0) {
                    AppCompatDelegate.m380z(1);
                } else if (m3363R == 1) {
                    AppCompatDelegate.m380z(2);
                } else if (m3363R == 2) {
                    AppCompatDelegate.m380z(-1);
                } else if (m3363R == 3) {
                    AppCompatDelegate.m380z(3);
                }
                C0576a.m4125x(this$0.m15532e4().f26543a.f25344a, "NIGHT_MODE", m3363R);
                return false;
            default:
                return PlaybackPreferenceFragment.m15544e4((PlaybackPreferenceFragment) this.f9331c, (SwitchPreference) this.f9332d, preference, obj);
        }
    }

    @Override // com.mukesh.OnOtpCompletionListener
    /* renamed from: b */
    public void mo5566b(String str) {
        InputMethodManager inputMethodManager;
        switch (this.f9330b) {
            case 10:
                RestoreVerifyFragment this$0 = (RestoreVerifyFragment) this.f9331c;
                View view = (View) this.f9332d;
                RestoreVerifyFragment.Companion companion = RestoreVerifyFragment.f27798l;
                Intrinsics.m32179h(this$0, "this$0");
                Context context = this$0.getContext();
                Object systemService = context != null ? context.getSystemService("input_method") : null;
                inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                this$0.m15441A3().m14212b(this$0.f27803g, this$0.f27804h, this$0.f27805i, String.valueOf(((OtpView) view.findViewById(C2507R.id.code_otp)).getText()));
                break;
            default:
                VerifyFragment this$02 = (VerifyFragment) this.f9331c;
                View view2 = (View) this.f9332d;
                VerifyFragment.Companion companion2 = VerifyFragment.f27861m;
                Intrinsics.m32179h(this$02, "this$0");
                Context context2 = this$02.getContext();
                Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                inputMethodManager = systemService2 instanceof InputMethodManager ? (InputMethodManager) systemService2 : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                }
                this$02.m15446n3().m14268b(this$02.f27866e, this$02.f27867f, this$02.f27868g, this$02.f27869h, this$02.f27870i, this$02.f27871j, String.valueOf(((OtpView) view2.findViewById(C2507R.id.code_otp)).getText()));
                break;
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        switch (this.f9330b) {
            case 14:
                NotificationsPreferenceFragment this$0 = (NotificationsPreferenceFragment) this.f9331c;
                Set profileTypeNotificationPreferences = (Set) this.f9332d;
                KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(profileTypeNotificationPreferences, "$profileTypeNotificationPreferences");
                ChooseTypeDialogFragment.Companion companion = ChooseTypeDialogFragment.f27693j;
                String[] strArr = this$0.f28342t;
                if (strArr == null) {
                    Intrinsics.m32189r("types");
                    throw null;
                }
                String[] strArr2 = this$0.f28343u;
                if (strArr2 != null) {
                    companion.m15432a(strArr, strArr2, new ArrayList<>(profileTypeNotificationPreferences), false).show(this$0.getChildFragmentManager(), "CHOOSE_TYPE_TAG");
                    return true;
                }
                Intrinsics.m32189r("typesValues");
                throw null;
            default:
                ProfilePreferenceFragment.m15546e4((ProfilePreferenceFragment) this.f9331c, (Preference) this.f9332d, preference);
                return true;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.OnScrollChangedListener
    /* renamed from: d */
    public void mo5567d() {
        DivTabsBinder this$0 = (DivTabsBinder) this.f9331c;
        Div2View divView = (Div2View) this.f9332d;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(divView, "$divView");
        this$0.f32646f.mo16566a(divView);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    /* renamed from: e */
    public void mo5568e(Object obj, FlagSet flagSet) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.mo6028E((Player) this.f9332d, new AnalyticsListener.Events(flagSet, ((AnalyticsCollector) this.f9331c).f10102f));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f9330b) {
            case 0:
                ((Uploader) this.f9331c).f9291c.mo5580D((Iterable) this.f9332d);
                break;
            default:
                Uploader uploader = (Uploader) this.f9331c;
                Map map = (Map) this.f9332d;
                Objects.requireNonNull(uploader);
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    uploader.f9297i.mo5579e(((Integer) r3.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f9330b) {
            case 2:
                ((AnalyticsListener) obj).mo6025B((AnalyticsListener.EventTime) this.f9331c, (Metadata) this.f9332d);
                break;
            case 3:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f9331c;
                VideoSize videoSize = (VideoSize) this.f9332d;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6030G(eventTime, videoSize);
                analyticsListener.mo6052b(eventTime, videoSize.f14901b, videoSize.f14902c, videoSize.f14903d, videoSize.f14904e);
                break;
            case 4:
                ((AnalyticsListener) obj).mo6068j((AnalyticsListener.EventTime) this.f9331c, (PlaybackException) this.f9332d);
                break;
            case 5:
            default:
                ((AnalyticsListener) obj).mo6071k0((AnalyticsListener.EventTime) this.f9331c, (Player.Commands) this.f9332d);
                break;
            case 6:
                ((AnalyticsListener) obj).mo6090x((AnalyticsListener.EventTime) this.f9331c, (TracksInfo) this.f9332d);
                break;
            case 7:
                ((AnalyticsListener) obj).mo6085s((AnalyticsListener.EventTime) this.f9331c, (MediaMetadata) this.f9332d);
                break;
            case 8:
                ((AnalyticsListener) obj).mo6080p((AnalyticsListener.EventTime) this.f9331c, (PlaybackParameters) this.f9332d);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f9330b) {
            case 17:
                ProfileFragment this$0 = (ProfileFragment) this.f9331c;
                Profile profile = (Profile) this.f9332d;
                ProfileFragment.Companion companion = ProfileFragment.f28458k;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(profile, "$profile");
                switch (menuItem.getItemId()) {
                    case C2507R.id.block /* 2131361941 */:
                        if (!profile.getIsBlocked()) {
                            this$0.mo14846H2();
                            break;
                        } else {
                            ((RelativeLayout) this$0.m15560A3(C2507R.id.more)).setClickable(false);
                            this$0.m15561c4().m14827i();
                            break;
                        }
                    case C2507R.id.login_history /* 2131362447 */:
                        FragmentNavigation m15437u3 = this$0.m15437u3();
                        ProfileChangeLoginHistoryFragment.Companion companion2 = ProfileChangeLoginHistoryFragment.f28447i;
                        long id2 = profile.getId();
                        Objects.requireNonNull(companion2);
                        ProfileChangeLoginHistoryFragment profileChangeLoginHistoryFragment = new ProfileChangeLoginHistoryFragment();
                        Bundle bundle = new Bundle();
                        bundle.putLong("PROFILE_ID", id2);
                        profileChangeLoginHistoryFragment.setArguments(bundle);
                        m15437u3.mo15324d2(profileChangeLoginHistoryFragment, null);
                        break;
                    case C2507R.id.report /* 2131362728 */:
                        if (!this$0.m15561c4().f26637b.m14083z()) {
                            this$0.m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(profile, 5), null);
                            break;
                        } else {
                            Dialogs.f30143a.m16305b(this$0);
                            break;
                        }
                    case C2507R.id.share /* 2131362809 */:
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", this$0.getString(C2507R.string.share_profile_text, profile.getLogin(), Long.valueOf(this$0.f28460d)));
                        this$0.startActivity(Intent.createChooser(intent, this$0.getString(C2507R.string.text_share)));
                        break;
                }
                if (Intrinsics.m32174c(menuItem.getTitle(), this$0.getString(C2507R.string.process))) {
                    long id3 = profile.getId();
                    String banReason = profile.getBanReason();
                    Long valueOf = Long.valueOf(profile.getBanExpires());
                    boolean isBanned = profile.getIsBanned();
                    ProfileProcessDialogFragment profileProcessDialogFragment = new ProfileProcessDialogFragment();
                    Bundle m4108g = C0576a.m4108g("PROFILE_ID_VALUE", id3);
                    if (banReason != null) {
                        m4108g.putString("BAN_REASON_VALUE", banReason);
                    }
                    if (valueOf != null) {
                        m4108g.putLong("BAN_EXPIRES_VALUE", valueOf.longValue());
                    }
                    m4108g.putBoolean("IS_BANNED_VALUE", isBanned);
                    profileProcessDialogFragment.setArguments(m4108g);
                    profileProcessDialogFragment.show(this$0.getChildFragmentManager(), "PROFILE_PROCESS_DIALOG_TAG");
                    break;
                }
                break;
            default:
                ReleaseFragment this$02 = (ReleaseFragment) this.f9331c;
                Release release = (Release) this.f9332d;
                ReleaseFragment.Companion companion3 = ReleaseFragment.f28714t;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(release, "$release");
                switch (menuItem.getItemId()) {
                    case C2507R.id.report /* 2131362728 */:
                        if (!this$02.m15619e4().m15015b()) {
                            ReleasePresenter m15619e4 = this$02.m15619e4();
                            Objects.requireNonNull(m15619e4);
                            m15619e4.getViewState().mo15040I3(release);
                            break;
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                    case C2507R.id.share /* 2131362809 */:
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.TEXT", this$02.getString(C2507R.string.share_release_text, this$02.m15619e4().f26944h.m15701a().getTitleRu(), Long.valueOf(this$02.f28719g)));
                        this$02.startActivity(Intent.createChooser(intent2, this$02.getString(C2507R.string.text_share)));
                        break;
                    case C2507R.id.shortcut /* 2131362812 */:
                        ReleasePresenter m15619e42 = this$02.m15619e4();
                        if (!m15619e42.m15014a()) {
                            m15619e42.getViewState().mo15065q1(m15619e42.f26944h.m15701a());
                            break;
                        } else {
                            m15619e42.getViewState().mo15043T2();
                            break;
                        }
                    case C2507R.id.watch /* 2131363142 */:
                        this$02.m15437u3().mo15324d2(ReleaseStreamingPlatformFragment.f28920i.m15655a(release.getId(), release), null);
                        break;
                }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f9331c;
        DiscoverFragment this$0 = (DiscoverFragment) this.f9332d;
        KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
        Intrinsics.m32179h(this$0, "this$0");
        LinearLayout error_layout = (LinearLayout) swipeRefreshLayout.findViewById(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16372e(error_layout);
        DiscoverPresenter m15492c4 = this$0.m15492c4();
        if (m15492c4.f26232e.f28956a) {
            if (m15492c4.m14544b()) {
                DiscoverPresenter.m14542c(m15492c4, false, false, 3);
            } else {
                DiscoverPresenter.m14542c(m15492c4, false, true, 1);
            }
        }
    }
}
