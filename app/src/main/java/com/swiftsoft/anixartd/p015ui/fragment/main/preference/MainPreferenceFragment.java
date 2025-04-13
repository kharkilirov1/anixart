package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.UpdateActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferenceView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/MainPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/MainPreferenceView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MainPreferenceFragment extends BasePreferenceFragment implements MainPreferenceView {

    /* renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f28327r = {C2052a.m12277l(MainPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/MainPreferencePresenter;", 0)};

    /* renamed from: o */
    @Inject
    public Lazy<MainPreferencePresenter> f28328o;

    /* renamed from: p */
    @NotNull
    public final MoxyKtxDelegate f28329p;

    /* renamed from: q */
    @NotNull
    public Map<Integer, View> f28330q = new LinkedHashMap();

    public MainPreferenceFragment() {
        Function0<MainPreferencePresenter> function0 = new Function0<MainPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.MainPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MainPreferencePresenter invoke() {
                Lazy<MainPreferencePresenter> lazy = MainPreferenceFragment.this.f28328o;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28329p = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(MainPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28330q.clear();
    }

    /* renamed from: e4 */
    public final MainPreferencePresenter m15532e4() {
        return (MainPreferencePresenter) this.f28329p.getValue(this, f28327r[0]);
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14084A(this);
        getMvpDelegate().onCreate(bundle);
        m3418u3(C2507R.xml.preference_main, str);
        PreferenceScreen preferenceScreen = this.f5025c.f5085g;
        Preference mo3340t0 = mo3340t0("night_mode");
        Intrinsics.m32176e(mo3340t0);
        ListPreference listPreference = (ListPreference) mo3340t0;
        Preference mo3340t02 = mo3340t0("notifications_preferences");
        Intrinsics.m32176e(mo3340t02);
        Preference mo3340t03 = mo3340t0("playback_preferences");
        Intrinsics.m32176e(mo3340t03);
        Preference mo3340t04 = mo3340t0("appearance_preferences");
        Intrinsics.m32176e(mo3340t04);
        Preference mo3340t05 = mo3340t0("data_preferences");
        Intrinsics.m32176e(mo3340t05);
        Preference mo3340t06 = mo3340t0("additional_preferences");
        Intrinsics.m32176e(mo3340t06);
        Preference mo3340t07 = mo3340t0("support_preferences");
        Intrinsics.m32176e(mo3340t07);
        Preference mo3340t08 = mo3340t0("rules_preferences");
        Intrinsics.m32176e(mo3340t08);
        Preference mo3340t09 = mo3340t0("update_preferences");
        Intrinsics.m32176e(mo3340t09);
        Preference mo3340t010 = mo3340t0("version_preferences");
        Intrinsics.m32176e(mo3340t010);
        int i2 = BuildConfig.f25343a;
        if (m15532e4().f26543a.m14083z()) {
            preferenceScreen.m3428V(mo3340t02);
            preferenceScreen.m3428V(mo3340t05);
        }
        if (!m15532e4().f26543a.f25344a.getBoolean("IS_API_ALT_AVAILABLE", true)) {
            String string = m15532e4().f26543a.f25344a.getString("API_ALT_URL", "https://api-s2.anixart.tv/");
            if (string == null) {
                string = "";
            }
            if (Intrinsics.m32174c(string, "https://api-s2.anixart.tv/") && !m15532e4().f26543a.m14082y()) {
                preferenceScreen.m3428V(mo3340t06);
            }
        }
        final int i3 = 0;
        listPreference.mo3342V(m15532e4().f26543a.f25344a.getInt("NIGHT_MODE", 0));
        List m31998K = CollectionsKt.m31998K("Выключена", "Включена");
        List m31998K2 = CollectionsKt.m31998K("0", "1");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            m31998K.add("Следовать настройкам системы");
            m31998K2.add("2");
        }
        if (i4 >= 28) {
            m31998K.add("В режиме энергосбережения");
            m31998K2.add("3");
        }
        Object[] array = m31998K.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        listPreference.mo3341T((CharSequence[]) array);
        Object[] array2 = m31998K2.toArray(new String[0]);
        Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        listPreference.f4921W = (CharSequence[]) array2;
        listPreference.f4968f = new C0919e(listPreference, this, 13);
        mo3340t02.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i3) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i5 = 1;
        mo3340t03.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i5) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i6 = 2;
        mo3340t04.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i6) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i7 = 3;
        mo3340t05.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i7) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i8 = 4;
        mo3340t06.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i8) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i9 = 5;
        mo3340t07.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i9) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i10 = 6;
        mo3340t08.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i10) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        final int i11 = 7;
        mo3340t09.f4969g = new Preference.OnPreferenceClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.g

            /* renamed from: c */
            public final /* synthetic */ MainPreferenceFragment f28406c;

            {
                this.f28406c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceClickListener
            /* renamed from: c */
            public final boolean mo3395c(Preference preference) {
                switch (i11) {
                    case 0:
                        MainPreferenceFragment this$0 = this.f28406c;
                        KProperty<Object>[] kPropertyArr = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15438c4().mo15324d2(new NotificationsPreferenceFragment(), null);
                        break;
                    case 1:
                        MainPreferenceFragment this$02 = this.f28406c;
                        KProperty<Object>[] kPropertyArr2 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15438c4().mo15324d2(new PlaybackPreferenceFragment(), null);
                        break;
                    case 2:
                        MainPreferenceFragment this$03 = this.f28406c;
                        KProperty<Object>[] kPropertyArr3 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15438c4().mo15324d2(new AppearancePreferenceFragment(), null);
                        break;
                    case 3:
                        MainPreferenceFragment this$04 = this.f28406c;
                        KProperty<Object>[] kPropertyArr4 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.m15438c4().mo15324d2(new DataPreferenceFragment(), null);
                        break;
                    case 4:
                        MainPreferenceFragment this$05 = this.f28406c;
                        KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$05, "this$0");
                        this$05.m15438c4().mo15324d2(new AdditionalPreferenceFragment(), null);
                        break;
                    case 5:
                        MainPreferenceFragment this$06 = this.f28406c;
                        KProperty<Object>[] kPropertyArr6 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$06, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел FAQ");
                        Common common = new Common();
                        Context requireContext = this$06.requireContext();
                        Intrinsics.m32178g(requireContext, "requireContext()");
                        StringBuilder sb = new StringBuilder();
                        sb.append(new Common().m16297b("https://anixart.tv", this$06.m15532e4().f26543a.m14082y()));
                        sb.append("/support?dark=");
                        Common common2 = new Common();
                        Context requireContext2 = this$06.requireContext();
                        Intrinsics.m32178g(requireContext2, "requireContext()");
                        sb.append(common2.m16299d(requireContext2));
                        common.m16300e(requireContext, sb.toString());
                        break;
                    case 6:
                        MainPreferenceFragment this$07 = this.f28406c;
                        KProperty<Object>[] kPropertyArr7 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$07, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Правила сообщества");
                        Common common3 = new Common();
                        Context requireContext3 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext3, "requireContext()");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new Common().m16297b("https://anixart.tv", this$07.m15532e4().f26543a.m14082y()));
                        sb2.append("/rules?dark=");
                        Common common4 = new Common();
                        Context requireContext4 = this$07.requireContext();
                        Intrinsics.m32178g(requireContext4, "requireContext()");
                        sb2.append(common4.m16299d(requireContext4));
                        common3.m16300e(requireContext3, sb2.toString());
                        break;
                    default:
                        MainPreferenceFragment this$08 = this.f28406c;
                        KProperty<Object>[] kPropertyArr8 = MainPreferenceFragment.f28327r;
                        Intrinsics.m32179h(this$08, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Проверить обновления");
                        this$08.startActivity(new Intent(this$08.getContext(), (Class<?>) UpdateActivity.class));
                        break;
                }
                return true;
            }
        };
        mo3340t010.mo3362M("Версия 8.2.3 Сборка 24111318");
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(getResources().getString(C2507R.string.settings));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.resultLayout);
        Intrinsics.m32178g(relativeLayout, "rootView.resultLayout");
        ViewsKt.m16378k(relativeLayout);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 4));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28330q.clear();
    }
}
