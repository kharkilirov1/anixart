package androidx.activity;

import android.graphics.Paint;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.inputmethod.C0273a;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C0945a;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.firebase.installations.FirebaseInstallations;
import com.skydoves.balloon.Balloon;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.UpdateActivity;
import com.swiftsoft.anixartd.p015ui.activity.kodik.KodikAdActivity;
import com.swiftsoft.anixartd.p015ui.fragment.auth.SignInFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.SnowfallView;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.Snowflake;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div2.Div;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.activity.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0042c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f235b;

    /* renamed from: c */
    public final /* synthetic */ Object f236c;

    public /* synthetic */ RunnableC0042c(Object obj, int i2) {
        this.f235b = i2;
        this.f236c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2;
        switch (this.f235b) {
            case 0:
                ((ComponentActivity) this.f236c).invalidateMenu();
                break;
            case 1:
                ComponentDialog.m305a((ComponentDialog) this.f236c);
                break;
            case 2:
            case 5:
            default:
                ((RewardedAd) this.f236c).m30759a();
                break;
            case 3:
                WorkInitializer workInitializer = (WorkInitializer) this.f236c;
                workInitializer.f9310d.mo5594b(new C0273a(workInitializer, 4));
                break;
            case 4:
                AnalyticsCollector analyticsCollector = (AnalyticsCollector) this.f236c;
                AnalyticsListener.EventTime m6011I = analyticsCollector.m6011I();
                C0945a c0945a = new C0945a(m6011I, i2);
                analyticsCollector.f10102f.put(1036, m6011I);
                ListenerSet<AnalyticsListener> listenerSet = analyticsCollector.f10103g;
                listenerSet.m7581d(1036, c0945a);
                listenerSet.m7580c();
                analyticsCollector.f10103g.m7582e();
                break;
            case 6:
                FirebaseInstallations firebaseInstallations = (FirebaseInstallations) this.f236c;
                Object obj = FirebaseInstallations.f23129m;
                firebaseInstallations.m12561b(false);
                break;
            case 7:
                UpdateActivity this$0 = (UpdateActivity) this.f236c;
                KProperty<Object>[] kPropertyArr = UpdateActivity.f27474h;
                Intrinsics.m32179h(this$0, "this$0");
                try {
                    ((LottieAnimationView) this$0.m15337s4(C2507R.id.logo)).m4644k();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                KodikAdActivity this$02 = (KodikAdActivity) this.f236c;
                KodikAdActivity.Companion companion = KodikAdActivity.f27523i;
                Intrinsics.m32179h(this$02, "this$0");
                try {
                    ((AppCompatTextView) this$02.m15342s4(C2507R.id.state)).setSelected(true);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case 9:
                SignInFragment this$03 = (SignInFragment) this.f236c;
                KProperty<Object>[] kPropertyArr2 = SignInFragment.f27811h;
                Intrinsics.m32179h(this$03, "this$0");
                try {
                    ((LottieAnimationView) this$03.m15442A3(C2507R.id.logo)).m4644k();
                    break;
                } catch (Exception unused3) {
                    return;
                }
            case 10:
                EpisodesFragment this$04 = (EpisodesFragment) this.f236c;
                EpisodesFragment.Companion companion2 = EpisodesFragment.f28080m;
                Intrinsics.m32179h(this$04, "this$0");
                try {
                    ((AppCompatTextView) this$04.m15494A3(C2507R.id.state)).setSelected(true);
                    break;
                } catch (Exception unused4) {
                    return;
                }
            case 11:
                HomeFragment this$05 = (HomeFragment) this.f236c;
                KProperty<Object>[] kPropertyArr3 = HomeFragment.f28249k;
                Intrinsics.m32179h(this$05, "this$0");
                try {
                    Balloon balloon = (Balloon) this$05.f28252h.getValue();
                    if (balloon != null) {
                        View childAt = this$05.m15518p4().getChildAt(0);
                        Intrinsics.m32178g(childAt, "tabStrip.getChildAt(0)");
                        balloon.m13856t(childAt);
                        break;
                    }
                } catch (Exception unused5) {
                    return;
                }
                break;
            case 12:
                SearchFragment this$06 = (SearchFragment) this.f236c;
                SearchFragment.Companion companion3 = SearchFragment.f28894p;
                Intrinsics.m32179h(this$06, "this$0");
                FragmentActivity activity = this$06.getActivity();
                if (activity != null) {
                    Object systemService = activity.getSystemService("input_method");
                    Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).toggleSoftInput(2, 0);
                    break;
                }
                break;
            case 13:
                SnowfallView this$07 = (SnowfallView) this.f236c;
                int i3 = SnowfallView.f30559q;
                Intrinsics.m32179h(this$07, "this$0");
                Snowflake[] snowflakeArr = this$07.f30574p;
                if (snowflakeArr != null) {
                    boolean z = false;
                    for (Snowflake snowflake : snowflakeArr) {
                        if (snowflake.m16480c()) {
                            snowflake.f30583h += snowflake.f30581f;
                            double d = snowflake.f30584i + snowflake.f30582g;
                            snowflake.f30584i = d;
                            double d2 = snowflake.f30577b.f30589b;
                            if (d > d2) {
                                if (!snowflake.f30586k) {
                                    snowflake.f30584i = d2 + snowflake.f30578c;
                                    snowflake.f30587l = true;
                                } else if (snowflake.f30587l) {
                                    snowflake.f30587l = false;
                                    snowflake.m16481d(null);
                                } else {
                                    snowflake.m16481d(Double.valueOf(-snowflake.f30578c));
                                }
                            }
                            if (snowflake.f30577b.f30599l) {
                                Paint m16479b = snowflake.m16479b();
                                float f2 = snowflake.f30579d;
                                int i4 = snowflake.f30577b.f30589b;
                                m16479b.setAlpha((int) ((((float) (i4 - snowflake.f30584i)) / i4) * f2));
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        this$07.postInvalidateOnAnimation();
                        break;
                    }
                }
                break;
            case 14:
                Div2View this$08 = (Div2View) this.f236c;
                int i5 = Div2View.f31541R;
                Intrinsics.m32179h(this$08, "this$0");
                ReleaseUtils.f32861a.m17110a(this$08, this$08);
                break;
            case 15:
                DivVisibilityActionTracker this$09 = (DivVisibilityActionTracker) this.f236c;
                Intrinsics.m32179h(this$09, "this$0");
                DivVisibilityActionDispatcher divVisibilityActionDispatcher = this$09.f31697b;
                WeakHashMap<View, Div> visibleViews = this$09.f31700e;
                Objects.requireNonNull(divVisibilityActionDispatcher);
                Intrinsics.m32179h(visibleViews, "visibleViews");
                divVisibilityActionDispatcher.f31684b.mo16610a(visibleViews);
                this$09.f31701f = false;
                break;
            case 16:
                DivTransitionHandler this$010 = (DivTransitionHandler) this.f236c;
                Intrinsics.m32179h(this$010, "this$0");
                if (this$010.f31732d) {
                    this$010.m16885a(this$010.f31729a, true);
                }
                this$010.f31732d = false;
                break;
            case 17:
                ((InterstitialAd) this.f236c).m30407a();
                break;
        }
    }
}
