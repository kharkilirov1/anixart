package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.room.util.C0576a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.PlaybackPreferenceView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: PlaybackPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/PlaybackPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/PlaybackPreferenceView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PlaybackPreferenceFragment extends BasePreferenceFragment implements PlaybackPreferenceView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f28353r = {C2052a.m12277l(PlaybackPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/MainPreferencePresenter;", 0)};

    /* renamed from: o */
    @Inject
    public Lazy<MainPreferencePresenter> f28354o;

    /* renamed from: p */
    @NotNull
    public final MoxyKtxDelegate f28355p;

    /* renamed from: q */
    @NotNull
    public Map<Integer, View> f28356q = new LinkedHashMap();

    /* compiled from: PlaybackPreferenceFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/PlaybackPreferenceFragment$Companion;", "", "", "KODIK_VIDEO_QUALITY_TAG", "Ljava/lang/String;", "PLAYER_REWIND_TIME_TAG", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public PlaybackPreferenceFragment() {
        Function0<MainPreferencePresenter> function0 = new Function0<MainPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.PlaybackPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MainPreferencePresenter invoke() {
                Lazy<MainPreferencePresenter> lazy = PlaybackPreferenceFragment.this.f28354o;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28355p = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(MainPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    /* renamed from: e4 */
    public static boolean m15544e4(final PlaybackPreferenceFragment this$0, final SwitchPreference rememberThirdPartyPlatform, Preference preference, final Object obj) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(rememberThirdPartyPlatform, "$rememberThirdPartyPlatform");
        Intrinsics.m32179h(preference, "preference");
        if (!(obj instanceof Boolean)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this$0.m15545m4().f26543a.f25344a.getBoolean("SEARCH_VIDEO_TPP", false)) {
            this$0.m15545m4().f26543a.m14055K(((Boolean) obj).booleanValue());
            return true;
        }
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            this$0.m15545m4().f26543a.m14055K(bool.booleanValue());
            rememberThirdPartyPlatform.m3461R(false);
            return false;
        }
        Context context = this$0.getContext();
        if (context == null) {
            return false;
        }
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
        builder.f30150b = 3;
        String string = this$0.getString(C2507R.string.search_video_title);
        Intrinsics.m32178g(string, "getString(R.string.search_video_title)");
        builder.m16319k(string);
        String string2 = this$0.getString(C2507R.string.search_video_confirm_desc);
        Intrinsics.m32178g(string2, "getString(R.string.search_video_confirm_desc)");
        builder.m16310b(string2);
        String string3 = this$0.getString(C2507R.string.cancel);
        Intrinsics.m32178g(string3, "getString(R.string.cancel)");
        builder.m16312d(string3);
        String string4 = this$0.getString(C2507R.string.yes);
        Intrinsics.m32178g(string4, "getString(R.string.yes)");
        builder.m16316h(string4);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.PlaybackPreferenceFragment$initializePreferences$9$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                PlaybackPreferenceFragment playbackPreferenceFragment = PlaybackPreferenceFragment.this;
                KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                playbackPreferenceFragment.m15545m4().f26543a.m14056L(true);
                Prefs prefs = PlaybackPreferenceFragment.this.m15545m4().f26543a;
                Object isBind = obj;
                Intrinsics.m32178g(isBind, "isBind");
                prefs.m14055K(((Boolean) isBind).booleanValue());
                rememberThirdPartyPlatform.m3461R(true);
                return Unit.f63088a;
            }
        });
        builder.m16317i();
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28356q.clear();
    }

    /* renamed from: m4 */
    public final MainPreferencePresenter m15545m4() {
        return (MainPreferencePresenter) this.f28355p.getValue(this, f28353r[0]);
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14145r(this);
        getMvpDelegate().onCreate(bundle);
        m3418u3(C2507R.xml.preference_playback, str);
        PreferenceScreen preferenceScreen = this.f5025c.f5085g;
        Preference mo3340t0 = mo3340t0("sources");
        Intrinsics.m32176e(mo3340t0);
        PreferenceCategory preferenceCategory = (PreferenceCategory) mo3340t0;
        Preference mo3340t02 = mo3340t0("selected_player");
        Intrinsics.m32176e(mo3340t02);
        final ListPreference listPreference = (ListPreference) mo3340t02;
        Preference mo3340t03 = mo3340t0("selected_video_quality");
        Intrinsics.m32176e(mo3340t03);
        final ListPreference listPreference2 = (ListPreference) mo3340t03;
        Preference mo3340t04 = mo3340t0("selected_third_party_video_quality");
        Intrinsics.m32176e(mo3340t04);
        final ListPreference listPreference3 = (ListPreference) mo3340t04;
        Preference mo3340t05 = mo3340t0("selected_player_rewind_time");
        Intrinsics.m32176e(mo3340t05);
        Preference mo3340t06 = mo3340t0("selected_downloader");
        Intrinsics.m32176e(mo3340t06);
        final ListPreference listPreference4 = (ListPreference) mo3340t06;
        Preference mo3340t07 = mo3340t0("player_only_horizontal_orientation");
        Intrinsics.m32176e(mo3340t07);
        SwitchPreference switchPreference = (SwitchPreference) mo3340t07;
        Preference mo3340t08 = mo3340t0("auto_play");
        Intrinsics.m32176e(mo3340t08);
        SwitchPreference switchPreference2 = (SwitchPreference) mo3340t08;
        Preference mo3340t09 = mo3340t0("selected_kodik_video_quality");
        Intrinsics.m32176e(mo3340t09);
        Preference mo3340t010 = mo3340t0("remember_type_source");
        Intrinsics.m32176e(mo3340t010);
        SwitchPreference switchPreference3 = (SwitchPreference) mo3340t010;
        Preference mo3340t011 = mo3340t0("remember_third_party_platform");
        Intrinsics.m32176e(mo3340t011);
        SwitchPreference switchPreference4 = (SwitchPreference) mo3340t011;
        Preference mo3340t012 = mo3340t0("sources_separator");
        Intrinsics.m32176e(mo3340t012);
        if (m15545m4().f26543a.m14047C()) {
            preferenceScreen.m3428V(preferenceCategory);
            preferenceScreen.m3428V(mo3340t012);
        }
        if (!m15545m4().f26543a.m14067j()) {
            preferenceScreen.m3428V(preferenceCategory);
            preferenceScreen.m3428V(mo3340t012);
        }
        listPreference.mo3342V(m15545m4().f26543a.m14077t());
        final int i2 = 0;
        listPreference2.mo3342V(m15545m4().f26543a.f25344a.getInt("SELECTED_VIDEO_QUALITY", 0));
        listPreference3.mo3342V(m15545m4().f26543a.f25344a.getInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", 0));
        listPreference4.mo3342V(m15545m4().f26543a.f25344a.getInt("SELECTED_DOWNLOADER", 0));
        int m14076s = m15545m4().f26543a.m14076s();
        final int i3 = 1;
        mo3340t09.mo3362M(m14076s != 0 ? m14076s != 1 ? getString(C2507R.string.quality_high_title) : getString(C2507R.string.quality_medium_title) : getString(C2507R.string.quality_high_title));
        switchPreference.m3461R(m15545m4().f26543a.m14069l());
        switchPreference2.m3461R(m15545m4().f26543a.f25344a.getBoolean("AUTO_PLAY", false));
        switchPreference3.m3461R(m15545m4().f26543a.m14046B());
        switchPreference4.m3461R(m15545m4().f26543a.m14045A());
        listPreference.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.n
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i2) {
                    case 0:
                        ListPreference selectedPlayer = listPreference;
                        PlaybackPreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedPlayer, "$selectedPlayer");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = selectedPlayer.m3363R(obj.toString());
                        selectedPlayer.mo3342V(m3363R);
                        this$0.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_PLAYER", m3363R).apply();
                        break;
                    case 1:
                        ListPreference selectedVideoQuality = listPreference;
                        PlaybackPreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedVideoQuality, "$selectedVideoQuality");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = selectedVideoQuality.m3363R(obj.toString());
                        selectedVideoQuality.mo3342V(m3363R2);
                        this$02.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_VIDEO_QUALITY", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference selectedThirdPartyVideoQuality = listPreference;
                        PlaybackPreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedThirdPartyVideoQuality, "$selectedThirdPartyVideoQuality");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = selectedThirdPartyVideoQuality.m3363R(obj.toString());
                        selectedThirdPartyVideoQuality.mo3342V(m3363R3);
                        this$03.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", m3363R3).apply();
                        break;
                    default:
                        ListPreference selectedDownloader = listPreference;
                        PlaybackPreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedDownloader, "$selectedDownloader");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = selectedDownloader.m3363R(obj.toString());
                        selectedDownloader.mo3342V(m3363R4);
                        this$04.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_DOWNLOADER", m3363R4).apply();
                        break;
                }
                return false;
            }
        };
        listPreference2.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.n
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i3) {
                    case 0:
                        ListPreference selectedPlayer = listPreference2;
                        PlaybackPreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedPlayer, "$selectedPlayer");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = selectedPlayer.m3363R(obj.toString());
                        selectedPlayer.mo3342V(m3363R);
                        this$0.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_PLAYER", m3363R).apply();
                        break;
                    case 1:
                        ListPreference selectedVideoQuality = listPreference2;
                        PlaybackPreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedVideoQuality, "$selectedVideoQuality");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = selectedVideoQuality.m3363R(obj.toString());
                        selectedVideoQuality.mo3342V(m3363R2);
                        this$02.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_VIDEO_QUALITY", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference selectedThirdPartyVideoQuality = listPreference2;
                        PlaybackPreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedThirdPartyVideoQuality, "$selectedThirdPartyVideoQuality");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = selectedThirdPartyVideoQuality.m3363R(obj.toString());
                        selectedThirdPartyVideoQuality.mo3342V(m3363R3);
                        this$03.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", m3363R3).apply();
                        break;
                    default:
                        ListPreference selectedDownloader = listPreference2;
                        PlaybackPreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedDownloader, "$selectedDownloader");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = selectedDownloader.m3363R(obj.toString());
                        selectedDownloader.mo3342V(m3363R4);
                        this$04.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_DOWNLOADER", m3363R4).apply();
                        break;
                }
                return false;
            }
        };
        final int i4 = 2;
        listPreference3.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.n
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i4) {
                    case 0:
                        ListPreference selectedPlayer = listPreference3;
                        PlaybackPreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedPlayer, "$selectedPlayer");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = selectedPlayer.m3363R(obj.toString());
                        selectedPlayer.mo3342V(m3363R);
                        this$0.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_PLAYER", m3363R).apply();
                        break;
                    case 1:
                        ListPreference selectedVideoQuality = listPreference3;
                        PlaybackPreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedVideoQuality, "$selectedVideoQuality");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = selectedVideoQuality.m3363R(obj.toString());
                        selectedVideoQuality.mo3342V(m3363R2);
                        this$02.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_VIDEO_QUALITY", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference selectedThirdPartyVideoQuality = listPreference3;
                        PlaybackPreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedThirdPartyVideoQuality, "$selectedThirdPartyVideoQuality");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = selectedThirdPartyVideoQuality.m3363R(obj.toString());
                        selectedThirdPartyVideoQuality.mo3342V(m3363R3);
                        this$03.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", m3363R3).apply();
                        break;
                    default:
                        ListPreference selectedDownloader = listPreference3;
                        PlaybackPreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedDownloader, "$selectedDownloader");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = selectedDownloader.m3363R(obj.toString());
                        selectedDownloader.mo3342V(m3363R4);
                        this$04.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_DOWNLOADER", m3363R4).apply();
                        break;
                }
                return false;
            }
        };
        int m14070m = m15545m4().f26543a.m14070m();
        int i5 = m14070m / 60;
        int i6 = m14070m % 60;
        String m8e = i5 != 0 ? C0000a.m8e("", i5, " мин ") : "";
        if (i6 != 0) {
            m8e = C0000a.m8e(m8e, i6, " сек");
        }
        mo3340t05.mo3362M(m8e);
        mo3340t05.f4969g = new C2709o(this, i2);
        final int i7 = 3;
        listPreference4.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.n
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i7) {
                    case 0:
                        ListPreference selectedPlayer = listPreference4;
                        PlaybackPreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedPlayer, "$selectedPlayer");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = selectedPlayer.m3363R(obj.toString());
                        selectedPlayer.mo3342V(m3363R);
                        this$0.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_PLAYER", m3363R).apply();
                        break;
                    case 1:
                        ListPreference selectedVideoQuality = listPreference4;
                        PlaybackPreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedVideoQuality, "$selectedVideoQuality");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = selectedVideoQuality.m3363R(obj.toString());
                        selectedVideoQuality.mo3342V(m3363R2);
                        this$02.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_VIDEO_QUALITY", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference selectedThirdPartyVideoQuality = listPreference4;
                        PlaybackPreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedThirdPartyVideoQuality, "$selectedThirdPartyVideoQuality");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = selectedThirdPartyVideoQuality.m3363R(obj.toString());
                        selectedThirdPartyVideoQuality.mo3342V(m3363R3);
                        this$03.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", m3363R3).apply();
                        break;
                    default:
                        ListPreference selectedDownloader = listPreference4;
                        PlaybackPreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = PlaybackPreferenceFragment.f28353r;
                        Intrinsics.m32179h(selectedDownloader, "$selectedDownloader");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = selectedDownloader.m3363R(obj.toString());
                        selectedDownloader.mo3342V(m3363R4);
                        this$04.m15545m4().f26543a.f25344a.edit().putInt("SELECTED_DOWNLOADER", m3363R4).apply();
                        break;
                }
                return false;
            }
        };
        mo3340t09.f4969g = new C2709o(this, i3);
        switchPreference3.f4968f = new C2709o(this, i4);
        switchPreference4.f4968f = new C0919e(this, switchPreference4, 15);
        switchPreference.f4968f = new C2709o(this, i7);
        switchPreference2.f4968f = new C2709o(this, 4);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(getResources().getString(C2507R.string.settings_playback));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.resultLayout);
        Intrinsics.m32178g(relativeLayout, "rootView.resultLayout");
        ViewsKt.m16378k(relativeLayout);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 6));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28356q.clear();
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        System.out.println((Object) (str + ' ' + button + ' ' + intent));
        if (Intrinsics.m32174c(str, "KODIK_VIDEO_QUALITY_TAG")) {
            Preference mo3340t0 = mo3340t0("selected_kodik_video_quality");
            Intrinsics.m32176e(mo3340t0);
            int intExtra = intent.getIntExtra("SELECTED_KODIK_VIDEO_QUALITY_VALUE", 1);
            mo3340t0.mo3362M(intExtra != 0 ? intExtra != 1 ? getString(C2507R.string.quality_high_title) : getString(C2507R.string.quality_medium_title) : getString(C2507R.string.quality_high_title));
            C0576a.m4125x(m15545m4().f26543a.f25344a, "SELECTED_KODIK_VIDEO_QUALITY", intExtra);
            return true;
        }
        if (!Intrinsics.m32174c(str, "PLAYER_REWIND_TIME_TAG")) {
            return false;
        }
        Preference mo3340t02 = mo3340t0("selected_player_rewind_time");
        Intrinsics.m32176e(mo3340t02);
        int intExtra2 = intent.getIntExtra("SELECTED_PLAYER_REWIND_TIME", 0);
        if (intExtra2 < 5) {
            return true;
        }
        int i2 = intExtra2 / 60;
        int i3 = intExtra2 % 60;
        String m8e = i2 != 0 ? C0000a.m8e("", i2, " мин ") : "";
        if (i3 != 0) {
            m8e = C0000a.m8e(m8e, i3, " сек");
        }
        mo3340t02.mo3362M(m8e);
        C0576a.m4125x(m15545m4().f26543a.f25344a, "PLAYER_REWIND_TIME", intExtra2);
        return true;
    }
}
